package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbjo extends zzbem implements zzbjp {
    public zzbjo() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(((zzbjn) this).f8906t);
            return true;
        }
        if (i2 == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((zzbjn) this).f8907u);
            return true;
        }
        if (i2 == 3) {
            IObjectWrapper iObjectWrapperM2440g = AbstractC1456a.m2440g(parcel, parcel);
            zzbjn zzbjnVar = (zzbjn) this;
            if (iObjectWrapperM2440g != null) {
                zzbjnVar.f8905s.mo3251a((View) ObjectWrapper.m3697u0(iObjectWrapperM2440g));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 4) {
            ((zzbjn) this).f8905s.zzb();
            parcel2.writeNoException();
            return true;
        }
        if (i2 != 5) {
            return false;
        }
        ((zzbjn) this).f8905s.zzc();
        parcel2.writeNoException();
        return true;
    }
}
