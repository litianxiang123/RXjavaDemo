package helloworld.example.com.rxjavademo;

import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 李天祥 on 2018/3/21.
 */

public class HttpHelper {
    private static OkHttpClient mOkHttpClient;

    /**
     * 根据传入的baseUrl，和api创建retrofit
     */
    public static <T> ServiceApi createApi(String baseUrl) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(mOkHttpClient)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
        return retrofit.create(ServiceApi.class);
    }

    /**
     * 根据传入的baseUrl，和api创建retrofit
     */
    public static <T> ServiceApi createApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .client(initOkHttpClient())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ServiceApi.class);
    }

    /**
     * 初始化OKHttpClient,设置缓存,设置超时时间,设置打印日志
     */
    private static OkHttpClient initOkHttpClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        if (mOkHttpClient == null) {
            synchronized (HttpHelper.class) {
                if (mOkHttpClient == null) {
                    //设置Http缓存
//                    Cache cache = new Cache(new File(App.getApplication().getCacheDir(), "HttpCache"), 1024 * 1024 * 10);
                    mOkHttpClient = new OkHttpClient.Builder()
//                            .cache(cache)
                            .addInterceptor(interceptor)
//                            .addNetworkInterceptor(new CacheInterceptor())
//                            .addNetworkInterceptor(new StethoInterceptor())
                            .addNetworkInterceptor(new CommonParameterInterceptor())
                            .connectTimeout(30, TimeUnit.SECONDS)
                            .writeTimeout(20, TimeUnit.SECONDS)
                            .readTimeout(20, TimeUnit.SECONDS)
                            .build();
                }
            }
        }
        return mOkHttpClient;
    }

//    public static void init(Application app) {
//        App.setApplication(app);
//       initOkHttpClient();
//    }
}
