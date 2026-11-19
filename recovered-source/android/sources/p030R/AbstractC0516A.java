package p030R;

import p001B.AbstractC0076b;
import p001B.C0087m;

/* JADX INFO: renamed from: R.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0516A extends AbstractC0542Y {
    @Override // p030R.AbstractC0542Y
    /* JADX INFO: renamed from: a */
    public AbstractC0541X mo1232a() {
        return mo1233c().mo1232a();
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC0542Y mo1233c();

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(mo1233c(), "delegate");
        return c0087mM143s.toString();
    }
}
