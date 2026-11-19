package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbmf extends NativeAd.AdChoicesInfo {

    /* JADX INFO: renamed from: a */
    public final zzbme f9174a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f9175b = new ArrayList();

    public zzbmf(zzbme zzbmeVar) {
        IBinder iBinder;
        this.f9174a = zzbmeVar;
        try {
            zzbmeVar.zzb();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
        try {
            ArrayList arrayListZzc = zzbmeVar.zzc();
            int size = arrayListZzc.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListZzc.get(i2);
                i2++;
                zzbml zzbmjVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbmjVar = iInterfaceQueryLocalInterface instanceof zzbml ? (zzbml) iInterfaceQueryLocalInterface : new zzbmj(iBinder);
                }
                if (zzbmjVar != null) {
                    this.f9175b.add(new zzbmm(zzbmjVar));
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e2);
        }
    }
}
