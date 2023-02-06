package model.themoviedb;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"status_message",
"status_code"
})
public class ErrorResponse {

@JsonProperty("status_message")
private String statusMessage;
@JsonProperty("status_code")
private Integer statusCode;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("status_message")
public String getStatusMessage() {
return statusMessage;
}

@JsonProperty("status_message")
public void setStatusMessage(String statusMessage) {
this.statusMessage = statusMessage;
}

@JsonProperty("status_code")
public Integer getStatusCode() {
return statusCode;
}

@JsonProperty("status_code")
public void setStatusCode(Integer statusCode) {
this.statusCode = statusCode;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}