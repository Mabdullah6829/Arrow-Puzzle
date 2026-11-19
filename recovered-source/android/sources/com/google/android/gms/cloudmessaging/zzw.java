package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzw {

    /* JADX INFO: renamed from: a */
    public final Context f4131a;

    /* JADX INFO: renamed from: b */
    public int f4132b;

    /* JADX INFO: renamed from: c */
    public int f4133c = 0;

    public zzw(Context context) {
        this.f4131a = context;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m3389a() {
        PackageInfo packageInfoM3663b;
        if (this.f4132b == 0) {
            try {
                packageInfoM3663b = Wrappers.m3665a(this.f4131a).m3663b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfoM3663b = null;
            }
            if (packageInfoM3663b != null) {
                this.f4132b = packageInfoM3663b.versionCode;
            }
        }
        return this.f4132b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e A[Catch: all -> 0x002c, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0023, B:14:0x002e, B:16:0x0035, B:18:0x0047, B:26:0x0068, B:21:0x004e, B:23:0x0061, B:29:0x006c, B:33:0x007b), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX INFO: renamed from: b */
    public final synchronized int m3390b() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        int i2 = this.f4133c;
        if (i2 != 0) {
            return i2;
        }
        Context context = this.f4131a;
        PackageManager packageManager = context.getPackageManager();
        if (Wrappers.m3665a(context).f4662a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i3 = 1;
        if (PlatformVersion.m3653a()) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers != null) {
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true != PlatformVersion.m3653a()) {
                i3 = 2;
            }
            this.f4133c = i3;
            return i3;
        }
        Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent3.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
            if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                if (true != PlatformVersion.m3653a()) {
                    i3 = 2;
                }
                this.f4133c = i3;
                return i3;
            }
            i3 = 2;
        }
        this.f4133c = i3;
        return i3;
    }
}
