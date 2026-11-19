package p059f;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.arrow.puzzle.escape.maze.free.game.activity.MainActivity;
import com.arrow.puzzle.escape.maze.free.game.activity.StartActivity;
import p001B.C0092r;
import p034T.RunnableC0758m;
import p061g.AbstractC6341f;

/* JADX INFO: renamed from: f.n */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC6332n implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24360s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ AppCompatActivity f24361t;

    public /* synthetic */ ViewOnClickListenerC6332n(AppCompatActivity appCompatActivity, int i2) {
        this.f24360s = i2;
        this.f24361t = appCompatActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24360s) {
            case 0:
                StartActivity startActivity = (StartActivity) this.f24361t;
                C0092r c0092r = new C0092r(this, 13);
                AbstractC6341f.f24388f = c0092r;
                int i2 = AbstractC6341f.f24393k;
                int i3 = AbstractC6341f.f24389g;
                if (i2 == i3) {
                    AbstractC6341f.f24389g = 1;
                    AbstractC6341f.f24388f = c0092r;
                    if (AbstractC6341f.f24385c == null) {
                        AbstractC6341f.m12152b(startActivity, c0092r);
                    } else {
                        try {
                            AbstractC6341f.m12153c(startActivity);
                            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0758m(startActivity, 12), 1500L);
                        } catch (Exception e) {
                            e.printStackTrace();
                            AbstractC6341f.m12152b(startActivity, AbstractC6341f.f24388f);
                            return;
                        }
                    }
                } else {
                    AbstractC6341f.f24389g = i3 + 1;
                    c0092r.m164d();
                }
                break;
            case 1:
                StringBuilder sb = new StringBuilder("market://details?id=");
                StartActivity startActivity2 = (StartActivity) this.f24361t;
                sb.append(startActivity2.getPackageName());
                try {
                    startActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
                } catch (ActivityNotFoundException unused) {
                    startActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + startActivity2.getPackageName())));
                    return;
                }
                break;
            case 2:
                StartActivity startActivity3 = (StartActivity) this.f24361t;
                startActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(startActivity3.getString(R.string.privacy_url))));
                break;
            case 3:
                StartActivity startActivity4 = (StartActivity) this.f24361t;
                startActivity4.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(startActivity4.getString(R.string.play_more_apps))));
                break;
            default:
                ((MainActivity) this.f24361t).getOnBackPressedDispatcher().onBackPressed();
                break;
        }
    }
}
