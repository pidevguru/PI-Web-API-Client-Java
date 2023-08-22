package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAttributeTrait {
	@SerializedName("Abbreviation")
	private String abbreviation = null;

	@SerializedName("AllowChildAttributes")
	private Boolean allowChildAttributes = null;

	@SerializedName("AllowDuplicates")
	private Boolean allowDuplicates = null;

	@SerializedName("IsAllowedOnRootAttribute")
	private Boolean isAllowedOnRootAttribute = null;

	@SerializedName("IsTypeInherited")
	private Boolean isTypeInherited = null;

	@SerializedName("IsUOMInherited")
	private Boolean isUOMInherited = null;

	@SerializedName("Links")
	private PWAAttributeTraitLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("RequireNumeric")
	private Boolean requireNumeric = null;

	@SerializedName("RequireString")
	private Boolean requireString = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWAAttributeTrait()  {
	}

	public void setAbbreviation(String abbreviation) { this.abbreviation = abbreviation;}

	public String getAbbreviation() { return this.abbreviation; }

	public void setAllowChildAttributes(Boolean allowChildAttributes) { this.allowChildAttributes = allowChildAttributes;}

	public Boolean getAllowChildAttributes() { return this.allowChildAttributes; }

	public void setAllowDuplicates(Boolean allowDuplicates) { this.allowDuplicates = allowDuplicates;}

	public Boolean getAllowDuplicates() { return this.allowDuplicates; }

	public void setIsAllowedOnRootAttribute(Boolean isAllowedOnRootAttribute) { this.isAllowedOnRootAttribute = isAllowedOnRootAttribute;}

	public Boolean getIsAllowedOnRootAttribute() { return this.isAllowedOnRootAttribute; }

	public void setIsTypeInherited(Boolean isTypeInherited) { this.isTypeInherited = isTypeInherited;}

	public Boolean getIsTypeInherited() { return this.isTypeInherited; }

	public void setIsUOMInherited(Boolean isUOMInherited) { this.isUOMInherited = isUOMInherited;}

	public Boolean getIsUOMInherited() { return this.isUOMInherited; }

	public void setLinks(PWAAttributeTraitLinks links) { this.links = links;}

	public PWAAttributeTraitLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setRequireNumeric(Boolean requireNumeric) { this.requireNumeric = requireNumeric;}

	public Boolean getRequireNumeric() { return this.requireNumeric; }

	public void setRequireString(Boolean requireString) { this.requireString = requireString;}

	public Boolean getRequireString() { return this.requireString; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
