package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvp extends VideoController.VideoLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final zzdqb f13117a;

    public zzdvp(zzdqb zzdqbVar) {
        this.f13117a = zzdqbVar;
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    /* JADX INFO: renamed from: a */
    public final void mo2762a() {
        com.google.android.gms.ads.internal.client.zzea zzeaVarM6012r = this.f13117a.m6012r();
        com.google.android.gms.ads.internal.client.zzed zzedVarMo2923j = null;
        if (zzeaVarM6012r != null) {
            try {
                zzedVarMo2923j = zzeaVarM6012r.mo2923j();
            } catch (RemoteException unused) {
            }
        }
        if (zzedVarMo2923j == null) {
            return;
        }
        try {
            zzedVarMo2923j.zzh();
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    /* JADX INFO: renamed from: b */
    public final void mo2763b() {
        com.google.android.gms.ads.internal.client.zzea zzeaVarM6012r = this.f13117a.m6012r();
        com.google.android.gms.ads.internal.client.zzed zzedVarMo2923j = null;
        if (zzeaVarM6012r != null) {
            try {
                zzedVarMo2923j = zzeaVarM6012r.mo2923j();
            } catch (RemoteException unused) {
            }
        }
        if (zzedVarMo2923j == null) {
            return;
        }
        try {
            zzedVarMo2923j.mo2936c();
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    /* JADX INFO: renamed from: c */
    public final void mo2764c() {
        com.google.android.gms.ads.internal.client.zzea zzeaVarM6012r = this.f13117a.m6012r();
        com.google.android.gms.ads.internal.client.zzed zzedVarMo2923j = null;
        if (zzeaVarM6012r != null) {
            try {
                zzedVarMo2923j = zzeaVarM6012r.mo2923j();
            } catch (RemoteException unused) {
            }
        }
        if (zzedVarMo2923j == null) {
            return;
        }
        try {
            zzedVarMo2923j.mo2934a();
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Unable to call onVideoEnd()", e);
        }
    }
}
