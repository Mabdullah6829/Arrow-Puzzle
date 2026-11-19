package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcelable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfnj {

    /* JADX INFO: renamed from: a */
    public final HashMap f16163a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final zzfni m6544a(zzfmz zzfmzVar, Context context, zzfmr zzfmrVar, zzfno zzfnoVar) {
        zzfnc zzfncVar;
        HashMap map = this.f16163a;
        zzfni zzfniVar = (zzfni) map.get(zzfmzVar);
        if (zzfniVar != null) {
            return zzfniVar;
        }
        if (zzfmzVar == zzfmz.f16137s) {
            zzbio zzbioVar = zzbix.f8630l7;
            zzbiv zzbivVar = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
            int iIntValue = ((Integer) zzbivVar.m5030a(zzbioVar)).intValue();
            int iIntValue2 = ((Integer) zzbivVar.m5030a(zzbix.f8732r7)).intValue();
            int iIntValue3 = ((Integer) zzbivVar.m5030a(zzbix.f8766t7)).intValue();
            String str = (String) zzbivVar.m5030a(zzbix.f8800v7);
            String str2 = (String) zzbivVar.m5030a(zzbix.f8664n7);
            zzfncVar = new zzfnc(context, zzfmzVar, iIntValue, iIntValue2, iIntValue3, str, str2);
        } else if (zzfmzVar == zzfmz.f16138t) {
            zzbio zzbioVar2 = zzbix.f8647m7;
            zzbiv zzbivVar2 = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
            int iIntValue4 = ((Integer) zzbivVar2.m5030a(zzbioVar2)).intValue();
            int iIntValue5 = ((Integer) zzbivVar2.m5030a(zzbix.f8749s7)).intValue();
            int iIntValue6 = ((Integer) zzbivVar2.m5030a(zzbix.f8783u7)).intValue();
            String str3 = (String) zzbivVar2.m5030a(zzbix.f8817w7);
            String str4 = (String) zzbivVar2.m5030a(zzbix.f8681o7);
            zzfncVar = new zzfnc(context, zzfmzVar, iIntValue4, iIntValue5, iIntValue6, str3, str4);
        } else if (zzfmzVar == zzfmz.f16139u) {
            zzbio zzbioVar3 = zzbix.f8868z7;
            zzbiv zzbivVar3 = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
            int iIntValue7 = ((Integer) zzbivVar3.m5030a(zzbioVar3)).intValue();
            int iIntValue8 = ((Integer) zzbivVar3.m5030a(zzbix.f8027B7)).intValue();
            int iIntValue9 = ((Integer) zzbivVar3.m5030a(zzbix.f8044C7)).intValue();
            String str5 = (String) zzbivVar3.m5030a(zzbix.f8834x7);
            String str6 = (String) zzbivVar3.m5030a(zzbix.f8851y7);
            zzfncVar = new zzfnc(context, zzfmzVar, iIntValue7, iIntValue8, iIntValue9, str5, str6);
        } else {
            Parcelable.Creator<zzfnc> creator = zzfnc.CREATOR;
            zzfncVar = null;
        }
        zzfmw zzfmwVar = new zzfmw(zzfncVar);
        zzfni zzfniVar2 = new zzfni(zzfmwVar, new zzfnr(zzfmwVar, zzfmrVar, zzfnoVar));
        map.put(zzfmzVar, zzfniVar2);
        return zzfniVar2;
    }
}
