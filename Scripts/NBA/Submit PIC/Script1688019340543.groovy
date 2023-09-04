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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.callTestCase(findTestCase('NBA/Login Online Portal - Desktop Device'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/div_Business Dashboard_line line-2'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_New Application'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_New Application'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/div_Choose license type'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/div_Premise LicensePerson in ChargeCreate A_2ac953'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/div_Business Dashboard_line line-3'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Person in Charge'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Create Application'))

WebUI.scrollToElement(findTestObject('NBA/PIC/Page_NBA/a_Save'), 3)

WebUI.waitForElementClickable(findTestObject('NBA/PIC/Page_NBA/a_Save'), 3)

WebUI.click(findTestObject('NBA/PIC/Page_NBA/a_Save'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_OK'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/div_Pan11_line line-3'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Person In Charge (1)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Person In Charge Details'))

WebUI.scrollToElement(findTestObject('NBA/PIC/Page_NBA/input__txt.picdetails.firstname'), 3)

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.picdetails.firstname'), 'Albert')

WebUI.scrollToElement(findTestObject('NBA/PIC/Page_NBA/input__txt.picdetails.lastname'), 3)

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.picdetails.lastname'), 'Einstein')

WebUI.scrollToElement(findTestObject('NBA/PIC/Page_NBA/input_Email_txt.picdetails.email'), 3)

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input_Email_txt.picdetails.email'), 'albert@test.com')

WebUI.scrollToElement(findTestObject('NBA/PIC/Page_NBA/input__617b7581-a7a0-481a-bb65-888c482e0116_b49dce'), 3)

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__617b7581-a7a0-481a-bb65-888c482e0116_b49dce'), '01/01/2000')

WebUI.scrollToElement(findTestObject('NBA/PIC/Page_NBA/span__input-control-img'), 3)

WebUI.waitForElementClickable(findTestObject('NBA/PIC/Page_NBA/span__input-control-img'), 3)

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span__input-control-img'))

WebUI.waitForElementClickable(findTestObject('NBA/PIC/Page_NBA/span_Passport Number'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Passport Number'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('NBA/PIC/Page_NBA/input__txt.picdetails.passportnumber'), 3)

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.picdetails.passportnumber'), '231232143')

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_GERMANY'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('NBA/PIC/Page_NBA/a_01'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_31'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Alien Registration Number'))

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input_Alien Registration Number_txt.picdeta_5acc35'), '434234234')

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_01'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_31'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('NBA/PIC/Page_NBA/a_Save (1)'), 3)

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_Save (1)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_OK_1'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/div_Pan11_header__main-nav--hamburger'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Residence Addresses'))

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input_Select Address_txt.resaddress.postalcode'), '2121')

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.resaddress.address'), 'Test Str. 1')

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a__input-control  styling-font'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Larnaka'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a__input-control  styling-font'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Agia Anna'))

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.resaddress.telephone'), '+357-22-112233')

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.resaddress.mobilephone'), '+357-99-112233')

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_Save (2)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_OK (2)'))

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.resaddress.mobilephone'), '+357-99112233')

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.resaddress.telephone'), '+357-22112233')

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Documents  Documents VisibilityUpdateO_a95a02'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Please record the Residence Address of_9e7b7d'))

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.resaddress.telephone'), '')

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Telephone'))

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.resaddress.mobilephone'), '+357-99112-233')

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Mobile Phone'))

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.resaddress.mobilephone'), '+357-99-112-233')

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.resaddress.mobilephone'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Please record the Residence Address of_9e7b7d'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Mobile Phone'))

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.resaddress.telephone'), '+357-22-112-233')

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_Save (2)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_OK_1 (1)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/div_Business Dashboard_line line-2'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Employment Details'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_ (1)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_12'))

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.empdetails.socialsecuritynumber'), '23423423')

WebUI.setText(findTestObject('Object Repository/NBA/PIC/Page_NBA/input__txt.empdetails.taxidentificationnumber'), '546456456')

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_OK (3)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/div_Pan11_header__main-nav--hamburger'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Criminal Record'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Yes'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_ (2)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_29'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Add'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/label_'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Add'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/label_'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Add'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/label_'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Add'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/label_'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_Save (3)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_OK (4)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Add'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/label_'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_Save (3)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_OK_1 (2)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/div_Business Dashboard_line line-2'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/div_Processing of Personal Data'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span__input-control-img (1)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span__input-control-img_1'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span__input-control-img_1_2'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/label__input-control checkbox'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span__input-control-img_1_2_3'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_Save (4)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/a_OK (5)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/div_Pan11_header__main-nav--hamburger'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/div_Check Application Status'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Submit'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Yes (1)'))

WebUI.click(findTestObject('Object Repository/NBA/PIC/Page_NBA/span_Ok'))

WebUI.closeBrowser()

