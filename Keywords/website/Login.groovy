package website

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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import global.BasePageObject

public class Login extends BasePageObject{
	private TestObject setUsername
	private TestObject setPassword
	private TestObject btnMasuk
	private TestObject verifyPopUpImgDashboard
	private TestObject btnClosePopUpImgDashboard
	private TestObject verifyPopUpErrorLogin


	public Login(){
		setUsername = createTestObjectByXpath("setUsername", "//input[@name='email']")
		setPassword = createTestObjectByXpath("setPassword", "//input[@name='password']")
		btnMasuk = createTestObjectByXpath("btnMasuk", "//button[@type='submit']")
		verifyPopUpImgDashboard = createTestObjectByXpath("verifyPopUpImgDashboard", "//a[@id='popup']/img")
		btnClosePopUpImgDashboard = createTestObjectByXpath("btnClosePopUpImgDashboard", "//img[@title='close']")
		verifyPopUpErrorLogin = createTestObjectByXpath("verifyPopUpErrorLogin", "//*/text()[normalize-space(.)='Tidak dapat memverifikasi user']/parent::*")
	}

	public void VerifyLoginPage() {
		WebUI.waitForElementPresent(setUsername, 15)
		WebUI.takeScreenshot()
	}

	public void SetUsername(dtUsername){
		WebUI.waitForElementPresent(setUsername, 5)
		WebUI.takeScreenshot()
		WebUI.setText(setUsername, dtUsername)
		WebUI.takeScreenshot()
	}

	public void SetPassword(dtPassword){
		WebUI.waitForElementPresent(setPassword, 5)
		WebUI.takeScreenshot()
		WebUI.setText(setPassword, dtPassword)
		WebUI.takeScreenshot()
	}

	public void BtnMasuk(){
		WebUI.waitForElementPresent(btnMasuk, 5)
		WebUI.takeScreenshot()
		WebUI.click(btnMasuk)
	}

	public void VerifyLogin(dtVerifyLogin) {
		switch (dtVerifyLogin) {
			case "Berhasil Login" :
				WebUI.waitForElementPresent(verifyPopUpImgDashboard, 15)
				WebUI.takeScreenshot()
				WebUI.waitForElementPresent(btnClosePopUpImgDashboard, 5)
				WebUI.click(btnClosePopUpImgDashboard)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Berhasil Login')
				break
			case "Gagal Login" :
				WebUI.waitForElementPresent(verifyPopUpErrorLogin, 15)
				WebUI.takeScreenshot()
				String ValuePopUp = WebUI.getText(verifyPopUpErrorLogin)
				KeywordUtil.logInfo('Value popup : ' + ValuePopUp)
				break
		}
	}
}
