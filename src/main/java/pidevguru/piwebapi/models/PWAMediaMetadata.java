package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAMediaMetadata {
	@SerializedName("Author")
	private String author = null;

	@SerializedName("ChangeDate")
	private String changeDate = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("Links")
	private PWAMediaMetadataLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Size")
	private Double size = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWAMediaMetadata()  {
	}

	public void setAuthor(String author) { this.author = author;}

	public String getAuthor() { return this.author; }

	public void setChangeDate(String changeDate) { this.changeDate = changeDate;}

	public String getChangeDate() { return this.changeDate; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setLinks(PWAMediaMetadataLinks links) { this.links = links;}

	public PWAMediaMetadataLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setSize(Double size) { this.size = size;}

	public Double getSize() { return this.size; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
