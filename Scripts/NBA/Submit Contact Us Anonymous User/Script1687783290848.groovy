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

WebUI.navigateToUrl('https://online.ext.nba.dev.bssdev.local/EN/Pages/default.aspx')

WebUI.click(findTestObject('Object Repository/NBA/Contact Us Anonymous User/Page_Pages - NBA Home/a_CONTACT US'))

WebUI.click(findTestObject('Object Repository/NBA/Contact Us Anonymous User/Page_- Contact Us/button_OK'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/NBA/Contact Us Anonymous User/Page_- Contact Us/input__txt.applicationdetails.firstname'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/NBA/Contact Us Anonymous User/Page_- Contact Us/input__txt.applicationdetails.lastname'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/NBA/Contact Us Anonymous User/Page_- Contact Us/input__txt.applicationdetails.email'), 
    'test@test.com')

WebUI.setText(findTestObject('Object Repository/NBA/Contact Us Anonymous User/Page_- Contact Us/input_ID_txt.applicationdetails.identificat_4ea397'), 
    '12345')

WebUI.click(findTestObject('NBA/Contact Us Anonymous User/Page_- Contact Us/span__input-control-img'))

WebUI.setText(findTestObject('Object Repository/NBA/Contact Us Anonymous User/Page_- Contact Us/input__txt.applicationdetails.requestsubject'), 
    'Test')

WebUI.click(findTestObject('Object Repository/NBA/Contact Us Anonymous User/Page_- Contact Us/div_Type a value'))

WebUI.setText(findTestObject('Object Repository/NBA/Contact Us Anonymous User/Page_- Contact Us/textarea__tar.applicationdetails.requestdetails'), 
    'Please contact me')

WebUI.click(findTestObject('NBA/Contact Us Anonymous User/Page_- Contact Us/span__input-control-img_1'))

WebUI.click(findTestObject('Object Repository/NBA/Contact Us Anonymous User/Page_- Contact Us/a_Submit'))

WebUI.click(findTestObject('Object Repository/NBA/Contact Us Anonymous User/Page_- Contact Us/a_OK'))

WebUI.closeBrowser()

