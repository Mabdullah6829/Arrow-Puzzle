package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbap implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbaq f7459s;

    public zzbap(zzbaq zzbaqVar) {
        this.f7459s = zzbaqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        zzbaq zzbaqVar = this.f7459s;
        if (zzbaqVar.f7464b != null) {
            return;
        }
        synchronized (zzbaq.f7460c) {
            if (zzbaqVar.f7464b != null) {
                return;
            }
            boolean z = false;
            try {
                zBooleanValue = ((Boolean) zzbix.f8711q3.m5057c()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzbaq.f7461d = zzfzm.m6822a(this.f7459s.f7463a.f7547a, "ADSHIELD");
                } catch (Throwable unused2) {
                }
            }
            z = zBooleanValue;
            this.f7459s.f7464b = Boolean.valueOf(z);
            zzbaq.f7460c.open();
        }
    }
}
