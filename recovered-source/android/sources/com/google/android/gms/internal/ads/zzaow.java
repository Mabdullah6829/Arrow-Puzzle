package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
final class zzaow implements zzann {

    /* JADX INFO: renamed from: a */
    public final zzaop f6327a;

    /* JADX INFO: renamed from: b */
    public final long[] f6328b;

    /* JADX INFO: renamed from: c */
    public final Map f6329c;

    /* JADX INFO: renamed from: d */
    public final HashMap f6330d;

    /* JADX INFO: renamed from: e */
    public final HashMap f6331e;

    public zzaow(zzaop zzaopVar, HashMap map, HashMap map2, HashMap map3) {
        this.f6327a = zzaopVar;
        this.f6330d = map2;
        this.f6331e = map3;
        this.f6329c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        zzaopVar.m4268f(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        this.f6328b = jArr;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    /* JADX INFO: renamed from: a */
    public final ArrayList mo4244a(long j2) {
        ArrayList arrayList = new ArrayList();
        zzaop zzaopVar = this.f6327a;
        String str = zzaopVar.f6276h;
        zzaopVar.m4269g(j2, str, arrayList);
        TreeMap treeMap = new TreeMap();
        zzaopVar.m4270h(j2, false, str, treeMap);
        Map map = this.f6329c;
        HashMap map2 = this.f6330d;
        zzaopVar.m4271j(j2, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) arrayList.get(i2);
            String str2 = (String) this.f6331e.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzaot zzaotVar = (zzaot) map2.get(pair.first);
                zzaotVar.getClass();
                zzcx zzcxVar = new zzcx();
                zzcxVar.f11650b = bitmapDecodeByteArray;
                zzcxVar.f11649a = null;
                zzcxVar.f11656h = zzaotVar.f6297b;
                zzcxVar.f11657i = 0;
                zzcxVar.f11653e = zzaotVar.f6298c;
                zzcxVar.f11654f = 0;
                zzcxVar.f11655g = zzaotVar.f6300e;
                zzcxVar.f11660l = zzaotVar.f6301f;
                zzcxVar.f11661m = zzaotVar.f6302g;
                zzcxVar.f11662n = zzaotVar.f6305j;
                arrayList2.add(zzcxVar.m5860b());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzaot zzaotVar2 = (zzaot) map2.get(entry.getKey());
            zzaotVar2.getClass();
            zzcx zzcxVar2 = (zzcx) entry.getValue();
            CharSequence charSequence = zzcxVar2.f11649a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (zzaon zzaonVar : (zzaon[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzaon.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzaonVar), spannableStringBuilder.getSpanEnd(zzaonVar), (CharSequence) "");
            }
            int i3 = 0;
            while (i3 < spannableStringBuilder.length()) {
                int i4 = i3 + 1;
                if (spannableStringBuilder.charAt(i3) == ' ') {
                    int i5 = i4;
                    while (i5 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i5) == ' ') {
                        i5++;
                    }
                    int i6 = i5 - i4;
                    if (i6 > 0) {
                        spannableStringBuilder.delete(i3, i6 + i3);
                    }
                }
                i3 = i4;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i7 = 0;
            while (i7 < spannableStringBuilder.length() - 1) {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i7) == '\n' && spannableStringBuilder.charAt(i8) == ' ') {
                    spannableStringBuilder.delete(i8, i7 + 2);
                }
                i7 = i8;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i9 = 0;
            while (i9 < spannableStringBuilder.length() - 1) {
                int i10 = i9 + 1;
                if (spannableStringBuilder.charAt(i9) == ' ' && spannableStringBuilder.charAt(i10) == '\n') {
                    spannableStringBuilder.delete(i9, i10);
                }
                i9 = i10;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f2 = zzaotVar2.f6298c;
            int i11 = zzaotVar2.f6299d;
            zzcxVar2.f11653e = f2;
            zzcxVar2.f11654f = i11;
            zzcxVar2.f11655g = zzaotVar2.f6300e;
            zzcxVar2.f11656h = zzaotVar2.f6297b;
            zzcxVar2.f11660l = zzaotVar2.f6301f;
            float f3 = zzaotVar2.f6304i;
            int i12 = zzaotVar2.f6303h;
            zzcxVar2.f11659k = f3;
            zzcxVar2.f11658j = i12;
            zzcxVar2.f11662n = zzaotVar2.f6305j;
            arrayList2.add(zzcxVar2.m5860b());
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    /* JADX INFO: renamed from: b */
    public final long mo4245b(int i2) {
        return this.f6328b[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final int zza() {
        return this.f6328b.length;
    }
}
