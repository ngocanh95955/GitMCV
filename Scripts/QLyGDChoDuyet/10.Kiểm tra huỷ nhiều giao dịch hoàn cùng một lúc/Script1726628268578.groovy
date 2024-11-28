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

WebUI.click(findTestObject('QlyGDchoduyet/Filter_LoaiGD'))

WebUI.click(findTestObject('QlyGDchoduyet/chon_loaiGD_hoantien'))

WebUI.click(findTestObject('QlyGDchoduyet/Filter_Taikhoan'))

WebUI.setText(findTestObject('QlyGDchoduyet/input_taikhoan'), 'autotest')

WebUI.click(findTestObject('QlyGDchoduyet/chon_tk_autotest'))

WebUI.click(findTestObject('QlyGDchoduyet/button_timkiem'))

WebUI.verifyElementText(findTestObject('QlyGDchoduyet/Expect_trangthai_ChoVH2duyet'), 'Chờ vận hành 2 duyệt')

WebUI.click(findTestObject('QlyGDchoduyet/checkboxall'))

WebUI.click(findTestObject('QlyGDchoduyet/button_huyGD'))

WebUI.setText(findTestObject('QlyGDchoduyet/input_noidunghuy'), 'Huy')

WebUI.click(findTestObject('QlyGDchoduyet/Button_DongyHuy'))

WebUI.click(findTestObject('QlyGDchoduyet/Button_OKhuy'))

