package helloworld.example.com.rxjavademo.helper;

/**
 * author：zhangtianqiu on 18/1/19 13:43
 */
public class ServerException extends RuntimeException {
    public String message;

    public ServerException(String message) {
        this.message = message;
    }
}
