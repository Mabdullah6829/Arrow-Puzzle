package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesm extends com.google.android.gms.ads.internal.client.zzbm {

    /* JADX INFO: renamed from: s */
    public final zzetv f14800s;

    public zzesm(Context context, zzcnq zzcnqVar, zzflf zzflfVar, zzdql zzdqlVar, com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        zzetx zzetxVar = new zzetx(zzdqlVar, zzcnqVar.mo5686d());
        zzetxVar.f14881b.f14840s.set(zzbhVar);
        this.f14800s = new zzetv(new zzeuh(zzcnqVar, context, zzetxVar, zzflfVar), zzflfVar.f16015c);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    /* JADX INFO: renamed from: Z */
    public final void mo2824Z(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.f14800s.m6355a(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    /* JADX INFO: renamed from: b */
    public final synchronized String mo2825b() {
        String str;
        zzetv zzetvVar = this.f14800s;
        synchronized (zzetvVar) {
            str = null;
            try {
                zzdcs zzdcsVar = zzetvVar.f14877c;
                str = zzdcsVar != null ? zzdcsVar.f12046s : null;
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    /* JADX INFO: renamed from: c */
    public final synchronized boolean mo2826c() {
        boolean z;
        zzetv zzetvVar = this.f14800s;
        synchronized (zzetvVar) {
            zzcyp zzcypVar = zzetvVar.f14875a.f14906f;
            z = zzcypVar != null && zzcypVar.f11787c;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    /* JADX INFO: renamed from: n1 */
    public final synchronized void mo2827n1(com.google.android.gms.ads.internal.client.zzm zzmVar, int i2) {
        this.f14800s.m6355a(zzmVar, i2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzh() {
        String str;
        zzetv zzetvVar = this.f14800s;
        synchronized (zzetvVar) {
            str = null;
            try {
                zzdcs zzdcsVar = zzetvVar.f14877c;
                str = zzdcsVar != null ? zzdcsVar.f12046s : null;
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
        return str;
    }
}
