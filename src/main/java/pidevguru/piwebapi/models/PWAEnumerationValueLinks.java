package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAEnumerationValueLinks {
	@SerializedName("EnumerationSet")
	private String enumerationSet = null;

	@SerializedName("Parent")
	private String parent = null;

	@SerializedName("Self")
	private String self = null;

	public PWAEnumerationValueLinks()  {
	}

	public void setEnumerationSet(String enumerationSet) { this.enumerationSet = enumerationSet;}

	public String getEnumerationSet() { return this.enumerationSet; }

	public void setParent(String parent) { this.parent = parent;}

	public String getParent() { return this.parent; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

}
