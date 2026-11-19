package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbod extends UnifiedNativeAd {

    /* JADX INFO: renamed from: a */
    public final zzboc f9187a;

    /* JADX INFO: renamed from: c */
    public final zzbmm f9189c;

    /* JADX INFO: renamed from: b */
    public final ArrayList f9188b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final VideoController f9190d = new VideoController();

    /* JADX INFO: renamed from: e */
    public final ArrayList f9191e = new ArrayList();

    public zzbod(zzboc zzbocVar) {
        zzbml zzbmjVar;
        IBinder iBinder;
        this.f9187a = zzbocVar;
        zzbmm zzbmmVar = null;
        try {
            List listMo5083b = zzbocVar.mo5083b();
            if (listMo5083b != null) {
                for (Object obj : listMo5083b) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        zzbmjVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbmjVar = iInterfaceQueryLocalInterface instanceof zzbml ? (zzbml) iInterfaceQueryLocalInterface : new zzbmj(iBinder);
                    }
                    if (zzbmjVar != null) {
                        this.f9188b.add(new zzbmm(zzbmjVar));
                    }
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
        try {
            List listMo5091x = this.f9187a.mo5091x();
            if (listMo5091x != null) {
                for (Object obj2 : listMo5091x) {
                    com.google.android.gms.ads.internal.client.zzdg zzdgVarM2909k4 = obj2 instanceof IBinder ? com.google.android.gms.ads.internal.client.zzdf.m2909k4((IBinder) obj2) : null;
                    if (zzdgVarM2909k4 != null) {
                        this.f9191e.add(new com.google.android.gms.ads.internal.client.zzdh(zzdgVarM2909k4));
                    }
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e2);
        }
        try {
            zzbml zzbmlVarZzh = this.f9187a.zzh();
            if (zzbmlVarZzh != null) {
                zzbmmVar = new zzbmm(zzbmlVarZzh);
            }
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e3);
        }
        this.f9189c = zzbmmVar;
        try {
            if (this.f9187a.mo5086f() != null) {
                new zzbmf(this.f9187a.mo5086f());
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e4);
        }
    }
}
