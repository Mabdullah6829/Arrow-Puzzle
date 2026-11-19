package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class zze implements ServiceConnection {

    /* JADX INFO: renamed from: s */
    public final int f4524s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ BaseGmsClient f4525t;

    public zze(BaseGmsClient baseGmsClient, int i2) {
        this.f4525t = baseGmsClient;
        this.f4524s = i2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BaseGmsClient baseGmsClient = this.f4525t;
        if (iBinder == null) {
            baseGmsClient.zzf(16);
            return;
        }
        synchronized (baseGmsClient.zzh()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                baseGmsClient.zzi((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new zzaa(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4525t.zzb(0, null, this.f4524s);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient = this.f4525t;
        synchronized (baseGmsClient.zzh()) {
            baseGmsClient.zzi(null);
        }
        BaseGmsClient baseGmsClient2 = this.f4525t;
        int i2 = this.f4524s;
        Handler handler = baseGmsClient2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i2, 1));
    }
}
