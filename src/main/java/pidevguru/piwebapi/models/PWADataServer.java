package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWADataServer {
	@SerializedName("Id")
	private String id = null;

	@SerializedName("IsConnected")
	private Boolean isConnected = null;

	@SerializedName("Links")
	private PWADataServerLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("ServerTime")
	private String serverTime = null;

	@SerializedName("ServerVersion")
	private String serverVersion = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	public PWADataServer()  {
	}

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setIsConnected(Boolean isConnected) { this.isConnected = isConnected;}

	public Boolean getIsConnected() { return this.isConnected; }

	public void setLinks(PWADataServerLinks links) { this.links = links;}

	public PWADataServerLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setServerTime(String serverTime) { this.serverTime = serverTime;}

	public String getServerTime() { return this.serverTime; }

	public void setServerVersion(String serverVersion) { this.serverVersion = serverVersion;}

	public String getServerVersion() { return this.serverVersion; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

}
