package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfat implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final zzflg f15286a;

    /* JADX INFO: renamed from: b */
    public final PackageInfo f15287b;

    /* JADX INFO: renamed from: c */
    public final com.google.android.gms.ads.internal.util.zzg f15288c;

    public zzfat(zzflg zzflgVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.f15286a = zzflgVar;
        this.f15287b = packageInfo;
        this.f15288c = zzgVar;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        zzflg zzflgVar = this.f15286a;
        ArrayList<String> arrayList = zzflgVar.f16044h;
        Bundle bundle = (Bundle) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            bundle.putInt("native_version", 0);
            return;
        }
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzflgVar.f16045i);
        zzbma zzbmaVar = zzflgVar.f16046j;
        if (zzbmaVar != null) {
            String str2 = "any";
            if (zzbmaVar.f9166s > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i2 = zzbmaVar.f9173z;
                if (i2 == 1) {
                    str = "any";
                } else if (i2 == 2) {
                    str = "landscape";
                } else if (i2 != 3) {
                    str = i2 != 4 ? EnvironmentCompat.MEDIA_UNKNOWN : "square";
                } else {
                    str = "portrait";
                }
                if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str)) {
                    bundle.putString("native_media_orientation", str);
                }
            }
            int i3 = zzbmaVar.f9168u;
            if (i3 != 0) {
                if (i3 != 1) {
                    str2 = i3 != 2 ? EnvironmentCompat.MEDIA_UNKNOWN : "landscape";
                } else {
                    str2 = "portrait";
                }
            }
            if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str2)) {
                bundle.putString("native_image_orientation", str2);
            }
            bundle.putBoolean("native_multiple_images", zzbmaVar.f9169v);
            bundle.putBoolean("use_custom_mute", zzbmaVar.f9172y);
            int i4 = zzbmaVar.f9163A;
            if (i4 != 0) {
                bundle.putBoolean("sccg_tap", zzbmaVar.f9164B);
                bundle.putInt("sccg_dir", i4);
            }
        }
        PackageInfo packageInfo = this.f15287b;
        int i5 = packageInfo != null ? packageInfo.versionCode : 0;
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.f15288c;
        if (i5 > zzgVar.mo3164c()) {
            zzgVar.mo3171r();
            zzgVar.mo3170o(i5);
        }
        JSONObject jSONObjectMo3169h = zzgVar.mo3169h();
        String string = null;
        if (jSONObjectMo3169h != null && (jSONArrayOptJSONArray = jSONObjectMo3169h.optJSONArray(zzflgVar.f16043g)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i6 = zzflgVar.f16048l;
        if (i6 > 1) {
            bundle.putInt("max_num_ads", i6);
        }
        zzbsi zzbsiVar = zzflgVar.f16038b;
        if (zzbsiVar != null) {
            String str3 = zzbsiVar.f9317u;
            if (TextUtils.isEmpty(str3)) {
                String str4 = "p";
                if (zzbsiVar.f9315s >= 2) {
                    int i7 = zzbsiVar.f9318v;
                    if (i7 == 2 || i7 != 3) {
                        str4 = "l";
                    }
                } else {
                    int i8 = zzbsiVar.f9316t;
                    if (i8 == 1) {
                        str4 = "l";
                    } else if (i8 != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 41);
                        sb.append("Instream ad video aspect ratio ");
                        sb.append(i8);
                        sb.append(" is wrong.");
                        com.google.android.gms.ads.internal.util.client.zzo.m3070c(sb.toString());
                        str4 = "l";
                    }
                }
                bundle.putString("ia_var", str4);
            } else {
                bundle.putString("ad_tag", str3);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8687od)).booleanValue() || zzbmaVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbmaVar.f9171x;
        if (zzfwVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", zzfwVar.f3198s);
            bundle2.putBoolean("clickToExpandRequested", zzfwVar.f3200u);
            bundle2.putBoolean("customControlsRequested", zzfwVar.f3199t);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbmaVar.f9167t);
        bundle.putInt("preferred_ad_choices_position", zzbmaVar.f9170w);
    }
}
