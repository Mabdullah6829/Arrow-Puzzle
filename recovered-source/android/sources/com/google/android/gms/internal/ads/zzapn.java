package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzapn implements zzann {

    /* JADX INFO: renamed from: a */
    public final List f6408a;

    /* JADX INFO: renamed from: b */
    public final long[] f6409b;

    /* JADX INFO: renamed from: c */
    public final long[] f6410c;

    public zzapn(ArrayList arrayList) {
        this.f6408a = Collections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.f6409b = new long[size + size];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            zzapd zzapdVar = (zzapd) arrayList.get(i2);
            long[] jArr = this.f6409b;
            int i3 = i2 + i2;
            jArr[i3] = zzapdVar.f6378b;
            jArr[i3 + 1] = zzapdVar.f6379c;
        }
        long[] jArr2 = this.f6409b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f6410c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzann
    /* JADX INFO: renamed from: a */
    public final ArrayList mo4244a(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            List list = this.f6408a;
            if (i2 >= list.size()) {
                break;
            }
            int i3 = i2 + i2;
            long[] jArr = this.f6409b;
            if (jArr[i3] <= j2 && j2 < jArr[i3 + 1]) {
                zzapd zzapdVar = (zzapd) list.get(i2);
                zzcy zzcyVar = zzapdVar.f6377a;
                if (zzcyVar.f11747e == -3.4028235E38f) {
                    arrayList2.add(zzapdVar);
                } else {
                    arrayList.add(zzcyVar);
                }
            }
            i2++;
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzapm
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return Long.compare(((zzapd) obj).f6378b, ((zzapd) obj2).f6378b);
            }
        });
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            zzcy zzcyVar2 = ((zzapd) arrayList2.get(i4)).f6377a;
            zzcx zzcxVar = new zzcx();
            zzcxVar.f11649a = zzcyVar2.f11743a;
            zzcxVar.f11650b = zzcyVar2.f11746d;
            zzcxVar.f11651c = zzcyVar2.f11744b;
            zzcxVar.f11652d = zzcyVar2.f11745c;
            zzcxVar.f11655g = zzcyVar2.f11749g;
            zzcxVar.f11656h = zzcyVar2.f11750h;
            zzcxVar.f11657i = zzcyVar2.f11751i;
            zzcxVar.f11658j = zzcyVar2.f11754l;
            zzcxVar.f11659k = zzcyVar2.f11755m;
            zzcxVar.f11660l = zzcyVar2.f11752j;
            zzcxVar.f11661m = zzcyVar2.f11753k;
            zzcxVar.f11662n = zzcyVar2.f11756n;
            zzcxVar.f11663o = zzcyVar2.f11757o;
            zzcxVar.f11664p = zzcyVar2.f11758p;
            zzcxVar.f11653e = (-1) - i4;
            zzcxVar.f11654f = 1;
            arrayList.add(zzcxVar.m5860b());
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    /* JADX INFO: renamed from: b */
    public final long mo4245b(int i2) {
        zzgtr.m7128a(i2 >= 0);
        long[] jArr = this.f6410c;
        zzgtr.m7128a(i2 < jArr.length);
        return jArr[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final int zza() {
        return this.f6410c.length;
    }
}
