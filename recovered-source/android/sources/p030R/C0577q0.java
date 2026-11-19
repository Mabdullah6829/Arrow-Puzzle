package p030R;

import androidx.core.os.EnvironmentCompat;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Logger;
import p003C.AbstractC0119j;
import p003C.C0118i;
import p003C.C0134y;

/* JADX INFO: renamed from: R.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0577q0 {

    /* JADX INFO: renamed from: d */
    public static final Logger f1227d = Logger.getLogger(C0577q0.class.getName());

    /* JADX INFO: renamed from: e */
    public static C0577q0 f1228e;

    /* JADX INFO: renamed from: a */
    public String f1229a = EnvironmentCompat.MEDIA_UNKNOWN;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f1230b = new LinkedHashSet();

    /* JADX INFO: renamed from: c */
    public AbstractC0119j f1231c = C0134y.f204y;

    /* JADX INFO: renamed from: a */
    public final synchronized void m1339a() {
        try {
            HashMap map = new HashMap();
            String str = EnvironmentCompat.MEDIA_UNKNOWN;
            byte b = -2147483648;
            for (AbstractC0575p0 abstractC0575p0 : this.f1230b) {
                abstractC0575p0.getClass();
                if (((AbstractC0575p0) map.get("dns")) == null) {
                    map.put("dns", abstractC0575p0);
                }
                if (b < 5) {
                    str = "dns";
                    b = 5;
                }
            }
            Set setEntrySet = map.entrySet();
            C0118i c0118i = new C0118i(setEntrySet != null ? setEntrySet.size() : 4);
            c0118i.m201e(setEntrySet);
            this.f1231c = c0118i.m198a(true);
            this.f1229a = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}
