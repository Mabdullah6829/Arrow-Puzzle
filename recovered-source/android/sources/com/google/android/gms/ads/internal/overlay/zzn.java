package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzdlg;
import com.google.android.gms.internal.ads.zzdzt;

/* JADX INFO: loaded from: classes.dex */
public final class zzn {
    /* JADX INFO: renamed from: a */
    public static final void m3014a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z, zzdzt zzdztVar) {
        if (adOverlayInfoParcel.f3289C == 4 && adOverlayInfoParcel.f3305u == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.f3304t;
            if (zzaVar != null) {
                zzaVar.mo2730k();
            }
            zzdlg zzdlgVar = adOverlayInfoParcel.f3299M;
            if (zzdlgVar != null) {
                zzdlgVar.mo5626C();
            }
            Activity activityZzj = adOverlayInfoParcel.f3306v.zzj();
            zzc zzcVar = adOverlayInfoParcel.f3303s;
            Context context2 = (zzcVar == null || !zzcVar.f3321B || activityZzj == null) ? context : activityZzj;
            zza zzaVar2 = com.google.android.gms.ads.internal.zzt.f3698C.f3701a;
            zza.m2986b(context2, zzcVar, adOverlayInfoParcel.f3287A, zzcVar != null ? zzcVar.f3320A : null, zzdztVar, adOverlayInfoParcel.f3295I);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f3291E.f3399v);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8051Ce)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            com.google.android.gms.ads.internal.util.zzs.m3223v(context, intent, zzdztVar, adOverlayInfoParcel.f3295I);
        } else {
            com.google.android.gms.ads.internal.util.zzs zzsVar2 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            com.google.android.gms.ads.internal.util.zzs.m3220s(context, intent);
        }
    }
}
