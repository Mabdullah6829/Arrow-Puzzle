package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;

/* JADX INFO: loaded from: classes.dex */
public class CsiParamDefaults {

    /* JADX INFO: renamed from: a */
    public final Context f3997a;

    /* JADX INFO: renamed from: b */
    public final String f3998b;

    /* JADX INFO: renamed from: c */
    public final String f3999c;

    /* JADX INFO: renamed from: d */
    public final PackageInfo f4000d;

    /* JADX INFO: renamed from: e */
    public final String f4001e;

    /* JADX INFO: renamed from: f */
    public final DeviceTierManager f4002f;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel, PackageInfo packageInfo, String str, DeviceTierManager deviceTierManager) {
        this.f3997a = context;
        this.f3998b = context.getPackageName();
        this.f3999c = versionInfoParcel.f3396s;
        this.f4000d = packageInfo;
        this.f4001e = str;
        this.f4002f = deviceTierManager;
    }
}
