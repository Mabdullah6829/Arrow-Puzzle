package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzful {

    /* JADX INFO: renamed from: a */
    public final ClientApi f16555a;

    /* JADX INFO: renamed from: b */
    public final Context f16556b;

    /* JADX INFO: renamed from: c */
    public final int f16557c;

    /* JADX INFO: renamed from: d */
    public final zzfmc f16558d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference f16559e;

    /* JADX INFO: renamed from: f */
    public final zzfsx f16560f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f16561g;

    /* JADX INFO: renamed from: h */
    public final com.google.android.gms.ads.internal.client.zzcb f16562h;

    /* JADX INFO: renamed from: i */
    public final com.google.android.gms.ads.internal.client.zzce f16563i;

    /* JADX INFO: renamed from: j */
    public final Queue f16564j;

    /* JADX INFO: renamed from: k */
    public final zzftg f16565k;

    /* JADX INFO: renamed from: l */
    public final String f16566l;

    /* JADX INFO: renamed from: m */
    public final AtomicBoolean f16567m;

    /* JADX INFO: renamed from: n */
    public final ScheduledExecutorService f16568n;

    /* JADX INFO: renamed from: o */
    public final zzfow f16569o;

    /* JADX INFO: renamed from: p */
    public final AtomicBoolean f16570p;

    /* JADX INFO: renamed from: q */
    public zzftn f16571q;

    /* JADX INFO: renamed from: r */
    public final Clock f16572r;

    /* JADX INFO: renamed from: s */
    public final zzftu f16573s;

    public zzful(ClientApi clientApi, Context context, int i2, zzfmc zzfmcVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, Clock clock) {
        this("none", clientApi, context, i2, zzfmcVar, zzfpVar, scheduledExecutorService, zzfowVar, zzftgVar, clock, null);
        this.f16562h = zzcbVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX INFO: renamed from: a */
    public final void m6696a(final int i2) {
        int size;
        zzfsx zzfsxVar;
        boolean z = true;
        int size2 = 0;
        Preconditions.m3537a(i2 > 0);
        com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) this.f16559e.getAndUpdate(new UnaryOperator() { // from class: com.google.android.gms.internal.ads.zzfug
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                com.google.android.gms.ads.internal.client.zzfp zzfpVar2 = (com.google.android.gms.ads.internal.client.zzfp) obj;
                int i3 = i2;
                if (i3 <= 0) {
                    i3 = zzfpVar2.f3192v;
                }
                int i4 = i3;
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfpVar2.f3191u;
                return new com.google.android.gms.ads.internal.client.zzfp(zzfpVar2.f3189s, zzfpVar2.f3190t, zzmVar, i4, zzfpVar2.f3193w);
            }
        });
        AdFormat adFormatM2747b = AdFormat.m2747b(zzfpVar.f3190t);
        int i3 = zzfpVar.f3192v;
        Queue queue = this.f16564j;
        synchronized (queue) {
            try {
                size = queue.size();
                if (queue.size() <= i2) {
                    z = false;
                } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8019B)).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    while (size2 < i2) {
                        zzftw zzftwVar = (zzftw) queue.poll();
                        if (zzftwVar != null) {
                            arrayList.add(zzftwVar);
                        }
                        size2++;
                    }
                    queue.clear();
                    queue.addAll(arrayList);
                    size2 = arrayList.size();
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z && size > size2 && (zzfsxVar = this.f16560f) != null) {
            int i4 = size - size2;
            if (size2 == 0) {
                i4--;
            }
            zzfsxVar.m6647c(this, i4);
        }
        zzftn zzftnVar = this.f16571q;
        if (zzftnVar == null || adFormatM2747b == null) {
            return;
        }
        long jCurrentTimeMillis = this.f16572r.currentTimeMillis();
        zzftu zzftuVar = new zzftu(new zzftt(((com.google.android.gms.ads.internal.client.zzfp) this.f16559e.get()).f3189s, adFormatM2747b));
        zzdzs zzdzsVarM6111a = zzftnVar.f16499a.m6111a();
        zzdzsVarM6111a.m6107b("action", "cache_resize");
        zzdzsVarM6111a.m6107b("cs_ts", Long.toString(jCurrentTimeMillis));
        zzdzsVarM6111a.m6107b("orig_ma", Integer.toString(i3));
        zzdzsVarM6111a.m6107b("max_ads", Integer.toString(i2));
        zzdzsVarM6111a.m6107b(FirebaseAnalytics.Param.AD_FORMAT, zzftuVar.m6694a());
        zzdzsVarM6111a.m6107b("ad_unit_id", zzftuVar.f16520a);
        zzdzsVarM6111a.m6107b("pid", zzftuVar.f16522c);
        zzdzsVarM6111a.m6107b("pv", "1");
        zzdzsVarM6111a.m6108c();
    }

    /* JADX INFO: renamed from: b */
    public final void m6697b(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8104G)).booleanValue()) {
            Bundle bundle = zzmVar.f3226U;
            bundle.putInt("plcs", m6712t());
            bundle.putInt("plbs", m6711s());
            bundle.putString("plid", this.f16566l);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6698c(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.f16570p.get()) {
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzfuc(this, zzeVar));
        }
        this.f16567m.set(false);
        int i2 = zzeVar.f3106s;
        if (i2 != 1 && i2 != 8 && i2 != 10 && i2 != 11) {
            m6699d(true);
            return;
        }
        AtomicReference atomicReference = this.f16559e;
        int i3 = ((com.google.android.gms.ads.internal.client.zzfp) atomicReference.get()).f3190t;
        String str = ((com.google.android.gms.ads.internal.client.zzfp) atomicReference.get()).f3189s;
        int length = String.valueOf(i3).length();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + length + 26 + 61);
        sb.append("Preloading ");
        sb.append(i3);
        sb.append(", for adUnitId:");
        sb.append(str);
        sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String string = sb.toString();
        int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e(string);
        this.f16561g.set(false);
        zzfsx zzfsxVar = this.f16560f;
        if (zzfsxVar != null) {
            zzfsxVar.m6645a(this);
        }
        zzftt zzfttVar = new zzftt(((com.google.android.gms.ads.internal.client.zzfp) atomicReference.get()).f3189s, m6709q());
        zzfttVar.f16519c = this.f16566l;
        zzftu zzftuVar = new zzftu(zzfttVar);
        zzftn zzftnVar = this.f16571q;
        long jCurrentTimeMillis = this.f16572r.currentTimeMillis();
        int iM6711s = m6711s();
        int iM6712t = m6712t();
        String strM6702g = m6702g();
        zzdzs zzdzsVarM6111a = zzftnVar.f16499a.m6111a();
        zzdzsVarM6111a.m6107b("action", "pftla");
        zzdzsVarM6111a.m6107b("pftlat_ts", Long.toString(jCurrentTimeMillis));
        zzdzsVarM6111a.m6107b("pftlaec", Integer.toString(zzeVar.f3106s));
        zzdzsVarM6111a.m6107b(FirebaseAnalytics.Param.AD_FORMAT, zzftuVar.m6694a());
        zzdzsVarM6111a.m6107b("max_ads", Integer.toString(iM6711s));
        zzdzsVarM6111a.m6107b("cache_size", Integer.toString(iM6712t));
        zzdzsVarM6111a.m6107b("ad_unit_id", zzftuVar.f16520a);
        zzdzsVarM6111a.m6107b("pid", zzftuVar.f16522c);
        zzdzsVarM6111a.m6107b("pv", strM6702g);
        zzdzsVarM6111a.m6108c();
    }

    /* JADX INFO: renamed from: d */
    public final void m6699d(boolean z) {
        zzftg zzftgVar = this.f16565k;
        zzfsx zzfsxVar = this.f16560f;
        if (zzfsxVar != null) {
            if (z) {
                zzftgVar.m6666c();
            }
            zzfsxVar.m6645a(this);
        } else {
            if (zzftgVar.m6667d()) {
                return;
            }
            if (z) {
                zzftgVar.m6666c();
            }
            this.f16568n.schedule(new zzftz(this), zzftgVar.m6665b(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6700e() {
        boolean z;
        int i2;
        int i3;
        Queue queue = this.f16564j;
        synchronized (queue) {
            try {
                Iterator it = queue.iterator();
                z = false;
                i2 = 0;
                while (true) {
                    boolean z2 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzftw zzftwVar = (zzftw) it.next();
                    if (zzftwVar.f16525c.currentTimeMillis() < zzftwVar.f16524b + zzftwVar.f16526d) {
                        z2 = false;
                    }
                    if (z2) {
                        it.remove();
                        i2++;
                    }
                }
                if (i2 > 0 && queue.isEmpty()) {
                    z = true;
                }
                i3 = (i2 <= 0 || !queue.isEmpty()) ? i2 : i2 - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        zzfsx zzfsxVar = this.f16560f;
        if (zzfsxVar != null && i2 > 0) {
            zzfsxVar.m6647c(this, i3);
        }
        if (z) {
            m6701f();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6701f() {
        if (this.f16570p.get()) {
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzfud(this));
        }
        this.f16568n.execute(new zzfue(this));
    }

    /* JADX INFO: renamed from: g */
    public final String m6702g() {
        return true != "none".equals(this.f16566l) ? "2" : "1";
    }

    /* JADX INFO: renamed from: h */
    public abstract ListenableFuture mo6661h(Context context);

    /* JADX INFO: renamed from: i */
    public long mo6662i() {
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public abstract com.google.android.gms.ads.internal.client.zzdx mo6663j(Object obj);

    /* JADX INFO: renamed from: k */
    public final void m6703k() {
        AtomicBoolean atomicBoolean = this.f16567m;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!this.f16561g.get() || m6712t() >= ((com.google.android.gms.ads.internal.client.zzfp) this.f16559e.get()).f3192v) {
                atomicBoolean.set(false);
            } else {
                this.f16568n.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f16554s.m6715w();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m6704l() {
        boolean zIsEmpty;
        zzbio zzbioVar = zzbix.f8240O;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            this.f16565k.m6664a();
        }
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8121H)).booleanValue() && this.f16560f == null) {
            m6714v();
        } else {
            m6700e();
        }
        Queue queue = this.f16564j;
        synchronized (queue) {
            zIsEmpty = queue.isEmpty();
        }
        return !zIsEmpty;
    }

    /* JADX INFO: renamed from: m */
    public final Object m6705m() {
        final zzftw zzftwVar;
        final boolean z;
        final zzftw zzftwVar2;
        Queue queue = this.f16564j;
        final int iM6712t = m6712t();
        synchronized (queue) {
            try {
                zzftwVar = (zzftw) queue.poll();
                boolean z2 = false;
                if (zzftwVar != null && queue.isEmpty()) {
                    z2 = true;
                }
                z = z2;
                zzftwVar2 = (zzftwVar == null || queue.isEmpty()) ? null : (zzftw) queue.peek();
            } catch (Throwable th) {
                throw th;
            }
        }
        final long jCurrentTimeMillis = this.f16572r.currentTimeMillis();
        final int iM6711s = m6711s();
        final int iM6712t2 = m6712t();
        this.f16568n.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuf
            /* JADX WARN: Code duplicated, block: B:22:0x0083  */
            @Override // java.lang.Runnable
            public final void run() {
                zzful zzfulVar = this.f16542s;
                int i2 = iM6712t;
                zzftw zzftwVar3 = zzftwVar;
                zzftw zzftwVar4 = zzftwVar2;
                long j2 = jCurrentTimeMillis;
                int i3 = iM6711s;
                int i4 = iM6712t2;
                boolean z3 = z;
                zzbio zzbioVar = zzbix.f8274Q;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8257P)).booleanValue() || i2 == 1) {
                        zzfulVar.f16565k.m6664a();
                    }
                }
                if (zzftwVar3 != null && zzftwVar4 != null) {
                    AdFormat adFormatM2747b = AdFormat.m2747b(((com.google.android.gms.ads.internal.client.zzfp) zzfulVar.f16559e.get()).f3190t);
                    com.google.android.gms.ads.internal.client.zzdx zzdxVarMo6663j = zzfulVar.mo6663j(zzftwVar3.f16523a);
                    String str = !(zzdxVarMo6663j instanceof zzdcs) ? null : ((zzdcs) zzdxVarMo6663j).f12049v;
                    if (adFormatM2747b != null && str != null && zzftwVar4.f16524b < zzftwVar3.f16524b) {
                        zzfulVar.f16571q.m6684g("poll_ad", "psvroc_ts", j2, i3, i4, str, zzfulVar.f16573s, zzfulVar.m6702g());
                    }
                }
                final zzfsx zzfsxVar = zzfulVar.f16560f;
                if (zzfsxVar == null) {
                    long jMo6662i = zzfulVar.mo6662i();
                    if (jMo6662i < 0) {
                        jMo6662i = ((Long) zzbaVar.f3098c.m5030a(zzbix.f8340U)).longValue();
                    }
                    if (jMo6662i > 0) {
                        zzfulVar.f16568n.schedule(new zzftz(zzfulVar), jMo6662i, TimeUnit.MILLISECONDS);
                    } else {
                        zzfulVar.m6714v();
                    }
                } else if (!zzfsxVar.m6652i(zzfulVar)) {
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8404Y)).booleanValue()) {
                        zzfsxVar.m6651h(zzfulVar);
                    } else {
                        long jMo6662i2 = zzfulVar.mo6662i();
                        if (jMo6662i2 < 0) {
                            jMo6662i2 = ((Long) zzbaVar.f3098c.m5030a(zzbix.f8340U)).longValue();
                        }
                        if (jMo6662i2 > 0) {
                            zzfsxVar.m6651h(zzfulVar);
                            synchronized (zzfsxVar) {
                                zzfsxVar.f16448c = zzfsxVar.f16451f.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzfsx zzfsxVar2 = zzfsxVar;
                                        zzfsxVar2.f16447b.set(false);
                                        zzfsxVar2.m6655l();
                                    }
                                }, jMo6662i2, TimeUnit.MILLISECONDS);
                            }
                        } else {
                            zzfsxVar.m6645a(zzfulVar);
                        }
                    }
                }
                if (z3) {
                    zzfulVar.m6701f();
                }
            }
        });
        if (zzftwVar == null) {
            return null;
        }
        return zzftwVar.f16523a;
    }

    /* JADX INFO: renamed from: n */
    public final void m6706n() {
        this.f16561g.set(true);
        this.f16570p.set(true);
        zzfsx zzfsxVar = this.f16560f;
        if (zzfsxVar != null) {
            zzfsxVar.m6647c(this, 0);
        } else {
            this.f16568n.submit(new zzftz(this));
        }
    }

    /* JADX INFO: renamed from: o */
    public final String m6707o() {
        zzftw zzftwVar;
        Queue queue = this.f16564j;
        synchronized (queue) {
            zzftwVar = (zzftw) queue.peek();
        }
        Object obj = zzftwVar == null ? null : zzftwVar.f16523a;
        com.google.android.gms.ads.internal.client.zzdx zzdxVarMo6663j = obj == null ? null : mo6663j(obj);
        if (zzdxVarMo6663j instanceof zzdcs) {
            return ((zzdcs) zzdxVarMo6663j).f12049v;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m6708p(int i2) {
        Preconditions.m3537a(i2 >= 5);
        zzftg zzftgVar = this.f16565k;
        synchronized (zzftgVar) {
            Preconditions.m3537a(i2 > 0);
            zzftgVar.f16479d = i2;
        }
    }

    /* JADX INFO: renamed from: q */
    public final AdFormat m6709q() {
        return AdFormat.m2747b(((com.google.android.gms.ads.internal.client.zzfp) this.f16559e.get()).f3190t);
    }

    /* JADX INFO: renamed from: r */
    public final String m6710r() {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.f16559e.get()).f3189s;
    }

    /* JADX INFO: renamed from: s */
    public final int m6711s() {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.f16559e.get()).f3192v;
    }

    /* JADX INFO: renamed from: t */
    public final int m6712t() {
        int size;
        Queue queue = this.f16564j;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m6713u() {
        long jCurrentTimeMillis;
        long j2;
        if (!this.f16561g.get() || this.f16567m.get() || m6712t() >= m6711s()) {
            return false;
        }
        zzftg zzftgVar = this.f16565k;
        synchronized (zzftgVar) {
            jCurrentTimeMillis = zzftgVar.f16481f.currentTimeMillis();
            j2 = zzftgVar.f16480e;
        }
        return jCurrentTimeMillis >= j2 && !zzftgVar.m6667d();
    }

    /* JADX INFO: renamed from: v */
    public final void m6714v() {
        m6700e();
        AtomicBoolean atomicBoolean = this.f16567m;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!this.f16561g.get() || m6712t() >= ((com.google.android.gms.ads.internal.client.zzfp) this.f16559e.get()).f3192v) {
                atomicBoolean.set(false);
            } else {
                m6715w();
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m6715w() {
        ListenableFuture listenableFutureMo6661h;
        Activity activityM4854d = com.google.android.gms.ads.internal.zzt.f3698C.f3707g.m4854d();
        if (activityM4854d == null) {
            String strValueOf = String.valueOf(((com.google.android.gms.ads.internal.client.zzfp) this.f16559e.get()).f3189s);
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Empty activity context at preloading: ".concat(strValueOf));
            listenableFutureMo6661h = mo6661h(this.f16556b);
        } else {
            listenableFutureMo6661h = mo6661h(activityM4854d);
        }
        ((zzhay) listenableFutureMo6661h).addListener(new zzhcd(listenableFutureMo6661h, new zzftx(this)), this.f16568n);
    }

    public zzful(String str, ClientApi clientApi, Context context, int i2, zzfmc zzfmcVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, Clock clock, zzfsx zzfsxVar) {
        this(str, clientApi, context, i2, zzfmcVar, zzfpVar, scheduledExecutorService, zzfowVar, zzftgVar, clock, zzfsxVar);
        this.f16563i = zzceVar;
    }

    public zzful(String str, ClientApi clientApi, Context context, int i2, zzfmc zzfmcVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, Clock clock, zzfsx zzfsxVar) {
        Queue priorityQueue;
        this.f16566l = str;
        this.f16555a = clientApi;
        this.f16556b = context;
        this.f16557c = i2;
        this.f16558d = zzfmcVar;
        AtomicReference atomicReference = new AtomicReference(zzfpVar);
        this.f16559e = atomicReference;
        int iMax = Math.max(1, zzfpVar.f3192v);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8539g0)).booleanValue()) {
            priorityQueue = new zzfuo();
        } else {
            priorityQueue = new PriorityQueue(iMax, new Comparator() { // from class: com.google.android.gms.internal.ads.zzfuh
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    zzftw zzftwVar = (zzftw) obj2;
                    zzftw zzftwVar2 = (zzftw) obj;
                    int iCompare = Double.compare(zzftwVar.f16527e, zzftwVar2.f16527e);
                    return iCompare == 0 ? Long.compare(zzftwVar2.f16524b, zzftwVar.f16524b) : iCompare;
                }
            });
        }
        this.f16564j = priorityQueue;
        this.f16561g = new AtomicBoolean(true);
        this.f16567m = new AtomicBoolean(false);
        this.f16568n = scheduledExecutorService;
        this.f16569o = zzfowVar;
        this.f16565k = zzftgVar;
        this.f16570p = new AtomicBoolean(true);
        this.f16572r = clock;
        zzftt zzfttVar = new zzftt(zzfpVar.f3189s, AdFormat.m2747b(((com.google.android.gms.ads.internal.client.zzfp) atomicReference.get()).f3190t));
        zzfttVar.f16519c = str;
        this.f16573s = new zzftu(zzfttVar);
        this.f16560f = zzfsxVar;
    }
}
