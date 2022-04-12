package education.cccp.mobile.fragment;

import static android.R.layout.simple_list_item_1;
import static education.cccp.mobile.fragment.Data.categories;
import static education.cccp.mobile.fragment.R.id.categorie_details_view;
import static education.cccp.mobile.fragment.R.layout.fragment_categorie_detail;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class CategorieDetailFragment extends Fragment {


    public CategorieDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int idxCat;
        View view = inflater.inflate(fragment_categorie_detail,
                container,
                false);
        ListView categorieDetailsListView = view.findViewById(categorie_details_view);
        if (getContext().getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            Intent intent = getActivity().getIntent();
            String[] detail = intent.getStringArrayExtra("article");
            idxCat = intent.getIntExtra("categorieIndex", -1);
            // Inflate the layout for this fragment

            ArrayAdapter<String> adapter = new ArrayAdapter<>(
                    view.getContext(),
                    simple_list_item_1,
                    detail
            );

            categorieDetailsListView.setAdapter(adapter);
        } else {
            idxCat = 0;

            ArrayAdapter<String> adapter = new ArrayAdapter<>(
                    view.getContext(),
                    simple_list_item_1,
                    Data.articles[idxCat]
            );
            categorieDetailsListView.setAdapter(adapter);
        }

//        view.setOnKeyListener(
//                new View.OnKeyListener() {
//                    @Override
//                    public boolean onKey(View view, int i, KeyEvent keyEvent) {
//                        if (keyEvent.getKeyCode() == KeyEvent.KEYCODE_BACK) {
//
//                        }
//                        return false;
//                    }
//                }
//        );
        return view;
    }
}