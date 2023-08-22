package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAErrors {
	@SerializedName("Errors")
	private List<String> errors = null;

	public PWAErrors()  {
	}

	public void setErrors(List<String> errors) { this.errors = errors;}

	public List<String> getErrors() { return this.errors; }

}
