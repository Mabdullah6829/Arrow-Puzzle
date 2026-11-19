package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbmt extends zzbem implements zzbmu {
    public zzbmt() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            IObjectWrapper iObjectWrapperM2440g = AbstractC1456a.m2440g(parcel, parcel);
            zzdqu zzdquVar = (zzdqu) this;
            synchronized (zzdquVar) {
                Object objM3697u0 = ObjectWrapper.m3697u0(iObjectWrapperM2440g);
                if (objM3697u0 instanceof zzdpw) {
                    zzdpw zzdpwVar = zzdquVar.f12671w;
                    if (zzdpwVar != null) {
                        zzdpwVar.m5992s(zzdquVar);
                    }
                    zzdpw zzdpwVar2 = (zzdpw) objM3697u0;
                    if (zzdpwVar2.f12571p.mo6015b()) {
                        zzdquVar.f12671w = zzdpwVar2;
                        zzdpwVar2.m5991r(zzdquVar);
                        zzdquVar.f12671w.m5980g(zzdquVar.mo6021D0());
                    } else {
                        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3070c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                    }
                } else {
                    int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Not an instance of InternalNativeAd. This is most likely a transient error");
                }
            }
        } else if (i2 == 2) {
            zzdqu zzdquVar2 = (zzdqu) this;
            synchronized (zzdquVar2) {
                zzdpw zzdpwVar3 = zzdquVar2.f12671w;
                if (zzdpwVar3 != null) {
                    zzdpwVar3.m5992s(zzdquVar2);
                    zzdquVar2.f12671w = null;
                }
            }
        } else {
            if (i2 != 3) {
                return false;
            }
            IObjectWrapper iObjectWrapperM2440g2 = AbstractC1456a.m2440g(parcel, parcel);
            zzdqu zzdquVar3 = (zzdqu) this;
            synchronized (zzdquVar3) {
                try {
                    if (zzdquVar3.f12671w != null) {
                        Object objM3697u1 = ObjectWrapper.m3697u0(iObjectWrapperM2440g2);
                        if (!(objM3697u1 instanceof View)) {
                            int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                        }
                        zzdpw zzdpwVar4 = zzdquVar3.f12671w;
                        View view = (View) objM3697u1;
                        synchronized (zzdpwVar4) {
                            zzdpwVar4.f12569n.mo5948a(view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
