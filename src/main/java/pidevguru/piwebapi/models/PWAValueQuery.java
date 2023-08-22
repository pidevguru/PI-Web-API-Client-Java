package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAValueQuery {
	@SerializedName("AttributeName")
	private String attributeName = null;

	@SerializedName("AttributeUOM")
	private String attributeUOM = null;

	@SerializedName("AttributeValue")
	private Object attributeValue = null;

	@SerializedName("SearchOperator")
	private String searchOperator = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWAValueQuery()  {
	}

	public void setAttributeName(String attributeName) { this.attributeName = attributeName;}

	public String getAttributeName() { return this.attributeName; }

	public void setAttributeUOM(String attributeUOM) { this.attributeUOM = attributeUOM;}

	public String getAttributeUOM() { return this.attributeUOM; }

	public void setAttributeValue(Object attributeValue) { this.attributeValue = attributeValue;}

	public Object getAttributeValue() { return this.attributeValue; }

	public void setSearchOperator(String searchOperator) { this.searchOperator = searchOperator;}

	public String getSearchOperator() { return this.searchOperator; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
