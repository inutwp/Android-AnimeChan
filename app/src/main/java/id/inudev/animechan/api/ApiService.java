package id.inudev.animechan.api;

import id.inudev.animechan.model.AnimeList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
@GET("ceDZZReWSq?indent=2")
    Call<AnimeList> getAnime();
}
