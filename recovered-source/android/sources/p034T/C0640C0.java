package p034T;

import java.text.MessageFormat;
import java.util.logging.Level;
import p030R.AbstractC0558h;
import p030R.C0529K;

/* JADX INFO: renamed from: T.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0640C0 extends AbstractC0558h {

    /* JADX INFO: renamed from: d */
    public C0529K f1405d;

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: f */
    public final void mo1299f(int i2, String str) {
        C0529K c0529k = this.f1405d;
        Level levelM1655m = C0778r.m1655m(i2);
        if (C0786t.f2039c.isLoggable(levelM1655m)) {
            C0786t.m1662a(c0529k, levelM1655m, str);
        }
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: g */
    public final void mo1300g(String str, Object[] objArr, int i2) {
        C0529K c0529k = this.f1405d;
        Level levelM1655m = C0778r.m1655m(i2);
        if (C0786t.f2039c.isLoggable(levelM1655m)) {
            C0786t.m1662a(c0529k, levelM1655m, MessageFormat.format(str, objArr));
        }
    }
}
