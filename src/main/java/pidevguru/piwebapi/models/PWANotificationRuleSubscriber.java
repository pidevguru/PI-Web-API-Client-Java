package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWANotificationRuleSubscriber {
	@SerializedName("ConfigString")
	private String configString = null;

	@SerializedName("ContactTemplateName")
	private String contactTemplateName = null;

	@SerializedName("ContactType")
	private String contactType = null;

	@SerializedName("DeliveryFormatName")
	private String deliveryFormatName = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("EscalationTimeout")
	private String escalationTimeout = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("MaximumRetries")
	private Integer maximumRetries = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("NotifyOption")
	private String notifyOption = null;

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

	public PWANotificationRuleSubscriber()  {
	}

	public void setConfigString(String configString) { this.configString = configString;}

	public String getConfigString() { return this.configString; }

	public void setContactTemplateName(String contactTemplateName) { this.contactTemplateName = contactTemplateName;}

	public String getContactTemplateName() { return this.contactTemplateName; }

	public void setContactType(String contactType) { this.contactType = contactType;}

	public String getContactType() { return this.contactType; }

	public void setDeliveryFormatName(String deliveryFormatName) { this.deliveryFormatName = deliveryFormatName;}

	public String getDeliveryFormatName() { return this.deliveryFormatName; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setEscalationTimeout(String escalationTimeout) { this.escalationTimeout = escalationTimeout;}

	public String getEscalationTimeout() { return this.escalationTimeout; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setMaximumRetries(Integer maximumRetries) { this.maximumRetries = maximumRetries;}

	public Integer getMaximumRetries() { return this.maximumRetries; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setNotifyOption(String notifyOption) { this.notifyOption = notifyOption;}

	public String getNotifyOption() { return this.notifyOption; }

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
