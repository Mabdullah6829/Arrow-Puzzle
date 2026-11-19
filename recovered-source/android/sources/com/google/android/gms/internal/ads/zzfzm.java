package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfzm {

    /* JADX INFO: renamed from: a */
    public final zzfzp f16863a;

    /* JADX INFO: renamed from: b */
    public final boolean f16864b = true;

    public zzfzm(zzfzp zzfzpVar) {
        this.f16863a = zzfzpVar;
    }

    /* JADX INFO: renamed from: a */
    public static zzfzm m6822a(Context context, String str) {
        zzfzp zzfznVar;
        try {
            try {
                try {
                    IBinder iBinderM3706b = DynamiteModule.m3700c(context, DynamiteModule.f4717b, ModuleDescriptor.MODULE_ID).m3706b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderM3706b == null) {
                        zzfznVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderM3706b.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfznVar = iInterfaceQueryLocalInterface instanceof zzfzp ? (zzfzp) iInterfaceQueryLocalInterface : new zzfzn(iBinderM3706b, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                    }
                    zzfznVar.mo6825e2(new ObjectWrapper(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfzm(zzfznVar);
                } catch (Exception e) {
                    throw new zzfyp(e);
                }
            } catch (RemoteException | zzfyp | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfzm(new zzfzq());
            }
        } catch (Exception e2) {
            throw new zzfyp(e2);
        }
    }
}
