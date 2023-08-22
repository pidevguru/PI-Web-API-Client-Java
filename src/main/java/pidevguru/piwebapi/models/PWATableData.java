package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWATableData {
	@SerializedName("Columns")
	private Map<String, String> columns = null;

	@SerializedName("Rows")
	private List<Map<String, Object>> rows = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWATableData()  {
	}

	public void setColumns(Map<String, String> columns) { this.columns = columns;}

	public Map<String, String> getColumns() { return this.columns; }

	public void setRows(List<Map<String, Object>> rows) { this.rows = rows;}

	public List<Map<String, Object>> getRows() { return this.rows; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
