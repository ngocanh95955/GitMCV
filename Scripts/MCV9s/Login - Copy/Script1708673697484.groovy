import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stg-console.9pay.mobi/login')

WebUI.setText(findTestObject('Object Repository/MCV9s/Page_Login system 9PAY/input_username'), 'autotest')

WebUI.setText(findTestObject('Object Repository/MCV9s/Page_Login system 9PAY/input_password'), 'autotest@9s.vn')

WebUI.click(findTestObject('Object Repository/MCV9s/Page_Login system 9PAY/button_ng nhp'))

WebUI.setViewPortSize(1920, 1080)

WebUI.waitForElementVisible(findTestObject('Object Repository/MCV9s/ChiDon/QLDVChi'), 2)

WebUI.click(findTestObject('Object Repository/MCV9s/ChiDon/QLDVChi'))

WebUI.click(findTestObject('Object Repository/MCV9s/ChiDon/LenhChiDon'))

WebUI.click(findTestObject('Object Repository/MCV9s/ChiDon/Dropdown_click'))

def list = WebUI.findWebElements(findTestObject('Object Repository/MCV9s/ChiDon/listBank'),2)
println(list.size())

for (int i = 0; i<=list.size(); i++) {
	WebElement item = list.get(i)
	String text =  item.getText()
	print("Ngan hang: ${text}\n")
	if (text.equals("ABBANK - NH An Binh")) {
		item.click()
		break
	}
}

