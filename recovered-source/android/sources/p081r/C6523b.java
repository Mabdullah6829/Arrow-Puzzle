package p081r;

import p069k.C6429j;
import p069k.C6430k;

/* JADX INFO: renamed from: r.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6523b {

    /* JADX INFO: renamed from: a */
    public final long f24742a;

    /* JADX INFO: renamed from: b */
    public final C6430k f24743b;

    /* JADX INFO: renamed from: c */
    public final C6429j f24744c;

    public C6523b(long j2, C6430k c6430k, C6429j c6429j) {
        this.f24742a = j2;
        this.f24743b = c6430k;
        this.f24744c = c6429j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6523b)) {
            return false;
        }
        C6523b c6523b = (C6523b) obj;
        return this.f24742a == c6523b.f24742a && this.f24743b.equals(c6523b.f24743b) && this.f24744c.equals(c6523b.f24744c);
    }

    public final int hashCode() {
        long j2 = this.f24742a;
        return ((((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ this.f24743b.hashCode()) * 1000003) ^ this.f24744c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f24742a + ", transportContext=" + this.f24743b + ", event=" + this.f24744c + "}";
    }
}
