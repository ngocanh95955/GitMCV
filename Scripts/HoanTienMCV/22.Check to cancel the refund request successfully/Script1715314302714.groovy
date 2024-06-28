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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stg-console.9pay.mobi/login')

WebUI.setText(findTestObject('MCV9s/Page_Login system 9PAY/input_username'), 'autotest')

WebUI.setText(findTestObject('MCV9s/Page_Login system 9PAY/input_password'), 'autotest@9s.vn')

WebUI.click(findTestObject('MCV9s/Page_Login system 9PAY/button_ng nhp'))

WebUI.setViewPortSize(1920, 1080)

WebUI.waitForElementVisible(findTestObject('HoanTien/Page_QLyGiaoDich/menu_QuanlyGD'), 2)

WebUI.click(findTestObject('HoanTien/Page_QLyGiaoDich/menu_QuanlyGD'))

WebUI.click(findTestObject('HoanTien/Page_LichSuGD/menu_LichSuGD'))

WebUI.setText(findTestObject('HoanTien/Page_LichSuGD/input_MaGiaoDichh'), 'P84E3D74')

WebUI.click(findTestObject('HoanTien/Page_LichSuGD/button_Timkiem'))

WebUI.scrollToElement(findTestObject('HoanTien/Page_LichSuGD/button_hoantien'), 0)

WebUI.click(findTestObject('HoanTien/Page_LichSuGD/button_hoantien'))

WebUI.click(findTestObject('HoanTien/span_Chonnganhang'))

WebUI.click(findTestObject('HoanTien/li_VIETINBANK - NH Cong Thuong VN'))

WebUI.setText(findTestObject('HoanTien/Page_LichSuGD/input_STKNganhang'), '1023020330000')

WebUI.setText(findTestObject('HoanTien/Page_LichSuGD/input_SoTien'), '100000')

WebUI.click(findTestObject('HoanTien/button_Kiemtrathongtin'))

TestObject inputField = findTestObject('HoanTien/Expected_TenTaiKhoan')

String filledText = WebUI.getAttribute(inputField, 'value')

WebUI.verifyMatch(filledText, 'NGUYEN VAN A', false)

WebUI.click(findTestObject('HoanTien/button_HoanTien'))

WebUI.verifyElementText(findTestObject('HoanTien/Expected_PopupSuccess'), 'Yêu cầu hoàn tiền đã được 9Pay tiếp nhận và đang được xử lý')

WebUI.click(findTestObject('HoanTien/button_OK'))

WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/login')

WebUI.delay(5)

WebUI.setText(findTestObject('HoanTien/input_usernamecms'), 'anhptn@9pay.vn')

WebUI.setText(findTestObject('HoanTien/Input_passwordcms'), 'anhptn@9pay.vn')

WebUI.click(findTestObject('HoanTien/button_logincms'))

WebUI.setViewPortSize(1920, 1080)

WebUI.click(findTestObject('HoanTien/menu_GDthuchitonghop'))

WebUI.click(findTestObject('HoanTien/menu_GDthuhochiho'))

WebUI.setText(findTestObject('HoanTien/input_maGDgoccms'), 'P84E3D74')

WebUI.click(findTestObject('HoanTien/button_timkiemcms'))

WebUI.click(findTestObject('HoanTien/icon_chitiet'))

WebUI.scrollToElement(findTestObject('HoanTien/Button_HuyYCHoan'), 0)

WebUI.click(findTestObject('HoanTien/Button_HuyYCHoan'))

WebUI.setText(findTestObject('HoanTien/input_noidung'), 'huỷ yêu cầu hoàn')

WebUI.click(findTestObject('HoanTien/button_capnhathuy'))

WebUI.click(findTestObject('HoanTien/button_OKchitiet'))

WebUI.navigateToUrl('https://stg-console.9pay.mobi/login')

WebUI.setViewPortSize(1920, 1080)

WebUI.waitForElementVisible(findTestObject('HoanTien/Page_QLyGiaoDich/menu_QuanlyGD'), 2)

WebUI.click(findTestObject('HoanTien/Page_QLyGiaoDich/menu_QuanlyGD'))

WebUI.click(findTestObject('HoanTien/Page_LichSuGD/menu_LichSuGD'))

WebUI.setText(findTestObject('HoanTien/input_MaGDGoc'), 'P84E3D74')

WebUI.click(findTestObject('HoanTien/Page_LichSuGD/button_Timkiem'))

WebUI.scrollToElement(findTestObject('HoanTien/Button_chitiet'), 0)

WebUI.verifyElementText(findTestObject('HoanTien/Expeted_Taikhoan'), 'autotest')

WebUI.verifyElementText(findTestObject('HoanTien/Expected_Thongtinnganhang'), 'Tài khoản nhận\nVIETINBANK\n1023020330000\nNGUYEN VAN A')

WebUI.verifyElementText(findTestObject('HoanTien/Expected_LoaiGD'), 'Dịch vụ\nThu hộ\nLoại giao dịch\nHoàn tiền')

WebUI.verifyElementText(findTestObject('HoanTien/Expected_Trangthai'), 'Đã huỷ')

WebUI.verifyElementText(findTestObject('HoanTien/Expected_SoTien'), 'Giá trị GD\n100,000VND\nPhí GD\n0VND\nSố tiền GD\n100,000VND')

WebUI.closeBrowser()

