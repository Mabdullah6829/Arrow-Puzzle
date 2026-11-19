package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbov implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzgqy zzgqyVar = new zzgqy();
        zzgqyVar.f18080c = 8388691;
        byte b = (byte) (zzgqyVar.f18084g | 1);
        zzgqyVar.f18081d = -1.0f;
        zzgqyVar.f18084g = (byte) (((byte) (((byte) (b | 2)) | 4)) | 8);
        zzgqyVar.f18079b = (String) map.get("appId");
        zzgqyVar.f18082e = zzclbVar.getWidth();
        zzgqyVar.f18084g = (byte) (zzgqyVar.f18084g | 16);
        IBinder windowToken = zzclbVar.mo5577H().getWindowToken();
        if (windowToken == null) {
            throw new NullPointerException("Null windowToken");
        }
        zzgqyVar.f18078a = windowToken;
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzgqyVar.f18080c = Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY"));
            zzgqyVar.f18084g = (byte) (zzgqyVar.f18084g | 1);
        } else {
            zzgqyVar.f18080c = 81;
            zzgqyVar.f18084g = (byte) (zzgqyVar.f18084g | 1);
        }
        if (map.containsKey("verticalMargin")) {
            zzgqyVar.f18081d = Float.parseFloat((String) map.get("verticalMargin"));
            zzgqyVar.f18084g = (byte) (zzgqyVar.f18084g | 2);
        } else {
            zzgqyVar.f18081d = 0.02f;
            zzgqyVar.f18084g = (byte) (zzgqyVar.f18084g | 2);
        }
        if (map.containsKey("enifd")) {
            zzgqyVar.f18083f = (String) map.get("enifd");
        }
        try {
            com.google.android.gms.ads.internal.zzt.f3698C.f3719s.m3027b(zzclbVar, zzgqyVar.m7073a());
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("DefaultGmsgHandlers.ShowLMDOverlay", e);
            com.google.android.gms.ads.internal.util.zze.m3150k("Missing parameters for LMD Overlay show request");
        }
    }
}
