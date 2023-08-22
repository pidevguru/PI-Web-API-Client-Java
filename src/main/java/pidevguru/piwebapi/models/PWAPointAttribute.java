package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAPointAttribute {
	@SerializedName("Links")
	private PWAPointAttributeLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Value")
	private Object value = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWAPointAttribute()  {
	}

	public void setLinks(PWAPointAttributeLinks links) { this.links = links;}

	public PWAPointAttributeLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setValue(Object value) { this.value = value;}

	public Object getValue() { return this.value; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
