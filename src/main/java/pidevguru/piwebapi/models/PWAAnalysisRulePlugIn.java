package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAnalysisRulePlugIn {
	@SerializedName("AssemblyFileName")
	private String assemblyFileName = null;

	@SerializedName("AssemblyID")
	private String assemblyID = null;

	@SerializedName("AssemblyLoadProperties")
	private List<String> assemblyLoadProperties = null;

	@SerializedName("AssemblyTime")
	private String assemblyTime = null;

	@SerializedName("CompatibilityVersion")
	private Integer compatibilityVersion = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("IsBrowsable")
	private Boolean isBrowsable = null;

	@SerializedName("IsNonEditableConfig")
	private Boolean isNonEditableConfig = null;

	@SerializedName("Links")
	private PWAAnalysisRulePlugInLinks links = null;

	@SerializedName("LoadedAssemblyTime")
	private String loadedAssemblyTime = null;

	@SerializedName("LoadedVersion")
	private String loadedVersion = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("Version")
	private String version = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	public PWAAnalysisRulePlugIn()  {
	}

	public void setAssemblyFileName(String assemblyFileName) { this.assemblyFileName = assemblyFileName;}

	public String getAssemblyFileName() { return this.assemblyFileName; }

	public void setAssemblyID(String assemblyID) { this.assemblyID = assemblyID;}

	public String getAssemblyID() { return this.assemblyID; }

	public void setAssemblyLoadProperties(List<String> assemblyLoadProperties) { this.assemblyLoadProperties = assemblyLoadProperties;}

	public List<String> getAssemblyLoadProperties() { return this.assemblyLoadProperties; }

	public void setAssemblyTime(String assemblyTime) { this.assemblyTime = assemblyTime;}

	public String getAssemblyTime() { return this.assemblyTime; }

	public void setCompatibilityVersion(Integer compatibilityVersion) { this.compatibilityVersion = compatibilityVersion;}

	public Integer getCompatibilityVersion() { return this.compatibilityVersion; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setIsBrowsable(Boolean isBrowsable) { this.isBrowsable = isBrowsable;}

	public Boolean getIsBrowsable() { return this.isBrowsable; }

	public void setIsNonEditableConfig(Boolean isNonEditableConfig) { this.isNonEditableConfig = isNonEditableConfig;}

	public Boolean getIsNonEditableConfig() { return this.isNonEditableConfig; }

	public void setLinks(PWAAnalysisRulePlugInLinks links) { this.links = links;}

	public PWAAnalysisRulePlugInLinks getLinks() { return this.links; }

	public void setLoadedAssemblyTime(String loadedAssemblyTime) { this.loadedAssemblyTime = loadedAssemblyTime;}

	public String getLoadedAssemblyTime() { return this.loadedAssemblyTime; }

	public void setLoadedVersion(String loadedVersion) { this.loadedVersion = loadedVersion;}

	public String getLoadedVersion() { return this.loadedVersion; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setVersion(String version) { this.version = version;}

	public String getVersion() { return this.version; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

}
