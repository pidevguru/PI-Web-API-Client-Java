package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAItemsChannelInstance {
	@SerializedName("Items")
	private List<PWAChannelInstance> items = null;

	@SerializedName("Links")
	private PWAPaginationLinks links = null;

	public PWAItemsChannelInstance()  {
	}

	public void setItems(List<PWAChannelInstance> items) { this.items = items;}

	public List<PWAChannelInstance> getItems() { return this.items; }

	public void setLinks(PWAPaginationLinks links) { this.links = links;}

	public PWAPaginationLinks getLinks() { return this.links; }

}
