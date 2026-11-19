package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegw implements zzegy {

    /* JADX INFO: renamed from: a */
    public final Map f13899a;

    /* JADX INFO: renamed from: b */
    public final zzhcp f13900b;

    /* JADX INFO: renamed from: c */
    public final zzdgd f13901c;

    public zzegw(Map map, zzhcp zzhcpVar, zzdgd zzdgdVar) {
        this.f13899a = map;
        this.f13900b = zzhcpVar;
        this.f13901c = zzdgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegy
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6194a(final zzcbk zzcbkVar) {
        this.f13901c.mo5867z(zzcbkVar);
        ListenableFuture listenableFutureM7368b = zzhcf.m7368b(new zzeel(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8751s9)).split(",")) {
            final zzino zzinoVar = (zzino) this.f13899a.get(str.trim());
            if (zzinoVar != null) {
                listenableFutureM7368b = zzhcf.m7372f(listenableFutureM7368b, zzeel.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzegv
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                        return ((zzegy) zzinoVar.zzb()).mo6194a(zzcbkVar);
                    }
                }, this.f13900b);
            }
        }
        listenableFutureM7368b.addListener(new zzhcd(listenableFutureM7368b, new zzegu(this)), zzcfy.f9953h);
        return listenableFutureM7368b;
    }
}
