package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAEnumerationSetLinks {
	@SerializedName("DataServer")
	private String dataServer = null;

	@SerializedName("Database")
	private String database = null;

	@SerializedName("Security")
	private String security = null;

	@SerializedName("SecurityEntries")
	private String securityEntries = null;

	@SerializedName("Self")
	private String self = null;

	@SerializedName("Values")
	private String values = null;

	public PWAEnumerationSetLinks()  {
	}

	public void setDataServer(String dataServer) { this.dataServer = dataServer;}

	public String getDataServer() { return this.dataServer; }

	public void setDatabase(String database) { this.database = database;}

	public String getDatabase() { return this.database; }

	public void setSecurity(String security) { this.security = security;}

	public String getSecurity() { return this.security; }

	public void setSecurityEntries(String securityEntries) { this.securityEntries = securityEntries;}

	public String getSecurityEntries() { return this.securityEntries; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

	public void setValues(String values) { this.values = values;}

	public String getValues() { return this.values; }

}
