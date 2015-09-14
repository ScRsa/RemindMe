package ru.scrsa.remindme.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.scrsa.remindme.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExampleFragment extends Fragment {

    private View view;

    public ExampleFragment() {
        // Required empty public constructor
    }

    public static ExampleFragment getInstans() {
        Bundle args = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_example, container, false);
        return view;
    }


}
