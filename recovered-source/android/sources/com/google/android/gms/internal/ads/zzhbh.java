package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzhbh extends zzhbl {

    /* JADX INFO: renamed from: G */
    public static final zzhcn f18489G = new zzhcn(zzhbh.class);

    /* JADX INFO: renamed from: D */
    public zzgwp f18490D;

    /* JADX INFO: renamed from: E */
    public final boolean f18491E;

    /* JADX INFO: renamed from: F */
    public final boolean f18492F;

    public zzhbh(zzgwp zzgwpVar, boolean z, boolean z2) {
        int size = zzgwpVar.size();
        this.f18498z = null;
        this.f18497A = size;
        this.f18490D = zzgwpVar;
        this.f18491E = z;
        this.f18492F = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    /* JADX INFO: renamed from: e */
    public final void mo6897e() {
        zzgwp zzgwpVar = this.f18490D;
        mo7344q(1);
        if ((zzgwpVar != null) && isCancelled()) {
            boolean zM7323k = m7323k();
            zzgzh it = zzgwpVar.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(zM7323k);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    /* JADX INFO: renamed from: f */
    public final String mo6898f() {
        zzgwp zzgwpVar = this.f18490D;
        return zzgwpVar != null ? "futures=".concat(zzgwpVar.toString()) : super.mo6898f();
    }

    /* JADX INFO: renamed from: q */
    public void mo7344q(int i2) {
        this.f18490D = null;
    }

    /* JADX INFO: renamed from: r */
    public final void m7345r(int i2, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.f18490D = null;
                cancel(false);
            } else {
                try {
                    mo7349v(i2, zzhdg.m7390a(listenableFuture));
                } catch (ExecutionException e) {
                    m7346s(e.getCause());
                } catch (Throwable th) {
                    m7346s(th);
                }
            }
        } finally {
            m7347t(null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m7346s(Throwable th) {
        th.getClass();
        if (this.f18491E && !m7321d(th)) {
            Set set = this.f18498z;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!isCancelled()) {
                    Throwable thMo7319a = mo7319a();
                    Objects.requireNonNull(thMo7319a);
                    while (thMo7319a != null && setNewSetFromMap.add(thMo7319a)) {
                        thMo7319a = thMo7319a.getCause();
                    }
                }
                zzhbl.f18495B.mo7351a(this, setNewSetFromMap);
                set = this.f18498z;
                Objects.requireNonNull(set);
            }
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    f18489G.m7383a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
                    return;
                } else if (!set.add(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
        }
        boolean z = th instanceof Error;
        if (z) {
            f18489G.m7383a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m7347t(zzgwp zzgwpVar) {
        int iMo7352b = zzhbl.f18495B.mo7352b(this);
        int i2 = 0;
        zzgtr.m7134g("Less than 0 remaining futures", iMo7352b >= 0);
        if (iMo7352b == 0) {
            if (zzgwpVar != null) {
                zzgzh it = zzgwpVar.iterator();
                while (it.hasNext()) {
                    ListenableFuture listenableFuture = (ListenableFuture) it.next();
                    if (!listenableFuture.isCancelled()) {
                        try {
                            mo7349v(i2, zzhdg.m7390a(listenableFuture));
                        } catch (ExecutionException e) {
                            m7346s(e.getCause());
                        } catch (Throwable th) {
                            m7346s(th);
                        }
                    }
                    i2++;
                }
            }
            this.f18498z = null;
            mo7350w();
            mo7344q(2);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m7348u() {
        Objects.requireNonNull(this.f18490D);
        if (this.f18490D.isEmpty()) {
            mo7350w();
            return;
        }
        boolean z = this.f18491E;
        zzhbu zzhbuVar = zzhbu.f18506s;
        if (z) {
            zzgzh it = this.f18490D.iterator();
            final int i2 = 0;
            while (it.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) it.next();
                int i3 = i2 + 1;
                if (listenableFuture.isDone()) {
                    m7345r(i2, listenableFuture);
                } else {
                    listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhbg
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f18486s.m7345r(i2, listenableFuture);
                        }
                    }, zzhbuVar);
                }
                i2 = i3;
            }
            return;
        }
        zzgwp zzgwpVar = this.f18490D;
        final zzgwp zzgwpVar2 = true != this.f18492F ? null : zzgwpVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzhbf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18484s.m7347t(zzgwpVar2);
            }
        };
        zzgzh it2 = zzgwpVar.iterator();
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            if (listenableFuture2.isDone()) {
                m7347t(zzgwpVar2);
            } else {
                listenableFuture2.addListener(runnable, zzhbuVar);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo7349v(int i2, Object obj);

    /* JADX INFO: renamed from: w */
    public abstract void mo7350w();
}
