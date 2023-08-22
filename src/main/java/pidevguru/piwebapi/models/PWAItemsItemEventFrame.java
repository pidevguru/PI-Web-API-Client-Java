package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAItemsItemEventFrame {
	@SerializedName("Items")
	private List<PWAItemEventFrame> items = null;

	@SerializedName("Links")
	private PWAPaginationLinks links = null;

	public PWAItemsItemEventFrame()  {
	}

	public void setItems(List<PWAItemEventFrame> items) { this.items = items;}

	public List<PWAItemEventFrame> getItems() { return this.items; }

	public void setLinks(PWAPaginationLinks links) { this.links = links;}

	public PWAPaginationLinks getLinks() { return this.links; }

}
