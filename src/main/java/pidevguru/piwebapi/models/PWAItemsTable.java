package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAItemsTable {
	@SerializedName("Items")
	private List<PWATable> items = null;

	@SerializedName("Links")
	private PWAPaginationLinks links = null;

	public PWAItemsTable()  {
	}

	public void setItems(List<PWATable> items) { this.items = items;}

	public List<PWATable> getItems() { return this.items; }

	public void setLinks(PWAPaginationLinks links) { this.links = links;}

	public PWAPaginationLinks getLinks() { return this.links; }

}
