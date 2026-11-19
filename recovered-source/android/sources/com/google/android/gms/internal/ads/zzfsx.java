package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfsx {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.util.zzg f16446a;

    /* JADX INFO: renamed from: c */
    public ScheduledFuture f16448c;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f16451f;

    /* JADX INFO: renamed from: g */
    public final zzftn f16452g;

    /* JADX INFO: renamed from: h */
    public final Clock f16453h;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f16447b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f16449d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f16450e = new AtomicBoolean(false);

    public zzfsx(com.google.android.gms.ads.internal.util.zzj zzjVar, ScheduledExecutorService scheduledExecutorService, zzftn zzftnVar, Clock clock) {
        this.f16446a = zzjVar;
        this.f16451f = scheduledExecutorService;
        this.f16452g = zzftnVar;
        this.f16453h = clock;
    }

    /* JADX INFO: renamed from: g */
    public static String m6644g(String str, AdFormat adFormat) {
        return str + ":" + adFormat;
    }

    /* JADX INFO: renamed from: a */
    public final void m6645a(zzful zzfulVar) {
        int i2 = 1;
        if (zzfulVar.m6712t() <= 0 && !zzfulVar.f16567m.get()) {
            i2 = 0;
        }
        m6647c(zzfulVar, i2);
    }

    /* JADX INFO: renamed from: b */
    public final void m6646b(zzful zzfulVar, boolean z) {
        zzftn zzftnVar = this.f16452g;
        if (z) {
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8420Z)).longValue();
            AdFormat adFormatM6709q = zzfulVar.m6709q();
            String str = zzfulVar.f16566l;
            String strM6710r = zzfulVar.m6710r();
            zzdzs zzdzsVarM6111a = zzftnVar.f16499a.m6111a();
            zzdzsVarM6111a.m6107b("action", "poact");
            zzdzsVarM6111a.m6107b("ad_unit_id", strM6710r);
            zzdzsVarM6111a.m6107b("pid", str);
            zzdzsVarM6111a.m6107b("poact_ts", Long.toString(jLongValue));
            if (adFormatM6709q != null) {
                zzdzsVarM6111a.m6107b(FirebaseAnalytics.Param.AD_FORMAT, adFormatM6709q.name().toLowerCase(Locale.ENGLISH));
            }
            zzdzsVarM6111a.m6108c();
        } else {
            this.f16453h.currentTimeMillis();
            AdFormat adFormatM6709q2 = zzfulVar.m6709q();
            String str2 = zzfulVar.f16566l;
            String strM6710r2 = zzfulVar.m6710r();
            zzdzs zzdzsVarM6111a2 = zzftnVar.f16499a.m6111a();
            zzdzsVarM6111a2.m6107b("action", "poac");
            zzdzsVarM6111a2.m6107b("ad_unit_id", strM6710r2);
            zzdzsVarM6111a2.m6107b("pid", str2);
            if (adFormatM6709q2 != null) {
                zzdzsVarM6111a2.m6107b(FirebaseAnalytics.Param.AD_FORMAT, adFormatM6709q2.name().toLowerCase(Locale.ENGLISH));
            }
            zzdzsVarM6111a2.m6108c();
        }
        this.f16447b.set(false);
        m6655l();
    }

    /* JADX INFO: renamed from: c */
    public final void m6647c(final zzful zzfulVar, final int i2) {
        if (m6652i(zzfulVar)) {
            return;
        }
        if (i2 > 0) {
            this.f16451f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.m6657n(zzfulVar, i2);
                }
            });
        }
        if (this.f16447b.get() || zzfulVar.m6712t() != 0 || !zzfulVar.m6713u()) {
            m6654k(0L);
            return;
        }
        zzfulVar.m6703k();
        m6654k(((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8488d0)).longValue());
    }

    /* JADX INFO: renamed from: d */
    public final void m6648d(final zzful zzfulVar) {
        AdFormat adFormatM6709q = zzfulVar.m6709q();
        if (adFormatM6709q == null) {
            return;
        }
        String strM6644g = m6644g(zzfulVar.f16566l, adFormatM6709q);
        LinkedHashMap linkedHashMap = this.f16449d;
        synchronized (linkedHashMap) {
            if (linkedHashMap.containsKey(strM6644g)) {
                linkedHashMap.remove(strM6644g);
                int iM6712t = zzfulVar.m6712t();
                int i2 = iM6712t - 1;
                if (!zzfulVar.f16567m.get()) {
                    iM6712t = i2;
                }
                final int iMax = Math.max(iM6712t, 0);
                this.f16451f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsv
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfsx zzfsxVar = this;
                        int i3 = iMax;
                        if (i3 > 0) {
                            zzfsxVar.m6657n(zzfulVar, i3);
                        }
                        zzfsxVar.m6654k(0L);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m6649e() {
        zzgwt zzgwtVarM7220t;
        LinkedHashMap linkedHashMap = this.f16449d;
        synchronized (linkedHashMap) {
            zzgwtVarM7220t = zzgwt.m7220t(linkedHashMap.values());
        }
        int size = zzgwtVarM7220t.size();
        int iMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zzful zzfulVar = (zzful) zzgwtVarM7220t.get(i2);
            int iM6712t = zzfulVar.m6712t();
            int i3 = iM6712t - 1;
            if (!zzfulVar.f16567m.get()) {
                iM6712t = i3;
            }
            iMax += Math.max(iM6712t, 0);
        }
        return iMax;
    }

    /* JADX INFO: renamed from: f */
    public final int m6650f() {
        int iMo3158T = this.f16446a.mo3158T();
        zzbio zzbioVar = zzbix.f8308S;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && iMo3158T > 0) {
            return iMo3158T;
        }
        return ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8471c0)).intValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m6651h(final zzful zzfulVar) {
        if (zzfulVar.m6712t() > 0 || zzfulVar.f16567m.get()) {
            this.f16451f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfso
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f16431s.m6657n(zzfulVar, 1);
                }
            });
        }
        this.f16447b.set(true);
        synchronized (this) {
            try {
                ScheduledFuture scheduledFuture = this.f16448c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f16448c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16450e.set(true);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m6652i(zzful zzfulVar) {
        boolean z;
        AdFormat adFormatM6709q = zzfulVar.m6709q();
        if (adFormatM6709q == null) {
            return true;
        }
        LinkedHashMap linkedHashMap = this.f16449d;
        synchronized (linkedHashMap) {
            z = !linkedHashMap.containsKey(m6644g(zzfulVar.f16566l, adFormatM6709q));
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m6653j() {
        zzgwt zzgwtVarM7220t;
        LinkedHashMap linkedHashMap = this.f16449d;
        synchronized (linkedHashMap) {
            zzgwtVarM7220t = zzgwt.m7220t(linkedHashMap.values());
        }
        int size = zzgwtVarM7220t.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzful zzfulVar = (zzful) zzgwtVarM7220t.get(i2);
            if (zzfulVar.m6712t() == 0 && zzfulVar.m6713u()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m6654k(long j2) {
        if (this.f16450e.compareAndSet(false, true)) {
            synchronized (this) {
                try {
                    if (j2 > 0) {
                        this.f16448c = this.f16451f.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsr
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.f16437s.m6655l();
                            }
                        }, j2, TimeUnit.MILLISECONDS);
                    } else {
                        this.f16451f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsq
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.f16436s.m6655l();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6655l() {
        zzful zzfulVar;
        zzgwt zzgwtVarM7220t;
        if (this.f16447b.get()) {
            return;
        }
        synchronized (this) {
            zzfulVar = null;
            this.f16448c = null;
        }
        int iM6650f = m6650f();
        if (m6649e() < iM6650f || m6653j()) {
            LinkedHashMap linkedHashMap = this.f16449d;
            synchronized (linkedHashMap) {
                zzgwtVarM7220t = zzgwt.m7220t(linkedHashMap.values());
            }
            int size = zzgwtVarM7220t.size();
            double d = Double.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                zzful zzfulVar2 = (zzful) zzgwtVarM7220t.get(i2);
                if (zzfulVar2.m6713u()) {
                    double dM6712t = ((double) zzfulVar2.m6712t()) / ((double) zzfulVar2.m6711s());
                    if (dM6712t < d) {
                        d = dM6712t;
                    }
                    if (dM6712t < d) {
                        zzfulVar = zzfulVar2;
                    }
                }
            }
            if (zzfulVar != null) {
                zzfulVar.m6703k();
                if (zzfulVar.m6712t() > 0) {
                    this.f16452g.m6685h("acmpa", this.f16453h.currentTimeMillis(), zzfulVar.f16566l, zzfulVar.m6710r(), zzfulVar.m6709q(), zzfulVar.m6711s(), zzfulVar.m6712t(), 0, m6649e(), iM6650f);
                }
            }
            if (m6649e() >= iM6650f) {
                m6656m();
            }
            if (m6649e() < iM6650f || m6653j()) {
                if (m6653j()) {
                    this.f16451f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfss
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f16438s.m6655l();
                        }
                    });
                    return;
                }
                synchronized (this) {
                    this.f16448c = this.f16451f.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfst
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f16439s.m6655l();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8505e0)).longValue(), TimeUnit.MILLISECONDS);
                }
                return;
            }
        } else {
            m6656m();
        }
        this.f16450e.set(false);
    }

    /* JADX INFO: renamed from: m */
    public final void m6656m() {
        int size;
        LinkedHashMap linkedHashMap = this.f16449d;
        synchronized (linkedHashMap) {
            size = linkedHashMap.size();
        }
        zzftn zzftnVar = this.f16452g;
        long jCurrentTimeMillis = this.f16453h.currentTimeMillis();
        int iM6650f = m6650f();
        zzdzs zzdzsVarM6111a = zzftnVar.f16499a.m6111a();
        zzdzsVarM6111a.m6107b("action", "acmlr");
        zzdzsVarM6111a.m6107b("pat", Long.toString(jCurrentTimeMillis));
        zzdzsVarM6111a.m6107b("mpl", Integer.toString(iM6650f));
        zzdzsVarM6111a.m6107b("pas", Integer.toString(size));
        zzdzsVarM6111a.m6108c();
    }

    /* JADX INFO: renamed from: n */
    public final void m6657n(zzful zzfulVar, int i2) {
        this.f16452g.m6685h("acmpr", this.f16453h.currentTimeMillis(), zzfulVar.f16566l, zzfulVar.m6710r(), zzfulVar.m6709q(), zzfulVar.m6711s(), zzfulVar.m6712t(), i2, m6649e(), m6650f());
    }
}
