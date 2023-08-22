package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWANotificationRuleTemplate {
	@SerializedName("CategoryNames")
	private List<String> categoryNames = null;

	@SerializedName("Criteria")
	private String criteria = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("MultiTriggerEventOption")
	private String multiTriggerEventOption = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("NonrepetitionInterval")
	private String nonrepetitionInterval = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("ResendInterval")
	private String resendInterval = null;

	@SerializedName("Status")
	private String status = null;

	@SerializedName("TemplateName")
	private String templateName = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	public PWANotificationRuleTemplate()  {
	}

	public void setCategoryNames(List<String> categoryNames) { this.categoryNames = categoryNames;}

	public List<String> getCategoryNames() { return this.categoryNames; }

	public void setCriteria(String criteria) { this.criteria = criteria;}

	public String getCriteria() { return this.criteria; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setMultiTriggerEventOption(String multiTriggerEventOption) { this.multiTriggerEventOption = multiTriggerEventOption;}

	public String getMultiTriggerEventOption() { return this.multiTriggerEventOption; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setNonrepetitionInterval(String nonrepetitionInterval) { this.nonrepetitionInterval = nonrepetitionInterval;}

	public String getNonrepetitionInterval() { return this.nonrepetitionInterval; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setResendInterval(String resendInterval) { this.resendInterval = resendInterval;}

	public String getResendInterval() { return this.resendInterval; }

	public void setStatus(String status) { this.status = status;}

	public String getStatus() { return this.status; }

	public void setTemplateName(String templateName) { this.templateName = templateName;}

	public String getTemplateName() { return this.templateName; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

}
