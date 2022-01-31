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

WebUI.click(findTestObject('Object Repository/services_objects/Page_Venetian meets the Clean Code  The Ven_329867/a_SERVICES'))

WebUI.click(findTestObject('Object Repository/services_objects/Page_Venetian meets the Clean Code  The Ven_329867/a_Culinary'))

WebUI.click(findTestObject('Object Repository/services_objects/Page_Venetian Event Catering  Special Event_7cd712/a_SERVICES'))

WebUI.click(findTestObject('Object Repository/services_objects/Page_Venetian Event Catering  Special Event_7cd712/a_Technical'))

WebUI.click(findTestObject('Object Repository/services_objects/Page_Event Audio Visual Services Las Vegas _7e5fac/a_SERVICES'))

WebUI.click(findTestObject('Object Repository/services_objects/Page_Event Audio Visual Services Las Vegas _7e5fac/a_Floral Creations'))

WebUI.click(findTestObject('Object Repository/services_objects/Page_Florist for Las Vegas Events  The Vene_768f3f/a_SERVICES'))

WebUI.click(findTestObject('Object Repository/services_objects/Page_Florist for Las Vegas Events  The Vene_768f3f/a_Branding Opportunities'))

WebUI.closeBrowser()

