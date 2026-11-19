package p059f;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.ProxyConfig;
import com.arrow.puzzle.escape.maze.free.game.activity.MainActivity;

/* JADX INFO: renamed from: f.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6322d extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MainActivity f24346a;

    public C6322d(MainActivity mainActivity) {
        this.f24346a = mainActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        MainActivity mainActivity = this.f24346a;
        mainActivity.f2905s.setVisibility(0);
        if (mainActivity.f2910x) {
            mainActivity.f2905s.loadUrl("javascript:awebapp.itspro(1)");
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        MainActivity mainActivity = this.f24346a;
        mainActivity.f2905s.setVisibility(8);
        if (str.contains(ProxyConfig.MATCH_HTTP)) {
            mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        }
        webView.loadUrl(str);
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
    }
}
