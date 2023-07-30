package global

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.testdata.reader.CSVReader as CSVReader
import com.kms.katalon.core.testdata.reader.CSVSeparator
import java.util.regex.Matcher

public class TestDataLoader {

	def static Map LoadTestData(String testCaseId, String filePath) {
		def testData = [:]

		testData["TestCaseId"] = testCaseId
		testData["TestDataFilePath"] = filePath

		readTestDataXLS(testData)

		if(testData.size() > 0) {
			testData["TestDataXLS"].each { rows ->
				print "Loading Test Data --> "
				rows.each { key, value ->
					print "$key : $value "
				}
				println ""
			}
		} else {
			println "No data loaded (or file/sheet not found) for testcase: '$testCaseId' in File: '$filePath'"
		}

		return testData
	}

	def static Map readTestDataXLS(Map testData) {
		def columns = []
		def rows = []
		testData["TestDataXLS"] = rows

		FileInputStream fis
		XSSFWorkbook workbook
		XSSFSheet worksheet

		try {
			File xlsFile = new File(testData["TestDataFilePath"])
			if(!xlsFile.exists()) {
				println("Target file is not found in following path: " + xlsFile.canonicalPath)
				WebUI.comment("Target file is not found in following path: " + xlsFile.canonicalPath)
			}
			fis = new FileInputStream(xlsFile)
			//fis = new FileInputStream(new File("./Data Files/SIT/" + testData["DataFileName"]));
			workbook  = new XSSFWorkbook(fis);
			def maxLength = Math.min(testData["TestCaseId"].length(), 31)
			def testCaseId = testData["TestCaseId"].toString().substring(0,maxLength)
			worksheet = workbook.getSheet(testCaseId)
			XSSFRow columnRow = worksheet.getRow(1)

			//List out all the columns
			int colIndex = 0
			while(columnRow.getCell(colIndex)) {
				XSSFCell columnCell = columnRow.getCell(colIndex)
				columns[colIndex] = columnCell.toString()
				//println columnCell
				colIndex++
			}
			//println colIndex

			//loop the rows
			int rowIndex = 2 //data start from row 2
			while(worksheet.getRow(rowIndex)) {
				XSSFRow dataRow = worksheet.getRow(rowIndex)
				def data = [:]

				for(int i = 0; i < colIndex; i++) {
					XSSFCell dataCell = dataRow.getCell(i)
					data[columns[i]] = dataCell.toString()
				}

				rows.add(data)

				rowIndex++
			}
		}
		catch (Exception ex) {
			println("ERROR: " + ex.message)
			KeywordUtil.markFailedAndStop("Unable to load file: " + ex.message)
		}
		finally {
			if(workbook) workbook.close()
			if(fis) fis.close()

			println("Test Data Load completed!")
		}
	}

}
