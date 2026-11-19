package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefs implements zzegy {

    /* JADX INFO: renamed from: h */
    public static final Pattern f13809h = Pattern.compile("Received error HTTP response code: (.*)");

    /* JADX INFO: renamed from: a */
    public final zzeet f13810a;

    /* JADX INFO: renamed from: b */
    public final zzhcp f13811b;

    /* JADX INFO: renamed from: c */
    public final zzflg f13812c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f13813d;

    /* JADX INFO: renamed from: e */
    public final zzejl f13814e;

    /* JADX INFO: renamed from: f */
    public final zzfqq f13815f;

    /* JADX INFO: renamed from: g */
    public final Context f13816g;

    public zzefs(Context context, zzflg zzflgVar, zzeet zzeetVar, zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, zzejl zzejlVar, zzfqq zzfqqVar) {
        this.f13816g = context;
        this.f13812c = zzflgVar;
        this.f13810a = zzeetVar;
        this.f13811b = zzhcpVar;
        this.f13813d = scheduledExecutorService;
        this.f13814e = zzejlVar;
        this.f13815f = zzfqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegy
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6194a(final zzcbk zzcbkVar) {
        final zzeet zzeetVar = this.f13810a;
        zzhcp zzhcpVar = zzeetVar.f13766b;
        String str = zzcbkVar.f9685v;
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        ListenableFuture listenableFutureM7368b = com.google.android.gms.ads.internal.util.zzs.m3206e(str) ? zzhcf.m7368b(new zzegz(1)) : zzhcf.m7372f(zzeetVar.f13765a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzees
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzcgd zzcgdVar;
                zzeet zzeetVar2 = zzeetVar;
                zzcbk zzcbkVar2 = zzcbkVar;
                final zzegd zzegdVar = zzeetVar2.f13767c;
                synchronized (zzegdVar.f13878t) {
                    try {
                        if (zzegdVar.f13879u) {
                            zzcgdVar = zzegdVar.f13877s;
                        } else {
                            zzegdVar.f13879u = true;
                            zzegdVar.f13881w = zzcbkVar2;
                            zzegdVar.f13882x.checkAvailabilityAndConnect();
                            zzcgd zzcgdVar2 = zzegdVar.f13877s;
                            zzcgdVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegc
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzegdVar.m6206a();
                                }
                            }, zzcfy.f9953h);
                            zzegk.m6205b(zzegdVar.f13868y, zzcgdVar2, zzegdVar.f13869z);
                            zzcgdVar = zzcgdVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return (zzeha) zzcgdVar.get(((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8009A6)).intValue(), TimeUnit.SECONDS);
            }
        }), ExecutionException.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeep
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return zzhcf.m7368b(cause);
            }
        }, zzhcpVar);
        final int callingUid = Binder.getCallingUid();
        ListenableFuture listenableFutureM7372f = zzhcf.m7372f(listenableFutureM7368b, zzegz.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeeq
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                Bundle bundle;
                final zzcbk zzcbkVar2 = zzcbkVar;
                if (zzcbkVar2 != null && (bundle = zzcbkVar2.f9681E) != null) {
                    bundle.putBoolean("ls", true);
                }
                zzeet zzeetVar2 = zzeetVar;
                return zzhcf.m7374h(((zzeiq) zzeetVar2.f13768d.zzb()).m6223k4(zzcbkVar2, callingUid), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeer
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ ListenableFuture mo3248b(Object obj2) {
                        return zzhcf.m7367a(new zzeha((InputStream) obj2, zzcbkVar2));
                    }
                }, zzeetVar2.f13766b);
            }
        }, zzhcpVar);
        zzfqg zzfqgVarM6562l = zzfqg.m6562l(this.f13816g, 11);
        zzfqp.m6575a(listenableFutureM7372f, zzfqgVarM6562l);
        ListenableFuture listenableFutureM7374h = zzhcf.m7374h(listenableFutureM7372f, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefr
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) {
                zzeha zzehaVar = (zzeha) obj;
                return zzhcf.m7367a(new zzfky(new zzfkv(this.f13808a.f13812c), zzfkx.m6484a(new InputStreamReader(zzehaVar.f13905a), zzehaVar.f13906b.f9681E)));
            }
        }, this.f13811b);
        zzbio zzbioVar = zzbix.f8867z6;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            listenableFutureM7374h = zzhcf.m7372f(zzhcf.m7373g(listenableFutureM7374h, ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8009A6)).intValue(), TimeUnit.SECONDS, this.f13813d), TimeoutException.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefq
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                    return zzhcf.m7368b(new zzeel(5));
                }
            }, zzcfy.f9953h);
        }
        zzfqp.m6577c(listenableFutureM7374h, this.f13815f, zzfqgVarM6562l, false);
        ((zzhay) listenableFutureM7374h).addListener(new zzhcd(listenableFutureM7374h, new zzefp(this)), zzcfy.f9953h);
        return listenableFutureM7374h;
    }
}
