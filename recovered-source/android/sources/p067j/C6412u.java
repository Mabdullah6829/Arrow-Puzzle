package p067j;

import java.util.Arrays;

/* JADX INFO: renamed from: j.u */
/* JADX INFO: loaded from: classes.dex */
public final class C6412u extends AbstractC6386G {

    /* JADX INFO: renamed from: a */
    public final long f24536a;

    /* JADX INFO: renamed from: b */
    public final Integer f24537b;

    /* JADX INFO: renamed from: c */
    public final AbstractC6382C f24538c;

    /* JADX INFO: renamed from: d */
    public final long f24539d;

    /* JADX INFO: renamed from: e */
    public final byte[] f24540e;

    /* JADX INFO: renamed from: f */
    public final String f24541f;

    /* JADX INFO: renamed from: g */
    public final long f24542g;

    /* JADX INFO: renamed from: h */
    public final AbstractC6390K f24543h;

    /* JADX INFO: renamed from: i */
    public final AbstractC6383D f24544i;

    public C6412u(long j2, Integer num, AbstractC6382C abstractC6382C, long j3, byte[] bArr, String str, long j4, AbstractC6390K abstractC6390K, AbstractC6383D abstractC6383D) {
        this.f24536a = j2;
        this.f24537b = num;
        this.f24538c = abstractC6382C;
        this.f24539d = j3;
        this.f24540e = bArr;
        this.f24541f = str;
        this.f24542g = j4;
        this.f24543h = abstractC6390K;
        this.f24544i = abstractC6383D;
    }

    public final boolean equals(Object obj) {
        Integer num;
        AbstractC6382C abstractC6382C;
        String str;
        AbstractC6390K abstractC6390K;
        AbstractC6383D abstractC6383D;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6386G) {
            AbstractC6386G abstractC6386G = (AbstractC6386G) obj;
            if (this.f24536a == ((C6412u) abstractC6386G).f24536a && ((num = this.f24537b) != null ? num.equals(((C6412u) abstractC6386G).f24537b) : ((C6412u) abstractC6386G).f24537b == null) && ((abstractC6382C = this.f24538c) != null ? abstractC6382C.equals(((C6412u) abstractC6386G).f24538c) : ((C6412u) abstractC6386G).f24538c == null)) {
                C6412u c6412u = (C6412u) abstractC6386G;
                AbstractC6383D abstractC6383D2 = c6412u.f24544i;
                AbstractC6390K abstractC6390K2 = c6412u.f24543h;
                String str2 = c6412u.f24541f;
                if (this.f24539d == c6412u.f24539d) {
                    if (Arrays.equals(this.f24540e, abstractC6386G instanceof C6412u ? ((C6412u) abstractC6386G).f24540e : c6412u.f24540e) && ((str = this.f24541f) != null ? str.equals(str2) : str2 == null) && this.f24542g == c6412u.f24542g && ((abstractC6390K = this.f24543h) != null ? abstractC6390K.equals(abstractC6390K2) : abstractC6390K2 == null) && ((abstractC6383D = this.f24544i) != null ? abstractC6383D.equals(abstractC6383D2) : abstractC6383D2 == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f24536a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f24537b;
        int iHashCode = (i2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        AbstractC6382C abstractC6382C = this.f24538c;
        int iHashCode2 = (iHashCode ^ (abstractC6382C == null ? 0 : abstractC6382C.hashCode())) * 1000003;
        long j3 = this.f24539d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f24540e)) * 1000003;
        String str = this.f24541f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j4 = this.f24542g;
        int i3 = (iHashCode4 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        AbstractC6390K abstractC6390K = this.f24543h;
        int iHashCode5 = (i3 ^ (abstractC6390K == null ? 0 : abstractC6390K.hashCode())) * 1000003;
        AbstractC6383D abstractC6383D = this.f24544i;
        return iHashCode5 ^ (abstractC6383D != null ? abstractC6383D.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f24536a + ", eventCode=" + this.f24537b + ", complianceData=" + this.f24538c + ", eventUptimeMs=" + this.f24539d + ", sourceExtension=" + Arrays.toString(this.f24540e) + ", sourceExtensionJsonProto3=" + this.f24541f + ", timezoneOffsetSeconds=" + this.f24542g + ", networkConnectionInfo=" + this.f24543h + ", experimentIds=" + this.f24544i + "}";
    }
}
