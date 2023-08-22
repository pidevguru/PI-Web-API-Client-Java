package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAResponse {
	@SerializedName("Content")
	private Object content = null;

	@SerializedName("Headers")
	private Map<String, String> headers = null;

	@SerializedName("Status")
	private Integer status = null;

	public PWAResponse()  {
	}

	public void setContent(Object content) { this.content = content;}

	public Object getContent() { return this.content; }

	public void setHeaders(Map<String, String> headers) { this.headers = headers;}

	public Map<String, String> getHeaders() { return this.headers; }

	public void setStatus(Integer status) { this.status = status;}

	public Integer getStatus() { return this.status; }

}
