package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWASystemLanding {
	@SerializedName("Links")
	private PWASystemLandingLinks links = null;

	@SerializedName("ProductTitle")
	private String productTitle = null;

	@SerializedName("ProductVersion")
	private String productVersion = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWASystemLanding()  {
	}

	public void setLinks(PWASystemLandingLinks links) { this.links = links;}

	public PWASystemLandingLinks getLinks() { return this.links; }

	public void setProductTitle(String productTitle) { this.productTitle = productTitle;}

	public String getProductTitle() { return this.productTitle; }

	public void setProductVersion(String productVersion) { this.productVersion = productVersion;}

	public String getProductVersion() { return this.productVersion; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
