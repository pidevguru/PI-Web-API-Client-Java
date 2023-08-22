package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAElementTemplate {
	@SerializedName("AllowElementToExtend")
	private Boolean allowElementToExtend = null;

	@SerializedName("BaseTemplate")
	private String baseTemplate = null;

	@SerializedName("CanBeAcknowledged")
	private Boolean canBeAcknowledged = null;

	@SerializedName("CategoryNames")
	private List<String> categoryNames = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("ExtendedProperties")
	private Map<String, PWAValue> extendedProperties = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("InstanceType")
	private String instanceType = null;

	@SerializedName("Links")
	private PWAElementTemplateLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("NamingPattern")
	private String namingPattern = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("Severity")
	private String severity = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	public PWAElementTemplate()  {
	}

	public void setAllowElementToExtend(Boolean allowElementToExtend) { this.allowElementToExtend = allowElementToExtend;}

	public Boolean getAllowElementToExtend() { return this.allowElementToExtend; }

	public void setBaseTemplate(String baseTemplate) { this.baseTemplate = baseTemplate;}

	public String getBaseTemplate() { return this.baseTemplate; }

	public void setCanBeAcknowledged(Boolean canBeAcknowledged) { this.canBeAcknowledged = canBeAcknowledged;}

	public Boolean getCanBeAcknowledged() { return this.canBeAcknowledged; }

	public void setCategoryNames(List<String> categoryNames) { this.categoryNames = categoryNames;}

	public List<String> getCategoryNames() { return this.categoryNames; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setExtendedProperties(Map<String, PWAValue> extendedProperties) { this.extendedProperties = extendedProperties;}

	public Map<String, PWAValue> getExtendedProperties() { return this.extendedProperties; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setInstanceType(String instanceType) { this.instanceType = instanceType;}

	public String getInstanceType() { return this.instanceType; }

	public void setLinks(PWAElementTemplateLinks links) { this.links = links;}

	public PWAElementTemplateLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setNamingPattern(String namingPattern) { this.namingPattern = namingPattern;}

	public String getNamingPattern() { return this.namingPattern; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setSeverity(String severity) { this.severity = severity;}

	public String getSeverity() { return this.severity; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

}
