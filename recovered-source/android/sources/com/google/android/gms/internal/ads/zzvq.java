package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(29)
final class zzvq {
    /* JADX INFO: renamed from: a */
    public static int m8953a(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.m8853e("video/avc");
            zzv zzvVar = new zzv(zztVar);
            if (zzvVar.f21061o != null) {
                List listM8974b = zzwi.m8974b(zzvy.f21202a, zzvVar, z, false);
                for (int i2 = 0; i2 < ((zzgyo) listM8974b).f18357v; i2++) {
                    zzgyo zzgyoVar = (zzgyo) listM8974b;
                    if (((zzvp) zzgyoVar.get(i2)).f21114d != null && (videoCapabilities = ((zzvp) zzgyoVar.get(i2)).f21114d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        AbstractC5156j.m3823g();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointM3819c = AbstractC5156j.m3819c();
                        for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                            if (AbstractC5156j.m3821e(supportedPerformancePoints.get(i3)).covers(performancePointM3819c)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (zzwa unused) {
        }
        return 0;
    }
}
