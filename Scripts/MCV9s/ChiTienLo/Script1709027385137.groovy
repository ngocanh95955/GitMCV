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
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory



WebUI.uploadFile(findTestObject('Object Repository/MCV9s/ChiLo/buttonSelectFile'), file)

WebUI.click(findTestObject('Object Repository/MCV9s/ChiLo/uplpdExcel'))

WebUI.waitForElementVisible(findTestObject('Object Repository/MCV9s/ChiLo/ThongTinTienHopLe'), 2)

WebUI.delay(2)

WebUI.verifyTextPresent(validateResult, false, FailureHandling.CONTINUE_ON_FAILURE)

if (validateResult == 'Tham số không hợp lệ') {
	
	WebUI.click(findTestObject('Object Repository/MCV9s/ChiLo/buttonOKfail'))
} else {
	
	if (validateResult == 'Có lỗi xảy ra, vui lòng thử lại') {
		
		WebUI.click(findTestObject('Object Repository/MCV9s/ChiLo/Page_Chuyn tin dch v/button_OK'))
	}
}
