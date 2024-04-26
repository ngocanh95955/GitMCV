import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



WebUI.click(findTestObject('Object Repository/MCV9s/ChiDon/Dropdown_click'))

def list = WebUI.findWebElements(findTestObject('Object Repository/MCV9s/ChiDon/listBank'),2)

for (int i = 0; i<=list.size(); i++) {
	WebElement item = list.get(i)
	String text =  item.getText()
	if (text.equals(bank)) {
		item.click()
		break
	}
}

WebUI.selectOptionByValue(findTestObject('Object Repository/MCV9s/ChiDon/loaiTK'), loaitk,  false)

inpusotk = findTestObject('Object Repository/MCV9s/ChiDon/soTK')

WebUI.click(inpusotk)

WebUI.sendKeys(inpusotk, Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(inpusotk, Keys.chord(Keys.BACK_SPACE))

if (inpusotk != '') {
    WebUI.sendKeys(inpusotk, sotk)
}

WebUI.click(findTestObject('Object Repository/MCV9s/ChiDon/buttonCheck'))

WebUI.delay(2)

//Verify mess
WebUI.verifyTextPresent(validateResult, false, FailureHandling.CONTINUE_ON_FAILURE)



if (validateResult == 'Thông tin tài khoản ngân hàng không hợp lệ') {
	
	WebUI.click(findTestObject('Object Repository/MCV9s/ChiDon/button_OK'))
}




