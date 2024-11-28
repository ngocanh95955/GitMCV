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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/login')

WebUI.setText(findTestObject('HoanTien/input_usernamecms'), 'kt2')

WebUI.setText(findTestObject('HoanTien/Input_passwordcms'), 'Ngocanh1995#')

WebUI.click(findTestObject('HoanTien/button_logincms'))

WebUI.delay(6)

WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/user-transaction/pending-approve')

WebUI.delay(3)

WebUI.setText(findTestObject('QlyGDchoduyet/input_maGD'), 'ZLLEQ0DB')
WebUI.setText(findTestObject('QlyGDchoduyet/input_thoigian'), '25/09/2024')

WebUI.click(findTestObject('QlyGDchoduyet/button_timkiem'))

WebUI.click(findTestObject('QlyGDchoduyet/button_chitiet'))

WebUI.delay(3)

WebUI.verifyTextNotPresent('KT DUYỆT HOÀN TIỀN KH LẦN 2', false)

WebUI.verifyTextNotPresent('HỦY YÊU CẦU HOÀN TIỀN', false)

