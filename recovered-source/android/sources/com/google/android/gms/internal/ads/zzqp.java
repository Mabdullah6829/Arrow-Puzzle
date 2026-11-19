package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.Spatializer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqp {

    /* JADX INFO: renamed from: a */
    public final Context f20645a;

    /* JADX INFO: renamed from: b */
    public final zzqo f20646b;

    /* JADX INFO: renamed from: c */
    public final Handler f20647c;

    /* JADX INFO: renamed from: d */
    public final zzql f20648d;

    /* JADX INFO: renamed from: e */
    public final BroadcastReceiver f20649e;

    /* JADX INFO: renamed from: f */
    public final zzqm f20650f;

    /* JADX INFO: renamed from: g */
    public zzaco f20651g;

    /* JADX INFO: renamed from: h */
    public zzqj f20652h;

    /* JADX INFO: renamed from: i */
    public AudioDeviceInfo f20653i;

    /* JADX INFO: renamed from: j */
    public zzd f20654j;

    /* JADX INFO: renamed from: k */
    public boolean f20655k;

    public zzqp(Context context, zzqo zzqoVar, zzd zzdVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.f20645a = applicationContext;
        this.f20646b = zzqoVar;
        this.f20654j = zzdVar;
        this.f20653i = audioDeviceInfo;
        String str = zzfm.f16091a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f20647c = handler;
        this.f20648d = new zzql(this);
        this.f20649e = new zzqn(this);
        zzgwt zzgwtVar = zzqj.f20631e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f20650f = uriFor != null ? new zzqm(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    /* JADX INFO: renamed from: a */
    public final List m8837a() {
        zzaco zzacoVar;
        Spatializer spatializer;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 32 || (zzacoVar = this.f20651g) == null) {
            zzgzi zzgziVar = zzgwt.f18303t;
            return zzgyo.f18355w;
        }
        Spatializer spatializer2 = zzacoVar.f4917a;
        if (spatializer2 == null || !zzacoVar.f4918b || !spatializer2.isAvailable() || (spatializer = zzacoVar.f4917a) == null || !spatializer.isEnabled()) {
            zzgzi zzgziVar2 = zzgwt.f18303t;
            return zzgyo.f18355w;
        }
        if (i2 < 36) {
            return zzgwt.m7216n(252);
        }
        Spatializer spatializer3 = zzacoVar.f4917a;
        spatializer3.getClass();
        return AbstractC5147a.m3718c(spatializer3).getSpatializedChannelMasks();
    }

    /* JADX INFO: renamed from: b */
    public final void m8838b(zzqj zzqjVar) {
        if (!this.f20655k || zzqjVar.equals(this.f20652h)) {
            return;
        }
        this.f20652h = zzqjVar;
        zztg zztgVar = ((zztd) this.f20646b).f20836a;
        zztgVar.m8864e();
        zzqj zzqjVar2 = zztgVar.f20846e;
        if (zzqjVar2 == null || zzqjVar.equals(zzqjVar2)) {
            return;
        }
        zztgVar.f20846e = zzqjVar;
        zzeg zzegVar = zztgVar.f20844c;
        if (zzegVar != null) {
            zzegVar.m6197c(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zztc
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj) {
                    ((zzre) obj).zza();
                }
            });
            zzegVar.m6198d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8839c() {
        List listM8837a = m8837a();
        zzd zzdVar = this.f20654j;
        AudioDeviceInfo audioDeviceInfo = this.f20653i;
        zzgwt zzgwtVar = zzqj.f20631e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f20645a;
        m8838b(zzqj.m8834a(context, context.registerReceiver(null, intentFilter), zzdVar, audioDeviceInfo, listM8837a));
    }
}
