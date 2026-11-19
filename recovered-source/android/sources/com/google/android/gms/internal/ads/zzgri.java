package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzgri implements zzgrg {

    /* JADX INFO: renamed from: a */
    public final zzgry f18108a;

    public zzgri(zzgry zzgryVar) {
        this.f18108a = zzgryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrg
    /* JADX INFO: renamed from: a */
    public final void mo7102a(final zzgsa zzgsaVar, final zzgsd zzgsdVar) {
        final zzgry zzgryVar = this.f18108a;
        zzgsp zzgspVar = zzgryVar.f18133a;
        if (zzgspVar == null) {
            zzgry.f18131c.m7112c("error: %s", "Play Store not found.");
        } else if (zzgry.m7105c(zzgsdVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzgsaVar.mo7075b()))) {
            zzgspVar.m7108a(new zzgsl(zzgspVar, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgrv
                @Override // java.lang.Runnable
                public final void run() {
                    zzgsa zzgsaVar2 = zzgsaVar;
                    zzgsd zzgsdVar2 = zzgsdVar;
                    zzgry zzgryVar2 = zzgryVar;
                    String str = zzgryVar2.f18134b;
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
                        bundle.putString("callerPackage", str);
                        bundle.putBinder("windowToken", zzgsaVar2.mo7074a());
                        zzgry.m7104b(zzgsaVar2.mo7079f(), new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgrn
                            @Override // com.google.android.gms.internal.ads.zzgrx
                            public final /* synthetic */ void zza(String str2) {
                                zzgsq zzgsqVar = zzgry.f18131c;
                                bundle.putString("adFieldEnifd", str2);
                            }
                        });
                        bundle.putInt("layoutGravity", zzgsaVar2.mo7076c());
                        bundle.putFloat("layoutVerticalMargin", zzgsaVar2.mo7077d());
                        bundle.putInt("displayMode", 0);
                        bundle.putInt("triggerMode", 0);
                        bundle.putInt("windowWidthPx", zzgsaVar2.mo7078e());
                        zzgry.m7104b(null, new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgro
                            @Override // com.google.android.gms.internal.ads.zzgrx
                            public final /* synthetic */ void zza(String str2) {
                                zzgsq zzgsqVar = zzgry.f18131c;
                                bundle.putString("deeplinkUrl", str2);
                            }
                        });
                        zzgry.m7104b(null, new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgrp
                            @Override // com.google.android.gms.internal.ads.zzgrx
                            public final /* synthetic */ void zza(String str2) {
                                zzgsq zzgsqVar = zzgry.f18131c;
                                bundle.putString("sessionToken", str2);
                            }
                        });
                        zzgry.m7104b(zzgsaVar2.mo7075b(), new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgrq
                            @Override // com.google.android.gms.internal.ads.zzgrx
                            public final /* synthetic */ void zza(String str2) {
                                zzgsq zzgsqVar = zzgry.f18131c;
                                bundle.putString("appId", str2);
                            }
                        });
                        zzgry.m7104b(null, new zzgrx() { // from class: com.google.android.gms.internal.ads.zzgrr
                            @Override // com.google.android.gms.internal.ads.zzgrx
                            public final /* synthetic */ void zza(String str2) {
                                zzgsq zzgsqVar = zzgry.f18131c;
                                bundle.putString("thirdPartyAuthCallerId", str2);
                            }
                        });
                        bundle.putBoolean("stableSessionToken", true);
                        zzgqtVar.mo7069K0(str, bundle, new zzgrw(zzgryVar2, zzgsdVar2));
                    } catch (RemoteException e) {
                        zzgry.f18131c.m7113d(e, "show overlay display from: %s", str);
                    }
                }
            }));
        }
    }
}
