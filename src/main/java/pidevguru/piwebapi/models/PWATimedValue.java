package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWATimedValue {
	@SerializedName("Annotated")
	private Boolean annotated = null;

	@SerializedName("Errors")
	private List<PWAPropertyError> errors = null;

	@SerializedName("Good")
	private Boolean good = null;

	@SerializedName("Questionable")
	private Boolean questionable = null;

	@SerializedName("Substituted")
	private Boolean substituted = null;

	@SerializedName("Timestamp")
	private String timestamp = null;

	@SerializedName("UnitsAbbreviation")
	private String unitsAbbreviation = null;

	@SerializedName("Value")
	private Object value = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWATimedValue()  {
	}

	public void setAnnotated(Boolean annotated) { this.annotated = annotated;}

	public Boolean getAnnotated() { return this.annotated; }

	public void setErrors(List<PWAPropertyError> errors) { this.errors = errors;}

	public List<PWAPropertyError> getErrors() { return this.errors; }

	public void setGood(Boolean good) { this.good = good;}

	public Boolean getGood() { return this.good; }

	public void setQuestionable(Boolean questionable) { this.questionable = questionable;}

	public Boolean getQuestionable() { return this.questionable; }

	public void setSubstituted(Boolean substituted) { this.substituted = substituted;}

	public Boolean getSubstituted() { return this.substituted; }

	public void setTimestamp(String timestamp) { this.timestamp = timestamp;}

	public String getTimestamp() { return this.timestamp; }

	public void setUnitsAbbreviation(String unitsAbbreviation) { this.unitsAbbreviation = unitsAbbreviation;}

	public String getUnitsAbbreviation() { return this.unitsAbbreviation; }

	public void setValue(Object value) { this.value = value;}

	public Object getValue() { return this.value; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
