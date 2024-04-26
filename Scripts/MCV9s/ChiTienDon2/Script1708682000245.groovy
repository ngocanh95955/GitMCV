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

soDuTruocGiaoDich = WebUI.getText(findTestObject('Object Repository/MCV9s/ChiDon/ChiHoTruoc'))
soDuTruocGiaoDich = soDuTruocGiaoDich.replaceAll(/[^0-9]/, '')
int intValue6 = Integer.parseInt(soDuTruocGiaoDich)

if (WebUI.verifyTextPresent('Tên tài khoản', false, FailureHandling.CONTINUE_ON_FAILURE)) {
	
	//Input amount
	inputamount = findTestObject('Object Repository/MCV9s/ChiDon/amountGD')
	
	WebUI.click(inputamount)
	
	WebUI.sendKeys(inputamount, Keys.chord(Keys.CONTROL, 'a'))
	
	WebUI.sendKeys(inputamount, Keys.chord(Keys.BACK_SPACE))
	
	if (inputamount != '') {
		WebUI.sendKeys(inputamount, amount)
	}
	
	//Input content
	inputcontent = findTestObject('Object Repository/MCV9s/ChiDon/noiDung')
	
	WebUI.click(inputcontent)
	
	WebUI.sendKeys(inputcontent, Keys.chord(Keys.CONTROL, 'a'))
	
	WebUI.sendKeys(inputcontent, Keys.chord(Keys.BACK_SPACE))
	
	if (inputcontent != '') {
		WebUI.sendKeys(inputcontent, note)
	}
	
	
	//Input confirm
	inputconfirm = findTestObject('Object Repository/MCV9s/ChiDon/xacthuc')
	
	WebUI.click(inputconfirm)
	
	WebUI.sendKeys(inputconfirm, Keys.chord(Keys.CONTROL, 'a'))
	
	WebUI.sendKeys(inputconfirm, Keys.chord(Keys.BACK_SPACE))
	
	if (inputconfirm != '') {
		WebUI.sendKeys(inputconfirm, confirm)
	}
	
		
	WebUI.click(findTestObject('Object Repository/MCV9s/ChiDon/buttoncheckall'))
	
	WebUI.verifyTextPresent(validateResult, false, FailureHandling.CONTINUE_ON_FAILURE)
	
	
	if (validateResult == 'Tham số không hợp lệ') {
		
		WebUI.click(findTestObject('Object Repository/MCV9s/ChiDon/Page_Chuyn tin dch v/button_OK(failall)'))
		
		
	}  else {
		
		if (validateResult == 'Bạn đã gửi yêu cầu chuyển tiền thành công') {
			
			WebUI.click(findTestObject('Object Repository/MCV9s/ChiDon/Page_Chuyn tin dch v/button_OK(successall)'))
			
			//Verify lịch sử giao dịch
			
			account = WebUI.getText(findTestObject('Object Repository/MCV9s/ChiDon/TKchuyen'))
			WebUI.verifyEqual(account, 'autotest')
			
			nganHangNhan = WebUI.getText(findTestObject('Object Repository/MCV9s/ChiDon/nganHang'))
			println('Số tiền chi: ' + nganHangNhan)
//			WebUI.verifyEqual(nganHangNhan, 'BIDV')
			
			soTKnganHangnhan = WebUI.getText(findTestObject('Object Repository/MCV9s/ChiDon/TKnhan'))
			println('Số TK nhận: ' + soTKnganHangnhan)
			WebUI.verifyEqual(soTKnganHangnhan, '1023020330000')
			
			
			giatrigiaodich = WebUI.getText(findTestObject('Object Repository/MCV9s/ChiDon/soTienChuyen'))
			amountlist = giatrigiaodich.replaceAll(/[^0-9]/, '')
			println('Số tiền chi: ' + amountlist)
			WebUI.verifyEqual(amountlist, amount)
			int intValue1 = Integer.parseInt(amountlist)
			
			phigiaodich = WebUI.getText(findTestObject('Object Repository/MCV9s/ChiDon/phiGiaoDich'))
			phigiaodichnumber = phigiaodich.replaceAll(/[^0-9]/, '')
			println('phí giao dịch: ' + phigiaodichnumber)
			int intValue2 = Integer.parseInt(phigiaodichnumber)
			
			soTienGiaoDich = WebUI.getText(findTestObject('Object Repository/MCV9s/ChiDon/soTienGiaoDich'))
			soTienGiaoDichnumber = soTienGiaoDich.replaceAll(/[^0-9]/, '')
			println('Số tiền giao dịch: ' + soTienGiaoDichnumber)
			int intValue3 = Integer.parseInt(soTienGiaoDichnumber)
			WebUI.verifyEqual(intValue3, intValue1 + intValue2)
			
			soDuSauGiaoDich = WebUI.getText(findTestObject('Object Repository/MCV9s/ChiDon/Page_Lch s giao dch/td_105,605,300VND'))
			soDuSauGiaoDichnumber = soDuSauGiaoDich.replaceAll(/[^0-9]/, '')
			println('Số dư sau giao dịch: ' + soDuSauGiaoDichnumber)
			int intValue5 = Integer.parseInt(soDuSauGiaoDichnumber)
			WebUI.verifyEqual(intValue6, intValue5 + intValue3)
			
		}			
		
	}
	
	
} 