package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.firebase.messaging.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzcjo implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzcjq f10246s;

    public /* synthetic */ zzcjo(zzcjq zzcjqVar) {
        this.f10246s = zzcjqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.client.zzba zzbaVar;
        long j2;
        long j3;
        zzcjq zzcjqVar = this.f10246s;
        String strM5517r = zzcjq.m5517r(zzcjqVar.f10253w);
        try {
            zzbio zzbioVar = zzbix.f8556h0;
            com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f3095e;
            long jLongValue = ((Long) zzbaVar2.f3098c.m5030a(zzbioVar)).longValue() * 1000;
            long jIntValue = ((Integer) zzbaVar2.f3098c.m5030a(zzbix.f8002A)).intValue();
            boolean zBooleanValue = ((Boolean) zzbaVar2.f3098c.m5030a(zzbix.f8829x2)).booleanValue();
            synchronized (zzcjqVar) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                if (System.currentTimeMillis() - zzcjqVar.f10250A > jLongValue) {
                    StringBuilder sb = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                    sb.append("Timeout reached. Limit: ");
                    sb.append(jLongValue);
                    sb.append(" ms");
                    throw new IOException(sb.toString());
                }
                if (zzcjqVar.f10254x) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!zzcjqVar.f10255y) {
                    if (!zzcjqVar.f10252v.m5551q()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jM8798b = zzcjqVar.f10252v.f10331A.m8798b();
                    if (jM8798b > 0) {
                        long jM8799c = zzcjqVar.f10252v.f10331A.m8799c();
                        if (jM8799c != zzcjqVar.f10251B) {
                            zzbaVar = zzbaVar2;
                            j3 = jM8799c;
                            j2 = jM8798b;
                            com.google.android.gms.ads.internal.util.client.zzf.f3409b.post(new zzcjc(zzcjqVar, zzcjqVar.f10253w, strM5517r, jM8799c, jM8798b, zBooleanValue ? zzcjqVar.f10252v.m5555u() : -1L, zBooleanValue ? zzcjqVar.f10252v.m5556v() : -1L, zBooleanValue ? zzcjqVar.f10252v.m5557w() : -1L, jM8799c > 0, zzchl.f10038s.get(), zzchl.f10039t.get()));
                            zzcjqVar.f10251B = j3;
                        } else {
                            zzbaVar = zzbaVar2;
                            j2 = jM8798b;
                            j3 = jM8799c;
                        }
                        if (j3 >= j2) {
                            com.google.android.gms.ads.internal.util.client.zzf.f3409b.post(new zzcjf(zzcjqVar, zzcjqVar.f10253w, strM5517r, j2));
                        } else if (zzcjqVar.f10252v.f10335E >= jIntValue && j3 > 0) {
                        }
                    } else {
                        zzbaVar = zzbaVar2;
                    }
                    com.google.android.gms.ads.internal.util.zzs.f3626l.postDelayed(new zzcjo(zzcjqVar), ((Long) zzbaVar.f3098c.m5030a(zzbix.f8573i0)).longValue());
                    return;
                }
                com.google.android.gms.ads.internal.zzt.f3698C.f3699A.f10184s.remove(zzcjqVar.f10256z);
            }
        } catch (Exception e) {
            String str = zzcjqVar.f10253w;
            String message = e.getMessage();
            String strM2451r = AbstractC1456a.m2451r(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(strM2451r);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("VideoStreamExoPlayerCache.preload", e);
            zzcjqVar.release();
            zzcjqVar.m5513p(zzcjqVar.f10253w, strM5517r, Constants.IPC_BUNDLE_KEY_SEND_ERROR, zzcjq.m5518s(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e));
        }
    }
}
