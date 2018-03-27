package helloworld.example.com.rxjavademo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 李天祥 on 2018/3/21.
 */

public class Adapter extends BaseAdapter{

    private Context context;
    private List<HotWord> mCategoryVoInfo;
    private LayoutInflater inflater;

    public Adapter(Context context, List<HotWord> mCategoryVoInfo) {
        this.context = context;
        this.mCategoryVoInfo = mCategoryVoInfo;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return  mCategoryVoInfo == null ? 0 : mCategoryVoInfo.size() - 1;
    }

    @Override
    public Object getItem(int position) {
        return mCategoryVoInfo.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item, null);
            holder.tv = convertView.findViewById(R.id.tv);
           // holder.tv_price = convertView.findViewById(R.id.tv_price);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        HotWord hotWordsVo = mCategoryVoInfo.get(position);
        holder.tv.setText(hotWordsVo.getHotWord());
     //   holder.tv_price.setText(resultBean.getPrice()+"");
        return convertView;
    }

    class ViewHolder{
        TextView tv;
    }
}
