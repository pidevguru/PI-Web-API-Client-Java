package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAWebException {
	@SerializedName("Errors")
	private List<String> errors = null;

	@SerializedName("StatusCode")
	private Integer statusCode = null;

	public PWAWebException()  {
	}

	public void setErrors(List<String> errors) { this.errors = errors;}

	public List<String> getErrors() { return this.errors; }

	public void setStatusCode(Integer statusCode) { this.statusCode = statusCode;}

	public Integer getStatusCode() { return this.statusCode; }

}
