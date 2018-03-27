package helloworld.example.com.rxjavademo;

import android.app.Application;
import android.content.Context;


/**
 * @author zhangtianqiu on 18/3/12 17:24
 */
public class App extends Application{

    public static App mInstance;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        //MultiDex.install(this);

    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
      //  init();
//        HttpHelper.init(mInstance);
    }

//    private void init() {
//        UMConfigure.init(this, UMConfigure.DEVICE_TYPE_PHONE, "1fe6a20054bcef865eeb0991ee84525b");
//        PlatformConfig.setWeixin("wxe161ce65b1c14a60","135b1d23eb711a1b6809af9eb3dc2e83");
//        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
//        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad","http://sns.whalecloud.com");
//    }

    public static App getInstance() {
        return mInstance;
    }
}
