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

WebUI.navigateToUrl('https://devb2c.astraotoparts.co.id/')

WebUI.click(findTestObject('Object Repository/Test Random/Page_AOP/button_Aktifkan lain kali saja'))

WebUI.doubleClick(findTestObject('Object Repository/Test Random/Page_AOP/div_BerandaKategoriLacakMasuk'))

WebUI.click(findTestObject('Object Repository/Test Random/Page_AOP/div_Suku Cadang_sc-1hxhqap-3 btnGPj'))

WebUI.click(findTestObject('Object Repository/Test Random/Page_AOP/svg'))

WebUI.click(findTestObject('Object Repository/Test Random/Page_AOP/div_Lihat Semua_sc-1mpuug8-0 bJwxGO'))

WebUI.closeBrowser()

