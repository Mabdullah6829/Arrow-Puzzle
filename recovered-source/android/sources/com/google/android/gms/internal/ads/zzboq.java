package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzboq implements zzbpx {

    /* JADX INFO: renamed from: a */
    public static final Pattern f9203a = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f9204b = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        String str = (String) map.get("action");
        boolean zEquals = "tick".equals(str);
        Pattern pattern = f9203a;
        if (!zEquals) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("No value given for CSI experiment.");
                    return;
                }
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8124H2)).booleanValue() || f9204b.matcher(str2).matches()) {
                    zzclbVar.mo5599f().f8899b.m5044c("e", str2);
                    return;
                } else {
                    int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3068a("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                    return;
                }
            }
            if ("extra".equals(str)) {
                String str3 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
                String str4 = (String) map.get("value");
                if (TextUtils.isEmpty(str4)) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("No value given for CSI extra.");
                    return;
                }
                if (TextUtils.isEmpty(str3)) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("No name given for CSI extra.");
                    return;
                }
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8124H2)).booleanValue() || pattern.matcher(str3).matches()) {
                    zzclbVar.mo5599f().f8899b.m5044c(str3, str4);
                    return;
                } else {
                    int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3068a("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get(Constants.ScionAnalytics.PARAM_LABEL);
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str5)) {
            int i7 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("No label given for CSI tick.");
            return;
        }
        zzbio zzbioVar = zzbix.f8124H2;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && !pattern.matcher(str5).matches()) {
            int i8 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            int i9 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("No timestamp given for CSI tick.");
            return;
        }
        try {
            long j2 = Long.parseLong(str7);
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            zztVar.f3711k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zztVar.f3711k.getClass();
            long jElapsedRealtime = (j2 - jCurrentTimeMillis) + SystemClock.elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && !pattern.matcher(str6).matches()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            zzbjk zzbjkVarMo5599f = zzclbVar.mo5599f();
            HashMap map2 = zzbjkVarMo5599f.f8898a;
            zzbjj zzbjjVar = (zzbjj) map2.get(str6);
            String[] strArr = {str5};
            if (zzbjjVar != null) {
                zzbjkVarMo5599f.f8899b.m5042a(zzbjjVar, jElapsedRealtime, strArr);
            }
            map2.put(str5, new zzbjj(jElapsedRealtime, null, null));
        } catch (NumberFormatException e) {
            int i11 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Malformed timestamp for CSI tick.", e);
        }
    }
}
