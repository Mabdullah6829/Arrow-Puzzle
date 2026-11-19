package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;
import p001B.AbstractC0076b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmv implements Comparable {

    /* JADX INFO: renamed from: s */
    public final long f22655s;

    /* JADX INFO: renamed from: t */
    public final String f22656t;

    /* JADX INFO: renamed from: u */
    public final int f22657u;

    /* JADX INFO: renamed from: v */
    public final long f22658v;

    /* JADX INFO: renamed from: w */
    public final Object f22659w;

    /* JADX INFO: renamed from: x */
    public final RuntimeException f22660x;

    public zzmv(long j2, String str, int i2, long j3, Object obj) {
        AbstractC0076b.m130e(((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) == 0) == (str != null));
        this.f22655s = j2;
        this.f22656t = str;
        this.f22657u = i2;
        this.f22658v = j3;
        this.f22659w = obj;
        if (i2 != 5) {
            this.f22660x = null;
            return;
        }
        if (obj == null) {
            this.f22660x = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof zzacr)) {
            this.f22660x = null;
        } else {
            this.f22660x = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m10528b() {
        int i2 = this.f22657u;
        if (i2 == 0) {
            return Boolean.FALSE;
        }
        if (i2 == 1) {
            return Boolean.TRUE;
        }
        long j2 = this.f22658v;
        if (i2 == 2) {
            return Long.valueOf(j2);
        }
        if (i2 == 3) {
            return Double.valueOf(Double.longBitsToDouble(j2));
        }
        Object obj = this.f22659w;
        if (i2 == 4) {
            obj.getClass();
            return obj;
        }
        if (i2 != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((zzacr) obj).m9383q();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.f22660x;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zzmv zzmvVar = (zzmv) obj;
        long j2 = zzmvVar.f22655s;
        long j3 = this.f22655s;
        int iCompare = Long.compare(j3, j2);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j3 != 0) {
            return 0;
        }
        String str = this.f22656t;
        str.getClass();
        String str2 = zzmvVar.f22656t;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmv)) {
            return false;
        }
        zzmv zzmvVar = (zzmv) obj;
        return this.f22655s == zzmvVar.f22655s && Objects.equals(this.f22656t, zzmvVar.f22656t);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f22655s), this.f22656t);
    }

    public final String toString() {
        String string = this.f22656t;
        if (string == null) {
            string = Long.toString(this.f22655s);
        }
        String strValueOf = String.valueOf(m10528b());
        return AbstractC1456a.m2450q(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length()), string, ":", strValueOf);
    }
}
