package model.themoviedb;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"page",
"results",
"total_results",
"total_pages"
})
public class MovieResult {

@JsonProperty("page")
private Integer page;
@JsonProperty("results")
private List<Result> results;
@JsonProperty("total_results")
private Integer totalResults;
@JsonProperty("total_pages")
private Integer totalPages;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("page")
public Integer getPage() {
return page;
}

@JsonProperty("page")
public void setPage(Integer page) {
this.page = page;
}

@JsonProperty("results")
public List<Result> getResults() {
return results;
}

@JsonProperty("results")
public void setResults(List<Result> results) {
this.results = results;
}

@JsonProperty("total_results")
public Integer getTotalResults() {
return totalResults;
}

@JsonProperty("total_results")
public void setTotalResults(Integer totalResults) {
this.totalResults = totalResults;
}

@JsonProperty("total_pages")
public Integer getTotalPages() {
return totalPages;
}

@JsonProperty("total_pages")
public void setTotalPages(Integer totalPages) {
this.totalPages = totalPages;
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
