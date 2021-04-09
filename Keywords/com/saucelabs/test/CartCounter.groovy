package com.saucelabs.test

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable


public class CartCounter {

	@Keyword
	def ItemCounter(int ctr) {
		String var = String.valueOf(ctr)

		//		println("\n the value is: \n"+var)

		if(WebUI.getText(findTestObject('Test Suite Practice/Add to cart and Remove/NoOf items indicator')) == var) {
			KeywordUtil.markPassed("Value is the same .................")
		}
		else {
			KeywordUtil.markFailed("Value is not the same ......................")
		}
	}
	// https://medium.com/katalon-studio/how-to-create-a-custom-keyword-using-katalon-studio-4e4849b68eb6
	// https://docs.katalon.com/katalon-studio/docs/failure-handling.html
	@Keyword
	def RemoveItem(String title,ArrayList CartItems)
	{
		int ctr = 0
		int length = CartItems.size()

		while(CartItems[ctr] != null)
		{
			if(CartItems[ctr] == title)
			{
				CartItems.remove(ctr)
				KeywordUtil.markPassed("String is the same .................")
				return
			}
			else
			{
				ctr++
			}
		}
		KeywordUtil.markFailed("String is not the same .................")
	}
	/*	
	 @Keyword
	 def clickElement(TestObject to) {
	 try {
	 WebElement element = WebUiBuiltInKeywords.findWebElement(to);
	 KeywordUtil.logInfo("Clicking element")
	 element.click()
	 KeywordUtil.markPassed("Element has been clicked")
	 } catch (WebElementNotFoundException e) {
	 KeywordUtil.markFailed("Element not found")
	 } catch (Exception e) {
	 KeywordUtil.markFailed("Fail to click on element")
	 } */
}
