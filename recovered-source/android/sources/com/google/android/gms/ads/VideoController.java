package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: loaded from: classes.dex */
public final class VideoController {

    /* JADX INFO: renamed from: a */
    public final Object f2982a = new Object();

    /* JADX INFO: renamed from: b */
    public zzea f2983b;

    /* JADX INFO: renamed from: c */
    public VideoLifecycleCallbacks f2984c;

    public static abstract class VideoLifecycleCallbacks {
        /* JADX INFO: renamed from: a */
        public void mo2762a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo2763b() {
        }

        /* JADX INFO: renamed from: c */
        public void mo2764c() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2760a(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfv zzfvVar;
        synchronized (this.f2982a) {
            this.f2984c = videoLifecycleCallbacks;
            zzea zzeaVar = this.f2983b;
            if (zzeaVar == null) {
                return;
            }
            if (videoLifecycleCallbacks == null) {
                zzfvVar = null;
            } else {
                try {
                    zzfvVar = new zzfv(videoLifecycleCallbacks);
                } catch (RemoteException e) {
                    zzo.m3071d("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
            zzeaVar.mo2921K2(zzfvVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2761b(zzea zzeaVar) {
        synchronized (this.f2982a) {
            try {
                this.f2983b = zzeaVar;
                VideoLifecycleCallbacks videoLifecycleCallbacks = this.f2984c;
                if (videoLifecycleCallbacks != null) {
                    m2760a(videoLifecycleCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
