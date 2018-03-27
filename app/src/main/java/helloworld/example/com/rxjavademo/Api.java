package helloworld.example.com.rxjavademo;

/**
 * Created by 李天祥 on 2018/3/21.
 */

public class Api {
    public static final String BASE_URL = "http://api.huoli666.com";

    public static final String VERSION_CODE = "/1.0" + ".json";

    public static final String GET_CATEGORY = "/api/open/category/topCategory" + VERSION_CODE;

    public static final String  GET_SEARCH = "/api/open/taobao/product/search"+VERSION_CODE;

    public static final String HOTWORD = "api/open/hotword/list"+VERSION_CODE;
}
