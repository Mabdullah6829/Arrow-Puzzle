package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzinq extends CustomTabsServiceConnection {

    /* JADX INFO: renamed from: s */
    public final WeakReference f20022s;

    public zzinq(zzbjy zzbjyVar) {
        this.f20022s = new WeakReference(zzbjyVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbjy zzbjyVar = (zzbjy) this.f20022s.get();
        if (zzbjyVar != null) {
            zzbjyVar.f8918b = customTabsClient;
            customTabsClient.warmup(0L);
            zzbjx zzbjxVar = zzbjyVar.f8920d;
            if (zzbjxVar != null) {
                zzbjxVar.zza();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbjy zzbjyVar = (zzbjy) this.f20022s.get();
        if (zzbjyVar != null) {
            zzbjyVar.f8918b = null;
            zzbjyVar.f8917a = null;
        }
    }
}
