package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWANotificationContactTemplate {
	@SerializedName("Available")
	private Boolean available = null;

	@SerializedName("ConfigString")
	private String configString = null;

	@SerializedName("ContactType")
	private String contactType = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("EscalationTimeout")
	private String escalationTimeout = null;

	@SerializedName("HasChildren")
	private Boolean hasChildren = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("Links")
	private PWANotificationContactTemplateLinks links = null;

	@SerializedName("MaximumRetries")
	private Integer maximumRetries = null;

	@SerializedName("MinimumAcknowledgements")
	private Integer minimumAcknowledgements = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("NotifyWhenInstanceEnded")
	private Boolean notifyWhenInstanceEnded = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("PlugInName")
	private String plugInName = null;

	@SerializedName("RetryInterval")
	private String retryInterval = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	public PWANotificationContactTemplate()  {
	}

	public void setAvailable(Boolean available) { this.available = available;}

	public Boolean getAvailable() { return this.available; }

	public void setConfigString(String configString) { this.configString = configString;}

	public String getConfigString() { return this.configString; }

	public void setContactType(String contactType) { this.contactType = contactType;}

	public String getContactType() { return this.contactType; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setEscalationTimeout(String escalationTimeout) { this.escalationTimeout = escalationTimeout;}

	public String getEscalationTimeout() { return this.escalationTimeout; }

	public void setHasChildren(Boolean hasChildren) { this.hasChildren = hasChildren;}

	public Boolean getHasChildren() { return this.hasChildren; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setLinks(PWANotificationContactTemplateLinks links) { this.links = links;}

	public PWANotificationContactTemplateLinks getLinks() { return this.links; }

	public void setMaximumRetries(Integer maximumRetries) { this.maximumRetries = maximumRetries;}

	public Integer getMaximumRetries() { return this.maximumRetries; }

	public void setMinimumAcknowledgements(Integer minimumAcknowledgements) { this.minimumAcknowledgements = minimumAcknowledgements;}

	public Integer getMinimumAcknowledgements() { return this.minimumAcknowledgements; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setNotifyWhenInstanceEnded(Boolean notifyWhenInstanceEnded) { this.notifyWhenInstanceEnded = notifyWhenInstanceEnded;}

	public Boolean getNotifyWhenInstanceEnded() { return this.notifyWhenInstanceEnded; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setPlugInName(String plugInName) { this.plugInName = plugInName;}

	public String getPlugInName() { return this.plugInName; }

	public void setRetryInterval(String retryInterval) { this.retryInterval = retryInterval;}

	public String getRetryInterval() { return this.retryInterval; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

}
