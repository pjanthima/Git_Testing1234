package driver;

import pages.CommonPage;
import pages.CommonpageBAU_TC302;

import pages.CommonPage_BAU_TC207;

import pages.CommonPage_BAU_TC305;
 

public class PageInitializer extends BaseClass {

	public static CommonPage cP;
    public static CommonpageBAU_TC302 cPG;

	public static CommonPage_BAU_TC207 case1;
	

	public static void initialize() {
		cP = new CommonPage();
		case1 = new CommonPage_BAU_TC207();

	public static CommonPage_BAU_TC305 Cpb;

	public static void initialize() {
		cP = new CommonPage();

	   
		cPG = new CommonpageBAU_TC302();

		Cpb= new CommonPage_BAU_TC305();


	}
}
