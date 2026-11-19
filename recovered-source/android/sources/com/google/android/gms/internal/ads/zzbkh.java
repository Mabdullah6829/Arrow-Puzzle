package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class zzbkh {

    /* JADX INFO: renamed from: a */
    public final String f8973a;

    /* JADX INFO: renamed from: b */
    public final Object f8974b;

    /* JADX INFO: renamed from: c */
    public final int f8975c;

    public zzbkh(Object obj, String str, int i2) {
        this.f8973a = str;
        this.f8974b = obj;
        this.f8975c = i2;
    }

    /* JADX INFO: renamed from: a */
    public static zzbkh m5055a(String str, boolean z) {
        return new zzbkh(Boolean.valueOf(z), str, 1);
    }

    /* JADX INFO: renamed from: b */
    public static zzbkh m5056b(long j2, String str) {
        return new zzbkh(Long.valueOf(j2), str, 2);
    }

    /* JADX INFO: renamed from: c */
    public final Object m5057c() {
        zzbln zzblnVar = (zzbln) zzblp.f9136a.get();
        Object obj = this.f8974b;
        if (zzblnVar == null) {
            AtomicReference atomicReference = zzblp.f9137b;
            if (((zzblo) atomicReference.get()) != null) {
                ((zzblo) atomicReference.get()).zza();
            }
            return obj;
        }
        int i2 = this.f8975c - 1;
        String str = this.f8973a;
        if (i2 == 0) {
            return zzblnVar.mo5029d(str, ((Boolean) obj).booleanValue());
        }
        if (i2 != 1) {
            return i2 != 2 ? zzblnVar.mo5026a(str, (String) obj) : zzblnVar.mo5028c(str, ((Double) obj).doubleValue());
        }
        return zzblnVar.mo5027b(((Long) obj).longValue(), str);
    }
}
