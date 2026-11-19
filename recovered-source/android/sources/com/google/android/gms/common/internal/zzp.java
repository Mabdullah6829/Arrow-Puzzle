package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;

/* JADX INFO: loaded from: classes.dex */
final class zzp implements Handler.Callback {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzq f4544s;

    public /* synthetic */ zzp(zzq zzqVar) {
        this.f4544s = zzqVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            zzq zzqVar = this.f4544s;
            synchronized (zzqVar.f4545d) {
                try {
                    zzn zznVar = (zzn) message.obj;
                    zzo zzoVar = (zzo) zzqVar.f4545d.get(zznVar);
                    if (zzoVar != null && zzoVar.f4537s.isEmpty()) {
                        if (zzoVar.f4539u) {
                            zzn zznVar2 = zzoVar.f4541w;
                            zzq zzqVar2 = zzoVar.f4543y;
                            zzqVar2.f4547f.removeMessages(1, zznVar2);
                            zzqVar2.f4548g.m3634c(zzqVar2.f4546e, zzoVar);
                            zzoVar.f4539u = false;
                            zzoVar.f4538t = 2;
                        }
                        zzqVar.f4545d.remove(zznVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        zzq zzqVar3 = this.f4544s;
        synchronized (zzqVar3.f4545d) {
            try {
                zzn zznVar3 = (zzn) message.obj;
                zzo zzoVar2 = (zzo) zzqVar3.f4545d.get(zznVar3);
                if (zzoVar2 != null && zzoVar2.f4538t == 3) {
                    String strValueOf = String.valueOf(zznVar3);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = zzoVar2.f4542x;
                    if (componentName == null) {
                        zznVar3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = zznVar3.f4535b;
                        Preconditions.m3544h(str);
                        componentName = new ComponentName(str, EnvironmentCompat.MEDIA_UNKNOWN);
                    }
                    zzoVar2.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
