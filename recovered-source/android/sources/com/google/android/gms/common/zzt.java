package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();

    /* JADX INFO: renamed from: s */
    public final String f4702s;

    /* JADX INFO: renamed from: t */
    public final zzk f4703t;

    /* JADX INFO: renamed from: u */
    public final boolean f4704u;

    /* JADX INFO: renamed from: v */
    public final boolean f4705v;

    public zzt(String str, zzk zzkVar, boolean z, boolean z2) {
        this.f4702s = str;
        this.f4703t = zzkVar;
        this.f4704u = z;
        this.f4705v = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f4702s);
        zzk zzkVar = this.f4703t;
        if (zzkVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzkVar = null;
        }
        SafeParcelWriter.m3578d(parcel, 2, zzkVar);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f4704u ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f4705v ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zzt(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f4702s = str;
        zzk zzkVar = null;
        if (iBinder != null) {
            try {
                int i2 = com.google.android.gms.common.internal.zzw.f4554s;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                IObjectWrapper iObjectWrapperMo3615d = (iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.zzx ? (com.google.android.gms.common.internal.zzx) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.zzv(iBinder, "com.google.android.gms.common.internal.ICertData")).mo3615d();
                byte[] bArr = iObjectWrapperMo3615d == null ? null : (byte[]) ObjectWrapper.m3697u0(iObjectWrapperMo3615d);
                if (bArr != null) {
                    zzkVar = new zzk(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f4703t = zzkVar;
        this.f4704u = z;
        this.f4705v = z2;
    }
}
