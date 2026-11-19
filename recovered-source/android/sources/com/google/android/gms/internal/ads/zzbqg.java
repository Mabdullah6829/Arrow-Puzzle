package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzbqg implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Map f9261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zza f9262b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f9263c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzbqk f9264d;

    public zzbqg(zzbqk zzbqkVar, Map map, com.google.android.gms.ads.internal.client.zza zzaVar, String str) {
        this.f9261a = map;
        this.f9262b = zzaVar;
        this.f9263c = str;
        this.f9264d = zzbqkVar;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0387  */
    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        boolean zM6482b;
        boolean z;
        final zzdca zzdcaVar;
        boolean zM5047a;
        String string = (String) obj;
        zzbio zzbioVar = zzbix.f8821wb;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            this.f9261a.put("u", string);
        }
        zzbqk zzbqkVar = this.f9264d;
        com.google.android.gms.ads.internal.client.zza zzaVar = this.f9262b;
        Map map = this.f9261a;
        String str = this.f9263c;
        zzbqkVar.getClass();
        zzclb zzclbVar = (zzclb) zzaVar;
        zzfkn zzfknVarMo5565B = zzclbVar.mo5565B();
        zzfkq zzfkqVarMo5587Q = zzclbVar.mo5587Q();
        String str2 = "";
        boolean z2 = false;
        if (zzfknVarMo5565B == null || zzfkqVarMo5587Q == null) {
            zM6482b = false;
        } else {
            str2 = zzfkqVarMo5587Q.f15973b;
            zM6482b = zzfknVarMo5565B.m6482b();
        }
        boolean z3 = (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8517ec)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z4 = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8603je)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str)) {
            if (zzclbVar.mo5614s0()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzbqkVar.m5109h(false);
                ((zzcmr) zzaVar).mo5653z("1".equals(map.get("custom_close")), zzbqk.m5103b(map), z3);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str)) {
            zzbqkVar.m5109h(false);
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8738rd)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1")) {
                z2 = true;
            }
            if (string != null) {
                ((zzcmr) zzaVar).mo5648G("1".equals(map.get("custom_close")), zzbqk.m5103b(map), string, z3, z2);
                return;
            } else {
                ((zzcmr) zzaVar).mo5650c("1".equals(map.get("custom_close")), zzbqk.m5103b(map), (String) map.get("html"), (String) map.get("baseurl"), z3);
                return;
            }
        }
        Intent uri = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str)) {
            Context context = zzclbVar.getContext();
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8110G5)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.m3150k("User opt out chrome custom tab.");
                zzbqkVar.m5110i(10);
            } else {
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8866z5)).booleanValue()) {
                    String packageName = CustomTabsClient.getPackageName(context, null);
                    zM5047a = (packageName == null || context.getPackageName().equals(packageName)) ? false : true;
                } else {
                    zM5047a = zzbjy.m5047a(context);
                }
                if (zM5047a) {
                    zzbqkVar.m5109h(true);
                    if (TextUtils.isEmpty(string)) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Cannot open browser with null or empty url");
                        zzbqkVar.m5110i(7);
                        return;
                    }
                    Uri uriM5105d = zzbqk.m5105d(zzbqk.m5104c(zzclbVar.getContext(), zzclbVar.mo5611q(), Uri.parse(string), zzclbVar.mo5577H(), zzclbVar.zzj(), zzclbVar.mo5584N()));
                    if (zM6482b && zzbqkVar.f9275e != null && zzbqkVar.m5106e(zzaVar, zzclbVar.getContext(), uriM5105d.toString(), str2)) {
                        return;
                    }
                    zzbqkVar.f9278h = new zzbqh(zzbqkVar);
                    zzcmr zzcmrVar = (zzcmr) zzaVar;
                    String string2 = uriM5105d.toString();
                    com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = zzbqkVar.f9278h;
                    Bundle bundle = new Bundle();
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8093F5)).booleanValue()) {
                        if (map.containsKey("cct_init_h")) {
                            try {
                                bundle.putInt("h", Integer.parseInt((String) map.get("cct_init_h")));
                            } catch (NumberFormatException e) {
                                com.google.android.gms.ads.internal.util.zze.m3151l("Invalid cct initial height parameter.", e);
                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("OpenGmsgHandler.getChromeCustomTabConfigBundle", e);
                            }
                        }
                        if (map.containsKey("cct_bp")) {
                            try {
                                bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                            } catch (NumberFormatException e2) {
                                com.google.android.gms.ads.internal.util.zze.m3151l("Invalid cct close button position parameter.", e2);
                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("OpenGmsgHandler.getChromeCustomTabConfigBundle", e2);
                            }
                        }
                    }
                    zzcmrVar.mo5652x(new com.google.android.gms.ads.internal.overlay.zzc(null, string2, null, null, null, null, null, null, new ObjectWrapper(zzaaVar), true, bundle), z3, z4, str2);
                    return;
                }
                zzbqkVar.m5110i(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzbqkVar.m5108g(zzaVar, map, zM6482b, str2, z3, z4);
            return;
        }
        if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzbqkVar.m5108g(zzaVar, map, zM6482b, str2, z3, z4);
            return;
        }
        boolean z5 = zM6482b;
        boolean z6 = z4;
        String str3 = str2;
        if ("open_app".equalsIgnoreCase(str)) {
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8768t9)).booleanValue()) {
                zzbqkVar.m5109h(true);
                String str4 = (String) map.get("p");
                if (str4 == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Package name missing from open app action.");
                    return;
                }
                if (z5 && zzbqkVar.f9275e != null && zzbqkVar.m5106e(zzaVar, zzclbVar.getContext(), str4, str3)) {
                    return;
                }
                PackageManager packageManager = zzclbVar.getContext().getPackageManager();
                if (packageManager == null) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Cannot get package manager from open app action.");
                    return;
                } else {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str4);
                    if (launchIntentForPackage != null) {
                        ((zzcmr) zzaVar).mo5652x(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, zzbqkVar.f9278h), z3, z6, str3);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        zzbqkVar.m5109h(true);
        String str5 = (String) map.get("intent_url");
        if (!TextUtils.isEmpty(str5)) {
            try {
                uri = Intent.parseUri(str5, 0);
            } catch (URISyntaxException e3) {
                String strValueOf = String.valueOf(str5);
                int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error parsing the url: ".concat(strValueOf), e3);
            }
        }
        if (uri != null && uri.getData() != null) {
            Uri data = uri.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriM5105d2 = zzbqk.m5105d(zzbqk.m5104c(zzclbVar.getContext(), zzclbVar.mo5611q(), data, zzclbVar.mo5577H(), zzclbVar.zzj(), zzclbVar.mo5584N()));
                if (TextUtils.isEmpty(uri.getType())) {
                    uri.setData(uriM5105d2);
                } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8785u9)).booleanValue()) {
                    uri.setDataAndType(uriM5105d2, uri.getType());
                } else {
                    uri.setData(uriM5105d2);
                }
            }
        }
        zzbio zzbioVar2 = zzbix.f8267P9;
        com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f3095e;
        boolean z7 = ((Boolean) zzbaVar2.f3098c.m5030a(zzbioVar2)).booleanValue() && "intent_async".equalsIgnoreCase(str) && map.containsKey("event_id");
        if (!((Boolean) zzbaVar2.f3098c.m5030a(zzbix.f8688oe)).booleanValue() || (zzdcaVar = zzbqkVar.f9277g) == null) {
            z7 = z7;
        } else {
            synchronized (zzdcaVar.f11979s) {
                int i7 = zzdcaVar.f11981u.f15890E0;
                if (i7 > 0 && !zzdcaVar.f11986z) {
                    zzfrm zzfrmVar = zzdcaVar.f11985y;
                    long jCurrentTimeMillis = zzdcaVar.f11982v.currentTimeMillis();
                    zzfrmVar.m8326l();
                    ((zzfrn) zzfrmVar.f19780t).m6633F(jCurrentTimeMillis);
                    zzdcaVar.f11986z = true;
                    zzdcaVar.f11984x.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzdca zzdcaVar2 = zzdcaVar;
                            synchronized (zzdcaVar2.f11979s) {
                                try {
                                    if (zzdcaVar2.f11978A) {
                                        return;
                                    }
                                    zzdcaVar2.f11978A = true;
                                    zzdcaVar2.m5892a();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }, i7, TimeUnit.MILLISECONDS);
                }
            }
        }
        HashMap map2 = new HashMap();
        if (z7) {
            z = false;
            zzbqkVar.f9278h = new zzbqi(zzbqkVar, z3, zzaVar, map2, map);
        } else {
            z = z3;
        }
        if (uri != null) {
            if (!z5 || zzbqkVar.f9275e == null || !zzbqkVar.m5106e(zzaVar, zzclbVar.getContext(), uri.getData().toString(), str3)) {
                ((zzcmr) zzaVar).mo5652x(new com.google.android.gms.ads.internal.overlay.zzc(uri, zzbqkVar.f9278h), z, z6, str3);
                return;
            } else {
                if (z7) {
                    map2.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzbst) zzaVar).mo5129b("openIntentAsync", map2);
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(string)) {
            zzbqkVar = zzbqkVar;
            zzaVar = zzaVar;
            map = map;
            string = zzbqk.m5105d(zzbqk.m5104c(zzclbVar.getContext(), zzclbVar.mo5611q(), Uri.parse(string), zzclbVar.mo5577H(), zzclbVar.zzj(), zzclbVar.mo5584N())).toString();
        }
        if (!z5 || zzbqkVar.f9275e == null || !zzbqkVar.m5106e(zzaVar, zzclbVar.getContext(), string, str3)) {
            ((zzcmr) zzaVar).mo5652x(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), string, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), zzbqkVar.f9278h), z, z6, str3);
        } else if (z7) {
            map2.put((String) map.get("event_id"), Boolean.TRUE);
            ((zzbst) zzaVar).mo5129b("openIntentAsync", map2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("OpenGmsgHandler.attributionReportingManager", th);
    }
}
