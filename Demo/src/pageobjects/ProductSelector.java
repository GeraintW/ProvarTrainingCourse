package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Product Selector"                                
               , summary=""
               , page="ProductSelector"
               , namespacePrefix=""
               , object=""
               , connection="Demo"
     )             
public class ProductSelector {

	@PageTable(row = LineItemsRow.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = '{!LineItems}']")
	public List<LineItemsRow> lineItems;

	@PageRow()
	public static class LineItemsRow {
		@VisualforceBy(componentXPath = "apex:inputTextArea[@value = '{!lines.Description}']")
		public WebElement description;
		@VisualforceBy(componentXPath = "apex:inputField[@value = '{!lines.TotalPrice}']")
		public WebElement totalPrice;
		@VisualforceBy(componentXPath = "apex:selectList[@value = '{!dummyId}']")
		public WebElement dummyId;
	}

	@VisualforceBy(componentXPath = "apex:inputField[@value = '{!Opportunity.CloseDate}']")
	@SalesforceField(name = "CloseDate", object = "Opportunity")
	public WebElement closeDate;
	@VisualforceBy(componentXPath = "apex:commandButton[@value='Cancel']")
	public WebElement cancelButton;
	@VisualforceBy(componentXPath = "apex:commandButton[@value='Save']")
	public WebElement saveButton;
	@VisualforceBy(componentXPath = "apex:inputField[@value = '{!Opportunity.StageName}']")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement stage;
	@VisualforceBy(componentXPath = "apex:inputField[@value = '{!Opportunity.Name}']")
	@SalesforceField(name = "Name", object = "Opportunity")
	public WebElement name;
	
	
	
	public void PopulateFields(String StageName, String Name)
	{
	    //Do Nothing
	}
	
}
