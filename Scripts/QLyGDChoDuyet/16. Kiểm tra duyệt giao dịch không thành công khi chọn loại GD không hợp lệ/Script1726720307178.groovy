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

WebUI.setText(findTestObject('HoanTien/input_usernamecms'), 'anhptn@9pay.vn')

WebUI.setText(findTestObject('HoanTien/Input_passwordcms'), 'anhptn@9pay.vn')

WebUI.click(findTestObject('HoanTien/button_logincms'))

WebUI.delay(3)

WebUI.setViewPortSize(1920, 1080)

WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/user-transaction/pending-approve')

WebUI.setText(findTestObject('QlyGDchoduyet/input_maGD'), 'ZMY41BMD')

WebUI.setText(findTestObject('QlyGDchoduyet/input_thoigian'), '24/09/2024')

WebUI.click(findTestObject('QlyGDchoduyet/button_timkiem'))

WebUI.click(findTestObject('QlyGDchoduyet/checkboxall'))

WebUI.click(findTestObject('QlyGDchoduyet/buron_duyetnaprut'))

WebUI.click(findTestObject('QlyGDchoduyet/button_dongy_duyetnaprut'))

WebUI.verifyElementText(findTestObject('QlyGDchoduyet/popup_thongbao_GDkhonghople'), 'Giao dịch không hợp lệ')

WebUI.delay(3)

WebUI.click(findTestObject('QlyGDchoduyet/button_OK_tatpopup'))

WebUI.click(findTestObject('QlyGDchoduyet/button_Reset'))

WebUI.setText(findTestObject('QlyGDchoduyet/input_maGD'), 'ZBBEKDGD')

WebUI.setText(findTestObject('QlyGDchoduyet/input_thoigian'), '19/09/2024')

WebUI.click(findTestObject('QlyGDchoduyet/button_timkiem'))

WebUI.click(findTestObject('QlyGDchoduyet/checkboxall'))

WebUI.click(findTestObject('QlyGDchoduyet/Button_duyethoantien'))

WebUI.click(findTestObject('QlyGDchoduyet/Button_dongyhoan'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('QlyGDchoduyet/popup_thongbao_GDkhonghople'), 'Giao dịch không hợp lệ')

WebUI.click(findTestObject('QlyGDchoduyet/button_OK_tatpopup'))

