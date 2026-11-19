package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
final class zzmt {

    /* JADX INFO: renamed from: a */
    public final zzqh f20443a;

    /* JADX INFO: renamed from: b */
    public final zzabr f20444b;

    /* JADX INFO: renamed from: f */
    public final zzms f20448f;

    /* JADX INFO: renamed from: i */
    public final zzno f20451i;

    /* JADX INFO: renamed from: j */
    public final zzea f20452j;

    /* JADX INFO: renamed from: k */
    public boolean f20453k;

    /* JADX INFO: renamed from: l */
    public zzzg f20454l = new zzzg();

    /* JADX INFO: renamed from: d */
    public final IdentityHashMap f20446d = new IdentityHashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f20447e = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f20445c = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final HashMap f20449g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final HashSet f20450h = new HashSet();

    public zzmt(zzms zzmsVar, zzno zznoVar, zzea zzeaVar, zzqh zzqhVar, zzabr zzabrVar) {
        this.f20443a = zzqhVar;
        this.f20444b = zzabrVar;
        this.f20448f = zzmsVar;
        this.f20451i = zznoVar;
        this.f20452j = zzeaVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzbf m8743a(int i2, List list, int i3) {
        ArrayList arrayList = this.f20445c;
        zzgtr.m7128a(i2 >= 0 && i2 <= i3 && i3 <= arrayList.size());
        zzgtr.m7128a(list.size() == i3 - i2);
        for (int i4 = i2; i4 < i3; i4++) {
            ((zzmq) arrayList.get(i4)).f20437a.mo9021x((zzak) list.get(i4 - i2));
        }
        return m8746d();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8744b() {
        return this.f20453k;
    }

    /* JADX INFO: renamed from: c */
    public final void m8745c() {
        zzgtr.m7133f(!this.f20453k);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f20445c;
            if (i2 >= arrayList.size()) {
                this.f20453k = true;
                return;
            }
            zzmq zzmqVar = (zzmq) arrayList.get(i2);
            m8754l(zzmqVar);
            this.f20450h.add(zzmqVar);
            i2++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final zzbf m8746d() {
        ArrayList arrayList = this.f20445c;
        if (arrayList.isEmpty()) {
            return zzbf.f7725a;
        }
        int iMo4735a = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            zzmq zzmqVar = (zzmq) arrayList.get(i2);
            zzmqVar.f20440d = iMo4735a;
            iMo4735a += zzmqVar.f20437a.f21269o.f21246b.mo4735a();
        }
        return new zzna(arrayList, this.f20454l);
    }

    /* JADX INFO: renamed from: e */
    public final zzbf m8747e(List list, zzzg zzzgVar) {
        ArrayList arrayList = this.f20445c;
        m8753k(0, arrayList.size());
        return m8748f(arrayList.size(), list, zzzgVar);
    }

    /* JADX INFO: renamed from: f */
    public final zzbf m8748f(int i2, List list, zzzg zzzgVar) {
        if (!list.isEmpty()) {
            this.f20454l = zzzgVar;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                zzmq zzmqVar = (zzmq) list.get(i3 - i2);
                ArrayList arrayList = this.f20445c;
                if (i3 > 0) {
                    zzmq zzmqVar2 = (zzmq) arrayList.get(i3 - 1);
                    zzmqVar.f20440d = zzmqVar2.f20437a.f21269o.f21246b.mo4735a() + zzmqVar2.f20440d;
                    zzmqVar.f20441e = false;
                    zzmqVar.f20439c.clear();
                } else {
                    zzmqVar.f20440d = 0;
                    zzmqVar.f20441e = false;
                    zzmqVar.f20439c.clear();
                }
                int iMo4735a = zzmqVar.f20437a.f21269o.f21246b.mo4735a();
                for (int i4 = i3; i4 < arrayList.size(); i4++) {
                    ((zzmq) arrayList.get(i4)).f20440d += iMo4735a;
                }
                arrayList.add(i3, zzmqVar);
                this.f20447e.put(zzmqVar.f20438b, zzmqVar);
                if (this.f20453k) {
                    m8754l(zzmqVar);
                    if (this.f20446d.isEmpty()) {
                        this.f20450h.add(zzmqVar);
                    } else {
                        zzmp zzmpVar = (zzmp) this.f20449g.get(zzmqVar);
                        if (zzmpVar != null) {
                            zzmpVar.f20434a.mo8991w(zzmpVar.f20435b);
                        }
                    }
                }
            }
        }
        return m8746d();
    }

    /* JADX INFO: renamed from: g */
    public final zzbf m8749g(int i2, int i3, zzzg zzzgVar) {
        boolean z = false;
        if (i2 >= 0 && i2 <= i3 && i3 <= this.f20445c.size()) {
            z = true;
        }
        zzgtr.m7128a(z);
        this.f20454l = zzzgVar;
        m8753k(i2, i3);
        return m8746d();
    }

    /* JADX INFO: renamed from: h */
    public final zzbf m8750h() {
        zzgtr.m7128a(this.f20445c.size() >= 0);
        this.f20454l = null;
        return m8746d();
    }

    /* JADX INFO: renamed from: i */
    public final zzbf m8751i(zzzg zzzgVar) {
        int size = this.f20445c.size();
        if (zzzgVar.f21471b.length != size) {
            zzzgVar = new zzzg(new Random(zzzgVar.f21470a.nextLong())).m9064a(size);
        }
        this.f20454l = zzzgVar;
        return m8746d();
    }

    /* JADX INFO: renamed from: j */
    public final void m8752j() {
        Iterator it = this.f20450h.iterator();
        while (it.hasNext()) {
            zzmq zzmqVar = (zzmq) it.next();
            if (zzmqVar.f20439c.isEmpty()) {
                zzmp zzmpVar = (zzmp) this.f20449g.get(zzmqVar);
                if (zzmpVar != null) {
                    zzmpVar.f20434a.mo8991w(zzmpVar.f20435b);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m8753k(int i2, int i3) {
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            }
            ArrayList arrayList = this.f20445c;
            zzmq zzmqVar = (zzmq) arrayList.remove(i3);
            this.f20447e.remove(zzmqVar.f20438b);
            int i4 = -zzmqVar.f20437a.f21269o.f21246b.mo4735a();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((zzmq) arrayList.get(i5)).f20440d += i4;
            }
            zzmqVar.f20441e = true;
            if (this.f20453k) {
                m8755m(zzmqVar);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8754l(zzmq zzmqVar) {
        zzxg zzxgVar = zzmqVar.f20437a;
        zzxm zzxmVar = new zzxm() { // from class: com.google.android.gms.internal.ads.zzmr
            @Override // com.google.android.gms.internal.ads.zzxm
            /* JADX INFO: renamed from: a */
            public final void mo8742a(zzwm zzwmVar, zzbf zzbfVar) {
                zzea zzeaVar = ((zzlw) this.f20442a.f20448f).f20348y;
                zzeaVar.mo6115E(2);
                zzeaVar.mo6125l(22);
            }
        };
        zzmo zzmoVar = new zzmo(this, zzmqVar);
        this.f20449g.put(zzmqVar, new zzmp(zzxgVar, zzxmVar, zzmoVar));
        String str = zzfm.f16091a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        zzxgVar.mo8983E(new Handler(looperMyLooper, null), zzmoVar);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        zzxgVar.mo8980B(new Handler(looperMyLooper2, null), zzmoVar);
        zzxgVar.mo8981C(zzxmVar, this.f20443a, this.f20444b);
    }

    /* JADX INFO: renamed from: m */
    public final void m8755m(zzmq zzmqVar) {
        if (zzmqVar.f20441e && zzmqVar.f20439c.isEmpty()) {
            zzmp zzmpVar = (zzmp) this.f20449g.remove(zzmqVar);
            zzmpVar.getClass();
            zzxn zzxnVar = zzmpVar.f20434a;
            zzxnVar.mo8990v(zzmpVar.f20435b);
            zzmo zzmoVar = zzmpVar.f20436c;
            zzxnVar.mo8979A(zzmoVar);
            zzxnVar.mo8984F(zzmoVar);
            this.f20450h.remove(zzmqVar);
        }
    }
}
