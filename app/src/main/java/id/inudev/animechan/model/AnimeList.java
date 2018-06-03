package id.inudev.animechan.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AnimeList {
    @SerializedName("season")
    private List<AnimeData> animeData;

    public List<AnimeData> getAnimeData() {
        return animeData;
    }

    public void setAnimeData(List<AnimeData> animeData){
        this.animeData = animeData;
    }
}
