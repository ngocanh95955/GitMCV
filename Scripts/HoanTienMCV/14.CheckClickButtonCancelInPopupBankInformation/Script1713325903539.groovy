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

WebUI.setText(findTestObject('HoanTien/Page_LichSuGD/input_MaGiaoDichh'), 'Z1R6OKWM')

WebUI.click(findTestObject('HoanTien/Page_LichSuGD/button_Timkiem'))

WebUI.scrollToElement(findTestObject('HoanTien/Page_LichSuGD/button_hoantien'), 0)

WebUI.click(findTestObject('HoanTien/Page_LichSuGD/button_hoantien'))

WebUI.click(findTestObject('HoanTien/span_Chonnganhang'))

WebUI.click(findTestObject('HoanTien/li_VIETINBANK - NH Cong Thuong VN'))

WebUI.setText(findTestObject('HoanTien/Page_LichSuGD/input_STKNganhang'), '1023020330000')

WebUI.setText(findTestObject('HoanTien/Page_LichSuGD/input_SoTien'), '30000')

WebUI.click(findTestObject('HoanTien/button_Kiemtrathongtin'))

TestObject inputField = findTestObject('HoanTien/Expected_TenTaiKhoan')

String filledText = WebUI.getAttribute(inputField, 'value')

WebUI.verifyMatch(filledText, 'NGUYEN VAN A', false)

WebUI.click(findTestObject('HoanTien/button_HUY'))

WebUI.verifyElementText(findTestObject('HoanTien/hExpected_TitleXemLichSuGD'), 'Xem lịch sử giao dịch')

WebUI.closeBrowser()

