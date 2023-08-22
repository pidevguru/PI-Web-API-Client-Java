package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAnnotation {
	@SerializedName("CreationDate")
	private String creationDate = null;

	@SerializedName("Creator")
	private String creator = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("Errors")
	private List<PWAPropertyError> errors = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("Links")
	private PWAAnnotationLinks links = null;

	@SerializedName("Modifier")
	private String modifier = null;

	@SerializedName("ModifyDate")
	private String modifyDate = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Value")
	private Object value = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWAAnnotation()  {
	}

	public void setCreationDate(String creationDate) { this.creationDate = creationDate;}

	public String getCreationDate() { return this.creationDate; }

	public void setCreator(String creator) { this.creator = creator;}

	public String getCreator() { return this.creator; }

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setErrors(List<PWAPropertyError> errors) { this.errors = errors;}

	public List<PWAPropertyError> getErrors() { return this.errors; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setLinks(PWAAnnotationLinks links) { this.links = links;}

	public PWAAnnotationLinks getLinks() { return this.links; }

	public void setModifier(String modifier) { this.modifier = modifier;}

	public String getModifier() { return this.modifier; }

	public void setModifyDate(String modifyDate) { this.modifyDate = modifyDate;}

	public String getModifyDate() { return this.modifyDate; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setValue(Object value) { this.value = value;}

	public Object getValue() { return this.value; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
