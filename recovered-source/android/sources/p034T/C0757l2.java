package p034T;

import java.util.Arrays;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p030R.AbstractC0539V;

/* JADX INFO: renamed from: T.l2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0757l2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0539V f1915a;

    /* JADX INFO: renamed from: b */
    public final Object f1916b;

    public C0757l2(AbstractC0539V abstractC0539V, Object obj) {
        this.f1915a = abstractC0539V;
        this.f1916b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0757l2.class == obj.getClass()) {
            C0757l2 c0757l2 = (C0757l2) obj;
            if (AbstractC0076b.m140o(this.f1915a, c0757l2.f1915a) && AbstractC0076b.m140o(this.f1916b, c0757l2.f1916b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1915a, this.f1916b});
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1915a, "provider");
        c0087mM143s.m158b(this.f1916b, "config");
        return c0087mM143s.toString();
    }
}
