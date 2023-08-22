package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWASecurityEntryLinks {
	@SerializedName("SecurableObject")
	private String securableObject = null;

	@SerializedName("SecurityIdentity")
	private String securityIdentity = null;

	@SerializedName("Self")
	private String self = null;

	public PWASecurityEntryLinks()  {
	}

	public void setSecurableObject(String securableObject) { this.securableObject = securableObject;}

	public String getSecurableObject() { return this.securableObject; }

	public void setSecurityIdentity(String securityIdentity) { this.securityIdentity = securityIdentity;}

	public String getSecurityIdentity() { return this.securityIdentity; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

}
