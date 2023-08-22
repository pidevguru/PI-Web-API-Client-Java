package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWATimeRule {
	@SerializedName("ConfigString")
	private String configString = null;

	@SerializedName("ConfigStringStored")
	private String configStringStored = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("DisplayString")
	private String displayString = null;

	@SerializedName("EditorType")
	private String editorType = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("IsConfigured")
	private Boolean isConfigured = null;

	@SerializedName("IsInitializing")
	private Boolean isInitializing = null;

	@SerializedName("Links")
	private PWATimeRuleLinks links = null;

	@SerializedName("MergeDuplicatedItems")
	private Boolean mergeDuplicatedItems = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("PlugInName")
	private String plugInName = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	public PWATimeRule()  {
	}

	public void setConfigString(String configString) { this.configString = configString;}

	public String getConfigString() { return this.configString; }

	public void setConfigStringStored(String configStringStored) { this.configStringStored = configStringStored;}

	public String getConfigStringStored() { return this.configStringStored; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setDisplayString(String displayString) { this.displayString = displayString;}

	public String getDisplayString() { return this.displayString; }

	public void setEditorType(String editorType) { this.editorType = editorType;}

	public String getEditorType() { return this.editorType; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setIsConfigured(Boolean isConfigured) { this.isConfigured = isConfigured;}

	public Boolean getIsConfigured() { return this.isConfigured; }

	public void setIsInitializing(Boolean isInitializing) { this.isInitializing = isInitializing;}

	public Boolean getIsInitializing() { return this.isInitializing; }

	public void setLinks(PWATimeRuleLinks links) { this.links = links;}

	public PWATimeRuleLinks getLinks() { return this.links; }

	public void setMergeDuplicatedItems(Boolean mergeDuplicatedItems) { this.mergeDuplicatedItems = mergeDuplicatedItems;}

	public Boolean getMergeDuplicatedItems() { return this.mergeDuplicatedItems; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setPlugInName(String plugInName) { this.plugInName = plugInName;}

	public String getPlugInName() { return this.plugInName; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

}
