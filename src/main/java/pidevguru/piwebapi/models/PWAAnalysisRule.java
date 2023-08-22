package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAnalysisRule {
	@SerializedName("ConfigString")
	private String configString = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("DisplayString")
	private String displayString = null;

	@SerializedName("EditorType")
	private String editorType = null;

	@SerializedName("HasChildren")
	private Boolean hasChildren = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("IsConfigured")
	private Boolean isConfigured = null;

	@SerializedName("IsInitializing")
	private Boolean isInitializing = null;

	@SerializedName("Links")
	private PWAAnalysisRuleLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("PlugInName")
	private String plugInName = null;

	@SerializedName("SupportedBehaviors")
	private List<String> supportedBehaviors = null;

	@SerializedName("VariableMapping")
	private String variableMapping = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	public PWAAnalysisRule()  {
	}

	public void setConfigString(String configString) { this.configString = configString;}

	public String getConfigString() { return this.configString; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setDisplayString(String displayString) { this.displayString = displayString;}

	public String getDisplayString() { return this.displayString; }

	public void setEditorType(String editorType) { this.editorType = editorType;}

	public String getEditorType() { return this.editorType; }

	public void setHasChildren(Boolean hasChildren) { this.hasChildren = hasChildren;}

	public Boolean getHasChildren() { return this.hasChildren; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setIsConfigured(Boolean isConfigured) { this.isConfigured = isConfigured;}

	public Boolean getIsConfigured() { return this.isConfigured; }

	public void setIsInitializing(Boolean isInitializing) { this.isInitializing = isInitializing;}

	public Boolean getIsInitializing() { return this.isInitializing; }

	public void setLinks(PWAAnalysisRuleLinks links) { this.links = links;}

	public PWAAnalysisRuleLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setPlugInName(String plugInName) { this.plugInName = plugInName;}

	public String getPlugInName() { return this.plugInName; }

	public void setSupportedBehaviors(List<String> supportedBehaviors) { this.supportedBehaviors = supportedBehaviors;}

	public List<String> getSupportedBehaviors() { return this.supportedBehaviors; }

	public void setVariableMapping(String variableMapping) { this.variableMapping = variableMapping;}

	public String getVariableMapping() { return this.variableMapping; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

}
