package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
public final class zzfxz {
    /* JADX INFO: renamed from: a */
    public static zzfze m6776a(Context context, zzbdz zzbdzVar, String str, String str2, zzfxq zzfxqVar) {
        zzfze zzfzeVar;
        zzfxy zzfxyVar = new zzfxy(context, zzbdzVar, str, str2, zzfxqVar);
        try {
            zzfzeVar = (zzfze) zzfxyVar.f16789w.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzfxyVar.m6775b(AdError.INTERSTITIAL_AD_TIMEOUT, zzfxyVar.f16792z, e);
            zzfzeVar = null;
        }
        zzfxyVar.m6775b(3004, zzfxyVar.f16792z, null);
        if (zzfzeVar != null) {
            if (zzfzeVar.f16843u == 7) {
                zzfxq.f16764e = 3;
            } else {
                zzfxq.f16764e = 2;
            }
        }
        return zzfzeVar == null ? new zzfze() : zzfzeVar;
    }
}
