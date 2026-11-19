package p030R;

import p001B.AbstractC0076b;
import p001B.C0087m;

/* JADX INFO: renamed from: R.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0568m {

    /* JADX INFO: renamed from: a */
    public final C0556g f1206a;

    /* JADX INFO: renamed from: b */
    public final int f1207b;

    /* JADX INFO: renamed from: c */
    public final boolean f1208c;

    public C0568m(C0556g c0556g, int i2, boolean z) {
        AbstractC0076b.m133h(c0556g, "callOptions");
        this.f1206a = c0556g;
        this.f1207b = i2;
        this.f1208c = z;
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1206a, "callOptions");
        c0087mM143s.m160d("previousAttempts", String.valueOf(this.f1207b));
        c0087mM143s.m159c("isTransparentRetry", this.f1208c);
        return c0087mM143s.toString();
    }
}
