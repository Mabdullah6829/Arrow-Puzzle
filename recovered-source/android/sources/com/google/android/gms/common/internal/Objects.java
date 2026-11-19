package com.google.android.gms.common.internal;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Objects {

    public static final class ToStringHelper {

        /* JADX INFO: renamed from: a */
        public final ArrayList f4455a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Object f4456b;

        public /* synthetic */ ToStringHelper(Object obj) {
            this.f4456b = obj;
        }

        /* JADX INFO: renamed from: a */
        public final void m3536a(Object obj, String str) {
            int length = str.length();
            String strValueOf = String.valueOf(obj);
            this.f4455a.add(AbstractC1456a.m2450q(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f4456b.getClass().getSimpleName());
            sb.append('{');
            ArrayList arrayList = this.f4455a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append((String) arrayList.get(i2));
                if (i2 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3535a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
