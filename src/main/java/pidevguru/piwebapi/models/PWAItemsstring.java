package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAItemsstring {
	@SerializedName("Items")
	private List<String> items = null;

	public PWAItemsstring()  {
	}

	public void setItems(List<String> items) { this.items = items;}

	public List<String> getItems() { return this.items; }

}
