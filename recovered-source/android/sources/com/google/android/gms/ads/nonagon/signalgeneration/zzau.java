package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzimz;

/* JADX INFO: loaded from: classes.dex */
public final class zzau implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzat f3891a;

    public zzau(zzat zzatVar) {
        this.f3891a = zzatVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        byte b;
        switch (this.f3891a.f3890a) {
            case "NATIVE":
                b = 2;
                break;
            case "INTERSTITIAL":
                b = 1;
                break;
            case "REWARDED":
                b = 3;
                break;
            case "BANNER":
                b = 0;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return zzbic.zza.EnumC6586zza.BANNER;
        }
        if (b == 1) {
            return zzbic.zza.EnumC6586zza.INTERSTITIAL;
        }
        if (b != 2) {
            return b != 3 ? zzbic.zza.EnumC6586zza.AD_INITIATER_UNSPECIFIED : zzbic.zza.EnumC6586zza.REWARD_BASED_VIDEO_AD;
        }
        return zzbic.zza.EnumC6586zza.AD_LOADER;
    }
}
