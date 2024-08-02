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

WebUI.callTestCase(findTestCase('QlyTyGia/7.Kiểm tra thêm tỷ giá thành công'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.closeBrowser()
WebUI.callTestCase(findTestCase('Login/Login MCV 2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.navigateToUrl('https://stg-console.9pay.mobi/admin/transfer-transaction')

WebUI.click(findTestObject('Qly ty giá/chon_taikhoannguon'))

WebUI.click(findTestObject('Qly ty giá/chontk_autotest'))

WebUI.click(findTestObject('Qly ty giá/chon_vinguon'))

WebUI.click(findTestObject('Qly ty giá/chon_vinguonVND'))

WebUI.click(findTestObject('Qly ty giá/chon_taikhoandich'))

WebUI.click(findTestObject('Qly ty giá/chontk_test'))

WebUI.click(findTestObject('Qly ty giá/chon_vidich'))

WebUI.click(findTestObject('Qly ty giá/chon_vidichUSD'))

WebUI.setText(findTestObject('Qly ty giá/input_sotien'), '100000')

WebUI.verifyElementText(findTestObject('Qly ty giá/Expect_Tygiaquydoi_VNDsangUSD'), 'Tỷ giá: 1 USD = 20,935 VND')

WebUI.verifyElementText(findTestObject('Qly ty giá/Expect_Giatriquydoi_VNDsangUSD'), 'Giá trị quy đổi: 4.78 USD')

