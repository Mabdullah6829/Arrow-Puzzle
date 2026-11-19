package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvz extends com.google.android.gms.ads.internal.client.zzdz {

    /* JADX INFO: renamed from: s */
    public final Object f9436s = new Object();

    /* JADX INFO: renamed from: t */
    public volatile com.google.android.gms.ads.internal.client.zzed f9437t;

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: F */
    public final void mo2927F() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: K2 */
    public final void mo2921K2(com.google.android.gms.ads.internal.client.zzed zzedVar) {
        synchronized (this.f9436s) {
            this.f9437t = zzedVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: a */
    public final void mo2928a() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: b */
    public final void mo2929b() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: e */
    public final float mo2922e() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: g */
    public final boolean mo2930g() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: i */
    public final boolean mo2931i() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: j */
    public final com.google.android.gms.ads.internal.client.zzed mo2923j() {
        com.google.android.gms.ads.internal.client.zzed zzedVar;
        synchronized (this.f9436s) {
            zzedVar = this.f9437t;
        }
        return zzedVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: o0 */
    public final void mo2932o0(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() throws RemoteException {
        throw new RemoteException();
    }
}
