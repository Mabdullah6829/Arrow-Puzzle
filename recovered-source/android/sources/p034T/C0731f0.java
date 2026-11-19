package p034T;

import com.google.firebase.messaging.Constants;
import p001B.AbstractC0076b;
import p030R.AbstractC0570n;
import p030R.C0559h0;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0731f0 extends C0776q1 {

    /* JADX INFO: renamed from: b */
    public boolean f1855b;

    /* JADX INFO: renamed from: c */
    public final C0589w0 f1856c;

    /* JADX INFO: renamed from: d */
    public final EnumC0633A f1857d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0570n[] f1858e;

    public C0731f0(C0589w0 c0589w0, EnumC0633A enumC0633A, AbstractC0570n[] abstractC0570nArr) {
        AbstractC0076b.m131f(!c0589w0.m1352e(), "error must not be OK");
        this.f1856c = c0589w0;
        this.f1857d = enumC0633A;
        this.f1858e = abstractC0570nArr;
    }

    @Override // p034T.C0776q1, p034T.InterfaceC0806z
    /* JADX INFO: renamed from: e */
    public final void mo1543e(C0783s0 c0783s0) {
        c0783s0.m1659c(this.f1856c, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        c0783s0.m1659c(this.f1857d, "progress");
    }

    @Override // p034T.C0776q1, p034T.InterfaceC0806z
    /* JADX INFO: renamed from: l */
    public final void mo1550l(InterfaceC0636B interfaceC0636B) {
        AbstractC0076b.m139n(!this.f1855b, "already started");
        this.f1855b = true;
        AbstractC0570n[] abstractC0570nArr = this.f1858e;
        int length = abstractC0570nArr.length;
        int i2 = 0;
        while (true) {
            C0589w0 c0589w0 = this.f1856c;
            if (i2 >= length) {
                interfaceC0636B.mo148a(c0589w0, this.f1857d, new C0559h0());
                return;
            } else {
                abstractC0570nArr[i2].mo1333m(c0589w0);
                i2++;
            }
        }
    }

    public C0731f0(C0589w0 c0589w0, AbstractC0570n[] abstractC0570nArr) {
        this(c0589w0, EnumC0633A.f1391s, abstractC0570nArr);
    }
}
