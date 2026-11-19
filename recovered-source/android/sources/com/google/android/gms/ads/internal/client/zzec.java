package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzec extends zzbem implements zzed {
    public zzec() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            ((zzfv) this).mo2934a();
        } else if (i2 == 2) {
            ((zzfv) this).mo2935b();
        } else if (i2 == 3) {
            ((zzfv) this).mo2936c();
        } else if (i2 == 4) {
            ((zzfv) this).zzh();
        } else {
            if (i2 != 5) {
                return false;
            }
            boolean zM4813a = zzben.m4813a(parcel);
            zzben.m4818f(parcel);
            ((zzfv) this).mo2933J2(zM4813a);
        }
        parcel2.writeNoException();
        return true;
    }
}
