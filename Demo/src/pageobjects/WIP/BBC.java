package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( connection = "bbc"
     )             
public class BBC {

	@TextType()
	@FindBy(css = "div.schedule.tv a.selector-trigger.channel")
	public WebElement bBCOneSelectAnotherTelevisionChannelLink;
	@TextType()
	public WebElement field;
	@BooleanType()
	@FindBy(css = "td.table8 input")
	public WebElement radio;
			
}
