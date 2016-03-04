package leavingstone.com.percentlayoutdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import leavingstone.com.percentlayoutdemo.R;
import leavingstone.com.percentlayoutdemo.model.SimpleModelItem;

/**
 * Created by Jemo on 3/4/16.
 */
public class MyAdapter extends BaseAdapter {
    private List<SimpleModelItem> listItems;
    private Context context;
    private LayoutInflater inflater;

    public MyAdapter(List<SimpleModelItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ItemHolder itemHolder;

        if (convertView == null){
            view = inflater.inflate(R.layout.list_view_item,parent,false);
            itemHolder = new ItemHolder();
            itemHolder.mImageViewH = (ImageView) view.findViewById(R.id.image_view_id);
            itemHolder.mTextViewH = (TextView) view.findViewById(R.id.text_view_id);

            view.setTag(itemHolder);
        }else {
            view = convertView;
            itemHolder = (ItemHolder) view.getTag();
        }

        SimpleModelItem item = (SimpleModelItem) getItem(position);
        itemHolder.mTextViewH.setText(item.getName());
        itemHolder.mImageViewH.setImageResource(item.getResId());

        return view;
    }

    private class ItemHolder{
        TextView mTextViewH;
        ImageView mImageViewH;
    }
}
