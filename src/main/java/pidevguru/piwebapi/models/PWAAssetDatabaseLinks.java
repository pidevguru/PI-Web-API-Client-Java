package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAAssetDatabaseLinks {
	@SerializedName("AnalysisCategories")
	private String analysisCategories = null;

	@SerializedName("AnalysisTemplates")
	private String analysisTemplates = null;

	@SerializedName("AssetServer")
	private String assetServer = null;

	@SerializedName("AttributeCategories")
	private String attributeCategories = null;

	@SerializedName("ElementCategories")
	private String elementCategories = null;

	@SerializedName("ElementTemplates")
	private String elementTemplates = null;

	@SerializedName("Elements")
	private String elements = null;

	@SerializedName("EnumerationSets")
	private String enumerationSets = null;

	@SerializedName("EventFrames")
	private String eventFrames = null;

	@SerializedName("Security")
	private String security = null;

	@SerializedName("SecurityEntries")
	private String securityEntries = null;

	@SerializedName("Self")
	private String self = null;

	@SerializedName("TableCategories")
	private String tableCategories = null;

	@SerializedName("Tables")
	private String tables = null;

	public PWAAssetDatabaseLinks()  {
	}

	public void setAnalysisCategories(String analysisCategories) { this.analysisCategories = analysisCategories;}

	public String getAnalysisCategories() { return this.analysisCategories; }

	public void setAnalysisTemplates(String analysisTemplates) { this.analysisTemplates = analysisTemplates;}

	public String getAnalysisTemplates() { return this.analysisTemplates; }

	public void setAssetServer(String assetServer) { this.assetServer = assetServer;}

	public String getAssetServer() { return this.assetServer; }

	public void setAttributeCategories(String attributeCategories) { this.attributeCategories = attributeCategories;}

	public String getAttributeCategories() { return this.attributeCategories; }

	public void setElementCategories(String elementCategories) { this.elementCategories = elementCategories;}

	public String getElementCategories() { return this.elementCategories; }

	public void setElementTemplates(String elementTemplates) { this.elementTemplates = elementTemplates;}

	public String getElementTemplates() { return this.elementTemplates; }

	public void setElements(String elements) { this.elements = elements;}

	public String getElements() { return this.elements; }

	public void setEnumerationSets(String enumerationSets) { this.enumerationSets = enumerationSets;}

	public String getEnumerationSets() { return this.enumerationSets; }

	public void setEventFrames(String eventFrames) { this.eventFrames = eventFrames;}

	public String getEventFrames() { return this.eventFrames; }

	public void setSecurity(String security) { this.security = security;}

	public String getSecurity() { return this.security; }

	public void setSecurityEntries(String securityEntries) { this.securityEntries = securityEntries;}

	public String getSecurityEntries() { return this.securityEntries; }

	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self; }

	public void setTableCategories(String tableCategories) { this.tableCategories = tableCategories;}

	public String getTableCategories() { return this.tableCategories; }

	public void setTables(String tables) { this.tables = tables;}

	public String getTables() { return this.tables; }

}
