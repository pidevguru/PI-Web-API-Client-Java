package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWASecurityMapping {
	@SerializedName("Account")
	private String account = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("Links")
	private PWASecurityMappingLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("SecurityIdentityWebId")
	private String securityIdentityWebId = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	public PWASecurityMapping()  {
	}

	public void setAccount(String account) { this.account = account;}

	public String getAccount() { return this.account; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setLinks(PWASecurityMappingLinks links) { this.links = links;}

	public PWASecurityMappingLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setSecurityIdentityWebId(String securityIdentityWebId) { this.securityIdentityWebId = securityIdentityWebId;}

	public String getSecurityIdentityWebId() { return this.securityIdentityWebId; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

}
