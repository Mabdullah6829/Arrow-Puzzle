package p061g;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzbys;
import p001B.C0092r;
import p022N.AbstractC0355G;
import p034T.RunnableC0758m;

/* JADX INFO: renamed from: g.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6341f {

    /* JADX INFO: renamed from: a */
    public static FrameLayout f24383a = null;

    /* JADX INFO: renamed from: b */
    public static LinearLayout f24384b = null;

    /* JADX INFO: renamed from: c */
    public static zzbss f24385c = null;

    /* JADX INFO: renamed from: d */
    public static InterstitialAd f24386d = null;

    /* JADX INFO: renamed from: e */
    public static C6337b f24387e = null;

    /* JADX INFO: renamed from: f */
    public static C0092r f24388f = null;

    /* JADX INFO: renamed from: g */
    public static int f24389g = 1;

    /* JADX INFO: renamed from: h */
    public static zzbys f24390h = null;

    /* JADX INFO: renamed from: i */
    public static ProgressDialog f24391i = null;

    /* JADX INFO: renamed from: j */
    public static C6336a f24392j = null;

    /* JADX INFO: renamed from: k */
    public static final int f24393k;

    static {
        try {
            f24393k = Integer.parseInt(AbstractC0355G.f695G);
        } catch (Exception unused) {
            f24393k = 3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12151a(Activity activity) {
        if (AudienceNetworkAds.isInitialized(activity)) {
            f24387e = new C6337b(activity);
            if (f24386d == null) {
                f24386d = new InterstitialAd(activity, AbstractC0355G.f690B);
            }
            if (f24386d.isAdLoaded()) {
                return;
            }
            InterstitialAd interstitialAd = f24386d;
            interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(f24387e).build());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12152b(Activity activity, C0092r c0092r) {
        if (c0092r == null) {
            return;
        }
        if (f24386d == null) {
            try {
                f24386d = new InterstitialAd(activity, AbstractC0355G.f690B);
            } catch (Exception e) {
                e.printStackTrace();
                c0092r.m164d();
                return;
            }
        }
        InterstitialAd interstitialAd = f24386d;
        if (interstitialAd == null) {
            c0092r.m164d();
            return;
        }
        if (!interstitialAd.isAdLoaded()) {
            try {
                InterstitialAd interstitialAd2 = f24386d;
                interstitialAd2.loadAd(interstitialAd2.buildLoadAdConfig().withAdListener(f24387e).build());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            c0092r.m164d();
            return;
        }
        try {
            m12153c(activity);
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0758m(c0092r, 13), 1500L);
        } catch (Exception e3) {
            e3.printStackTrace();
            c0092r.m164d();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m12153c(Activity activity) {
        ProgressDialog progressDialog = new ProgressDialog(activity);
        f24391i = progressDialog;
        progressDialog.setMessage(activity.getString(R.string.loading_ad));
        f24391i.setCanceledOnTouchOutside(false);
        f24391i.setCancelable(false);
        f24391i.show();
    }
}
