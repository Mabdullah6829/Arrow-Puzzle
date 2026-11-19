package p034T;

import java.util.Arrays;
import java.util.Map;
import p001B.AbstractC0076b;
import p001B.C0087m;

/* JADX INFO: renamed from: T.k2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0753k2 {

    /* JADX INFO: renamed from: a */
    public final String f1903a;

    /* JADX INFO: renamed from: b */
    public final Map f1904b;

    public C0753k2(String str, Map map) {
        AbstractC0076b.m133h(str, "policyName");
        this.f1903a = str;
        AbstractC0076b.m133h(map, "rawConfigValue");
        this.f1904b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0753k2) {
            C0753k2 c0753k2 = (C0753k2) obj;
            if (this.f1903a.equals(c0753k2.f1903a) && this.f1904b.equals(c0753k2.f1904b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1903a, this.f1904b});
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1903a, "policyName");
        c0087mM143s.m158b(this.f1904b, "rawConfigValue");
        return c0087mM143s.toString();
    }
}
