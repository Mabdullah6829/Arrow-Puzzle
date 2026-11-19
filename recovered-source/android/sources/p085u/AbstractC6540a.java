package p085u;

import android.util.SparseArray;
import java.util.HashMap;
import p011H.AbstractC0271e0;
import p063h.EnumC6358d;

/* JADX INFO: renamed from: u.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6540a {

    /* JADX INFO: renamed from: a */
    public static final SparseArray f24765a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public static final HashMap f24766b;

    static {
        HashMap map = new HashMap();
        f24766b = map;
        map.put(EnumC6358d.f24415s, 0);
        map.put(EnumC6358d.f24416t, 1);
        map.put(EnumC6358d.f24417u, 2);
        for (EnumC6358d enumC6358d : map.keySet()) {
            f24765a.append(((Integer) f24766b.get(enumC6358d)).intValue(), enumC6358d);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m12211a(EnumC6358d enumC6358d) {
        Integer num = (Integer) f24766b.get(enumC6358d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC6358d);
    }

    /* JADX INFO: renamed from: b */
    public static EnumC6358d m12212b(int i2) {
        EnumC6358d enumC6358d = (EnumC6358d) f24765a.get(i2);
        if (enumC6358d != null) {
            return enumC6358d;
        }
        throw new IllegalArgumentException(AbstractC0271e0.m396d(i2, "Unknown Priority for value "));
    }
}
