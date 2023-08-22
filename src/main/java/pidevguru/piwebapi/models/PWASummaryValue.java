package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWASummaryValue {
	@SerializedName("Type")
	private String type = null;

	@SerializedName("Value")
	private PWATimedValue value = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWASummaryValue()  {
	}

	public void setType(String type) { this.type = type;}

	public String getType() { return this.type; }

	public void setValue(PWATimedValue value) { this.value = value;}

	public PWATimedValue getValue() { return this.value; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
