package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhg implements zzfie {

    /* JADX INFO: renamed from: a */
    public zzdch f15694a;

    /* JADX INFO: renamed from: b */
    public final Executor f15695b = zzhbu.f18506s;

    @Override // com.google.android.gms.internal.ads.zzfie
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ListenableFuture mo6447a(zzfif zzfifVar, zzfid zzfidVar) {
        return m6448b(zzfifVar, zzfidVar, null);
    }

    /* JADX INFO: renamed from: b */
    public final ListenableFuture m6448b(zzfif zzfifVar, zzfid zzfidVar, zzdch zzdchVar) {
        zzdcg zzdcgVarMo6431a = zzfidVar.mo6431a(zzfifVar.f15742b);
        zzdcgVarMo6431a.mo5722b(new zzfii());
        zzdch zzdchVar2 = (zzdch) zzdcgVarMo6431a.zzh();
        this.f15694a = zzdchVar2;
        final zzcze zzczeVarZza = zzdchVar2.zza();
        final zzfne zzfneVar = new zzfne();
        zzhbx zzhbxVarM7360q = zzhbx.m7360q(zzczeVarZza.m5876b());
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfhf
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) {
                zzfky zzfkyVar = (zzfky) obj;
                zzfneVar.f16156b = zzfkyVar;
                Iterator it = zzfkyVar.f16006b.f16001a.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Iterator it2 = ((zzfkn) it.next()).f15916a.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return zzhcj.f18518t;
                        }
                        z = true;
                    }
                }
                if (z) {
                    return zzczeVarZza.m5877c(zzhcf.m7367a(zzfkyVar));
                }
                return zzhcj.f18518t;
            }
        };
        zzhbu zzhbuVar = zzhbu.f18506s;
        return (zzhbx) zzhcf.m7375i((zzhbx) zzhcf.m7374h(zzhbxVarM7360q, zzhbnVar, zzhbuVar), new zzgti() { // from class: com.google.android.gms.internal.ads.zzfhe
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzfne zzfneVar2 = zzfneVar;
                zzfneVar2.f16157c = (zzcya) obj;
                return zzfneVar2;
            }
        }, zzhbuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object mo6449d() {
        return this.f15694a;
    }
}
