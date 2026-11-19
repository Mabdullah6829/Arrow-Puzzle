package p030R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p001B.AbstractC0076b;
import p001B.C0087m;

/* JADX INFO: renamed from: R.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0535Q {

    /* JADX INFO: renamed from: a */
    public final List f1140a;

    /* JADX INFO: renamed from: b */
    public final C0546b f1141b;

    /* JADX INFO: renamed from: c */
    public final Object f1142c;

    public C0535Q(List list, C0546b c0546b, Object obj) {
        AbstractC0076b.m133h(list, "addresses");
        this.f1140a = Collections.unmodifiableList(new ArrayList(list));
        AbstractC0076b.m133h(c0546b, "attributes");
        this.f1141b = c0546b;
        this.f1142c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0535Q)) {
            return false;
        }
        C0535Q c0535q = (C0535Q) obj;
        return AbstractC0076b.m140o(this.f1140a, c0535q.f1140a) && AbstractC0076b.m140o(this.f1141b, c0535q.f1141b) && AbstractC0076b.m140o(this.f1142c, c0535q.f1142c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1140a, this.f1141b, this.f1142c});
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1140a, "addresses");
        c0087mM143s.m158b(this.f1141b, "attributes");
        c0087mM143s.m158b(this.f1142c, "loadBalancingPolicyConfig");
        return c0087mM143s.toString();
    }
}
