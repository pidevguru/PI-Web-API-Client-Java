package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAEventFrame {
	@SerializedName("AcknowledgedBy")
	private String acknowledgedBy = null;

	@SerializedName("AcknowledgedDate")
	private String acknowledgedDate = null;

	@SerializedName("AreValuesCaptured")
	private Boolean areValuesCaptured = null;

	@SerializedName("CanBeAcknowledged")
	private Boolean canBeAcknowledged = null;

	@SerializedName("CategoryNames")
	private List<String> categoryNames = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("EndTime")
	private String endTime = null;

	@SerializedName("ExtendedProperties")
	private Map<String, PWAValue> extendedProperties = null;

	@SerializedName("HasChildren")
	private Boolean hasChildren = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("IsAcknowledged")
	private Boolean isAcknowledged = null;

	@SerializedName("IsAnnotated")
	private Boolean isAnnotated = null;

	@SerializedName("IsLocked")
	private Boolean isLocked = null;

	@SerializedName("Links")
	private PWAEventFrameLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("RefElementWebIds")
	private List<String> refElementWebIds = null;

	@SerializedName("Security")
	private PWASecurity security = null;

	@SerializedName("Severity")
	private String severity = null;

	@SerializedName("StartTime")
	private String startTime = null;

	@SerializedName("TemplateName")
	private String templateName = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	public PWAEventFrame()  {
	}

	public void setAcknowledgedBy(String acknowledgedBy) { this.acknowledgedBy = acknowledgedBy;}

	public String getAcknowledgedBy() { return this.acknowledgedBy; }

	public void setAcknowledgedDate(String acknowledgedDate) { this.acknowledgedDate = acknowledgedDate;}

	public String getAcknowledgedDate() { return this.acknowledgedDate; }

	public void setAreValuesCaptured(Boolean areValuesCaptured) { this.areValuesCaptured = areValuesCaptured;}

	public Boolean getAreValuesCaptured() { return this.areValuesCaptured; }

	public void setCanBeAcknowledged(Boolean canBeAcknowledged) { this.canBeAcknowledged = canBeAcknowledged;}

	public Boolean getCanBeAcknowledged() { return this.canBeAcknowledged; }

	public void setCategoryNames(List<String> categoryNames) { this.categoryNames = categoryNames;}

	public List<String> getCategoryNames() { return this.categoryNames; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setEndTime(String endTime) { this.endTime = endTime;}

	public String getEndTime() { return this.endTime; }

	public void setExtendedProperties(Map<String, PWAValue> extendedProperties) { this.extendedProperties = extendedProperties;}

	public Map<String, PWAValue> getExtendedProperties() { return this.extendedProperties; }

	public void setHasChildren(Boolean hasChildren) { this.hasChildren = hasChildren;}

	public Boolean getHasChildren() { return this.hasChildren; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setIsAcknowledged(Boolean isAcknowledged) { this.isAcknowledged = isAcknowledged;}

	public Boolean getIsAcknowledged() { return this.isAcknowledged; }

	public void setIsAnnotated(Boolean isAnnotated) { this.isAnnotated = isAnnotated;}

	public Boolean getIsAnnotated() { return this.isAnnotated; }

	public void setIsLocked(Boolean isLocked) { this.isLocked = isLocked;}

	public Boolean getIsLocked() { return this.isLocked; }

	public void setLinks(PWAEventFrameLinks links) { this.links = links;}

	public PWAEventFrameLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setRefElementWebIds(List<String> refElementWebIds) { this.refElementWebIds = refElementWebIds;}

	public List<String> getRefElementWebIds() { return this.refElementWebIds; }

	public void setSecurity(PWASecurity security) { this.security = security;}

	public PWASecurity getSecurity() { return this.security; }

	public void setSeverity(String severity) { this.severity = severity;}

	public String getSeverity() { return this.severity; }

	public void setStartTime(String startTime) { this.startTime = startTime;}

	public String getStartTime() { return this.startTime; }

	public void setTemplateName(String templateName) { this.templateName = templateName;}

	public String getTemplateName() { return this.templateName; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

}
