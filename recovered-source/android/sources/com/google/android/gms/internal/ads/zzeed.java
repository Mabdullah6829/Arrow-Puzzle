package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeed {

    /* JADX INFO: renamed from: a */
    public final Context f13730a;

    /* JADX INFO: renamed from: b */
    public zzase f13731b;

    public zzeed(Context context) {
        this.f13730a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m6186a(zzash zzashVar) {
        ServiceInfo serviceInfo;
        zzasg zzasgVar = (zzasg) this.f13731b;
        Context context = zzasgVar.f6830b;
        if (zzasgVar.mo4362a()) {
            zzasj.m4364a("Service connection is valid. No need to re-initialize.");
            ((zzeef) zzashVar).m6187a(0);
            return;
        }
        int i2 = zzasgVar.f6829a;
        if (i2 == 1) {
            zzasj.m4365b("Client is already in the process of connecting to the service.");
            ((zzeef) zzashVar).m6187a(3);
            return;
        }
        if (i2 == 3) {
            zzasj.m4365b("Client was already closed and can't be reused. Please create another instance.");
            ((zzeef) zzashVar).m6187a(3);
            return;
        }
        zzasj.m4364a("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            zzasgVar.f6829a = 0;
            zzasj.m4364a("Install Referrer service unavailable on device.");
            ((zzeef) zzashVar).m6187a(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    zzasf zzasfVar = new zzasf(zzasgVar, zzashVar);
                    zzasgVar.f6833e = zzasfVar;
                    try {
                        if (context.bindService(intent2, zzasfVar, 1)) {
                            zzasj.m4364a("Service was bonded successfully.");
                            return;
                        }
                        zzasj.m4365b("Connection to service is blocked.");
                        zzasgVar.f6829a = 0;
                        ((zzeef) zzashVar).m6187a(1);
                        return;
                    } catch (SecurityException unused) {
                        zzasj.m4365b("No permission to connect to service.");
                        zzasgVar.f6829a = 0;
                        ((zzeef) zzashVar).m6187a(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        zzasj.m4365b("Play Store missing or incompatible. Version 8.3.73 or later required.");
        zzasgVar.f6829a = 0;
        ((zzeef) zzashVar).m6187a(2);
    }
}
