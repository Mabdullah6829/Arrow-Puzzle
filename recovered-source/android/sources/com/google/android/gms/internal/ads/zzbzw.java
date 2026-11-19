package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbzw extends zzbem implements zzbzx {
    /* JADX INFO: renamed from: k4 */
    public static zzbzx m5281k4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof zzbzx ? (zzbzx) iInterfaceQueryLocalInterface : new zzbzv(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }
}
