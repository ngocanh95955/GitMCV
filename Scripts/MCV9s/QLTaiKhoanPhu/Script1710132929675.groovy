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

WebUI.waitForElementVisible(findTestObject('Object Repository/MCV9s/QLtaiKhoan/MenuQLTK'), 2)

WebUI.click(findTestObject('Object Repository/MCV9s/QLtaiKhoan/MenuQLTK'))

WebUI.click(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuDSTKPhu'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MCV9s/QLtaiKhoan/Page_Account sub-merchant/select_status'), '1',  false)

WebUI.click(findTestObject('Object Repository/MCV9s/QLtaiKhoan/buttonTimKiem'))

// Tìm tất cả các hàng trong bảng và lặp qua chúng
List<WebElement> rowsValidate = new ArrayList<WebElement>()

def listAccountFull = WebUI.findWebElements(findTestObject('Object Repository/MCV9s/QLtaiKhoan/listTkPhu'), 3)

String account1 = null;
String account2 = null;
String phanQuyenAC1 = null;
String phanQuyenAC2 = null;

// Lấy danh sách các hàng trong bảng
List<WebElement> rows_table = listAccountFull.get(0).findElements(By.tagName('tr'))

// Số hàng trong bảng
int rows_count = rows_table.size()

// Duyệt qua từng hàng của bảng
for (int row = 0; row < rows_count; row++) {
    // Lấy danh sách các ô trong hàng
    List<WebElement> columns_row = rows_table.get(row).findElements(By.tagName('td'))

    // Số cột trong hàng
    int columns_count = columns_row.size()

    println("Số ô trong hàng " + row + " là " + columns_count)

    // Duyệt qua từng ô của hàng
    for (int column = 0; column < columns_count; column++) {
        // Lấy nội dung của ô
        String celltext = columns_row.get(column).getText()

        println("Giá trị của ô tại hàng " + row + " và cột " + column + " là " + celltext)

        if (row == 0 && column == 1)   {
            account1 = celltext;
            println("account1 là: "+ account1);
        }

        if (row == 0 && column == 3)   {
            phanQuyenAC1 = celltext;
            println("phanQuyenAC1 là: "+ phanQuyenAC1);
        }
		
		if (row == 1 && column == 1)   {
			account2 = celltext;
			println("account2 la: "+ account2);
		}
		
		if (row == 1 && column == 3)   {
			phanQuyenAC2 = celltext;
			println("phanQuyenAC2 la: "+ phanQuyenAC2);
		}
    }
}

String[][] dataTable = [
	["STT", "AC", "Role"],
	["1", account1, phanQuyenAC1],
	["2", account2, phanQuyenAC2],
	
]

WebUI.click(findTestObject('Object Repository/MCV9s/QLtaiKhoan/buttonLogOut'))

WebUI.delay(3)

// Lặp qua mỗi hàng trong bảng dữ liệu
for (int i = 1; i < dataTable.length; i++) { 
    String account = dataTable[i][1] // Lấy account
    String role = dataTable[i][2] // Lấy role

    // Thực hiện đăng nhập với tài khoản và kiểm tra vai trò
    WebUI.setText(findTestObject('Object Repository/MCV9s/Page_Login system 9PAY/input_username'), account)

    WebUI.setText(findTestObject('Object Repository/MCV9s/Page_Login system 9PAY/input_password'), 'test@123')

    WebUI.click(findTestObject('Object Repository/MCV9s/Page_Login system 9PAY/button_ng nhp'))
	
	WebUI.delay(3)
	
    // Kiểm tra role
    if (role.equals('Xem thông tin giao dịch')) {
       
////	Verify menu Quản lý số dư
//	WebUI.verifyElementNotPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuQLsoDu'), 3)
	
//	Verify menu Dịch vụ Thu
	WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuQLDVThuRoleView'), 3)
	
	WebUI.click(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuQLDVThuRoleView'))
	
	WebUI.delay(3)
		
	WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuViewLSThuTien'), 3)
	
	WebUI.verifyElementNotPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuDVThuXemBC'), 3)
	
	WebUI.verifyElementNotPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuTaoVA'), 3)
	
//	Verify menu Dịch vụ chi	
	WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuQLDVchi'), 3)
	
	WebUI.click(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuQLDVchi'))
	
	WebUI.delay(3)
		
	WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/viewLSchiTien'), 3)
	
	WebUI.verifyElementNotPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuQLDVChiXemBC'), 3)
	
	WebUI.verifyElementNotPresent(findTestObject('Object Repository/MCV9s/ChiLo/XemLStaolo'), 3)
	
	WebUI.verifyElementNotPresent(findTestObject('Object Repository/MCV9s/ChiLo/MenuChiLo'), 3)
	
	WebUI.verifyElementNotPresent(findTestObject('Object Repository/MCV9s/ChiDon/LenhChiDon'), 3)
	
//	Verify menu Quản lý tài khoản
	WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/MenuQLTKRoleView'), 3)
	
	WebUI.click(findTestObject('Object Repository/MCV9s/QLtaiKhoan/MenuQLTKRoleView'))
	
	WebUI.delay(3)
		
	WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuQLTKDoiMatKhau'), 3)
	
	WebUI.verifyElementNotPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuDSTKPhu'), 3)
	
	WebUI.click(findTestObject('Object Repository/MCV9s/QLtaiKhoan/buttonLogOutRoleView'))
	
    } else {
        if (role.equals('Quản lý và xử lý giao dịch')) {
		
			//Verify menu Quản lý số dư
			WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/MenuQLsoDuRoleEdit'), 3)
			
			WebUI.click(findTestObject('Object Repository/MCV9s/QLtaiKhoan/MenuQLsoDuRoleEdit'))
			
			WebUI.delay(3)
			
			WebUI.verifyTextPresent('Chuyển tiền', false, FailureHandling.CONTINUE_ON_FAILURE)
			
			
			//	Verify menu Dịch vụ Thu
			WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuDVThu'), 3)
			
			WebUI.click(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuDVThu'))
			
			WebUI.delay(3)
				
			WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuViewLSThuTien'), 3)
			
			WebUI.verifyElementNotPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuDVThuXemBC'), 3)
			
			WebUI.verifyElementNotPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuTaoVA'), 3)
			
		//	Verify menu Dịch vụ chi
			WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuQLDVChiRoleEdit'), 3)
			
			WebUI.click(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuQLDVChiRoleEdit'))
			
			WebUI.delay(3)
				
			WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/viewLSchiTien'), 3)
			
			WebUI.verifyElementNotPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuQLDVChiXemBC'), 3)
			
			WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/ChiLo/XemLStaolo'), 3)
			
			WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/ChiLo/MenuChiLo'), 3)
			
			WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/ChiDon/LenhChiDon'), 3)
			
		//	Verify menu Quản lý tài khoản
			WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/MenuQLTK'), 3)
			
			WebUI.click(findTestObject('Object Repository/MCV9s/QLtaiKhoan/MenuQLTK'))
			
			WebUI.delay(3)
				
			WebUI.verifyElementPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuQLTKDoiMatKhau'), 3)
			
			WebUI.verifyElementNotPresent(findTestObject('Object Repository/MCV9s/QLtaiKhoan/menuDSTKPhu'), 3)
			
			WebUI.click(findTestObject('Object Repository/MCV9s/QLtaiKhoan/buttonLogOutRoleQuanLyGD'))
		
        }
	
    }
	
	

}
