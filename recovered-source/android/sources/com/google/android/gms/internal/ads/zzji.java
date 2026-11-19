package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzji implements zzma {

    /* JADX INFO: renamed from: p */
    public static final zzgwt f20112p;

    /* JADX INFO: renamed from: a */
    public final zzbe f20113a;

    /* JADX INFO: renamed from: b */
    public final zzbd f20114b;

    /* JADX INFO: renamed from: c */
    public final zzabs f20115c;

    /* JADX INFO: renamed from: d */
    public final long f20116d;

    /* JADX INFO: renamed from: e */
    public final long f20117e;

    /* JADX INFO: renamed from: f */
    public final long f20118f;

    /* JADX INFO: renamed from: g */
    public final long f20119g;

    /* JADX INFO: renamed from: h */
    public final long f20120h;

    /* JADX INFO: renamed from: i */
    public final long f20121i;

    /* JADX INFO: renamed from: j */
    public final long f20122j;

    /* JADX INFO: renamed from: k */
    public final long f20123k;

    /* JADX INFO: renamed from: l */
    public final long f20124l;

    /* JADX INFO: renamed from: m */
    public final zzgww f20125m;

    /* JADX INFO: renamed from: n */
    public final ConcurrentHashMap f20126n;

    /* JADX INFO: renamed from: o */
    public long f20127o;

    static {
        zzgzi zzgziVar = zzgwt.f18303t;
        Object[] objArr = {"file", FirebaseAnalytics.Param.CONTENT, Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "android.resource", "rawresource", "asset"};
        zzgym.m7263a(6, objArr);
        f20112p = zzgwt.m7222v(6, objArr);
    }

    public zzji() {
        zzabs zzabsVar = new zzabs();
        zzgww zzgwwVar = zzgyt.f18367y;
        m8614l(1000, 0, "bufferForPlaybackMs", "0");
        m8614l(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        m8614l(AdError.SERVER_ERROR_CODE, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m8614l(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        m8614l(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        m8614l(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        m8614l(50000, AdError.SERVER_ERROR_CODE, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m8614l(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        m8614l(50000, 50000, "maxBufferMs", "minBufferMs");
        m8614l(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        m8614l(0, 0, "backBufferDurationMs", "0");
        this.f20113a = new zzbe();
        this.f20114b = new zzbd();
        this.f20115c = zzabsVar;
        long jM6519u = zzfm.m6519u(50000L);
        this.f20116d = jM6519u;
        long jM6519u2 = zzfm.m6519u(1000L);
        this.f20117e = jM6519u2;
        this.f20118f = jM6519u;
        this.f20119g = jM6519u;
        this.f20120h = jM6519u2;
        this.f20121i = jM6519u2;
        this.f20122j = zzfm.m6519u(2000L);
        this.f20123k = jM6519u2;
        this.f20124l = zzfm.m6519u(0L);
        this.f20126n = new ConcurrentHashMap();
        this.f20125m = zzgww.m7229a(zzgwwVar);
        this.f20127o = -1L;
    }

    /* JADX INFO: renamed from: l */
    public static void m8614l(int i2, int i3, String str, String str2) {
        if (!(i2 >= i3)) {
            throw new IllegalArgumentException(zzgui.m7149b("%s cannot be less than %s", str, str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: a */
    public final void mo5521a(zzqh zzqhVar) {
        ConcurrentHashMap concurrentHashMap = this.f20126n;
        zzjh zzjhVar = (zzjh) concurrentHashMap.get(zzqhVar);
        if (zzjhVar != null) {
            int i2 = zzjhVar.f20108a - 1;
            zzjhVar.f20108a = i2;
            if (i2 == 0) {
                concurrentHashMap.remove(zzqhVar);
                m8615j();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.f20127o = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: b */
    public final long mo5522b() {
        return this.f20124l;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: d */
    public final void mo5524d(zzqh zzqhVar) {
        ConcurrentHashMap concurrentHashMap = this.f20126n;
        zzjh zzjhVar = (zzjh) concurrentHashMap.get(zzqhVar);
        if (zzjhVar != null) {
            int i2 = zzjhVar.f20108a - 1;
            zzjhVar.f20108a = i2;
            if (i2 == 0) {
                concurrentHashMap.remove(zzqhVar);
                m8615j();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: e */
    public final void mo5525e(zzlz zzlzVar, zzabb[] zzabbVarArr) {
        zzqh zzqhVar = zzlzVar.f20352a;
        Integer num = (Integer) this.f20125m.get(zzqhVar.f20625a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        zzjh zzjhVar = (zzjh) this.f20126n.get(zzqhVar);
        zzjhVar.getClass();
        if (iIntValue == -1) {
            boolean zM8616k = m8616k(zzlzVar);
            int length = zzabbVarArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 13107200;
                if (i2 >= length) {
                    break;
                }
                zzabb zzabbVar = zzabbVarArr[i2];
                if (zzabbVar != null) {
                    int i5 = zzabbVar.zza().f7809c;
                    if (i5 != -1) {
                        if (i5 == 0) {
                            i4 = 144310272;
                        } else if (i5 != 1) {
                            if (i5 != 2) {
                                i4 = i5 != 4 ? 131072 : 26214400;
                            } else {
                                i4 = zM8616k ? 19660800 : 131072000;
                            }
                        }
                    }
                    i3 += i4;
                }
                i2++;
            }
            String str = zzfm.f16091a;
            iIntValue = Math.max(13107200, Math.min(i3, 210239488));
        }
        zzjhVar.f20110c = iIntValue;
        m8615j();
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: f */
    public final zzabm mo5526f(zzqh zzqhVar) {
        return new zzjg(this, zzqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: g */
    public final boolean mo5527g(zzlz zzlzVar) {
        long jMin;
        boolean z;
        int i2;
        boolean z2 = zzlzVar.f20357f;
        long jRound = zzlzVar.f20355d;
        float f2 = zzlzVar.f20356e;
        boolean zM8616k = m8616k(zzlzVar);
        String str = zzfm.f16091a;
        if (f2 != 1.0f) {
            jRound = Math.round(jRound / ((double) f2));
        }
        if (z2) {
            if (zM8616k) {
                jMin = this.f20123k;
                z = true;
            } else {
                jMin = this.f20122j;
                z = false;
            }
        } else if (zM8616k) {
            jMin = this.f20121i;
            z = true;
        } else {
            jMin = this.f20120h;
            z = false;
        }
        long j2 = zzlzVar.f20358g;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        if (jMin > 0 && jRound < jMin) {
            if (!z) {
                zzqh zzqhVar = zzlzVar.f20352a;
                zzjh zzjhVar = (zzjh) this.f20126n.get(zzqhVar);
                zzjhVar.getClass();
                synchronized (zzjhVar) {
                    i2 = zzjhVar.f20111d;
                }
                int i3 = i2 * 65536;
                zzjh zzjhVar2 = (zzjh) this.f20126n.get(zzqhVar);
                zzjhVar2.getClass();
                if (i3 >= zzjhVar2.f20110c) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: h */
    public final boolean mo5528h(zzlz zzlzVar) {
        int i2;
        boolean z;
        int i3;
        ConcurrentHashMap concurrentHashMap = this.f20126n;
        zzqh zzqhVar = zzlzVar.f20352a;
        zzjh zzjhVar = (zzjh) concurrentHashMap.get(zzqhVar);
        zzjhVar.getClass();
        zzjh zzjhVar2 = (zzjh) this.f20126n.get(zzqhVar);
        zzjhVar2.getClass();
        synchronized (zzjhVar2) {
            i2 = zzjhVar2.f20111d;
        }
        int i4 = i2 * 65536;
        zzjh zzjhVar3 = (zzjh) this.f20126n.get(zzqhVar);
        zzjhVar3.getClass();
        int i5 = zzjhVar3.f20110c;
        if (zzqhVar.equals(zzqh.f20624c)) {
            return i4 < i5;
        }
        boolean zM8616k = m8616k(zzlzVar);
        long jMin = zM8616k ? this.f20117e : this.f20116d;
        long j2 = zM8616k ? this.f20119g : this.f20118f;
        float f2 = zzlzVar.f20356e;
        if (f2 > 1.0f) {
            jMin = Math.min(zzfm.m6523y(jMin, f2), j2);
        }
        long j3 = zzlzVar.f20355d;
        if (j3 < Math.max(jMin, 500000L)) {
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            if (runtime.totalMemory() >= jMaxMemory) {
                long jFreeMemory = runtime.freeMemory();
                zzabs zzabsVar = this.f20115c;
                synchronized (zzabsVar) {
                    i3 = zzabsVar.f4860c * 65536;
                }
                if (jFreeMemory + ((long) i3) >= jMaxMemory / 25) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            boolean z2 = !zM8616k ? i4 >= i5 : !z && i4 >= i5;
            zzjhVar.f20109b = z2;
            if (!z2 && zM8616k && !z) {
                zzeh.m6210b("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!zzjhVar.f20109b && j3 < 500000) {
                zzeh.m6211c("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= j2 || i4 >= i5) {
            zzjhVar.f20109b = false;
        }
        return zzjhVar.f20109b;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: i */
    public final void mo5529i(zzqh zzqhVar) {
        long id = Thread.currentThread().getId();
        long j2 = this.f20127o;
        zzgtr.m7134g("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j2 == -1 || j2 == id);
        this.f20127o = id;
        ConcurrentHashMap concurrentHashMap = this.f20126n;
        zzjh zzjhVar = (zzjh) concurrentHashMap.get(zzqhVar);
        if (zzjhVar == null) {
            concurrentHashMap.put(zzqhVar, new zzjh());
        } else {
            zzjhVar.f20108a++;
        }
        zzjh zzjhVar2 = (zzjh) concurrentHashMap.get(zzqhVar);
        zzjhVar2.getClass();
        Integer num = (Integer) this.f20125m.get(zzqhVar.f20625a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        zzjhVar2.f20110c = iIntValue;
        zzjhVar2.f20109b = false;
    }

    /* JADX INFO: renamed from: j */
    public final void m8615j() {
        zzabs zzabsVar = this.f20115c;
        ConcurrentHashMap concurrentHashMap = this.f20126n;
        int i2 = 0;
        if (concurrentHashMap.isEmpty()) {
            synchronized (zzabsVar) {
                zzabsVar.m3935c(0);
            }
        } else {
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                i2 += ((zzjh) it.next()).f20110c;
            }
            zzabsVar.m3935c(i2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m8616k(zzlz zzlzVar) {
        zzbf zzbfVar = zzlzVar.f20353b;
        zzag zzagVar = zzbfVar.mo4736b(zzbfVar.mo4841o(zzlzVar.f20354c.f21278a, this.f20114b).f7634c, this.f20113a, 0L).f7676b.f5574b;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.f5240a.getScheme();
        return TextUtils.isEmpty(scheme) || f20112p.contains(scheme);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final boolean zzj() {
        Iterator it = this.f20126n.values().iterator();
        while (it.hasNext()) {
            if (((zzjh) it.next()).f20109b) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: c */
    public final void mo5523c() {
    }
}
