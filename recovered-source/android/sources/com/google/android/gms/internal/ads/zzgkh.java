package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
final class zzgkh implements zzggc {

    /* JADX INFO: renamed from: a */
    public final zzimt f17643a;

    /* JADX INFO: renamed from: b */
    public final zzimt f17644b;

    /* JADX INFO: renamed from: c */
    public final zzimt f17645c;

    /* JADX INFO: renamed from: d */
    public final boolean f17646d;

    /* JADX INFO: renamed from: e */
    public final long f17647e;

    public zzgkh(zzimt zzimtVar, zzimt zzimtVar2, zzimt zzimtVar3, boolean z, long j2) {
        this.f17643a = zzimtVar;
        this.f17644b = zzimtVar2;
        this.f17645c = zzimtVar3;
        this.f17646d = z;
        this.f17647e = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6997a(Context context, View view, Activity activity) {
        return ((zzglm) this.f17644b.zzb()).mo7027a(context, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    /* JADX INFO: renamed from: b */
    public final void mo6998b(InputEvent inputEvent) {
        ((zzglm) this.f17644b.zzb()).mo7028b(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    /* JADX INFO: renamed from: c */
    public final int mo6999c() {
        return ((zzglm) this.f17644b.zzb()).mo7029c();
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    /* JADX INFO: renamed from: d */
    public final ListenableFuture mo7000d(Context context) {
        return ((zzglm) this.f17644b.zzb()).mo7030d(context);
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    /* JADX INFO: renamed from: e */
    public final ListenableFuture mo7001e(Context context, String str, View view) {
        return ((zzglm) this.f17644b.zzb()).mo7031e(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final String zza() {
        return ((zzglm) this.f17644b.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final ListenableFuture zzb() {
        boolean z = this.f17646d;
        zzhbu zzhbuVar = zzhbu.f18506s;
        if (z) {
            return (zzhbx) zzhcf.m7374h((zzhbx) zzhcf.m7374h((zzhbx) zzhcf.m7371e(zzhbx.m7360q(((zzgkz) this.f17643a.zzb()).m7019a()), Throwable.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzgkd
                @Override // com.google.android.gms.internal.ads.zzgti
                public final /* synthetic */ Object apply(Object obj) {
                    return zzgky.f17671s;
                }
            }, zzhbuVar), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgke
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                    return ((zzgng) this.f17640a.f17645c.zzb()).zza();
                }
            }, zzhbuVar), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgkf
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                    return ((zzglm) this.f17641a.f17644b.zzb()).zzb();
                }
            }, zzhbuVar);
        }
        zzhbx zzhbxVar = (zzhbx) zzhcf.m7374h((zzhbx) zzhcf.m7371e(zzhbx.m7360q(((zzgng) this.f17645c.zzb()).zza()), Throwable.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzgkg
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return Boolean.FALSE;
            }
        }, zzhbuVar), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgkb
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                return ((zzglm) this.f17637a.f17644b.zzb()).zzb();
            }
        }, zzhbuVar);
        zzhbxVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgkc
            @Override // java.lang.Runnable
            public final void run() {
                zzgkh zzgkhVar = this.f17638s;
                final zzgkz zzgkzVar = (zzgkz) zzgkhVar.f17643a.zzb();
                long j2 = zzgkhVar.f17647e;
                if (j2 > 0) {
                    zzgkzVar.f17682e.mo6967a(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgkx
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzgkzVar.m7019a();
                        }
                    }, j2);
                } else {
                    zzgkzVar.m7019a();
                }
            }
        }, zzhbuVar);
        return zzhbxVar;
    }
}
