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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Login_Page/input_standard_userlocked_out_userproblem_u_db77ac'), 
    'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/Login_Page/input_standard_userlocked_out_userproblem_u_3423e9'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Login_Page/input_standard_userlocked_out_userproblem_u_0dff71'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Add_To_Cart/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Add_To_Cart/button_Add to cart_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Add_To_Cart/button_Add to cart_1_2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/Verify_Elements/3_Item_in_Cart'), '3')

WebUI.click(findTestObject('Page_Swag Labs/Verify_Elements/3_Item_in_Cart'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Cart_Page/button_Remove'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/Verify_Elements/2_Item_in_Cart'), '2')

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Page_Swag Labs/Cart_Page/button_Remove_1'), 0)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Cart_Page/button_Remove_1'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/Verify_Elements/1_Item_in_Cart'), '1')

WebUI.delay(2)

WebUI.closeBrowser()

