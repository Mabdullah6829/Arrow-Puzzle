package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class zzb extends com.google.android.gms.internal.common.zzg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseGmsClient f4518a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.f4518a = baseGmsClient;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        zzc zzcVar;
        BaseGmsClient baseGmsClient = this.f4518a;
        if (baseGmsClient.zzd.get() != message.arg1) {
            int i2 = message.what;
            if ((i2 == 2 || i2 == 1 || i2 == 7) && (zzcVar = (zzc) message.obj) != null) {
                synchronized (zzcVar) {
                    zzcVar.f4519a = null;
                }
                BaseGmsClient baseGmsClient2 = zzcVar.f4521c;
                synchronized (baseGmsClient2.zzj()) {
                    baseGmsClient2.zzj().remove(zzcVar);
                }
                return;
            }
            return;
        }
        int i3 = message.what;
        if ((i3 == 1 || i3 == 7 || ((i3 == 4 && !baseGmsClient.enableLocalFallback()) || message.what == 5)) && !baseGmsClient.isConnecting()) {
            zzc zzcVar2 = (zzc) message.obj;
            if (zzcVar2 != null) {
                synchronized (zzcVar2) {
                    zzcVar2.f4519a = null;
                }
                BaseGmsClient baseGmsClient3 = zzcVar2.f4521c;
                synchronized (baseGmsClient3.zzj()) {
                    baseGmsClient3.zzj().remove(zzcVar2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            baseGmsClient.zzn(new ConnectionResult(null, null, message.arg2));
            if (baseGmsClient.zzg() && !baseGmsClient.zzo()) {
                baseGmsClient.zzd(3, null);
                return;
            }
            ConnectionResult connectionResultZzm = baseGmsClient.zzm() != null ? baseGmsClient.zzm() : new ConnectionResult(null, null, 8);
            baseGmsClient.zzc.mo3491a(connectionResultZzm);
            baseGmsClient.onConnectionFailed(connectionResultZzm);
            return;
        }
        if (i4 == 5) {
            ConnectionResult connectionResultZzm2 = baseGmsClient.zzm() != null ? baseGmsClient.zzm() : new ConnectionResult(null, null, 8);
            baseGmsClient.zzc.mo3491a(connectionResultZzm2);
            baseGmsClient.onConnectionFailed(connectionResultZzm2);
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult = new ConnectionResult(null, obj instanceof PendingIntent ? (PendingIntent) obj : null, message.arg2);
            baseGmsClient.zzc.mo3491a(connectionResult);
            baseGmsClient.onConnectionFailed(connectionResult);
            return;
        }
        if (i4 == 6) {
            baseGmsClient.zzd(5, null);
            if (baseGmsClient.zzk() != null) {
                baseGmsClient.zzk().onConnectionSuspended(message.arg2);
            }
            baseGmsClient.onConnectionSuspended(message.arg2);
            baseGmsClient.zze(5, 1, null);
            return;
        }
        if (i4 == 2 && !baseGmsClient.isConnected()) {
            zzc zzcVar3 = (zzc) message.obj;
            if (zzcVar3 != null) {
                synchronized (zzcVar3) {
                    zzcVar3.f4519a = null;
                }
                BaseGmsClient baseGmsClient4 = zzcVar3.f4521c;
                synchronized (baseGmsClient4.zzj()) {
                    baseGmsClient4.zzj().remove(zzcVar3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i5).length() + 34), "Don't know how to handle message: ", i5), new Exception());
            return;
        }
        zzc zzcVar4 = (zzc) message.obj;
        synchronized (zzcVar4) {
            try {
                bool = zzcVar4.f4519a;
                if (zzcVar4.f4520b) {
                    String string = zzcVar4.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            zzcVar4.mo3605a(bool);
        }
        synchronized (zzcVar4) {
            zzcVar4.f4520b = true;
        }
        synchronized (zzcVar4) {
            zzcVar4.f4519a = null;
        }
        BaseGmsClient baseGmsClient5 = zzcVar4.f4521c;
        synchronized (baseGmsClient5.zzj()) {
            baseGmsClient5.zzj().remove(zzcVar4);
        }
    }
}
