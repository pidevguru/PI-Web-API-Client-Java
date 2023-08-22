package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAUserInfo {
	@SerializedName("IdentityType")
	private String identityType = null;

	@SerializedName("ImpersonationLevel")
	private String impersonationLevel = null;

	@SerializedName("IsAuthenticated")
	private Boolean isAuthenticated = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("SID")
	private String sID = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWAUserInfo()  {
	}

	public void setIdentityType(String identityType) { this.identityType = identityType;}

	public String getIdentityType() { return this.identityType; }

	public void setImpersonationLevel(String impersonationLevel) { this.impersonationLevel = impersonationLevel;}

	public String getImpersonationLevel() { return this.impersonationLevel; }

	public void setIsAuthenticated(Boolean isAuthenticated) { this.isAuthenticated = isAuthenticated;}

	public Boolean getIsAuthenticated() { return this.isAuthenticated; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setSID(String sID) { this.sID = sID;}

	public String getSID() { return this.sID; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
