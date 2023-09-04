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

WebUI.navigateToUrl('https://dk2.bssdev.local/K2RestWeb')

WebUI.setText(findTestObject('Object Repository/Korinas Objects/Page_Username  Password Sign In/input_User Name_UserName'), 
    'Pan11')

WebUI.setEncryptedText(findTestObject('Object Repository/Korinas Objects/Page_Username  Password Sign In/input_Password_Password'), 
    'OI4wGey0YVbVjMi3dqxIYQ==')

WebUI.click(findTestObject('Object Repository/Korinas Objects/Page_Username  Password Sign In/input_Remember me_btn btn-brandColor'))

WebUI.click(findTestObject('Object Repository/Korinas Objects/Page_NBA/div_Business Dashboard_line line-2'))

WebUI.click(findTestObject('Object Repository/Korinas Objects/Page_NBA/div_Notifications'))

WebUI.doubleClick(findTestObject('Object Repository/Korinas Objects/Page_NBA/td_07042023'))

WebUI.closeBrowser()

