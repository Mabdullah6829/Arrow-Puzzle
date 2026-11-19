package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbd {

    /* JADX INFO: renamed from: a */
    public Object f7632a;

    /* JADX INFO: renamed from: b */
    public Object f7633b;

    /* JADX INFO: renamed from: c */
    public int f7634c;

    /* JADX INFO: renamed from: d */
    public long f7635d;

    /* JADX INFO: renamed from: e */
    public boolean f7636e;

    /* JADX INFO: renamed from: f */
    public zzc f7637f = zzc.f9573b;

    static {
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* JADX INFO: renamed from: a */
    public final void m4753a(Object obj, Object obj2, int i2, long j2, boolean z) {
        zzc zzcVar = zzc.f9573b;
        this.f7632a = obj;
        this.f7633b = obj2;
        this.f7634c = i2;
        this.f7635d = j2;
        this.f7637f = zzcVar;
        this.f7636e = z;
    }

    /* JADX INFO: renamed from: b */
    public final long m4754b(int i2, int i3) {
        zza zzaVarM5285a = this.f7637f.m5285a(i2);
        if (zzaVarM5285a.f4739a != -1) {
            return zzaVarM5285a.f4743e[i3];
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: c */
    public final void m4755c(int i2) {
        this.f7637f.m5285a(i2).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zzbd.class.equals(obj.getClass())) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        return Objects.equals(this.f7632a, zzbdVar.f7632a) && Objects.equals(this.f7633b, zzbdVar.f7633b) && this.f7634c == zzbdVar.f7634c && this.f7635d == zzbdVar.f7635d && this.f7636e == zzbdVar.f7636e && Objects.equals(this.f7637f, zzbdVar.f7637f);
    }

    public final int hashCode() {
        Object obj = this.f7632a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f7633b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f7634c;
        long j2 = this.f7635d;
        return (this.f7637f.hashCode() + (((((iHashCode2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 961) + (this.f7636e ? 1 : 0)) * 31)) * 31;
    }
}
