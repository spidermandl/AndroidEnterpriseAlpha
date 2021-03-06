package org.example.androidenterprise.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by sdlds on 2016/9/23.
 */
public class AlbumAdapter extends BaseAdapter {
    private LayoutInflater mLayoutInflate;
    private Context context;
    private int[] imagesAlbum;

    public AlbumAdapter(Context context, int[] imagesAlbum){
        this.context = context;
        this.imagesAlbum = imagesAlbum;
    }

    @Override
    public int getCount() {
        return imagesAlbum.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgView = new ImageView(context);
        imgView.setImageResource(imagesAlbum[position]);
        return imgView;
    }
}
