package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWADataReference {
	@SerializedName("PIPoint")
	private PWAPIPointDataReference pIPoint = null;

	@SerializedName("Type")
	private String type = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWADataReference()  {
	}

	public void setPIPoint(PWAPIPointDataReference pIPoint) { this.pIPoint = pIPoint;}

	public PWAPIPointDataReference getPIPoint() { return this.pIPoint; }

	public void setType(String type) { this.type = type;}

	public String getType() { return this.type; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
