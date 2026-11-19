package p030R;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p044a0.C0896r;

/* JADX INFO: renamed from: R.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0534P {

    /* JADX INFO: renamed from: e */
    public static final C0534P f1135e = new C0534P(null, null, C0589w0.f1275e, false);

    /* JADX INFO: renamed from: a */
    public final AbstractC0522D f1136a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0566l f1137b;

    /* JADX INFO: renamed from: c */
    public final C0589w0 f1138c;

    /* JADX INFO: renamed from: d */
    public final boolean f1139d;

    public C0534P(AbstractC0522D abstractC0522D, AbstractC0566l abstractC0566l, C0589w0 c0589w0, boolean z) {
        this.f1136a = abstractC0522D;
        this.f1137b = abstractC0566l;
        AbstractC0076b.m133h(c0589w0, NotificationCompat.CATEGORY_STATUS);
        this.f1138c = c0589w0;
        this.f1139d = z;
    }

    /* JADX INFO: renamed from: a */
    public static C0534P m1260a(C0589w0 c0589w0) {
        AbstractC0076b.m131f(!c0589w0.m1352e(), "error status shouldn't be OK");
        return new C0534P(null, null, c0589w0, false);
    }

    /* JADX INFO: renamed from: b */
    public static C0534P m1261b(AbstractC0522D abstractC0522D, C0896r c0896r) {
        AbstractC0076b.m133h(abstractC0522D, "subchannel");
        return new C0534P(abstractC0522D, c0896r, C0589w0.f1275e, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0534P)) {
            return false;
        }
        C0534P c0534p = (C0534P) obj;
        return AbstractC0076b.m140o(this.f1136a, c0534p.f1136a) && AbstractC0076b.m140o(this.f1138c, c0534p.f1138c) && AbstractC0076b.m140o(this.f1137b, c0534p.f1137b) && this.f1139d == c0534p.f1139d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1136a, this.f1138c, this.f1137b, Boolean.valueOf(this.f1139d)});
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1136a, "subchannel");
        c0087mM143s.m158b(this.f1137b, "streamTracerFactory");
        c0087mM143s.m158b(this.f1138c, NotificationCompat.CATEGORY_STATUS);
        c0087mM143s.m159c("drop", this.f1139d);
        return c0087mM143s.toString();
    }
}
