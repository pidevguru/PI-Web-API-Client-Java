package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAUnitClassLinks {
	@SerializedName("AssetServer")
	private String assetServer = null;

	@SerializedName("CanonicalUnit")
	private String canonicalUnit = null;

	@SerializedName("Self")
	private String self = null;

	@SerializedName("Units")
	private String units = null;

	public PWAUnitClassLinks()  {
	}

	public void setAssetServer(String assetServer) { this.assetServer = assetServer;}

	public String getAssetServer() { return this.assetServer; }

	public void setCanonicalUnit(String canonicalUnit) { this.canonicalUnit = canonicalUnit;}

	public String getCanonicalUnit() { return this.canonicalUnit; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

	public void setUnits(String units) { this.units = units;}

	public String getUnits() { return this.units; }

}
