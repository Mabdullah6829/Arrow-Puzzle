package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyc extends zzwt {

    /* JADX INFO: renamed from: r */
    public static final zzak f21319r;

    /* JADX INFO: renamed from: k */
    public final zzxn[] f21320k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f21321l;

    /* JADX INFO: renamed from: m */
    public final zzbf[] f21322m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f21323n;

    /* JADX INFO: renamed from: o */
    public int f21324o = -1;

    /* JADX INFO: renamed from: p */
    public long[][] f21325p;

    /* JADX INFO: renamed from: q */
    public zzya f21326q;

    static {
        zzz zzzVar = new zzz();
        zzzVar.f21433a = "MergingMediaSource";
        f21319r = zzzVar.m9054a();
    }

    public zzyc(zzww zzwwVar, zzxn... zzxnVarArr) {
        this.f21320k = zzxnVarArr;
        this.f21323n = new ArrayList(Arrays.asList(zzxnVarArr));
        this.f21321l = new ArrayList(zzxnVarArr.length);
        int i2 = 0;
        while (true) {
            int length = zzxnVarArr.length;
            if (i2 >= length) {
                this.f21322m = new zzbf[length];
                this.f21325p = new long[0][];
                new HashMap();
                zzgyc zzgycVar = new zzgyc();
                new zzgyg(zzgycVar);
                new zzgyj(zzgycVar.mo7262a(), new zzgye());
                return;
            }
            this.f21321l.add(new ArrayList());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: J */
    public final zzak mo9026J() {
        zzxn[] zzxnVarArr = this.f21320k;
        return zzxnVarArr.length > 0 ? zzxnVarArr[0].mo9026J() : f21319r;
    }

    @Override // com.google.android.gms.internal.ads.zzwt, com.google.android.gms.internal.ads.zzwm
    /* JADX INFO: renamed from: b */
    public final void mo8986b(zzip zzipVar) {
        super.mo8986b(zzipVar);
        int i2 = 0;
        while (true) {
            zzxn[] zzxnVarArr = this.f21320k;
            if (i2 >= zzxnVarArr.length) {
                return;
            }
            m8999g(Integer.valueOf(i2), zzxnVarArr[i2]);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwt, com.google.android.gms.internal.ads.zzwm
    /* JADX INFO: renamed from: d */
    public final void mo8988d() {
        super.mo8988d();
        Arrays.fill(this.f21322m, (Object) null);
        this.f21324o = -1;
        this.f21326q = null;
        ArrayList arrayList = this.f21323n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f21320k);
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    /* JADX INFO: renamed from: f */
    public final void mo8998f(Object obj, zzwm zzwmVar, zzbf zzbfVar) {
        int iMo4737c;
        Integer num = (Integer) obj;
        if (this.f21326q != null) {
            return;
        }
        if (this.f21324o == -1) {
            iMo4737c = zzbfVar.mo4737c();
            this.f21324o = iMo4737c;
        } else {
            int iMo4737c2 = zzbfVar.mo4737c();
            int i2 = this.f21324o;
            if (iMo4737c2 != i2) {
                this.f21326q = new zzya();
                return;
            }
            iMo4737c = i2;
        }
        int length = this.f21325p.length;
        zzbf[] zzbfVarArr = this.f21322m;
        if (length == 0) {
            this.f21325p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iMo4737c, zzbfVarArr.length);
        }
        ArrayList arrayList = this.f21323n;
        arrayList.remove(zzwmVar);
        zzbfVarArr[num.intValue()] = zzbfVar;
        if (arrayList.isEmpty()) {
            m8989e(zzbfVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ zzxl mo9001i(Object obj, zzxl zzxlVar) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f21321l;
        List list = (List) arrayList.get(iIntValue);
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((zzyb) list.get(i2)).f21317a.equals(zzxlVar)) {
                return ((zzyb) ((List) arrayList.get(0)).get(i2)).f21317a;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwt, com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: k */
    public final void mo9003k() throws zzya {
        zzya zzyaVar = this.f21326q;
        if (zzyaVar != null) {
            throw zzyaVar;
        }
        super.mo9003k();
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: x */
    public final void mo9021x(zzak zzakVar) {
        this.f21320k[0].mo9021x(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: y */
    public final zzxj mo9022y(zzxl zzxlVar, zzabm zzabmVar, long j2) {
        zzxn[] zzxnVarArr = this.f21320k;
        int length = zzxnVarArr.length;
        zzxj[] zzxjVarArr = new zzxj[length];
        zzbf[] zzbfVarArr = this.f21322m;
        int iMo4739e = zzbfVarArr[0].mo4739e(zzxlVar.f21278a);
        for (int i2 = 0; i2 < length; i2++) {
            zzxl zzxlVarM9024a = zzxlVar.m9024a(zzbfVarArr[i2].mo4740f(iMo4739e));
            zzxjVarArr[i2] = zzxnVarArr[i2].mo9022y(zzxlVarM9024a, zzabmVar, j2 - this.f21325p[iMo4739e][i2]);
            ((List) this.f21321l.get(i2)).add(new zzyb(zzxlVarM9024a, zzxjVarArr[i2]));
        }
        return new zzxz(this.f21325p[iMo4739e], zzxjVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: z */
    public final void mo9023z(zzxj zzxjVar) {
        zzxz zzxzVar = (zzxz) zzxjVar;
        int i2 = 0;
        while (true) {
            zzxn[] zzxnVarArr = this.f21320k;
            if (i2 >= zzxnVarArr.length) {
                return;
            }
            List list = (List) this.f21321l.get(i2);
            zzxj[] zzxjVarArr = zzxzVar.f21309s;
            boolean[] zArr = zzxzVar.f21310t;
            zzxj zzxjVar2 = zArr[i2] ? ((zzzl) zzxjVarArr[i2]).f21485s : zzxjVarArr[i2];
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (((zzyb) list.get(i3)).f21318b.equals(zzxjVar2)) {
                    list.remove(i3);
                    break;
                }
            }
            zzxn zzxnVar = zzxnVarArr[i2];
            zzxj[] zzxjVarArr2 = zzxzVar.f21309s;
            zzxnVar.mo9023z(zArr[i2] ? ((zzzl) zzxjVarArr2[i2]).f21485s : zzxjVarArr2[i2]);
            i2++;
        }
    }
}
