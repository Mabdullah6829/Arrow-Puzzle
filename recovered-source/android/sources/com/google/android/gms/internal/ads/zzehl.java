package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzehl {

    /* JADX INFO: renamed from: a */
    public final zzhcp f13919a;

    /* JADX INFO: renamed from: b */
    public final zzegq f13920b;

    /* JADX INFO: renamed from: c */
    public final zzimt f13921c;

    public zzehl(zzhcp zzhcpVar, zzegq zzegqVar, zzimt zzimtVar) {
        this.f13919a = zzhcpVar;
        this.f13920b = zzegqVar;
        this.f13921c = zzimtVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzhbx m6217a(final zzcbk zzcbkVar, zzehb zzehbVar, final zzehb zzehbVar2, final zzhbn zzhbnVar) {
        String str = zzcbkVar.f9685v;
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        boolean zM3206e = com.google.android.gms.ads.internal.util.zzs.m3206e(str);
        zzhcp zzhcpVar = this.f13919a;
        return (zzhbx) zzhcf.m7372f((zzhbx) zzhcf.m7374h((zzhbx) zzhcf.m7374h(zzhbx.m7360q(zM3206e ? zzhcf.m7368b(new zzegz(1)) : zzhcf.m7372f(zzehbVar.mo6216a(zzcbkVar), ExecutionException.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzehk
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return zzhcf.m7368b(cause);
            }
        }, zzhcpVar)), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzehd
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) {
                return zzhcf.m7367a(((zzeha) obj).f13905a);
            }
        }, zzhcpVar), zzhbnVar, zzhcpVar), zzegz.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzehe
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                return zzhcf.m7374h(zzehbVar2.mo6216a(zzcbkVar), zzhbnVar, this.f13909a.f13919a);
            }
        }, zzhcpVar);
    }
}
