package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzna extends zziy {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f20486k = 0;

    /* JADX INFO: renamed from: d */
    public final int f20487d;

    /* JADX INFO: renamed from: e */
    public final int f20488e;

    /* JADX INFO: renamed from: f */
    public final int[] f20489f;

    /* JADX INFO: renamed from: g */
    public final int[] f20490g;

    /* JADX INFO: renamed from: h */
    public final zzbf[] f20491h;

    /* JADX INFO: renamed from: i */
    public final Object[] f20492i;

    /* JADX INFO: renamed from: j */
    public final HashMap f20493j;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzna(List list, zzzg zzzgVar) {
        zzbf[] zzbfVarArr = new zzbf[list.size()];
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            zzbfVarArr[i3] = ((zzmi) it.next()).zzb();
            i3++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i2] = ((zzmi) it2.next()).zza();
            i2++;
        }
        this(zzbfVarArr, objArr, zzzgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: a */
    public final int mo4735a() {
        return this.f20487d;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: c */
    public final int mo4737c() {
        return this.f20488e;
    }

    @Override // com.google.android.gms.internal.ads.zziy
    /* JADX INFO: renamed from: p */
    public final int mo8571p(int i2) {
        return zzfm.m6516r(this.f20489f, i2 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zziy
    /* JADX INFO: renamed from: q */
    public final int mo8572q(int i2) {
        return zzfm.m6516r(this.f20490g, i2 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zziy
    /* JADX INFO: renamed from: r */
    public final int mo8573r(Object obj) {
        Integer num = (Integer) this.f20493j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zziy
    /* JADX INFO: renamed from: s */
    public final zzbf mo8574s(int i2) {
        return this.f20491h[i2];
    }

    @Override // com.google.android.gms.internal.ads.zziy
    /* JADX INFO: renamed from: t */
    public final int mo8575t(int i2) {
        return this.f20489f[i2];
    }

    @Override // com.google.android.gms.internal.ads.zziy
    /* JADX INFO: renamed from: u */
    public final int mo8576u(int i2) {
        return this.f20490g[i2];
    }

    @Override // com.google.android.gms.internal.ads.zziy
    /* JADX INFO: renamed from: v */
    public final Object mo8577v(int i2) {
        return this.f20492i[i2];
    }

    public zzna(zzbf[] zzbfVarArr, Object[] objArr, zzzg zzzgVar) {
        super(zzzgVar);
        this.f20491h = zzbfVarArr;
        int length = zzbfVarArr.length;
        this.f20489f = new int[length];
        this.f20490g = new int[length];
        this.f20492i = objArr;
        this.f20493j = new HashMap();
        int i2 = 0;
        int iMo4735a = 0;
        int iMo4737c = 0;
        int i3 = 0;
        while (i2 < zzbfVarArr.length) {
            zzbf zzbfVar = zzbfVarArr[i2];
            this.f20491h[i3] = zzbfVar;
            this.f20490g[i3] = iMo4735a;
            this.f20489f[i3] = iMo4737c;
            iMo4735a += zzbfVar.mo4735a();
            iMo4737c += this.f20491h[i3].mo4737c();
            this.f20493j.put(objArr[i3], Integer.valueOf(i3));
            i2++;
            i3++;
        }
        this.f20487d = iMo4735a;
        this.f20488e = iMo4737c;
    }
}
