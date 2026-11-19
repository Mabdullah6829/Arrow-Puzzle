package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzcbp implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f9731a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcbr f9732b;

    public zzcbp(zzcbr zzcbrVar, Context context) {
        this.f9731a = context;
        Objects.requireNonNull(zzcbrVar);
        this.f9732b = zzcbrVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0039  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzcbo zzcboVarM5307a;
        zzcbr zzcbrVar = this.f9732b;
        WeakHashMap weakHashMap = zzcbrVar.f9735a;
        Context context = this.f9731a;
        zzcbq zzcbqVar = (zzcbq) weakHashMap.get(context);
        if (zzcbqVar != null) {
            long jLongValue = zzcbqVar.f9733a + ((Long) zzbkm.f8986d.m5057c()).longValue();
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            if (jLongValue < System.currentTimeMillis()) {
                zzcboVarM5307a = new zzcbn(context).m5307a();
            } else {
                zzcboVarM5307a = new zzcbn(context, zzcbqVar.f9734b).m5307a();
            }
        } else {
            zzcboVarM5307a = new zzcbn(context).m5307a();
        }
        zzcbrVar.f9735a.put(context, new zzcbq(zzcbrVar, zzcboVarM5307a));
        return zzcboVarM5307a;
    }
}
