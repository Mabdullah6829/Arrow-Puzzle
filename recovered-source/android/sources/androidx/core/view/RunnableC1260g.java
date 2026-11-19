package androidx.core.view;

import android.view.View;
import p078p0.InterfaceC6487a;

/* JADX INFO: renamed from: androidx.core.view.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1260g implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2721s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f2722t;

    public /* synthetic */ RunnableC1260g(Object obj, int i2) {
        this.f2721s = i2;
        this.f2722t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2721s) {
            case 0:
                SoftwareKeyboardControllerCompat.Impl20.lambda$show$0((View) this.f2722t);
                break;
            default:
                ((InterfaceC6487a) this.f2722t).invoke();
                break;
        }
    }
}
