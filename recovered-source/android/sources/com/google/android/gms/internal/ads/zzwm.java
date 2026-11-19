package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzwm implements zzxn {

    /* JADX INFO: renamed from: a */
    public final ArrayList f21216a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public final HashSet f21217b = new HashSet(1);

    /* JADX INFO: renamed from: c */
    public final zzxv f21218c = new zzxv();

    /* JADX INFO: renamed from: d */
    public final zzul f21219d = new zzul();

    /* JADX INFO: renamed from: e */
    public Looper f21220e;

    /* JADX INFO: renamed from: f */
    public zzbf f21221f;

    /* JADX INFO: renamed from: g */
    public zzqh f21222g;

    /* JADX INFO: renamed from: h */
    public zzabr f21223h;

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: A */
    public final void mo8979A(zzxw zzxwVar) {
        CopyOnWriteArrayList<zzxo> copyOnWriteArrayList = this.f21218c.f21305b;
        for (zzxo zzxoVar : copyOnWriteArrayList) {
            if (zzxoVar.f21284b == zzxwVar) {
                copyOnWriteArrayList.remove(zzxoVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: B */
    public final void mo8980B(Handler handler, zzum zzumVar) {
        zzul zzulVar = this.f21219d;
        zzulVar.getClass();
        zzulVar.f21007b.add(new zzuk(zzumVar));
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: C */
    public final void mo8981C(zzxm zzxmVar, zzqh zzqhVar, zzabr zzabrVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f21220e;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        zzgtr.m7128a(z);
        this.f21222g = zzqhVar;
        this.f21223h = zzabrVar;
        zzbf zzbfVar = this.f21221f;
        this.f21216a.add(zzxmVar);
        if (this.f21220e == null) {
            this.f21220e = looperMyLooper;
            this.f21217b.add(zzxmVar);
            mo8986b(zzabrVar.mo3932a());
        } else if (zzbfVar != null) {
            mo8982D(zzxmVar);
            zzxmVar.mo8742a(this, zzbfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: D */
    public final void mo8982D(zzxm zzxmVar) {
        this.f21220e.getClass();
        HashSet hashSet = this.f21217b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzxmVar);
        if (zIsEmpty) {
            mo8985a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: E */
    public final void mo8983E(Handler handler, zzxw zzxwVar) {
        zzxv zzxvVar = this.f21218c;
        zzxvVar.getClass();
        zzxvVar.f21305b.add(new zzxo(handler, zzxwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: F */
    public final void mo8984F(zzum zzumVar) {
        CopyOnWriteArrayList<zzuk> copyOnWriteArrayList = this.f21219d.f21007b;
        for (zzuk zzukVar : copyOnWriteArrayList) {
            if (zzukVar.f21005a == zzumVar) {
                copyOnWriteArrayList.remove(zzukVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo8985a() {
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo8986b(zzip zzipVar);

    /* JADX INFO: renamed from: c */
    public void mo8987c() {
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo8988d();

    /* JADX INFO: renamed from: e */
    public final void m8989e(zzbf zzbfVar) {
        this.f21221f = zzbfVar;
        ArrayList arrayList = this.f21216a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzxm) arrayList.get(i2)).mo8742a(this, zzbfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: v */
    public final void mo8990v(zzxm zzxmVar) {
        ArrayList arrayList = this.f21216a;
        arrayList.remove(zzxmVar);
        if (!arrayList.isEmpty()) {
            mo8991w(zzxmVar);
            return;
        }
        this.f21220e = null;
        this.f21221f = null;
        this.f21222g = null;
        this.f21217b.clear();
        mo8988d();
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: w */
    public final void mo8991w(zzxm zzxmVar) {
        HashSet hashSet = this.f21217b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(zzxmVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo8987c();
    }
}
