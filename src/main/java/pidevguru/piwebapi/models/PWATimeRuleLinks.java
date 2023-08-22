package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWATimeRuleLinks {
	@SerializedName("Analysis")
	private String analysis = null;

	@SerializedName("AnalysisTemplate")
	private String analysisTemplate = null;

	@SerializedName("PlugIn")
	private String plugIn = null;

	@SerializedName("Self")
	private String self = null;

	public PWATimeRuleLinks()  {
	}

	public void setAnalysis(String analysis) { this.analysis = analysis;}

	public String getAnalysis() { return this.analysis; }

	public void setAnalysisTemplate(String analysisTemplate) { this.analysisTemplate = analysisTemplate;}

	public String getAnalysisTemplate() { return this.analysisTemplate; }

	public void setPlugIn(String plugIn) { this.plugIn = plugIn;}

	public String getPlugIn() { return this.plugIn; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

}
