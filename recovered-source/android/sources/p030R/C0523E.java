package p030R;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
import p001B.AbstractC0076b;
import p001B.C0087m;

/* JADX INFO: renamed from: R.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0523E extends SocketAddress {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f1104w = 0;

    /* JADX INFO: renamed from: s */
    public final SocketAddress f1105s;

    /* JADX INFO: renamed from: t */
    public final InetSocketAddress f1106t;

    /* JADX INFO: renamed from: u */
    public final String f1107u;

    /* JADX INFO: renamed from: v */
    public final String f1108v;

    public C0523E(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        AbstractC0076b.m133h(inetSocketAddress, "proxyAddress");
        AbstractC0076b.m133h(inetSocketAddress2, "targetAddress");
        AbstractC0076b.m137l("The proxy address %s is not resolved", !inetSocketAddress.isUnresolved(), inetSocketAddress);
        this.f1105s = inetSocketAddress;
        this.f1106t = inetSocketAddress2;
        this.f1107u = str;
        this.f1108v = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0523E)) {
            return false;
        }
        C0523E c0523e = (C0523E) obj;
        return AbstractC0076b.m140o(this.f1105s, c0523e.f1105s) && AbstractC0076b.m140o(this.f1106t, c0523e.f1106t) && AbstractC0076b.m140o(this.f1107u, c0523e.f1107u) && AbstractC0076b.m140o(this.f1108v, c0523e.f1108v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1105s, this.f1106t, this.f1107u, this.f1108v});
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1105s, "proxyAddr");
        c0087mM143s.m158b(this.f1106t, "targetAddr");
        c0087mM143s.m158b(this.f1107u, "username");
        c0087mM143s.m159c("hasPassword", this.f1108v != null);
        return c0087mM143s.toString();
    }
}
