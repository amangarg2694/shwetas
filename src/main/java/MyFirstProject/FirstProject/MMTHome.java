package MyFirstProject.FirstProject;



import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MMTHome {

	public WebDriver ldriver;
	
	public MMTHome(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="fromCity")
	@CacheLookup
	WebElement fromCity;
	
	@FindBy(id="toCity")
	@CacheLookup
	WebElement toCity;
	
	@FindBy(id="departure")
	@CacheLookup
	WebElement Ddate;
	
	@FindBy(id="return")
	@CacheLookup
	WebElement Rdate;
	
	@FindBy(id="travellers")
	@CacheLookup
	WebElement travellers;
	
	@FindBy(className="primaryBtn btnApply pushRight ")
	@CacheLookup
	WebElement ApplyButton;
	
	@FindBy(className="primaryBtn font24 latoBold widgetSearchBtn ")
	@CacheLookup
	WebElement SearchButton;
	
	@FindBy(className="DayPicker-Body")
	@CacheLookup
	WebElement datepicker;
	
	@FindBy(className="DayPicker-NavButton DayPicker-NavButton--next")
	@CacheLookup
	WebElement NavButton;
	
	@FindBy(xpath="//div[@class='DayPicker-Body']//div//div//div[1]")
	@CacheLookup
	WebElement Pdate;
	
	//enter from city
	
	public void EnterfromCity(String fcity)
	{
		fromCity.clear();
		fromCity.sendKeys(fcity);
	}
	
	public void EntertoCity(String tcity)
	{
		toCity.clear();
		toCity.sendKeys(tcity);
	}
	
	public void Departuredate(int Ddate)
	{  
		//Manage Calendar
		Calendar date = new GregorianCalendar(2020, Calendar.NOVEMBER, Ddate); 
		Calendar today = new GregorianCalendar();
		int monthsDiff1 = date.get(Calendar.MONTH) - today.get(Calendar.MONTH) ;
		for(int i=1;i<monthsDiff1;i++) {
		NavButton.click();
		}
		//Managing Calendar 1
		List<WebElement> allDates = Pdate;
	    for(WebElement ele : allDates) {
	    	try {
	    		String date = ele.getText();
	        		if(date.contains("17")) {
	    	    	
	    			ele.click();
	    	    }
	}
	
	}
	
