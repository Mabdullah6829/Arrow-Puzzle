package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: loaded from: classes.dex */
final class zabm implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ ConnectionResult f4306s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zabn f4307t;

    public zabm(zabn zabnVar, ConnectionResult connectionResult) {
        this.f4306s = connectionResult;
        this.f4307t = zabnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor iAccountAccessor;
        zabn zabnVar = this.f4307t;
        GoogleApiManager googleApiManager = zabnVar.f4313f;
        Api.Client client = zabnVar.f4308a;
        zabk zabkVar = (zabk) googleApiManager.f4240B.get(zabnVar.f4309b);
        if (zabkVar == null) {
            return;
        }
        ConnectionResult connectionResult = this.f4306s;
        if (!connectionResult.m3393H()) {
            zabkVar.m3508m(connectionResult, null);
            return;
        }
        zabnVar.f4312e = true;
        if (client.requiresSignIn()) {
            if (!zabnVar.f4312e || (iAccountAccessor = zabnVar.f4310c) == null) {
                return;
            }
            client.getRemoteService(iAccountAccessor, zabnVar.f4311d);
            return;
        }
        try {
            client.getRemoteService(null, client.mo3422a());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            client.disconnect("Failed to get service from broker.");
            zabkVar.m3508m(new ConnectionResult(null, null, 10), null);
        }
    }
}
