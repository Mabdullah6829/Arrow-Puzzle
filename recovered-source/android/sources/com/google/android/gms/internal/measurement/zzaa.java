package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.HashMap;
import java.util.Map;
import p003C.AbstractC0120k;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaa {

    /* JADX INFO: renamed from: d */
    public static final AbstractC0120k f21849d = AbstractC0120k.m204n(3, "_syn", "_err", "_el");

    /* JADX INFO: renamed from: a */
    public String f21850a;

    /* JADX INFO: renamed from: b */
    public final long f21851b;

    /* JADX INFO: renamed from: c */
    public final HashMap f21852c;

    public zzaa(String str, long j2, Map map) {
        this.f21850a = str;
        this.f21851b = j2;
        HashMap map2 = new HashMap();
        this.f21852c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m9300b(Object obj, String str, Object obj2) {
        if (f21849d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzaa clone() {
        return new zzaa(this.f21850a, this.f21851b, new HashMap(this.f21852c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        if (this.f21851b == zzaaVar.f21851b && this.f21850a.equals(zzaaVar.f21850a)) {
            return this.f21852c.equals(zzaaVar.f21852c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f21850a.hashCode() * 31;
        long j2 = this.f21851b;
        return this.f21852c.hashCode() + ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f21850a;
        String string = this.f21852c.toString();
        int length = String.valueOf(str).length();
        long j2 = this.f21851b;
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(length, 25, String.valueOf(j2).length(), 9, string.length()) + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j2);
        sb.append(", params=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
