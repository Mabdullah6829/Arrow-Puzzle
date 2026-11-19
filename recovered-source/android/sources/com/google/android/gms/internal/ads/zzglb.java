package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzglb implements zzfzk {

    /* JADX INFO: renamed from: a */
    public final Context f17700a;

    /* JADX INFO: renamed from: b */
    public final zzgpj f17701b;

    /* JADX INFO: renamed from: c */
    public final String f17702c;

    /* JADX INFO: renamed from: d */
    public final long f17703d;

    /* JADX INFO: renamed from: e */
    public final long f17704e;

    public zzglb(Context context, zzgdq zzgdqVar, zzgpj zzgpjVar) {
        this.f17700a = context;
        this.f17702c = zzgdqVar.m6921U();
        this.f17703d = zzgdqVar.m6928b0();
        this.f17704e = zzgdqVar.m6929c0();
        this.f17701b = zzgpjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    /* JADX INFO: renamed from: a */
    public final HashMap mo4724a() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    /* JADX INFO: renamed from: b */
    public final void m7021b(HashMap map) {
        String strM4629y0;
        zzayt zzaytVar;
        map.put("v", this.f17702c);
        map.put("t", new Throwable());
        try {
            ListenableFuture listenableFuture = (ListenableFuture) map.get("gs");
            strM4629y0 = (listenableFuture == null || (Build.VERSION.SDK_INT >= 31 && !listenableFuture.isDone()) || (zzaytVar = (zzayt) listenableFuture.get(this.f17703d, TimeUnit.MILLISECONDS)) == null || zzaytVar.m4629y0().length() <= 1) ? "E" : zzaytVar.m4629y0();
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strM4629y0.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.f17704e, TimeUnit.MILLISECONDS);
                    if (!zzgtq.m7127a(str)) {
                        strM4629y0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strM4629y0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    /* JADX INFO: renamed from: d */
    public final HashMap mo4726d() {
        HashMap mapM7049c = this.f17701b.m7049c();
        m7021b(mapM7049c);
        return mapM7049c;
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    public final HashMap zzb() {
        HashMap mapM7047a = this.f17701b.m7047a();
        m7021b(mapM7047a);
        return mapM7047a;
    }

    @Override // com.google.android.gms.internal.ads.zzfzk
    public final HashMap zzc() {
        HashMap mapM7048b = this.f17701b.m7048b(this.f17700a, null);
        m7021b(mapM7048b);
        return mapM7048b;
    }
}
