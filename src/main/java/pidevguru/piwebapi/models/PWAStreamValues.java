package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAStreamValues {
	@SerializedName("Items")
	private List<PWATimedValue> items = null;

	@SerializedName("Links")
	private PWAStreamValuesLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("UnitsAbbreviation")
	private String unitsAbbreviation = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	public PWAStreamValues()  {
	}

	public void setItems(List<PWATimedValue> items) { this.items = items;}

	public List<PWATimedValue> getItems() { return this.items; }

	public void setLinks(PWAStreamValuesLinks links) { this.links = links;}

	public PWAStreamValuesLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setUnitsAbbreviation(String unitsAbbreviation) { this.unitsAbbreviation = unitsAbbreviation;}

	public String getUnitsAbbreviation() { return this.unitsAbbreviation; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

}
