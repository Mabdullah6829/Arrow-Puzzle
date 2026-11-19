package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqs implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final zzecz f9286a;

    public zzbqs(zzecz zzeczVar) {
        this.f9286a = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        boolean zContainsKey = map.containsKey("expires");
        long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
        if (zContainsKey) {
            try {
                j2 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        zzecz zzeczVar = this.f9286a;
        String str = (String) map.get("extras");
        synchronized (zzeczVar) {
            zzeczVar.f13644o = str;
            zzeczVar.f13646q = j2;
            zzeczVar.m6174m();
        }
    }
}
