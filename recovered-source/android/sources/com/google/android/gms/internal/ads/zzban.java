package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzban implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbao f7440s;

    public zzban(zzbao zzbaoVar) {
        this.f7440s = zzbaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbao zzbaoVar = this.f7440s;
        synchronized (zzbaoVar.f7448G) {
            if (zzbaoVar.f7449H) {
                return;
            }
            zzbaoVar.f7449H = true;
            try {
                zzbaoVar.m4689m();
            } catch (Exception e) {
                this.f7440s.f7456x.mo6762c(2023, -1L, e);
            }
            zzbao zzbaoVar2 = this.f7440s;
            synchronized (zzbaoVar2.f7448G) {
                zzbaoVar2.f7449H = false;
            }
        }
    }
}
