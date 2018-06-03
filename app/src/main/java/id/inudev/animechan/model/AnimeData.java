package id.inudev.animechan.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AnimeData {

    @SerializedName("mal_id")
    @Expose
    public Integer malId;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("image_url")
    @Expose
    public String imageUrl;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("synopsis")
    @Expose
    public String synopsis;
    @SerializedName("licensor")
    @Expose
    public List<String> licensor = null;
    @SerializedName("episodes")
    @Expose
    public Integer episodes;
    @SerializedName("source")
    @Expose
    public String source;
    @SerializedName("airing_start")
    @Expose
    public String airingStart;
    @SerializedName("score")
    @Expose
    public Double score;
    @SerializedName("members")
    @Expose
    public Integer members;
    @SerializedName("kids")
    @Expose
    public Boolean kids;
    @SerializedName("r18_plus")
    @Expose
    public Boolean r18Plus;
    @SerializedName("continued")
    @Expose
    public Boolean continued;

    public Integer getMalId() {
        return malId;
    }

    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public List<String> getLicensor() {
        return licensor;
    }

    public void setLicensor(List<String> licensor) {
        this.licensor = licensor;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAiringStart() {
        return airingStart;
    }

    public void setAiringStart(String airingStart) {
        this.airingStart = airingStart;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    public Boolean getKids() {
        return kids;
    }

    public void setKids(Boolean kids) {
        this.kids = kids;
    }

    public Boolean getR18Plus() {
        return r18Plus;
    }

    public void setR18Plus(Boolean r18Plus) {
        this.r18Plus = r18Plus;
    }

    public Boolean getContinued() {
        return continued;
    }

    public void setContinued(Boolean continued) {
        this.continued = continued;
    }
}
