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

WebUI.click(findTestObject('Qly ty giá/icon_suatygia'))

WebUI.setText(findTestObject('Qly ty giá/input_tygiamua'), '30000')

WebUI.setText(findTestObject('Qly ty giá/input_tygiaban'), '31000')

WebUI.click(findTestObject('Qly ty giá/button_capnhat_tygia'))

WebUI.click(findTestObject('Qly ty giá/button_ok_suatygia'))

WebUI.verifyElementText(findTestObject('Qly ty giá/Expect_TyGiaMuavao_sauEdit'), '30,000')

WebUI.verifyElementText(findTestObject('Qly ty giá/Expect_tygiabanra'), '31,000')

WebUI.verifyElementText(findTestObject('Qly ty giá/Expect_GTthaydoi_Ngoaite_VND'), '60')

WebUI.verifyElementText(findTestObject('Qly ty giá/Expect_GTthaydoi_VND_Ngoaite'), '65')

WebUI.verifyElementText(findTestObject('Qly ty giá/Expect_Loaitygia'), 'USD')

WebUI.verifyElementText(findTestObject('Qly ty giá/Expect_Quydoi_Ngoaite-VND'), '30,060')

WebUI.verifyElementText(findTestObject('Qly ty giá/Expect_Quydoi_VND-Ngoaite'), '30,935')

