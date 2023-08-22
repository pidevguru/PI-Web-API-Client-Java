package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAnnotationLinks {
	@SerializedName("MediaData")
	private String mediaData = null;

	@SerializedName("MediaMetadata")
	private String mediaMetadata = null;

	@SerializedName("Owner")
	private String owner = null;

	@SerializedName("Self")
	private String self = null;

	public PWAAnnotationLinks()  {
	}

	public void setMediaData(String mediaData) { this.mediaData = mediaData;}

	public String getMediaData() { return this.mediaData; }

	public void setMediaMetadata(String mediaMetadata) { this.mediaMetadata = mediaMetadata;}

	public String getMediaMetadata() { return this.mediaMetadata; }

	public void setOwner(String owner) { this.owner = owner;}

	public String getOwner() { return this.owner; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

}
