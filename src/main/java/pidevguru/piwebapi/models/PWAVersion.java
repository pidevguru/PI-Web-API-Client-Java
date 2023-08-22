package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAVersion {
	@SerializedName("Build")
	private String build = null;

	@SerializedName("FullVersion")
	private String fullVersion = null;

	@SerializedName("MajorMinorRevision")
	private String majorMinorRevision = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWAVersion()  {
	}

	public void setBuild(String build) { this.build = build;}

	public String getBuild() { return this.build; }

	public void setFullVersion(String fullVersion) { this.fullVersion = fullVersion;}

	public String getFullVersion() { return this.fullVersion; }

	public void setMajorMinorRevision(String majorMinorRevision) { this.majorMinorRevision = majorMinorRevision;}

	public String getMajorMinorRevision() { return this.majorMinorRevision; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
