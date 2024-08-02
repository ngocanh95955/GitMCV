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

WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/user')

WebUI.click(findTestObject('Qly ty giá/chon_taikhoan'))

WebUI.click(findTestObject('Qly ty giá/chon_taikhoan_autotest'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Qly ty giá/nhaptk'))

WebUI.click(findTestObject('Qly ty giá/button_Timkiemtk'))

WebUI.delay(1)

WebUI.click(findTestObject('Qly ty giá/button_chuyentien'))

WebUI.delay(8)

WebUI.click(findTestObject('Qly ty giá/chon_tkchuyen'))

WebUI.click(findTestObject('Qly ty giá/chon_taikhoan_autotest'))

WebUI.click(findTestObject('Qly ty giá/chon_vichuyen'))

WebUI.click(findTestObject('Qly ty giá/Chon_vichuyen_USD'))

WebUI.click(findTestObject('Qly ty giá/chon_tknhan'))

WebUI.setText(findTestObject('Qly ty giá/input_tknhan'), 'Test Tên Merchant new')

WebUI.click(findTestObject('Qly ty giá/chon_taikhoan_test'))

WebUI.click(findTestObject('Qly ty giá/chon_vinhan'))

WebUI.setText(findTestObject('Qly ty giá/input_vinhan'), 'Thu hộ (VND)')

WebUI.click(findTestObject('Qly ty giá/Chon_vinhan_USD'))

WebUI.setText(findTestObject('Qly ty giá/input_sotienchuyen'), '10')

WebUI.click(findTestObject('Qly ty giá/button_xacnhan'))

WebUI.delay(3)

WebUI.click(findTestObject('Qly ty giá/button_dongy'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Qly ty giá/Expect_tygiaquydoi_USDsangVND'), '20,060 VND')

