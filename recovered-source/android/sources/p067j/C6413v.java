package p067j;

import java.util.ArrayList;

/* JADX INFO: renamed from: j.v */
/* JADX INFO: loaded from: classes.dex */
public final class C6413v extends AbstractC6387H {

    /* JADX INFO: renamed from: a */
    public final long f24545a;

    /* JADX INFO: renamed from: b */
    public final long f24546b;

    /* JADX INFO: renamed from: c */
    public final C6406o f24547c;

    /* JADX INFO: renamed from: d */
    public final Integer f24548d;

    /* JADX INFO: renamed from: e */
    public final String f24549e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f24550f;

    public C6413v(long j2, long j3, C6406o c6406o, Integer num, String str, ArrayList arrayList) {
        EnumC6391L enumC6391L = EnumC6391L.f24456s;
        this.f24545a = j2;
        this.f24546b = j3;
        this.f24547c = c6406o;
        this.f24548d = num;
        this.f24549e = str;
        this.f24550f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6387H)) {
            return false;
        }
        C6413v c6413v = (C6413v) ((AbstractC6387H) obj);
        if (this.f24545a != c6413v.f24545a) {
            return false;
        }
        c6413v.getClass();
        Object obj2 = EnumC6391L.f24456s;
        ArrayList arrayList = c6413v.f24550f;
        String str = c6413v.f24549e;
        Integer num = c6413v.f24548d;
        C6406o c6406o = c6413v.f24547c;
        if (this.f24546b != c6413v.f24546b || !this.f24547c.equals(c6406o)) {
            return false;
        }
        Integer num2 = this.f24548d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f24549e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f24550f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j2 = this.f24545a;
        long j3 = this.f24546b;
        int iHashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f24547c.hashCode()) * 1000003;
        Integer num = this.f24548d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f24549e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f24550f.hashCode()) * 1000003) ^ EnumC6391L.f24456s.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f24545a + ", requestUptimeMs=" + this.f24546b + ", clientInfo=" + this.f24547c + ", logSource=" + this.f24548d + ", logSourceName=" + this.f24549e + ", logEvents=" + this.f24550f + ", qosTier=" + EnumC6391L.f24456s + "}";
    }
}
