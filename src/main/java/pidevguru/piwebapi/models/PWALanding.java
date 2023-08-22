package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWALanding {
	@SerializedName("Links")
	private PWALandingLinks links = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWALanding()  {
	}

	public void setLinks(PWALandingLinks links) { this.links = links;}

	public PWALandingLinks getLinks() { return this.links; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
