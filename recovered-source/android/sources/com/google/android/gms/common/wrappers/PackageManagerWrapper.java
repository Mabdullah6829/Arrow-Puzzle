package com.google.android.gms.common.wrappers;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: loaded from: classes.dex */
public class PackageManagerWrapper {

    /* JADX INFO: renamed from: a */
    public final Context f4662a;

    public PackageManagerWrapper(Context context) {
        this.f4662a = context;
    }

    /* JADX INFO: renamed from: a */
    public final ApplicationInfo m3662a(int i2, String str) {
        return this.f4662a.getPackageManager().getApplicationInfo(str, i2);
    }

    /* JADX INFO: renamed from: b */
    public final PackageInfo m3663b(int i2, String str) {
        return this.f4662a.getPackageManager().getPackageInfo(str, i2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3664c() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f4662a;
        if (callingUid == iMyUid) {
            return InstantApps.m3661a(context);
        }
        if (!PlatformVersion.m3653a() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }
}
