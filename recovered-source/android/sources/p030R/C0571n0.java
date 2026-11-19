package p030R;

import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import p001B.AbstractC0076b;
import p001B.C0087m;

/* JADX INFO: renamed from: R.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0571n0 {

    /* JADX INFO: renamed from: a */
    public final C0589w0 f1217a;

    /* JADX INFO: renamed from: b */
    public final Object f1218b;

    public C0571n0(Object obj) {
        this.f1218b = obj;
        this.f1217a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0571n0.class == obj.getClass()) {
            C0571n0 c0571n0 = (C0571n0) obj;
            if (AbstractC0076b.m140o(this.f1217a, c0571n0.f1217a) && AbstractC0076b.m140o(this.f1218b, c0571n0.f1218b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1217a, this.f1218b});
    }

    public final String toString() {
        Object obj = this.f1218b;
        if (obj != null) {
            C0087m c0087mM143s = AbstractC0076b.m143s(this);
            c0087mM143s.m158b(obj, "config");
            return c0087mM143s.toString();
        }
        C0087m c0087mM143s2 = AbstractC0076b.m143s(this);
        c0087mM143s2.m158b(this.f1217a, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        return c0087mM143s2.toString();
    }

    public C0571n0(C0589w0 c0589w0) {
        this.f1218b = null;
        AbstractC0076b.m133h(c0589w0, NotificationCompat.CATEGORY_STATUS);
        this.f1217a = c0589w0;
        AbstractC0076b.m129d("cannot use OK status: %s", !c0589w0.m1352e(), c0589w0);
    }
}
