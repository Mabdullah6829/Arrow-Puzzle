package p034T;

import java.util.Map;
import p001B.AbstractC0089o;
import p030R.AbstractC0538U;
import p030R.AbstractC0539V;
import p030R.AbstractC0558h;
import p030R.C0571n0;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0638B1 extends AbstractC0539V {

    /* JADX INFO: renamed from: a */
    public static final boolean f1404a;

    static {
        f1404a = !AbstractC0089o.m161a(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // p030R.AbstractC0539V
    /* JADX INFO: renamed from: a */
    public final String mo1270a() {
        return "pick_first";
    }

    @Override // p030R.AbstractC0539V
    /* JADX INFO: renamed from: b */
    public final AbstractC0538U mo1271b(AbstractC0558h abstractC0558h) {
        return f1404a ? new C0799w1(abstractC0558h) : new C0635A1(abstractC0558h);
    }

    @Override // p030R.AbstractC0539V
    /* JADX INFO: renamed from: c */
    public final C0571n0 mo1272c(Map map) {
        try {
            return new C0571n0(new C0805y1(AbstractC0655H0.m1506b("shuffleAddressList", map)));
        } catch (RuntimeException e) {
            return new C0571n0(C0589w0.f1284n.m1353f(e).m1354g("Failed parsing configuration for pick_first"));
        }
    }
}
