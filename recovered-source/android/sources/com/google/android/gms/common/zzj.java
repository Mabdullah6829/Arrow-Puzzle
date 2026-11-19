package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
abstract class zzj extends com.google.android.gms.common.internal.zzw {

    /* JADX INFO: renamed from: t */
    public final int f4671t;

    public zzj(byte[] bArr) {
        Preconditions.m3537a(bArr.length == 25);
        this.f4671t = Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: u0 */
    public static byte[] m3669u0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.gms.common.internal.zzx
    /* JADX INFO: renamed from: a */
    public final int mo3614a() {
        return this.f4671t;
    }

    @Override // com.google.android.gms.common.internal.zzx
    /* JADX INFO: renamed from: d */
    public final IObjectWrapper mo3615d() {
        return new ObjectWrapper(mo3670k0());
    }

    public final boolean equals(Object obj) {
        IObjectWrapper iObjectWrapperMo3615d;
        if (!(obj instanceof com.google.android.gms.common.internal.zzx)) {
            return false;
        }
        try {
            com.google.android.gms.common.internal.zzx zzxVar = (com.google.android.gms.common.internal.zzx) obj;
            if (zzxVar.mo3614a() == this.f4671t && (iObjectWrapperMo3615d = zzxVar.mo3615d()) != null) {
                return Arrays.equals(mo3670k0(), (byte[]) ObjectWrapper.m3697u0(iObjectWrapperMo3615d));
            }
            return false;
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public final int hashCode() {
        return this.f4671t;
    }

    /* JADX INFO: renamed from: k0 */
    public abstract byte[] mo3670k0();
}
