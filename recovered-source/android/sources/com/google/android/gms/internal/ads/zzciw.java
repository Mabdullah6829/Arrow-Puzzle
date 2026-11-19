package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzciw implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzchu zzchuVar = (zzchu) obj;
        zzcmh zzcmhVarZzh = zzchuVar.zzh();
        if (zzcmhVarZzh == null) {
            try {
                zzcmh zzcmhVar = new zzcmh(zzchuVar, Float.parseFloat((String) map.get(TypedValues.TransitionType.S_DURATION)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzchuVar.mo5476n0(zzcmhVar);
                zzcmhVarZzh = zzcmhVar;
            } catch (NullPointerException e) {
                e = e;
                Throwable th = e;
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to parse videoMeta message.", th);
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoMetaGmsgHandler.onGmsg", th);
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                Throwable th2 = e;
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to parse videoMeta message.", th2);
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoMetaGmsgHandler.onGmsg", th2);
                return;
            }
        }
        float f2 = Float.parseFloat((String) map.get(TypedValues.TransitionType.S_DURATION));
        boolean zEquals = "1".equals(map.get("muted"));
        float f3 = Float.parseFloat((String) map.get("currentTime"));
        int i4 = Integer.parseInt((String) map.get("playbackState"));
        if (i4 < 0 || i4 > 3) {
            i4 = 0;
        }
        String str = (String) map.get("aspectRatio");
        float f4 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.client.zzo.m3077j(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(f3).length() + 45 + String.valueOf(f2).length() + 13 + String.valueOf(zEquals).length() + 19 + String.valueOf(i4).length() + 17 + String.valueOf(str).length());
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(f3);
            sb.append(" , duration : ");
            sb.append(f2);
            sb.append(" , isMuted : ");
            sb.append(zEquals);
            sb.append(" , playbackState : ");
            sb.append(i4);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.m3068a(sb.toString());
        }
        zzcmhVarZzh.m5670m4(f3, f2, f4, i4, zEquals);
    }
}
