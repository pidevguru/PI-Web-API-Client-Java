package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAttributeLinks {
	@SerializedName("Attributes")
	private String attributes = null;

	@SerializedName("Categories")
	private String categories = null;

	@SerializedName("Element")
	private String element = null;

	@SerializedName("EndValue")
	private String endValue = null;

	@SerializedName("EnumerationSet")
	private String enumerationSet = null;

	@SerializedName("EnumerationValues")
	private String enumerationValues = null;

	@SerializedName("EventFrame")
	private String eventFrame = null;

	@SerializedName("InterpolatedData")
	private String interpolatedData = null;

	@SerializedName("Parent")
	private String parent = null;

	@SerializedName("PlotData")
	private String plotData = null;

	@SerializedName("Point")
	private String point = null;

	@SerializedName("RecordedData")
	private String recordedData = null;

	@SerializedName("Self")
	private String self = null;

	@SerializedName("SummaryData")
	private String summaryData = null;

	@SerializedName("Template")
	private String template = null;

	@SerializedName("Trait")
	private String trait = null;

	@SerializedName("Value")
	private String value = null;

	public PWAAttributeLinks()  {
	}

	public void setAttributes(String attributes) { this.attributes = attributes;}

	public String getAttributes() { return this.attributes; }

	public void setCategories(String categories) { this.categories = categories;}

	public String getCategories() { return this.categories; }

	public void setElement(String element) { this.element = element;}

	public String getElement() { return this.element; }

	public void setEndValue(String endValue) { this.endValue = endValue;}

	public String getEndValue() { return this.endValue; }

	public void setEnumerationSet(String enumerationSet) { this.enumerationSet = enumerationSet;}

	public String getEnumerationSet() { return this.enumerationSet; }

	public void setEnumerationValues(String enumerationValues) { this.enumerationValues = enumerationValues;}

	public String getEnumerationValues() { return this.enumerationValues; }

	public void setEventFrame(String eventFrame) { this.eventFrame = eventFrame;}

	public String getEventFrame() { return this.eventFrame; }

	public void setInterpolatedData(String interpolatedData) { this.interpolatedData = interpolatedData;}

	public String getInterpolatedData() { return this.interpolatedData; }

	public void setParent(String parent) { this.parent = parent;}

	public String getParent() { return this.parent; }

	public void setPlotData(String plotData) { this.plotData = plotData;}

	public String getPlotData() { return this.plotData; }

	public void setPoint(String point) { this.point = point;}

	public String getPoint() { return this.point; }

	public void setRecordedData(String recordedData) { this.recordedData = recordedData;}

	public String getRecordedData() { return this.recordedData; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

	public void setSummaryData(String summaryData) { this.summaryData = summaryData;}

	public String getSummaryData() { return this.summaryData; }

	public void setTemplate(String template) { this.template = template;}

	public String getTemplate() { return this.template; }

	public void setTrait(String trait) { this.trait = trait;}

	public String getTrait() { return this.trait; }

	public void setValue(String value) { this.value = value;}

	public String getValue() { return this.value; }

}
