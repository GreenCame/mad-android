package com.mad.android.mad_android.views.Character;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mad.android.mad_android.R;

/**
 * Created by Ju on 18/01/2018.
 */

public class Equipment extends Fragment{
    View view;

    public Equipment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_tab_3, container, false);
        return view;
    }
}
