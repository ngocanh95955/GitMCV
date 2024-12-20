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

WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/exchange-rate')

WebUI.setText(findTestObject('Qly ty giá/input_thoigiantao'), '26/07/2026 - 26/07/2026')

WebUI.click(findTestObject('Qly ty giá/button_timkiem'))

WebUI.verifyElementText(findTestObject('Qly ty giá/ExpectMSG_KhongtimthayKQ'), 'Không tìm thấy dữ liệu.')

WebUI.setText(findTestObject('Qly ty giá/input_thoigiantao'), '12/09/2024 - 12/09/2024')

WebUI.click(findTestObject('Qly ty giá/button_timkiem'))

WebUI.verifyElementText(findTestObject('Qly ty giá/Expect_thoigiantao'), '04:04 12/09/2024')

