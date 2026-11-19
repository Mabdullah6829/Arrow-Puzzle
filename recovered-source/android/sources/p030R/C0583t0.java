package p030R;

import java.util.Comparator;

/* JADX INFO: renamed from: R.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0583t0 implements Comparator {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC0585u0 f1244s;

    public C0583t0(InterfaceC0585u0 interfaceC0585u0) {
        this.f1244s = interfaceC0585u0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC0585u0 interfaceC0585u0 = this.f1244s;
        int iMo1338e = interfaceC0585u0.mo1338e(obj) - interfaceC0585u0.mo1338e(obj2);
        return iMo1338e != 0 ? iMo1338e : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
