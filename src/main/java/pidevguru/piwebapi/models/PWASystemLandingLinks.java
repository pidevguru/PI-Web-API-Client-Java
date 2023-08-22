package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWASystemLandingLinks {
	@SerializedName("CacheInstances")
	private String cacheInstances = null;

	@SerializedName("Configuration")
	private String configuration = null;

	@SerializedName("Self")
	private String self = null;

	@SerializedName("Status")
	private String status = null;

	@SerializedName("UserInfo")
	private String userInfo = null;

	@SerializedName("Versions")
	private String versions = null;

	public PWASystemLandingLinks()  {
	}

	public void setCacheInstances(String cacheInstances) { this.cacheInstances = cacheInstances;}

	public String getCacheInstances() { return this.cacheInstances; }

	public void setConfiguration(String configuration) { this.configuration = configuration;}

	public String getConfiguration() { return this.configuration; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

	public void setStatus(String status) { this.status = status;}

	public String getStatus() { return this.status; }

	public void setUserInfo(String userInfo) { this.userInfo = userInfo;}

	public String getUserInfo() { return this.userInfo; }

	public void setVersions(String versions) { this.versions = versions;}

	public String getVersions() { return this.versions; }

}
