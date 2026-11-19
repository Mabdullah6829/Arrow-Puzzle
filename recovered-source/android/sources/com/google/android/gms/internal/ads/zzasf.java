package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzasf implements ServiceConnection {

    /* JADX INFO: renamed from: s */
    public final zzash f6827s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzasg f6828t;

    public /* synthetic */ zzasf(zzasg zzasgVar, zzash zzashVar) {
        Objects.requireNonNull(zzasgVar);
        this.f6828t = zzasgVar;
        this.f6827s = zzashVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzbeq zzbeoVar;
        zzasj.m4364a("Install Referrer service connected.");
        int i2 = zzbep.f7690s;
        if (iBinder == null) {
            zzbeoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            zzbeoVar = iInterfaceQueryLocalInterface instanceof zzbeq ? (zzbeq) iInterfaceQueryLocalInterface : new zzbeo(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        }
        zzasg zzasgVar = this.f6828t;
        zzasgVar.f6832d = zzbeoVar;
        zzasgVar.f6829a = 2;
        ((zzeef) this.f6827s).m6187a(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzasj.m4365b("Install Referrer service disconnected.");
        zzasg zzasgVar = this.f6828t;
        zzasgVar.f6832d = null;
        zzasgVar.f6829a = 0;
    }
}
