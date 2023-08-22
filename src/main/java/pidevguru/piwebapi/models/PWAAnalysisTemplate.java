package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAnalysisTemplate {
	@SerializedName("AnalysisRulePlugInName")
	private String analysisRulePlugInName = null;

	@SerializedName("CategoryNames")
	private List<String> categoryNames = null;

	@SerializedName("CreateEnabled")
	private Boolean createEnabled = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("GroupId")
	private Integer groupId = null;

	@SerializedName("HasNotificationTemplate")
	private Boolean hasNotificationTemplate = null;

	@SerializedName("HasTarget")
	private Boolean hasTarget = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("Links")
	private PWAAnalysisTemplateLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("OutputTime")
	private String outputTime = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("TargetName")
	private String targetName = null;

	@SerializedName("TimeRulePlugInName")
	private String timeRulePlugInName = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	public PWAAnalysisTemplate()  {
	}

	public void setAnalysisRulePlugInName(String analysisRulePlugInName) { this.analysisRulePlugInName = analysisRulePlugInName;}

	public String getAnalysisRulePlugInName() { return this.analysisRulePlugInName; }

	public void setCategoryNames(List<String> categoryNames) { this.categoryNames = categoryNames;}

	public List<String> getCategoryNames() { return this.categoryNames; }

	public void setCreateEnabled(Boolean createEnabled) { this.createEnabled = createEnabled;}

	public Boolean getCreateEnabled() { return this.createEnabled; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setGroupId(Integer groupId) { this.groupId = groupId;}

	public Integer getGroupId() { return this.groupId; }

	public void setHasNotificationTemplate(Boolean hasNotificationTemplate) { this.hasNotificationTemplate = hasNotificationTemplate;}

	public Boolean getHasNotificationTemplate() { return this.hasNotificationTemplate; }

	public void setHasTarget(Boolean hasTarget) { this.hasTarget = hasTarget;}

	public Boolean getHasTarget() { return this.hasTarget; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setLinks(PWAAnalysisTemplateLinks links) { this.links = links;}

	public PWAAnalysisTemplateLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setOutputTime(String outputTime) { this.outputTime = outputTime;}

	public String getOutputTime() { return this.outputTime; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setTargetName(String targetName) { this.targetName = targetName;}

	public String getTargetName() { return this.targetName; }

	public void setTimeRulePlugInName(String timeRulePlugInName) { this.timeRulePlugInName = timeRulePlugInName;}

	public String getTimeRulePlugInName() { return this.timeRulePlugInName; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

}
