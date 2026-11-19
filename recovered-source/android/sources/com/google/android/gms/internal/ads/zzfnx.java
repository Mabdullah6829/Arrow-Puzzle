package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfnx {

    /* JADX INFO: renamed from: a */
    public final zzfnp f16190a;

    /* JADX INFO: renamed from: b */
    public final ListenableFuture f16191b;

    /* JADX INFO: renamed from: c */
    public boolean f16192c = false;

    /* JADX INFO: renamed from: d */
    public boolean f16193d = false;

    public zzfnx(final zzfmv zzfmvVar, final zzfno zzfnoVar, final zzfnp zzfnpVar) {
        this.f16190a = zzfnpVar;
        zzfhk zzfhkVar = (zzfhk) zzfnpVar;
        this.f16191b = zzhcf.m7372f(zzhcf.m7374h((zzhbx) ((zzfhh) zzfnoVar).f15696a.m6448b(zzfhkVar.f15704b, zzfhkVar.f15703a, null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfnw
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) {
                zzfnx zzfnxVar = this.f16186a;
                zzfno zzfnoVar2 = zzfnoVar;
                zzfmv zzfmvVar2 = zzfmvVar;
                zzfnp zzfnpVar2 = zzfnpVar;
                zzfne zzfneVar = (zzfne) obj;
                synchronized (zzfnxVar) {
                    try {
                        zzfnxVar.f16193d = true;
                        zzfneVar.f16155a = ((zzfhh) zzfnoVar2).f15696a.f15694a;
                        if (zzfnxVar.f16192c) {
                            return zzhcf.m7367a(new zzfnn(zzfneVar, zzfnpVar2));
                        }
                        ((zzfmw) zzfmvVar2).m6540a(zzfnpVar2.zzb(), zzfneVar);
                        return zzhcj.f18518t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, zzfnpVar.zza()), Exception.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfnu
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                zzfnx zzfnxVar = this.f16183a;
                Exception exc = (Exception) obj;
                synchronized (zzfnxVar) {
                    zzfnxVar.f16193d = true;
                    throw exc;
                }
            }
        }, zzfnpVar.zza());
    }

    /* JADX INFO: renamed from: a */
    public final synchronized ListenableFuture m6547a(zzfnp zzfnpVar) {
        if (!this.f16193d && !this.f16192c) {
            zzfnp zzfnpVar2 = this.f16190a;
            if (zzfnpVar2.zzb() != null && ((zzfhk) zzfnpVar).f15709g != null && zzfnpVar2.zzb().equals(((zzfhk) zzfnpVar).f15709g)) {
                this.f16192c = true;
                return this.f16191b;
            }
        }
        return null;
    }
}
