import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login/Login CMS'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('QlyTKNHanTien/menu_QLyTKMerchant'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('QlyTKNHanTien/menu_QLyTKMerchant'), 0)

WebUI.click(findTestObject('QlyTKNHanTien/menu_QlyTKNhanTien'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('QlyTKNHanTien/menu_QlyTKNhanTien'), 0)

WebUI.click(findTestObject('QlyTKNHanTien/icon_themmoi'))

WebUI.click(findTestObject('QlyTKNHanTien/chon_taikhoanMC'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('QlyTKNHanTien/chon_mc'))

WebUI.click(findTestObject('QlyTKNHanTien/chon_nganhang'))

WebUI.click(findTestObject('QlyTKNHanTien/input_tennganhang'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('QlyTKNHanTien/input_sotaikhoan'), '1023020330000')

WebUI.click(findTestObject('QlyTKNHanTien/button_kiemtra'))

WebUI.verifyTextPresent('NGUYEN VAN A', false)

WebUI.click(findTestObject('QlyTKNHanTien/button_xacnhan'))

