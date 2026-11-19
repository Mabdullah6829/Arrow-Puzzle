package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import android.view.View;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzbbt implements zzfzk {

    /* JADX INFO: renamed from: a */
    public final zzfxs f7531a;

    /* JADX INFO: renamed from: b */
    public final zzfyg f7532b;

    /* JADX INFO: renamed from: c */
    public final zzbcg f7533c;

    /* JADX INFO: renamed from: d */
    public final zzbbs f7534d;

    /* JADX INFO: renamed from: e */
    public final zzbbc f7535e;

    /* JADX INFO: renamed from: f */
    public final zzbci f7536f;

    /* JADX INFO: renamed from: g */
    public final zzbca f7537g;

    /* JADX INFO: renamed from: h */
    public final zzbbr f7538h;

    public zzbbt(zzfxs zzfxsVar, zzfyg zzfygVar, zzbcg zzbcgVar, zzbbs zzbbsVar, zzbbc zzbbcVar, zzbci zzbciVar, zzbca zzbcaVar, zzbbr zzbbrVar) {
        this.f7531a = zzfxsVar;
        this.f7532b = zzfygVar;
        this.f7533c = zzbcgVar;
        this.f7534d = zzbbsVar;
        this.f7535e = zzbbcVar;
        this.f7536f = zzbciVar;
        this.f7537g = zzbcaVar;
        this.f7538h = zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    /* JADX INFO: renamed from: a */
    public final HashMap mo4724a() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0117 A[Catch: all -> 0x00fb, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x00fb, blocks: (B:10:0x00ec, B:12:0x00f0, B:14:0x00f7, B:18:0x00fd, B:20:0x0106, B:22:0x010a, B:24:0x0113, B:26:0x0117), top: B:37:0x00ec }] */
    /* JADX INFO: renamed from: b */
    public final HashMap m4725b() {
        long j2;
        HashMap map = new HashMap();
        zzfxs zzfxsVar = this.f7531a;
        Task task = this.f7532b.f16807d;
        zzayt zzaytVar = zzfyc.f16801a;
        if (task.isSuccessful()) {
            zzaytVar = (zzayt) task.getResult();
        }
        map.put("v", zzfxsVar.mo6765a());
        map.put("gms", Boolean.valueOf(zzfxsVar.mo6767c()));
        map.put("gv", Long.valueOf(zzaytVar.m4563A0()));
        map.put("int", zzaytVar.m4629y0());
        map.put("attts", Long.valueOf(zzaytVar.m4567D0().m4667E()));
        map.put("att", zzaytVar.m4567D0().m4669G());
        map.put("attkid", zzaytVar.m4567D0().m4668F());
        map.put("up", Boolean.valueOf(this.f7534d.f7530a));
        map.put("t", new Throwable());
        zzbca zzbcaVar = this.f7537g;
        map.put("tcq", Long.valueOf(zzbcaVar.f7562a));
        map.put("tpq", Long.valueOf(zzbcaVar.f7563b));
        map.put("tcv", Long.valueOf(zzbcaVar.f7564c));
        map.put("tpv", Long.valueOf(zzbcaVar.f7565d));
        map.put("tchv", Long.valueOf(zzbcaVar.f7566e));
        map.put("tphv", Long.valueOf(zzbcaVar.f7567f));
        map.put("tcc", Long.valueOf(zzbcaVar.f7568g));
        map.put("tpc", Long.valueOf(zzbcaVar.f7569h));
        zzbbc zzbbcVar = this.f7535e;
        if (zzbbcVar != null) {
            synchronized (zzbbc.class) {
                try {
                    NetworkCapabilities networkCapabilities = zzbbcVar.f7508a;
                    if (networkCapabilities != null) {
                        if (networkCapabilities.hasTransport(4)) {
                            j2 = 2;
                        } else if (zzbbcVar.f7508a.hasTransport(1)) {
                            j2 = 1;
                        } else {
                            j2 = zzbbcVar.f7508a.hasTransport(0) ? 0L : -1L;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            map.put("nt", Long.valueOf(j2));
        }
        zzbci zzbciVar = this.f7536f;
        map.put("vs", Long.valueOf(zzbciVar.f7607d ? zzbciVar.f7605b - zzbciVar.f7604a : -1L));
        long j3 = zzbciVar.f7606c;
        zzbciVar.f7606c = -1L;
        map.put("vf", Long.valueOf(j3));
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    /* JADX INFO: renamed from: d */
    public final HashMap mo4726d() {
        HashMap mapM4725b = m4725b();
        zzbcg zzbcgVar = this.f7533c;
        if (zzbcgVar.f7593D <= -2) {
            WeakReference weakReference = zzbcgVar.f7601z;
            if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                zzbcgVar.f7593D = -3L;
            }
        }
        mapM4725b.put("lts", Long.valueOf(zzbcgVar.f7593D));
        return mapM4725b;
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    public final HashMap zzb() {
        return m4725b();
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    public final HashMap zzc() {
        HashMap mapM4725b = m4725b();
        zzbbr zzbbrVar = this.f7538h;
        List list = zzbbrVar.f7529a;
        zzbbrVar.f7529a = Collections.EMPTY_LIST;
        mapM4725b.put("vst", list);
        return mapM4725b;
    }
}
