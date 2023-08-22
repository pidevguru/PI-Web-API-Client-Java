package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAUnitLinks {
	@SerializedName("ReferenceUnit")
	private String referenceUnit = null;

	@SerializedName("Self")
	private String self = null;

	public PWAUnitLinks()  {
	}

	public void setReferenceUnit(String referenceUnit) { this.referenceUnit = referenceUnit;}

	public String getReferenceUnit() { return this.referenceUnit; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

}
