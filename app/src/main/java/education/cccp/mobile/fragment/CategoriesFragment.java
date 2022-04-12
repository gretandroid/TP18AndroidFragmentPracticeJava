package education.cccp.mobile.fragment;

import static android.R.layout.simple_list_item_1;

import static education.cccp.mobile.fragment.Data.categories;
import static education.cccp.mobile.fragment.R.id.categories_view;
import static education.cccp.mobile.fragment.R.layout.fragment_categories;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Collections;


public class CategoriesFragment extends Fragment {
    public CategoriesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(fragment_categories,
                container,
                false);
        ListView categoriesListView = view.findViewById(categories_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                view.getContext(),
                simple_list_item_1,
                categories
        );
        categoriesListView.setAdapter(adapter);
        return view;
    }
}