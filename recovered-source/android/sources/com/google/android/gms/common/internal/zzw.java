package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzw extends com.google.android.gms.internal.common.zzb implements zzx {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f4554s = 0;

    public zzw() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.internal.common.zzb
    /* JADX INFO: renamed from: u */
    public final boolean mo3533u(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            IObjectWrapper iObjectWrapperMo3615d = mo3615d();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.m9104b(parcel2, iObjectWrapperMo3615d);
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        int iMo3614a = mo3614a();
        parcel2.writeNoException();
        parcel2.writeInt(iMo3614a);
        return true;
    }
}
