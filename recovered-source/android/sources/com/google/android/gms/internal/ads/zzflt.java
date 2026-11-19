package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzflt {

    /* JADX INFO: renamed from: a */
    public final zzfkn f16077a;

    /* JADX INFO: renamed from: b */
    public final zzfkq f16078b;

    /* JADX INFO: renamed from: c */
    public final zzfsm f16079c;

    /* JADX INFO: renamed from: d */
    public final zzfse f16080d;

    /* JADX INFO: renamed from: e */
    public final zzfqq f16081e;

    /* JADX INFO: renamed from: f */
    public final zzctq f16082f;

    public zzflt(zzfsm zzfsmVar, zzfse zzfseVar, zzfkn zzfknVar, zzfkq zzfkqVar, zzctq zzctqVar, zzfqq zzfqqVar) {
        this.f16077a = zzfknVar;
        this.f16078b = zzfkqVar;
        this.f16079c = zzfsmVar;
        this.f16080d = zzfseVar;
        this.f16082f = zzctqVar;
        this.f16081e = zzfqqVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6491a(ArrayList arrayList, zzdfo zzdfoVar) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) obj;
            zzfkn zzfknVar = this.f16077a;
            if (zzfknVar.f15933i0) {
                String str2 = this.f16078b.f15973b;
                zzfse zzfseVar = this.f16080d;
                zzfseVar.getClass();
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                zzekq zzekqVar = new zzekq(System.currentTimeMillis(), str2, str, 2);
                zzeko zzekoVar = zzfseVar.f16390a;
                zzekoVar.getClass();
                zzekoVar.m6258c(new zzekl(zzekoVar, zzekqVar));
            } else {
                zzfqq zzfqqVar = this.f16081e;
                this.f16079c.m6643b(str, zzfknVar.f15963x0, zzfqqVar, zzdfoVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6492b(ArrayList arrayList, int i2) {
        ListenableFuture listenableFutureM7367a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            String str = (String) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8804vb)).booleanValue() && zzctq.m5821b(str)) {
                listenableFutureM7367a = this.f16082f.m5822a(str, com.google.android.gms.ads.internal.client.zzay.f3085g.f3090e);
            } else {
                listenableFutureM7367a = zzhcf.m7367a(str);
            }
            zzfls zzflsVar = new zzfls(this, i2);
            listenableFutureM7367a.addListener(new zzhcd(listenableFutureM7367a, zzflsVar), zzcfy.f9946a);
        }
    }
}
