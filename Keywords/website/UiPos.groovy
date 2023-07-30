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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import global.BasePageObject

public class UiPos extends BasePageObject{
	private TestObject txtHelp
	private TestObject verifyHelp
	private TestObject txtOldPos
	private TestObject verifyOldPos

	public UiPos(){
		txtHelp = createTestObjectByXpath("txtHelp", "//a[contains(text(),'Help')]")
		verifyHelp = createTestObjectByXpath("verifyHelp", "//*[(text() = 'Help' or . = 'Help')]")
		txtOldPos = createTestObjectByXpath("txtOldPos", "//a[contains(text(),'Old POS')]")
		verifyOldPos = createTestObjectByXpath("verifyOldPos", "//*/text()[normalize-space(.)='Item']/parent::*")
	}

	public void TxtHelp() {
		WebUI.waitForElementPresent(txtHelp, 5)
		WebUI.takeScreenshot()
		WebUI.click(txtHelp)
		WebUI.waitForElementPresent(verifyHelp, 10)
		WebUI.takeScreenshot()
	}

	public void TxtOldPos() {
		WebUI.waitForElementPresent(txtOldPos, 5)
		WebUI.takeScreenshot()
		WebUI.click(txtOldPos)
		WebUI.waitForElementPresent(verifyOldPos, 10)
		WebUI.takeScreenshot()
	}
}
