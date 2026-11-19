package p030R;

import java.util.List;

/* JADX INFO: renamed from: R.U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0538U {

    /* JADX INFO: renamed from: b */
    public static final C0544a f1143b = new C0544a("internal:health-checking-config");

    /* JADX INFO: renamed from: c */
    public static final C0572o f1144c = new C0572o(5);

    /* JADX INFO: renamed from: d */
    public static final C0544a f1145d = new C0544a("internal:has-health-check-producer-listener");

    /* JADX INFO: renamed from: e */
    public static final C0544a f1146e = new C0544a("io.grpc.IS_PETIOLE_POLICY");

    /* JADX INFO: renamed from: a */
    public int f1147a;

    /* JADX INFO: renamed from: a */
    public C0589w0 mo1264a(C0535Q c0535q) {
        List list = c0535q.f1140a;
        if (!list.isEmpty() || mo1265b()) {
            int i2 = this.f1147a;
            this.f1147a = i2 + 1;
            if (i2 == 0) {
                mo1267d(c0535q);
            }
            this.f1147a = 0;
            return C0589w0.f1275e;
        }
        C0589w0 c0589w0M1354g = C0589w0.f1284n.m1354g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + c0535q.f1141b);
        mo1266c(c0589w0M1354g);
        return c0589w0M1354g;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo1265b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo1266c(C0589w0 c0589w0);

    /* JADX INFO: renamed from: d */
    public void mo1267d(C0535Q c0535q) {
        int i2 = this.f1147a;
        this.f1147a = i2 + 1;
        if (i2 == 0) {
            mo1264a(c0535q);
        }
        this.f1147a = 0;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1269f();

    /* JADX INFO: renamed from: e */
    public void mo1268e() {
    }
}
