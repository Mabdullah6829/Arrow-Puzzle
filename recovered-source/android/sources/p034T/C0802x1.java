package p034T;

import p030R.AbstractC0522D;
import p030R.AbstractC0536S;
import p030R.AbstractC0558h;
import p030R.C0534P;
import p030R.C0580s;
import p030R.EnumC0578r;
import p030R.InterfaceC0537T;

/* JADX INFO: renamed from: T.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0802x1 implements InterfaceC0537T {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0522D f2091a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0635A1 f2092b;

    public C0802x1(C0635A1 c0635a1, AbstractC0522D abstractC0522D) {
        this.f2092b = c0635a1;
        this.f2091a = abstractC0522D;
    }

    @Override // p030R.InterfaceC0537T
    /* JADX INFO: renamed from: a */
    public final void mo1263a(C0580s c0580s) {
        AbstractC0536S c0808z1;
        C0635A1 c0635a1 = this.f2092b;
        AbstractC0558h abstractC0558h = c0635a1.f1398f;
        EnumC0578r enumC0578r = c0580s.f1238a;
        if (enumC0578r == EnumC0578r.f1236w) {
            return;
        }
        EnumC0578r enumC0578r2 = EnumC0578r.f1235v;
        EnumC0578r enumC0578r3 = EnumC0578r.f1234u;
        if (enumC0578r == enumC0578r3 || enumC0578r == enumC0578r2) {
            abstractC0558h.mo1303j();
        }
        if (c0635a1.f1400h == enumC0578r3) {
            if (enumC0578r == EnumC0578r.f1232s) {
                return;
            }
            if (enumC0578r == enumC0578r2) {
                c0635a1.mo1268e();
                return;
            }
        }
        int iOrdinal = enumC0578r.ordinal();
        if (iOrdinal != 0) {
            AbstractC0522D abstractC0522D = this.f2091a;
            if (iOrdinal == 1) {
                c0808z1 = new C0808z1(C0534P.m1261b(abstractC0522D, null));
            } else if (iOrdinal == 2) {
                c0808z1 = new C0808z1(C0534P.m1260a(c0580s.f1239b));
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("Unsupported state:" + enumC0578r);
                }
                c0808z1 = new C0792u1(c0635a1, abstractC0522D);
            }
        } else {
            c0808z1 = new C0808z1(C0534P.f1135e);
        }
        c0635a1.f1400h = enumC0578r;
        abstractC0558h.mo1304k(enumC0578r, c0808z1);
    }
}
