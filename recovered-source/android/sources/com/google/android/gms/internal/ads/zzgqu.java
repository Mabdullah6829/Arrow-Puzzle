package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgqu extends zzbem implements zzgqv {
    public zzgqu() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        final zzgsp zzgspVar;
        if (i2 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzben.m4814b(parcel, Bundle.CREATOR);
        zzben.m4818f(parcel);
        zzgrw zzgrwVar = (zzgrw) this;
        int i3 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i4 = bundle.getInt("uiMode", 0);
        zzgra zzgraVar = new zzgra();
        byte b = (byte) (zzgraVar.f18099e | 1);
        zzgraVar.f18095a = i3;
        byte b2 = (byte) (b | 1);
        zzgraVar.f18099e = b2;
        if (string != null) {
            zzgraVar.f18096b = string;
        }
        zzgraVar.f18097c = i4;
        zzgraVar.f18099e = (byte) (b2 | 2);
        if (bundle.containsKey("userInteracted")) {
            zzgraVar.f18098d = Boolean.valueOf(bundle.getBoolean("userInteracted"));
        }
        zzgrwVar.f18129s.mo3025a(zzgraVar.m7092a());
        if (i3 == 8157 && (zzgspVar = zzgrwVar.f18130t.f18133a) != null) {
            zzgry.f18131c.m7110a("unbind LMD display overlay service", new Object[0]);
            zzgspVar.m7108a(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgsm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgsp zzgspVar2 = zzgspVar;
                    if (zzgspVar2.f18155j != null) {
                        zzgspVar2.f18148c.m7110a("Unbind from service.", new Object[0]);
                        Context context = zzgspVar2.f18147b;
                        ServiceConnection serviceConnection = zzgspVar2.f18154i;
                        serviceConnection.getClass();
                        context.unbindService(serviceConnection);
                        zzgspVar2.f18151f = false;
                        zzgspVar2.f18155j = null;
                        zzgspVar2.f18154i = null;
                        ArrayList arrayList = zzgspVar2.f18150e;
                        synchronized (arrayList) {
                            arrayList.clear();
                        }
                    }
                }
            });
        }
        return true;
    }
}
