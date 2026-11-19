package p034T;

import p030R.AbstractC0522D;
import p030R.EnumC0578r;

/* JADX INFO: renamed from: T.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0796v1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0522D f2068a;

    /* JADX INFO: renamed from: c */
    public final C0784s1 f2070c;

    /* JADX INFO: renamed from: d */
    public boolean f2071d = false;

    /* JADX INFO: renamed from: b */
    public EnumC0578r f2069b = EnumC0578r.f1235v;

    public C0796v1(AbstractC0522D abstractC0522D, C0784s1 c0784s1) {
        this.f2068a = abstractC0522D;
        this.f2070c = c0784s1;
    }

    /* JADX INFO: renamed from: a */
    public static void m1668a(C0796v1 c0796v1, EnumC0578r enumC0578r) {
        c0796v1.f2069b = enumC0578r;
        if (enumC0578r == EnumC0578r.f1233t || enumC0578r == EnumC0578r.f1234u) {
            c0796v1.f2071d = true;
        } else if (enumC0578r == EnumC0578r.f1235v) {
            c0796v1.f2071d = false;
        }
    }
}
