package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( connection = "GoogleUI"
     )             
public class GoogleHome {

	@NumericType(decimalPlaces = 2, length = 10)
	@FindBy(id = "gbqfq")
	public WebElement text;
	@TextType()
	@FindBy(css = "#gbqfba ")
	public WebElement szukajWGoogleButton;
			
}
