package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjw extends CustomTabsServiceConnection {

    /* JADX INFO: renamed from: s */
    public final AtomicBoolean f8912s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: t */
    public Context f8913t;

    /* JADX INFO: renamed from: u */
    public zzdzt f8914u;

    /* JADX INFO: renamed from: v */
    public CustomTabsSession f8915v;

    /* JADX INFO: renamed from: w */
    public CustomTabsClient f8916w;

    /* JADX INFO: renamed from: a */
    public final CustomTabsSession m5046a() {
        if (this.f8915v == null) {
            ((zzcfx) zzcfy.f9946a).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbjv
                @Override // java.lang.Runnable
                public final void run() {
                    String packageName;
                    zzbjw zzbjwVar = this.f8911s;
                    Context context = zzbjwVar.f8913t;
                    if (zzbjwVar.f8916w != null || context == null || (packageName = CustomTabsClient.getPackageName(context, null)) == null || packageName.equals(context.getPackageName())) {
                        return;
                    }
                    CustomTabsClient.bindCustomTabsService(context, packageName, zzbjwVar);
                }
            });
        }
        return this.f8915v;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        this.f8916w = customTabsClient;
        customTabsClient.warmup(0L);
        this.f8915v = customTabsClient.newSession(new zzbjt(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f8916w = null;
        this.f8915v = null;
    }
}
