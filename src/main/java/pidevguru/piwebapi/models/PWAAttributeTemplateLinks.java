package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAttributeTemplateLinks {
	@SerializedName("AttributeTemplates")
	private String attributeTemplates = null;

	@SerializedName("Categories")
	private String categories = null;

	@SerializedName("ElementTemplate")
	private String elementTemplate = null;

	@SerializedName("Parent")
	private String parent = null;

	@SerializedName("Self")
	private String self = null;

	@SerializedName("Trait")
	private String trait = null;

	public PWAAttributeTemplateLinks()  {
	}

	public void setAttributeTemplates(String attributeTemplates) { this.attributeTemplates = attributeTemplates;}

	public String getAttributeTemplates() { return this.attributeTemplates; }

	public void setCategories(String categories) { this.categories = categories;}

	public String getCategories() { return this.categories; }

	public void setElementTemplate(String elementTemplate) { this.elementTemplate = elementTemplate;}

	public String getElementTemplate() { return this.elementTemplate; }

	public void setParent(String parent) { this.parent = parent;}

	public String getParent() { return this.parent; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

	public void setTrait(String trait) { this.trait = trait;}

	public String getTrait() { return this.trait; }

}
