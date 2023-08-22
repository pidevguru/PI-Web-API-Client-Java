package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAPointLinks {
	@SerializedName("Attributes")
	private String attributes = null;

	@SerializedName("DataServer")
	private String dataServer = null;

	@SerializedName("EndValue")
	private String endValue = null;

	@SerializedName("InterpolatedData")
	private String interpolatedData = null;

	@SerializedName("PlotData")
	private String plotData = null;

	@SerializedName("RecordedData")
	private String recordedData = null;

	@SerializedName("Self")
	private String self = null;

	@SerializedName("SummaryData")
	private String summaryData = null;

	@SerializedName("Value")
	private String value = null;

	public PWAPointLinks()  {
	}

	public void setAttributes(String attributes) { this.attributes = attributes;}

	public String getAttributes() { return this.attributes; }

	public void setDataServer(String dataServer) { this.dataServer = dataServer;}

	public String getDataServer() { return this.dataServer; }

	public void setEndValue(String endValue) { this.endValue = endValue;}

	public String getEndValue() { return this.endValue; }

	public void setInterpolatedData(String interpolatedData) { this.interpolatedData = interpolatedData;}

	public String getInterpolatedData() { return this.interpolatedData; }

	public void setPlotData(String plotData) { this.plotData = plotData;}

	public String getPlotData() { return this.plotData; }

	public void setRecordedData(String recordedData) { this.recordedData = recordedData;}

	public String getRecordedData() { return this.recordedData; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

	public void setSummaryData(String summaryData) { this.summaryData = summaryData;}

	public String getSummaryData() { return this.summaryData; }

	public void setValue(String value) { this.value = value;}

	public String getValue() { return this.value; }

}
