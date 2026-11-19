package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzn extends LinkedHashMap {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzq f3962s;

    public zzn(zzq zzqVar) {
        this.f3962s = zzqVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        zzq zzqVar = this.f3962s;
        synchronized (zzqVar) {
            try {
                if (size() <= zzqVar.f3970a) {
                    return false;
                }
                zzqVar.f3975f.add(new Pair((String) entry.getKey(), ((zzo) entry.getValue()).f3964b));
                return size() > zzqVar.f3970a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
