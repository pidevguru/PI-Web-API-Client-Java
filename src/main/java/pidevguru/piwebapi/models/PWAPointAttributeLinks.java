package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAPointAttributeLinks {
	@SerializedName("Point")
	private String point = null;

	@SerializedName("Self")
	private String self = null;

	public PWAPointAttributeLinks()  {
	}

	public void setPoint(String point) { this.point = point;}

	public String getPoint() { return this.point; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

}
