package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAElement {
	@SerializedName("CategoryNames")
	private List<String> categoryNames = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("Errors")
	private List<PWAPropertyError> errors = null;

	@SerializedName("ExtendedProperties")
	private Map<String, PWAValue> extendedProperties = null;

	@SerializedName("HasChildren")
	private Boolean hasChildren = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("Links")
	private PWAElementLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("Paths")
	private List<String> paths = null;

	@SerializedName("TemplateName")
	private String templateName = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	public PWAElement()  {
	}

	public void setCategoryNames(List<String> categoryNames) { this.categoryNames = categoryNames;}

	public List<String> getCategoryNames() { return this.categoryNames; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setErrors(List<PWAPropertyError> errors) { this.errors = errors;}

	public List<PWAPropertyError> getErrors() { return this.errors; }

	public void setExtendedProperties(Map<String, PWAValue> extendedProperties) { this.extendedProperties = extendedProperties;}

	public Map<String, PWAValue> getExtendedProperties() { return this.extendedProperties; }

	public void setHasChildren(Boolean hasChildren) { this.hasChildren = hasChildren;}

	public Boolean getHasChildren() { return this.hasChildren; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setLinks(PWAElementLinks links) { this.links = links;}

	public PWAElementLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setPaths(List<String> paths) { this.paths = paths;}

	public List<String> getPaths() { return this.paths; }

	public void setTemplateName(String templateName) { this.templateName = templateName;}

	public String getTemplateName() { return this.templateName; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

}
