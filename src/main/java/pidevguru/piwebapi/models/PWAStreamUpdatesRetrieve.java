package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAStreamUpdatesRetrieve {
	@SerializedName("Events")
	private List<PWADataPipeEvent> events = null;

	@SerializedName("Exception")
	private PWAErrors exception = null;

	@SerializedName("LatestMarker")
	private String latestMarker = null;

	@SerializedName("RequestedMarker")
	private String requestedMarker = null;

	@SerializedName("Source")
	private String source = null;

	@SerializedName("SourceName")
	private String sourceName = null;

	@SerializedName("SourcePath")
	private String sourcePath = null;

	@SerializedName("Status")
	private String status = null;

	public PWAStreamUpdatesRetrieve()  {
	}

	public void setEvents(List<PWADataPipeEvent> events) { this.events = events;}

	public List<PWADataPipeEvent> getEvents() { return this.events; }

	public void setException(PWAErrors exception) { this.exception = exception;}

	public PWAErrors getException() { return this.exception; }

	public void setLatestMarker(String latestMarker) { this.latestMarker = latestMarker;}

	public String getLatestMarker() { return this.latestMarker; }

	public void setRequestedMarker(String requestedMarker) { this.requestedMarker = requestedMarker;}

	public String getRequestedMarker() { return this.requestedMarker; }

	public void setSource(String source) { this.source = source;}

	public String getSource() { return this.source; }

	public void setSourceName(String sourceName) { this.sourceName = sourceName;}

	public String getSourceName() { return this.sourceName; }

	public void setSourcePath(String sourcePath) { this.sourcePath = sourcePath;}

	public String getSourcePath() { return this.sourcePath; }

	public void setStatus(String status) { this.status = status;}

	public String getStatus() { return this.status; }

}
