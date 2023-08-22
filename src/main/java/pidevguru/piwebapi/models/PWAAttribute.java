package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAttribute {
	@SerializedName("CategoryNames")
	private List<String> categoryNames = null;

	@SerializedName("ConfigString")
	private String configString = null;

	@SerializedName("DataReference")
	private PWADataReference dataReference = null;

	@SerializedName("DataReferencePlugIn")
	private String dataReferencePlugIn = null;

	@SerializedName("DefaultUnitsName")
	private String defaultUnitsName = null;

	@SerializedName("DefaultUnitsNameAbbreviation")
	private String defaultUnitsNameAbbreviation = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("DisplayDigits")
	private Integer displayDigits = null;

	@SerializedName("HasChildren")
	private Boolean hasChildren = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("IsConfigurationItem")
	private Boolean isConfigurationItem = null;

	@SerializedName("IsExcluded")
	private Boolean isExcluded = null;

	@SerializedName("IsHidden")
	private Boolean isHidden = null;

	@SerializedName("IsManualDataEntry")
	private Boolean isManualDataEntry = null;

	@SerializedName("Links")
	private PWAAttributeLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("Paths")
	private List<String> paths = null;

	@SerializedName("Span")
	private Double span = null;

	@SerializedName("Step")
	private Boolean step = null;

	@SerializedName("TraitName")
	private String traitName = null;

	@SerializedName("Type")
	private String type = null;

	@SerializedName("TypeQualifier")
	private String typeQualifier = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	@SerializedName("Zero")
	private Double zero = null;

	public PWAAttribute()  {
	}

	public void setCategoryNames(List<String> categoryNames) { this.categoryNames = categoryNames;}

	public List<String> getCategoryNames() { return this.categoryNames; }

	public void setConfigString(String configString) { this.configString = configString;}

	public String getConfigString() { return this.configString; }

	public void setDataReference(PWADataReference dataReference) { this.dataReference = dataReference;}

	public PWADataReference getDataReference() { return this.dataReference; }

	public void setDataReferencePlugIn(String dataReferencePlugIn) { this.dataReferencePlugIn = dataReferencePlugIn;}

	public String getDataReferencePlugIn() { return this.dataReferencePlugIn; }

	public void setDefaultUnitsName(String defaultUnitsName) { this.defaultUnitsName = defaultUnitsName;}

	public String getDefaultUnitsName() { return this.defaultUnitsName; }

	public void setDefaultUnitsNameAbbreviation(String defaultUnitsNameAbbreviation) { this.defaultUnitsNameAbbreviation = defaultUnitsNameAbbreviation;}

	public String getDefaultUnitsNameAbbreviation() { return this.defaultUnitsNameAbbreviation; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setDisplayDigits(Integer displayDigits) { this.displayDigits = displayDigits;}

	public Integer getDisplayDigits() { return this.displayDigits; }

	public void setHasChildren(Boolean hasChildren) { this.hasChildren = hasChildren;}

	public Boolean getHasChildren() { return this.hasChildren; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setIsConfigurationItem(Boolean isConfigurationItem) { this.isConfigurationItem = isConfigurationItem;}

	public Boolean getIsConfigurationItem() { return this.isConfigurationItem; }

	public void setIsExcluded(Boolean isExcluded) { this.isExcluded = isExcluded;}

	public Boolean getIsExcluded() { return this.isExcluded; }

	public void setIsHidden(Boolean isHidden) { this.isHidden = isHidden;}

	public Boolean getIsHidden() { return this.isHidden; }

	public void setIsManualDataEntry(Boolean isManualDataEntry) { this.isManualDataEntry = isManualDataEntry;}

	public Boolean getIsManualDataEntry() { return this.isManualDataEntry; }

	public void setLinks(PWAAttributeLinks links) { this.links = links;}

	public PWAAttributeLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setPaths(List<String> paths) { this.paths = paths;}

	public List<String> getPaths() { return this.paths; }

	public void setSpan(Double span) { this.span = span;}

	public Double getSpan() { return this.span; }

	public void setStep(Boolean step) { this.step = step;}

	public Boolean getStep() { return this.step; }

	public void setTraitName(String traitName) { this.traitName = traitName;}

	public String getTraitName() { return this.traitName; }

	public void setType(String type) { this.type = type;}

	public String getType() { return this.type; }

	public void setTypeQualifier(String typeQualifier) { this.typeQualifier = typeQualifier;}

	public String getTypeQualifier() { return this.typeQualifier; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

	public void setZero(Double zero) { this.zero = zero;}

	public Double getZero() { return this.zero; }

}
