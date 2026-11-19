package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzihd {
    /* JADX INFO: renamed from: a */
    public abstract void mo8443a(Object obj, int i2, long j2);

    /* JADX INFO: renamed from: b */
    public abstract void mo8444b(int i2, int i3, Object obj);

    /* JADX INFO: renamed from: c */
    public abstract void mo8445c(Object obj, int i2, long j2);

    /* JADX INFO: renamed from: d */
    public abstract void mo8446d(Object obj, int i2, zzidl zzidlVar);

    /* JADX INFO: renamed from: e */
    public abstract void mo8447e(int i2, Object obj, Object obj2);

    /* JADX INFO: renamed from: f */
    public abstract zzihe mo8448f();

    /* JADX INFO: renamed from: g */
    public abstract zzihe mo8449g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract zzihe mo8450h(Object obj);

    /* JADX INFO: renamed from: i */
    public abstract void mo8451i(Object obj, Object obj2);

    /* JADX INFO: renamed from: j */
    public abstract void mo8452j(Object obj);

    /* JADX INFO: renamed from: k */
    public final boolean m8453k(int i2, zzidq zzidqVar, Object obj) throws zzifh {
        int i3 = zzidqVar.f19740b;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        if (i5 == 0) {
            mo8443a(obj, i4, zzidqVar.m8208C());
            return true;
        }
        if (i5 == 1) {
            mo8445c(obj, i4, zzidqVar.m8210E());
            return true;
        }
        if (i5 == 2) {
            mo8446d(obj, i4, zzidqVar.m8217L());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                if (i2 != 0) {
                    return false;
                }
                throw new zzifh("Protocol message end-group tag did not match expected tag.");
            }
            if (i5 != 5) {
                throw new zzifg();
            }
            mo8444b(i4, zzidqVar.m8211F(), obj);
            return true;
        }
        zzihe zziheVarMo8448f = mo8448f();
        int i6 = i4 << 3;
        int i7 = i2 + 1;
        if (i7 >= 100) {
            throw new zzifh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzidqVar.m8248y() != Integer.MAX_VALUE && m8453k(i7, zzidqVar, zziheVarMo8448f)) {
        }
        if ((i6 | 4) != zzidqVar.f19740b) {
            throw new zzifh("Protocol message end-group tag did not match expected tag.");
        }
        mo8447e(i4, obj, mo8449g(zziheVarMo8448f));
        return true;
    }
}
