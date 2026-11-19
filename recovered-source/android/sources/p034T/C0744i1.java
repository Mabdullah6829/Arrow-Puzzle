package p034T;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001B.AbstractC0076b;
import p001B.AbstractC0089o;
import p001B.C0087m;
import p030R.C0567l0;

/* JADX INFO: renamed from: T.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0744i1 {

    /* JADX INFO: renamed from: a */
    public final C0736g1 f1891a;

    /* JADX INFO: renamed from: b */
    public final Map f1892b;

    /* JADX INFO: renamed from: c */
    public final Map f1893c;

    /* JADX INFO: renamed from: d */
    public final C0713a2 f1894d;

    /* JADX INFO: renamed from: e */
    public final Object f1895e;

    /* JADX INFO: renamed from: f */
    public final Map f1896f;

    public C0744i1(C0736g1 c0736g1, HashMap map, HashMap map2, C0713a2 c0713a2, Object obj, Map map3) {
        this.f1891a = c0736g1;
        this.f1892b = Collections.unmodifiableMap(new HashMap(map));
        this.f1893c = Collections.unmodifiableMap(new HashMap(map2));
        this.f1894d = c0713a2;
        this.f1895e = obj;
        this.f1896f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* JADX INFO: renamed from: a */
    public static C0744i1 m1615a(Map map, boolean z, int i2, int i3, Object obj) {
        C0713a2 c0713a2;
        Map mapM1511g;
        C0713a2 c0713a3;
        if (z) {
            if (map == null || (mapM1511g = AbstractC0655H0.m1511g("retryThrottling", map)) == null) {
                c0713a3 = null;
            } else {
                float fFloatValue = AbstractC0655H0.m1509e("maxTokens", mapM1511g).floatValue();
                float fFloatValue2 = AbstractC0655H0.m1509e("tokenRatio", mapM1511g).floatValue();
                AbstractC0076b.m139n(fFloatValue > 0.0f, "maxToken should be greater than zero");
                AbstractC0076b.m139n(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
                c0713a3 = new C0713a2(fFloatValue, fFloatValue2);
            }
            c0713a2 = c0713a3;
        } else {
            c0713a2 = null;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapM1511g2 = map == null ? null : AbstractC0655H0.m1511g("healthCheckConfig", map);
        List<Map> listM1507c = AbstractC0655H0.m1507c("methodConfig", map);
        if (listM1507c == null) {
            listM1507c = null;
        } else {
            AbstractC0655H0.m1505a(listM1507c);
        }
        if (listM1507c == null) {
            return new C0744i1(null, map2, map3, c0713a2, obj, mapM1511g2);
        }
        C0736g1 c0736g1 = null;
        for (Map map4 : listM1507c) {
            C0736g1 c0736g2 = new C0736g1(map4, i2, i3, z);
            List<Map> listM1507c2 = AbstractC0655H0.m1507c(AppMeasurementSdk.ConditionalUserProperty.NAME, map4);
            if (listM1507c2 == null) {
                listM1507c2 = null;
            } else {
                AbstractC0655H0.m1505a(listM1507c2);
            }
            if (listM1507c2 != null && !listM1507c2.isEmpty()) {
                for (Map map5 : listM1507c2) {
                    String strM1512h = AbstractC0655H0.m1512h(NotificationCompat.CATEGORY_SERVICE, map5);
                    String strM1512h2 = AbstractC0655H0.m1512h(FirebaseAnalytics.Param.METHOD, map5);
                    if (AbstractC0089o.m161a(strM1512h)) {
                        AbstractC0076b.m129d("missing service name for method %s", AbstractC0089o.m161a(strM1512h2), strM1512h2);
                        AbstractC0076b.m129d("Duplicate default method config in service config %s", c0736g1 == null, map);
                        c0736g1 = c0736g2;
                    } else if (AbstractC0089o.m161a(strM1512h2)) {
                        AbstractC0076b.m129d("Duplicate service %s", !map3.containsKey(strM1512h), strM1512h);
                        map3.put(strM1512h, c0736g2);
                    } else {
                        String strM1317a = C0567l0.m1317a(strM1512h, strM1512h2);
                        AbstractC0076b.m129d("Duplicate method name %s", !map2.containsKey(strM1317a), strM1317a);
                        map2.put(strM1317a, c0736g2);
                    }
                }
            }
        }
        return new C0744i1(c0736g1, map2, map3, c0713a2, obj, mapM1511g2);
    }

    /* JADX INFO: renamed from: b */
    public final C0740h1 m1616b() {
        if (this.f1893c.isEmpty() && this.f1892b.isEmpty() && this.f1891a == null) {
            return null;
        }
        return new C0740h1(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0744i1.class == obj.getClass()) {
            C0744i1 c0744i1 = (C0744i1) obj;
            if (AbstractC0076b.m140o(this.f1891a, c0744i1.f1891a) && AbstractC0076b.m140o(this.f1892b, c0744i1.f1892b) && AbstractC0076b.m140o(this.f1893c, c0744i1.f1893c) && AbstractC0076b.m140o(this.f1894d, c0744i1.f1894d) && AbstractC0076b.m140o(this.f1895e, c0744i1.f1895e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1891a, this.f1892b, this.f1893c, this.f1894d, this.f1895e});
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1891a, "defaultMethodConfig");
        c0087mM143s.m158b(this.f1892b, "serviceMethodMap");
        c0087mM143s.m158b(this.f1893c, "serviceMap");
        c0087mM143s.m158b(this.f1894d, "retryThrottling");
        c0087mM143s.m158b(this.f1895e, "loadBalancingConfig");
        return c0087mM143s.toString();
    }
}
