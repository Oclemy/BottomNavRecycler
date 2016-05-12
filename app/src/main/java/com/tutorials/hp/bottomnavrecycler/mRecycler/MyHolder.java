package com.tutorials.hp.bottomnavrecycler.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tutorials.hp.bottomnavrecycler.R;

/**
 * Created by Oclemmy on 5/10/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 */
public class MyHolder extends RecyclerView.ViewHolder {

    TextView nametxt;

    public MyHolder(View itemView) {
        super(itemView);

        nametxt= (TextView) itemView.findViewById(R.id.nameTxt);
    }
}
