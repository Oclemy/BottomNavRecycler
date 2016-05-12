package com.tutorials.hp.bottomnavrecycler.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.bottomnavrecycler.R;
import com.tutorials.hp.bottomnavrecycler.mRecycler.MyAdapter;

/**
 * Created by Oclemmy on 5/10/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 */
public class CrimeFragment extends Fragment {

    String[] crime={"Blacklist","Crisis","Gotham","Banshee","Breaking Bad"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.crime_fragment,container,false);

        RecyclerView rv= (RecyclerView) rootView.findViewById(R.id.crimeRV);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        MyAdapter adapter=new MyAdapter(this.getActivity(),crime);
        rv.setAdapter(adapter);

        return rootView;
    }
}
