package id.inudev.animechan.holder;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import id.inudev.animechan.R;
import id.inudev.animechan.model.AnimeData;

public class AnimeListHolder extends RecyclerView.ViewHolder {

    private TextView animeTitle;
    private TextView jpTitle;
    private TextView des;
    private TextView genre;

    private ImageView img;

    public AnimeListHolder(View itemView) {
        super(itemView);
        animeTitle = itemView.findViewById(R.id.animeTitle);
        jpTitle = itemView.findViewById(R.id.jptitle);
        des = itemView.findViewById(R.id.des);
        genre = itemView.findViewById(R.id.genre);
        img = itemView.findViewById(R.id.img);
    }

    @SuppressLint("SetTextI18n")
    public void bind(AnimeData animeData){

        animeTitle.setText(animeData.title);
        jpTitle.setText(animeData.jpTitle);
        //des.setText(animeData.eps + " Eps");
        //genre.setText(animeData.duration + " Minute");

        Glide.with(itemView.getContext())
                .load(animeData.img)
                .apply(RequestOptions.centerCropTransform())
                .apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL))
                .into(img);
    }
}
