package id.inudev.animechan.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AnimeList {
    @SerializedName("spring2018")
    private List<AnimeData> animeData;

    public AnimeList(){
    }

    public List<AnimeData> getAnimeData() {
        return animeData;
    }

    public void setAnimeData(List<AnimeData> animeData){
        this.animeData = animeData;
    }
}
