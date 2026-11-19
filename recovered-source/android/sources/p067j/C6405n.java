package p067j;

import java.util.ArrayList;

/* JADX INFO: renamed from: j.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6405n extends AbstractC6416y {

    /* JADX INFO: renamed from: a */
    public final ArrayList f24520a;

    public C6405n(ArrayList arrayList) {
        this.f24520a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6416y)) {
            return false;
        }
        return this.f24520a.equals(((C6405n) ((AbstractC6416y) obj)).f24520a);
    }

    public final int hashCode() {
        return this.f24520a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f24520a + "}";
    }
}
