package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzinm implements zzini {

    /* JADX INFO: renamed from: c */
    public static final Object f20018c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile zzini f20019a;

    /* JADX INFO: renamed from: b */
    public volatile Object f20020b;

    /* JADX INFO: renamed from: a */
    public static zzini m8561a(zzini zziniVar) {
        if ((zziniVar instanceof zzinm) || (zziniVar instanceof zzimy)) {
            return zziniVar;
        }
        zzinm zzinmVar = new zzinm();
        zzinmVar.f20020b = f20018c;
        zzinmVar.f20019a = zziniVar;
        return zzinmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Object obj = this.f20020b;
        if (obj != f20018c) {
            return obj;
        }
        zzini zziniVar = this.f20019a;
        if (zziniVar == null) {
            return this.f20020b;
        }
        Object objZzb = zziniVar.zzb();
        this.f20020b = objZzb;
        this.f20019a = null;
        return objZzb;
    }
}
