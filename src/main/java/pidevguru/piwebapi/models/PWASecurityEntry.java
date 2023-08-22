package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWASecurityEntry {
	@SerializedName("AllowRights")
	private List<String> allowRights = null;

	@SerializedName("DenyRights")
	private List<String> denyRights = null;

	@SerializedName("Links")
	private PWASecurityEntryLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("SecurityIdentityName")
	private String securityIdentityName = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWASecurityEntry()  {
	}

	public void setAllowRights(List<String> allowRights) { this.allowRights = allowRights;}

	public List<String> getAllowRights() { return this.allowRights; }

	public void setDenyRights(List<String> denyRights) { this.denyRights = denyRights;}

	public List<String> getDenyRights() { return this.denyRights; }

	public void setLinks(PWASecurityEntryLinks links) { this.links = links;}

	public PWASecurityEntryLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setSecurityIdentityName(String securityIdentityName) { this.securityIdentityName = securityIdentityName;}

	public String getSecurityIdentityName() { return this.securityIdentityName; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
