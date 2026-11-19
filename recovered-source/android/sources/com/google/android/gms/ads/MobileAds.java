package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class MobileAds {
    private MobileAds() {
    }

    private static void setPlugin(String str) {
        zzeu zzeuVarM2944d = zzeu.m2944d();
        synchronized (zzeuVarM2944d.f3169h) {
            Preconditions.m3547k(zzeuVarM2944d.f3170i != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            zzcy zzcyVar = zzeuVarM2944d.f3170i;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.mo2895c0(str);
            } catch (RemoteException e) {
                zzo.m3071d("Unable to set plugin.", e);
            }
        }
    }

    private static void stop() {
        zzeu zzeuVarM2944d = zzeu.m2944d();
        synchronized (zzeuVarM2944d.f3165d) {
            zzeuVarM2944d.f3168g = false;
            zzeuVarM2944d.f3167f = false;
            zzeuVarM2944d.f3166e.clear();
        }
        synchronized (zzeuVarM2944d.f3169h) {
            try {
                zzcy zzcyVar = zzeuVarM2944d.f3170i;
                if (zzcyVar != null) {
                    zzcyVar.mo2897z();
                }
            } catch (RemoteException e) {
                zzo.m3071d("Unable to stop the SDK.", e);
            }
            zzeuVarM2944d.f3170i = null;
            zzem zzemVar = zzeuVarM2944d.f3162a;
            if (zzemVar != null) {
                zzemVar.m3357a();
                zzeuVarM2944d.f3162a = null;
            }
            zzey zzeyVar = zzeuVarM2944d.f3163b;
            if (zzeyVar != null) {
                zzeyVar.m3357a();
                zzeuVarM2944d.f3163b = null;
            }
            zzel zzelVar = zzeuVarM2944d.f3164c;
            if (zzelVar != null) {
                zzelVar.m3357a();
                zzeuVarM2944d.f3164c = null;
            }
        }
    }
}
