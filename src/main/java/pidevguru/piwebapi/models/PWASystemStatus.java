package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWASystemStatus {
	@SerializedName("CacheInstances")
	private Integer cacheInstances = null;

	@SerializedName("ServerTime")
	private String serverTime = null;

	@SerializedName("State")
	private String state = null;

	@SerializedName("UpTimeInMinutes")
	private Double upTimeInMinutes = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWASystemStatus()  {
	}

	public void setCacheInstances(Integer cacheInstances) { this.cacheInstances = cacheInstances;}

	public Integer getCacheInstances() { return this.cacheInstances; }

	public void setServerTime(String serverTime) { this.serverTime = serverTime;}

	public String getServerTime() { return this.serverTime; }

	public void setState(String state) { this.state = state;}

	public String getState() { return this.state; }

	public void setUpTimeInMinutes(Double upTimeInMinutes) { this.upTimeInMinutes = upTimeInMinutes;}

	public Double getUpTimeInMinutes() { return this.upTimeInMinutes; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
