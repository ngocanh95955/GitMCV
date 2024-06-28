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

WebUI.waitForElementVisible(findTestObject('QlyTKNHanTien/menu_QLyTKMerchant'), 0)

WebUI.click(findTestObject('QlyTKNHanTien/menu_QlyTKNhanTien'))

WebUI.waitForElementVisible(findTestObject('QlyTKNHanTien/menu_QlyTKNhanTien'), 0)

WebUI.click(findTestObject('QlyTKNHanTien/button_huy'))

WebUI.click(findTestObject('QlyTKNHanTien/button_dongy'))

WebUI.verifyElementText(findTestObject('QlyTKNHanTien/Expected_msghuythanhcong'), 'Hủy yêu cầu thành công')

WebUI.click(findTestObject('QlyTKNHanTien/btn_Ok'))

