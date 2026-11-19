package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdce {

    /* JADX INFO: renamed from: a */
    public final zzfps f11998a;

    /* JADX INFO: renamed from: b */
    public final VersionInfoParcel f11999b;

    /* JADX INFO: renamed from: c */
    public final ApplicationInfo f12000c;

    /* JADX INFO: renamed from: d */
    public final String f12001d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f12002e;

    /* JADX INFO: renamed from: f */
    public final PackageInfo f12003f;

    /* JADX INFO: renamed from: g */
    public final zzimt f12004g;

    /* JADX INFO: renamed from: h */
    public final String f12005h;

    /* JADX INFO: renamed from: i */
    public final zzfcv f12006i;

    /* JADX INFO: renamed from: j */
    public final com.google.android.gms.ads.internal.util.zzg f12007j;

    /* JADX INFO: renamed from: k */
    public final zzflg f12008k;

    /* JADX INFO: renamed from: l */
    public final zzdis f12009l;

    public zzdce(zzfps zzfpsVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, zzimt zzimtVar, com.google.android.gms.ads.internal.util.zzj zzjVar, String str2, zzfcv zzfcvVar, zzflg zzflgVar, zzdis zzdisVar) {
        this.f11998a = zzfpsVar;
        this.f11999b = versionInfoParcel;
        this.f12000c = applicationInfo;
        this.f12001d = str;
        this.f12002e = arrayList;
        this.f12003f = packageInfo;
        this.f12004g = zzimtVar;
        this.f12005h = str2;
        this.f12006i = zzfcvVar;
        this.f12007j = zzjVar;
        this.f12008k = zzflgVar;
        this.f12009l = zzdisVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzfoz m5894a(Bundle bundle) {
        this.f12009l.mo5885u();
        zzfps zzfpsVar = this.f11998a;
        Objects.requireNonNull(zzfpsVar);
        ListenableFuture listenableFutureM6423a = this.f12006i.m6423a(bundle, new Bundle());
        return new zzfpj(zzfpsVar, zzfpm.SIGNALS, null, zzfpk.f16241d, Collections.EMPTY_LIST, listenableFutureM6423a).m6555d();
    }

    /* JADX INFO: renamed from: b */
    public final zzfoz m5895b() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8158J2)).booleanValue()) {
            Bundle bundle2 = this.f12008k.f16056t;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final zzfoz zzfozVarM5894a = m5894a(bundle);
        ListenableFuture[] listenableFutureArr = {zzfozVarM5894a, (ListenableFuture) this.f12004g.zzb()};
        zzfps zzfpsVar = this.f11998a;
        zzfpsVar.getClass();
        return new zzfpb(zzfpsVar, zzfpm.REQUEST_PARCEL, Arrays.asList(listenableFutureArr)).m6551a(new Callable() { // from class: com.google.android.gms.internal.ads.zzdcd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle3 = (Bundle) zzfozVarM5894a.f16221u.get();
                zzdce zzdceVar = this.f11995a;
                String str = (String) ((ListenableFuture) zzdceVar.f12004g.zzb()).get();
                boolean z = false;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8348U7)).booleanValue() && zzdceVar.f12007j.mo3172s()) {
                    z = true;
                }
                boolean z2 = z;
                String str2 = zzdceVar.f12005h;
                PackageInfo packageInfo = zzdceVar.f12003f;
                ArrayList arrayList = zzdceVar.f12002e;
                String str3 = zzdceVar.f12001d;
                return new zzcbk(bundle3, zzdceVar.f11999b, zzdceVar.f12000c, str3, arrayList, packageInfo, str, str2, null, null, z2, zzdceVar.f12008k.m6486a(), bundle);
            }
        }).m6555d();
    }
}
