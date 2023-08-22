package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAssetServer {
	@SerializedName("Description")
	private String description = null;

	@SerializedName("ExtendedProperties")
	private Map<String, PWAValue> extendedProperties = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("IsConnected")
	private Boolean isConnected = null;

	@SerializedName("Links")
	private PWAAssetServerLinks links = null;

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

	public PWAAssetServer()  {
	}

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setExtendedProperties(Map<String, PWAValue> extendedProperties) { this.extendedProperties = extendedProperties;}

	public Map<String, PWAValue> getExtendedProperties() { return this.extendedProperties; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setIsConnected(Boolean isConnected) { this.isConnected = isConnected;}

	public Boolean getIsConnected() { return this.isConnected; }

	public void setLinks(PWAAssetServerLinks links) { this.links = links;}

	public PWAAssetServerLinks getLinks() { return this.links; }

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
