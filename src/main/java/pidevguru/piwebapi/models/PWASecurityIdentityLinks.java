package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWASecurityIdentityLinks {
	@SerializedName("AssetServer")
	private String assetServer = null;

	@SerializedName("Security")
	private String security = null;

	@SerializedName("SecurityEntries")
	private String securityEntries = null;

	@SerializedName("SecurityMappings")
	private String securityMappings = null;

	@SerializedName("Self")
	private String self = null;

	public PWASecurityIdentityLinks()  {
	}

	public void setAssetServer(String assetServer) { this.assetServer = assetServer;}

	public String getAssetServer() { return this.assetServer; }

	public void setSecurity(String security) { this.security = security;}

	public String getSecurity() { return this.security; }

	public void setSecurityEntries(String securityEntries) { this.securityEntries = securityEntries;}

	public String getSecurityEntries() { return this.securityEntries; }

	public void setSecurityMappings(String securityMappings) { this.securityMappings = securityMappings;}

	public String getSecurityMappings() { return this.securityMappings; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

}
