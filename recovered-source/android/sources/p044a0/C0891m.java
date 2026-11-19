package p044a0;

import p001B.AbstractC0076b;
import p030R.AbstractC0558h;

/* JADX INFO: renamed from: a0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0891m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2497a;

    /* JADX INFO: renamed from: b */
    public final C0893o f2498b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0558h f2499c;

    public C0891m(C0893o c0893o, AbstractC0558h abstractC0558h, int i2) {
        this.f2497a = i2;
        switch (i2) {
            case 1:
                AbstractC0076b.m131f(c0893o.f2508e != null, "success rate ejection config is null");
                this.f2498b = c0893o;
                this.f2499c = abstractC0558h;
                break;
            default:
                this.f2498b = c0893o;
                this.f2499c = abstractC0558h;
                break;
        }
    }
}
