package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbks;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzgax;

/* JADX INFO: loaded from: classes.dex */
abstract class zzax {

    /* JADX INFO: renamed from: a */
    public static final zzco f3084a;

    static {
        zzco zzcmVar = null;
        try {
            Object objNewInstance = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzcmVar = iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to instantiate ClientApi class.");
        }
        f3084a = zzcmVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo2796a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo2797b();

    /* JADX INFO: renamed from: c */
    public abstract Object mo2798c(zzco zzcoVar);

    /* JADX INFO: renamed from: d */
    public final Object m2811d(Context context, boolean z) {
        boolean z2;
        Object objMo2797b;
        Object objMo2798c;
        if (!z) {
            com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzay.f3085g.f3086a;
            zzgax zzgaxVar = com.google.android.gms.ads.internal.util.client.zzf.f3409b;
            if (GoogleApiAvailabilityLight.f4157b.m3403c(context, 12451000) != 0) {
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(DynamiteModule.m3699a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.m3701d(context, ModuleDescriptor.MODULE_ID, false));
        zzbix.m5032a(context);
        if (((Boolean) zzbks.f9013a.m5057c()).booleanValue()) {
            z2 = false;
        } else {
            boolean z5 = z | z4;
            if (((Boolean) zzbks.f9014b.m5057c()).booleanValue()) {
                z2 = true;
                z3 = true;
            } else {
                z3 = z5;
                z2 = false;
            }
        }
        zzco zzcoVar = f3084a;
        Object objMo2798c2 = null;
        if (z3) {
            if (zzcoVar != null) {
                try {
                    objMo2798c = mo2798c(zzcoVar);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.m3074g("Cannot invoke local loader using ClientApi class.", e);
                    objMo2798c = null;
                }
                if (objMo2798c == null && !z2) {
                    try {
                        objMo2798c2 = mo2797b();
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.m3074g("Cannot invoke remote loader.", e2);
                    }
                    objMo2798c = objMo2798c2;
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("ClientApi class cannot be loaded.");
            }
            objMo2798c = null;
            if (objMo2798c == null) {
                objMo2798c2 = mo2797b();
                objMo2798c = objMo2798c2;
            }
        } else {
            try {
                objMo2797b = mo2797b();
            } catch (RemoteException e3) {
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Cannot invoke remote loader.", e3);
                objMo2797b = null;
            }
            if (objMo2797b == null) {
                int iIntValue = ((Long) zzblg.f9123a.m5057c()).intValue();
                zzay zzayVar = zzay.f3085g;
                if (zzayVar.f3090e.nextInt(iIntValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzayVar.f3086a.m3047l(context, zzayVar.f3089d.f3396s, bundle);
                }
            }
            if (objMo2797b == null) {
                if (zzcoVar != null) {
                    try {
                        objMo2798c2 = mo2798c(zzcoVar);
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzo.m3074g("Cannot invoke local loader using ClientApi class.", e4);
                    }
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("ClientApi class cannot be loaded.");
                }
                objMo2798c = objMo2798c2;
            } else {
                objMo2798c = objMo2797b;
            }
        }
        return objMo2798c == null ? mo2796a() : objMo2798c;
    }
}
