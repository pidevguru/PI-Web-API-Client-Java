package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWADataServerLinks {
	@SerializedName("EnumerationSets")
	private String enumerationSets = null;

	@SerializedName("Points")
	private String points = null;

	@SerializedName("Self")
	private String self = null;

	public PWADataServerLinks()  {
	}

	public void setEnumerationSets(String enumerationSets) { this.enumerationSets = enumerationSets;}

	public String getEnumerationSets() { return this.enumerationSets; }

	public void setPoints(String points) { this.points = points;}

	public String getPoints() { return this.points; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

}
