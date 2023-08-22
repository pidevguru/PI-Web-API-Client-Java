package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWASearchByAttribute {
	@SerializedName("ElementTemplate")
	private String elementTemplate = null;

	@SerializedName("SearchRoot")
	private String searchRoot = null;

	@SerializedName("ValueQueries")
	private List<PWAValueQuery> valueQueries = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWASearchByAttribute()  {
	}

	public void setElementTemplate(String elementTemplate) { this.elementTemplate = elementTemplate;}

	public String getElementTemplate() { return this.elementTemplate; }

	public void setSearchRoot(String searchRoot) { this.searchRoot = searchRoot;}

	public String getSearchRoot() { return this.searchRoot; }

	public void setValueQueries(List<PWAValueQuery> valueQueries) { this.valueQueries = valueQueries;}

	public List<PWAValueQuery> getValueQueries() { return this.valueQueries; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
