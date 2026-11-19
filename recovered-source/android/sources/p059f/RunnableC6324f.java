package p059f;

import com.google.ads.mediation.C5136d;

/* JADX INFO: renamed from: f.f */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6324f implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24348s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C5136d f24349t;

    public /* synthetic */ RunnableC6324f(C5136d c5136d, int i2) {
        this.f24348s = i2;
        this.f24349t = c5136d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24348s) {
            case 0:
                ((C6325g) this.f24349t.f2920b).f24350a.f2905s.evaluateJavascript("integration.adClosed(); resumeMusic();", null);
                break;
            case 1:
                ((C6325g) this.f24349t.f2920b).f24350a.f2905s.evaluateJavascript("resumeMusic();", null);
                break;
            default:
                ((C6325g) this.f24349t.f2920b).f24350a.f2905s.evaluateJavascript("pauseMusic();", null);
                break;
        }
    }
}
