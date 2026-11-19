package p059f;

import android.os.AsyncTask;
import android.util.Log;
import com.arrow.puzzle.escape.maze.free.game.activity.SplashActivity;
import java.util.Timer;

/* JADX INFO: renamed from: f.m */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC6331m extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SplashActivity f24359a;

    public AsyncTaskC6331m(SplashActivity splashActivity) {
        this.f24359a = splashActivity;
        Log.e("Hello", "Me");
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            Thread.sleep(2000L);
            return null;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        super.onPostExecute(obj);
        new Timer().schedule(new C6330l(this), 3000L);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
    }
}
