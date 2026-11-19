package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseGmsClient<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile AttributionSourceWrapper zzB;
    private ConnectionResult zzC;
    private boolean zzD;
    private volatile zzj zzE;
    zzs zza;
    final Handler zzb;
    protected ConnectionProgressReportCallbacks zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final GmsClientSupervisor zzn;
    private final GoogleApiAvailabilityLight zzo;
    private final Object zzp;
    private final Object zzq;
    private IGmsServiceBroker zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private zze zzu;
    private int zzv;
    private final BaseConnectionCallbacks zzw;
    private final BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final String zzz;
    private static final Feature[] zze = new Feature[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public interface BaseConnectionCallbacks {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i2);
    }

    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public interface ConnectionProgressReportCallbacks {
        /* JADX INFO: renamed from: a */
        void mo3491a(ConnectionResult connectionResult);
    }

    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        /* JADX INFO: renamed from: a */
        public final void mo3491a(ConnectionResult connectionResult) {
            boolean zM3393H = connectionResult.m3393H();
            BaseGmsClient baseGmsClient = BaseGmsClient.this;
            if (zM3393H) {
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
            } else if (baseGmsClient.zzl() != null) {
                baseGmsClient.zzl().onConnectionFailed(connectionResult);
            }
        }
    }

    public interface SignOutCallbacks {
        /* JADX INFO: renamed from: a */
        void mo3495a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseGmsClient(int i2, Context context, Looper looper, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        GmsClientSupervisor gmsClientSupervisorM3530a = GmsClientSupervisor.m3530a(context);
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f4157b;
        Preconditions.m3544h(baseConnectionCallbacks);
        Preconditions.m3544h(baseOnConnectionFailedListener);
        this(context, looper, gmsClientSupervisorM3530a, googleApiAvailabilityLight, i2, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    public void checkAvailabilityAndConnect() {
        int iM3403c = this.zzo.m3403c(this.zzl, getMinApkVersion());
        if (iM3403c == 0) {
            connect(new LegacyClientCallbackAdapter());
        } else {
            m3529d(1, null);
            triggerNotAvailable(new LegacyClientCallbackAdapter(), iM3403c, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.m3545i(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        m3529d(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    /* JADX INFO: renamed from: d */
    public final void m3529d(int i2, IInterface iInterface) {
        zzs zzsVar;
        Preconditions.m3537a((i2 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i2;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i2 == 1) {
                    zze zzeVar = this.zzu;
                    if (zzeVar != null) {
                        GmsClientSupervisor gmsClientSupervisor = this.zzn;
                        String str = this.zza.f4551a;
                        Preconditions.m3544h(str);
                        String str2 = this.zza.f4552b;
                        zza();
                        boolean z = this.zza.f4553c;
                        gmsClientSupervisor.getClass();
                        gmsClientSupervisor.mo3532c(new zzn(str, str2, z), zzeVar);
                        this.zzu = null;
                    }
                } else if (i2 == 2 || i2 == 3) {
                    zze zzeVar2 = this.zzu;
                    if (zzeVar2 != null && (zzsVar = this.zza) != null) {
                        String str3 = zzsVar.f4551a;
                        String str4 = zzsVar.f4552b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str3);
                        sb.append(" on ");
                        sb.append(str4);
                        Log.e("GmsClient", sb.toString());
                        GmsClientSupervisor gmsClientSupervisor2 = this.zzn;
                        String str5 = this.zza.f4551a;
                        Preconditions.m3544h(str5);
                        String str6 = this.zza.f4552b;
                        zza();
                        boolean z2 = this.zza.f4553c;
                        gmsClientSupervisor2.getClass();
                        gmsClientSupervisor2.mo3532c(new zzn(str5, str6, z2), zzeVar2);
                        this.zzd.incrementAndGet();
                    }
                    zze zzeVar3 = new zze(this, this.zzd.get());
                    this.zzu = zzeVar3;
                    zzs zzsVar2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new zzs(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new zzs(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = zzsVar2;
                    if (zzsVar2.f4553c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f4551a)));
                    }
                    GmsClientSupervisor gmsClientSupervisor3 = this.zzn;
                    String str7 = this.zza.f4551a;
                    Preconditions.m3544h(str7);
                    ConnectionResult connectionResultMo3531b = gmsClientSupervisor3.mo3531b(new zzn(str7, this.zza.f4552b, this.zza.f4553c), zzeVar3, zza(), getBindServiceExecutor());
                    if (!connectionResultMo3531b.m3393H()) {
                        zzs zzsVar3 = this.zza;
                        String str8 = zzsVar3.f4551a;
                        String str9 = zzsVar3.f4552b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str8);
                        sb2.append(" on ");
                        sb2.append(str9);
                        Log.w("GmsClient", sb2.toString());
                        int i3 = connectionResultMo3531b.f4142t;
                        if (i3 == -1) {
                            i3 = 16;
                        }
                        if (connectionResultMo3531b.f4143u != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, connectionResultMo3531b.f4143u);
                        }
                        zzb(i3, bundle, this.zzd.get());
                    }
                } else if (i2 == 4) {
                    Preconditions.m3544h(iInterface);
                    onConnectedLocked(iInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    zzc zzcVar = (zzc) arrayList.get(i2);
                    synchronized (zzcVar) {
                        zzcVar.f4519a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        m3529d(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.zzp) {
            i2 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            iGmsServiceBroker = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i2 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i2 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i2 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i2 == 4) {
            printWriter.print("CONNECTED");
        } else if (i2 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.zzh;
            String str2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 1 + String.valueOf(str2).length());
            sb.append(j2);
            sb.append(" ");
            sb.append(str2);
            printWriterAppend.println(sb.toString());
        }
        if (this.zzg > r9) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i3 = this.zzf;
            if (i3 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i3 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i3 != 3) {
                printWriter.append((CharSequence) String.valueOf(i3));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.zzg;
            String str3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 1 + String.valueOf(str3).length());
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(str3);
            printWriterAppend2.println(sb2.toString());
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) CommonStatusCodes.m3425a(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j4 = this.zzj;
            String str4 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j4).length() + 1 + String.valueOf(str4).length());
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(str4);
            printWriterAppend3.println(sb3.toString());
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return zze;
    }

    public AttributionSourceWrapper getAttributionSourceWrapper() {
        return this.zzB;
    }

    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f4531t;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        zzs zzsVar;
        if (!isConnected() || (zzsVar = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return zzsVar.f4552b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.f4156a;
    }

    public void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        AttributionSource attributionSource;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.zzB == null || (attributionSource = this.zzB.f4659a) == null || attributionSource.getAttributionTag() == null) ? this.zzA : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i2 = this.zzy;
        int i3 = GoogleApiAvailabilityLight.f4156a;
        Scope[] scopeArr = GetServiceRequest.f4424G;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f4425H;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i2, i3, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f4435v = this.zzl.getPackageName();
        getServiceRequest.f4438y = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.f4437x = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.f4439z = account;
            if (iAccountAccessor != null) {
                getServiceRequest.f4436w = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f4439z = getAccount();
        }
        getServiceRequest.f4426A = zze;
        getServiceRequest.f4427B = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.f4430E = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    IGmsServiceBroker iGmsServiceBroker = this.zzr;
                    if (iGmsServiceBroker != null) {
                        iGmsServiceBroker.mo3534T0(new zzd(this, this.zzd.get()), getServiceRequest);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(3);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final T getService() {
        T t;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                IInterface iInterface = this.zzs;
                Preconditions.m3545i(iInterface, "Client is connected but service is null");
                t = (T) iInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                IGmsServiceBroker iGmsServiceBroker = this.zzr;
                if (iGmsServiceBroker == null) {
                    return null;
                }
                return iGmsServiceBroker.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f4533v;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i2 = this.zzv;
            z = true;
            if (i2 != 2 && i2 != 3) {
                z = false;
            }
        }
        return z;
    }

    public void onConnectedLocked(T t) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzi = connectionResult.f4142t;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i2) {
        this.zzf = i2;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i2, IBinder iBinder, Bundle bundle, int i3) {
        zzf zzfVar = new zzf(this, i2, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, zzfVar));
    }

    public void onUserSignOut(SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.mo3495a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(AttributionSourceWrapper attributionSourceWrapper) {
        this.zzB = attributionSourceWrapper;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i2) {
        int i3 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i3, i2));
    }

    public void triggerNotAvailable(ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i2, PendingIntent pendingIntent) {
        Preconditions.m3545i(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        int i3 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i3, i2, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzb(int i2, Bundle bundle, int i3) {
        zzg zzgVar = new zzg(this, i2, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, zzgVar));
    }

    public final void zzc(zzj zzjVar) {
        this.zzE = zzjVar;
        if (usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f4533v;
            RootTelemetryConfigManager rootTelemetryConfigManagerM3548a = RootTelemetryConfigManager.m3548a();
            RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.f4418s;
            synchronized (rootTelemetryConfigManagerM3548a) {
                try {
                    if (rootTelemetryConfiguration == null) {
                        rootTelemetryConfigManagerM3548a.f4459a = RootTelemetryConfigManager.f4458c;
                        return;
                    }
                    RootTelemetryConfiguration rootTelemetryConfiguration2 = rootTelemetryConfigManagerM3548a.f4459a;
                    if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.f4460s < rootTelemetryConfiguration.f4460s) {
                        rootTelemetryConfigManagerM3548a.f4459a = rootTelemetryConfiguration;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final /* synthetic */ void zzd(int i2, IInterface iInterface) {
        m3529d(i2, null);
    }

    public final /* synthetic */ boolean zze(int i2, int i3, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i2) {
                    return false;
                }
                m3529d(i3, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzf(int i2) {
        int i3;
        int i4;
        synchronized (this.zzp) {
            i3 = this.zzv;
        }
        if (i3 == 3) {
            this.zzD = true;
            i4 = 5;
        } else {
            i4 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i4, this.zzd.get(), 16));
    }

    public final /* synthetic */ boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(IGmsServiceBroker iGmsServiceBroker) {
        this.zzr = iGmsServiceBroker;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ BaseConnectionCallbacks zzk() {
        return this.zzw;
    }

    public final /* synthetic */ BaseOnConnectionFailedListener zzl() {
        return this.zzx;
    }

    public final /* synthetic */ ConnectionResult zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(ConnectionResult connectionResult) {
        this.zzC = connectionResult;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public BaseGmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i2, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        Preconditions.m3545i(context, "Context must not be null");
        this.zzl = context;
        Preconditions.m3545i(looper, "Looper must not be null");
        this.zzm = looper;
        Preconditions.m3545i(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        Preconditions.m3545i(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzb = new zzb(this, looper);
        this.zzy = i2;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = str;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
