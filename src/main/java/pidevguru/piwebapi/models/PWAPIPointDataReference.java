package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAPIPointDataReference {
	@SerializedName("Descriptor")
	private String descriptor = null;

	@SerializedName("DigitalSetName")
	private String digitalSetName = null;

	@SerializedName("DisplayDigits")
	private Integer displayDigits = null;

	@SerializedName("EngineeringUnits")
	private String engineeringUnits = null;

	@SerializedName("Future")
	private Boolean future = null;

	@SerializedName("Id")
	private Integer id = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("PointClass")
	private String pointClass = null;

	@SerializedName("PointType")
	private String pointType = null;

	@SerializedName("Span")
	private Double span = null;

	@SerializedName("Step")
	private Boolean step = null;

	@SerializedName("WebId")
	private String webId = null;

	@SerializedName("Zero")
	private Double zero = null;

	public PWAPIPointDataReference()  {
	}

	public void setDescriptor(String descriptor) { this.descriptor = descriptor;}

	public String getDescriptor() { return this.descriptor; }

	public void setDigitalSetName(String digitalSetName) { this.digitalSetName = digitalSetName;}

	public String getDigitalSetName() { return this.digitalSetName; }

	public void setDisplayDigits(Integer displayDigits) { this.displayDigits = displayDigits;}

	public Integer getDisplayDigits() { return this.displayDigits; }

	public void setEngineeringUnits(String engineeringUnits) { this.engineeringUnits = engineeringUnits;}

	public String getEngineeringUnits() { return this.engineeringUnits; }

	public void setFuture(Boolean future) { this.future = future;}

	public Boolean getFuture() { return this.future; }

	public void setId(Integer id) { this.id = id;}

	public Integer getId() { return this.id; }

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name; }

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path; }

	public void setPointClass(String pointClass) { this.pointClass = pointClass;}

	public String getPointClass() { return this.pointClass; }

	public void setPointType(String pointType) { this.pointType = pointType;}

	public String getPointType() { return this.pointType; }

	public void setSpan(Double span) { this.span = span;}

	public Double getSpan() { return this.span; }

	public void setStep(Boolean step) { this.step = step;}

	public Boolean getStep() { return this.step; }

	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId; }

	public void setZero(Double zero) { this.zero = zero;}

	public Double getZero() { return this.zero; }

}
