package p079q;

import java.util.Set;

/* JADX INFO: renamed from: q.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6511b {

    /* JADX INFO: renamed from: a */
    public final long f24697a;

    /* JADX INFO: renamed from: b */
    public final long f24698b;

    /* JADX INFO: renamed from: c */
    public final Set f24699c;

    public C6511b(long j2, long j3, Set set) {
        this.f24697a = j2;
        this.f24698b = j3;
        this.f24699c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6511b) {
            C6511b c6511b = (C6511b) obj;
            if (this.f24697a == c6511b.f24697a && this.f24698b == c6511b.f24698b && this.f24699c.equals(c6511b.f24699c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f24697a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        long j3 = this.f24698b;
        return ((i2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f24699c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f24697a + ", maxAllowedDelay=" + this.f24698b + ", flags=" + this.f24699c + "}";
    }
}
