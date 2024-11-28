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

/////Tai khoan VH1 duyet/////
WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/login')

WebUI.setText(findTestObject('HoanTien/input_usernamecms'), 'cskh1')

WebUI.setText(findTestObject('HoanTien/Input_passwordcms'), 'Ngocanh1995#')

WebUI.click(findTestObject('HoanTien/button_logincms'))

WebUI.delay(6)

WebUI.setViewPortSize(1920, 1080)

WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/user-transaction/pending-approve')

////Thêm data test - GD hoàn tiền TK 9Service//////

WebUI.setText(findTestObject('QlyGDchoduyet/input_maGD'), 'P5GWMMR6')

WebUI.click(findTestObject('QlyGDchoduyet/button_timkiem'))

WebUI.click(findTestObject('QlyGDchoduyet/button_chitiet'))

WebUI.scrollToElement(findTestObject('HoanTien/button_DuyetHoan'), 0)

WebUI.click(findTestObject('HoanTien/button_DuyetHoan'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('HoanTien/input_Lydo'), 'duyet hoan tien')

WebUI.click(findTestObject('HoanTien/button_Duyet'))

WebUI.click(findTestObject('HoanTien/button_OKchitiet'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('HoanTien/VH_Duyetlan1'), 3)

WebUI.verifyElementClickable(findTestObject('HoanTien/VH_Duyetlan1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('HoanTien/Button_HuyYCHoan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HoanTien/VH_Duyetlan1'))

WebUI.delay(2)

WebUI.click(findTestObject('HoanTien/button_Dongy_Duyethoan'))

WebUI.delay(2)

WebUI.click(findTestObject('HoanTien/button_OKchitiet'))

WebUI.delay(3)

WebUI.refresh()

WebUI.verifyElementText(findTestObject('QlyGDchoduyet/Expect_Trangthai_ChoVH2'), 'Chờ vận hành 2 duyệt')

WebUI.delay(3)

WebUI.verifyTextNotPresent('VH DUYỆT HOÀN TIỀN KH LẦN 1', false)

WebUI.verifyTextNotPresent('HỦY YÊU CẦU HOÀN TIỀN', false)

WebUI.click(findTestObject('HoanTien/Logout'))

/////Tai khoan VH2 
WebUI.setText(findTestObject('HoanTien/input_usernamecms'), 'cskh2')

WebUI.setText(findTestObject('HoanTien/Input_passwordcms'), 'Ngocanh1995#')

WebUI.click(findTestObject('HoanTien/button_logincms'))

WebUI.delay(6)

WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/user-transaction/pending-approve')

WebUI.setText(findTestObject('QlyGDchoduyet/input_maGD'), 'P5GWMMR6')

WebUI.click(findTestObject('QlyGDchoduyet/button_timkiem'))

WebUI.click(findTestObject('QlyGDchoduyet/button_chitiet'))

WebUI.scrollToElement(findTestObject('HoanTien/VH_Duyetlan2'), 3)

WebUI.verifyElementClickable(findTestObject('HoanTien/VH_Duyetlan2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('HoanTien/Button_HuyYCHoan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HoanTien/VH_Duyetlan2'))

WebUI.delay(2)

WebUI.click(findTestObject('HoanTien/button_Dongy_Duyethoan'))

WebUI.delay(2)

WebUI.click(findTestObject('HoanTien/button_OKchitiet'))

WebUI.delay(3)

WebUI.refresh()

WebUI.verifyElementText(findTestObject('QlyGDchoduyet/Expec_Trangthai_ChoKT1duyet'), 'Chờ kế toán 1 duyệt')

WebUI.delay(3)

WebUI.verifyTextNotPresent('VH DUYỆT HOÀN TIỀN KH LẦN 2', false)

WebUI.verifyTextNotPresent('HỦY YÊU CẦU HOÀN TIỀN', false)

WebUI.click(findTestObject('HoanTien/Logout'))

//// Tài khoan KT1 
WebUI.setText(findTestObject('HoanTien/input_usernamecms'), 'kt1')

WebUI.setText(findTestObject('HoanTien/Input_passwordcms'), 'Ngocanh1995#')

WebUI.click(findTestObject('HoanTien/button_logincms'))

WebUI.delay(5)

WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/user-transaction/pending-approve')

WebUI.delay(3)

WebUI.setText(findTestObject('QlyGDchoduyet/input_maGD'), 'P5GWMMR6')

WebUI.click(findTestObject('QlyGDchoduyet/button_timkiem'))

WebUI.click(findTestObject('QlyGDchoduyet/button_chitiet'))

WebUI.scrollToElement(findTestObject('HoanTien/KT_Duỵetlan1'), 3)

WebUI.verifyElementClickable(findTestObject('HoanTien/KT_Duỵetlan1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('HoanTien/Button_HuyYCHoan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HoanTien/KT_Duỵetlan1'))

WebUI.delay(3)

WebUI.click(findTestObject('HoanTien/button_Dongy_Duyethoan'))

WebUI.delay(3)

WebUI.click(findTestObject('HoanTien/button_OKchitiet'))

WebUI.delay(3)

WebUI.refresh()

WebUI.verifyElementText(findTestObject('QlyGDchoduyet/Expect_Trangthai_KT2duyet'), 'Chờ kế toán 2 duyệt')

WebUI.delay(3)

WebUI.verifyTextNotPresent('KT DUYỆT HOÀN TIỀN KH LẦN 1', false)

WebUI.verifyTextNotPresent('HỦY YÊU CẦU HOÀN TIỀN', false)

WebUI.click(findTestObject('HoanTien/Logout'))

/////// Tai khoan ke toán duyet 2/////
WebUI.setText(findTestObject('HoanTien/input_usernamecms'), 'kt2')

WebUI.setText(findTestObject('HoanTien/Input_passwordcms'), 'Ngocanh1995#')

WebUI.click(findTestObject('HoanTien/button_logincms'))

WebUI.delay(6)

WebUI.navigateToUrl('https://stg-cms-console.9pay.mobi/user-transaction/pending-approve')

WebUI.delay(3)

WebUI.setText(findTestObject('QlyGDchoduyet/input_maGD'), 'P5GWMMR6')

WebUI.click(findTestObject('QlyGDchoduyet/button_timkiem'))

WebUI.click(findTestObject('QlyGDchoduyet/button_chitiet'))

WebUI.scrollToElement(findTestObject('HoanTien/KT_Duyetlan2'), 3)

WebUI.verifyElementClickable(findTestObject('HoanTien/KT_Duyetlan2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('HoanTien/Button_HuyYCHoan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HoanTien/KT_Duyetlan2'))

WebUI.delay(3)

WebUI.click(findTestObject('HoanTien/button_Dongy_Duyethoan'))

WebUI.delay(3)

WebUI.click(findTestObject('HoanTien/button_OKchitiet'))

WebUI.delay(3)

WebUI.refresh()

WebUI.verifyElementText(findTestObject('QlyGDchoduyet/Expect_trangthai_thanhcong'), 'Thành công')

WebUI.delay(3)

WebUI.verifyTextNotPresent('KT DUYỆT HOÀN TIỀN KH LẦN 2', false)

WebUI.verifyTextNotPresent('HỦY YÊU CẦU HOÀN TIỀN', false)

