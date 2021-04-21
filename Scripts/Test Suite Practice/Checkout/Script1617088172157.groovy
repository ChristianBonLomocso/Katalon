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

WebUI.setText(findTestObject('Test Suite Practice/Checkout/Fn Field'), 'Firstname')

WebUI.setText(findTestObject('Test Suite Practice/Checkout/Ln Field'), 'lastname')

WebUI.setText(findTestObject('Test Suite Practice/Checkout/Postal Field'), '123')

WebUI.click(findTestObject('Test Suite Practice/Checkout/canel btn'))

WebUI.click(findTestObject('Test Suite Practice/Checkout/checkout btn'))

text = WebUI.getAttribute(findTestObject('Test Suite Practice/Checkout/Fn Field'), 'value')

CustomKeywords.'com.saucelabs.test.CartCounter.EmtyFieldChecker'(text)

text = WebUI.getAttribute(findTestObject('Test Suite Practice/Checkout/Ln Field'), 'value')

CustomKeywords.'com.saucelabs.test.CartCounter.EmtyFieldChecker'(text)

text = WebUI.getAttribute(findTestObject('Test Suite Practice/Checkout/Postal Field'), 'value')

CustomKeywords.'com.saucelabs.test.CartCounter.EmtyFieldChecker'(text)

WebUI.setText(findTestObject('Test Suite Practice/Checkout/Fn Field'), 'Firstname')

WebUI.setText(findTestObject('Test Suite Practice/Checkout/Postal Field'), '123')

WebUI.click(findTestObject('Test Suite Practice/Checkout/C.out Continue Btn'))

WebUI.verifyElementPresent(findTestObject('Test Suite Practice/Checkout/Error message'), 0)

WebUI.setText(findTestObject('Test Suite Practice/Checkout/Ln Field'), 'lastname')

WebUI.delay(3)

WebUI.click(findTestObject('Test Suite Practice/Checkout/C.out Continue Btn'))

WebUI.click(findTestObject('Test Suite Practice/Checkout/Finsih Btn'))

