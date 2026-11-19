package p059f;

import android.content.Intent;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.arrow.puzzle.escape.maze.free.game.activity.StartActivity;
import java.util.TimerTask;

/* JADX INFO: renamed from: f.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6330l extends TimerTask {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ AsyncTaskC6331m f24358s;

    public C6330l(AsyncTaskC6331m asyncTaskC6331m) {
        this.f24358s = asyncTaskC6331m;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        AsyncTaskC6331m asyncTaskC6331m = this.f24358s;
        asyncTaskC6331m.f24359a.startActivity(new Intent(asyncTaskC6331m.f24359a, (Class<?>) StartActivity.class));
        asyncTaskC6331m.f24359a.overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
}
