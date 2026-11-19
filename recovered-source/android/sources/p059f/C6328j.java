package p059f;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import androidx.webkit.internal.AssetHelper;
import com.arrow.puzzle.escape.maze.free.game.activity.MainActivity;

/* JADX INFO: renamed from: f.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6328j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MainActivity f24354a;

    public C6328j(MainActivity mainActivity) {
        this.f24354a = mainActivity;
    }

    @JavascriptInterface
    public void landscape() {
        this.f24354a.setRequestedOrientation(0);
    }

    @JavascriptInterface
    public void portrait() {
        this.f24354a.setRequestedOrientation(1);
    }

    @JavascriptInterface
    public void rateThisApp() {
        MainActivity mainActivity = this.f24354a;
        mainActivity.getClass();
        try {
            mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + mainActivity.getPackageName())));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(mainActivity, " unable to find market app", 1).show();
        }
    }

    @JavascriptInterface
    public void shareText(String str, String str2) {
        MainActivity mainActivity = this.f24354a;
        mainActivity.getClass();
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            intent.putExtra("android.intent.extra.SUBJECT", str2);
            intent.putExtra("android.intent.extra.TEXT", str);
            mainActivity.startActivity(Intent.createChooser(intent, "Choose one"));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void shareThisApp(String str, String str2) {
        MainActivity mainActivity = this.f24354a;
        mainActivity.getClass();
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            intent.putExtra("android.intent.extra.SUBJECT", str2);
            intent.putExtra("android.intent.extra.TEXT", str + "\n\nhttps://play.google.com/store/apps/details?id=" + mainActivity.getPackageName() + "\n\n");
            mainActivity.startActivity(Intent.createChooser(intent, "Choose one"));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void showAd() {
        this.f24354a.f2909w = true;
    }

    @JavascriptInterface
    public void showAlert(String str) {
        Toast.makeText(this.f24354a.getApplicationContext(), str, 1).show();
    }

    @JavascriptInterface
    public void showRewardedAd() {
        MainActivity mainActivity = this.f24354a;
        mainActivity.runOnUiThread(new RunnableC6319a(mainActivity, 4));
    }
}
