package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexx implements zzimz {
    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Object arrayList = new ArrayList();
        zzbio zzbioVar = zzbix.f8586id;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((String) zzbaVar.f3098c.m5030a(zzbioVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) zzbaVar.f3098c.m5030a(zzbioVar)).split(","));
        }
        zzinh.m8554a(arrayList);
        return arrayList;
    }
}
