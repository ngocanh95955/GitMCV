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

WebUI.setViewPortSize(1920, 1080)

WebUI.waitForElementVisible(findTestObject('Object Repository/MCV9s/HoanTien/menuQLDVThu'), 2)

WebUI.click(findTestObject('Object Repository/MCV9s/HoanTien/menuQLDVThu'))

WebUI.click(findTestObject('Object Repository/MCV9s/HoanTien/XemLichSuThuTien'))

//// lay bang danh sách thu
//
List<WebElement> listElements = WebUI.findWebElements(findTestObject('Object Repository/MCV9s/HoanTien/BangDSThuTien'), 3)

for (int i = 0; i < listElements.size(); i++) {
	WebElement row = listElements.get(i)
	println("Row ..."+i)
	List<WebElement> cells = row.findElements(By.tagName('td'))
	
	for (int j = 0; j < cells.size(); j++) {
		WebElement cell = cells.get(j)
		
		if (j == 8) {
			List<WebElement> cellAmount = cell.findElements(By.tagName('div'))
			
			String staus = cellAmount.get(0).getText();
			println("staus: "+ staus);					
		}	
	}
 }