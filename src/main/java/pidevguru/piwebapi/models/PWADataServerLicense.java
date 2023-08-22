package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWADataServerLicense {
	@SerializedName("AmountLeft")
	private String amountLeft = null;

	@SerializedName("AmountUsed")
	private String amountUsed = null;

	@SerializedName("Links")
	private PWADataServerLicenseLinks links = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("TotalAmount")
	private String totalAmount = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWADataServerLicense()  {
	}

	public void setAmountLeft(String amountLeft) { this.amountLeft = amountLeft;}

	public String getAmountLeft() { return this.amountLeft; }

	public void setAmountUsed(String amountUsed) { this.amountUsed = amountUsed;}

	public String getAmountUsed() { return this.amountUsed; }

	public void setLinks(PWADataServerLicenseLinks links) { this.links = links;}

	public PWADataServerLicenseLinks getLinks() { return this.links; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setTotalAmount(String totalAmount) { this.totalAmount = totalAmount;}

	public String getTotalAmount() { return this.totalAmount; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
