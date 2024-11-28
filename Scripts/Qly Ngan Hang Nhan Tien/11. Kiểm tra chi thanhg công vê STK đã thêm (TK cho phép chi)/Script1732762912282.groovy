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

WebUI.delay(6)
WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/member-bank?is_use_payout=-1')
WebUI.click(findTestObject('QlyNganHangChi/button_themmoi'))
WebUI.click(findTestObject('QlyNganHangChi/Chon_nganhang1'))
WebUI.delay(3)
WebUI.click(findTestObject('QlyNganHangChi/Chon_BankBIDV'))
WebUI.delay(3)
WebUI.setText(findTestObject('QlyNganHangChi/input_Sotaikhoan'), '09051995')
WebUI.setText(findTestObject('QlyNganHangChi/input_Tentaikhoan'), 'NGOC ANH TEST')
WebUI.click(findTestObject('QlyNganHangChi/checkbox_chophepchi'))
WebUI.click(findTestObject('QlyNganHangChi/Button_themmoiTK'))
WebUI.verifyElementText(findTestObject('QlyNganHangChi/Expect_MSG_themtkthanhcong'), 'Thêm mới tài khoản ngân hàng thành công.')
WebUI.click(findTestObject('QlyNganHangChi/Button_OK'))
WebUI.delay(3)
WebUI.callTestCase(findTestCase('Login/Login MCV 2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.navigateToUrl('https://stg-console.9pay.mobi/admin/transfer-banks')

WebUI.click(findTestObject('QlyNganHangChi/MCV_Chonbank'))

WebUI.setText(findTestObject('QlyNganHangChi/input_bank'), 'BIDV')

WebUI.click(findTestObject('QlyNganHangChi/CMS_chonBIDV'))

WebUI.setText(findTestObject('QlyNganHangChi/MCV_SoTK'), '09051995')

WebUI.click(findTestObject('QlyNganHangChi/MCV_butotnKiemtra'))

WebUI.setText(findTestObject('QlyNganHangChi/MCV_input_sotien'), '100000')

WebUI.setText(findTestObject('QlyNganHangChi/MCV_inputMaxacthuc'), '123456')

WebUI.click(findTestObject('QlyNganHangChi/MCV_buttonTaolechchi'))

WebUI.delay(3)

WebUI.click(findTestObject('QlyNganHangChi/MCV_buttonOK'))

WebUI.delay(5)

WebUI.setText(findTestObject('QlyNganHangChi/MCV_TimkiemTK'), '09051995')

WebUI.click(findTestObject('QlyNganHangChi/MCV_buttonTimkiem'))

WebUI.verifyElementText(findTestObject('QlyNganHangChi/ExpectMCV_Nganhang'), 'BIDV')

WebUI.verifyElementText(findTestObject('QlyNganHangChi/ExpectMCV_Sotaikhoan'), '09051995')

WebUI.verifyElementText(findTestObject('QlyNganHangChi/ExpectMCv_TenTK'), 'NGOC ANH TEST')

