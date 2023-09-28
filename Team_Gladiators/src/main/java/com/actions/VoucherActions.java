package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.VoucherLocators;
import com.utils.HelperClass;

public class VoucherActions {

	VoucherLocators voucherLocators = null;
	String NoOfVouchers;
	
	
	
	public VoucherActions( ) {
		super();
		this.voucherLocators = new VoucherLocators();
		PageFactory.initElements(HelperClass.getDriver(), voucherLocators);
	}

	public void clickMarketPlace() {
		voucherLocators.marketplace.click();
	}
	
	public void clickMyVoucher() {
		voucherLocators.myVouchers.click();
	}
	
	public void clickBuyVouchers() {
		voucherLocators.buyVouchers.click();
	}
	
	public void clickGiftVoucher() {
		voucherLocators.giftVoucher.click();
	}
	
	public void enterNoOfVouchers(String NoOfVouchers) {
		voucherLocators.noOfVouchers.sendKeys(NoOfVouchers);
	}
	public void enterAmount(String amount) {
		voucherLocators.amount.sendKeys(amount);
	}
	public void selectUsage() {
		voucherLocators.Usage.click();
	}
	public void clickNext() {
		voucherLocators.nextButton.click();
	}
	public void giftVoucher(String NoOfVouchers, String amount) {
		this.enterNoOfVouchers(NoOfVouchers);
		this.enterAmount(amount);
		this.selectUsage();
		this.clickNext();
	}
	public void clickConfirm() {
		voucherLocators.confirmButton.click();
	}
	public void clickPrint() {
		voucherLocators.printButton.click();
	}
}
