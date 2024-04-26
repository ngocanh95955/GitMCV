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


if (WebUI.verifyTextPresent('Số tiền Giao dịch hợp lệ', false, FailureHandling.CONTINUE_ON_FAILURE)) {
	
WebUI.click(findTestObject('Object Repository/MCV9s/ChiLo/buttonCheckAll'))

WebUI.click(findTestObject('Object Repository/MCV9s/ChiLo/buttonTaoLenhChiTienLo'))

inputconfirm = findTestObject('Object Repository/MCV9s/ChiLo/inputXacThuc')
WebUI.sendKeys(inputconfirm, '123456')

WebUI.click(findTestObject('Object Repository/MCV9s/ChiLo/buttonConfirmChiLo'))

if (WebUI.verifyTextPresent('thành công', false, FailureHandling.CONTINUE_ON_FAILURE)) {
	
	WebUI.click(findTestObject('Object Repository/MCV9s/ChiLo/buttonChiLoSuccess'))
}


WebUI.delay(2)
WebUI.navigateToUrl("https://stg-console.9pay.mobi/admin/transfer-bank-request")

WebUI.click(findTestObject('Object Repository/MCV9s/ChiLo/XemChiTietLStaoLo'))

// Tìm tất cả các hàng trong bảng và lặp qua chúng
List<WebElement> rowsValidate = new ArrayList<WebElement>()

def listRowsFull = WebUI.findWebElements(findTestObject('Object Repository/MCV9s/ChiLo/BangLStaoLo'), 3)

String Bank = null;
String Sotk = null;
String Name = null;
String Amount = null;

for(int i = 0; i< listRowsFull.size(); i++) {
	def row = listRowsFull.get(i);
	// Lấy danh sách các ô trong hàng
	List<WebElement> cells = row.findElements(By.tagName('td'))
	Boolean stopLoop = false;
	for (int k = 0; k < cells.size(); k++) {
		WebElement cell = cells.get(k)

		if (cell.getText() == 'Yêu cầu đang xử lý') {
			stopLoop = true;
			break
		}
	}
	if (stopLoop) {
		rowsValidate.add(row)
	}
}


// Lặp qua từng hàng trong bảng
for (WebElement row : rowsValidate) {
	// Lấy danh sách các ô trong hàng
	List<WebElement> cells = row.findElements(By.tagName("td"))
	
	// Lặp qua từng ô trong hàng
	for (int i = 0; i < cells.size(); i++) {
		WebElement cell = cells.get(i)
		
		if (i == 2) {
			Bank = cell.getText();
			println("Bank la: "+ Bank);
		}
		
		
		if (i == 3) {
			Sotk = cell.getText();
			println("Sotk la: "+ Sotk);
		}
		
		
		if (i == 4) {
			Name = cell.getText();
			println("Name la: "+ Name);
		}
		
		
		if (i == 5) {
			Amount = cell.getText();
			println("Amount la: "+ Amount);
		}
	}
}


WebUI.navigateToUrl("https://stg-console.9pay.mobi/admin/payout-transaction?order_type=APPROVED")
//
//// lay bang 2
//
List<WebElement> listElements = WebUI.findWebElements(findTestObject('Object Repository/MCV9s/ChiLo/BangChiLo2'), 3)

println("So luong size: "+rowsValidate.size())
for (int i = 0; i < rowsValidate.size(); i++) {
	WebElement row = listElements.get(i)
	println("Row ..."+i)
	List<WebElement> cells = row.findElements(By.tagName('td'))
	
	for (int j = 0; j < cells.size(); j++) {
		WebElement cell = cells.get(j)
		
		if (j == 3) {
			List<WebElement> cellAmount = cell.findElements(By.tagName('div'))
			
			String bank = cellAmount.get(1).getText();
			println("Ngan hang la: "+ bank);
			WebUI.verifyEqual(bank,Bank )
			
			String tk = cellAmount.get(2).getText();
			println("So tai khoan la: "+ tk);
			WebUI.verifyEqual(tk,Sotk )
			
			String hoten = cellAmount.get(3).getText();
			println("Ten: "+ hoten);
			WebUI.verifyEqual(hoten,Name )
					
		}
		
		if (j == 4) {
			List<WebElement> cellAmount = cell.findElements(By.tagName('div'))
			
			String dichVu = cellAmount.get(1).getText();
			println("Loai dich vu la: "+ dichVu);
		
					
		}
		
		if (j == 5) {
			List<WebElement> cellAmount = cell.findElements(By.tagName('div'))
			
			String amount = cellAmount.get(1).getText();
			amountnumber = amount.replaceAll(/[^0-9]/, '')
			int intValue1 = Integer.parseInt(amountnumber)
			println("So tien la: "+ amount);
			println("So tien la: "+ Amount);
//			WebUI.verifyEqual(amount,Amount )
			
			
			String fee = cellAmount.get(3).getText();
			feenumber = fee.replaceAll(/[^0-9]/, '')
			int intValue2 = Integer.parseInt(feenumber)
			println("phi la: "+ intValue2);
			
			String total = cellAmount.get(5).getText();
			totalnumber = total.replaceAll(/[^0-9]/, '')
			int intValue3 = Integer.parseInt(totalnumber)
			println("tong tien la: "+ intValue3);
			
			WebUI.verifyEqual(intValue3, intValue1 + intValue2)
					
		}
		
	}
 }
}