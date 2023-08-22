package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAStreamValueLinks {
	@SerializedName("Source")
	private String source = null;

	public PWAStreamValueLinks()  {
	}

	public void setSource(String source) { this.source = source;}

	public String getSource() { return this.source; }

}
