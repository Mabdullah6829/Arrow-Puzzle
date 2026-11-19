package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzt;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zack implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ com.google.android.gms.signin.internal.zak f4339s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zacm f4340t;

    public zack(zacm zacmVar, com.google.android.gms.signin.internal.zak zakVar) {
        this.f4339s = zakVar;
        this.f4340t = zacmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor zztVar;
        zacm zacmVar = this.f4340t;
        zacmVar.getClass();
        com.google.android.gms.signin.internal.zak zakVar = this.f4339s;
        ConnectionResult connectionResult = zakVar.f23192t;
        if (connectionResult.m3393H()) {
            com.google.android.gms.common.internal.zay zayVar = zakVar.f23193u;
            Preconditions.m3544h(zayVar);
            ConnectionResult connectionResult2 = zayVar.f4504u;
            if (!connectionResult2.m3393H()) {
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                ((zabn) zacmVar.f4348y).mo3512b(connectionResult2);
                zacmVar.f4347x.disconnect();
                return;
            }
            zacl zaclVar = zacmVar.f4348y;
            IBinder iBinder = zayVar.f4503t;
            if (iBinder == null) {
                zztVar = null;
            } else {
                int i2 = IAccountAccessor.Stub.f4445s;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                zztVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            Set set = zacmVar.f4345v;
            zabn zabnVar = (zabn) zaclVar;
            zabnVar.getClass();
            if (zztVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                zabnVar.mo3512b(new ConnectionResult(null, null, 4));
            } else {
                zabnVar.f4310c = zztVar;
                zabnVar.f4311d = set;
                if (zabnVar.f4312e) {
                    zabnVar.f4308a.getRemoteService(zztVar, set);
                }
            }
        } else {
            ((zabn) zacmVar.f4348y).mo3512b(connectionResult);
        }
        zacmVar.f4347x.disconnect();
    }
}
