package p079q;

import java.util.HashMap;
import p049b0.C1887c;
import p063h.EnumC6358d;

/* JADX INFO: renamed from: q.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6510a {

    /* JADX INFO: renamed from: a */
    public final C1887c f24695a;

    /* JADX INFO: renamed from: b */
    public final HashMap f24696b;

    public C6510a(C1887c c1887c, HashMap map) {
        this.f24695a = c1887c;
        this.f24696b = map;
    }

    /* JADX INFO: renamed from: a */
    public final long m12197a(EnumC6358d enumC6358d, long j2, int i2) {
        long jM2719f = j2 - this.f24695a.m2719f();
        C6511b c6511b = (C6511b) this.f24696b.get(enumC6358d);
        long j3 = c6511b.f24697a;
        int i3 = i2 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i3) * j3 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j3 > 1 ? j3 : 2L) * ((long) i3)))), jM2719f), c6511b.f24698b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6510a)) {
            return false;
        }
        C6510a c6510a = (C6510a) obj;
        return this.f24695a.equals(c6510a.f24695a) && this.f24696b.equals(c6510a.f24696b);
    }

    public final int hashCode() {
        return ((this.f24695a.hashCode() ^ 1000003) * 1000003) ^ this.f24696b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f24695a + ", values=" + this.f24696b + "}";
    }
}
