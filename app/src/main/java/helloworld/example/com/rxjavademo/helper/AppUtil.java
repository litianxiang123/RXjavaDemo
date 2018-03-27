package helloworld.example.com.rxjavademo.helper;

import android.content.Context;
import android.widget.Toast;

/**
 * author：zhangtianqiu on 18/3/13 17:08
 */
public class AppUtil {
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * ToastUtil
     */
    private static Toast toast = null; //Toast的对象！

    public static void showToast(Context mContext, String content) {
        if (toast == null) {
            toast = Toast.makeText(mContext, content, Toast.LENGTH_SHORT);
        } else {
            toast.setText(content);
        }
        toast.show();
    }
}
