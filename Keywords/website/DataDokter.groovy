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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import global.BasePageObject

public class DataDokter extends BasePageObject{
	private TestObject imgAddDtDr

	private TestObject imgSearchDokter
	private TestObject setSearchDokter

	private DataDokter() {
		imgAddDtDr = createTestObjectByXpath("imgAddDtDr", "(.//*[normalize-space(text()) and normalize-space(.)='Doctor [CTRL+ALT+D]'])[1]/following::a[1]")

		imgSearchDokter = createTestObjectByXpath("imgSearchDokter", "(.//*[normalize-space(text()) and normalize-space(.)='Doctor [CTRL+ALT+D]'])[1]/following::button[1]")
		setSearchDokter = createTestObjectByXpath("setSearchDokter", "//input[@type='search']")
	}

	public void ImgAddDokter() {
		WebUI.waitForElementPresent(imgAddDtDr, 5)
		WebUI.takeScreenshot()
		WebUI.click(imgAddDtDr)
		WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/input_Kode_doctor_code'), 10)
		WebUI.takeScreenshot()
	}

	public void SetKodeDokter(dtKodeDokter) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/input_Kode_doctor_code'), 5)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Add New Data Dokter/Tambah Data/input_Kode_doctor_code'), dtKodeDokter)
		WebUI.takeScreenshot()
	}

	public void SetNamaDokter(dtNamaDokter) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/input_Nama_doctor_name'), 5)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Add New Data Dokter/Tambah Data/input_Nama_doctor_name'), dtNamaDokter)
		WebUI.takeScreenshot()
	}

	public void SetSpesialisasiDokter(dtSpesialisai) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/input_Spesialisasi_specialization'), 5)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Add New Data Dokter/Tambah Data/input_Spesialisasi_specialization'), dtSpesialisai)
		WebUI.takeScreenshot()
	}

	public void SetKeterangan(dtKeterangan) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/input_Keterangan_description'), 5)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Add New Data Dokter/Tambah Data/input_Keterangan_description'), dtKeterangan)
		WebUI.takeScreenshot()
	}

	public void SetLokasi() {
		WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/div_Pilih Lokasi'), 5)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Add New Data Dokter/Tambah Data/div_Pilih Lokasi'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/div_GL22179 - Kantor Pusat'), 5)
		WebUI.click(findTestObject('Add New Data Dokter/Tambah Data/div_GL22179 - Kantor Pusat'))
		WebUI.takeScreenshot()
	}

	public void SetInternal(dtInternal) {
		if (dtInternal == 'N/A') {
			KeywordUtil.logInfo('No Action')
		} else {
			WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/select_Pilih InternalYaTidak'), 5)
			WebUI.takeScreenshot()
			WebUI.selectOptionByLabel(findTestObject('Add New Data Dokter/Tambah Data/select_Pilih InternalYaTidak'), dtInternal, true)
			KeywordUtil.logInfo('Kategori : ' +dtInternal)
			WebUI.takeScreenshot()
		}
	}

	public void SetUsername(dtUsernameDr) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/input_Username_username'), 5)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Add New Data Dokter/Tambah Data/input_Username_username'), dtUsernameDr)
		WebUI.takeScreenshot()
	}

	public void SetAlamatPrakter(dtAlamatPraktek) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/textarea_alamat praktek'), 5)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Add New Data Dokter/Tambah Data/textarea_alamat praktek'), dtAlamatPraktek)
		WebUI.takeScreenshot()
	}

	public void SetAlamatRumah(dtAlamatRumah) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/textarea_alamat rumah'), 5)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Add New Data Dokter/Tambah Data/textarea_alamat rumah'), dtAlamatRumah)
		WebUI.takeScreenshot()
	}

	public void SetTelepon(dtTelepon) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/input_Telepon_phone_1'), 5)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Add New Data Dokter/Tambah Data/input_Telepon_phone_1'), dtTelepon)
		WebUI.takeScreenshot()
	}

	public void SetTeleponLainnya(dtTeleponLainnya) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/input_Telepon Lainnya_phone_2'), 5)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Add New Data Dokter/Tambah Data/input_Telepon Lainnya_phone_2'), dtTeleponLainnya)
		WebUI.takeScreenshot()
	}

	public void BtnSimpan(dtVerifyBtnSimpan) {
		WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/input_Telepon Lainnya_btn btn-primary'), 5)
		WebUI.takeScreenshot()
		switch (dtVerifyBtnSimpan) {
			case "N/A" :
				KeywordUtil.logInfo('No Action')
				break
			case "Berhasil Tambah Data" :
				WebUI.click(findTestObject('Add New Data Dokter/Tambah Data/input_Telepon Lainnya_btn btn-primary'))
				WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/Verify Sukses/h6_Data Dokter'), 10)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Berhasil tambah data')
				break
			case "Data Kosong" :
				WebUI.click(findTestObject('Add New Data Dokter/Tambah Data/input_Telepon Lainnya_btn btn-primary'))
				WebUI.waitForElementPresent(findTestObject('Add New Data Dokter/Tambah Data/div_Harap isi bidang yg ditandai'), 5)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Data Kosong')
				break
		}
	}

	public void ImgSearchDokter() {
		WebUI.waitForElementPresent(imgSearchDokter, 5)
		WebUI.takeScreenshot()
		WebUI.click(imgSearchDokter)
		WebUI.waitForElementPresent(setSearchDokter, 10)
		WebUI.takeScreenshot()
	}

	public void SetSearchDataDokter(dtSearchListDr) {
		WebUI.waitForElementPresent(setSearchDokter, 5)
		WebUI.takeScreenshot()
		WebUI.setText(setSearchDokter, dtSearchListDr)
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}
}
