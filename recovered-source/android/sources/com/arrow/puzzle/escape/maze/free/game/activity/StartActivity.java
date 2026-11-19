package com.arrow.puzzle.escape.maze.free.game.activity;

import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.core.state.C1106a;
import androidx.constraintlayout.widget.C1137R;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.privacysandbox.ads.adservices.java.internal.C1622a;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.google.ads.mediation.C5137e;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.firebase.firestore.FirebaseFirestore;
import p001B.C0092r;
import p022N.AbstractC0355G;
import p059f.C6321c;
import p059f.ViewOnClickListenerC6329k;
import p059f.ViewOnClickListenerC6332n;
import p061g.AbstractC6341f;
import p061g.C6339d;

/* JADX INFO: loaded from: classes.dex */
public class StartActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ int f2911t = 0;

    /* JADX INFO: renamed from: s */
    public ReviewManager f2912s;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_start);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.native_frame);
        FrameLayout frameLayout2 = AbstractC6341f.f24383a;
        AdLoader.Builder builder = new AdLoader.Builder(this, AbstractC0355G.f692D);
        try {
            builder.f2944b.mo2828C2(new zzbyx(new C6339d(frameLayout, this)));
        } catch (RemoteException e) {
            zzo.m3074g("Failed to add google native ad listener", e);
        }
        builder.m2750b(new C5137e(frameLayout, this));
        builder.m2749a().m2748a(new AdRequest(new AdRequest.Builder()));
        if (Build.VERSION.SDK_INT >= 33 && ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, C1137R.styleable.ConstraintSet_stateLabels);
        }
        C0092r c0092r = new C0092r(14);
        c0092r.f130t = this;
        AppUpdateManager appUpdateManagerCreate = AppUpdateManagerFactory.create(this);
        int i2 = 3;
        appUpdateManagerCreate.getAppUpdateInfo().addOnSuccessListener(new C1622a(i2, c0092r, appUpdateManagerCreate));
        ReviewManager reviewManagerCreate = ReviewManagerFactory.create(this);
        this.f2912s = reviewManagerCreate;
        reviewManagerCreate.requestReviewFlow().addOnCompleteListener(new C1106a(this, 15));
        FirebaseFirestore.getInstance();
        String str = "https://play.google.com/store/apps/details?id=" + getPackageName();
        ((ImageView) findViewById(R.id.linstart)).setOnClickListener(new ViewOnClickListenerC6332n(this, 0));
        int i3 = 1;
        ((LinearLayout) findViewById(R.id.linrate)).setOnClickListener(new ViewOnClickListenerC6332n(this, i3));
        ((LinearLayout) findViewById(R.id.linshare)).setOnClickListener(new ViewOnClickListenerC6329k(this, str, i3));
        ((LinearLayout) findViewById(R.id.linprivacy)).setOnClickListener(new ViewOnClickListenerC6332n(this, 2));
        ((LinearLayout) findViewById(R.id.linmoreapps)).setOnClickListener(new ViewOnClickListenerC6332n(this, i2));
        getOnBackPressedDispatcher().addCallback(this, new C6321c(this, i3));
    }
}
