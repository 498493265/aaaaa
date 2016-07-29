package com.example.z.p1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

import com.example.z.p1.R;
import com.example.z.p1.regist;
import com.example.z.p1.secondactivity;

public class wodedingdan extends Fragment implements View.OnClickListener{

    //requestWindowFeature(Window.FEATURE_NO_TITLE);
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.wodedingdan, container, false);
        return view;
    }
    public void onClick(View v) {
        // TODO Auto-generated method stub
        int id  = v.getId();
        if(id==R.id.id_tab_3)
            ((user) getActivity()).showtab3();
    }
}