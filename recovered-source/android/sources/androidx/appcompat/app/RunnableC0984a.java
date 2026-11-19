package androidx.appcompat.app;

import android.content.Context;

/* JADX INFO: renamed from: androidx.appcompat.app.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0984a implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2579s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Context f2580t;

    public /* synthetic */ RunnableC0984a(Context context, int i2) {
        this.f2579s = i2;
        this.f2580t = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2579s) {
            case 0:
                AppCompatDelegate.lambda$syncRequestedAndStoredLocales$1(this.f2580t);
                break;
            default:
                AppCompatDelegate.syncRequestedAndStoredLocales(this.f2580t);
                break;
        }
    }
}
