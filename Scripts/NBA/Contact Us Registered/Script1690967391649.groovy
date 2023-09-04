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

WebUI.scrollToElement(findTestObject('Contact Us Registered/Page_NBA/a_Contact Us'), 3)

WebUI.click(findTestObject('Object Repository/Contact Us Registered/Page_NBA/a_Contact Us'))

WebUI.scrollToElement(findTestObject('Contact Us Registered/Page_NBA/span_Suggestion'), 3)

WebUI.waitForElementClickable(findTestObject('Contact Us Registered/Page_NBA/span_Suggestion'), 3)

WebUI.click(findTestObject('Object Repository/Contact Us Registered/Page_NBA/span_Suggestion'))

WebUI.setText(findTestObject('Object Repository/Contact Us Registered/Page_NBA/input_afterasteriks_txt.applicationdetails._8e11e1'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Contact Us Registered/Page_NBA/div_Type a value'))

WebUI.setText(findTestObject('Object Repository/Contact Us Registered/Page_NBA/textarea_afterasteriks_tar.applicationdetai_39adf3'), 
    'Please contact me')

WebUI.click(findTestObject('Object Repository/Contact Us Registered/Page_NBA/span_afterasteriks_Cell Cell668'))

WebUI.click(findTestObject('Object Repository/Contact Us Registered/Page_NBA/span_afterasteriks_Cell Cell668'))

WebUI.click(findTestObject('Object Repository/Contact Us Registered/Page_NBA/span_afterasteriks_Cell Cell668'))

WebUI.click(findTestObject('Object Repository/Contact Us Registered/Page_NBA/span_afterasteriks_input-control-img'))

WebUI.click(findTestObject('Object Repository/Contact Us Registered/Page_NBA/a_Submit'))

WebUI.waitForElementPresent(findTestObject('Contact Us Registered/Page_NBA/div_Thank you'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Contact Us Registered/Page_NBA/div_Thank you'), 'Thank you', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Contact Us Registered/Page_NBA/a_OK'), 3)

WebUI.click(findTestObject('Object Repository/Contact Us Registered/Page_NBA/a_OK'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

