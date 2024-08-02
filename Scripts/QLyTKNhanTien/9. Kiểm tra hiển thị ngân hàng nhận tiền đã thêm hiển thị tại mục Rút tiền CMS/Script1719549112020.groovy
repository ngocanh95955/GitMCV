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

WebUI.callTestCase(findTestCase('QLyTKNhanTien/7.Kiêm tra tài khoản có trạng thái hoạt động'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('QlyTKNHanTien/menu_QLyTKMerchant'))

WebUI.delay(3)

WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/user')

WebUI.delay(3)

WebUI.click(findTestObject('QlyTKNHanTien/chon_taikhoanMC1'))

WebUI.click(findTestObject('QlyTKNHanTien/chon_mc1'))

WebUI.click(findTestObject('QlyTKNHanTien/input_nhaptk'))

WebUI.click(findTestObject('QlyTKNHanTien/button_searchqltk'))

WebUI.click(findTestObject('QlyTKNHanTien/button_ruttiencms'))

WebUI.delay(9)

WebUI.click(findTestObject('QlyTKNHanTien/chon_virut'))

WebUI.click(findTestObject('QlyTKNHanTien/chon_vichi'))

WebUI.click(findTestObject('QlyTKNHanTien/chon_thoigian'))

WebUI.click(findTestObject('QlyTKNHanTien/chon_thoigianhq'))

WebUI.click(findTestObject('QlyTKNHanTien/button_tieptuc'))

WebUI.click(findTestObject('QlyTKNHanTien/button_dongyrut'))

WebUI.setText(findTestObject('QlyTKNHanTien/input_sotien'), '10000')

WebUI.click(findTestObject('QlyTKNHanTien/button_xacnhanruttien'))

WebUI.scrollToElement(findTestObject('QlyTKNHanTien/button_duyetVH'), 0)

WebUI.verifyElementText(findTestObject('QlyTKNHanTien/Expected_tennganhang'), 'BIDV')

WebUI.verifyElementText(findTestObject('QlyTKNHanTien/Expected_soTK'), '1023020330000')

WebUI.verifyElementText(findTestObject('QlyTKNHanTien/Expected_tenTK'), 'NGUYEN VAN A')

