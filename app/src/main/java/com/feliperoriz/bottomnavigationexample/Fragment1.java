package com.feliperoriz.bottomnavigationexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.support.v4.app.Fragment;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by feliperoriz on 2/26/17.
 */

public class Fragment1 extends Fragment {

    private ListView listView;
    private ArrayAdapter adapter;

    static final String[] items = new String[] {
            "One", "Two", "Three",
            "One", "Two", "Three",
            "One", "Two", "Three",
            "One", "Two", "Three",
            "One", "Two", "Three",
            "One", "Two", "Three",
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);

        listView = (ListView) view.findViewById(R.id.listview);
        adapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        return view;
    }
}
