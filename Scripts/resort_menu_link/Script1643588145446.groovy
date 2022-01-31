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

WebUI.navigateToUrl('https://dev2.venetianlasvegas.com/meetings')

WebUI.click(findTestObject('Object Repository/resort_objects/Page_Venetian meets the Clean Code  The Ven_329867/a_OUR RESORT'))

WebUI.click(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/p_Luxuriate'))

WebUI.click(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/p_Revel'))

WebUI.click(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/p_Relax'))

WebUI.click(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/span_Dining Gallery'))

WebUI.click(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/span_Entertainment'))

WebUI.click(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/span_Entertainment Gallery'))

WebUI.verifyElementPresent(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/span_Entertainment Gallery'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/span_Shopping'), 
    0)

WebUI.click(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/span_Shopping Gallery'))

WebUI.click(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/span_Shopping Gallery'))

WebUI.verifyElementPresent(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/span_Shopping Gallery'), 
    0)

WebUI.click(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/span_Canyon Ranch'))

WebUI.click(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/span_Canyon Ranch'))

WebUI.verifyElementPresent(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/span_Canyon Ranch'), 
    0)

WebUI.click(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/span_Spa Gallery'))

WebUI.verifyElementPresent(findTestObject('Object Repository/resort_objects/Page_Experience The Venetian  Venetian Meet_06f7c1/span_Spa Gallery'), 
    0)

WebUI.closeBrowser()

