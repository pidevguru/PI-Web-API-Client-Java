package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAItemsAnalysisCategory {
	@SerializedName("Items")
	private List<PWAAnalysisCategory> items = null;

	@SerializedName("Links")
	private PWAPaginationLinks links = null;

	public PWAItemsAnalysisCategory()  {
	}

	public void setItems(List<PWAAnalysisCategory> items) { this.items = items;}

	public List<PWAAnalysisCategory> getItems() { return this.items; }

	public void setLinks(PWAPaginationLinks links) { this.links = links;}

	public PWAPaginationLinks getLinks() { return this.links; }

}
