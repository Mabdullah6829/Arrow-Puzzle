package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder_Factory;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzead implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f13452a;

    /* JADX INFO: renamed from: b */
    public final CsiParamDefaults_Factory f13453b;

    /* JADX INFO: renamed from: c */
    public final zzini f13454c;

    /* JADX INFO: renamed from: d */
    public final zzcnz f13455d;

    public zzead(zzini zziniVar, CsiParamDefaults_Factory csiParamDefaults_Factory, CsiUrlBuilder_Factory csiUrlBuilder_Factory, zzcnz zzcnzVar) {
        this.f13452a = zziniVar;
        this.f13453b = csiParamDefaults_Factory;
        this.f13454c = csiUrlBuilder_Factory;
        this.f13455d = zzcnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        PackageInfo packageInfo;
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        com.google.android.gms.ads.internal.util.client.zzu zzuVar = (com.google.android.gms.ads.internal.util.client.zzu) this.f13452a.zzb();
        CsiParamDefaults csiParamDefaultsZzb = this.f13453b.zzb();
        ((CsiUrlBuilder_Factory) this.f13454c).getClass();
        zzdzy zzdzyVar = new zzdzy(zzhcpVar, zzuVar, new CsiUrlBuilder(), this.f13455d.m5709a());
        DeviceTierManager deviceTierManager = csiParamDefaultsZzb.f4002f;
        HashMap map = zzdzyVar.f13443a;
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        com.google.android.gms.ads.internal.util.zzs zzsVar = zztVar.f3703c;
        zzcfk zzcfkVar = zztVar.f3708h;
        map.put("device", com.google.android.gms.ads.internal.util.zzs.m3199R());
        map.put("app", csiParamDefaultsZzb.f3998b);
        Context context = csiParamDefaultsZzb.f3997a;
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.m3207f(context) ? "0" : "1");
        zzbio zzbioVar = zzbix.f8436a;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbip zzbipVar = zzbaVar.f3096a;
        zzbiv zzbivVar = zzbaVar.f3098c;
        ArrayList arrayListM5024b = zzbipVar.m5024b();
        if (((Boolean) zzbivVar.m5030a(zzbix.f8214M7)).booleanValue()) {
            arrayListM5024b.addAll(zzcfkVar.m5387g().zzi().f9881i);
        }
        map.put("e", TextUtils.join(",", arrayListM5024b));
        map.put("sdkVersion", csiParamDefaultsZzb.f3999c);
        if (((Boolean) zzbivVar.m5030a(zzbix.f8185Kc)).booleanValue()) {
            map.put("is_bstar", true != com.google.android.gms.ads.internal.util.zzs.m3205d(context) ? "0" : "1");
        }
        if (((Boolean) zzbivVar.m5030a(zzbix.f8200La)).booleanValue() && ((Boolean) zzbivVar.m5030a(zzbix.f8474c3)).booleanValue()) {
            String str = zzcfkVar.f9895g;
            if (str == null) {
                str = "";
            }
            map.put("plugin", str);
        }
        if (((Boolean) zzbivVar.m5030a(zzbix.f8321Sc)).booleanValue()) {
            String str2 = csiParamDefaultsZzb.f4001e;
            map.put("uev", str2 != null ? str2 : "");
        }
        if (((Boolean) zzbivVar.m5030a(zzbix.f8359V2)).booleanValue()) {
            map.put("mem_tier", ((DeviceTierManager.AdvertisedMemoryTier) deviceTierManager.f3782c.get()).name());
        }
        if (((Boolean) zzbivVar.m5030a(zzbix.f8375W2)).booleanValue()) {
            map.put("proc_tier", ((DeviceTierManager.AvailableProcessorTier) deviceTierManager.f3784e.get()).name());
        }
        if (((Boolean) zzbivVar.m5030a(zzbix.f8391X2)).booleanValue() && (packageInfo = csiParamDefaultsZzb.f4000d) != null) {
            map.put("vc", String.valueOf(packageInfo.versionCode));
            map.put("vn", String.valueOf(packageInfo.versionName));
        }
        return zzdzyVar;
    }
}
