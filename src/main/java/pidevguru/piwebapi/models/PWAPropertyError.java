package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAPropertyError {
	@SerializedName("FieldName")
	private String fieldName = null;

	@SerializedName("Message")
	private List<String> message = null;

	public PWAPropertyError()  {
	}

	public void setFieldName(String fieldName) { this.fieldName = fieldName;}

	public String getFieldName() { return this.fieldName; }

	public void setMessage(List<String> message) { this.message = message;}

	public List<String> getMessage() { return this.message; }

}
