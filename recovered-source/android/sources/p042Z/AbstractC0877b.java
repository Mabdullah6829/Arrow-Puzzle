package p042Z;

import java.util.logging.Logger;
import p001B.AbstractC0089o;
import p001B.C0084j;

/* JADX INFO: renamed from: Z.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0877b {

    /* JADX INFO: renamed from: a */
    public static final C0084j f2459a;

    static {
        Logger.getLogger(AbstractC0877b.class.getName());
        if (!AbstractC0089o.m161a(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        f2459a = new C0084j("internal-stub-type", 2);
    }
}
