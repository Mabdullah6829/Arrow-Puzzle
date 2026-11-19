package p044a0;

import java.util.List;
import java.util.Map;
import p001B.AbstractC0076b;
import p030R.AbstractC0538U;
import p030R.AbstractC0539V;
import p030R.AbstractC0558h;
import p030R.C0540W;
import p030R.C0571n0;
import p030R.C0589w0;
import p034T.AbstractC0655H0;
import p034T.AbstractC0761m2;
import p034T.C0757l2;

/* JADX INFO: renamed from: a0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0899u extends AbstractC0539V {
    /* JADX INFO: renamed from: d */
    public static C0571n0 m1820d(Map map) {
        C0892n c0892n;
        C0892n c0892n2;
        Integer num;
        Integer num2;
        Integer num3 = 5;
        Integer num4 = 100;
        Long lM1513i = AbstractC0655H0.m1513i("interval", map);
        Long lM1513i2 = AbstractC0655H0.m1513i("baseEjectionTime", map);
        Long lM1513i3 = AbstractC0655H0.m1513i("maxEjectionTime", map);
        Integer numM1510f = AbstractC0655H0.m1510f("maxEjectionPercentage", map);
        Long l2 = lM1513i != null ? lM1513i : 10000000000L;
        Long l3 = lM1513i2 != null ? lM1513i2 : 30000000000L;
        Long l4 = lM1513i3 != null ? lM1513i3 : 300000000000L;
        Integer num5 = numM1510f != null ? numM1510f : 10;
        Map mapM1511g = AbstractC0655H0.m1511g("successRateEjection", map);
        List list = null;
        if (mapM1511g != null) {
            Integer numM1510f2 = AbstractC0655H0.m1510f("stdevFactor", mapM1511g);
            Integer numM1510f3 = AbstractC0655H0.m1510f("enforcementPercentage", mapM1511g);
            Integer numM1510f4 = AbstractC0655H0.m1510f("minimumHosts", mapM1511g);
            Integer numM1510f5 = AbstractC0655H0.m1510f("requestVolume", mapM1511g);
            Integer num6 = numM1510f2 != null ? numM1510f2 : 1900;
            if (numM1510f3 != null) {
                AbstractC0076b.m130e(numM1510f3.intValue() >= 0 && numM1510f3.intValue() <= 100);
                num = numM1510f3;
            } else {
                num = num4;
            }
            if (numM1510f4 != null) {
                AbstractC0076b.m130e(numM1510f4.intValue() >= 0);
                num2 = numM1510f4;
            } else {
                num2 = num3;
            }
            if (numM1510f5 != null) {
                AbstractC0076b.m130e(numM1510f5.intValue() >= 0);
            } else {
                numM1510f5 = num4;
            }
            c0892n = new C0892n(num6, num, num2, numM1510f5);
        } else {
            c0892n = null;
        }
        Map mapM1511g2 = AbstractC0655H0.m1511g("failurePercentageEjection", map);
        if (mapM1511g2 != null) {
            Integer num7 = 85;
            Integer num8 = 50;
            Integer numM1510f6 = AbstractC0655H0.m1510f("threshold", mapM1511g2);
            Integer numM1510f7 = AbstractC0655H0.m1510f("enforcementPercentage", mapM1511g2);
            Integer numM1510f8 = AbstractC0655H0.m1510f("minimumHosts", mapM1511g2);
            Integer numM1510f9 = AbstractC0655H0.m1510f("requestVolume", mapM1511g2);
            if (numM1510f6 != null) {
                AbstractC0076b.m130e(numM1510f6.intValue() >= 0 && numM1510f6.intValue() <= 100);
                num7 = numM1510f6;
            }
            if (numM1510f7 != null) {
                AbstractC0076b.m130e(numM1510f7.intValue() >= 0 && numM1510f7.intValue() <= 100);
                num4 = numM1510f7;
            }
            if (numM1510f8 != null) {
                AbstractC0076b.m130e(numM1510f8.intValue() >= 0);
                num3 = numM1510f8;
            }
            if (numM1510f9 != null) {
                AbstractC0076b.m130e(numM1510f9.intValue() >= 0);
                num8 = numM1510f9;
            }
            c0892n2 = new C0892n(num7, num4, num3, num8);
        } else {
            c0892n2 = null;
        }
        List listM1507c = AbstractC0655H0.m1507c("childPolicy", map);
        if (listM1507c != null) {
            AbstractC0655H0.m1505a(listM1507c);
            list = listM1507c;
        }
        List listM1636u = AbstractC0761m2.m1636u(list);
        if (listM1636u == null || listM1636u.isEmpty()) {
            return new C0571n0(C0589w0.f1283m.m1354g("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        C0571n0 c0571n0M1635t = AbstractC0761m2.m1635t(listM1636u, C0540W.m1273a());
        if (c0571n0M1635t.f1217a != null) {
            return c0571n0M1635t;
        }
        C0757l2 c0757l2 = (C0757l2) c0571n0M1635t.f1218b;
        AbstractC0076b.m138m(c0757l2 != null);
        AbstractC0076b.m138m(c0757l2 != null);
        return new C0571n0(new C0893o(l2, l3, l4, num5, c0892n, c0892n2, c0757l2));
    }

    @Override // p030R.AbstractC0539V
    /* JADX INFO: renamed from: a */
    public final String mo1270a() {
        return "outlier_detection_experimental";
    }

    @Override // p030R.AbstractC0539V
    /* JADX INFO: renamed from: b */
    public final AbstractC0538U mo1271b(AbstractC0558h abstractC0558h) {
        return new C0898t(abstractC0558h);
    }

    @Override // p030R.AbstractC0539V
    /* JADX INFO: renamed from: c */
    public final C0571n0 mo1272c(Map map) {
        try {
            return m1820d(map);
        } catch (RuntimeException e) {
            return new C0571n0(C0589w0.f1284n.m1353f(e).m1354g("Failed parsing configuration for outlier_detection_experimental"));
        }
    }
}
