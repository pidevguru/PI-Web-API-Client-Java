package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWASecurityMappingLinks {
	@SerializedName("AssetServer")
	private String assetServer = null;

	@SerializedName("Security")
	private String security = null;

	@SerializedName("SecurityEntries")
	private String securityEntries = null;

	@SerializedName("SecurityIdentity")
	private String securityIdentity = null;

	@SerializedName("Self")
	private String self = null;

	public PWASecurityMappingLinks()  {
	}

	public void setAssetServer(String assetServer) { this.assetServer = assetServer;}

	public String getAssetServer() { return this.assetServer; }

	public void setSecurity(String security) { this.security = security;}

	public String getSecurity() { return this.security; }

	public void setSecurityEntries(String securityEntries) { this.securityEntries = securityEntries;}

	public String getSecurityEntries() { return this.securityEntries; }

	public void setSecurityIdentity(String securityIdentity) { this.securityIdentity = securityIdentity;}

	public String getSecurityIdentity() { return this.securityIdentity; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

}
