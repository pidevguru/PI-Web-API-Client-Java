package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAnalysisTemplateLinks {
	@SerializedName("AnalysisRule")
	private String analysisRule = null;

	@SerializedName("AnalysisRulePlugIn")
	private String analysisRulePlugIn = null;

	@SerializedName("Categories")
	private String categories = null;

	@SerializedName("Database")
	private String database = null;

	@SerializedName("Security")
	private String security = null;

	@SerializedName("SecurityEntries")
	private String securityEntries = null;

	@SerializedName("Self")
	private String self = null;

	@SerializedName("Target")
	private String target = null;

	@SerializedName("TimeRule")
	private String timeRule = null;

	@SerializedName("TimeRulePlugIn")
	private String timeRulePlugIn = null;

	public PWAAnalysisTemplateLinks()  {
	}

	public void setAnalysisRule(String analysisRule) { this.analysisRule = analysisRule;}

	public String getAnalysisRule() { return this.analysisRule; }

	public void setAnalysisRulePlugIn(String analysisRulePlugIn) { this.analysisRulePlugIn = analysisRulePlugIn;}

	public String getAnalysisRulePlugIn() { return this.analysisRulePlugIn; }

	public void setCategories(String categories) { this.categories = categories;}

	public String getCategories() { return this.categories; }

	public void setDatabase(String database) { this.database = database;}

	public String getDatabase() { return this.database; }

	public void setSecurity(String security) { this.security = security;}

	public String getSecurity() { return this.security; }

	public void setSecurityEntries(String securityEntries) { this.securityEntries = securityEntries;}

	public String getSecurityEntries() { return this.securityEntries; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

	public void setTarget(String target) { this.target = target;}

	public String getTarget() { return this.target; }

	public void setTimeRule(String timeRule) { this.timeRule = timeRule;}

	public String getTimeRule() { return this.timeRule; }

	public void setTimeRulePlugIn(String timeRulePlugIn) { this.timeRulePlugIn = timeRulePlugIn;}

	public String getTimeRulePlugIn() { return this.timeRulePlugIn; }

}
