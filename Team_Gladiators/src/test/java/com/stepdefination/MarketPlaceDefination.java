package com.stepdefination;
import org.testng.Assert;
import com.actions.CategoryBrowsingAction;
import com.actions.CustomSearchAction;
import com.actions.CustomeAdvtiseAction;
import com.actions.LoginPageAction;
import com.actions.MarketPlaceAction;
import com.actions.OrderByADAction;
import com.actions.ScheduleAdvertisementAction;
import com.actions.SelectAddressAction;
import com.locators.CategoryBrowsingLoc;
import com.locators.CustomSearchLoc;
import com.locators.CustomeAdvtiseLoc;
import com.locators.LoginPageLoctaors;
import com.locators.MarketPlaceLoc;
import com.locators.OrderByADLoc;
import com.locators.ScheduleAdvertisementLoc;
import com.locators.SelectAddressLoc;
import com.utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
	
public class MarketPlaceDefination {
	
		LoginPageLoctaors loginPageLoctaors = new LoginPageLoctaors();
		LoginPageAction loginPageAction = new LoginPageAction();
		CategoryBrowsingLoc categoryBrowsingLoc = new CategoryBrowsingLoc();
		CategoryBrowsingAction categoryBrowsingAction = new CategoryBrowsingAction();
		CustomeAdvtiseAction customeAdvtiseAction = new CustomeAdvtiseAction();
		CustomeAdvtiseLoc customeAdvtiseLoc = new CustomeAdvtiseLoc();
		CustomSearchAction customSearchAction = new CustomSearchAction();
		CustomSearchLoc customSearchLoc = new CustomSearchLoc();
		OrderByADAction orderByADAction = new OrderByADAction();
		OrderByADLoc orderByADLoc = new OrderByADLoc();
		ScheduleAdvertisementAction scheduleAdvertisementAction = new ScheduleAdvertisementAction();
		ScheduleAdvertisementLoc scheduleAdvertisementLoc = new ScheduleAdvertisementLoc();
		SelectAddressAction selectAddressAction = new SelectAddressAction();
		SelectAddressLoc selectAddressLoc = new SelectAddressLoc();
		MarketPlaceAction marketPlaceAction = new MarketPlaceAction();
		
		//background
		@Given("visit the site {string}")
		public void visit_the_site(String string) {
		  		HelperClass.openPage(string);
		}
	
		@When("Enter username and password and click on submit$")
		public void enter_team_gladiators_and_gladiators123_and_click_on_submit() throws InterruptedException {
			loginPageAction.login();
		}
		@When("click on Marketplace")
		public void click_on_marketplace() {
		   marketPlaceAction.marketplacebtn();
		}
	//s1
		
		
	
		@When("go to my advertisement")
		public void go_to_my_advertisement() {
		    scheduleAdvertisementAction.GotoAd();
	
		}
	
		@When("click on new advertisement")
		public void click_on_new_advertisement() {
		    scheduleAdvertisementAction.AddNewBtn();
		}
	
		@Then("create advertisement")
		public void create_advertisement() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		   scheduleAdvertisementAction.ScheduleAd();
		}
		
		//s2
	
		
		
		@When("go to business dir")
		public void go_to_business_dir() {
			selectAddressAction.businessDir();
		}
		
		@When("click on advertisemen")
		public void click_on_advertisemen() {
		 selectAddressAction.ClickAD();
		}
		
		@Then("Assert Address")
		public void assert_address() {
			Assert.assertEquals(selectAddressAction.address(), "Address");
		}
	
	//s3
	
		
		@When("click on Advertisement")
		public void click_on_advertisement() {
		    customSearchAction.advtise();
		}
	
		@When("click on show more filters")
		public void click_on_show_more_filters() throws InterruptedException {
		   customSearchAction.filters();
		}
	
		@When("add filters")
		public void add_filters() {
		    customSearchAction.customSearch();
		}
	//
		@Then("click on show advertisement")
		public void click_on_show_advertisement() {
		   System.out.println("successfull");
		}
		
		//s4
		
	
		@Given("go to advertisements")
		public void go_to_advertisements() {
		    categoryBrowsingAction.advtise();
		}
		
		@When("search for food")
		public void search_for_food() {
		    categoryBrowsingAction.keywords();
		}
		
		@When("click on food")
		public void click_on_food() {
		    categoryBrowsingAction.Food();
			
		}
		
		@Then("Assert food")
		public void assert_food() {
			Assert.assertEquals(categoryBrowsingAction.assertStr(), "FOOD - CARROTS");
	}
		//s5
		
	
	@Given("go to business directory")
	public void go_to_business_directory() {
	   orderByADAction.businessDirectory();
	}
	
	@When("click on orderBy")
	public void click_on_order_by() {
	    orderByADAction.orderby();
	}
	
	@Then("click on it")
	public void click_on_it() {
	    orderByADAction.asec();
	}
		
		//s6
	
	@Given("go to advertisement interests")
	public void go_to_advertisement_interests() {
	    customeAdvtiseAction.myAdvtisement();
	}
	
	@When("click on add new")
	public void click_on_add_new() {
	    customeAdvtiseAction.AddNew();
	}
	
	@When("fill the valid data")
	public void fill_the_valid_data() {
	    customeAdvtiseAction.customeAdv();
	}
	
	@Then("click on add")
	public void click_on_add() {
	    System.out.println("successfully added");
	}
	
			
	}
	
		
		
	
	
