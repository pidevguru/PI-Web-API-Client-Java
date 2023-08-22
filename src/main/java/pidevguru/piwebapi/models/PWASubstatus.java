package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWASubstatus {
	@SerializedName("Message")
	private String message = null;

	@SerializedName("Substatus")
	private Integer substatus = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWASubstatus()  {
	}

	public void setMessage(String message) { this.message = message;}

	public String getMessage() { return this.message; }

	public void setSubstatus(Integer substatus) { this.substatus = substatus;}

	public Integer getSubstatus() { return this.substatus; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
