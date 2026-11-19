package p034T;

import java.net.SocketAddress;
import java.util.List;
import p030R.C0594z;

/* JADX INFO: renamed from: T.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0807z0 {

    /* JADX INFO: renamed from: a */
    public Object f2113a = new C0807z0[256];

    /* JADX INFO: renamed from: b */
    public int f2114b = 0;

    /* JADX INFO: renamed from: c */
    public int f2115c = 0;

    /* JADX INFO: renamed from: a */
    public SocketAddress m1677a() {
        if (m1679c()) {
            return (SocketAddress) ((C0594z) ((List) this.f2113a).get(this.f2114b)).f1305a.get(this.f2115c);
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    /* JADX INFO: renamed from: b */
    public boolean m1678b() {
        if (m1679c()) {
            C0594z c0594z = (C0594z) ((List) this.f2113a).get(this.f2114b);
            int i2 = this.f2115c + 1;
            this.f2115c = i2;
            if (i2 >= c0594z.f1305a.size()) {
                int i3 = this.f2114b + 1;
                this.f2114b = i3;
                this.f2115c = 0;
                if (i3 < ((List) this.f2113a).size()) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m1679c() {
        return this.f2114b < ((List) this.f2113a).size();
    }

    /* JADX INFO: renamed from: d */
    public void m1680d() {
        this.f2114b = 0;
        this.f2115c = 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m1681e(SocketAddress socketAddress) {
        for (int i2 = 0; i2 < ((List) this.f2113a).size(); i2++) {
            int iIndexOf = ((C0594z) ((List) this.f2113a).get(i2)).f1305a.indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.f2114b = i2;
                this.f2115c = iIndexOf;
                return true;
            }
        }
        return false;
    }
}
