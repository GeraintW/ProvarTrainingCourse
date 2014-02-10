package customapis;


import java.util.logging.Logger;

import com.provar.core.model.base.api.ValueScope;
import com.provar.core.testapi.ITestExecutionContext;
import com.provar.core.testapi.annotations.*;

@TestApi( title="Fahrenheit To Celcius"
        , summary=""
        , remarks=""
        , iconBase=""
        , defaultApiGroups={"My Test APIs"}
        )
@TestApiParameterGroups(parameterGroups={
	    @TestApiParameterGroup(groupName="inputs", title="Inputs"),
	    @TestApiParameterGroup(groupName="result", title="Result"),
	    })
public class FahrenheitToCelcius {
    
    @TestApiParameter(seq=1, 
            summary="The first parameter's summary.",
            remarks="",
            mandatory=true,
            parameterGroup="inputs")
    public Integer TemperatureInFahrenheit;
    
    @TestApiParameter(seq=10, 
            summary="The name that the result will be stored under.",
            remarks="",
            mandatory=true,
            parameterGroup="result")
    public Integer TemperatureInCelcius;

    @TestApiParameter(seq=11, 
            summary="The lifespan of the result.",
            remarks="",
            mandatory=true,
            parameterGroup="result",
            defaultValue="Test")
    public ValueScope resultScope;

    /** 
     * Used to write to the test execution log.
     */
    @TestLogger
    public Logger testLogger;
    
    /** 
     * Provides access to facilities, mainly to set and get variable values.
     */
    @TestExecutionContext
    public ITestExecutionContext testExecutionContext;
    
    @TestApiExecutor
    public void execute() {

    	// Put our implementation logic here.
    	testLogger.info("Convert temperature from " + this.TemperatureInCelcius + " " + this.getClass().getName());
  	
        // Store the result (if appropriate).
    	Integer dummyResult = (TemperatureInCelcius -32)*5/9;
    	
    	
        testExecutionContext.setValue(TemperatureInCelcius, Integer.toString(dummyResult), resultScope);
        
    }
    
}
