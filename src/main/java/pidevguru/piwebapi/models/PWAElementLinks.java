package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAElementLinks {
	@SerializedName("Analyses")
	private String analyses = null;

	@SerializedName("Attributes")
	private String attributes = null;

	@SerializedName("Categories")
	private String categories = null;

	@SerializedName("Database")
	private String database = null;

	@SerializedName("DefaultAttribute")
	private String defaultAttribute = null;

	@SerializedName("Elements")
	private String elements = null;

	@SerializedName("EndValue")
	private String endValue = null;

	@SerializedName("EventFrames")
	private String eventFrames = null;

	@SerializedName("InterpolatedData")
	private String interpolatedData = null;

	@SerializedName("NotificationRules")
	private String notificationRules = null;

	@SerializedName("Parent")
	private String parent = null;

	@SerializedName("PlotData")
	private String plotData = null;

	@SerializedName("RecordedData")
	private String recordedData = null;

	@SerializedName("Security")
	private String security = null;

	@SerializedName("SecurityEntries")
	private String securityEntries = null;

	@SerializedName("Self")
	private String self = null;

	@SerializedName("SummaryData")
	private String summaryData = null;

	@SerializedName("Template")
	private String template = null;

	@SerializedName("Value")
	private String value = null;

	public PWAElementLinks()  {
	}

	public void setAnalyses(String analyses) { this.analyses = analyses;}

	public String getAnalyses() { return this.analyses; }

	public void setAttributes(String attributes) { this.attributes = attributes;}

	public String getAttributes() { return this.attributes; }

	public void setCategories(String categories) { this.categories = categories;}

	public String getCategories() { return this.categories; }

	public void setDatabase(String database) { this.database = database;}

	public String getDatabase() { return this.database; }

	public void setDefaultAttribute(String defaultAttribute) { this.defaultAttribute = defaultAttribute;}

	public String getDefaultAttribute() { return this.defaultAttribute; }

	public void setElements(String elements) { this.elements = elements;}

	public String getElements() { return this.elements; }

	public void setEndValue(String endValue) { this.endValue = endValue;}

	public String getEndValue() { return this.endValue; }

	public void setEventFrames(String eventFrames) { this.eventFrames = eventFrames;}

	public String getEventFrames() { return this.eventFrames; }

	public void setInterpolatedData(String interpolatedData) { this.interpolatedData = interpolatedData;}

	public String getInterpolatedData() { return this.interpolatedData; }

	public void setNotificationRules(String notificationRules) { this.notificationRules = notificationRules;}

	public String getNotificationRules() { return this.notificationRules; }

	public void setParent(String parent) { this.parent = parent;}

	public String getParent() { return this.parent; }

	public void setPlotData(String plotData) { this.plotData = plotData;}

	public String getPlotData() { return this.plotData; }

	public void setRecordedData(String recordedData) { this.recordedData = recordedData;}

	public String getRecordedData() { return this.recordedData; }

	public void setSecurity(String security) { this.security = security;}

	public String getSecurity() { return this.security; }

	public void setSecurityEntries(String securityEntries) { this.securityEntries = securityEntries;}

	public String getSecurityEntries() { return this.securityEntries; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

	public void setSummaryData(String summaryData) { this.summaryData = summaryData;}

	public String getSummaryData() { return this.summaryData; }

	public void setTemplate(String template) { this.template = template;}

	public String getTemplate() { return this.template; }

	public void setValue(String value) { this.value = value;}

	public String getValue() { return this.value; }

}
