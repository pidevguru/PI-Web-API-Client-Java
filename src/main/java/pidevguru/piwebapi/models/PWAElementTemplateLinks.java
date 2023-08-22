package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAElementTemplateLinks {
	@SerializedName("AnalysisTemplates")
	private String analysisTemplates = null;

	@SerializedName("AttributeTemplates")
	private String attributeTemplates = null;

	@SerializedName("BaseTemplate")
	private String baseTemplate = null;

	@SerializedName("BaseTemplates")
	private String baseTemplates = null;

	@SerializedName("Categories")
	private String categories = null;

	@SerializedName("Database")
	private String database = null;

	@SerializedName("DefaultAttribute")
	private String defaultAttribute = null;

	@SerializedName("DerivedTemplates")
	private String derivedTemplates = null;

	@SerializedName("NotificationRuleTemplates")
	private String notificationRuleTemplates = null;

	@SerializedName("Security")
	private String security = null;

	@SerializedName("SecurityEntries")
	private String securityEntries = null;

	@SerializedName("Self")
	private String self = null;

	public PWAElementTemplateLinks()  {
	}

	public void setAnalysisTemplates(String analysisTemplates) { this.analysisTemplates = analysisTemplates;}

	public String getAnalysisTemplates() { return this.analysisTemplates; }

	public void setAttributeTemplates(String attributeTemplates) { this.attributeTemplates = attributeTemplates;}

	public String getAttributeTemplates() { return this.attributeTemplates; }

	public void setBaseTemplate(String baseTemplate) { this.baseTemplate = baseTemplate;}

	public String getBaseTemplate() { return this.baseTemplate; }

	public void setBaseTemplates(String baseTemplates) { this.baseTemplates = baseTemplates;}

	public String getBaseTemplates() { return this.baseTemplates; }

	public void setCategories(String categories) { this.categories = categories;}

	public String getCategories() { return this.categories; }

	public void setDatabase(String database) { this.database = database;}

	public String getDatabase() { return this.database; }

	public void setDefaultAttribute(String defaultAttribute) { this.defaultAttribute = defaultAttribute;}

	public String getDefaultAttribute() { return this.defaultAttribute; }

	public void setDerivedTemplates(String derivedTemplates) { this.derivedTemplates = derivedTemplates;}

	public String getDerivedTemplates() { return this.derivedTemplates; }

	public void setNotificationRuleTemplates(String notificationRuleTemplates) { this.notificationRuleTemplates = notificationRuleTemplates;}

	public String getNotificationRuleTemplates() { return this.notificationRuleTemplates; }

	public void setSecurity(String security) { this.security = security;}

	public String getSecurity() { return this.security; }

	public void setSecurityEntries(String securityEntries) { this.securityEntries = securityEntries;}

	public String getSecurityEntries() { return this.securityEntries; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

}
