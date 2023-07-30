package website

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.bouncycastle.operator.KeyWrapper

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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import global.BasePageObject

public class DataPelanggan extends BasePageObject{
	private TestObject imgAddDtPelanggan

	private TestObject imgSearchDtPelanggan
	private TestObject setSearchDataPelanggan

	public DataPelanggan(){
		imgAddDtPelanggan = createTestObjectByXpath("imgAddDtPelanggan", "(.//*[normalize-space(text()) and normalize-space(.)='Customer [CTRL+ALT+C]'])[1]/following::a[1]")

		imgSearchDtPelanggan = createTestObjectByXpath("imgSearchDtPelanggan", "(.//*[normalize-space(text()) and normalize-space(.)='Customer [CTRL+ALT+C]'])[1]/following::button[1]")
		setSearchDataPelanggan = createTestObjectByXpath("setSearchDataPelanggan", "//input[@type='search']")
	}

	public void ImgAddDataPelanggan() {
		WebUI.waitForElementPresent(imgAddDtPelanggan, 5)
		WebUI.takeScreenshot()
		WebUI.click(imgAddDtPelanggan)
		WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Set Nama Pelanggan'), 10)
		WebUI.takeScreenshot()
	}

	public void SetNamaPelanggan(dtNamaPelanggan) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Set Nama Pelanggan'), 5)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Add New Data Pelanggan/Set Nama Pelanggan'), dtNamaPelanggan)
		WebUI.takeScreenshot()
	}

	public void SetKodePelanggan(dtKodePelanggan) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Set Kode Pelanggan'), 5)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Add New Data Pelanggan/Set Kode Pelanggan'), dtKodePelanggan )
		WebUI.takeScreenshot()
	}

	public void SetTipePelanggan() {
		WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Choose Tipe Pelanggan'), 5)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Add New Data Pelanggan/Choose Tipe Pelanggan'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Tipe Pelanggan 01 Regular'), 5)
		WebUI.click(findTestObject('Add New Data Pelanggan/Tipe Pelanggan 01 Regular'))
		WebUI.takeScreenshot()
	}

	public void SetJenKel(dtJenKel) {
		if (dtJenKel == 'N/A') {
			KeywordUtil.logInfo('No Action')
		} else {
			WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Choose Jenis Kelamin'), 5)
			WebUI.takeScreenshot()
			WebUI.selectOptionByValue(findTestObject('Add New Data Pelanggan/Choose Jenis Kelamin'), dtJenKel, true)
			KeywordUtil.logInfo('Jenis Kelamin : ' +dtJenKel)
			WebUI.takeScreenshot()
		}
	}

	public void SetKategori(dtKategori) {
		if (dtKategori == 'N/A') {
			KeywordUtil.logInfo('No Action')
		} else {
			WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Choose Kategori'), 5)
			WebUI.takeScreenshot()
			WebUI.selectOptionByLabel(findTestObject('Add New Data Pelanggan/Choose Kategori'), dtKategori, true)
			KeywordUtil.logInfo('Kategori : ' +dtKategori)
			WebUI.takeScreenshot()
		}
	}

	public void SetNoTelp(dtNoTelp) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Set No Telepon'), 5)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Add New Data Pelanggan/Set No Telepon'), dtNoTelp)
		WebUI.takeScreenshot()
	}

	public void SetTipePembayaran(dtTipePembayaran) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Choose Tipe Pembayaran'), 5)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Choose Tipe Pembayaran'))
		switch (dtTipePembayaran) {
			case "N/A" :
				KeywordUtil.logInfo('No Action')
				break
			case "Cash" :
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Tipe Cash'), 5)
				WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Tipe Cash'))
				break
			case "Debit Card" :
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Tipe Debit Card'), 5)
				WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Tipe Debit Card'))
				break
			case "Credit Card" :
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Tipe Credit Card'), 5)
				WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Tipe Credit Card'))
				break
			case "Multi" :
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Tipe Multi'), 5)
				WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Tipe Multi'))
				break
			case "Transfer" :
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Tipe Transfer'), 5)
				WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Tipe Transfer'))
				break
			case "Credit" :
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Tipe Credit'), 5)
				WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Tipe Credit'))
				break
		}
		KeywordUtil.logInfo('Tipe Pembayaran : ' +dtTipePembayaran)
		WebUI.takeScreenshot()
	}

	public void SetTermPembayaran(dtTermPembayaran) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Choose Term Pembayaran'), 5)
		WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Choose Term Pembayaran'))
		switch (dtTermPembayaran) {
			case "N/A" :
				KeywordUtil.logInfo('No Action')
				break
			case "Cash" :
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Term Cash'), 5)
				WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Term Cash'))
				break
			case "7 Days" :
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Term 7 Days'), 5)
				WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Term 7 Days'))
				break
			case "14 Days" :
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Term 14 Days'), 5)
				WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Term 14 Days'))
				break
			case "21 Days" :
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Term 21 Days'), 5)
				WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Term 21 Days'))
				break
			case "30 Days" :
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Term 30 Days'), 5)
				WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Term 30 Days'))
				break
			case "Multi" :
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Term Multi'), 5)
				WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Pembayaran/Term Multi'))
				break
			case "Debit" :
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Pembayaran/Term Debit'), 5)
				WebUI.click(findTestObject('Add New Data Pelanggan/Pembayaran/Term Debit'))
				break
		}
		KeywordUtil.logInfo('Term Pembayaran : ' +dtTermPembayaran)
		WebUI.takeScreenshot()
	}

	public void SetAlamat(dtAlamat) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Set Alamat'), 5)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Add New Data Pelanggan/Set Alamat'), dtAlamat)
		WebUI.takeScreenshot()
	}

	public void BtnSimpan(dtVerifyBtnSimpan) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Btn Simpan/Page_Point Of Sales - GPOS Lite/input_Alamat_btn btn-primary'), 5)
		WebUI.takeScreenshot()
		switch (dtVerifyBtnSimpan) {
			case "N/A" :
				KeywordUtil.logInfo('No Action')
				break
			case "Berhasil Tambah Data" :
				WebUI.click(findTestObject('Add New Data Pelanggan/Btn Simpan/Page_Point Of Sales - GPOS Lite/input_Alamat_btn btn-primary'))
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Btn Simpan/Page_Point Of Sales - GPOS Lite/div_Alamat_is-invalid'), 10)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Berhasil tambah data')
				break
			case "Data Kosong" :
				WebUI.click(findTestObject('Add New Data Pelanggan/Btn Simpan/Page_Point Of Sales - GPOS Lite/input_Alamat_btn btn-primary'))
				WebUI.waitForElementPresent(findTestObject('Add New Data Pelanggan/Btn Simpan/Page_Point Of Sales - GPOS Lite/div_Harap isi bidang yg ditandai'), 5)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Data kosong')
				break
		}
	}

	public void ImgSearchDataPelanggan() {
		WebUI.waitForElementPresent(imgSearchDtPelanggan, 5)
		WebUI.takeScreenshot()
		WebUI.click(imgSearchDtPelanggan)
		WebUI.takeScreenshot()
	}

	public void SetSearchListCustomer(dtSearchListCust) {
		WebUI.waitForElementPresent(setSearchDataPelanggan, 5)
		WebUI.takeScreenshot()
		WebUI.setText(setSearchDataPelanggan, dtSearchListCust)
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}
}
