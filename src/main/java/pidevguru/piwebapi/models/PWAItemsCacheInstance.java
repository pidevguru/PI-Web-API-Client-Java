package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAItemsCacheInstance {
	@SerializedName("Items")
	private List<PWACacheInstance> items = null;

	@SerializedName("Links")
	private PWAPaginationLinks links = null;

	public PWAItemsCacheInstance()  {
	}

	public void setItems(List<PWACacheInstance> items) { this.items = items;}

	public List<PWACacheInstance> getItems() { return this.items; }

	public void setLinks(PWAPaginationLinks links) { this.links = links;}

	public PWAPaginationLinks getLinks() { return this.links; }

}
