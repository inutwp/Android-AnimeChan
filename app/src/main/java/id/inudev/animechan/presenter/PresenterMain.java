package id.inudev.animechan.presenter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import id.inudev.animechan.MainActivity;
import id.inudev.animechan.adapter.AnimeListAdapter;
import id.inudev.animechan.api.ApiBuilder;
import id.inudev.animechan.api.ApiService;
import id.inudev.animechan.holder.AnimeListHolder;
import id.inudev.animechan.model.AnimeData;
import id.inudev.animechan.model.AnimeList;
import id.inudev.animechan.view.MainView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PresenterMain {

    private final MainView mainView;
    private final Context context;
    private AnimeListAdapter animeListAdapter;

    public PresenterMain(Context context, MainView mainView) {
        this.context = context;
        this.mainView = mainView;
    }

    public void loadData() {
        mainView.setVisibilityProgressBar(View.VISIBLE);
        ApiService service = ApiBuilder.getClient().create(ApiService.class);
        Call<AnimeList> animeListCall = service.getAnime();
        animeListCall.enqueue(new Callback<AnimeList>() {
            @Override
            public void onResponse(@NonNull Call<AnimeList> call, @NonNull Response<AnimeList> response) {
                List<AnimeData> animeData = Objects.requireNonNull(response.body()).getAnimeData();
                mainView.setVisibilityProgressBar(View.GONE);
                animeListAdapter = new AnimeListAdapter(animeData) {
                    @Override
                    protected void bindHolder(AnimeListHolder holder, final AnimeData animeData) {
                        holder.bind(animeData);
                        holder.itemView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.d("Click", "onClick: " + animeData.title);
                            }
                        });
                    }
                };
                mainView.setRV(animeListAdapter);
            }

            @Override
            public void onFailure(@NonNull Call<AnimeList> call, @NonNull Throwable t) {
                mainView.setVisibilityProgressBar(View.GONE);
            }
        });

    }
}
