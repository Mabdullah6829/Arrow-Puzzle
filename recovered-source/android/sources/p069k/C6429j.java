package p069k;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: k.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6429j {

    /* JADX INFO: renamed from: a */
    public final String f24588a;

    /* JADX INFO: renamed from: b */
    public final Integer f24589b;

    /* JADX INFO: renamed from: c */
    public final C6433n f24590c;

    /* JADX INFO: renamed from: d */
    public final long f24591d;

    /* JADX INFO: renamed from: e */
    public final long f24592e;

    /* JADX INFO: renamed from: f */
    public final Map f24593f;

    /* JADX INFO: renamed from: g */
    public final Integer f24594g;

    /* JADX INFO: renamed from: h */
    public final String f24595h;

    /* JADX INFO: renamed from: i */
    public final byte[] f24596i;

    /* JADX INFO: renamed from: j */
    public final byte[] f24597j;

    public C6429j(String str, Integer num, C6433n c6433n, long j2, long j3, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f24588a = str;
        this.f24589b = num;
        this.f24590c = c6433n;
        this.f24591d = j2;
        this.f24592e = j3;
        this.f24593f = map;
        this.f24594g = num2;
        this.f24595h = str2;
        this.f24596i = bArr;
        this.f24597j = bArr2;
    }

    /* JADX INFO: renamed from: a */
    public final String m12166a(String str) {
        String str2 = (String) this.f24593f.get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: b */
    public final int m12167b(String str) {
        String str2 = (String) this.f24593f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: c */
    public final C6428i m12168c() {
        C6428i c6428i = new C6428i();
        String str = this.f24588a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c6428i.f24578a = str;
        c6428i.f24579b = this.f24589b;
        c6428i.f24584g = this.f24594g;
        c6428i.f24585h = this.f24595h;
        c6428i.f24586i = this.f24596i;
        c6428i.f24587j = this.f24597j;
        C6433n c6433n = this.f24590c;
        if (c6433n == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c6428i.f24580c = c6433n;
        c6428i.f24581d = Long.valueOf(this.f24591d);
        c6428i.f24582e = Long.valueOf(this.f24592e);
        c6428i.f24583f = new HashMap(this.f24593f);
        return c6428i;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6429j) {
            C6429j c6429j = (C6429j) obj;
            String str2 = c6429j.f24588a;
            String str3 = c6429j.f24595h;
            Integer num3 = c6429j.f24594g;
            Integer num4 = c6429j.f24589b;
            if (this.f24588a.equals(str2) && ((num = this.f24589b) != null ? num.equals(num4) : num4 == null) && this.f24590c.equals(c6429j.f24590c) && this.f24591d == c6429j.f24591d && this.f24592e == c6429j.f24592e && this.f24593f.equals(c6429j.f24593f) && ((num2 = this.f24594g) != null ? num2.equals(num3) : num3 == null) && ((str = this.f24595h) != null ? str.equals(str3) : str3 == null) && Arrays.equals(this.f24596i, c6429j.f24596i) && Arrays.equals(this.f24597j, c6429j.f24597j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f24588a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f24589b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f24590c.hashCode()) * 1000003;
        long j2 = this.f24591d;
        int i2 = (iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f24592e;
        int iHashCode3 = (((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f24593f.hashCode()) * 1000003;
        Integer num2 = this.f24594g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f24595h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f24596i)) * 1000003) ^ Arrays.hashCode(this.f24597j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f24588a + ", code=" + this.f24589b + ", encodedPayload=" + this.f24590c + ", eventMillis=" + this.f24591d + ", uptimeMillis=" + this.f24592e + ", autoMetadata=" + this.f24593f + ", productId=" + this.f24594g + ", pseudonymousId=" + this.f24595h + ", experimentIdsClear=" + Arrays.toString(this.f24596i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f24597j) + "}";
    }
}
