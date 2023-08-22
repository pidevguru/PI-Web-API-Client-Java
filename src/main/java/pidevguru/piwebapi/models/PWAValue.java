package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAValue {
	@SerializedName("Exception")
	private PWAErrors exception = null;

	@SerializedName("Value")
	private Object value = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWAValue()  {
	}

	public void setException(PWAErrors exception) { this.exception = exception;}

	public PWAErrors getException() { return this.exception; }

	public void setValue(Object value) { this.value = value;}

	public Object getValue() { return this.value; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
