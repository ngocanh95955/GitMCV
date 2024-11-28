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

WebUI.delay(3)

WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/member-bank?is_use_payout=-1')

WebUI.setText(findTestObject('QlyNganHangChi/timkiem_tentk'), 'TK TEST LOG 1')

WebUI.click(findTestObject('QlyNganHangChi/Button_timkiem'))

WebUI.click(findTestObject('QlyNganHangChi/butotn_Lichsulog'))

WebUI.setText(findTestObject('QlyNganHangChi/Log_chonngay'), '28/11/2024')

WebUI.click(findTestObject('QlyNganHangChi/Log_buttonTimkiem'))

WebUI.click(findTestObject('QlyNganHangChi/Log_iconchitiet'))

WebUI.verifyElementText(findTestObject('QlyNganHangChi/Expect_TKthaotac'), 'anhptn')

WebUI.verifyElementText(findTestObject('QlyNganHangChi/Expect_Hanhdong'), 'Quản lý tài khoản ngân hàng KH - Cập nhật thông thông tin')

WebUI.verifyElementText(findTestObject('QlyNganHangChi/Expect_Thoigianthuchien'), '28/11/2024 08:55')

