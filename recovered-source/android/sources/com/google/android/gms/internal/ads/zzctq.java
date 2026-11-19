package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import android.view.MotionEvent;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzctq {

    /* JADX INFO: renamed from: a */
    public final Context f11385a;

    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.ads.internal.util.zzg f11386b;

    /* JADX INFO: renamed from: c */
    public final zzelw f11387c;

    /* JADX INFO: renamed from: d */
    public final zzdwv f11388d;

    /* JADX INFO: renamed from: e */
    public final zzhcp f11389e;

    /* JADX INFO: renamed from: f */
    public final zzhcp f11390f;

    /* JADX INFO: renamed from: g */
    public final ScheduledExecutorService f11391g;

    /* JADX INFO: renamed from: h */
    public zzcah f11392h;

    /* JADX INFO: renamed from: i */
    public zzcah f11393i;

    public zzctq(Context context, com.google.android.gms.ads.internal.util.zzj zzjVar, zzelw zzelwVar, zzdwv zzdwvVar, zzhcp zzhcpVar, zzhcp zzhcpVar2, ScheduledExecutorService scheduledExecutorService) {
        this.f11385a = context;
        this.f11386b = zzjVar;
        this.f11387c = zzelwVar;
        this.f11388d = zzdwvVar;
        this.f11389e = zzhcpVar;
        this.f11390f = zzhcpVar2;
        this.f11391g = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5821b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8048Cb));
    }

    /* JADX INFO: renamed from: a */
    public final ListenableFuture m5822a(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzhcf.m7367a(str) : zzhcf.m7372f(m5823c(str, this.f11388d.f13232a, random), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzctp
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                final Throwable th = (Throwable) obj;
                final zzctq zzctqVar = this.f11383a;
                zzctqVar.f11389e.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcto
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzctq zzctqVar2 = zzctqVar;
                        Context context = zzctqVar2.f11385a;
                        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8167Jb)).booleanValue();
                        Throwable th2 = th;
                        if (zBooleanValue) {
                            zzcah zzcahVarM5288e = zzcaf.m5288e(context);
                            zzctqVar2.f11393i = zzcahVarM5288e;
                            zzcahVarM5288e.mo5291a("AttributionReporting.getUpdatedUrlAndRegisterSource", th2);
                        } else {
                            zzcah zzcahVarM5286c = zzcaf.m5286c(context);
                            zzctqVar2.f11392h = zzcahVarM5286c;
                            zzcahVarM5286c.mo5291a("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th2);
                        }
                    }
                });
                return zzhcf.m7367a(str);
            }
        }, this.f11389e);
    }

    /* JADX INFO: renamed from: c */
    public final ListenableFuture m5823c(final String str, final MotionEvent motionEvent, Random random) {
        ListenableFuture listenableFutureM7368b;
        try {
            zzbio zzbioVar = zzbix.f8048Cb;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            zzbiv zzbivVar = zzbaVar.f3098c;
            zzbiv zzbivVar2 = zzbaVar.f3098c;
            if (!str.contains((CharSequence) zzbivVar.m5030a(zzbioVar)) || this.f11386b.mo3172s()) {
                return zzhcf.m7367a(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) zzbivVar2.m5030a(zzbix.f8065Db), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (motionEvent == null) {
                builderBuildUpon.appendQueryParameter((String) zzbivVar2.m5030a(zzbix.f8082Eb), "11");
                return zzhcf.m7367a(builderBuildUpon.toString());
            }
            zzelw zzelwVar = this.f11387c;
            zzelwVar.getClass();
            try {
                MeasurementManagerFutures measurementManagerFuturesFrom = MeasurementManagerFutures.from(zzelwVar.f14185b);
                zzelwVar.f14184a = measurementManagerFuturesFrom;
                listenableFutureM7368b = measurementManagerFuturesFrom == null ? zzhcf.m7368b(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesFrom.getMeasurementApiStatusAsync();
            } catch (Exception e) {
                listenableFutureM7368b = zzhcf.m7368b(e);
            }
            return (zzhbx) zzhcf.m7372f((zzhbx) zzhcf.m7374h(zzhbx.m7360q(listenableFutureM7368b), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzctk
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final ListenableFuture mo3248b(Object obj) {
                    ListenableFuture listenableFutureM7368b2;
                    InputEvent inputEvent = motionEvent;
                    int iIntValue = ((Integer) obj).intValue();
                    final Uri.Builder builder = builderBuildUpon;
                    if (iIntValue != 1) {
                        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8082Eb), "10");
                        return zzhcf.m7367a(builder.toString());
                    }
                    Uri.Builder builderBuildUpon2 = builder.build().buildUpon();
                    zzbio zzbioVar2 = zzbix.f8099Fb;
                    zzbiv zzbivVar3 = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
                    builderBuildUpon2.appendQueryParameter((String) zzbivVar3.m5030a(zzbioVar2), "1");
                    builderBuildUpon2.appendQueryParameter((String) zzbivVar3.m5030a(zzbix.f8082Eb), "12");
                    if (str.contains((CharSequence) zzbivVar3.m5030a(zzbix.f8116Gb))) {
                        builderBuildUpon2.authority((String) zzbivVar3.m5030a(zzbix.f8133Hb));
                    }
                    zzctq zzctqVar = this.f11372a;
                    zzelw zzelwVar2 = zzctqVar.f11387c;
                    Uri uriBuild = builderBuildUpon2.build();
                    zzelwVar2.getClass();
                    try {
                        MeasurementManagerFutures measurementManagerFutures = zzelwVar2.f14184a;
                        Objects.requireNonNull(measurementManagerFutures);
                        listenableFutureM7368b2 = measurementManagerFutures.registerSourceAsync(uriBuild, inputEvent);
                    } catch (Exception e2) {
                        listenableFutureM7368b2 = zzhcf.m7368b(e2);
                    }
                    return (zzhbx) zzhcf.m7374h(zzhbx.m7360q(listenableFutureM7368b2), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzctm
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        /* JADX INFO: renamed from: b */
                        public final ListenableFuture mo3248b(Object obj2) {
                            String str2 = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8082Eb);
                            Uri.Builder builder2 = builder;
                            builder2.appendQueryParameter(str2, "12");
                            return zzhcf.m7367a(builder2.toString());
                        }
                    }, zzctqVar.f11390f);
                }
            }, this.f11390f), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzctl
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final ListenableFuture mo3248b(Object obj) {
                    final Throwable th = (Throwable) obj;
                    final zzctq zzctqVar = this.f11376a;
                    zzctqVar.f11389e.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctn
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzctq zzctqVar2 = zzctqVar;
                            Context context = zzctqVar2.f11385a;
                            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8167Jb)).booleanValue();
                            Throwable th2 = th;
                            if (zBooleanValue) {
                                zzcah zzcahVarM5288e = zzcaf.m5288e(context);
                                zzctqVar2.f11393i = zzcahVarM5288e;
                                zzcahVarM5288e.mo5291a("AttributionReporting", th2);
                            } else {
                                zzcah zzcahVarM5286c = zzcaf.m5286c(context);
                                zzctqVar2.f11392h = zzcahVarM5286c;
                                zzcahVarM5286c.mo5291a("AttributionReportingSampled", th2);
                            }
                        }
                    });
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8082Eb);
                    Uri.Builder builder = builderBuildUpon;
                    builder.appendQueryParameter(str2, "9");
                    return zzhcf.m7367a(builder.toString());
                }
            }, this.f11389e);
        } catch (Exception e2) {
            return zzhcf.m7368b(e2);
        }
    }
}
