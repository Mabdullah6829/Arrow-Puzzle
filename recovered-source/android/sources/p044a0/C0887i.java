package p044a0;

import p030R.AbstractC0536S;
import p030R.AbstractC0539V;
import p030R.EnumC0578r;
import p034T.C0638B1;
import p034T.C0679P0;

/* JADX INFO: renamed from: a0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0887i {

    /* JADX INFO: renamed from: a */
    public final C0888j f2481a;

    /* JADX INFO: renamed from: b */
    public final C0883e f2482b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0539V f2483c;

    /* JADX INFO: renamed from: d */
    public EnumC0578r f2484d;

    /* JADX INFO: renamed from: e */
    public AbstractC0536S f2485e;

    /* JADX INFO: renamed from: f */
    public boolean f2486f = false;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0902x f2487g;

    public C0887i(C0902x c0902x, C0888j c0888j, C0638B1 c0638b1, C0679P0 c0679p0) {
        this.f2487g = c0902x;
        this.f2481a = c0888j;
        this.f2483c = c0638b1;
        this.f2485e = c0679p0;
        C0883e c0883e = new C0883e(new C0886h(this, 1));
        this.f2482b = c0883e;
        this.f2484d = EnumC0578r.f1232s;
        c0883e.m1810i(c0638b1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address = ");
        sb.append(this.f2481a);
        sb.append(", state = ");
        sb.append(this.f2484d);
        sb.append(", picker type: ");
        sb.append(this.f2485e.getClass());
        sb.append(", lb: ");
        sb.append(this.f2482b.m1808g().getClass());
        sb.append(this.f2486f ? ", deactivated" : "");
        return sb.toString();
    }
}
