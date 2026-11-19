package p059f;

import com.arrow.puzzle.escape.maze.free.game.activity.MainActivity;
import com.google.ads.mediation.C5136d;

/* JADX INFO: renamed from: f.i */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6327i implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24352s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C5136d f24353t;

    public /* synthetic */ RunnableC6327i(C5136d c5136d, int i2) {
        this.f24352s = i2;
        this.f24353t = c5136d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24352s) {
            case 0:
                ((MainActivity) this.f24353t.f2920b).f2905s.evaluateJavascript("integration.adClosed(); resumeMusic();", null);
                break;
            case 1:
                ((MainActivity) this.f24353t.f2920b).f2905s.evaluateJavascript("resumeMusic();", null);
                break;
            default:
                ((MainActivity) this.f24353t.f2920b).f2905s.evaluateJavascript("pauseMusic();", null);
                break;
        }
    }
}
