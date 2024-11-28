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

WebUI.setText(findTestObject('QlyNganHangChi/timkiem_stk'), '10230203300000')

WebUI.setText(findTestObject('QlyNganHangChi/timkiem_tentk'), 'NGUYEN VAN A')

WebUI.click(findTestObject('QlyNganHangChi/Chon_nganhang'))

WebUI.setText(findTestObject('QlyNganHangChi/Chon_BIDV'), 'BIDV')

WebUI.click(findTestObject('QlyNganHangChi/click_nganhang'))

WebUI.click(findTestObject('QlyNganHangChi/chon_chophepchiho'))

WebUI.click(findTestObject('QlyNganHangChi/chon_chophep'))

WebUI.setText(findTestObject('QlyNganHangChi/chon_thoigian'), '04/01/2024')

WebUI.click(findTestObject('QlyNganHangChi/Button_timkiem'))

WebUI.verifyElementText(findTestObject('QlyNganHangChi/Expect_MSG_thongbao'), 'Không tìm thấy dữ liệu.')

