package androidx.core.view;

import android.view.ViewConfiguration;
import androidx.core.util.Supplier;

/* JADX INFO: renamed from: androidx.core.view.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1272k implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2729a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewConfiguration f2730b;

    public /* synthetic */ C1272k(ViewConfiguration viewConfiguration, int i2) {
        this.f2729a = i2;
        this.f2730b = viewConfiguration;
    }

    @Override // androidx.core.util.Supplier
    public final Object get() {
        int scaledMaximumFlingVelocity;
        switch (this.f2729a) {
            case 0:
                scaledMaximumFlingVelocity = this.f2730b.getScaledMaximumFlingVelocity();
                break;
            default:
                scaledMaximumFlingVelocity = this.f2730b.getScaledMinimumFlingVelocity();
                break;
        }
        return Integer.valueOf(scaledMaximumFlingVelocity);
    }
}
