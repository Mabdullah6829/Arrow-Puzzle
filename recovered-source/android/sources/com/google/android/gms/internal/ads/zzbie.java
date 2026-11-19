package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbie {

    /* JADX INFO: renamed from: a */
    public final Context f7974a;

    public zzbie(Context context) {
        Preconditions.m3545i(context, "Context can not be null");
        this.f7974a = context;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5007a() {
        zzbid zzbidVar = new Callable() { // from class: com.google.android.gms.internal.ads.zzbid
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        };
        Context context = this.f7974a;
        return ((Boolean) com.google.android.gms.ads.internal.util.zzcb.m3142a(context, zzbidVar)).booleanValue() && Wrappers.m3665a(context).f4662a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5008b(Intent intent) {
        Preconditions.m3545i(intent, "Intent can not be null");
        return !this.f7974a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
