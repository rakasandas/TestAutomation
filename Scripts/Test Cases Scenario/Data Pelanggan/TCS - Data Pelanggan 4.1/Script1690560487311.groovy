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
import global.ExecutionController as ExecutionController
import global.TestDataLoader as TestDataLoader

import global.ExecutionController
import global.TestDataLoader

def testData = TestDataLoader.LoadTestData('Dt Pelanggan','C:/Data Binding Katalon/Gue Ecosystem.xlsx')
def dataRow = ExecutionController.getTestCaseData(testData,"Row01")

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

//Point of Sale
WebUI.callTestCase(findTestCase('Test Cases Global/Point Of Sale/TCG - Point Of Sale'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Img Add Data Pelanggan
WebUI.callTestCase(findTestCase('Test Cases Details/Data Pelanggan/TCD - Img Add Data Pelanggan'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Nama Pelanggan
WebUI.callTestCase(findTestCase('Test Cases Details/Data Pelanggan/TCD - Set Nama Pelanggan'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Kode Pelanggan
WebUI.callTestCase(findTestCase('Test Cases Details/Data Pelanggan/TCD - Set Kode Pelanggan'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Tipe Pelanggan
WebUI.callTestCase(findTestCase('Test Cases Details/Data Pelanggan/TCD - Set Tipe Pelanggan'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Jenis Kelamin
WebUI.callTestCase(findTestCase('Test Cases Details/Data Pelanggan/TCD - Set Jenis Kelamin'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Kategori
WebUI.callTestCase(findTestCase('Test Cases Details/Data Pelanggan/TCD - Set Kategori'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set No Telepon
WebUI.callTestCase(findTestCase('Test Cases Details/Data Pelanggan/TCD - Set No Telepon'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Tipe Pembayaran
WebUI.callTestCase(findTestCase('Test Cases Details/Data Pelanggan/TCD - Set Tipe Pembayaran'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Term Pembayaran
WebUI.callTestCase(findTestCase('Test Cases Details/Data Pelanggan/TCD - Set Term Pembayaran'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Alamat
WebUI.callTestCase(findTestCase('Test Cases Details/Data Pelanggan/TCD - Set Alamat'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Button Simpan
WebUI.callTestCase(findTestCase('Test Cases Details/Data Pelanggan/TCD - Btn Simpan'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)


















