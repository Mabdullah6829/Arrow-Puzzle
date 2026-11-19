package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzj implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzp f4108s;

    public /* synthetic */ zzj(zzp zzpVar) {
        this.f4108s = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            final zzp zzpVar = this.f4108s;
            synchronized (zzpVar) {
                try {
                    if (zzpVar.f4114s != 2) {
                        return;
                    }
                    if (zzpVar.f4117v.isEmpty()) {
                        zzpVar.m3379c();
                        return;
                    }
                    final zzs zzsVar = (zzs) zzpVar.f4117v.poll();
                    zzpVar.f4118w.put(zzsVar.f4122a, zzsVar);
                    zzpVar.f4119x.f4128b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzn
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzp zzpVar2 = zzpVar;
                            int i2 = zzsVar.f4122a;
                            synchronized (zzpVar2) {
                                zzs zzsVar2 = (zzs) zzpVar2.f4118w.get(i2);
                                if (zzsVar2 != null) {
                                    Log.w("MessengerIpcClient", "Timing out request: " + i2);
                                    zzpVar2.f4118w.remove(i2);
                                    zzsVar2.m3383c(new zzt("Timed out waiting for response", null));
                                    zzpVar2.m3379c();
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(zzsVar)));
                    }
                    zzv zzvVar = zzpVar.f4119x;
                    Messenger messenger = zzpVar.f4115t;
                    int i2 = zzsVar.f4124c;
                    Context context = zzvVar.f4127a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i2;
                    messageObtain.arg1 = zzsVar.f4122a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", zzsVar.mo3382b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, zzsVar.f4125d);
                    messageObtain.setData(bundle);
                    try {
                        zzq zzqVar = zzpVar.f4116u;
                        Messenger messenger2 = zzqVar.f4120a;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            zzd zzdVar = zzqVar.f4121b;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = zzdVar.f4095s;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        zzpVar.m3377a(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
