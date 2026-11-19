package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzast;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzauq;
import com.google.android.gms.internal.ads.zzbix;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzbl {

    /* JADX INFO: renamed from: a */
    public static zzato f3533a;

    /* JADX INFO: renamed from: b */
    public static final Object f3534b = new Object();

    public zzbl(Context context) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f3534b) {
            try {
                if (f3533a == null) {
                    zzbix.m5032a(context);
                    f3533a = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8696p5)).booleanValue() ? zzay.m3106b(context) : zzauq.m4426a(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final ListenableFuture m3116a(int i2, String str, HashMap map, byte[] bArr) {
        zzbi zzbiVar = new zzbi();
        zzbg zzbgVar = new zzbg(this, str, zzbiVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(0);
        zzbh zzbhVar = new zzbh(this, i2, str, zzbiVar, zzbgVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.m3052e()) {
            try {
                zzlVar.m3055b(str, zzbhVar.mo3111g(), bArr == null ? null : bArr);
            } catch (zzast e) {
                String message = e.getMessage();
                int i3 = zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f(message);
            }
        }
        f3533a.m4398b(zzbhVar);
        return zzbiVar;
    }
}
