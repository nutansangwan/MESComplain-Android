package com.example.nutan.mescomplain;

import android.content.Context;
import android.content.Intent;

/**
 * Created by nutan on 9/21/15.
 */
public class Navigator {

    public static void toLoginActivity(Context context) {
        Intent i = new Intent(context, LoginActivity.class);
        context.startActivity(i);

    }

    public static void toComplainRegisterActivity(Context context) {
        Intent i = new Intent(context, ComplainRegisterActivity.class);
        context.startActivity(i);
    }
}
