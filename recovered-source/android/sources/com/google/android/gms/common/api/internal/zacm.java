package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zacm extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: z */
    public static final Api.AbstractClientBuilder f4341z = com.google.android.gms.signin.zad.f23194a;

    /* JADX INFO: renamed from: s */
    public final Context f4342s;

    /* JADX INFO: renamed from: t */
    public final Handler f4343t;

    /* JADX INFO: renamed from: u */
    public final Api.AbstractClientBuilder f4344u = f4341z;

    /* JADX INFO: renamed from: v */
    public final Set f4345v;

    /* JADX INFO: renamed from: w */
    public final ClientSettings f4346w;

    /* JADX INFO: renamed from: x */
    public com.google.android.gms.signin.zae f4347x;

    /* JADX INFO: renamed from: y */
    public zacl f4348y;

    public zacm(Context context, com.google.android.gms.internal.base.zao zaoVar, ClientSettings clientSettings) {
        this.f4342s = context;
        this.f4343t = zaoVar;
        this.f4346w = clientSettings;
        this.f4345v = clientSettings.f4408b;
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    /* JADX INFO: renamed from: l1 */
    public final void mo3492l1(com.google.android.gms.signin.internal.zak zakVar) {
        this.f4343t.post(new zack(this, zakVar));
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f4347x.mo10758b(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f4348y.mo3512b(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        zabn zabnVar = (zabn) this.f4348y;
        zabk zabkVar = (zabk) zabnVar.f4313f.f4240B.get(zabnVar.f4309b);
        if (zabkVar != null) {
            if (zabkVar.f4291A) {
                zabkVar.m3507l(new ConnectionResult(null, null, 17));
            } else {
                zabkVar.onConnectionSuspended(i2);
            }
        }
    }
}
