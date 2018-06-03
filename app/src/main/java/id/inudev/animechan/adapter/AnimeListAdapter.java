package id.inudev.animechan.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import id.inudev.animechan.holder.AnimeListHolder;
import id.inudev.animechan.model.AnimeData;

import id.inudev.animechan.R;

public abstract class AnimeListAdapter extends RecyclerView.Adapter<AnimeListHolder> {

    private List<AnimeData> animeData;

    public AnimeListAdapter(List<AnimeData> animeData){
        this.animeData = animeData;
    }

    @NonNull
    @Override
    public AnimeListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_main, parent,false);
        return new AnimeListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeListHolder holder, int position) {
    bindHolder(holder,animeData.get(position));
    }

    protected abstract void bindHolder(AnimeListHolder holder, AnimeData animeData);

    @Override
    public int getItemCount() {
        return animeData.size();
    }
}
