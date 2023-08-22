package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAnalysisRulePlugInLinks {
	@SerializedName("AssetServer")
	private String assetServer = null;

	@SerializedName("Self")
	private String self = null;

	public PWAAnalysisRulePlugInLinks()  {
	}

	public void setAssetServer(String assetServer) { this.assetServer = assetServer;}

	public String getAssetServer() { return this.assetServer; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

}
