package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAItemsItemElement {
	@SerializedName("Items")
	private List<PWAItemElement> items = null;

	@SerializedName("Links")
	private PWAPaginationLinks links = null;

	public PWAItemsItemElement()  {
	}

	public void setItems(List<PWAItemElement> items) { this.items = items;}

	public List<PWAItemElement> getItems() { return this.items; }

	public void setLinks(PWAPaginationLinks links) { this.links = links;}

	public PWAPaginationLinks getLinks() { return this.links; }

}
