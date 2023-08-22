package pidevguru.piwebapi.models;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import pidevguru.piwebapi.models.*;

public class PWAChannelInstance {
	@SerializedName("Id")
	private String id = null;

	@SerializedName("LastMessageSentTime")
	private String lastMessageSentTime = null;

	@SerializedName("SentMessageCount")
	private Integer sentMessageCount = null;

	@SerializedName("StartTime")
	private String startTime = null;

	@SerializedName("WebException")
	private PWAWebException webException = null;

	public PWAChannelInstance()  {
	}

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id; }

	public void setLastMessageSentTime(String lastMessageSentTime) { this.lastMessageSentTime = lastMessageSentTime;}

	public String getLastMessageSentTime() { return this.lastMessageSentTime; }

	public void setSentMessageCount(Integer sentMessageCount) { this.sentMessageCount = sentMessageCount;}

	public Integer getSentMessageCount() { return this.sentMessageCount; }

	public void setStartTime(String startTime) { this.startTime = startTime;}

	public String getStartTime() { return this.startTime; }

	public void setWebException(PWAWebException webException) { this.webException = webException;}

	public PWAWebException getWebException() { return this.webException; }

}
