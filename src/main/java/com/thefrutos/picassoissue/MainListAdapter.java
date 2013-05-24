package com.thefrutos.picassoissue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MainListAdapter extends BaseAdapter {

    private final Context context;
    private final LayoutInflater inflater;
    private final List<ListElement> elements;

    public MainListAdapter(final Context context, final List<ListElement> elements) {
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.elements = elements;
    }

    @Override
    public int getCount() {
        return elements.size();
    }

    @Override
    public ListElement getItem(int position) {
        return elements.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MainListViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_element,parent,false);
            viewHolder = new MainListViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (MainListViewHolder) convertView.getTag();
        }
        ListElement item = getItem(position);
        Picasso.with(context).load(item.getImageUrl()).error(R.drawable.user_no_photo).into(viewHolder.getImageView());
        viewHolder.getTextView().setText(item.getText());
        return convertView;
    }

}
