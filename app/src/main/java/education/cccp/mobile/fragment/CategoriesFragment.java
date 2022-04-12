package education.cccp.mobile.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class CategoriesFragment extends Fragment {

    ListView listView;
    ArrayAdapter adapter;

    public CategoriesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_categories, container, false);
        listView =view.findViewById(R.id.categories_view);
        adapter=new ArrayAdapter(view.getContext(), android.R.layout.simple_list_item_1,Data.categories);
        listView.setAdapter(adapter);
        return view;
    }
}