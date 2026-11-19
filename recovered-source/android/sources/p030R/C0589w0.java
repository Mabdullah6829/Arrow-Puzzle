package p030R;

import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import p001B.AbstractC0072B;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: R.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0589w0 {

    /* JADX INFO: renamed from: d */
    public static final List f1274d;

    /* JADX INFO: renamed from: e */
    public static final C0589w0 f1275e;

    /* JADX INFO: renamed from: f */
    public static final C0589w0 f1276f;

    /* JADX INFO: renamed from: g */
    public static final C0589w0 f1277g;

    /* JADX INFO: renamed from: h */
    public static final C0589w0 f1278h;

    /* JADX INFO: renamed from: i */
    public static final C0589w0 f1279i;

    /* JADX INFO: renamed from: j */
    public static final C0589w0 f1280j;

    /* JADX INFO: renamed from: k */
    public static final C0589w0 f1281k;

    /* JADX INFO: renamed from: l */
    public static final C0589w0 f1282l;

    /* JADX INFO: renamed from: m */
    public static final C0589w0 f1283m;

    /* JADX INFO: renamed from: n */
    public static final C0589w0 f1284n;

    /* JADX INFO: renamed from: o */
    public static final C0555f0 f1285o;

    /* JADX INFO: renamed from: p */
    public static final C0555f0 f1286p;

    /* JADX INFO: renamed from: a */
    public final EnumC0587v0 f1287a;

    /* JADX INFO: renamed from: b */
    public final String f1288b;

    /* JADX INFO: renamed from: c */
    public final Throwable f1289c;

    static {
        TreeMap treeMap = new TreeMap();
        for (EnumC0587v0 enumC0587v0 : EnumC0587v0.values()) {
            C0589w0 c0589w0 = (C0589w0) treeMap.put(Integer.valueOf(enumC0587v0.f1265s), new C0589w0(enumC0587v0, null, null));
            if (c0589w0 != null) {
                throw new IllegalStateException("Code value duplication between " + c0589w0.f1287a.name() + " & " + enumC0587v0.name());
            }
        }
        f1274d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f1275e = EnumC0587v0.OK.m1345b();
        f1276f = EnumC0587v0.CANCELLED.m1345b();
        f1277g = EnumC0587v0.UNKNOWN.m1345b();
        EnumC0587v0.INVALID_ARGUMENT.m1345b();
        f1278h = EnumC0587v0.DEADLINE_EXCEEDED.m1345b();
        EnumC0587v0.NOT_FOUND.m1345b();
        EnumC0587v0.ALREADY_EXISTS.m1345b();
        f1279i = EnumC0587v0.PERMISSION_DENIED.m1345b();
        f1280j = EnumC0587v0.UNAUTHENTICATED.m1345b();
        f1281k = EnumC0587v0.RESOURCE_EXHAUSTED.m1345b();
        f1282l = EnumC0587v0.FAILED_PRECONDITION.m1345b();
        EnumC0587v0.ABORTED.m1345b();
        EnumC0587v0.OUT_OF_RANGE.m1345b();
        EnumC0587v0.UNIMPLEMENTED.m1345b();
        f1283m = EnumC0587v0.INTERNAL.m1345b();
        f1284n = EnumC0587v0.UNAVAILABLE.m1345b();
        EnumC0587v0.DATA_LOSS.m1345b();
        f1285o = new C0555f0("grpc-status", false, new C0572o(10));
        f1286p = new C0555f0("grpc-message", false, new C0572o(1));
    }

    public C0589w0(EnumC0587v0 enumC0587v0, String str, Throwable th) {
        AbstractC0076b.m133h(enumC0587v0, "code");
        this.f1287a = enumC0587v0;
        this.f1288b = str;
        this.f1289c = th;
    }

    /* JADX INFO: renamed from: b */
    public static String m1348b(C0589w0 c0589w0) {
        String str = c0589w0.f1288b;
        EnumC0587v0 enumC0587v0 = c0589w0.f1287a;
        if (str == null) {
            return enumC0587v0.toString();
        }
        return enumC0587v0 + ": " + c0589w0.f1288b;
    }

    /* JADX INFO: renamed from: c */
    public static C0589w0 m1349c(int i2) {
        if (i2 >= 0) {
            List list = f1274d;
            if (i2 < list.size()) {
                return (C0589w0) list.get(i2);
            }
        }
        return f1277g.m1354g("Unknown code " + i2);
    }

    /* JADX INFO: renamed from: d */
    public static C0589w0 m1350d(Throwable th) {
        AbstractC0076b.m133h(th, "t");
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof StatusException) {
                return ((StatusException) cause).f24446s;
            }
            if (cause instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) cause).f24448s;
            }
        }
        return f1277g.m1353f(th);
    }

    /* JADX INFO: renamed from: a */
    public final C0589w0 m1351a(String str) {
        if (str == null) {
            return this;
        }
        Throwable th = this.f1289c;
        EnumC0587v0 enumC0587v0 = this.f1287a;
        String str2 = this.f1288b;
        return str2 == null ? new C0589w0(enumC0587v0, str, th) : new C0589w0(enumC0587v0, AbstractC0271e0.m415w(str2, "\n", str), th);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1352e() {
        return EnumC0587v0.OK == this.f1287a;
    }

    /* JADX INFO: renamed from: f */
    public final C0589w0 m1353f(Throwable th) {
        return AbstractC0076b.m140o(this.f1289c, th) ? this : new C0589w0(this.f1287a, this.f1288b, th);
    }

    /* JADX INFO: renamed from: g */
    public final C0589w0 m1354g(String str) {
        return AbstractC0076b.m140o(this.f1288b, str) ? this : new C0589w0(this.f1287a, str, this.f1289c);
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1287a.name(), "code");
        c0087mM143s.m158b(this.f1288b, "description");
        Throwable th = this.f1289c;
        Object string = th;
        if (th != null) {
            Object obj = AbstractC0072B.f99a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        c0087mM143s.m158b(string, "cause");
        return c0087mM143s.toString();
    }
}
