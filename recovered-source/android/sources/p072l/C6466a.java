package p072l;

/* JADX INFO: renamed from: l.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6466a {

    /* JADX INFO: renamed from: a */
    public final int f24642a;

    /* JADX INFO: renamed from: b */
    public final long f24643b;

    public C6466a(int i2, long j2) {
        if (i2 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f24642a = i2;
        this.f24643b = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6466a)) {
            return false;
        }
        C6466a c6466a = (C6466a) obj;
        return AbstractC6468c.m12192a(this.f24642a, c6466a.f24642a) && this.f24643b == c6466a.f24643b;
    }

    public final int hashCode() {
        int iM12193b = (AbstractC6468c.m12193b(this.f24642a) ^ 1000003) * 1000003;
        long j2 = this.f24643b;
        return iM12193b ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i2 = this.f24642a;
        if (i2 == 1) {
            str = "OK";
        } else if (i2 == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i2 != 3) {
            str = i2 != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f24643b);
        sb.append("}");
        return sb.toString();
    }
}
