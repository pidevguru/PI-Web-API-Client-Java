package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAItemsItemPoint {
	@SerializedName("Items")
	private List<PWAItemPoint> items = null;

	@SerializedName("Links")
	private PWAPaginationLinks links = null;

	public PWAItemsItemPoint()  {
	}

	public void setItems(List<PWAItemPoint> items) { this.items = items;}

	public List<PWAItemPoint> getItems() { return this.items; }

	public void setLinks(PWAPaginationLinks links) { this.links = links;}

	public PWAPaginationLinks getLinks() { return this.links; }

}
