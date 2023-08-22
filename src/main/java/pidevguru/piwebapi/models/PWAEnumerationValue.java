package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAEnumerationValue {
	@SerializedName("Description")
	private String description = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("Links")
	private PWAEnumerationValueLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Parent")
	private String parent = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("SerializeDescription")
	private Boolean serializeDescription = null;

	@SerializedName("SerializeId")
	private Boolean serializeId = null;

	@SerializedName("SerializeLinks")
	private Boolean serializeLinks = null;

	@SerializedName("SerializePath")
	private Boolean serializePath = null;

	@SerializedName("SerializeWebId")
	private Boolean serializeWebId = null;

	@SerializedName("Value")
	private Integer value = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	@SerializedName("WebId")
	private String webId = null;

	public PWAEnumerationValue()  {
	}

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description; }

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setLinks(PWAEnumerationValueLinks links) { this.links = links;}

	public PWAEnumerationValueLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setParent(String parent) { this.parent = parent;}

	public String getParent() { return this.parent; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setSerializeDescription(Boolean serializeDescription) { this.serializeDescription = serializeDescription;}

	public Boolean getSerializeDescription() { return this.serializeDescription; }

	public void setSerializeId(Boolean serializeId) { this.serializeId = serializeId;}

	public Boolean getSerializeId() { return this.serializeId; }

	public void setSerializeLinks(Boolean serializeLinks) { this.serializeLinks = serializeLinks;}

	public Boolean getSerializeLinks() { return this.serializeLinks; }

	public void setSerializePath(Boolean serializePath) { this.serializePath = serializePath;}

	public Boolean getSerializePath() { return this.serializePath; }

	public void setSerializeWebId(Boolean serializeWebId) { this.serializeWebId = serializeWebId;}

	public Boolean getSerializeWebId() { return this.serializeWebId; }

	public void setValue(Integer value) { this.value = value;}

	public Integer getValue() { return this.value; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

}
