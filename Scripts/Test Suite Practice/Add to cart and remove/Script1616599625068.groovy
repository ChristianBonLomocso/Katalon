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

int ItemCounter = 0

WebUI.click(findTestObject('Test Suite Practice/Add to cart and Remove/Red tshirt add 2cart'))

(CartItems[ItemCounter]) = WebUI.getText(findTestObject('Test Suite Practice/Add to cart and Remove/Red tshirt title'))

ItemCounter++

CustomKeywords.'com.saucelabs.test.CartCounter.ItemCounter'(ItemCounter)

WebUI.click(findTestObject('Test Suite Practice/Add to cart and Remove/Onesie add 2 cart'))

(CartItems[ItemCounter]) = WebUI.getText(findTestObject('Test Suite Practice/Add to cart and Remove/Onesie title'))

ItemCounter++

CustomKeywords.'com.saucelabs.test.CartCounter.ItemCounter'(ItemCounter)

WebUI.click(findTestObject('Test Suite Practice/Add to cart and Remove/Bike light add 2 cart'))

(CartItems[ItemCounter]) = WebUI.getText(findTestObject('Test Suite Practice/Add to cart and Remove/Bike light title'))

ItemCounter++

CustomKeywords.'com.saucelabs.test.CartCounter.ItemCounter'(ItemCounter)

WebUI.click(findTestObject('Test Suite Practice/Add to cart and Remove/jacket add 2 cart'))

(CartItems[ItemCounter]) = WebUI.getText(findTestObject('Test Suite Practice/Add to cart and Remove/jacket title'))

ItemCounter++

CustomKeywords.'com.saucelabs.test.CartCounter.ItemCounter'(ItemCounter)

WebUI.delay(3)

WebUI.click(findTestObject('Test Suite Practice/Add to cart and Remove/add 2 cart icon'))

WebUI.verifyElementPresent(findTestObject('Test Suite Practice/Add to cart and Remove/Red tshirt title'), 0)

WebUI.verifyElementPresent(findTestObject('Test Suite Practice/Add to cart and Remove/Onesie title'), 0)

WebUI.verifyElementPresent(findTestObject('Test Suite Practice/Add to cart and Remove/Bike light title'), 0)

WebUI.verifyElementPresent(findTestObject('Test Suite Practice/Add to cart and Remove/jacket title'), 0)

WebUI.delay(4)

WebUI.click(findTestObject('Test Suite Practice/Add to cart and Remove/Red tshirt cart rmve btn'))

CustomKeywords.'com.saucelabs.test.CartCounter.RemoveItem'(CartItems[0], CartItems)

ItemCounter--

CustomKeywords.'com.saucelabs.test.CartCounter.ItemCounter'(ItemCounter)

println(((((((('\n' + (CartItems[0])) + '\n') + (CartItems[1])) + '\n') + (CartItems[2])) + '\n') + (CartItems[3])) + '\n\n')

WebUI.delay(3)

WebUI.click(findTestObject('Test Suite Practice/Add to cart and Remove/Continue Shopping button'))

not_run: WebUI.verifyElementNotPresent(findTestObject('null'), 0)

not_run: WebUI.click(findTestObject('Test Suite Practice/Add to cart and Remove/Onesie remove btn'))

not_run: ItemCounter--

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.verifyElementNotPresent(findTestObject('Test Suite Practice/Add to cart and Remove/NoOf items indicator'), 
    0)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('null'))

not_run: ItemCounter++

not_run: CustomKeywords.'com.saucelabs.test.CartCounter.ItemCounter'(ItemCounter)

not_run: WebUI.click(findTestObject('Test Suite Practice/Add to cart and Remove/add 2 cart icon'))

