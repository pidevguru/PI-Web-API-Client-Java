package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAItemsAttributeTemplate {
	@SerializedName("Items")
	private List<PWAAttributeTemplate> items = null;

	@SerializedName("Links")
	private PWAPaginationLinks links = null;

	public PWAItemsAttributeTemplate()  {
	}

	public void setItems(List<PWAAttributeTemplate> items) { this.items = items;}

	public List<PWAAttributeTemplate> getItems() { return this.items; }

	public void setLinks(PWAPaginationLinks links) { this.links = links;}

	public PWAPaginationLinks getLinks() { return this.links; }

}
