package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWANotificationContactTemplateLinks {
	@SerializedName("AssetServer")
	private String assetServer = null;

	@SerializedName("NotificationContactTemplates")
	private String notificationContactTemplates = null;

	@SerializedName("NotificationPlugIn")
	private String notificationPlugIn = null;

	@SerializedName("Security")
	private String security = null;

	@SerializedName("SecurityEntries")
	private String securityEntries = null;

	@SerializedName("Self")
	private String self = null;

	public PWANotificationContactTemplateLinks()  {
	}

	public void setAssetServer(String assetServer) { this.assetServer = assetServer;}

	public String getAssetServer() { return this.assetServer; }

	public void setNotificationContactTemplates(String notificationContactTemplates) { this.notificationContactTemplates = notificationContactTemplates;}

	public String getNotificationContactTemplates() { return this.notificationContactTemplates; }

	public void setNotificationPlugIn(String notificationPlugIn) { this.notificationPlugIn = notificationPlugIn;}

	public String getNotificationPlugIn() { return this.notificationPlugIn; }

	public void setSecurity(String security) { this.security = security;}

	public String getSecurity() { return this.security; }

	public void setSecurityEntries(String securityEntries) { this.securityEntries = securityEntries;}

	public String getSecurityEntries() { return this.securityEntries; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

}
