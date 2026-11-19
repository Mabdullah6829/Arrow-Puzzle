package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zaw;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class SignInClientImpl extends GmsClient<zaf> implements com.google.android.gms.signin.zae {

    /* JADX INFO: renamed from: u */
    public final boolean f23180u;

    /* JADX INFO: renamed from: v */
    public final ClientSettings f23181v;

    /* JADX INFO: renamed from: w */
    public final Bundle f23182w;

    /* JADX INFO: renamed from: x */
    public final Integer f23183x;

    public SignInClientImpl(Context context, Looper looper, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f23180u = true;
        this.f23181v = clientSettings;
        this.f23182w = bundle;
        this.f23183x = clientSettings.f4413g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.zae
    /* JADX INFO: renamed from: b */
    public final void mo10758b(zac zacVar) {
        GoogleSignInAccount googleSignInAccountM3368H;
        try {
            Account account = this.f23181v.f4407a;
            if (account == null) {
                account = new Account(BaseGmsClient.DEFAULT_ACCOUNT, "com.google");
            }
            if (BaseGmsClient.DEFAULT_ACCOUNT.equals(account.name)) {
                Storage storageM3372a = Storage.m3372a(getContext());
                String strM3373b = storageM3372a.m3373b("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(strM3373b)) {
                    StringBuilder sb = new StringBuilder(20 + String.valueOf(strM3373b).length());
                    sb.append("googleSignInAccount:");
                    sb.append(strM3373b);
                    String strM3373b2 = storageM3372a.m3373b(sb.toString());
                    if (strM3373b2 != null) {
                        try {
                            googleSignInAccountM3368H = GoogleSignInAccount.m3368H(strM3373b2);
                        } catch (JSONException unused) {
                            googleSignInAccountM3368H = null;
                        }
                    }
                }
                googleSignInAccountM3368H = null;
            } else {
                googleSignInAccountM3368H = null;
            }
            Integer num = this.f23183x;
            Preconditions.m3544h(num);
            zaw zawVar = new zaw(2, account, num.intValue(), googleSignInAccountM3368H);
            zaf zafVar = (zaf) getService();
            zai zaiVar = new zai(1, zawVar);
            Parcel parcelM9076u = zafVar.m9076u();
            com.google.android.gms.internal.base.zac.m9078b(parcelM9076u, zaiVar);
            com.google.android.gms.internal.base.zac.m9079c(parcelM9076u, zacVar);
            zafVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            try {
                zafVar.f21545s.transact(12, parcelM9076u, parcelObtain, 0);
                parcelObtain.readException();
            } finally {
                parcelM9076u.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zacVar.mo3492l1(new zak(1, new ConnectionResult(null, null, 8), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.signin.zae
    /* JADX INFO: renamed from: c */
    public final void mo10759c() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof zaf ? (zaf) iInterfaceQueryLocalInterface : new zaf(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        ClientSettings clientSettings = this.f23181v;
        boolean zEquals = getContext().getPackageName().equals(clientSettings.f4410d);
        Bundle bundle = this.f23182w;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", clientSettings.f4410d);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return this.f23180u;
    }
}
