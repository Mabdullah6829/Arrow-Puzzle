package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzgsj implements ServiceConnection {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzgsp f18139s;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzgsp zzgspVar = this.f18139s;
        zzgspVar.f18148c.m7110a("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzgspVar.m7108a(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgsi
            @Override // java.lang.Runnable
            public final void run() {
                zzgqt zzgqrVar;
                IBinder iBinder2 = iBinder;
                int i2 = zzgqs.f18073s;
                if (iBinder2 == null) {
                    zzgqrVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
                    zzgqrVar = iInterfaceQueryLocalInterface instanceof zzgqt ? (zzgqt) iInterfaceQueryLocalInterface : new zzgqr(iBinder2, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
                }
                zzgsj zzgsjVar = this.f18137s;
                zzgsp zzgspVar2 = zzgsjVar.f18139s;
                zzgspVar2.f18155j = zzgqrVar;
                int i3 = 0;
                zzgspVar2.f18148c.m7110a("linkToDeath", new Object[0]);
                try {
                    zzgqt zzgqtVar = zzgspVar2.f18155j;
                    if (zzgqtVar == null) {
                        throw null;
                    }
                    zzgqtVar.asBinder().linkToDeath(zzgspVar2.f18153h, 0);
                    zzgsp zzgspVar3 = zzgsjVar.f18139s;
                    zzgspVar3.f18151f = false;
                    synchronized (zzgspVar3.f18150e) {
                        try {
                            ArrayList arrayList = zzgspVar3.f18150e;
                            int size = arrayList.size();
                            while (i3 < size) {
                                Object obj = arrayList.get(i3);
                                i3++;
                                ((Runnable) obj).run();
                            }
                            zzgspVar3.f18150e.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (RemoteException e) {
                    zzgsjVar.f18139s.f18148c.m7113d(e, "linkToDeath failed", new Object[0]);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzgsp zzgspVar = this.f18139s;
        zzgspVar.f18148c.m7110a("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzgspVar.m7108a(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgsh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgsp zzgspVar2 = this.f18136s.f18139s;
                zzgspVar2.f18148c.m7110a("unlinkToDeath", new Object[0]);
                zzgqt zzgqtVar = zzgspVar2.f18155j;
                zzgqtVar.getClass();
                zzgqtVar.asBinder().unlinkToDeath(zzgspVar2.f18153h, 0);
                zzgspVar2.f18155j = null;
                zzgspVar2.f18151f = false;
            }
        });
    }
}
