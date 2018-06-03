package id.inudev.animechan.api;

import id.inudev.animechan.model.AnimeList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
@GET("2018/summer")
    Call<AnimeList> getAnime();
}
