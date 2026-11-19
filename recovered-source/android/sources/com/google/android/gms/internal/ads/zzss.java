package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(24)
final class zzss {

    /* JADX INFO: renamed from: a */
    public final AudioTrack f20764a;

    /* JADX INFO: renamed from: b */
    public final zzso f20765b;

    /* JADX INFO: renamed from: c */
    public final Handler f20766c;

    /* JADX INFO: renamed from: d */
    public AudioRouting.OnRoutingChangedListener f20767d;

    public /* synthetic */ zzss(AudioTrack audioTrack, zzso zzsoVar) {
        this.f20764a = audioTrack;
        this.f20765b = zzsoVar;
        Handler handlerM6514p = zzfm.m6514p();
        this.f20766c = handlerM6514p;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzsr
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(final AudioRouting audioRouting) {
                final zzss zzssVar = this.f20763a;
                if (zzssVar.f20767d == null) {
                    return;
                }
                zzdi.m5922a().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
                        if (routedDevice != null) {
                            final zzss zzssVar2 = zzssVar;
                            zzssVar2.f20766c.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzqp zzqpVar;
                                    zzss zzssVar3 = zzssVar2;
                                    if (zzssVar3.f20767d == null || (zzqpVar = ((zztf) zzssVar3.f20765b).f20841a.f20847f) == null) {
                                        return;
                                    }
                                    AudioDeviceInfo audioDeviceInfo = zzqpVar.f20653i;
                                    AudioDeviceInfo audioDeviceInfo2 = routedDevice;
                                    if (audioDeviceInfo2.equals(audioDeviceInfo)) {
                                        return;
                                    }
                                    zzqpVar.f20653i = audioDeviceInfo2;
                                    Context context = zzqpVar.f20645a;
                                    zzd zzdVar = zzqpVar.f20654j;
                                    List listM8837a = zzqpVar.m8837a();
                                    zzgwt zzgwtVar = zzqj.f20631e;
                                    zzqpVar.m8838b(zzqj.m8834a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar, audioDeviceInfo2, listM8837a));
                                }
                            });
                        }
                    }
                });
            }
        };
        this.f20767d = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerM6514p);
    }
}
