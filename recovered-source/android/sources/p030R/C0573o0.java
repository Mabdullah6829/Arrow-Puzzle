package p030R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p001B.AbstractC0076b;
import p001B.C0087m;

/* JADX INFO: renamed from: R.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0573o0 {

    /* JADX INFO: renamed from: a */
    public final List f1222a;

    /* JADX INFO: renamed from: b */
    public final C0546b f1223b;

    /* JADX INFO: renamed from: c */
    public final C0571n0 f1224c;

    public C0573o0(List list, C0546b c0546b, C0571n0 c0571n0) {
        this.f1222a = Collections.unmodifiableList(new ArrayList(list));
        AbstractC0076b.m133h(c0546b, "attributes");
        this.f1223b = c0546b;
        this.f1224c = c0571n0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0573o0)) {
            return false;
        }
        C0573o0 c0573o0 = (C0573o0) obj;
        return AbstractC0076b.m140o(this.f1222a, c0573o0.f1222a) && AbstractC0076b.m140o(this.f1223b, c0573o0.f1223b) && AbstractC0076b.m140o(this.f1224c, c0573o0.f1224c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1222a, this.f1223b, this.f1224c});
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1222a, "addresses");
        c0087mM143s.m158b(this.f1223b, "attributes");
        c0087mM143s.m158b(this.f1224c, "serviceConfig");
        return c0087mM143s.toString();
    }
}
