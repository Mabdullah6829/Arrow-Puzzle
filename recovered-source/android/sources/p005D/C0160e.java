package p005D;

import java.io.Serializable;
import p022N.AbstractC0355G;

/* JADX INFO: renamed from: D.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0160e extends AbstractC0355G implements Serializable {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ int f280H = 0;

    static {
        int i2 = AbstractC0158c.f273a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0160e)) {
            return false;
        }
        ((C0160e) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return C0160e.class.hashCode();
    }

    @Override // p022N.AbstractC0355G
    public final String toString() {
        return "Hashing.murmur3_128(0)";
    }
}
