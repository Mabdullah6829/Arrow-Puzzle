package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqd implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final Context f9254a;

    /* JADX INFO: renamed from: b */
    public final Map f9255b;

    public zzbqd(Context context, HashMap map) {
        this.f9254a = context;
        this.f9255b = map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        byte b;
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zzceg zzcegVar = zztVar.f3725y;
        zzceg zzcegVar2 = zztVar.f3725y;
        Context context = this.f9254a;
        if (zzcegVar.m5361a(context)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("_ac")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals("_aa")) {
                b = 2;
            } else {
                b = -1;
            }
            Map map2 = this.f9255b;
            if (b == 0) {
                Map map3 = (Map) map2.get("_ac");
                zzcegVar2.getClass();
                zzcegVar2.m5366h(context, "_ac", str2, zzceg.m5359f(map3));
            } else if (b == 1) {
                Map map4 = (Map) map2.get("_ai");
                zzcegVar2.getClass();
                zzcegVar2.m5366h(context, "_ai", str2, zzceg.m5359f(map4));
            } else if (b == 2) {
                zzcegVar2.m5366h(context, "_aa", str2, null);
            } else {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3070c("logScionEvent gmsg contained unsupported eventName");
            }
        }
    }
}
