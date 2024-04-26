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


//Get value TK nguồn trước khi chuyển tiền

thuho1 = WebUI.getText(findTestObject('Object Repository/MCV9s/Page_Chuyn tin/b_601,298,220VND'))

numberOnly1 = thuho1.replaceAll(/[^0-9]/, '')
int intValue1 = Integer.parseInt(numberOnly1)

//Get value TK đích trước khi chuyển tiền

thuho4 = WebUI.getText(findTestObject('Object Repository/MCV9s/Page_Chuyn tin/b_105,762,300VND'))

numberOnly4 = thuho4.replaceAll(/[^0-9]/, '')
int intValue4 = Integer.parseInt(numberOnly4)

//Input data tạo lệnh chuyển tiền

WebUI.selectOptionByValue(findTestObject('Object Repository/MCV9s/Page_Chuyn tin/select_Ti khon ngun                                                             autotest'), 
    tknguon, false)

WebUI.selectOptionByValue(findTestObject('Object Repository/MCV9s/Page_Chuyn tin/select_Ti khon ch                                                             autotest'), 
    tkDich, false)

WebUI.selectOptionByValue(findTestObject('Object Repository/MCV9s/Page_Chuyn tin/select_V ngun'), viNguon, false)

WebUI.selectOptionByValue(findTestObject('Object Repository/MCV9s/Page_Chuyn tin/Page_Chuyn tin/select_V ch'), viDich, false)

inputamount = findTestObject('Object Repository/MCV9s/Page_Chuyn tin/input_()_amount')

WebUI.click(inputamount)

WebUI.sendKeys(inputamount,  Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(inputamount, Keys.chord(Keys.BACK_SPACE))

if (inputamount != '') {
	WebUI.sendKeys(inputamount, amount)
}


inputtransaction = findTestObject('Object Repository/MCV9s/Page_Chuyn tin/input_M giao dch tham chiu_refer_id')

WebUI.click(inputtransaction)

WebUI.sendKeys(inputtransaction,  Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(inputtransaction, Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(inputtransaction, transaction)

inputnote = findTestObject('Object Repository/MCV9s/Page_Chuyn tin/textarea_Ghi ch_note')

WebUI.click(inputnote)

WebUI.sendKeys(inputnote, Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(inputnote, Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(inputnote, note)


inputconfirm = findTestObject('Object Repository/MCV9s/Page_Chuyn tin/input_()_verify_code')

WebUI.click(inputconfirm)

WebUI.sendKeys(inputconfirm, Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(inputconfirm, Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(inputconfirm, confirm)

WebUI.click(findTestObject('MCV9s/Page_Chuyn tin/button_Chuyn tin'))

WebUI.delay(2)

//Verify mess 
WebUI.verifyTextPresent(validateResult, false, FailureHandling.CONTINUE_ON_FAILURE)



if (validateResult == 'Success') {
	
	WebUI.verifyElementVisible(findTestObject('Object Repository/MCV9s/Page_Chuyn tin/button_Ok_Successs'))
	WebUI.click(findTestObject('Object Repository/MCV9s/Page_Chuyn tin/button_Ok_Successs'))
	
	//Get value phí khi chuyển tiền
	phi = WebUI.getText(findTestObject('Object Repository/MCV9s/Page_Lch s giao dch/div_0VND'))
	numberOnly6 = phi.replaceAll(/[^0-9]/, '')
	int intValue6 = Integer.parseInt(numberOnly6)
	
	//Get value TK nguồn sau khi chuyển tiền
	thuho2 = WebUI.getText(findTestObject('Object Repository/MCV9s/Page_Lch s giao dch/b_601,208,220VND'))
	numberOnly2 = thuho2.replaceAll(/[^0-9]/, '')
	int intValue2 = Integer.parseInt(numberOnly2)
	
	//Conver amount
	numberOnly3 = amount.replaceAll(/[^0-9]/, '')
	int intValue3 = Integer.parseInt(numberOnly3)
	
	//Get value TK đích sau khi chuyển tiền
	thuho5 = WebUI.getText(findTestObject('Object Repository/MCV9s/Page_Lch s giao dch/b_105,762,300VND'))
	numberOnly5 = thuho5.replaceAll(/[^0-9]/, '')
	int intValue5 = Integer.parseInt(numberOnly5)
	
	//Verify value sau khi chuyển tiền thành côgn
	WebUI.verifyEqual(intValue1 - intValue3 - intValue6, intValue2)
	WebUI.verifyEqual(intValue4 + intValue3, intValue5)
	
	//Verify lịch sử giao dịch
	
	account = WebUI.getText(findTestObject('Object Repository/MCV9s/Page_Lch s giao dch/td_autotest'))
	WebUI.verifyEqual(account, 'autotest')
	
	amountlist = WebUI.getText(findTestObject('Object Repository/MCV9s/Page_Lch s giao dch/div_10,000VND'))
	amountlistnumber = amountlist.replaceAll(/[^0-9]/, '')
	WebUI.verifyEqual(amountlistnumber, amount)
	
	balance1= WebUI.getText(findTestObject('Object Repository/MCV9s/Page_Lch s giao dch/b_601,208,220VND'))
	balance1number = balance1.replaceAll(/[^0-9]/, '')
	balance2= WebUI.getText(findTestObject('Object Repository/MCV9s/Page_Lch s giao dch/td_601,278,220VND'))
	balance2number = balance2.replaceAll(/[^0-9]/, '')
	WebUI.verifyEqual(balance1number, balance2number)
	
	status =  WebUI.getText(findTestObject('Object Repository/MCV9s/Page_Lch s giao dch/span_Thnh cng'))
	WebUI.verifyEqual(status, 'Thành công')
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/MCV9s/Page_Lch s giao dch/a_Qun l s d'), 2)
	
	WebUI.click(findTestObject('Object Repository/MCV9s/Page_Lch s giao dch/a_Qun l s d'))
	
	WebUI.click(findTestObject('Object Repository/MCV9s/Page_Lch s giao dch/a_Chuyn tin'))
	
} else {
		
	WebUI.verifyElementVisible(findTestObject('Object Repository/MCV9s/Page_Chuyn tin/button_OK'))
	WebUI.click(findTestObject('Object Repository/MCV9s/Page_Chuyn tin/button_OK'))
	
	//Get value chuyền tiền fail
	thuho1fail = WebUI.getText(findTestObject('Object Repository/MCV9s/Page_Chuyn tin/b_601,298,220VND'))
	numberOnly1fail = thuho1fail.replaceAll(/[^0-9]/, '')
	int intValue1fail = Integer.parseInt(numberOnly1fail)
	
	thuho4fail = WebUI.getText(findTestObject('Object Repository/MCV9s/Page_Chuyn tin/b_105,762,300VND'))
	numberOnly4fail = thuho4fail.replaceAll(/[^0-9]/, '')
	int intValue4fail = Integer.parseInt(numberOnly4fail)
	
	//Verify value khi chuyển tiền kop thành công
	WebUI.verifyEqual(intValue1, intValue1fail)
	WebUI.verifyEqual(intValue4, intValue4fail)
		
}


