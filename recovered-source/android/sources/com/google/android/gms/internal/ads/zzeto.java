package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeto implements com.google.android.gms.ads.internal.client.zza, zzdlg {

    /* JADX INFO: renamed from: s */
    public com.google.android.gms.ads.internal.client.zzbe f14851s;

    @Override // com.google.android.gms.internal.ads.zzdlg
    /* JADX INFO: renamed from: C */
    public final synchronized void mo5626C() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.f14851s;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    /* JADX INFO: renamed from: F0 */
    public final synchronized void mo5627F0() {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public final synchronized void mo2730k() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.f14851s;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
