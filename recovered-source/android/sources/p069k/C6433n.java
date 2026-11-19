package p069k;

import java.util.Arrays;
import p063h.C6357c;

/* JADX INFO: renamed from: k.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6433n {

    /* JADX INFO: renamed from: a */
    public final C6357c f24608a;

    /* JADX INFO: renamed from: b */
    public final byte[] f24609b;

    public C6433n(C6357c c6357c, byte[] bArr) {
        if (c6357c == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f24608a = c6357c;
        this.f24609b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6433n)) {
            return false;
        }
        C6433n c6433n = (C6433n) obj;
        if (this.f24608a.equals(c6433n.f24608a)) {
            return Arrays.equals(this.f24609b, c6433n.f24609b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f24608a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24609b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f24608a + ", bytes=[...]}";
    }
}
