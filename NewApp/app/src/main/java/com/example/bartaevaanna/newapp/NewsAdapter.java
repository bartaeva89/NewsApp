package com.example.bartaevaanna.newapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter {
    public NewsAdapter(Activity context, ArrayList<News> news) {
        super(context, 0, news);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = (News) getItem(position);

        TextView webTitle = (TextView) listItemView.findViewById(R.id.webtitle);
        webTitle.setText(currentNews.getWebTitle());

        TextView sectionName = (TextView) listItemView.findViewById(R.id.sectionName);
        sectionName.setText(currentNews.getSectionName());

        TextView webPublicationDate = (TextView) listItemView.findViewById(R.id.webPublicationDate);
        webPublicationDate.setText(currentNews.getWebPublicationDate());

        return listItemView;
    }
}
