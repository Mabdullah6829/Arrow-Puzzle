package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcj {

    /* JADX INFO: renamed from: a */
    public static AudioManager f10183a;

    /* JADX INFO: renamed from: a */
    public static synchronized AudioManager m5503a(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f10183a = null;
            }
            AudioManager audioManager = f10183a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                zzff zzffVar = zzdp.f12520a;
                final zzdt zzdtVar = new zzdt();
                zzdi.m5922a().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzci
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcj.f10183a = (AudioManager) applicationContext.getSystemService("audio");
                        zzdtVar.m6050a();
                    }
                });
                zzdtVar.m6051b();
                AudioManager audioManager2 = f10183a;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                throw null;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f10183a = audioManager3;
            if (audioManager3 != null) {
                return audioManager3;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
