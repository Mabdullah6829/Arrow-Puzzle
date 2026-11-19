package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzina implements zzimz, zzimt {

    /* JADX INFO: renamed from: b */
    public static final zzina f20010b = new zzina(null);

    /* JADX INFO: renamed from: a */
    public final Object f20011a;

    public zzina(Object obj) {
        this.f20011a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static zzina m8549a(Object obj) {
        if (obj != null) {
            return new zzina(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    /* JADX INFO: renamed from: b */
    public static zzina m8550b(Object obj) {
        return obj == null ? f20010b : new zzina(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return this.f20011a;
    }
}
