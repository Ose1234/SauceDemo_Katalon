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

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/Verify_Elements/div_Sauce Labs Backpackcarry.allTheThings()_53b398'))

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/Verify_Elements/div_Sauce Labs Bike LightA red light isnt t_13f308'))

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/Verify_Elements/div_Sauce Labs Bolt T-ShirtGet your testing_096930'))

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/Verify_Elements/div_Sauce Labs Fleece JacketIts not every d_e9a1b2'))

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/Verify_Elements/div_Sauce Labs OnesieRib snap infant onesie_8fcfdc'))

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/Verify_Elements/div_Test.allTheThings() T-Shirt (Red)This c_7d6811'))

WebUI.click(findTestObject('Page_Swag Labs/List_Filter/span_Name (A to Z)Name (A to Z)Name (Z to A_3f2346'))

WebUI.click(findTestObject('Page_Swag Labs/List_Filter/select_Name (A to Z)Name (Z to A)Price (low_f7e90a'))

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/List_Filter/select_Name (A to Z)Name (Z to A)Price (low_f7e90a'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/Verify_Elements/div_7.99'))

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/Verify_Elements/div_49.99'))

WebUI.closeBrowser()

