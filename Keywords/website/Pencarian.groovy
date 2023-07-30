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

public class Pencarian extends BasePageObject{
	private TestObject setItemName
	private TestObject btnSearchItem
	private TestObject verifyListItem
	private TestObject setSearchListItem
	private TestObject imgAdd
	private TestObject setTuslah
	private TestObject setQty
	private TestObject choosePriceHargJual
	private TestObject setPrice
	private TestObject setDiscount
	private TestObject imgAddList
	private TestObject imgDeleteList


	public Pencarian(){
		setItemName = createTestObjectByXpath("setItemName", "//input[@name='item_name']")
		btnSearchItem = createTestObjectByXpath("btnSearchItem", "(//button[@type='button'])[3]")
		verifyListItem = createTestObjectByXpath("verifyListItem", "//*/text()[normalize-space(.)='List Item']/parent::*")
		imgAdd = createTestObjectByXpath("imgAdd", "//table[@id='table-item-modal-pos']/tbody/tr/td/div/div/a")
		setSearchListItem = createTestObjectByXpath("setSearchListItem", "//input[@name='terms']")
		setTuslah = createTestObjectByXpath("setTuslah", "(//input[@value='0'])[7]")
		setQty = createTestObjectByXpath("setQty", "//input[@name='qty']")
		choosePriceHargJual = createTestObjectByXpath("choosePriceHargJual", "(.//*[normalize-space(text()) and normalize-space(.)='Choose Price'])[1]/following::select[1]")
		setPrice = createTestObjectByXpath("setPrice", "//input[@name='item_price']")
		setDiscount = createTestObjectByXpath("setDiscount", "//input[@name='discount']")
		imgAddList = createTestObjectByXpath("imgAddList", "(.//*[normalize-space(text()) and normalize-space(.)='Item Name'])[1]/preceding::button[2]")
		imgDeleteList = createTestObjectByXpath("imgDeleteList", "(//button[@type='button'])[5]")
	}

	public void SetItemName(dtSetItemName) {
		WebUI.waitForElementPresent(setItemName, 5)
		WebUI.takeScreenshot()
		WebUI.setText(setItemName, dtSetItemName)
		WebUI.takeScreenshot()
	}

	public void BtnSearchItem(){
		WebUI.waitForElementPresent(btnSearchItem, 5)
		WebUI.takeScreenshot()
		WebUI.click(btnSearchItem)
		WebUI.waitForElementPresent(verifyListItem, 10)
		WebUI.takeScreenshot()
	}

	public void SetSearchListItem(dtSetItemName){
		WebUI.waitForElementPresent(setSearchListItem, 5)
		WebUI.takeScreenshot()
		WebUI.setText(setSearchListItem, dtSetItemName)
		WebUI.takeScreenshot()
		WebUI.click(btnSearchItem)
		WebUI.waitForElementPresent(setSearchListItem, 5)
	}

	public void SetSearchNoListItem(dtSetItemName){
		WebUI.waitForElementPresent(setSearchListItem, 5)
		WebUI.takeScreenshot()
		WebUI.setText(setSearchListItem, dtSetItemName)
		WebUI.takeScreenshot()
	}

	public void ImgAdd(){
		WebUI.waitForElementPresent(imgAdd, 5)
		WebUI.takeScreenshot()
		WebUI.click(imgAdd)
		WebUI.waitForElementPresent(setQty, 10)
		WebUI.takeScreenshot()
	}

	public void SetTuslah(dtSetTuslah){
		WebUI.waitForElementPresent(setTuslah, 5)
		WebUI.takeScreenshot()
		if (dtSetTuslah == 'N/A') {
			KeywordUtil.logInfo('No Action')
		} else {
			WebUI.setText(setTuslah, dtSetTuslah)
			WebUI.takeScreenshot()
		}
	}

	public void SetQty(dtQty){
		WebUI.waitForElementPresent(setQty, 5)
		WebUI.takeScreenshot()
		if (dtQty == 'N/A') {
			KeywordUtil.logInfo('No Action')
		} else {
			WebUI.setText(setQty, dtQty)
			WebUI.takeScreenshot()
		}
	}

	public void ChooseHargaJual(dtChooseHargaJual){
		WebUI.waitForElementPresent(choosePriceHargJual, 5)
		WebUI.takeScreenshot()
		WebUI.selectOptionByLabel(choosePriceHargJual, dtChooseHargaJual, false)
		KeywordUtil.logInfo('Harga Jual : ' +dtChooseHargaJual)
		WebUI.takeScreenshot()
	}

	public void SetPrice(dtPrice){
		WebUI.waitForElementPresent(setPrice, 5)
		WebUI.takeScreenshot()
		if (dtPrice == 'N/A') {
			KeywordUtil.logInfo('No Action')
		} else {
			WebUI.setText(setPrice, dtPrice)
			WebUI.takeScreenshot()
		}
	}

	public void SetDiscount(dtDiscount){
		WebUI.waitForElementPresent(setDiscount, 5)
		WebUI.takeScreenshot()
		if (dtDiscount == 'N/A') {
			KeywordUtil.logInfo('No Action')
		} else {
			WebUI.setText(setDiscount, dtDiscount)
			WebUI.takeScreenshot()
		}
	}

	public void ImgAddList(){
		WebUI.waitForElementPresent(imgAddList, 5)
		WebUI.takeScreenshot()
		WebUI.click(imgAddList)
		WebUI.takeScreenshot()
	}

	public void ImgDeleteList(){
		WebUI.waitForElementPresent(imgDeleteList, 5)
		WebUI.takeScreenshot()
		WebUI.click(imgDeleteList)
		WebUI.takeScreenshot()
	}
}
