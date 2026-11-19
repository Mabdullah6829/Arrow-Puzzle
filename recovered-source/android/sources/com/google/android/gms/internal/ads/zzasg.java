package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import androidx.core.os.BuildCompat;

/* JADX INFO: loaded from: classes2.dex */
final class zzasg extends zzase {

    /* JADX INFO: renamed from: a */
    public int f6829a = 0;

    /* JADX INFO: renamed from: b */
    public final Context f6830b;

    /* JADX INFO: renamed from: c */
    public final String f6831c;

    /* JADX INFO: renamed from: d */
    public zzbeq f6832d;

    /* JADX INFO: renamed from: e */
    public ServiceConnection f6833e;

    public zzasg(Context context) {
        this.f6830b = context.getApplicationContext();
        String packageName = (BuildCompat.isAtLeastU() && SdkExtensions.getExtensionVersion(34) >= 8 && Process.isSdkSandbox()) ? AbstractC5153g.m3780c(context.getSystemService(AbstractC5153g.m3782e())).getClientPackageName() : context.getPackageName();
        this.f6831c = packageName;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    /* JADX INFO: renamed from: a */
    public final boolean mo4362a() {
        return (this.f6829a != 2 || this.f6832d == null || this.f6833e == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    /* JADX INFO: renamed from: b */
    public final zzasi mo4363b() throws RemoteException {
        if (!mo4362a()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f6831c);
        try {
            return new zzasi(this.f6832d.mo4819O(bundle));
        } catch (RemoteException e) {
            zzasj.m4365b("RemoteException getting install referrer information");
            this.f6829a = 0;
            throw e;
        }
    }
}
