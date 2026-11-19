package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzhb {

    /* JADX INFO: renamed from: a */
    public final zzha f18474a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f18475b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f18476c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final PriorityQueue f18477d = new PriorityQueue();

    /* JADX INFO: renamed from: e */
    public int f18478e = -1;

    /* JADX INFO: renamed from: f */
    public zzgz f18479f;

    public zzhb(zzha zzhaVar) {
        this.f18474a = zzhaVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m7336a(int i2) {
        zzgtr.m7133f(i2 >= 0);
        this.f18478e = i2;
        m7338c(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r8 < r0.f18385t) goto L33;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7337b(long r8, com.google.android.gms.internal.ads.zzeu r10) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L92
            int r0 = r7.f18478e
            if (r0 == 0) goto L93
            java.util.PriorityQueue r1 = r7.f18477d
            r2 = -1
            if (r0 == r2) goto L29
            int r0 = r1.size()
            int r3 = r7.f18478e
            if (r0 < r3) goto L29
            java.lang.Object r0 = r1.peek()
            com.google.android.gms.internal.ads.zzgz r0 = (com.google.android.gms.internal.ads.zzgz) r0
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfm.f16091a
            long r3 = r0.f18385t
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L29
            goto L93
        L29:
            java.util.ArrayDeque r0 = r7.f18475b
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L37
            com.google.android.gms.internal.ads.zzeu r0 = new com.google.android.gms.internal.ads.zzeu
            r0.<init>()
            goto L3d
        L37:
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.zzeu r0 = (com.google.android.gms.internal.ads.zzeu) r0
        L3d:
            int r3 = r10.m6360B()
            r0.m6396y(r3)
            byte[] r3 = r10.f14887a
            int r10 = r10.f14888b
            byte[] r4 = r0.f14887a
            r5 = 0
            int r6 = r0.m6360B()
            java.lang.System.arraycopy(r3, r10, r4, r5, r6)
            com.google.android.gms.internal.ads.zzgz r10 = r7.f18479f
            if (r10 == 0) goto L63
            long r3 = r10.f18385t
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L5d
            goto L63
        L5d:
            java.util.ArrayList r8 = r10.f18384s
            r8.add(r0)
            return
        L63:
            java.util.ArrayDeque r10 = r7.f18476c
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L71
            com.google.android.gms.internal.ads.zzgz r10 = new com.google.android.gms.internal.ads.zzgz
            r10.<init>()
            goto L77
        L71:
            java.lang.Object r10 = r10.pop()
            com.google.android.gms.internal.ads.zzgz r10 = (com.google.android.gms.internal.ads.zzgz) r10
        L77:
            java.util.ArrayList r3 = r10.f18384s
            boolean r4 = r3.isEmpty()
            com.google.android.gms.internal.ads.zzgtr.m7133f(r4)
            r10.f18385t = r8
            r3.add(r0)
            r1.add(r10)
            r7.f18479f = r10
            int r8 = r7.f18478e
            if (r8 == r2) goto L91
            r7.m7338c(r8)
        L91:
            return
        L92:
            r8 = r0
        L93:
            com.google.android.gms.internal.ads.zzha r0 = r7.f18474a
            r0.mo4203a(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhb.m7337b(long, com.google.android.gms.internal.ads.zzeu):void");
    }

    /* JADX INFO: renamed from: c */
    public final void m7338c(int i2) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = this.f18477d;
            if (priorityQueue.size() <= i2) {
                return;
            }
            zzgz zzgzVar = (zzgz) priorityQueue.poll();
            String str = zzfm.f16091a;
            int i3 = 0;
            while (true) {
                arrayList = zzgzVar.f18384s;
                if (i3 >= arrayList.size()) {
                    break;
                }
                this.f18474a.mo4203a(zzgzVar.f18385t, (zzeu) arrayList.get(i3));
                this.f18475b.push((zzeu) arrayList.get(i3));
                i3++;
            }
            arrayList.clear();
            zzgz zzgzVar2 = this.f18479f;
            if (zzgzVar2 != null && zzgzVar2.f18385t == zzgzVar.f18385t) {
                this.f18479f = null;
            }
            this.f18476c.push(zzgzVar);
        }
    }
}
