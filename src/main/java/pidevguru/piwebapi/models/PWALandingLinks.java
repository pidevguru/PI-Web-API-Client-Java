package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWALandingLinks {
	@SerializedName("AssetServers")
	private String assetServers = null;

	@SerializedName("DataServers")
	private String dataServers = null;

	@SerializedName("Search")
	private String search = null;

	@SerializedName("Self")
	private String self = null;

	@SerializedName("System")
	private String system = null;

	public PWALandingLinks()  {
	}

	public void setAssetServers(String assetServers) { this.assetServers = assetServers;}

	public String getAssetServers() { return this.assetServers; }

	public void setDataServers(String dataServers) { this.dataServers = dataServers;}

	public String getDataServers() { return this.dataServers; }

	public void setSearch(String search) { this.search = search;}

	public String getSearch() { return this.search; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

	public void setSystem(String system) { this.system = system;}

	public String getSystem() { return this.system; }

}
