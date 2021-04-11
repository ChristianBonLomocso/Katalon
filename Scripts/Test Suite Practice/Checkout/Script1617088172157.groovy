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

WebUI.click(findTestObject('Test Suite Practice/Checkout/checkout btn'))

WebUI.setText(findTestObject('Test Suite Practice/Checkout/FN field'), 'Firstname')

WebUI.setText(findTestObject('Test Suite Practice/Checkout/LField'), 'lastname')

WebUI.setText(findTestObject('Test Suite Practice/Checkout/Postal field'), '123')

WebUI.click(findTestObject('Test Suite Practice/Checkout/Cout cancel btn'))

WebUI.click(findTestObject('Test Suite Practice/Checkout/checkout btn'))

text = WebUI.getAttribute(findTestObject('Test Suite Practice/Checkout/FN field'), 'value')

CustomKeywords.'com.saucelabs.test.CartCounter.EmtyFieldChecker'(text)

text = WebUI.getAttribute(findTestObject('Test Suite Practice/Checkout/LField'), 'value')

CustomKeywords.'com.saucelabs.test.CartCounter.EmtyFieldChecker'(text)

text = WebUI.getAttribute(findTestObject('Test Suite Practice/Checkout/Postal field'), 'value')

CustomKeywords.'com.saucelabs.test.CartCounter.EmtyFieldChecker'(text)

WebUI.setText(findTestObject('Test Suite Practice/Checkout/FN field'), 'Firstname')

WebUI.setText(findTestObject('Test Suite Practice/Checkout/Postal field'), '123')

WebUI.click(findTestObject('Test Suite Practice/Checkout/Cout continue btn'))

WebUI.verifyElementPresent(findTestObject('Test Suite Practice/Checkout/error message'), 0)

WebUI.setText(findTestObject('Test Suite Practice/Checkout/LField'), 'lastname')

WebUI.delay(3)

WebUI.click(findTestObject('Test Suite Practice/Checkout/Cout continue btn'))

WebUI.click(findTestObject('Test Suite Practice/Checkout/finish btn'))

