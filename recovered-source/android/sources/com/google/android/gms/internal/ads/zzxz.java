package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzxz implements zzxj, zzxi {

    /* JADX INFO: renamed from: A */
    public zzwv f21308A;

    /* JADX INFO: renamed from: s */
    public final zzxj[] f21309s;

    /* JADX INFO: renamed from: t */
    public final boolean[] f21310t;

    /* JADX INFO: renamed from: u */
    public final IdentityHashMap f21311u;

    /* JADX INFO: renamed from: v */
    public final ArrayList f21312v = new ArrayList();

    /* JADX INFO: renamed from: w */
    public final HashMap f21313w = new HashMap();

    /* JADX INFO: renamed from: x */
    public Object f21314x;

    /* JADX INFO: renamed from: y */
    public zzzo f21315y;

    /* JADX INFO: renamed from: z */
    public zzxj[] f21316z;

    public zzxz(long[] jArr, zzxj... zzxjVarArr) {
        this.f21309s = zzxjVarArr;
        zzgzi zzgziVar = zzgwt.f18303t;
        zzgwt zzgwtVar = zzgyo.f18355w;
        this.f21308A = new zzwv(zzgwtVar, zzgwtVar);
        this.f21311u = new IdentityHashMap();
        this.f21316z = new zzxj[0];
        this.f21310t = new boolean[zzxjVarArr.length];
        for (int i2 = 0; i2 < zzxjVarArr.length; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                this.f21310t[i2] = true;
                this.f21309s[i2] = new zzzl(zzxjVarArr[i2], j2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: a */
    public final boolean mo9004a() {
        return this.f21308A.mo9004a();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: b */
    public final void mo9005b(long j2) {
        this.f21308A.mo9005b(j2);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.zzze, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzze
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8668c(zzzf zzzfVar) {
        ?? r1 = this.f21314x;
        r1.getClass();
        r1.mo8668c(this);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.zzxi, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzxi
    /* JADX INFO: renamed from: d */
    public final void mo8669d(zzxj zzxjVar) {
        zzxj[] zzxjVarArr;
        ArrayList arrayList = this.f21312v;
        arrayList.remove(zzxjVar);
        if (arrayList.isEmpty()) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                zzxjVarArr = this.f21309s;
                if (i2 >= zzxjVarArr.length) {
                    break;
                }
                i3 += zzxjVarArr[i2].mo9009g().f21491a;
                i2++;
            }
            zzbg[] zzbgVarArr = new zzbg[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < zzxjVarArr.length; i5++) {
                zzzo zzzoVarMo9009g = zzxjVarArr[i5].mo9009g();
                int i6 = zzzoVarMo9009g.f21491a;
                int i7 = 0;
                while (i7 < i6) {
                    zzbg zzbgVarM9066a = zzzoVarMo9009g.m9066a(i7);
                    int i8 = zzbgVarM9066a.f7807a;
                    zzv[] zzvVarArr = new zzv[i8];
                    int i9 = 0;
                    while (i9 < i8) {
                        zzv zzvVar = zzbgVarM9066a.f7810d[i9];
                        zzvVar.getClass();
                        zzt zztVar = new zzt(zzvVar);
                        String str = zzvVar.f21047a;
                        if (str == null) {
                            str = "";
                        }
                        zzxj[] zzxjVarArr2 = zzxjVarArr;
                        int i10 = i4;
                        StringBuilder sb = new StringBuilder(str.length() + AbstractC1456a.m2434a(i5, 1));
                        sb.append(i5);
                        sb.append(":");
                        sb.append(str);
                        zztVar.f20789a = sb.toString();
                        String str2 = zzvVar.f21059m;
                        if (str2 != null) {
                            StringBuilder sb2 = new StringBuilder(AbstractC1456a.m2434a(i5, 1) + str2.length());
                            sb2.append(i5);
                            sb2.append(":");
                            sb2.append(str2);
                            zztVar.f20800l = sb2.toString();
                        }
                        zzvVarArr[i9] = new zzv(zztVar);
                        i9++;
                        zzxjVarArr = zzxjVarArr2;
                        i4 = i10;
                    }
                    zzxj[] zzxjVarArr3 = zzxjVarArr;
                    int i11 = i4;
                    String str3 = zzbgVarM9066a.f7808b;
                    StringBuilder sb3 = new StringBuilder(AbstractC1456a.m2434a(i5, 1) + String.valueOf(str3).length());
                    sb3.append(i5);
                    sb3.append(":");
                    sb3.append(str3);
                    zzbg zzbgVar = new zzbg(sb3.toString(), zzvVarArr);
                    this.f21313w.put(zzbgVar, zzbgVarM9066a);
                    i4 = i11 + 1;
                    zzbgVarArr[i11] = zzbgVar;
                    i7++;
                    zzxjVarArr = zzxjVarArr3;
                }
            }
            this.f21315y = new zzzo(zzbgVarArr);
            ?? r1 = this.f21314x;
            r1.getClass();
            r1.mo8669d(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: e */
    public final void mo9007e() {
        int i2 = 0;
        while (true) {
            zzxj[] zzxjVarArr = this.f21309s;
            if (i2 >= zzxjVarArr.length) {
                return;
            }
            zzxjVarArr[i2].mo9007e();
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: g */
    public final zzzo mo9009g() {
        zzzo zzzoVar = this.f21315y;
        zzzoVar.getClass();
        return zzzoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: h */
    public final long mo9010h(long j2, zznk zznkVar) {
        zzxj[] zzxjVarArr = this.f21316z;
        return (zzxjVarArr.length > 0 ? zzxjVarArr[0] : this.f21309s[0]).mo9010h(j2, zznkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: i */
    public final boolean mo9006i(zzmc zzmcVar) {
        ArrayList arrayList = this.f21312v;
        if (arrayList.isEmpty()) {
            return this.f21308A.mo9006i(zzmcVar);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzxj) arrayList.get(i2)).mo9006i(zzmcVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: j */
    public final void mo9011j(zzxi zzxiVar, long j2) {
        this.f21314x = zzxiVar;
        ArrayList arrayList = this.f21312v;
        zzxj[] zzxjVarArr = this.f21309s;
        Collections.addAll(arrayList, zzxjVarArr);
        for (zzxj zzxjVar : zzxjVarArr) {
            zzxjVar.mo9011j(this, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: k */
    public final long mo9012k(long j2) {
        long jMo9012k = this.f21316z[0].mo9012k(j2);
        int i2 = 1;
        while (true) {
            zzxj[] zzxjVarArr = this.f21316z;
            if (i2 >= zzxjVarArr.length) {
                return jMo9012k;
            }
            if (zzxjVarArr[i2].mo9012k(jMo9012k) != jMo9012k) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: l */
    public final long mo9013l(zzabb[] zzabbVarArr, boolean[] zArr, zzzd[] zzzdVarArr, boolean[] zArr2, long j2) {
        int length;
        IdentityHashMap identityHashMap;
        int length2 = zzabbVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = zzabbVarArr.length;
            identityHashMap = this.f21311u;
            if (i3 >= length) {
                break;
            }
            zzzd zzzdVar = zzzdVarArr[i3];
            Integer num = zzzdVar == null ? null : (Integer) identityHashMap.get(zzzdVar);
            iArr[i3] = num == null ? -1 : num.intValue();
            zzabb zzabbVar = zzabbVarArr[i3];
            if (zzabbVar != null) {
                String str = zzabbVar.zza().f7808b;
                iArr2[i3] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i3] = -1;
            }
            i3++;
        }
        identityHashMap.clear();
        zzzd[] zzzdVarArr2 = new zzzd[length];
        zzzd[] zzzdVarArr3 = new zzzd[length];
        zzabb[] zzabbVarArr2 = new zzabb[length];
        zzxj[] zzxjVarArr = this.f21309s;
        ArrayList arrayList = new ArrayList(zzxjVarArr.length);
        long j3 = j2;
        int i4 = 0;
        while (i4 < zzxjVarArr.length) {
            int i5 = i2;
            while (i5 < zzabbVarArr.length) {
                zzzdVarArr3[i5] = iArr[i5] == i4 ? zzzdVarArr[i5] : null;
                if (iArr2[i5] == i4) {
                    zzabb zzabbVar2 = zzabbVarArr[i5];
                    zzabbVar2.getClass();
                    zzbg zzbgVar = (zzbg) this.f21313w.get(zzabbVar2.zza());
                    zzbgVar.getClass();
                    zzabbVarArr2[i5] = new zzxy(zzabbVar2, zzbgVar);
                } else {
                    zzabbVarArr2[i5] = null;
                }
                i5++;
                iArr2 = iArr2;
                iArr = iArr;
            }
            int[] iArr3 = iArr2;
            int[] iArr4 = iArr;
            ArrayList arrayList2 = arrayList;
            zzxj[] zzxjVarArr2 = zzxjVarArr;
            int i6 = i4;
            long jMo9013l = zzxjVarArr[i4].mo9013l(zzabbVarArr2, zArr, zzzdVarArr3, zArr2, j3);
            if (i6 == 0) {
                j3 = jMo9013l;
            } else if (jMo9013l != j3) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzabbVarArr.length; i7++) {
                if (iArr3[i7] == i6) {
                    zzzd zzzdVar2 = zzzdVarArr3[i7];
                    zzzdVar2.getClass();
                    zzzdVarArr2[i7] = zzzdVar2;
                    identityHashMap.put(zzzdVar2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr4[i7] == i6) {
                    zzgtr.m7133f(zzzdVarArr3[i7] == null);
                }
            }
            if (z) {
                arrayList2.add(zzxjVarArr2[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zzxjVarArr = zzxjVarArr2;
            iArr2 = iArr3;
            iArr = iArr4;
            i2 = 0;
        }
        int i8 = i2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzzdVarArr2, i8, zzzdVarArr, i8, length);
        this.f21316z = (zzxj[]) arrayList3.toArray(new zzxj[i8]);
        this.f21308A = new zzwv(arrayList3, zzgxt.m7251b(arrayList3, new zzgti() { // from class: com.google.android.gms.internal.ads.zzxx
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                return zzgwt.m7220t(zzgxt.m7251b(((zzxj) obj).mo9009g().f21492b, new zzgti() { // from class: com.google.android.gms.internal.ads.zzzn
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj2) {
                        zzzo zzzoVar = zzzo.f21490d;
                        return Integer.valueOf(((zzbg) obj2).f7809c);
                    }
                }));
            }
        }));
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: m */
    public final void mo9014m(long j2) {
        for (zzxj zzxjVar : this.f21316z) {
            zzxjVar.mo9014m(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: n */
    public final long mo9015n() {
        long j2 = -9223372036854775807L;
        for (zzxj zzxjVar : this.f21316z) {
            long jMo9015n = zzxjVar.mo9015n();
            if (jMo9015n == -9223372036854775807L) {
                if (j2 != -9223372036854775807L && zzxjVar.mo9012k(j2) != j2) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j2 == -9223372036854775807L) {
                for (zzxj zzxjVar2 : this.f21316z) {
                    if (zzxjVar2 == zzxjVar) {
                        break;
                    }
                    if (zzxjVar2.mo9012k(jMo9015n) != jMo9015n) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j2 = jMo9015n;
            } else if (jMo9015n != j2) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        return this.f21308A.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        return this.f21308A.zzc();
    }
}
