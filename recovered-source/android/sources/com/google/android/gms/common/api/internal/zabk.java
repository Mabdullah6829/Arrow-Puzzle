package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.collection.ArrayMap;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public final class zabk implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zat {

    /* JADX INFO: renamed from: A */
    public boolean f4291A;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ GoogleApiManager f4295E;

    /* JADX INFO: renamed from: t */
    public final Api.Client f4297t;

    /* JADX INFO: renamed from: u */
    public final ApiKey f4298u;

    /* JADX INFO: renamed from: v */
    public final zaaa f4299v;

    /* JADX INFO: renamed from: y */
    public final int f4302y;

    /* JADX INFO: renamed from: z */
    public final zacm f4303z;

    /* JADX INFO: renamed from: s */
    public final LinkedList f4296s = new LinkedList();

    /* JADX INFO: renamed from: w */
    public final HashSet f4300w = new HashSet();

    /* JADX INFO: renamed from: x */
    public final HashMap f4301x = new HashMap();

    /* JADX INFO: renamed from: B */
    public final ArrayList f4292B = new ArrayList();

    /* JADX INFO: renamed from: C */
    public ConnectionResult f4293C = null;

    /* JADX INFO: renamed from: D */
    public int f4294D = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public zabk(GoogleApiManager googleApiManager, GoogleApi googleApi) {
        this.f4295E = googleApiManager;
        com.google.android.gms.internal.base.zao zaoVar = googleApiManager.f4244F;
        Looper looper = zaoVar.getLooper();
        ClientSettings.Builder builderM3426c = googleApi.m3426c();
        ClientSettings clientSettings = new ClientSettings(builderM3426c.f4414a, builderM3426c.f4415b, builderM3426c.f4416c, builderM3426c.f4417d);
        Api.AbstractClientBuilder abstractClientBuilder = googleApi.f4191d.f4175a;
        Preconditions.m3544h(abstractClientBuilder);
        Api.Client clientMo3418a = abstractClientBuilder.mo3418a(googleApi.f4188a, looper, clientSettings, googleApi.f4192e, this, this);
        AttributionSourceWrapper attributionSourceWrapper = googleApi.f4190c;
        if (attributionSourceWrapper != null && (clientMo3418a instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientMo3418a).setAttributionSourceWrapper(attributionSourceWrapper);
        } else if (attributionSourceWrapper == null || !(clientMo3418a instanceof NonGmsServiceBrokerClient)) {
            String str = googleApi.f4189b;
            if (str != null && (clientMo3418a instanceof BaseGmsClient)) {
                ((BaseGmsClient) clientMo3418a).setAttributionTag(str);
            }
            if (str != null && (clientMo3418a instanceof NonGmsServiceBrokerClient)) {
                ((NonGmsServiceBrokerClient) clientMo3418a).getClass();
            }
        } else {
            ((NonGmsServiceBrokerClient) clientMo3418a).getClass();
        }
        this.f4297t = clientMo3418a;
        this.f4298u = googleApi.f4193f;
        this.f4299v = new zaaa();
        this.f4302y = googleApi.f4195h;
        if (!clientMo3418a.requiresSignIn()) {
            this.f4303z = null;
            return;
        }
        Context context = googleApiManager.f4250w;
        ClientSettings.Builder builderM3426c2 = googleApi.m3426c();
        this.f4303z = new zacm(context, zaoVar, new ClientSettings(builderM3426c2.f4414a, builderM3426c2.f4415b, builderM3426c2.f4416c, builderM3426c2.f4417d));
    }

    /* JADX INFO: renamed from: a */
    public final void m3496a() {
        Api.Client client = this.f4297t;
        GoogleApiManager googleApiManager = this.f4295E;
        Preconditions.m3539c(googleApiManager.f4244F);
        this.f4293C = null;
        m3505j(ConnectionResult.f4140x);
        if (this.f4291A) {
            com.google.android.gms.internal.base.zao zaoVar = googleApiManager.f4244F;
            ApiKey apiKey = this.f4298u;
            zaoVar.removeMessages(11, apiKey);
            googleApiManager.f4244F.removeMessages(9, apiKey);
            this.f4291A = false;
        }
        Iterator it = this.f4301x.values().iterator();
        while (it.hasNext()) {
            RegisterListenerMethod registerListenerMethod = ((zacd) it.next()).f4331a;
            if (m3506k(registerListenerMethod.f4261b) != null) {
                it.remove();
            } else {
                try {
                    registerListenerMethod.mo3480a(client, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    client.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        m3499d();
        m3503h();
    }

    /* JADX INFO: renamed from: b */
    public final void m3497b(int i2) {
        Preconditions.m3539c(this.f4295E.f4244F);
        this.f4293C = null;
        this.f4291A = true;
        String lastDisconnectMessage = this.f4297t.getLastDisconnectMessage();
        zaaa zaaaVar = this.f4299v;
        zaaaVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        zaaaVar.m3488a(true, new Status(20, sb.toString(), null, null));
        ApiKey apiKey = this.f4298u;
        GoogleApiManager googleApiManager = this.f4295E;
        com.google.android.gms.internal.base.zao zaoVar = googleApiManager.f4244F;
        zaoVar.sendMessageDelayed(Message.obtain(zaoVar, 9, apiKey), 5000L);
        com.google.android.gms.internal.base.zao zaoVar2 = googleApiManager.f4244F;
        zaoVar2.sendMessageDelayed(Message.obtain(zaoVar2, 11, apiKey), 120000L);
        SparseIntArray sparseIntArray = googleApiManager.f4252y.f4496a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.f4301x.values().iterator();
        while (it.hasNext()) {
            ((zacd) it.next()).f4333c.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3498c(ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.f4237J) {
            try {
                GoogleApiManager googleApiManager = this.f4295E;
                if (googleApiManager.f4241C != null && googleApiManager.f4242D.contains(this.f4298u)) {
                    zaab zaabVar = googleApiManager.f4241C;
                    int i2 = this.f4302y;
                    zaabVar.getClass();
                    new zam(connectionResult, i2);
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m3499d() {
        LinkedList linkedList = this.f4296s;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zai zaiVar = (zai) arrayList.get(i2);
            if (!this.f4297t.isConnected()) {
                return;
            }
            if (m3500e(zaiVar)) {
                linkedList.remove(zaiVar);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3500e(zai zaiVar) {
        if (!(zaiVar instanceof zac)) {
            zaaa zaaaVar = this.f4299v;
            Api.Client client = this.f4297t;
            zaiVar.mo3519c(zaaaVar, client.requiresSignIn());
            try {
                zaiVar.mo3520d(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                client.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        zac zacVar = (zac) zaiVar;
        Feature featureM3506k = m3506k(zacVar.mo3514f(this));
        if (featureM3506k == null) {
            zaaa zaaaVar2 = this.f4299v;
            Api.Client client2 = this.f4297t;
            zaiVar.mo3519c(zaaaVar2, client2.requiresSignIn());
            try {
                zaiVar.mo3520d(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                client2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f4297t.getClass().getName();
        String str = featureM3506k.f4149s;
        long jM3395w = featureM3506k.m3395w();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(jM3395w).length() + 2);
        AbstractC0271e0.m413u(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(jM3395w);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        GoogleApiManager googleApiManager = this.f4295E;
        if (!googleApiManager.f4245G || !zacVar.mo3515g(this)) {
            zacVar.mo3518b(new UnsupportedApiCallException(featureM3506k));
            return true;
        }
        int iMo3516h = zacVar.mo3516h(this);
        zabl zablVar = new zabl(this.f4298u, featureM3506k);
        ArrayList arrayList = this.f4292B;
        int iIndexOf = arrayList.indexOf(zablVar);
        if (iIndexOf >= 0) {
            zabl zablVar2 = (zabl) arrayList.get(iIndexOf);
            googleApiManager.f4244F.removeMessages(15, zablVar2);
            googleApiManager.f4244F.sendMessageDelayed(Message.obtain(googleApiManager.f4244F, 15, zablVar2), 5000L);
            return false;
        }
        arrayList.add(zablVar);
        googleApiManager.f4244F.sendMessageDelayed(Message.obtain(googleApiManager.f4244F, 15, zablVar), 5000L);
        googleApiManager.f4244F.sendMessageDelayed(Message.obtain(googleApiManager.f4244F, 16, zablVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(iMo3516h));
        if (m3498c(connectionResult)) {
            String str2 = featureM3506k.f4149s;
            long jM3395w2 = featureM3506k.m3395w();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jM3395w2).length());
            sb2.append("A dialog should be displayed for missing feature: ");
            sb2.append(str2);
            sb2.append(", version: ");
            sb2.append(jM3395w2);
            Log.w("GoogleApiManager", sb2.toString());
            return false;
        }
        if (!googleApiManager.m3462f(connectionResult, this.f4302y)) {
            return false;
        }
        String str3 = featureM3506k.f4149s;
        long jM3395w3 = featureM3506k.m3395w();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jM3395w3).length());
        sb3.append("Notification displayed for missing feature: ");
        sb3.append(str3);
        sb3.append(", version: ");
        sb3.append(jM3395w3);
        Log.w("GoogleApiManager", sb3.toString());
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m3501f(Status status, Exception exc, boolean z) {
        Preconditions.m3539c(this.f4295E.f4244F);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f4296s.iterator();
        while (it.hasNext()) {
            zai zaiVar = (zai) it.next();
            if (!z || zaiVar.f4357a == 2) {
                if (status != null) {
                    zaiVar.mo3517a(status);
                } else {
                    zaiVar.mo3518b(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3502g(Status status) {
        Preconditions.m3539c(this.f4295E.f4244F);
        m3501f(status, null, false);
    }

    /* JADX INFO: renamed from: h */
    public final void m3503h() {
        GoogleApiManager googleApiManager = this.f4295E;
        com.google.android.gms.internal.base.zao zaoVar = googleApiManager.f4244F;
        ApiKey apiKey = this.f4298u;
        zaoVar.removeMessages(12, apiKey);
        com.google.android.gms.internal.base.zao zaoVar2 = googleApiManager.f4244F;
        zaoVar2.sendMessageDelayed(zaoVar2.obtainMessage(12, apiKey), googleApiManager.f4246s);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3504i(boolean z) {
        Preconditions.m3539c(this.f4295E.f4244F);
        Api.Client client = this.f4297t;
        if (!client.isConnected() || !this.f4301x.isEmpty()) {
            return false;
        }
        zaaa zaaaVar = this.f4299v;
        if (zaaaVar.f4281a.isEmpty() && zaaaVar.f4282b.isEmpty()) {
            client.disconnect("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        m3503h();
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m3505j(ConnectionResult connectionResult) {
        HashSet hashSet = this.f4300w;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        zal zalVar = (zal) it.next();
        if (Objects.m3535a(connectionResult, ConnectionResult.f4140x)) {
            this.f4297t.getEndpointPackageName();
        }
        zalVar.getClass();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final Feature m3506k(Feature[] featureArr) {
        if (featureArr == null || featureArr.length == 0) {
            return null;
        }
        Feature[] availableFeatures = this.f4297t.getAvailableFeatures();
        if (availableFeatures == null) {
            availableFeatures = new Feature[0];
        }
        ArrayMap arrayMap = new ArrayMap(availableFeatures.length);
        for (Feature feature : availableFeatures) {
            arrayMap.put(feature.f4149s, Long.valueOf(feature.m3395w()));
        }
        for (Feature feature2 : featureArr) {
            Long l2 = (Long) arrayMap.get(feature2.f4149s);
            if (l2 == null || l2.longValue() < feature2.m3395w()) {
                return feature2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m3507l(ConnectionResult connectionResult) {
        Preconditions.m3539c(this.f4295E.f4244F);
        Api.Client client = this.f4297t;
        String name = client.getClass().getName();
        String strValueOf = String.valueOf(connectionResult);
        client.disconnect(AbstractC1456a.m2451r(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        m3508m(connectionResult, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m3508m(ConnectionResult connectionResult, RuntimeException runtimeException) {
        com.google.android.gms.signin.zae zaeVar;
        GoogleApiManager googleApiManager = this.f4295E;
        Preconditions.m3539c(googleApiManager.f4244F);
        zacm zacmVar = this.f4303z;
        if (zacmVar != null && (zaeVar = zacmVar.f4347x) != null) {
            zaeVar.disconnect();
        }
        Preconditions.m3539c(this.f4295E.f4244F);
        this.f4293C = null;
        SparseIntArray sparseIntArray = googleApiManager.f4252y.f4496a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        m3505j(connectionResult);
        if ((this.f4297t instanceof com.google.android.gms.common.internal.service.zau) && connectionResult.f4142t != 24) {
            googleApiManager.f4247t = true;
            com.google.android.gms.internal.base.zao zaoVar = googleApiManager.f4244F;
            zaoVar.sendMessageDelayed(zaoVar.obtainMessage(19), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        }
        int i2 = connectionResult.f4142t;
        if (i2 == 4) {
            m3502g(GoogleApiManager.f4236I);
            return;
        }
        if (i2 == 25) {
            m3502g(GoogleApiManager.m3457c(this.f4298u, connectionResult));
            return;
        }
        LinkedList linkedList = this.f4296s;
        if (linkedList.isEmpty()) {
            this.f4293C = connectionResult;
            return;
        }
        if (runtimeException != null) {
            Preconditions.m3539c(googleApiManager.f4244F);
            m3501f(null, runtimeException, false);
            return;
        }
        if (!googleApiManager.f4245G) {
            m3502g(GoogleApiManager.m3457c(this.f4298u, connectionResult));
            return;
        }
        ApiKey apiKey = this.f4298u;
        m3501f(GoogleApiManager.m3457c(apiKey, connectionResult), null, true);
        if (linkedList.isEmpty() || m3498c(connectionResult) || googleApiManager.m3462f(connectionResult, this.f4302y)) {
            return;
        }
        if (connectionResult.f4142t == 18) {
            this.f4291A = true;
        }
        if (!this.f4291A) {
            m3502g(GoogleApiManager.m3457c(apiKey, connectionResult));
        } else {
            com.google.android.gms.internal.base.zao zaoVar2 = googleApiManager.f4244F;
            zaoVar2.sendMessageDelayed(Message.obtain(zaoVar2, 9, apiKey), 5000L);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m3509n(zai zaiVar) {
        Preconditions.m3539c(this.f4295E.f4244F);
        boolean zIsConnected = this.f4297t.isConnected();
        LinkedList linkedList = this.f4296s;
        if (zIsConnected) {
            if (m3500e(zaiVar)) {
                m3503h();
                return;
            } else {
                linkedList.add(zaiVar);
                return;
            }
        }
        linkedList.add(zaiVar);
        ConnectionResult connectionResult = this.f4293C;
        if (connectionResult == null || !connectionResult.m3394w()) {
            m3511p();
        } else {
            m3508m(this.f4293C, null);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3510o() {
        Preconditions.m3539c(this.f4295E.f4244F);
        Status status = GoogleApiManager.f4235H;
        m3502g(status);
        zaaa zaaaVar = this.f4299v;
        zaaaVar.getClass();
        zaaaVar.m3488a(false, status);
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.f4301x.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            m3509n(new zah(listenerKey, new TaskCompletionSource()));
        }
        m3505j(new ConnectionResult(null, null, 4));
        Api.Client client = this.f4297t;
        if (client.isConnected()) {
            client.onUserSignOut(new zabj(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        GoogleApiManager googleApiManager = this.f4295E;
        if (Looper.myLooper() == googleApiManager.f4244F.getLooper()) {
            m3496a();
        } else {
            googleApiManager.f4244F.post(new zabg(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        m3508m(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        GoogleApiManager googleApiManager = this.f4295E;
        if (Looper.myLooper() == googleApiManager.f4244F.getLooper()) {
            m3497b(i2);
        } else {
            googleApiManager.f4244F.post(new zabh(this, i2));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p */
    public final void m3511p() {
        GoogleApiManager googleApiManager = this.f4295E;
        Preconditions.m3539c(googleApiManager.f4244F);
        Api.Client client = this.f4297t;
        if (client.isConnected() || client.isConnecting()) {
            return;
        }
        try {
            int iM3603a = googleApiManager.f4252y.m3603a(googleApiManager.f4250w, client);
            if (iM3603a != 0) {
                ConnectionResult connectionResult = new ConnectionResult(null, null, iM3603a);
                String name = client.getClass().getName();
                String string = connectionResult.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                m3508m(connectionResult, null);
                return;
            }
            zabn zabnVar = new zabn(googleApiManager, client, this.f4298u);
            if (client.requiresSignIn()) {
                zacm zacmVar = this.f4303z;
                Preconditions.m3544h(zacmVar);
                com.google.android.gms.signin.zae zaeVar = zacmVar.f4347x;
                if (zaeVar != null) {
                    zaeVar.disconnect();
                }
                ClientSettings clientSettings = zacmVar.f4346w;
                clientSettings.f4413g = Integer.valueOf(System.identityHashCode(zacmVar));
                Api.AbstractClientBuilder abstractClientBuilder = zacmVar.f4344u;
                Context context = zacmVar.f4342s;
                Handler handler = zacmVar.f4343t;
                zacmVar.f4347x = (com.google.android.gms.signin.zae) abstractClientBuilder.mo3418a(context, handler.getLooper(), clientSettings, clientSettings.f4412f, zacmVar, zacmVar);
                zacmVar.f4348y = zabnVar;
                Set set = zacmVar.f4345v;
                if (set == null || set.isEmpty()) {
                    handler.post(new zacj(zacmVar));
                } else {
                    zacmVar.f4347x.mo10759c();
                }
            }
            try {
                client.connect(zabnVar);
            } catch (SecurityException e) {
                m3508m(new ConnectionResult(null, null, 10), e);
            }
        } catch (IllegalStateException e2) {
            m3508m(new ConnectionResult(null, null, 10), e2);
        }
    }
}
