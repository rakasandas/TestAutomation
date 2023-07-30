import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import global.ExecutionController
import global.TestDataLoader

def testData = TestDataLoader.LoadTestData('UIPos','C:/Data Binding Katalon/Gue Ecosystem.xlsx')
def dataRow = ExecutionController.getTestCaseData(testData,"Row02")

//Open Browser
WebUI.callTestCase(findTestCase('Test Cases Global/Open Browser/TCG - Open Browser'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Username
WebUI.callTestCase(findTestCase('Test Cases Details/Login/TCD - Set Username'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Password
WebUI.callTestCase(findTestCase('Test Cases Details/Login/TCD - Set Password'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Btn Masuk
WebUI.callTestCase(findTestCase('Test Cases Details/Login/TCD - Btn Masuk'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Verify Login
WebUI.callTestCase(findTestCase('Test Cases Details/Login/TCD - Verify Login'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Point Of Sale
WebUI.callTestCase(findTestCase('Test Cases Global/Point Of Sale/TCG - Point Of Sale'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Text Help
WebUI.callTestCase(findTestCase('Test Cases Details/UI Pos/TCD - Help'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)
