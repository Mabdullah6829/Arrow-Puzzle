package androidx.core.content.res;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: androidx.core.content.res.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1172a implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2665s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int f2666t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f2667u;

    public /* synthetic */ RunnableC1172a(Object obj, int i2, int i3) {
        this.f2665s = i3;
        this.f2667u = obj;
        this.f2666t = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2665s) {
            case 0:
                ((ResourcesCompat.FontCallback) this.f2667u).lambda$callbackFailAsync$1(this.f2666t);
                break;
            case 1:
                ((MaterialButton) this.f2667u).lambda$setIconSize$1(this.f2666t);
                break;
            default:
                ((SideSheetBehavior) this.f2667u).lambda$setState$0(this.f2666t);
                break;
        }
    }
}
