package id.inudev.animechan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wang.avi.AVLoadingIndicatorView;

import id.inudev.animechan.presenter.PresenterMain;
import id.inudev.animechan.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView {

    private RecyclerView recyclerView;
    private PresenterMain presenterMain;
    private Context context;
    private AVLoadingIndicatorView avLoadingIndicatorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeView();
        initializePresenter();
    }

    private void initializeView() {
        recyclerView = findViewById(R.id.recycleview_list_anime);
        avLoadingIndicatorView = findViewById(R.id.avload);
    }

    private void initializePresenter() {
        context = this;
        presenterMain = new PresenterMain(context, this);
        presenterMain.loadData();
    }

    @Override
    public void setRV(RecyclerView.Adapter adapter) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void setVisibilityProgressBar(int visibilityProgressBar) {
        switch (visibilityProgressBar) {
            case View.GONE:
                avLoadingIndicatorView.setVisibility(visibilityProgressBar);
                recyclerView.setVisibility(View.VISIBLE);
                recyclerView.scrollToPosition(0);
                break;
            case View.VISIBLE:
                avLoadingIndicatorView.setVisibility(visibilityProgressBar);
                recyclerView.setVisibility(View.GONE);
                break;
        }
    }
}
