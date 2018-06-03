package id.inudev.animechan.view;

import android.support.v7.widget.RecyclerView;

public interface MainView {

    void setRV(RecyclerView.Adapter adapter);

    void setVisibilityProgressBar(int visibilityProgressBar);
}
