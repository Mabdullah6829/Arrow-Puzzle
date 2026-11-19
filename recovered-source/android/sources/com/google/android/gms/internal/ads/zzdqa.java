package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdqa extends com.google.android.gms.ads.internal.client.zzdz {

    /* JADX INFO: renamed from: s */
    public final Object f12607s = new Object();

    /* JADX INFO: renamed from: t */
    public final com.google.android.gms.ads.internal.client.zzea f12608t;

    /* JADX INFO: renamed from: u */
    public final zzbvy f12609u;

    public zzdqa(com.google.android.gms.ads.internal.client.zzea zzeaVar, zzbvy zzbvyVar) {
        this.f12608t = zzeaVar;
        this.f12609u = zzbvyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: F */
    public final void mo2927F() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: K2 */
    public final void mo2921K2(com.google.android.gms.ads.internal.client.zzed zzedVar) {
        synchronized (this.f12607s) {
            try {
                com.google.android.gms.ads.internal.client.zzea zzeaVar = this.f12608t;
                if (zzeaVar != null) {
                    zzeaVar.mo2921K2(zzedVar);
                }
            } catch (Throwable th) {
                throw th;
            }
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
        synchronized (this.f12607s) {
            try {
                com.google.android.gms.ads.internal.client.zzea zzeaVar = this.f12608t;
                if (zzeaVar == null) {
                    return null;
                }
                return zzeaVar.mo2923j();
            } catch (Throwable th) {
                throw th;
            }
        }
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
    public final float zzj() {
        zzbvy zzbvyVar = this.f12609u;
        if (zzbvyVar != null) {
            return zzbvyVar.mo5211C();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() {
        zzbvy zzbvyVar = this.f12609u;
        if (zzbvyVar != null) {
            return zzbvyVar.mo5226t();
        }
        return 0.0f;
    }
}
