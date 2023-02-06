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
"poster_path",
"adult",
"overview",
"release_date",
"genre_ids",
"id",
"original_title",
"original_language",
"title",
"backdrop_path",
"popularity",
"vote_count",
"video",
"vote_average"
})
public class Result {

@JsonProperty("poster_path")
private Object posterPath;
@JsonProperty("adult")
private Boolean adult;
@JsonProperty("overview")
private String overview;
@JsonProperty("release_date")
private String releaseDate;
@JsonProperty("genre_ids")
private List<Integer> genreIds;
@JsonProperty("id")
private Integer id;
@JsonProperty("original_title")
private String originalTitle;
@JsonProperty("original_language")
private String originalLanguage;
@JsonProperty("title")
private String title;
@JsonProperty("backdrop_path")
private Object backdropPath;
@JsonProperty("popularity")
private Double popularity;
@JsonProperty("vote_count")
private Integer voteCount;
@JsonProperty("video")
private Boolean video;
@JsonProperty("vote_average")
private Double voteAverage;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("poster_path")
public Object getPosterPath() {
return posterPath;
}

@JsonProperty("poster_path")
public void setPosterPath(Object posterPath) {
this.posterPath = posterPath;
}

@JsonProperty("adult")
public Boolean getAdult() {
return adult;
}

@JsonProperty("adult")
public void setAdult(Boolean adult) {
this.adult = adult;
}

@JsonProperty("overview")
public String getOverview() {
return overview;
}

@JsonProperty("overview")
public void setOverview(String overview) {
this.overview = overview;
}

@JsonProperty("release_date")
public String getReleaseDate() {
return releaseDate;
}

@JsonProperty("release_date")
public void setReleaseDate(String releaseDate) {
this.releaseDate = releaseDate;
}

@JsonProperty("genre_ids")
public List<Integer> getGenreIds() {
return genreIds;
}

@JsonProperty("genre_ids")
public void setGenreIds(List<Integer> genreIds) {
this.genreIds = genreIds;
}

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("original_title")
public String getOriginalTitle() {
return originalTitle;
}

@JsonProperty("original_title")
public void setOriginalTitle(String originalTitle) {
this.originalTitle = originalTitle;
}

@JsonProperty("original_language")
public String getOriginalLanguage() {
return originalLanguage;
}

@JsonProperty("original_language")
public void setOriginalLanguage(String originalLanguage) {
this.originalLanguage = originalLanguage;
}

@JsonProperty("title")
public String getTitle() {
return title;
}

@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("backdrop_path")
public Object getBackdropPath() {
return backdropPath;
}

@JsonProperty("backdrop_path")
public void setBackdropPath(Object backdropPath) {
this.backdropPath = backdropPath;
}

@JsonProperty("popularity")
public Double getPopularity() {
return popularity;
}

@JsonProperty("popularity")
public void setPopularity(Double popularity) {
this.popularity = popularity;
}

@JsonProperty("vote_count")
public Integer getVoteCount() {
return voteCount;
}

@JsonProperty("vote_count")
public void setVoteCount(Integer voteCount) {
this.voteCount = voteCount;
}

@JsonProperty("video")
public Boolean getVideo() {
return video;
}

@JsonProperty("video")
public void setVideo(Boolean video) {
this.video = video;
}

@JsonProperty("vote_average")
public Double getVoteAverage() {
return voteAverage;
}

@JsonProperty("vote_average")
public void setVoteAverage(Double voteAverage) {
this.voteAverage = voteAverage;
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