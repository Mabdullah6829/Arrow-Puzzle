package p081r;

import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: r.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6522a {

    /* JADX INFO: renamed from: f */
    public static final C6522a f24736f = new C6522a(200, 10000, 10485760, 604800000, 81920);

    /* JADX INFO: renamed from: a */
    public final long f24737a;

    /* JADX INFO: renamed from: b */
    public final int f24738b;

    /* JADX INFO: renamed from: c */
    public final int f24739c;

    /* JADX INFO: renamed from: d */
    public final long f24740d;

    /* JADX INFO: renamed from: e */
    public final int f24741e;

    public C6522a(int i2, int i3, long j2, long j3, int i4) {
        this.f24737a = j2;
        this.f24738b = i2;
        this.f24739c = i3;
        this.f24740d = j3;
        this.f24741e = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6522a) {
            C6522a c6522a = (C6522a) obj;
            if (this.f24737a == c6522a.f24737a && this.f24738b == c6522a.f24738b && this.f24739c == c6522a.f24739c && this.f24740d == c6522a.f24740d && this.f24741e == c6522a.f24741e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f24737a;
        int i2 = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f24738b) * 1000003) ^ this.f24739c) * 1000003;
        long j3 = this.f24740d;
        return ((i2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f24741e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f24737a);
        sb.append(", loadBatchSize=");
        sb.append(this.f24738b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f24739c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f24740d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC0271e0.m402j(sb, "}", this.f24741e);
    }
}
