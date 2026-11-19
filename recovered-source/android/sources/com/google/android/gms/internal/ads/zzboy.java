package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzboy implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzgrg zzgrgVar;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = com.google.android.gms.ads.internal.zzt.f3698C.f3719s;
        if (!zzzVar.f3394e || (zzgrgVar = zzzVar.f3393d) == null) {
            com.google.android.gms.ads.internal.util.zze.m3150k("LastMileDelivery not connected");
            return;
        }
        zzgqw zzgqwVar = new zzgqw();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8369Vc)).booleanValue() || TextUtils.isEmpty(zzzVar.f3391b)) {
            String str = zzzVar.f3390a;
            if (str != null) {
                zzgqwVar.f18074a = str;
            } else {
                zzzVar.m3028c("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzgqwVar.f18075b = zzzVar.f3391b;
        }
        final zzgqx zzgqxVar = new zzgqx(zzgqwVar.f18074a, zzgqwVar.f18075b);
        final zzgsd zzgsdVar = zzzVar.f3395f;
        final zzgry zzgryVar = ((zzgri) zzgrgVar).f18108a;
        zzgsp zzgspVar = zzgryVar.f18133a;
        if (zzgspVar == null) {
            zzgry.f18131c.m7112c("error: %s", "Play Store not found.");
        } else if (zzgry.m7105c(zzgsdVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzgqxVar.mo7071a(), zzgqxVar.mo7072b()))) {
            zzgspVar.m7108a(new zzgsl(zzgspVar, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgrk
                @Override // java.lang.Runnable
                public final void run() {
                    zzgrf zzgrfVar = zzgqxVar;
                    zzgsd zzgsdVar2 = zzgsdVar;
                    zzgry zzgryVar2 = zzgryVar;
                    String str2 = zzgryVar2.f18134b;
                    try {
                        zzgsp zzgspVar2 = zzgryVar2.f18133a;
                        if (zzgspVar2 == null) {
                            throw null;
                        }
                        zzgqt zzgqtVar = zzgspVar2.f18155j;
                        if (zzgqtVar == null) {
                            return;
                        }
                        final Bundle bundle = new Bundle();
                        bundle.putString("callerPackage", str2);
                        zzgry.m7104b(zzgrfVar.mo7071a(), new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgrs
                            @Override // com.google.android.gms.internal.ads.zzgrx
                            public final /* synthetic */ void zza(String str3) {
                                zzgsq zzgsqVar = zzgry.f18131c;
                                bundle.putString("sessionToken", str3);
                            }
                        });
                        zzgry.m7104b(zzgrfVar.mo7072b(), new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgrt
                            @Override // com.google.android.gms.internal.ads.zzgrx
                            public final /* synthetic */ void zza(String str3) {
                                zzgsq zzgsqVar = zzgry.f18131c;
                                bundle.putString("appId", str3);
                            }
                        });
                        zzgqtVar.mo7070d4(bundle, new zzgrw(zzgryVar2, zzgsdVar2));
                    } catch (RemoteException e) {
                        zzgry.f18131c.m7113d(e, "dismiss overlay display from: %s", str2);
                    }
                }
            }));
        }
    }
}
