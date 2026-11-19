package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
final class zaby implements OnCompleteListener {

    /* JADX INFO: renamed from: s */
    public final GoogleApiManager f4319s;

    /* JADX INFO: renamed from: t */
    public final int f4320t;

    /* JADX INFO: renamed from: u */
    public final ApiKey f4321u;

    /* JADX INFO: renamed from: v */
    public final long f4322v;

    /* JADX INFO: renamed from: w */
    public final long f4323w;

    public zaby(GoogleApiManager googleApiManager, int i2, ApiKey apiKey, long j2, long j3) {
        this.f4319s = googleApiManager;
        this.f4320t = i2;
        this.f4321u = apiKey;
        this.f4322v = j2;
        this.f4323w = j3;
    }

    /* JADX INFO: renamed from: a */
    public static ConnectionTelemetryConfiguration m3513a(zabk zabkVar, BaseGmsClient baseGmsClient, int i2) {
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.f4419t) {
            return null;
        }
        int[] iArr = telemetryConfiguration.f4421v;
        int i3 = 0;
        if (iArr != null) {
            while (i3 < iArr.length) {
                if (iArr[i3] != i2) {
                    i3++;
                }
            }
            return null;
        }
        int[] iArr2 = telemetryConfiguration.f4423x;
        if (iArr2 != null) {
            while (i3 < iArr2.length) {
                if (iArr2[i3] == i2) {
                    return null;
                }
                i3++;
            }
        }
        if (zabkVar.f4294D < telemetryConfiguration.f4422w) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        long j3;
        GoogleApiManager googleApiManager = this.f4319s;
        if (googleApiManager.m3461e()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.m3548a().f4459a;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.f4461t) {
                zabk zabkVar = (zabk) googleApiManager.f4240B.get(this.f4321u);
                if (zabkVar != null) {
                    Object obj = zabkVar.f4297t;
                    if (obj instanceof BaseGmsClient) {
                        BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                        long j4 = this.f4322v;
                        boolean z = j4 > 0;
                        int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                        if (rootTelemetryConfiguration != null) {
                            z &= rootTelemetryConfiguration.f4462u;
                            int i8 = rootTelemetryConfiguration.f4463v;
                            int i9 = rootTelemetryConfiguration.f4464w;
                            i2 = rootTelemetryConfiguration.f4460s;
                            if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationM3513a = m3513a(zabkVar, baseGmsClient, this.f4320t);
                                if (connectionTelemetryConfigurationM3513a == null) {
                                    return;
                                }
                                boolean z2 = connectionTelemetryConfigurationM3513a.f4420u && j4 > 0;
                                i9 = connectionTelemetryConfigurationM3513a.f4422w;
                                z = z2;
                            }
                            i4 = i8;
                            i3 = i9;
                        } else {
                            i2 = 0;
                            i3 = 100;
                            i4 = 5000;
                        }
                        int iElapsedRealtime = -1;
                        if (task.isSuccessful()) {
                            i7 = 0;
                            i6 = 0;
                        } else if (task.isCanceled()) {
                            i6 = -1;
                            i7 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof ApiException) {
                                Status status = ((ApiException) exception).getStatus();
                                i5 = status.f4210s;
                                ConnectionResult connectionResult = status.f4213v;
                                if (connectionResult != null) {
                                    i6 = connectionResult.f4142t;
                                }
                                i7 = i5;
                            } else {
                                i5 = 101;
                            }
                            i6 = -1;
                            i7 = i5;
                        }
                        if (z) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f4323w);
                            j2 = j4;
                            j3 = jCurrentTimeMillis;
                        } else {
                            j2 = 0;
                            j3 = 0;
                        }
                        zabz zabzVar = new zabz(new MethodInvocation(this.f4320t, i7, i6, j2, j3, null, null, gCoreServiceId, iElapsedRealtime), i2, i4, i3);
                        com.google.android.gms.internal.base.zao zaoVar = googleApiManager.f4244F;
                        zaoVar.sendMessage(zaoVar.obtainMessage(18, zabzVar));
                    }
                }
            }
        }
    }
}
