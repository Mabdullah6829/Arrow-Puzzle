package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzmo implements zzxw, zzum {

    /* JADX INFO: renamed from: a */
    public final zzmq f20432a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzmt f20433b;

    public zzmo(zzmt zzmtVar, zzmq zzmqVar) {
        this.f20433b = zzmtVar;
        this.f20432a = zzmqVar;
    }

    /* JADX INFO: renamed from: a */
    public final Pair m8736a(zzxl zzxlVar) {
        zzxl zzxlVarM9024a;
        zzmq zzmqVar = this.f20432a;
        zzxl zzxlVar2 = null;
        if (zzxlVar != null) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = zzmqVar.f20439c;
                if (i2 >= arrayList.size()) {
                    zzxlVarM9024a = null;
                    break;
                }
                if (((zzxl) arrayList.get(i2)).f21281d == zzxlVar.f21281d) {
                    Object obj = zzxlVar.f21278a;
                    Object obj2 = zzmqVar.f20438b;
                    int i3 = zzna.f20486k;
                    zzxlVarM9024a = zzxlVar.m9024a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (zzxlVarM9024a == null) {
                return null;
            }
            zzxlVar2 = zzxlVarM9024a;
        }
        return Pair.create(Integer.valueOf(zzmqVar.f20440d), zzxlVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: e */
    public final void mo8737e(int i2, zzxl zzxlVar, final zzxh zzxhVar) {
        final Pair pairM8736a = m8736a(zzxlVar);
        if (pairM8736a != null) {
            this.f20433b.f20452j.mo6122g(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairM8736a;
                    this.f20424s.f20433b.f20451i.mo8737e(((Integer) pair.first).intValue(), (zzxl) pair.second, zzxhVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: g */
    public final void mo8738g(int i2, zzxl zzxlVar, final zzxc zzxcVar, final zzxh zzxhVar) {
        final Pair pairM8736a = m8736a(zzxlVar);
        if (pairM8736a != null) {
            this.f20433b.f20452j.mo6122g(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairM8736a;
                    this.f20410s.f20433b.f20451i.mo8738g(((Integer) pair.first).intValue(), (zzxl) pair.second, zzxcVar, zzxhVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: j */
    public final void mo8739j(int i2, zzxl zzxlVar, final zzxc zzxcVar, final zzxh zzxhVar) {
        final Pair pairM8736a = m8736a(zzxlVar);
        if (pairM8736a != null) {
            this.f20433b.f20452j.mo6122g(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairM8736a;
                    this.f20414s.f20433b.f20451i.mo8739j(((Integer) pair.first).intValue(), (zzxl) pair.second, zzxcVar, zzxhVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: l */
    public final void mo8740l(int i2, zzxl zzxlVar, final zzxc zzxcVar, final zzxh zzxhVar, final IOException iOException, final boolean z) {
        final Pair pairM8736a = m8736a(zzxlVar);
        if (pairM8736a != null) {
            this.f20433b.f20452j.mo6122g(new Runnable() { // from class: com.google.android.gms.internal.ads.zzml
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairM8736a;
                    int iIntValue = ((Integer) pair.first).intValue();
                    zzxl zzxlVar2 = (zzxl) pair.second;
                    this.f20418s.f20433b.f20451i.mo8740l(iIntValue, zzxlVar2, zzxcVar, zzxhVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: p */
    public final void mo8741p(int i2, zzxl zzxlVar, final zzxc zzxcVar, final zzxh zzxhVar, final int i3) {
        final Pair pairM8736a = m8736a(zzxlVar);
        if (pairM8736a != null) {
            this.f20433b.f20452j.mo6122g(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairM8736a;
                    int iIntValue = ((Integer) pair.first).intValue();
                    zzxl zzxlVar2 = (zzxl) pair.second;
                    this.f20427s.f20433b.f20451i.mo8741p(iIntValue, zzxlVar2, zzxcVar, zzxhVar, i3);
                }
            });
        }
    }
}
