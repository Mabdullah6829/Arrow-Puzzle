package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zabn implements BaseGmsClient.ConnectionProgressReportCallbacks, zacl {

    /* JADX INFO: renamed from: a */
    public final Api.Client f4308a;

    /* JADX INFO: renamed from: b */
    public final ApiKey f4309b;

    /* JADX INFO: renamed from: c */
    public IAccountAccessor f4310c;

    /* JADX INFO: renamed from: d */
    public Set f4311d;

    /* JADX INFO: renamed from: e */
    public boolean f4312e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ GoogleApiManager f4313f;

    public zabn(GoogleApiManager googleApiManager, Api.Client client, ApiKey apiKey) {
        Objects.requireNonNull(googleApiManager);
        this.f4313f = googleApiManager;
        this.f4310c = null;
        this.f4311d = null;
        this.f4312e = false;
        this.f4308a = client;
        this.f4309b = apiKey;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    /* JADX INFO: renamed from: a */
    public final void mo3491a(ConnectionResult connectionResult) {
        this.f4313f.f4244F.post(new zabm(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacl
    /* JADX INFO: renamed from: b */
    public final void mo3512b(ConnectionResult connectionResult) {
        zabk zabkVar = (zabk) this.f4313f.f4240B.get(this.f4309b);
        if (zabkVar != null) {
            zabkVar.m3507l(connectionResult);
        }
    }
}
