package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAItemsElementTemplate {
	@SerializedName("Items")
	private List<PWAElementTemplate> items = null;

	@SerializedName("Links")
	private PWAPaginationLinks links = null;

	public PWAItemsElementTemplate()  {
	}

	public void setItems(List<PWAElementTemplate> items) { this.items = items;}

	public List<PWAElementTemplate> getItems() { return this.items; }

	public void setLinks(PWAPaginationLinks links) { this.links = links;}

	public PWAPaginationLinks getLinks() { return this.links; }

}
