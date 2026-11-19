package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class zzeib implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcbk f13941a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcbb f13942b;

    public zzeib(zzeiq zzeiqVar, zzcbk zzcbkVar, zzcbb zzcbbVar) {
        this.f13941a = zzcbkVar;
        this.f13942b = zzcbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            zzbio zzbioVar = zzbix.f8158J2;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            boolean zBooleanValue = ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue();
            zzcbb zzcbbVar = this.f13942b;
            if (!zBooleanValue) {
                zzcbbVar.mo5301Q2(parcelFileDescriptor);
                return;
            }
            boolean zBooleanValue2 = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8175K2)).booleanValue();
            zzcbk zzcbkVar = this.f13941a;
            if (zBooleanValue2 && (bundle = zzcbkVar.f9681E) != null) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                bundle.putLong("binder-call-start", System.currentTimeMillis());
            }
            zzcbbVar.mo5300H3(parcelFileDescriptor, zzcbkVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        try {
            zzcbb zzcbbVar = this.f13942b;
            Parcelable.Creator<com.google.android.gms.ads.internal.util.zzba> creator = com.google.android.gms.ads.internal.util.zzba.CREATOR;
            com.google.android.gms.ads.internal.client.zze zzeVarM6532a = zzfmi.m6532a(th);
            zzcbbVar.mo5302m1(new com.google.android.gms.ads.internal.util.zzba(zzgui.m7148a(th.getMessage()) ? zzeVarM6532a.f3107t : th.getMessage(), zzeVarM6532a.f3106s));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Service can't call client", e);
        }
    }
}
