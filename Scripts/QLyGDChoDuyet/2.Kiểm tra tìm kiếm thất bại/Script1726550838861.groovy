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

WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/user-transaction/pending-approve')

WebUI.setText(findTestObject('QlyGDchoduyet/input_maGD'), 'PD0JMVDd0X4')

WebUI.click(findTestObject('QlyGDchoduyet/Filter_LoaiGD'))

WebUI.click(findTestObject('QlyGDchoduyet/Chonloai_ruttien'))

WebUI.click(findTestObject('QlyGDchoduyet/Filter_Dichvu'))

WebUI.click(findTestObject('QlyGDchoduyet/chonDV_Chiho'))

WebUI.click(findTestObject('QlyGDchoduyet/Filter_Taikhoan'))

WebUI.setText(findTestObject('QlyGDchoduyet/input_taikhoan'), '9Service')

WebUI.click(findTestObject('QlyGDchoduyet/chon_9Service'))

WebUI.click(findTestObject('QlyGDchoduyet/Filter_trangthai'))

WebUI.click(findTestObject('QlyGDchoduyet/Chon_trangthaiDXL'))

WebUI.click(findTestObject('QlyGDchoduyet/Filter_Loaitaikhoan'))

WebUI.click(findTestObject('QlyGDchoduyet/Chon_LoaiTK_Merchant'))

WebUI.click(findTestObject('QlyGDchoduyet/Filter_Sudungchiho'))

WebUI.click(findTestObject('QlyGDchoduyet/Chon_khongdungchiho'))

WebUI.click(findTestObject('QlyGDchoduyet/Filter_nguonduyet'))

WebUI.setText(findTestObject('QlyGDchoduyet/input_nguonduyet'), 'Chuyển đổi từ CMS')

WebUI.click(findTestObject('QlyGDchoduyet/Chon_nguonchuyendoiCMS'))

WebUI.setText(findTestObject('QlyGDchoduyet/input_thoigian'), '10/09/2024')

WebUI.click(findTestObject('QlyGDchoduyet/button_timkiem'))

WebUI.verifyElementText(findTestObject('QlyGDchoduyet/Expect_Khongtimkiemthaydulieu'), 'Không tìm thấy dữ liệu.')

WebUI.delay(5)

