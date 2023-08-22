package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAUnit {
	@SerializedName("Abbreviation")
	private String abbreviation = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("Factor")
	private Double factor = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("Links")
	private PWAUnitLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Offset")
	private Double offset = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("ReferenceFactor")
	private Double referenceFactor = null;

	@SerializedName("ReferenceOffset")
	private Double referenceOffset = null;

	@SerializedName("ReferenceUnitAbbreviation")
	private String referenceUnitAbbreviation = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	public PWAUnit()  {
	}

	public void setAbbreviation(String abbreviation) { this.abbreviation = abbreviation;}

	public String getAbbreviation() { return this.abbreviation; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setFactor(Double factor) { this.factor = factor;}

	public Double getFactor() { return this.factor; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setLinks(PWAUnitLinks links) { this.links = links;}

	public PWAUnitLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setOffset(Double offset) { this.offset = offset;}

	public Double getOffset() { return this.offset; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setReferenceFactor(Double referenceFactor) { this.referenceFactor = referenceFactor;}

	public Double getReferenceFactor() { return this.referenceFactor; }

	public void setReferenceOffset(Double referenceOffset) { this.referenceOffset = referenceOffset;}

	public Double getReferenceOffset() { return this.referenceOffset; }

	public void setReferenceUnitAbbreviation(String referenceUnitAbbreviation) { this.referenceUnitAbbreviation = referenceUnitAbbreviation;}

	public String getReferenceUnitAbbreviation() { return this.referenceUnitAbbreviation; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

}
