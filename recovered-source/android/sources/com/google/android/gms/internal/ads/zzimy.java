package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzimy implements zzini, zzimt {

    /* JADX INFO: renamed from: c */
    public static final Object f20001c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile zzini f20002a;

    /* JADX INFO: renamed from: b */
    public volatile Object f20003b = f20001c;

    public zzimy(zzini zziniVar) {
        this.f20002a = zziniVar;
    }

    /* JADX INFO: renamed from: a */
    public static zzimy m8547a(zzini zziniVar) {
        return zziniVar instanceof zzimy ? (zzimy) zziniVar : new zzimy(zziniVar);
    }

    /* JADX INFO: renamed from: b */
    public static zzimt m8548b(zzini zziniVar) {
        if (zziniVar instanceof zzimt) {
            return (zzimt) zziniVar;
        }
        zziniVar.getClass();
        return new zzimy(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Object obj = this.f20003b;
        Object obj2 = f20001c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f20003b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZzb = this.f20002a.zzb();
                Object obj4 = this.f20003b;
                if (obj4 != obj2 && obj4 != objZzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZzb + ". This is likely due to a circular dependency.");
                }
                this.f20003b = objZzb;
                this.f20002a = null;
                return objZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
