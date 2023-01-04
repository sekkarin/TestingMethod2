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

WebUI.navigateToUrl('http://localhost/research-form/form2.html')

WebUI.setText(findTestObject('Object Repository/Page_Form2/input_Text1_text1'), 'Hello')

WebUI.click(findTestObject('Object Repository/Page_Form2/input_Text1_text1'))

WebUI.click(findTestObject('Object Repository/Page_Form2/form_Text1            Text2            Text_4386c5'))

WebUI.setText(findTestObject('Object Repository/Page_Form2/input_Text2_text2'), 'Hello')

WebUI.setText(findTestObject('Object Repository/Page_Form2/input_Text3_text3'), 'Hello')

WebUI.setText(findTestObject('Object Repository/Page_Form2/input_Text4_text4'), 'Hello')

WebUI.setText(findTestObject('Object Repository/Page_Form2/input_Text5_text5'), 'Hello')

WebUI.setText(findTestObject('Object Repository/Page_Form2/input_Text6_text6'), 'Hello')

WebUI.setText(findTestObject('Object Repository/Page_Form2/input_Text7_text7'), 'Hello')

WebUI.setText(findTestObject('Object Repository/Page_Form2/input_Text8_text8'), 'Hello')

WebUI.setText(findTestObject('Object Repository/Page_Form2/input_Text9_text9'), 'Hello')

WebUI.setText(findTestObject('Object Repository/Page_Form2/input_Text10_text10'), 'Hello')

WebUI.click(findTestObject('Object Repository/Page_Form2/input_Text10_checkbox1'))

WebUI.click(findTestObject('Object Repository/Page_Form2/label_Checkbox8'))

WebUI.click(findTestObject('Object Repository/Page_Form2/input_Checkbox7_checkbox8'))

WebUI.click(findTestObject('Object Repository/Page_Form2/input_Checkbox5_checkbox6'))

WebUI.click(findTestObject('Object Repository/Page_Form2/input_Checkbox9_checkbox10'))

WebUI.click(findTestObject('Object Repository/Page_Form2/form_Text1            Text2            Text_4386c5'))

WebUI.click(findTestObject('Object Repository/Page_Form2/input_Radio2_radio3'))

WebUI.click(findTestObject('Object Repository/Page_Form2/input_Radio3_radio4'))

WebUI.click(findTestObject('Object Repository/Page_Form2/input_Radio4_radio5'))

WebUI.click(findTestObject('Object Repository/Page_Form2/input_Radio8_radio9'))

WebUI.click(findTestObject('Object Repository/Page_Form2/input_Radio7_radio8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Form2/select_value1          value2          valu_9f7bd8'), 
    'value2', true)

WebUI.click(findTestObject('Object Repository/Page_Form2/html_Form2katalonfont-familymonospacefont-s_efc8e8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Form2/select_value1          value2          valu_9f7bd8_1'), 
    'value3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Form2/select_value1          value2          valu_9f7bd8_1_2'), 
    'value4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Form2/select_value1          value2          valu_9f7bd8_1_2_3'), 
    'value4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Form2/select_value1          value2          valu_9f7bd8_1_2_3_4'), 
    'value3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Form2/select_value1          value2          valu_9f7bd8_1_2_3_4_5'), 
    'value2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Form2/select_value1          value2          valu_9f7bd8_1_2_3_4_5_6'), 
    'value3', true)

WebUI.click(findTestObject('Object Repository/Page_Form2/html_Form2katalonfont-familymonospacefont-s_efc8e8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Form2/select_value1          value2          valu_9f7bd8_1_2_3_4_5_6_7'), 
    'value2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Form2/select_value1          value2          valu_9f7bd8_1_2_3_4_5_6_7_8'), 
    'value3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Form2/select_value1          value2          valu_9f7bd8_1_2_3_4_5_6_7_8_9'), 
    'value3', true)

WebUI.closeBrowser()

