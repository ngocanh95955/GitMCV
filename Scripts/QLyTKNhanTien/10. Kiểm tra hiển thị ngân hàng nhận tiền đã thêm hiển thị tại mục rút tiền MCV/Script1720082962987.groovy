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

WebUI.callTestCase(findTestCase('Login/Login MCV1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('QlyTKNHanTien/menu_Quanlysodu'))

WebUI.click(findTestObject('QlyTKNHanTien/menu_ruttien'))

WebUI.setText(findTestObject('QlyTKNHanTien/input_sotien'), '100000')

WebUI.click(findTestObject('QlyTKNHanTien/button_tieptucMCV'))

WebUI.delay(4)

WebUI.click(findTestObject('QlyTKNHanTien/chon_loaihinhruttien'))

WebUI.click(findTestObject('QlyTKNHanTien/chon_chuyenkhoan'))

WebUI.scrollToElement(findTestObject('QlyTKNHanTien/button_kiemtrathongtin'), 0)

WebUI.click(findTestObject('QlyTKNHanTien/button_kiemtrathongtin'))

WebUI.click(findTestObject('QlyTKNHanTien/button_tieptucMCV1'))

WebUI.click(findTestObject('QlyTKNHanTien/button_okmcv'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('QlyTKNHanTien/button_timkiemmcv'), 0)

WebUI.verifyElementText(findTestObject('QlyTKNHanTien/expexted_taikhoanmcv'), '9Service')

WebUI.verifyElementText(findTestObject('QlyTKNHanTien/Expected_thongtinnganhang'), 'Tài khoản nhận\nBIDV\n1023020330000\nNGUYEN VAN A')

WebUI.verifyElementText(findTestObject('QlyTKNHanTien/Expected_loaigiaodich'), 'Dịch vụ\nThu hộ\nLoại giao dịch\nRút tiền')

WebUI.verifyElementText(findTestObject('QlyTKNHanTien/Expected_sotienmcv'), 'Giá trị GD\n100,000VND\nPhí GD\n0VND\nSố tiền GD\n100,000VND')

