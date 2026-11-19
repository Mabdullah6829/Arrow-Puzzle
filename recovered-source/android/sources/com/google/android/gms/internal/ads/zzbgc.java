package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgc {

    /* JADX INFO: renamed from: a */
    public final int f7814a;

    /* JADX INFO: renamed from: b */
    public final zzbge f7815b = new zzbge();

    public zzbgc(int i2) {
        this.f7814a = i2;
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: a */
    public final String m4860a(ArrayList arrayList) {
        int i2;
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r3 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            sb.append(((String) arrayList.get(i3)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzbgb zzbgbVar = new zzbgb();
        zzbga zzbgaVar = new zzbga();
        int i4 = this.f7814a;
        PriorityQueue priorityQueue = new PriorityQueue(i4, zzbgaVar);
        int i5 = 0;
        while (i5 < strArrSplit.length) {
            String[] strArrM4862b = zzbgd.m4862b(strArrSplit[i5], r3);
            if (strArrM4862b.length != 0) {
                int length = strArrM4862b.length;
                int i6 = 6;
                if (length < 6) {
                    i2 = i4;
                    zzbgg.m4864a(i2, zzbgg.m4867d(strArrM4862b, length), zzbgg.m4865b(strArrM4862b, r3, length), length, priorityQueue);
                } else {
                    i2 = i4;
                    long jM4867d = zzbgg.m4867d(strArrM4862b, 6);
                    zzbgg.m4864a(i2, jM4867d, zzbgg.m4865b(strArrM4862b, r3, 6), 6, priorityQueue);
                    int i7 = 1;
                    while (true) {
                        int length2 = strArrM4862b.length;
                        if (i7 < length2 - 5) {
                            long jM4861a = zzbgd.m4861a(strArrM4862b[i7 - 1]);
                            long jM4861a2 = zzbgd.m4861a(strArrM4862b[i7 + 5]);
                            String strM4865b = zzbgg.m4865b(strArrM4862b, i7, i6);
                            jM4867d = (((jM4861a2 + 2147483647L) % 1073807359) + (((((jM4867d + 1073807359) - ((((jM4861a + 2147483647L) % 1073807359) * zzbgg.m4866c(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            i2 = i2;
                            zzbgg.m4864a(i2, jM4867d, strM4865b, length2, priorityQueue);
                            i7++;
                            i6 = 6;
                        }
                    }
                }
            } else {
                i2 = i4;
            }
            i5++;
            i4 = i2;
            r3 = 0;
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbgbVar.f7813b.write(this.f7815b.m4863b(((zzbgf) it.next()).f7818b));
            } catch (IOException e) {
                int i8 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error while writing hash to byteStream", e);
            }
        }
        return zzbgbVar.toString();
    }
}
