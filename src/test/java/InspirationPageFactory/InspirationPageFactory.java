package InspirationPageFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InspirationPageFactory {

	WebDriver driver;
	WebDriverWait wait;
	Actions act;
	JavascriptExecutor js;
	Robot robot;

	public InspirationPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ========================================== Xpath for locating the element =========================================
	
	//----------------------------Scenario 1--------------------------
	
	@FindBy(xpath = "//a[@data-target=\"#INSPIRATION\"]//span[1]")
	WebElement inspiration;

	@FindBy(xpath = "//a[@href=\"https://www.asianpaints.com/inspiration/ideas/colour-inspiration.html\"][text()=\"Gallery\"]")
	WebElement gallery;

	@FindBy(xpath = "//img[@alt=\"Exterior\"]")
	WebElement exterior;

	@FindBy(xpath = "//span[@class=\"form-global__custom-label-text align-middle d-inline-block\"]")
	WebElement room;

	@FindBy(xpath = "//fieldset[@class=\"collapsible-group\"]/child::legend[text()=\"Category\"]")
	WebElement category;

	@FindBy(xpath = "//fieldset[@class=\"collapsible-group\"][2]/child::div[@class=\"js-items-collapsible-group\"]/child::label[3]/child::span[2]")
	WebElement wallpaper;

	
	//------------------------------Scenario 2--------------------------
	
	@FindBy(xpath="//a[@data-target=\"#INSPIRATION\"]//span[1]")
	WebElement inspiration2;
	
	@FindBy(xpath="//a[@href=\"https://www.asianpaints.com/where-the-heart-is/season-7.html\"]")
	WebElement heart;
	
	@FindBy(id="enquire-name")
	WebElement name;
	
	@FindBy(id="enquire-mobile")
	WebElement mobileNo;
	
	@FindBy(css="#enquire-pincode")
	WebElement pin;
	
	@FindBy(css="#enquire-email")
	WebElement email;
	
	@FindBy(xpath="//button[@class=\"ctaText enquireForm--step-1-submit track_form_submit animated-arrow-btn yellow-gradient\"]")
	WebElement button;
	
	@FindBy(xpath="//div[@class=\"thank-you-left-content\"]//h2")
	WebElement text;
	
	
	//------------------------------Scenario 3--------------------------
	
	@FindBy(xpath="//a[@data-target=\"#INSPIRATION\"]//span[1]")
	WebElement inspiration3;
	
	@FindBy(xpath="//a[@href=\"https://www.asianpaints.com/where-the-heart-is/season-7.html\"]")
	WebElement heart3;
	
	@FindBy(css="#enquire-name")
	WebElement name3;
	
	@FindBy(css="#enquire-mobile")
	WebElement mobileNo3;
	
	@FindBy(id="enquire-pincode")
	WebElement pin3;
	
	@FindBy(id="enquire-email")
	WebElement email3;
	
	@FindBy(xpath="//button[@class=\"ctaText enquireForm--step-1-submit track_form_submit animated-arrow-btn yellow-gradient\"]")
	WebElement button3;
	
	@FindBy(xpath="//div[@class=\"form-global__field-message form-text-input__field-message\"]")
	WebElement error;
	
	
	//----------------------------Scenario 4--------------------------
	
	@FindBy(xpath="//a[@data-target=\"#INSPIRATION\"]//span[1]")
	WebElement inspiration4;
	
	@FindBy(xpath="//a[@href=\"https://www.asianpaints.com/colour-next.html\"][text()=\"Colour Trends\"]")
	WebElement trends;
	
	@FindBy(xpath="//a[@href=\"https://www.asianpaints.com/colour-next/forecast-report.html\"]")
	WebElement forecast;
	
	@FindBy(xpath="//a[@class=\"ctaText trackCTA\"]")
	WebElement report;
	
	@FindBy(xpath="(//input[@placeholder=\"Enter Email\"])[1]")
	WebElement email4;
	
	@FindBy(xpath="//button[@class=\"signup-ctaText track_email_subscribe\"]")
	WebElement button4;
	
	@FindBy(xpath="//div[@class=\"signupmodal signup-subscribeOpen\"]//p")
	WebElement message;
	
	
	//------------------------------Scenario 5--------------------------
	
	@FindBy(xpath="//a[@data-target=\"#INSPIRATION\"]//span[1]")
	WebElement inspiration5;
	
	@FindBy(xpath="(//a[@href=\"https://www.asianpaints.com/guides.html\"][text()=\"Guides\"])[2]")
	WebElement guides;
	
	@FindBy(xpath="//div[@class=\"divisioncards--title\"][text()=\"Kitchen\"]")
	WebElement kitchen;
	
	@FindBy(xpath="//img[@src=\"/content/dam/sleek-final/Home/userCall.png\"]")
	WebElement button5;
	
	@FindBy(xpath="//a[@href=\"https://www.sleekworld.com/complaints.html\"]//span")
	WebElement register;
	
	@FindBy(id="nameBox1")
	WebElement name5;
	
	@FindBy(id="mailid")
	WebElement email5;
	
	@FindBy(css="#number")
	WebElement mobile;
	
	@FindBy(css="#selectcity")
	WebElement city;
	
	@FindBy(id="selectcomplaints")
	WebElement nature;
	
	@FindBy(xpath="//textarea[@placeholder=\"Specify Reason  of Complaint\"]")
	WebElement reason;
	
	@FindBy(xpath="//div[@class=\"globlebtn enqbtn\"]")
	WebElement submit;
	
	@FindBy(xpath="//span[text()=\"Our representative will contact you within one working day. Our toll-free helpline is 1800 2120 500.\"]")
	WebElement thankyou;
	
	
	//-----------------------------Scenario 6--------------------------
	
	@FindBy(xpath="(//a[@href=\"https://www.sleekworld.com/inspiration.html\"])[1]")
	WebElement inspiration6;
	
	@FindBy(xpath="//select[@class=\"classic\"]")
	WebElement select;
	
	@FindBy(xpath="//a[@href=\"https://www.sleekworld.com/inspiration/videos.html\"]")
	WebElement button6;
	
	@FindBy(xpath="(//a[@class=\"boxtext1\"])[1]")
	WebElement video;
	
	@FindBy(xpath="//span[@class=\"scf-vote-up\"]")
	WebElement icon;
	
	@FindBy(xpath="//h2[text()=\"Happy Customers - Mr and Mrs Deo\"]")
	WebElement message6;
	
	
	// =============================== Methods for locating elements ================================================

	//-----Scenario 1---------------------------------------------------------------------------------------------------

	public void hover() {
		act = new Actions(driver);
		act.moveToElement(inspiration).build().perform();
	}

	public void galleryClick() throws InterruptedException {
		Thread.sleep(1000);

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", gallery);
	}

	public void design() {
		exterior.click();
	}

	public void roomType() {
		room.click();
	}

	public void categoryClick() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", category);
	}

	public void scroll1() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,400)");
	}

	public void categoryType() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(wallpaper));

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", wallpaper);
	}
	
	
	//-------Scenario 2--------------------------------------------------------------------------------------------------
	
	
	public void hover2() 
	{
		act = new Actions(driver);
		act.moveToElement(inspiration2).build().perform();
		
	}
	
	public void whereHeartIs() throws InterruptedException  
	{
		Thread.sleep(5000);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", heart);
	}
	
	public void details(String Name, String MobileNumber, String PINCode, String Email)
	{
	    name.sendKeys(Name);
		mobileNo.sendKeys(MobileNumber);
		pin.sendKeys(PINCode);
		email.sendKeys(Email);
	}
	
	public void bookAppoinment()
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);
	}
	
	public String text()
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(text));
		return text.getText();
	}
	
	
	
	//-----Scenario 3---------------------------------------------------------------------------------------------------
	
	
	public void hover3() {
		act=new Actions(driver);
		act.moveToElement(inspiration3).build().perform();
	}
	
	public void whereHeartIs3(){
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", heart3);
	}
	
	public void details3(String Name, String MobileNumber, String PINCode){
		name3.sendKeys(Name);
		mobileNo3.sendKeys(MobileNumber);
		pin3.sendKeys(PINCode);
	}
	
	public void invalidEmail(String Email){
		email3.sendKeys(Email);
	}
	
	public void bookAppoinment3() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button3);
	}
	
	public String errorMessage(){
		return error.getText();
	}
	
	
	//------Scenario 4-----------------------------------------------------------------------------------------------
	
	
	public void hover4()
	{
		act = new Actions(driver);
		act.moveToElement(inspiration4).build().perform();
	}
	
	public void colourTrends()
	{
		js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click();", trends);
	}
	
	public void forecastReport() 
	{
		forecast.click();
	}
	
	public void scroll() 
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,800)");
	}
	
	public void downloadReport()  
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", report);
	}
	
	public void enterEmail(String Email)
	{
		email4.sendKeys(Email);
	}
	
	public void subscribe() 
	{
		button4.click();
	}
	
	public String text4()
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(message));
		return message.getText();
	}
	
	
	//-----Scenario 5----------------------------------------------------------------------------------------------
	
	
	public void hover5() throws InterruptedException 
	{
		act = new Actions(driver);
		act.moveToElement(inspiration5).build().perform();
		Thread.sleep(1000);
	}
	
	public void clickGuides() 
	{
		js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click();", guides);
	}
	
	public void scroll5() 
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,2000)");
	}
	
	public void clickKitchen()  
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(kitchen));
		
		js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click();", kitchen);
	}
	
	public void SwitchToPin() 
	{
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle : allWindowHandles) {
		    if (!handle.equals(mainWindowHandle)) {
		        driver.switchTo().window(handle);
		    }
		}
	}
	
	public void hoverButton() 
	{
		act = new Actions(driver);
		act.moveToElement(button5).build().perform();
	}
	
	public void registerComplaint() 
	{
		register.click();
	}
	
	public void enterDetails(String Name, String Email, String Mobile, String City) 
	{
		name5.sendKeys(Name);
		email5.sendKeys(Email);
		mobile.sendKeys(Mobile);
		city.sendKeys(City);
	}
	
	public void selectNature() throws InterruptedException 
	{
		Select select = new Select(nature);
		Thread.sleep(1000);
		select.selectByValue("Kitchen Complaint");
	}
	
	public void enterReason(String Reason) throws InterruptedException 
	{
		reason.sendKeys(Reason);
		Thread.sleep(2000);
	}
	
	public void scrollDown() 
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,200)");
	}
	
	public void submitButton()
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(submit));
		submit.click();
	}
	
	public String text5()
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(thankyou));
		return thankyou.getText();
	}
	
	
	//-----Scenario 6-------------------------------------------------------------------------------------------------
	
	
	public void hover6()
	{
		inspiration6.click();
	}
	
	public void selectTestimonials() throws AWTException, InterruptedException 
	{
		select.click();
		
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void viewButton() 
	{
		button6.click();
	}
	
	public void clickVideo()
	{
		video.click();
	}
	
	public void likeIcon() 
	{
		icon.click();
	}
	
	public String text6() 
	{
		return message6.getText();
	}

}
