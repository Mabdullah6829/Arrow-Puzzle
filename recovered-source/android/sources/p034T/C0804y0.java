package p034T;

import p030R.AbstractC0570n;
import p030R.C0556g;
import p030R.C0559h0;
import p030R.C0567l0;

/* JADX INFO: renamed from: T.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0804y0 extends AbstractC0739h0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0654H f2110a;

    /* JADX INFO: renamed from: b */
    public final C0742i f2111b;

    public C0804y0(InterfaceC0654H interfaceC0654H, C0742i c0742i) {
        this.f2110a = interfaceC0654H;
        this.f2111b = c0742i;
    }

    @Override // p034T.InterfaceC0639C
    /* JADX INFO: renamed from: c */
    public final InterfaceC0806z mo1483c(C0567l0 c0567l0, C0559h0 c0559h0, C0556g c0556g, AbstractC0570n[] abstractC0570nArr) {
        return new C0801x0(this, this.f2110a.mo1483c(c0567l0, c0559h0, c0556g, abstractC0570nArr));
    }

    @Override // p034T.AbstractC0739h0
    /* JADX INFO: renamed from: f */
    public final InterfaceC0654H mo1611f() {
        return this.f2110a;
    }
}
