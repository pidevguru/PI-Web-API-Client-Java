package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWARequestTemplate {
	@SerializedName("Resource")
	private String resource = null;

	public PWARequestTemplate()  {
	}

	public void setResource(String resource) { this.resource = resource;}

	public String getResource() { return this.resource; }

}
