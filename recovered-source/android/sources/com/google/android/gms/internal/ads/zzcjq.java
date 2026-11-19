package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcjq extends zzcjh implements zzchk {

    /* JADX INFO: renamed from: A */
    public long f10250A;

    /* JADX INFO: renamed from: B */
    public long f10251B;

    /* JADX INFO: renamed from: v */
    public zzckj f10252v;

    /* JADX INFO: renamed from: w */
    public String f10253w;

    /* JADX INFO: renamed from: x */
    public boolean f10254x;

    /* JADX INFO: renamed from: y */
    public boolean f10255y;

    /* JADX INFO: renamed from: z */
    public zzciz f10256z;

    /* JADX INFO: renamed from: r */
    public static final String m5517r(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.m3035d(str, "MD5")));
    }

    /* JADX INFO: renamed from: s */
    public static String m5518s(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(str.length(), 1, String.valueOf(canonicalName).length(), 1, String.valueOf(message).length()));
        AbstractC0271e0.m413u(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    /* JADX INFO: renamed from: a */
    public final void mo5446a(int i2, int i3) {
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    /* JADX INFO: renamed from: a0 */
    public final void mo5447a0(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    /* JADX INFO: renamed from: b */
    public final void mo5448b(String str, Exception exc) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3074g("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    /* JADX INFO: renamed from: c */
    public final void mo5449c(final boolean z, final long j2) {
        final zzchu zzchuVar = (zzchu) this.f10226u.get();
        if (zzchuVar != null) {
            ((zzcfx) zzcfy.f9951f).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzchuVar.mo5475l0(z, j2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    /* JADX INFO: renamed from: d */
    public final void mo5450d(IOException iOException) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3074g("Precache exception", iOException);
        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("VideoStreamExoPlayerCache.onException", iOException);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    /* JADX INFO: renamed from: f */
    public final boolean mo5505f(String str) {
        return mo5506h(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    /* JADX INFO: renamed from: h */
    public final boolean mo5506h(String str, String[] strArr) throws Throwable {
        long j2;
        long j3;
        long j4;
        long j5;
        zzcjq zzcjqVar = this;
        String str2 = str;
        zzcjqVar.f10253w = str2;
        String strM5517r = m5517r(str2);
        String str3 = " ms";
        String str4 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                uriArr[i2] = Uri.parse(strArr[i2]);
            }
            zzcjqVar.f10252v.m5560z(uriArr, zzcjqVar.f10225t);
            zzchu zzchuVar = (zzchu) zzcjqVar.f10226u.get();
            if (zzchuVar != null) {
                zzchuVar.mo5478u(strM5517r, zzcjqVar);
            }
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbio zzbioVar = zzbix.f8573i0;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            long jLongValue = ((Long) zzbaVar.f3098c.m5030a(zzbioVar)).longValue();
            long jLongValue2 = ((Long) zzbaVar.f3098c.m5030a(zzbix.f8556h0)).longValue() * 1000;
            long jIntValue = ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8002A)).intValue();
            boolean zBooleanValue = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8829x2)).booleanValue();
            long j6 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            String str5 = str4;
                            long j7 = jLongValue2;
                            StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 27);
                            sb.append(str5);
                            sb.append(j7);
                            sb.append(str3);
                            throw new IOException(sb.toString());
                        }
                        if (zzcjqVar.f10254x) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (zzcjqVar.f10255y) {
                            return true;
                        }
                        if (!zzcjqVar.f10252v.m5551q()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jM8798b = zzcjqVar.f10252v.f10331A.m8798b();
                        if (jM8798b > 0) {
                            long jM8799c = zzcjqVar.f10252v.f10331A.m8799c();
                            if (jM8799c != j6) {
                                try {
                                    j4 = jM8798b;
                                    j5 = jM8799c;
                                    j3 = jLongValue;
                                    com.google.android.gms.ads.internal.util.client.zzf.f3409b.post(new zzcjc(zzcjqVar, str2, strM5517r, j5, j4, zBooleanValue ? zzcjqVar.f10252v.m5555u() : -1L, zBooleanValue ? zzcjqVar.f10252v.m5556v() : -1L, zBooleanValue ? zzcjqVar.f10252v.m5557w() : -1L, jM8799c > 0, zzchl.f10038s.get(), zzchl.f10039t.get()));
                                    j6 = j5;
                                } catch (Throwable th) {
                                    th = th;
                                    zzcjqVar = this;
                                    str2 = str;
                                }
                            } else {
                                j3 = jLongValue;
                                j4 = jM8798b;
                                j5 = jM8799c;
                            }
                            if (j5 >= j4) {
                                com.google.android.gms.ads.internal.util.client.zzf.f3409b.post(new zzcjf(this, str, strM5517r, j4));
                                return true;
                            }
                            zzcjqVar = this;
                            str2 = str;
                            if (zzcjqVar.f10252v.f10335E >= jIntValue && j5 > 0) {
                                return true;
                            }
                            j2 = j3;
                        } else {
                            str3 = str3;
                            str4 = str4;
                            jLongValue2 = jLongValue2;
                            jIntValue = jIntValue;
                            j2 = jLongValue;
                        }
                        try {
                            zzcjqVar.wait(j2);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                throw th;
                jLongValue = j2;
                jLongValue2 = jLongValue2;
                jIntValue = jIntValue;
                str3 = str3;
                str4 = str4;
            }
        } catch (Exception e) {
            String message = e.getMessage();
            String strM2451r = AbstractC1456a.m2451r(new StringBuilder(String.valueOf(str2).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str2, " Exception: ", message);
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(strM2451r);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("VideoStreamExoPlayerCache.preload", e);
            zzcjqVar.release();
            zzcjqVar.m5513p(str2, strM5517r, Constants.IPC_BUNDLE_KEY_SEND_ERROR, m5518s(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    /* JADX INFO: renamed from: i */
    public final boolean mo5507i(String str, String[] strArr, zzciz zzcizVar) {
        this.f10253w = str;
        this.f10256z = zzcizVar;
        String strM5517r = m5517r(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                uriArr[i2] = Uri.parse(strArr[i2]);
            }
            this.f10252v.m5560z(uriArr, this.f10225t);
            zzchu zzchuVar = (zzchu) this.f10226u.get();
            if (zzchuVar != null) {
                zzchuVar.mo5478u(strM5517r, this);
            }
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            this.f10250A = System.currentTimeMillis();
            this.f10251B = -1L;
            com.google.android.gms.ads.internal.util.zzs.f3626l.postDelayed(new zzcjo(this), 0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            String strM2451r = AbstractC1456a.m2451r(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(strM2451r);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("VideoStreamExoPlayerCache.preload", e);
            release();
            m5513p(str, strM5517r, Constants.IPC_BUNDLE_KEY_SEND_ERROR, m5518s(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    /* JADX INFO: renamed from: j */
    public final void mo5508j(int i2) {
        this.f10252v.m5554t(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    /* JADX INFO: renamed from: l */
    public final void mo5509l(int i2) {
        this.f10252v.m5553s(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    /* JADX INFO: renamed from: m */
    public final void mo5510m(int i2) {
        this.f10252v.m5541D(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    /* JADX INFO: renamed from: n */
    public final void mo5511n(int i2) {
        this.f10252v.m5542E(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    /* JADX INFO: renamed from: o */
    public final void mo5512o() {
        synchronized (this) {
            this.f10254x = true;
            notify();
            release();
        }
        String str = this.f10253w;
        if (str != null) {
            m5513p(this.f10253w, m5517r(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjh, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzckj zzckjVar = this.f10252v;
        if (zzckjVar != null) {
            zzckjVar.f10334D = null;
            zzckjVar.m5539B();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    /* JADX INFO: renamed from: y */
    public final void mo5451y() {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Precache onRenderedFirstFrame");
    }
}
