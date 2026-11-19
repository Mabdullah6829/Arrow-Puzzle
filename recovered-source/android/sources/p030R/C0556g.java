package p030R;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p001B.AbstractC0076b;
import p001B.C0084j;
import p001B.C0087m;

/* JADX INFO: renamed from: R.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0556g {

    /* JADX INFO: renamed from: i */
    public static final C0556g f1174i;

    /* JADX INFO: renamed from: a */
    public final C0588w f1175a;

    /* JADX INFO: renamed from: b */
    public final Executor f1176b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0552e f1177c;

    /* JADX INFO: renamed from: d */
    public final Object[][] f1178d;

    /* JADX INFO: renamed from: e */
    public final List f1179e;

    /* JADX INFO: renamed from: f */
    public final Boolean f1180f;

    /* JADX INFO: renamed from: g */
    public final Integer f1181g;

    /* JADX INFO: renamed from: h */
    public final Integer f1182h;

    static {
        C0554f c0554f = new C0554f();
        c0554f.f1168d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        c0554f.f1169e = Collections.EMPTY_LIST;
        f1174i = new C0556g(c0554f);
    }

    public C0556g(C0554f c0554f) {
        this.f1175a = c0554f.f1165a;
        this.f1176b = c0554f.f1166b;
        this.f1177c = c0554f.f1167c;
        this.f1178d = c0554f.f1168d;
        this.f1179e = c0554f.f1169e;
        this.f1180f = c0554f.f1170f;
        this.f1181g = c0554f.f1171g;
        this.f1182h = c0554f.f1172h;
    }

    /* JADX INFO: renamed from: b */
    public static C0554f m1289b(C0556g c0556g) {
        C0554f c0554f = new C0554f();
        c0554f.f1165a = c0556g.f1175a;
        c0554f.f1166b = c0556g.f1176b;
        c0554f.f1167c = c0556g.f1177c;
        c0554f.f1168d = c0556g.f1178d;
        c0554f.f1169e = c0556g.f1179e;
        c0554f.f1170f = c0556g.f1180f;
        c0554f.f1171g = c0556g.f1181g;
        c0554f.f1172h = c0556g.f1182h;
        return c0554f;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1290a(C0084j c0084j) {
        AbstractC0076b.m133h(c0084j, "key");
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.f1178d;
            if (i2 >= objArr.length) {
                return null;
            }
            if (c0084j.equals(objArr[i2][0])) {
                return objArr[i2][1];
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0556g m1291c(C0084j c0084j, Object obj) {
        Object[][] objArr;
        AbstractC0076b.m133h(c0084j, "key");
        C0554f c0554fM1289b = m1289b(this);
        int i2 = 0;
        while (true) {
            objArr = this.f1178d;
            if (i2 >= objArr.length) {
                i2 = -1;
                break;
            }
            if (c0084j.equals(objArr[i2][0])) {
                break;
            }
            i2++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i2 == -1 ? 1 : 0), 2);
        c0554fM1289b.f1168d = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        if (i2 == -1) {
            c0554fM1289b.f1168d[objArr.length] = new Object[]{c0084j, obj};
        } else {
            c0554fM1289b.f1168d[i2] = new Object[]{c0084j, obj};
        }
        return new C0556g(c0554fM1289b);
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1175a, "deadline");
        c0087mM143s.m158b(null, "authority");
        c0087mM143s.m158b(this.f1177c, "callCredentials");
        Executor executor = this.f1176b;
        c0087mM143s.m158b(executor != null ? executor.getClass() : null, "executor");
        c0087mM143s.m158b(null, "compressorName");
        c0087mM143s.m158b(Arrays.deepToString(this.f1178d), "customOptions");
        c0087mM143s.m159c("waitForReady", Boolean.TRUE.equals(this.f1180f));
        c0087mM143s.m158b(this.f1181g, "maxInboundMessageSize");
        c0087mM143s.m158b(this.f1182h, "maxOutboundMessageSize");
        c0087mM143s.m158b(this.f1179e, "streamTracerFactories");
        return c0087mM143s.toString();
    }
}
