package androidx.profileinstaller;

import android.content.Context;

/* JADX INFO: renamed from: androidx.profileinstaller.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1640c implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2829s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Context f2830t;

    public /* synthetic */ RunnableC1640c(Context context, int i2) {
        this.f2829s = i2;
        this.f2830t = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2829s) {
            case 0:
                ProfileInstallerInitializer.writeInBackground(this.f2830t);
                break;
            default:
                ProfileInstaller.writeProfile(this.f2830t);
                break;
        }
    }
}
