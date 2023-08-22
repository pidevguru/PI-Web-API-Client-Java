package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAItemsStreamSummaries {
	@SerializedName("Items")
	private List<PWAStreamSummaries> items = null;

	@SerializedName("Links")
	private PWAPaginationLinks links = null;

	public PWAItemsStreamSummaries()  {
	}

	public void setItems(List<PWAStreamSummaries> items) { this.items = items;}

	public List<PWAStreamSummaries> getItems() { return this.items; }

	public void setLinks(PWAPaginationLinks links) { this.links = links;}

	public PWAPaginationLinks getLinks() { return this.links; }

}
