package com.arrow.puzzle.escape.maze.free.game.activity;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzgax;
import p022N.AbstractC0355G;
import p059f.C6320b;
import p059f.C6321c;
import p059f.C6322d;
import p059f.C6323e;
import p059f.C6325g;
import p059f.C6326h;
import p059f.C6328j;
import p059f.RunnableC6319a;
import p059f.ViewOnClickListenerC6332n;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: s */
    public WebView f2905s;

    /* JADX INFO: renamed from: t */
    public zzbss f2906t;

    /* JADX INFO: renamed from: u */
    public RewardedAd f2907u;

    /* JADX INFO: renamed from: v */
    public SharedPreferences f2908v;

    /* JADX INFO: renamed from: w */
    public boolean f2909w = false;

    /* JADX INFO: renamed from: x */
    public boolean f2910x = false;

    /* JADX INFO: renamed from: h */
    public final void m2720h() {
        zzbss zzbssVar;
        if (this.f2909w && (zzbssVar = this.f2906t) != null) {
            zzbssVar.mo3277e(this);
        }
        this.f2909w = false;
        new Handler().postDelayed(new RunnableC6319a(this, 2), 1000L);
    }

    /* JADX INFO: renamed from: i */
    public final void m2721i() {
        InterstitialAd.m3273b(this, AbstractC0355G.f689A, new AdRequest(new AdRequest.Builder()), new C6325g(this));
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getPackageName(), 0);
        this.f2908v = sharedPreferences;
        if (sharedPreferences.contains("ispro")) {
            this.f2910x = this.f2908v.getBoolean("ispro", false);
        }
        new Handler().postDelayed(new RunnableC6319a(this, 3), 5000L);
    }

    /* JADX INFO: renamed from: j */
    public final void m2722j() {
        RewardedAd.m3360b(this, AbstractC0355G.f691C, new AdRequest(new AdRequest.Builder()), new C6326h(this));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iRound;
        AdSize adSize;
        DisplayMetrics displayMetrics;
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ad_frame);
        AdView adView = new AdView(this);
        adView.setAdUnitId(AbstractC0355G.f702z);
        frameLayout.removeAllViews();
        frameLayout.addView(adView);
        adView.setAdListener(new C6320b(frameLayout));
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        int i2 = (int) (displayMetrics2.widthPixels / displayMetrics2.density);
        AdSize adSize2 = AdSize.f2946i;
        zzgax zzgaxVar = zzf.f3409b;
        Resources resources = (getApplicationContext() != null ? getApplicationContext() : this).getResources();
        int iRound2 = (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || resources.getConfiguration() == null) ? -1 : Math.round(displayMetrics.heightPixels / displayMetrics.density);
        if (iRound2 == -1) {
            adSize = AdSize.f2954q;
        } else {
            int iMin = Math.min(90, Math.round(iRound2 * 0.15f));
            if (i2 > 655) {
                iRound = Math.round((i2 / 728.0f) * 90.0f);
            } else if (i2 > 632) {
                iRound = 81;
            } else if (i2 > 526) {
                iRound = Math.round((i2 / 468.0f) * 60.0f);
            } else {
                iRound = i2 > 432 ? 68 : Math.round((i2 / 320.0f) * 50.0f);
            }
            adSize = new AdSize(i2, Math.max(Math.min(iRound, iMin), 50));
        }
        adSize.f2959d = true;
        adView.setAdSize(adSize);
        Bundle bundle2 = new Bundle();
        bundle2.putString("collapsible", "bottom");
        adView.m2754b(new AdRequest((AdRequest.Builder) new AdRequest.Builder().m2741b(bundle2)));
        findViewById(R.id.ivBack).setOnClickListener(new ViewOnClickListenerC6332n(this, 4));
        getOnBackPressedDispatcher().addCallback(this, new C6321c(this, 0));
        WebView webView = (WebView) findViewById(R.id.webView);
        this.f2905s = webView;
        webView.setWebChromeClient(new WebChromeClient());
        this.f2905s.getSettings().setJavaScriptEnabled(true);
        this.f2905s.getSettings().setDomStorageEnabled(true);
        this.f2905s.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f2905s.getSettings().setAllowFileAccessFromFileURLs(true);
        this.f2905s.getSettings().setAllowUniversalAccessFromFileURLs(true);
        this.f2905s.addJavascriptInterface(new C6328j(this), "Android");
        this.f2905s.loadUrl("file:///android_asset/info/file.html");
        this.f2905s.setWebViewClient(new C6322d(this));
        zzeu.m2944d().m2947e(this, new C6323e(0));
        m2721i();
        m2722j();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        WebView webView = (WebView) findViewById(R.id.webView);
        if (i2 != 4 || !webView.canGoBack()) {
            return super.onKeyDown(i2, keyEvent);
        }
        webView.goBack();
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    }
}
