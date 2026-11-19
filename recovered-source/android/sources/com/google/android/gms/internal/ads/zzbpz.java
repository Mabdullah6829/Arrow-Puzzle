package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbpz implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final zzbqa f9248a;

    public zzbpz(zzbqa zzbqaVar) {
        this.f9248a = zzbqaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f2 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f2 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Fail to parse float", e);
        }
        zzbqa zzbqaVar = this.f9248a;
        synchronized (zzbqaVar) {
            zzbqaVar.f9249a = zEquals;
            zzbqaVar.f9252d.set(true);
        }
        synchronized (zzbqaVar) {
            zzbqaVar.f9250b = zEquals2;
            zzbqaVar.f9251c = f2;
        }
        zzclbVar.mo5605k0((int) f2, zEquals);
    }
}
