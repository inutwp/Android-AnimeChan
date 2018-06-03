package id.inudev.animechan.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AnimeData {

    @SerializedName("id")
    public Integer id;
    @SerializedName("title")
    public String title;
    @SerializedName("jp-title")
    public String jpTitle;
    @SerializedName("studio")
    public String studio;
    @SerializedName("eps")
    public String eps;
    @SerializedName("duration")
    public String duration;
    @SerializedName("des")
    public String des;
    @SerializedName("img")
    public String img;
    @SerializedName("genre")
    public List<String> genre = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJpTitle() {
        return jpTitle;
    }

    public void setJpTitle(String jpTitle) {
        this.jpTitle = jpTitle;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }
}
