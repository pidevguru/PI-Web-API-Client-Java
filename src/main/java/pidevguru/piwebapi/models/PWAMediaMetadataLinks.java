package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAMediaMetadataLinks {
	@SerializedName("MediaData")
	private String mediaData = null;

	@SerializedName("Owner")
	private String owner = null;

	@SerializedName("Self")
	private String self = null;

	public PWAMediaMetadataLinks()  {
	}

	public void setMediaData(String mediaData) { this.mediaData = mediaData;}

	public String getMediaData() { return this.mediaData; }

	public void setOwner(String owner) { this.owner = owner;}

	public String getOwner() { return this.owner; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

}
