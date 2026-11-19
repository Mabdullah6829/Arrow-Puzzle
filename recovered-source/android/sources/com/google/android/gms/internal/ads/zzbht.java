package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbht {
    /* JADX INFO: renamed from: a */
    public static final Future m4891a(Context context, zzbhi zzbhiVar) {
        zzbhs zzbhsVar = new zzbhs(context);
        zzbhm zzbhmVar = new zzbhm(zzbhsVar);
        zzbhq zzbhqVar = new zzbhq(zzbhsVar, zzbhiVar, zzbhmVar);
        zzbhr zzbhrVar = new zzbhr(zzbhsVar, zzbhmVar);
        synchronized (zzbhsVar.f7878c) {
            zzbhh zzbhhVar = new zzbhh(context, com.google.android.gms.ads.internal.zzt.f3698C.f3720t.m3128a(), zzbhqVar, zzbhrVar);
            zzbhsVar.f7876a = zzbhhVar;
            zzbhhVar.checkAvailabilityAndConnect();
        }
        return zzbhmVar;
    }
}
