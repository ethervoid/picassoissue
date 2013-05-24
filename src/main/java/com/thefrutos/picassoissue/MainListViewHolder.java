package com.thefrutos.picassoissue;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainListViewHolder {

    private final View convertView;

    public MainListViewHolder(final View convertView) {
        this.convertView = convertView;
    }

    public ImageView getImageView() {
        return (ImageView) convertView.findViewById(R.id.image);
    }

    public TextView getTextView() {
        return (TextView) convertView.findViewById(R.id.text);
    }


}
