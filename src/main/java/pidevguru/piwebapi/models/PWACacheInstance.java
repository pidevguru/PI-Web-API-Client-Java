package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWACacheInstance {
	@SerializedName("Id")
	private String id = null;

	@SerializedName("LastRefreshTime")
	private String lastRefreshTime = null;

	@SerializedName("ScheduledExpirationTime")
	private String scheduledExpirationTime = null;

	@SerializedName("User")
	private String user = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WillRefreshAfter")
	private String willRefreshAfter = null;

	public PWACacheInstance()  {
	}

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setLastRefreshTime(String lastRefreshTime) { this.lastRefreshTime = lastRefreshTime;}

	public String getLastRefreshTime() { return this.lastRefreshTime; }

	public void setScheduledExpirationTime(String scheduledExpirationTime) { this.scheduledExpirationTime = scheduledExpirationTime;}

	public String getScheduledExpirationTime() { return this.scheduledExpirationTime; }

	public void setUser(String user) { this.user = user;}

	public String getUser() { return this.user; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWillRefreshAfter(String willRefreshAfter) { this.willRefreshAfter = willRefreshAfter;}

	public String getWillRefreshAfter() { return this.willRefreshAfter; }

}
