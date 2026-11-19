package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zam {

    /* JADX INFO: renamed from: s */
    public final Set f4440s;

    /* JADX INFO: renamed from: t */
    public final Account f4441t;

    /* JADX WARN: Illegal instructions before constructor call */
    public GmsClient(Context context, Looper looper, int i2, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        GmsClientSupervisor gmsClientSupervisorM3530a = GmsClientSupervisor.m3530a(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f4154e;
        Preconditions.m3544h(connectionCallbacks);
        Preconditions.m3544h(onConnectionFailedListener);
        super(context, looper, gmsClientSupervisorM3530a, googleApiAvailability, i2, new zak(connectionCallbacks), new zal(onConnectionFailedListener), clientSettings.f4411e);
        this.f4441t = clientSettings.f4407a;
        Set set = clientSettings.f4409c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f4440s = set;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    /* JADX INFO: renamed from: a */
    public final Set mo3422a() {
        return requiresSignIn() ? this.f4440s : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account getAccount() {
        return this.f4441t;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Executor getBindServiceExecutor() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Set getScopes() {
        return this.f4440s;
    }
}
