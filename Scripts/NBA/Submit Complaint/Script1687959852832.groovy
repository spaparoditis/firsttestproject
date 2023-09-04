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

WebUI.callTestCase(findTestCase('NBA/Login Online Portal - Desktop Device'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('NBA/Complaint/Page_NBA/div_Business Dashboard_header__main-nav--hamburger'), 3)

WebUI.click(findTestObject('Object Repository/NBA/Complaint/Page_NBA/div_Business Dashboard_header__main-nav--hamburger'))

WebUI.click(findTestObject('Object Repository/NBA/Complaint/Page_NBA/div_Complaints'))

WebUI.click(findTestObject('Object Repository/NBA/Complaint/Page_NBA/span_New Complaint'))

WebUI.click(findTestObject('NBA/Complaint/Page_NBA/div_Alpha Bet'))

WebUI.click(findTestObject('Object Repository/NBA/Complaint/Page_NBA/a_Select an item'))

WebUI.click(findTestObject('Object Repository/NBA/Complaint/Page_NBA/span_Online Betting'))

WebUI.click(findTestObject('Object Repository/NBA/Complaint/Page_NBA/span_Select an item'))

WebUI.click(findTestObject('Object Repository/NBA/Complaint/Page_NBA/a_BETATHLON LTD (B308)'))

WebUI.click(findTestObject('Object Repository/NBA/Complaint/Page_NBA/span_Select an item'))

WebUI.click(findTestObject('Object Repository/NBA/Complaint/Page_NBA/span_Marketing and Advertising'))

WebUI.click(findTestObject('Object Repository/NBA/Complaint/Page_NBA/span_Select an item'))

WebUI.click(findTestObject('Object Repository/NBA/Complaint/Page_NBA/span_Promoting to Children'))

WebUI.setText(findTestObject('Object Repository/NBA/Complaint/Page_NBA/textarea__tar.applicationdetails.regardingd_7ceb44'), 
    'Test')

WebUI.click(findTestObject('Object Repository/NBA/Complaint/Page_NBA/span__input-control-img'))

WebUI.click(findTestObject('Object Repository/NBA/Complaint/Page_NBA/a_Submit'))

WebUI.click(findTestObject('Object Repository/NBA/Complaint/Page_NBA/a_OK'))

WebUI.closeBrowser()

