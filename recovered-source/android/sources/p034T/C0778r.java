package p034T;

import java.text.MessageFormat;
import java.util.logging.Level;
import p001B.AbstractC0076b;
import p030R.AbstractC0558h;
import p030R.C0525G;
import p030R.C0529K;
import p030R.EnumC0524F;
import p072l.AbstractC6468c;

/* JADX INFO: renamed from: T.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0778r extends AbstractC0558h {

    /* JADX INFO: renamed from: d */
    public final C0786t f2021d;

    /* JADX INFO: renamed from: e */
    public final C0785s2 f2022e;

    public C0778r(C0786t c0786t, C0785s2 c0785s2) {
        this.f2021d = c0786t;
        AbstractC0076b.m133h(c0785s2, "time");
        this.f2022e = c0785s2;
    }

    /* JADX INFO: renamed from: m */
    public static Level m1655m(int i2) {
        int iM12193b = AbstractC6468c.m12193b(i2);
        if (iM12193b != 1) {
            return (iM12193b == 2 || iM12193b == 3) ? Level.FINE : Level.FINEST;
        }
        return Level.FINER;
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: f */
    public final void mo1299f(int i2, String str) {
        EnumC0524F enumC0524F;
        C0786t c0786t = this.f2021d;
        C0529K c0529k = c0786t.f2041b;
        Level levelM1655m = m1655m(i2);
        if (C0786t.f2039c.isLoggable(levelM1655m)) {
            C0786t.m1662a(c0529k, levelM1655m, str);
        }
        if (!m1656l(i2) || i2 == 1) {
            return;
        }
        int iM12193b = AbstractC6468c.m12193b(i2);
        if (iM12193b != 2) {
            enumC0524F = iM12193b != 3 ? EnumC0524F.f1109s : EnumC0524F.f1111u;
        } else {
            enumC0524F = EnumC0524F.f1110t;
        }
        EnumC0524F enumC0524F2 = enumC0524F;
        long jM1661e = this.f2022e.m1661e();
        AbstractC0076b.m133h(str, "description");
        new C0525G(str, enumC0524F2, jM1661e, null);
        synchronized (c0786t.f2040a) {
        }
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: g */
    public final void mo1300g(String str, Object[] objArr, int i2) {
        mo1299f(i2, (m1656l(i2) || C0786t.f2039c.isLoggable(m1655m(i2))) ? MessageFormat.format(str, objArr) : null);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1656l(int i2) {
        if (i2 == 1) {
            return false;
        }
        synchronized (this.f2021d.f2040a) {
        }
        return false;
    }
}
