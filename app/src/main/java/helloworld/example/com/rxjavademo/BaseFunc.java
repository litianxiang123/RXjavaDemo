package helloworld.example.com.rxjavademo;

import helloworld.example.com.rxjavademo.helper.ServerException;
import rx.functions.Func1;

/**
 * Created by 李天祥 on 2018/3/21.
 */

public class BaseFunc<T>implements Func1<BaseEntity<T>, T> {
    @Override
    public T call(BaseEntity<T> tBaseEntity) {
        if(tBaseEntity.res_code!=1){
            throw new ServerException(tBaseEntity.res_code+"");
        }
        return tBaseEntity.result;
    }
}
