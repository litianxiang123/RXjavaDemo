package helloworld.example.com.rxjavademo;

import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by 李天祥 on 2018/3/21.
 */

public interface ServiceApi {

    @GET(Api.GET_CATEGORY)
    Observable<BaseEntity<List<CategoryVoInfo>>> getCategory();

    @POST(Api.GET_SEARCH)
    @FormUrlEncoded
    Observable<BaseEntity<List<SearchInfo>>> getSearch(@Field("title") String title,@Field("pageIndex") int pageIndex,@Field("sortType") int sortType);

    //
    @POST(Api.HOTWORD)
    Observable<BaseEntity<List<HotWord>>> getHotWord();
}
