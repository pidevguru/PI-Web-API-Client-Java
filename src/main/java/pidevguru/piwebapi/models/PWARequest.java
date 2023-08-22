package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWARequest {
	@SerializedName("Content")
	private String content = null;

	@SerializedName("Headers")
	private Map<String, String> headers = null;

	@SerializedName("Method")
	private String method = null;

	@SerializedName("Parameters")
	private List<String> parameters = null;

	@SerializedName("ParentIds")
	private List<String> parentIds = null;

	@SerializedName("RequestTemplate")
	private PWARequestTemplate requestTemplate = null;

	@SerializedName("Resource")
	private String resource = null;

	public PWARequest()  {
	}

	public void setContent(String content) { this.content = content;}

	public String getContent() { return this.content; }

	public void setHeaders(Map<String, String> headers) { this.headers = headers;}

	public Map<String, String> getHeaders() { return this.headers; }

	public void setMethod(String method) { this.method = method;}

	public String getMethod() { return this.method; }

	public void setParameters(List<String> parameters) { this.parameters = parameters;}

	public List<String> getParameters() { return this.parameters; }

	public void setParentIds(List<String> parentIds) { this.parentIds = parentIds;}

	public List<String> getParentIds() { return this.parentIds; }

	public void setRequestTemplate(PWARequestTemplate requestTemplate) { this.requestTemplate = requestTemplate;}

	public PWARequestTemplate getRequestTemplate() { return this.requestTemplate; }

	public void setResource(String resource) { this.resource = resource;}

	public String getResource() { return this.resource; }

}
