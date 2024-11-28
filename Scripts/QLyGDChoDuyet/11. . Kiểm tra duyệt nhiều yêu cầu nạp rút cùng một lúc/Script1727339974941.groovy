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

WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/user-transaction/pending-approve')

WebUI.click(findTestObject('QlyGDchoduyet/Filter_Taikhoan'))

/// thêm GD 2 rút tiền tk nana9595 - thêm thời gian tạo //// 

WebUI.setText(findTestObject('QlyGDchoduyet/input_taikhoan'), 'nana9595')

WebUI.click(findTestObject('QlyGDchoduyet/chon_tknana9595'))

WebUI.setText(findTestObject('QlyGDchoduyet/input_thoigian'), '04/10/2024')

WebUI.click(findTestObject('QlyGDchoduyet/button_timkiem'))

WebUI.click(findTestObject('QlyGDchoduyet/checkboxall'))

WebUI.click(findTestObject('QlyGDchoduyet/buron_duyetnaprut'))

WebUI.click(findTestObject('QlyGDchoduyet/button_dongy_duyetnaprut'))

WebUI.click(findTestObject('QlyGDchoduyet/button_okduyetnaprut'))

