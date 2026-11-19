package p034T;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import p001B.AbstractC0076b;
import p030R.C0556g;
import p030R.C0559h0;
import p030R.C0567l0;

/* JADX INFO: renamed from: T.C1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0641C1 {

    /* JADX INFO: renamed from: a */
    public final C0556g f1406a;

    /* JADX INFO: renamed from: b */
    public final C0559h0 f1407b;

    /* JADX INFO: renamed from: c */
    public final C0567l0 f1408c;

    public C0641C1(C0567l0 c0567l0, C0559h0 c0559h0, C0556g c0556g) {
        AbstractC0076b.m133h(c0567l0, FirebaseAnalytics.Param.METHOD);
        this.f1408c = c0567l0;
        AbstractC0076b.m133h(c0559h0, "headers");
        this.f1407b = c0559h0;
        AbstractC0076b.m133h(c0556g, "callOptions");
        this.f1406a = c0556g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0641C1.class == obj.getClass()) {
            C0641C1 c0641c1 = (C0641C1) obj;
            if (AbstractC0076b.m140o(this.f1406a, c0641c1.f1406a) && AbstractC0076b.m140o(this.f1407b, c0641c1.f1407b) && AbstractC0076b.m140o(this.f1408c, c0641c1.f1408c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1406a, this.f1407b, this.f1408c});
    }

    public final String toString() {
        return "[method=" + this.f1408c + " headers=" + this.f1407b + " callOptions=" + this.f1406a + "]";
    }
}
