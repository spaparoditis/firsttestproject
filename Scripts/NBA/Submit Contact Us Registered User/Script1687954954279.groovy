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

WebUI.scrollToElement(findTestObject('NBA/Contact Us Registered User/Page_NBA/a_Contact Us'), 3)

WebUI.click(findTestObject('Object Repository/NBA/Contact Us Registered User/Page_NBA/a_Contact Us'))

WebUI.scrollToElement(findTestObject('NBA/Contact Us Registered User/Page_NBA/span_Suggestion'), 3)

WebUI.click(findTestObject('Object Repository/NBA/Contact Us Registered User/Page_NBA/span_Suggestion'))

WebUI.setText(findTestObject('Object Repository/NBA/Contact Us Registered User/Page_NBA/input__txt.applicationdetails.requestsubject'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/NBA/Contact Us Registered User/Page_NBA/textarea__tar.applicationdetails.requestdetails'), 
    'Please contact me')

WebUI.scrollToElement(findTestObject('NBA/Contact Us Registered User/Page_NBA/span__input-control-img'), 3)

WebUI.click(findTestObject('Object Repository/NBA/Contact Us Registered User/Page_NBA/span__input-control-img'))

WebUI.click(findTestObject('Object Repository/NBA/Contact Us Registered User/Page_NBA/a_Submit'))

WebUI.waitForElementPresent(findTestObject('NBA/Contact Us Registered User/Page_NBA/div_Thank you'), 3)

WebUI.click(findTestObject('Object Repository/NBA/Contact Us Registered User/Page_NBA/a_OK'))

WebUI.closeBrowser()

