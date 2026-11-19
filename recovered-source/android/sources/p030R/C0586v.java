package p030R;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: R.v */
/* JADX INFO: loaded from: classes.dex */
public class C0586v {

    /* JADX INFO: renamed from: a */
    public static final Logger f1245a = Logger.getLogger(C0586v.class.getName());

    /* JADX INFO: renamed from: b */
    public static final C0586v f1246b = new C0586v();

    /* JADX INFO: renamed from: b */
    public static C0586v m1342b() {
        ((C0519B0) AbstractC0582t.f1243a).getClass();
        C0586v c0586v = (C0586v) C0519B0.f1100b.get();
        C0586v c0586v2 = f1246b;
        if (c0586v == null) {
            c0586v = c0586v2;
        }
        return c0586v == null ? c0586v2 : c0586v;
    }

    /* JADX INFO: renamed from: a */
    public final C0586v m1343a() {
        ((C0519B0) AbstractC0582t.f1243a).getClass();
        ThreadLocal threadLocal = C0519B0.f1100b;
        C0586v c0586v = (C0586v) threadLocal.get();
        C0586v c0586v2 = f1246b;
        if (c0586v == null) {
            c0586v = c0586v2;
        }
        threadLocal.set(this);
        return c0586v == null ? c0586v2 : c0586v;
    }

    /* JADX INFO: renamed from: c */
    public final void m1344c(C0586v c0586v) {
        if (c0586v == null) {
            throw new NullPointerException("toAttach");
        }
        C0519B0 c0519b0 = (C0519B0) AbstractC0582t.f1243a;
        ThreadLocal threadLocal = C0519B0.f1100b;
        c0519b0.getClass();
        C0586v c0586v2 = (C0586v) threadLocal.get();
        C0586v c0586v3 = f1246b;
        if (c0586v2 == null) {
            c0586v2 = c0586v3;
        }
        if (c0586v2 != this) {
            C0519B0.f1099a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (c0586v != c0586v3) {
            threadLocal.set(c0586v);
        } else {
            threadLocal.set(null);
        }
    }
}
