package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegf extends zzegk {

    /* JADX INFO: renamed from: A */
    public final zzege f13870A;

    /* JADX INFO: renamed from: y */
    public final Context f13871y;

    /* JADX INFO: renamed from: z */
    public final VersionInfoParcel f13872z;

    public zzegf(Context context, VersionInfoParcel versionInfoParcel, zzege zzegeVar) {
        this.f13871y = context;
        this.f13872z = versionInfoParcel;
        this.f13870A = zzegeVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.f13878t) {
            if (!this.f13880v) {
                this.f13880v = true;
                try {
                    ((zzcax) this.f13882x.getService()).mo5299p0(this.f13872z.f3396s);
                    this.f13870A.zza();
                } catch (RemoteException e) {
                    this.f13870A.mo6204a(e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegk, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.f13870A.mo6204a(new RemoteException("Connection failed: ".concat(String.valueOf(connectionResult.f4144v))));
    }

    @Override // com.google.android.gms.internal.ads.zzegk, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Cannot connect to remote service, fallback to local instance.");
        this.f13870A.mo6204a(new RemoteException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 33), "Connection suspended with cause: ", i2)));
    }
}
