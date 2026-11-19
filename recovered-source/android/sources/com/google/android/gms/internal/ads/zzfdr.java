package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdr implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final Context f15509a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f15510b;

    /* JADX INFO: renamed from: c */
    public final Executor f15511c;

    /* JADX INFO: renamed from: d */
    public final boolean f15512d;

    /* JADX INFO: renamed from: e */
    public final boolean f15513e;

    /* JADX INFO: renamed from: f */
    public final zzcfc f15514f;

    public zzfdr(zzcfc zzcfcVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i2, boolean z, boolean z2) {
        this.f15514f = zzcfcVar;
        this.f15509a = context;
        this.f15510b = scheduledExecutorService;
        this.f15511c = executor;
        this.f15512d = z;
        this.f15513e = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        zzcgd zzcgdVar = new zzcgd();
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
        zzgax zzgaxVar = com.google.android.gms.ads.internal.util.client.zzf.f3409b;
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f4157b;
        Context context = this.f15509a;
        int iM3403c = googleApiAvailabilityLight.m3403c(context, 12451000);
        if (iM3403c == 0 || iM3403c == 2) {
            ((zzcfx) zzcfy.f9946a).execute(new zzcfb(this.f15514f, context, zzcgdVar));
        }
        zzhbx zzhbxVarM7360q = zzhbx.m7360q(zzcgdVar);
        zzgti zzgtiVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzfdq
            /* JADX WARN: Code duplicated, block: B:24:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:26:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                zzfdr zzfdrVar = this.f15508a;
                AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                zzfdrVar.getClass();
                zzgcr zzgcrVar = new zzgcr();
                if (zzfdrVar.f15512d) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8441a4)).booleanValue()) {
                        Context context2 = zzfdrVar.f15509a;
                        zzgcv zzgcvVarM6890f = zzgcv.m6890f(context2);
                        Objects.requireNonNull(info);
                        String str = info.f3021a;
                        Objects.requireNonNull(str);
                        String packageName = context2.getPackageName();
                        long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8526f4)).longValue();
                        boolean z = zzfdrVar.f15513e;
                        zzgcvVarM6890f.getClass();
                        synchronized (zzgcv.class) {
                            zzgcrVar = zzgcvVarM6890f.m6885a(str, packageName, jLongValue, z);
                        }
                    }
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8424Z3)).booleanValue()) {
                        try {
                            Context context3 = zzfdrVar.f15509a;
                            zzgcv zzgcvVarM6890f2 = zzgcv.m6890f(context3);
                            Objects.requireNonNull(info);
                            String str2 = info.f3021a;
                            Objects.requireNonNull(str2);
                            String packageName2 = context3.getPackageName();
                            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8526f4)).longValue();
                            boolean z2 = zzfdrVar.f15513e;
                            zzgcvVarM6890f2.getClass();
                            synchronized (zzgcv.class) {
                            }
                            zzgcrVar = zzgcvVarM6890f2.m6885a(str2, packageName2, jLongValue2, z2);
                        } catch (IOException | IllegalArgumentException e) {
                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdIdInfoSignalSource.getPaidV1", e);
                            zzgcrVar = new zzgcr();
                        }
                    }
                }
                return new zzfds(info, null, zzgcrVar);
            }
        };
        Executor executor = this.f15511c;
        return (zzhbx) zzhcf.m7371e((zzhbx) zzhcf.m7373g((zzhbx) zzhcf.m7375i(zzhbxVarM7360q, zzgtiVar, executor), ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8055D1)).longValue(), TimeUnit.MILLISECONDS, this.f15510b), Throwable.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzfdp
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                zzfdr zzfdrVar = this.f15507a;
                zzfdrVar.getClass();
                com.google.android.gms.ads.internal.util.client.zzf zzfVar2 = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
                ContentResolver contentResolver = zzfdrVar.f15509a.getContentResolver();
                return new zzfds(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzgcr());
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 40;
    }
}
