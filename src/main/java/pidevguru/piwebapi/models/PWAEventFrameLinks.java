package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAEventFrameLinks {
	@SerializedName("Annotations")
	private String annotations = null;

	@SerializedName("Attributes")
	private String attributes = null;

	@SerializedName("Categories")
	private String categories = null;

	@SerializedName("Database")
	private String database = null;

	@SerializedName("DefaultAttribute")
	private String defaultAttribute = null;

	@SerializedName("EndValue")
	private String endValue = null;

	@SerializedName("EventFrames")
	private String eventFrames = null;

	@SerializedName("InterpolatedData")
	private String interpolatedData = null;

	@SerializedName("Parent")
	private String parent = null;

	@SerializedName("PlotData")
	private String plotData = null;

	@SerializedName("PrimaryReferencedElement")
	private String primaryReferencedElement = null;

	@SerializedName("RecordedData")
	private String recordedData = null;

	@SerializedName("ReferencedElements")
	private String referencedElements = null;

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

	public PWAEventFrameLinks()  {
	}

	public void setAnnotations(String annotations) { this.annotations = annotations;}

	public String getAnnotations() { return this.annotations; }

	public void setAttributes(String attributes) { this.attributes = attributes;}

	public String getAttributes() { return this.attributes; }

	public void setCategories(String categories) { this.categories = categories;}

	public String getCategories() { return this.categories; }

	public void setDatabase(String database) { this.database = database;}

	public String getDatabase() { return this.database; }

	public void setDefaultAttribute(String defaultAttribute) { this.defaultAttribute = defaultAttribute;}

	public String getDefaultAttribute() { return this.defaultAttribute; }

	public void setEndValue(String endValue) { this.endValue = endValue;}

	public String getEndValue() { return this.endValue; }

	public void setEventFrames(String eventFrames) { this.eventFrames = eventFrames;}

	public String getEventFrames() { return this.eventFrames; }

	public void setInterpolatedData(String interpolatedData) { this.interpolatedData = interpolatedData;}

	public String getInterpolatedData() { return this.interpolatedData; }

	public void setParent(String parent) { this.parent = parent;}

	public String getParent() { return this.parent; }

	public void setPlotData(String plotData) { this.plotData = plotData;}

	public String getPlotData() { return this.plotData; }

	public void setPrimaryReferencedElement(String primaryReferencedElement) { this.primaryReferencedElement = primaryReferencedElement;}

	public String getPrimaryReferencedElement() { return this.primaryReferencedElement; }

	public void setRecordedData(String recordedData) { this.recordedData = recordedData;}

	public String getRecordedData() { return this.recordedData; }

	public void setReferencedElements(String referencedElements) { this.referencedElements = referencedElements;}

	public String getReferencedElements() { return this.referencedElements; }

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
