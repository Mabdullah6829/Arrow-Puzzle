package p030R;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: R.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0594z {

    /* JADX INFO: renamed from: d */
    public static final C0544a f1304d = new C0544a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: a */
    public final List f1305a;

    /* JADX INFO: renamed from: b */
    public final C0546b f1306b;

    /* JADX INFO: renamed from: c */
    public final int f1307c;

    public C0594z(SocketAddress socketAddress) {
        C0546b c0546b = C0546b.f1154b;
        List listSingletonList = Collections.singletonList(socketAddress);
        AbstractC0076b.m131f(!listSingletonList.isEmpty(), "addrs is empty");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listSingletonList));
        this.f1305a = listUnmodifiableList;
        AbstractC0076b.m133h(c0546b, "attrs");
        this.f1306b = c0546b;
        this.f1307c = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0594z)) {
            return false;
        }
        C0594z c0594z = (C0594z) obj;
        List list = this.f1305a;
        if (list.size() != c0594z.f1305a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!((SocketAddress) list.get(i2)).equals(c0594z.f1305a.get(i2))) {
                return false;
            }
        }
        return this.f1306b.equals(c0594z.f1306b);
    }

    public final int hashCode() {
        return this.f1307c;
    }

    public final String toString() {
        return "[" + this.f1305a + "/" + this.f1306b + "]";
    }
}
