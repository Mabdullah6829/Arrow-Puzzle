package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyp extends NativeAd.AdChoicesInfo {

    /* JADX INFO: renamed from: a */
    public final ArrayList f9554a = new ArrayList();

    public zzbyp(zzbme zzbmeVar) {
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
                zzbml zzbmlVarM5066k4 = obj instanceof IBinder ? zzbmk.m5066k4((IBinder) obj) : null;
                if (zzbmlVarM5066k4 != null) {
                    this.f9554a.add(new zzbyr(zzbmlVarM5066k4));
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e2);
        }
    }
}
