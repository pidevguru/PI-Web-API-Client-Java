package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAPaginationLinks {
	@SerializedName("First")
	private String first = null;

	@SerializedName("Last")
	private String last = null;

	@SerializedName("Next")
	private String next = null;

	@SerializedName("Previous")
	private String previous = null;

	public PWAPaginationLinks()  {
	}

	public void setFirst(String first) { this.first = first;}

	public String getFirst() { return this.first; }

	public void setLast(String last) { this.last = last;}

	public String getLast() { return this.last; }

	public void setNext(String next) { this.next = next;}

	public String getNext() { return this.next; }

	public void setPrevious(String previous) { this.previous = previous;}

	public String getPrevious() { return this.previous; }

}
