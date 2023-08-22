package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAmbiguous {
	@SerializedName("Reason")
	private String reason = null;

	public PWAAmbiguous()  {
	}

	public void setReason(String reason) { this.reason = reason;}

	public String getReason() { return this.reason; }

}
