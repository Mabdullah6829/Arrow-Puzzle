package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class zap extends com.google.android.gms.internal.base.zaa implements IInterface {
    /* JADX INFO: renamed from: u0 */
    public final IObjectWrapper m3604u0(ObjectWrapper objectWrapper, zaaa zaaaVar) {
        Parcel parcelM9076u = m9076u();
        com.google.android.gms.internal.base.zac.m9079c(parcelM9076u, objectWrapper);
        com.google.android.gms.internal.base.zac.m9078b(parcelM9076u, zaaaVar);
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f21545s.transact(2, parcelM9076u, parcelObtain, 0);
                parcelObtain.readException();
                parcelM9076u.recycle();
                IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcelObtain.readStrongBinder());
                parcelObtain.recycle();
                return iObjectWrapperM3696k0;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcelM9076u.recycle();
            throw th;
        }
    }
}
