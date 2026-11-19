package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefn {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f13798a;

    /* JADX INFO: renamed from: b */
    public final zzhcp f13799b;

    /* JADX INFO: renamed from: c */
    public final zzhcp f13800c;

    /* JADX INFO: renamed from: d */
    public final zzegm f13801d;

    /* JADX INFO: renamed from: e */
    public final zzimt f13802e;

    public zzefn(ScheduledExecutorService scheduledExecutorService, zzhcp zzhcpVar, zzhcp zzhcpVar2, zzegm zzegmVar, zzimt zzimtVar) {
        this.f13798a = scheduledExecutorService;
        this.f13799b = zzhcpVar;
        this.f13800c = zzhcpVar2;
        this.f13801d = zzegmVar;
        this.f13802e = zzimtVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzhbx m6192a(final zzcbk zzcbkVar) {
        ListenableFuture listenableFutureSubmit;
        String str = zzcbkVar.f9685v;
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        if (com.google.android.gms.ads.internal.util.zzs.m3206e(str)) {
            listenableFutureSubmit = zzhcf.m7368b(new zzegz(1));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8784u8)).booleanValue() || ((Boolean) zzbli.f9130a.m5057c()).booleanValue()) {
                listenableFutureSubmit = this.f13800c.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzefk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return (zzeha) ((zzcgd) this.f13792a.f13801d.m6207c(zzcbkVar)).f9959s.get(((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8009A6)).intValue(), TimeUnit.SECONDS);
                    }
                });
            } else {
                listenableFutureSubmit = this.f13801d.m6207c(zzcbkVar);
            }
        }
        final int callingUid = Binder.getCallingUid();
        return (zzhbx) zzhcf.m7372f((zzhbx) zzhcf.m7373g(zzhbx.m7360q(listenableFutureSubmit), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8009A6)).intValue(), TimeUnit.SECONDS, this.f13798a), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefm
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                Bundle bundle;
                final zzcbk zzcbkVar2 = zzcbkVar;
                if (zzcbkVar2 != null && (bundle = zzcbkVar2.f9681E) != null) {
                    bundle.putBoolean("ls", true);
                }
                zzefn zzefnVar = this.f13795a;
                return zzhcf.m7374h(((zzeiq) zzefnVar.f13802e.zzb()).m6226n4(zzcbkVar2, callingUid), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefl
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ ListenableFuture mo3248b(Object obj2) {
                        return zzhcf.m7367a(new zzeha((InputStream) obj2, zzcbkVar2));
                    }
                }, zzefnVar.f13799b);
            }
        }, this.f13799b);
    }
}
