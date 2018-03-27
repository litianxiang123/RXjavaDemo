package helloworld.example.com.rxjavademo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import helloworld.example.com.rxjavademo.helper.AppUtil;
import helloworld.example.com.rxjavademo.helper.RxSchedulers;
import helloworld.example.com.rxjavademo.helper.RxSubscriber;

public class MainActivity extends AppCompatActivity {

    private ListView mLv;

    private List<SearchInfo> mCategoryVoInfo = new ArrayList<>();

    private List<HotWord> hotWordsVos = new ArrayList<>();

   // private List<CategoryVoInfo> mCategoryVoInfo = new ArrayList<>();

    private String title = "1";
    private int pageIndex = 1;
    private int sortType=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        //getNetData("手机",1,1);
        getNetData();
    }

    private void initView() {
        mLv = (ListView) findViewById(R.id.lv);
    }

    private void getNetData() {
        HttpHelper.createApi().getHotWord()
                .map(new BaseFunc<List<HotWord>>())
                .compose(RxSchedulers.<List<HotWord>>io_main())
                .subscribe(new RxSubscriber<List<HotWord>>() {
                    @Override
                    public void _onNext(List<HotWord> categoryVoInfos) {
                        setAdapterData(categoryVoInfos);
                        //AppUtil.showToast(MainActivity.this,hotWordsVos.get(1).getHotWord());
                    }

                    @Override
                    public void _onError(String msg) {
                        AppUtil.showToast(MainActivity.this, msg);
                    }
                });
    }

    public void setAdapterData(List<HotWord> hotWordsVos){
        final Adapter adapter = new Adapter(this, hotWordsVos);
        mLv.setAdapter(adapter);
    }
}
