package p034T;

import java.util.Arrays;
import p001B.AbstractC0076b;
import p030R.C0523E;
import p030R.C0546b;

/* JADX INFO: renamed from: T.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0642D {

    /* JADX INFO: renamed from: a */
    public String f1409a;

    /* JADX INFO: renamed from: b */
    public C0546b f1410b;

    /* JADX INFO: renamed from: c */
    public C0523E f1411c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0642D)) {
            return false;
        }
        C0642D c0642d = (C0642D) obj;
        return this.f1409a.equals(c0642d.f1409a) && this.f1410b.equals(c0642d.f1410b) && AbstractC0076b.m140o(null, null) && AbstractC0076b.m140o(this.f1411c, c0642d.f1411c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1409a, this.f1410b, null, this.f1411c});
    }
}
