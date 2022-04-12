package education.cccp.mobile.fragment;

import static android.R.layout.simple_list_item_1;
import static education.cccp.mobile.fragment.Data.articles;
import static education.cccp.mobile.fragment.Data.categories;
import static education.cccp.mobile.fragment.R.id.categories_view;
import static education.cccp.mobile.fragment.R.layout.fragment_categories;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;


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
        categoriesListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent,
                                            View view,
                                            int position,
                                            long id) {
                        Intent intent = new Intent(getActivity(),
                                CategoriesDetailActivity.class);
                        intent.putExtra("article",
                                articles[position]);
                        intent.putExtra("categorieIndex",
                                position);

                        startActivity(intent);

                    }
                }
        );
        return view;
    }
}