package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends zza {

    /* JADX INFO: renamed from: g */
    public final IBinder f4526g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BaseGmsClient f4527h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(BaseGmsClient baseGmsClient, int i2, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i2, bundle);
        this.f4527h = baseGmsClient;
        this.f4526g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    /* JADX INFO: renamed from: b */
    public final boolean mo3606b() {
        IBinder iBinder = this.f4526g;
        try {
            Preconditions.m3544h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            BaseGmsClient baseGmsClient = this.f4527h;
            if (!baseGmsClient.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = baseGmsClient.getServiceDescriptor();
                Log.w("GmsClient", AbstractC1456a.m2451r(new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", serviceDescriptor, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = baseGmsClient.createServiceInterface(iBinder);
            if (iInterfaceCreateServiceInterface == null || !(baseGmsClient.zze(2, 4, iInterfaceCreateServiceInterface) || baseGmsClient.zze(3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            baseGmsClient.zzn(null);
            BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacksZzk = baseGmsClient.zzk();
            Bundle connectionHint = baseGmsClient.getConnectionHint();
            if (baseConnectionCallbacksZzk == null) {
                return true;
            }
            baseGmsClient.zzk().onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // com.google.android.gms.common.internal.zza
    /* JADX INFO: renamed from: c */
    public final void mo3607c(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.f4527h;
        if (baseGmsClient.zzl() != null) {
            baseGmsClient.zzl().onConnectionFailed(connectionResult);
        }
        baseGmsClient.onConnectionFailed(connectionResult);
    }
}
