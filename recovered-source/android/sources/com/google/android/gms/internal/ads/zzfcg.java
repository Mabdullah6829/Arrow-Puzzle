package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfcg implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15400a;

    /* JADX INFO: renamed from: b */
    public final Context f15401b;

    /* JADX INFO: renamed from: c */
    public final VersionInfoParcel f15402c;

    /* JADX INFO: renamed from: d */
    public final String f15403d;

    public zzfcg(zzhcp zzhcpVar, Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.f15400a = zzhcpVar;
        this.f15401b = context;
        this.f15402c = versionInfoParcel;
        this.f15403d = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15400a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfcg zzfcgVar = this.f15399a;
                Context context = zzfcgVar.f15401b;
                boolean zM3664c = Wrappers.m3665a(context).m3664c();
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                boolean zM3207f = com.google.android.gms.ads.internal.util.zzs.m3207f(context);
                String str = zzfcgVar.f15402c.f3396s;
                int iMyUid = Process.myUid();
                boolean z = iMyUid == 0 || iMyUid == 1000;
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return new zzfch(zM3664c, zM3207f, str, z, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.m3701d(context, ModuleDescriptor.MODULE_ID, false), DynamiteModule.m3699a(context, ModuleDescriptor.MODULE_ID), zzfcgVar.f15403d);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 35;
    }
}
