package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWASecurityRights {
	@SerializedName("CanAnnotate")
	private Boolean canAnnotate = null;

	@SerializedName("CanDelete")
	private Boolean canDelete = null;

	@SerializedName("CanExecute")
	private Boolean canExecute = null;

	@SerializedName("CanRead")
	private Boolean canRead = null;

	@SerializedName("CanReadData")
	private Boolean canReadData = null;

	@SerializedName("CanSubscribe")
	private Boolean canSubscribe = null;

	@SerializedName("CanSubscribeOthers")
	private Boolean canSubscribeOthers = null;

	@SerializedName("CanWrite")
	private Boolean canWrite = null;

	@SerializedName("CanWriteData")
	private Boolean canWriteData = null;

	@SerializedName("HasAdmin")
	private Boolean hasAdmin = null;

	@SerializedName("Links")
	private PWASecurityRightsLinks links = null;

	@SerializedName("OwnerWebId")
	private String ownerWebId = null;

	@SerializedName("Rights")
	private List<String> rights = null;

	@SerializedName("SecurityItem")
	private String securityItem = null;

	@SerializedName("UserIdentity")
	private String userIdentity = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWASecurityRights()  {
	}

	public void setCanAnnotate(Boolean canAnnotate) { this.canAnnotate = canAnnotate;}

	public Boolean getCanAnnotate() { return this.canAnnotate; }

	public void setCanDelete(Boolean canDelete) { this.canDelete = canDelete;}

	public Boolean getCanDelete() { return this.canDelete; }

	public void setCanExecute(Boolean canExecute) { this.canExecute = canExecute;}

	public Boolean getCanExecute() { return this.canExecute; }

	public void setCanRead(Boolean canRead) { this.canRead = canRead;}

	public Boolean getCanRead() { return this.canRead; }

	public void setCanReadData(Boolean canReadData) { this.canReadData = canReadData;}

	public Boolean getCanReadData() { return this.canReadData; }

	public void setCanSubscribe(Boolean canSubscribe) { this.canSubscribe = canSubscribe;}

	public Boolean getCanSubscribe() { return this.canSubscribe; }

	public void setCanSubscribeOthers(Boolean canSubscribeOthers) { this.canSubscribeOthers = canSubscribeOthers;}

	public Boolean getCanSubscribeOthers() { return this.canSubscribeOthers; }

	public void setCanWrite(Boolean canWrite) { this.canWrite = canWrite;}

	public Boolean getCanWrite() { return this.canWrite; }

	public void setCanWriteData(Boolean canWriteData) { this.canWriteData = canWriteData;}

	public Boolean getCanWriteData() { return this.canWriteData; }

	public void setHasAdmin(Boolean hasAdmin) { this.hasAdmin = hasAdmin;}

	public Boolean getHasAdmin() { return this.hasAdmin; }

	public void setLinks(PWASecurityRightsLinks links) { this.links = links;}

	public PWASecurityRightsLinks getLinks() { return this.links; }

	public void setOwnerWebId(String ownerWebId) { this.ownerWebId = ownerWebId;}

	public String getOwnerWebId() { return this.ownerWebId; }

	public void setRights(List<String> rights) { this.rights = rights;}

	public List<String> getRights() { return this.rights; }

	public void setSecurityItem(String securityItem) { this.securityItem = securityItem;}

	public String getSecurityItem() { return this.securityItem; }

	public void setUserIdentity(String userIdentity) { this.userIdentity = userIdentity;}

	public String getUserIdentity() { return this.userIdentity; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
