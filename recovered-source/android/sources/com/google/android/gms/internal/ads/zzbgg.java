package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgg {
    /* JADX INFO: renamed from: a */
    public static void m4864a(int i2, long j2, String str, int i3, PriorityQueue priorityQueue) {
        zzbgf zzbgfVar = new zzbgf(str, i3, j2);
        if ((priorityQueue.size() != i2 || (((zzbgf) priorityQueue.peek()).f7819c <= i3 && ((zzbgf) priorityQueue.peek()).f7817a <= j2)) && !priorityQueue.contains(zzbgfVar)) {
            priorityQueue.add(zzbgfVar);
            if (priorityQueue.size() > i2) {
                priorityQueue.poll();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m4865b(String[] strArr, int i2, int i3) {
        int i4 = i3 + i2;
        if (strArr.length < i4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i6 = i4 - 1;
            if (i2 >= i6) {
                sb.append(strArr[i6]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            sb.append(' ');
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m4866c(int i2, long j2) {
        if (i2 == 1) {
            return j2;
        }
        int i3 = i2 >> 1;
        long j3 = (j2 * j2) % 1073807359;
        return (i2 & 1) == 0 ? m4866c(i3, j3) % 1073807359 : ((m4866c(i3, j3) % 1073807359) * j2) % 1073807359;
    }

    /* JADX INFO: renamed from: d */
    public static long m4867d(String[] strArr, int i2) {
        long jM4861a = (((long) zzbgd.m4861a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            jM4861a = (((((long) zzbgd.m4861a(strArr[i3])) + 2147483647L) % 1073807359) + ((jM4861a * 16785407) % 1073807359)) % 1073807359;
        }
        return jM4861a;
    }
}
