package com.arrow.puzzle.escape.maze.free.game.activity;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.google.firebase.firestore.FirebaseFirestore;
import p001B.C0092r;
import p059f.AsyncTaskC6331m;
import p059f.ViewOnClickListenerC6329k;

/* JADX INFO: loaded from: classes.dex */
public class SplashActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        if (((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo() != null) {
            Log.e("Hello", "Me");
            FirebaseFirestore.getInstance().collection("ALLID").document("ADID").get().addOnCompleteListener(new C0092r(this, 12));
            new AsyncTaskC6331m(this).execute(new Object[0]);
            return;
        }
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.no_internet_dialog);
        dialog.show();
        dialog.findViewById(R.id.ok_rettry).setOnClickListener(new ViewOnClickListenerC6329k(this, dialog, 0));
    }
}
