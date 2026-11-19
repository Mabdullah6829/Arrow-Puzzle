package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebr implements zzebc {

    /* JADX INFO: renamed from: a */
    public final long f13508a;

    /* JADX INFO: renamed from: b */
    public final zzebg f13509b;

    /* JADX INFO: renamed from: c */
    public final zzfke f13510c;

    public zzebr(long j2, Context context, zzebg zzebgVar, zzcnq zzcnqVar, String str) {
        this.f13508a = j2;
        this.f13509b = zzebgVar;
        zzcqe zzcqeVar = (zzcqe) zzcnqVar.mo5701t();
        zzcqeVar.mo5786d(context);
        zzcqeVar.f11147c = str;
        this.f13510c = ((zzcqf) zzcqeVar.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    /* JADX INFO: renamed from: a */
    public final void mo6142a(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.f13510c.mo2964S1(zzmVar, new zzebp(this));
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zzb() {
        try {
            zzfke zzfkeVar = this.f13510c;
            zzfkeVar.mo2974u1(new zzebq(this));
            zzfkeVar.mo2971n2(new ObjectWrapper(null));
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zzc() {
    }
}
