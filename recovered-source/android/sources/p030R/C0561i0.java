package p030R;

import java.io.IOException;
import java.io.Serializable;
import p001B.AbstractC0076b;
import p007E.AbstractC0197f;
import p034T.AbstractC0718c;
import p034T.C0777q2;
import p034T.InterfaceC0747j0;
import p036U.C0830k;
import p041Y.C0873a;
import p041Y.C0874b;

/* JADX INFO: renamed from: R.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0561i0 implements InterfaceC0747j0 {

    /* JADX INFO: renamed from: a */
    public boolean f1191a;

    /* JADX INFO: renamed from: b */
    public Object f1192b;

    /* JADX INFO: renamed from: c */
    public Object f1193c;

    /* JADX INFO: renamed from: d */
    public Serializable f1194d;

    /* JADX INFO: renamed from: e */
    public Object f1195e;

    @Override // p034T.InterfaceC0747j0
    public void close() {
        this.f1191a = true;
        AbstractC0076b.m139n(((byte[]) this.f1194d) != null, "Lack of request message. GET request is only supported for unary requests");
        ((C0830k) ((AbstractC0718c) this.f1195e)).f2232o.m167g((C0559h0) this.f1192b, (byte[]) this.f1194d);
        this.f1194d = null;
        this.f1192b = null;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [byte[], java.io.Serializable] */
    @Override // p034T.InterfaceC0747j0
    /* JADX INFO: renamed from: d */
    public void mo1314d(C0873a c0873a) {
        C0777q2 c0777q2 = (C0777q2) this.f1193c;
        AbstractC0076b.m139n(((byte[]) this.f1194d) == null, "writePayload should not be called multiple times");
        try {
            this.f1194d = AbstractC0197f.m291b(c0873a);
            AbstractC0570n[] abstractC0570nArr = c0777q2.f2019a;
            AbstractC0570n[] abstractC0570nArr2 = c0777q2.f2019a;
            for (AbstractC0570n abstractC0570n : abstractC0570nArr) {
                abstractC0570n.mo1329i(0);
            }
            byte[] bArr = (byte[]) this.f1194d;
            long length = bArr.length;
            long length2 = bArr.length;
            for (AbstractC0570n abstractC0570n2 : c0777q2.f2019a) {
                abstractC0570n2.mo1330j(0, length, length2);
            }
            long length3 = ((byte[]) this.f1194d).length;
            for (AbstractC0570n abstractC0570n3 : abstractC0570nArr2) {
                abstractC0570n3.mo1331k(length3);
            }
            long length4 = ((byte[]) this.f1194d).length;
            for (AbstractC0570n abstractC0570n4 : abstractC0570nArr2) {
                abstractC0570n4.mo1332l(length4);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public C0567l0 m1315e() {
        return new C0567l0((EnumC0565k0) this.f1194d, (String) this.f1195e, (C0874b) this.f1192b, (C0874b) this.f1193c, this.f1191a);
    }

    @Override // p034T.InterfaceC0747j0
    public boolean isClosed() {
        return this.f1191a;
    }

    @Override // p034T.InterfaceC0747j0
    public void flush() {
    }

    @Override // p034T.InterfaceC0747j0
    /* JADX INFO: renamed from: a */
    public InterfaceC0747j0 mo1311a(InterfaceC0574p interfaceC0574p) {
        return this;
    }

    @Override // p034T.InterfaceC0747j0
    /* JADX INFO: renamed from: b */
    public InterfaceC0747j0 mo1312b(boolean z) {
        return this;
    }

    @Override // p034T.InterfaceC0747j0
    /* JADX INFO: renamed from: c */
    public void mo1313c(int i2) {
    }
}
