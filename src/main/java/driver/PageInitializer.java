package driver;

import org.openqa.selenium.interactions.Actions;

import pages.CommonPage;
import pages.CommonPage_BAU_201;

import pages.CommonPage_BAU_TC205;

import pages.CommonPageTaylor;
import pages.ContactUsPage;
import pages.CommonpageBAU_TC302;
import pages.CommonPage_BAU_TC207;
import pages.CommonPage_BAU_TC305;
import pages.CommonPage_TC203;


public class PageInitializer extends BaseClass {

	public static CommonPage cP;

     
	public static CommonPage_BAU_201 cP201;
	

	public static CommonPage_BAU_TC205 cPTC205;

	public static CommonPageTaylor cPT;

	public static ContactUsPage cU;

	public static CommonpageBAU_TC302 cPG;

	public static CommonPage_BAU_TC207 case1;

	public static CommonPage_BAU_TC305 Cpb;
	
	public static CommonPage_TC203 cP203;


	public static void initialize() {

		cP = new CommonPage();
		cP201 = new CommonPage_BAU_201();

		cPTC205 = new CommonPage_BAU_TC205();


		cPT = new CommonPageTaylor();

		cU = new ContactUsPage();

		case1 = new CommonPage_BAU_TC207();
		
		cPG = new CommonpageBAU_TC302();

		Cpb = new CommonPage_BAU_TC305();
		
		cP203 = new CommonPage_TC203();


	}
}
