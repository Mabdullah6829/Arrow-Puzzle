package p059f;

import android.app.Dialog;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.webkit.internal.AssetHelper;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.arrow.puzzle.escape.maze.free.game.activity.SplashActivity;
import com.arrow.puzzle.escape.maze.free.game.activity.StartActivity;
import com.google.firebase.firestore.FirebaseFirestore;
import p001B.C0092r;

/* JADX INFO: renamed from: f.k */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC6329k implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24355s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f24356t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ AppCompatActivity f24357u;

    public /* synthetic */ ViewOnClickListenerC6329k(AppCompatActivity appCompatActivity, Object obj, int i2) {
        this.f24355s = i2;
        this.f24357u = appCompatActivity;
        this.f24356t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24355s) {
            case 0:
                Dialog dialog = (Dialog) this.f24356t;
                SplashActivity splashActivity = (SplashActivity) this.f24357u;
                if (!(((ConnectivityManager) splashActivity.getSystemService("connectivity")).getActiveNetworkInfo() != null)) {
                    dialog.dismiss();
                    dialog.show();
                } else {
                    FirebaseFirestore.getInstance().collection("ALLID").document("ADID").get().addOnCompleteListener(new C0092r(splashActivity, 12));
                    dialog.dismiss();
                    new AsyncTaskC6331m(splashActivity).execute(new Object[0]);
                }
                break;
            default:
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
                StringBuilder sb = new StringBuilder();
                StartActivity startActivity = (StartActivity) this.f24357u;
                sb.append(startActivity.getString(R.string.app_name));
                sb.append("\n\n");
                sb.append((String) this.f24356t);
                intent.putExtra("android.intent.extra.TEXT", sb.toString());
                startActivity.startActivity(Intent.createChooser(intent, "Share URL"));
                break;
        }
    }
}
