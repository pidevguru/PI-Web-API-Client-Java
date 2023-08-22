package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAssetServerLinks {
	@SerializedName("AnalysisRulePlugIns")
	private String analysisRulePlugIns = null;

	@SerializedName("Databases")
	private String databases = null;

	@SerializedName("NotificationContactTemplates")
	private String notificationContactTemplates = null;

	@SerializedName("NotificationPlugIns")
	private String notificationPlugIns = null;

	@SerializedName("Security")
	private String security = null;

	@SerializedName("SecurityEntries")
	private String securityEntries = null;

	@SerializedName("SecurityIdentities")
	private String securityIdentities = null;

	@SerializedName("SecurityMappings")
	private String securityMappings = null;

	@SerializedName("Self")
	private String self = null;

	@SerializedName("TimeRulePlugIns")
	private String timeRulePlugIns = null;

	@SerializedName("UnitClasses")
	private String unitClasses = null;

	public PWAAssetServerLinks()  {
	}

	public void setAnalysisRulePlugIns(String analysisRulePlugIns) { this.analysisRulePlugIns = analysisRulePlugIns;}

	public String getAnalysisRulePlugIns() { return this.analysisRulePlugIns; }

	public void setDatabases(String databases) { this.databases = databases;}

	public String getDatabases() { return this.databases; }

	public void setNotificationContactTemplates(String notificationContactTemplates) { this.notificationContactTemplates = notificationContactTemplates;}

	public String getNotificationContactTemplates() { return this.notificationContactTemplates; }

	public void setNotificationPlugIns(String notificationPlugIns) { this.notificationPlugIns = notificationPlugIns;}

	public String getNotificationPlugIns() { return this.notificationPlugIns; }

	public void setSecurity(String security) { this.security = security;}

	public String getSecurity() { return this.security; }

	public void setSecurityEntries(String securityEntries) { this.securityEntries = securityEntries;}

	public String getSecurityEntries() { return this.securityEntries; }

	public void setSecurityIdentities(String securityIdentities) { this.securityIdentities = securityIdentities;}

	public String getSecurityIdentities() { return this.securityIdentities; }

	public void setSecurityMappings(String securityMappings) { this.securityMappings = securityMappings;}

	public String getSecurityMappings() { return this.securityMappings; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

	public void setTimeRulePlugIns(String timeRulePlugIns) { this.timeRulePlugIns = timeRulePlugIns;}

	public String getTimeRulePlugIns() { return this.timeRulePlugIns; }

	public void setUnitClasses(String unitClasses) { this.unitClasses = unitClasses;}

	public String getUnitClasses() { return this.unitClasses; }

}
