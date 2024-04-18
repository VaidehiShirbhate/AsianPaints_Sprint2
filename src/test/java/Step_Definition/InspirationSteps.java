package Step_Definition;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import DriverSetup.SetupDriver;
import InspirationPageFactory.InspirationPageFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class InspirationSteps {

	static WebDriver driver;
	  InspirationPageFactory page;
	
	
	@Given("User is on homepage of Asian Paints and hover on Inspiration")
	public void user_is_on_homepage_of_asian_paints_and_hover_on_inspiration() 
	{
	    driver = SetupDriver.chromedriver();
	    page = new InspirationPageFactory(driver);
	    
	}


//============================  Scenario 1  ==============================================================

	
	@When("Click on Gallery option")
	public void click_on_gallery_option() throws InterruptedException
	{
		page.hover();
	    page.galleryClick();
	}

	@When("Click on Exterior designs")
	public void click_on_exterior_designs() 
	{
	    page.design();
	}

	@When("Select Room and its Category")
	public void select_room_and_its_category()
	{
	    page.roomType();
	    page.categoryClick();
	    page.scroll1();
	    page.categoryType();
	}

	@Then("It should display the room designs")
	public void it_should_display_the_room_designs() 
	{
	   Assert.assertEquals("https://www.asianpaints.com/inspiration/ideas/colour-inspiration/living-room/living-room-wallpaper-designs.html", driver.getCurrentUrl());
	}

	
	
//=================================  Scenario 2  =====================================================================
	
	@When("Click on Where The Heart Is option")
	public void click_on_where_the_heart_is_option() throws InterruptedException
	{
	    page.hover2();
	    page.whereHeartIs();
	}


	@And("^User enters the (.*), (.*), (.*) and (.*)$")
	public void user_enters_the_and(String Name, String MobileNumber, String PINCode, String Email)
	{
	    page.details(Name, MobileNumber, PINCode, Email);
	}

	@And("Click on Book an appoinment")
	public void click_on_book_an_appoinment() 
	{
	    page.bookAppoinment();
	}

	@Then("It should schedule a visit by an expert")
	public void it_should_schedule_a_visit_by_an_expert() 
	{
		String Title="Thank you!";
		String verifyTitle = page.text();
	    Assert.assertEquals(Title, verifyTitle);
	}
	
	
	
	
//=====================================  Scenario3  =========================================================

	
	@When("Click on Where The Heart Is")
	public void click_on_where_the_heart_is()
	{
	    page.hover3();
	    page.whereHeartIs3();
	}
	
	@When("User enters their details with Name1, MobileNumber1, PINCode1")
	public void user_enters_their_details_with_name1_mobile_number1_pin_code1(DataTable credentials) 
	{
		List<List<String>> cells = credentials.cells();
		page.details3(cells.get(0).get(0), cells.get(0).get(1), cells.get(0).get(2));
	}

	@When("Enters invalid Email1 for book an appoinment")
	public void enters_invalid_email1_for_book_an_appoinment(DataTable dataTable) throws InterruptedException 
	{
		List<List<String>> cells = dataTable.cells();
		page.invalidEmail(cells.get(0).get(0));
	}

	@When("Click on Book an appoinment button")
	public void click_on_book_an_appoinment_button()
	{
	    page.bookAppoinment3();
	}

	@Then("It should give an error message")
	public void it_should_give_an_error_message()
	{
		String message = "Email is invalid";
	    String verifyMessage = page.errorMessage();
	    Assert.assertEquals(message, verifyMessage);
	}

	
//==================================  Scenario 4  ===================================================================
	
	@When("User is click on Colour Trends")
	public void user_is_click_on_colour_trends() 
	{
	    page.hover4();
	    page.colourTrends();
	}

	@When("Click on Forecast report")
	public void click_on_forecast_report()
	{
	    page.forecastReport();
	}

	@When("User is able to click on Download report")
	public void user_is_able_to_click_on_download_report() 
	{
		page.scroll();
	    page.downloadReport();
	}

	@When("^User is able to enter (.*)")
	public void user_is_able_to_enter(String Email) 
	{
	    page.enterEmail(Email);
	}

	@When("Click on Subscribe for latest design inspiration")
	public void click_on_subscribe_for_latest_design_inspiration()
	{
	    page.subscribe();
	}

	@Then("It should download the report and user receives subscription message")
	public void it_should_download_the_report_and_user_receives_subscription_message() 
	{
	    String text = "Congratulations You are Subscribed";
	    String verifymessage = page.text4();
	    Assert.assertEquals(text, verifymessage);
	}
	
	
	



	
//==================================  Scenario 5  ===================================================================
	
	
	@When("User click on Guides option")
	public void user_click_on_guides_option() throws InterruptedException 
	{
	    page.hover5();
	    page.clickGuides();
	}

	@When("Click on Kitchen from Our Division Section")
	public void click_on_kitchen_from_our_division_section() 
	{
		page.scroll5();
	    page.clickKitchen();
	}

	@When("Click on Register a complaint")
	public void click_on_register_a_complaint() 
	{
		page.SwitchToPin();
		page.hoverButton();
	    page.registerComplaint();
	}

	@When("User Register complaint with their Name, Email, Mobile and City")
	public void user_register_complaint_with_their_name_email_mobile_and_city(DataTable details) 
	{
		page.SwitchToPin();
		List<List<String>> cells = details.cells();
		page.enterDetails(cells.get(0).get(0), cells.get(0).get(1), cells.get(0).get(2), cells.get(0).get(3));
	}

	@When("Select Nature of complaint")
	public void select_nature_of_complaint() throws InterruptedException
	{
	    page.selectNature();
	}

	@When("User enter their reason for complaint")
	public void user_enter_their_reason_for_complaint(DataTable reason) throws InterruptedException
	{
		List<List<String>> cells = reason.cells();
	    page.enterReason(cells.get(0).get(0));
	    page.scrollDown();
	}

	@When("Click on Submit button")
	public void click_on_submit_button() 
	{
	    page.submitButton();
	}
	
	@Then("It should give Thank you message")
	public void it_should_give_thank_you_message()
	{
		String message = "Our representative will contact you within one working day. Our toll-free helpline is 1800 2120 500.";
	    String verifyMessage = page.text5();
	    Assert.assertEquals(message, verifyMessage);
	}
	
	
//==================================  Scenario 6  ===================================================================

	@When("User click on Inspiration")
	public void user_click_on_inspiration() 
	{
		driver.get("https://www.sleekworld.com/");
		page.hover6();
	}

	@When("User select testimonials")
	public void user_select_testimonials() throws AWTException, InterruptedException
	{
	    page.selectTestimonials();
	}
	
	@When("Click on View more Videos button")
	public void click_on_view_more_videos_button() 
	{
	    page.viewButton();
	}

	@When("User Click on Videos and LIKE the icon")
	public void user_click_on_videos_and_like_the_icon() 
	{
	    page.clickVideo();
	    page.likeIcon();
	}
	
	@Then("User is able to click on like icon and view the videos in wishlist")
	public void user_is_able_to_click_on_like_icon_and_view_the_videos_in_wishlist() {
		String actual = "";
		String exp = page.text6();
		Assert.assertEquals(actual, exp);
	}

	
	
	@AfterStep
	public static void takeScreendown(Scenario scenerio) {
 
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}
	
	
	
	
	
	
	
}
