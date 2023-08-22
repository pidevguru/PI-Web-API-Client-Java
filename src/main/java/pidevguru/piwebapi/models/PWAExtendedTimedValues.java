package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAExtendedTimedValues {
	@SerializedName("Items")
	private List<PWAExtendedTimedValue> items = null;

	@SerializedName("UnitsAbbreviation")
	private String unitsAbbreviation = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWAExtendedTimedValues()  {
	}

	public void setItems(List<PWAExtendedTimedValue> items) { this.items = items;}

	public List<PWAExtendedTimedValue> getItems() { return this.items; }

	public void setUnitsAbbreviation(String unitsAbbreviation) { this.unitsAbbreviation = unitsAbbreviation;}

	public String getUnitsAbbreviation() { return this.unitsAbbreviation; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
