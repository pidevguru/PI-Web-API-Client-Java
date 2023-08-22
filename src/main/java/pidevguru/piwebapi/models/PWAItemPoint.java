package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAItemPoint {
	@SerializedName("Exception")
	private PWAErrors exception = null;

	@SerializedName("Identifier")
	private String identifier = null;

	@SerializedName("IdentifierType")
	private String identifierType = null;

	@SerializedName("Object")
	private PWAPoint object = null;

	public PWAItemPoint()  {
	}

	public void setException(PWAErrors exception) { this.exception = exception;}

	public PWAErrors getException() { return this.exception; }

	public void setIdentifier(String identifier) { this.identifier = identifier;}

	public String getIdentifier() { return this.identifier; }

	public void setIdentifierType(String identifierType) { this.identifierType = identifierType;}

	public String getIdentifierType() { return this.identifierType; }

	public void setObject(PWAPoint object) { this.object = object;}

	public PWAPoint getObject() { return this.object; }

}
