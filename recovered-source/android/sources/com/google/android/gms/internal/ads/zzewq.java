package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewq implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15052a;

    /* JADX INFO: renamed from: b */
    public final Context f15053b;

    public zzewq(Context context, zzhcp zzhcpVar) {
        this.f15052a = zzhcpVar;
        this.f15053b = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15052a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzewp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                int iMo3244f;
                int streamMaxVolume;
                AudioManager audioManager = (AudioManager) this.f15051a.f15053b.getSystemService("audio");
                com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                float fM3087a = zztVar.f3709i.m3087a();
                com.google.android.gms.ads.internal.util.zzaa zzaaVar = zztVar.f3709i;
                synchronized (zzaaVar) {
                    z = zzaaVar.f3451a;
                }
                if (audioManager == null) {
                    return new zzewr(-1, false, false, -1, -1, -1, -1, -1, fM3087a, z, true);
                }
                int mode = audioManager.getMode();
                boolean zIsMusicActive = audioManager.isMusicActive();
                boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
                int streamVolume = audioManager.getStreamVolume(3);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8754sc)).booleanValue()) {
                    iMo3244f = zztVar.f3706f.mo3244f(audioManager);
                    streamMaxVolume = audioManager.getStreamMaxVolume(3);
                } else {
                    iMo3244f = -1;
                    streamMaxVolume = -1;
                }
                return new zzewr(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, iMo3244f, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fM3087a, z, false);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 13;
    }
}
