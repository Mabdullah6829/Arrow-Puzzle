package p030R;

import java.util.Arrays;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p034T.C0643D0;

/* JADX INFO: renamed from: R.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0525G {

    /* JADX INFO: renamed from: a */
    public final String f1113a;

    /* JADX INFO: renamed from: b */
    public final EnumC0524F f1114b;

    /* JADX INFO: renamed from: c */
    public final long f1115c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0528J f1116d;

    public C0525G(String str, EnumC0524F enumC0524F, long j2, C0643D0 c0643d0) {
        this.f1113a = str;
        this.f1114b = enumC0524F;
        this.f1115c = j2;
        this.f1116d = c0643d0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0525G)) {
            return false;
        }
        C0525G c0525g = (C0525G) obj;
        return AbstractC0076b.m140o(this.f1113a, c0525g.f1113a) && AbstractC0076b.m140o(this.f1114b, c0525g.f1114b) && this.f1115c == c0525g.f1115c && AbstractC0076b.m140o(null, null) && AbstractC0076b.m140o(this.f1116d, c0525g.f1116d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1113a, this.f1114b, Long.valueOf(this.f1115c), null, this.f1116d});
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1113a, "description");
        c0087mM143s.m158b(this.f1114b, "severity");
        c0087mM143s.m157a(this.f1115c, "timestampNanos");
        c0087mM143s.m158b(null, "channelRef");
        c0087mM143s.m158b(this.f1116d, "subchannelRef");
        return c0087mM143s.toString();
    }
}
