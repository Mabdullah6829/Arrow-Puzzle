package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdv implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final Context f9796a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f9797b;

    /* JADX INFO: renamed from: c */
    public final com.google.android.gms.ads.internal.util.zzg f9798c;

    /* JADX INFO: renamed from: d */
    public String f9799d = "-1";

    /* JADX INFO: renamed from: e */
    public int f9800e = -1;

    public zzcdv(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.f9797b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f9798c = zzgVar;
        this.f9796a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m5354a(int i2, String str) {
        Context context;
        zzbio zzbioVar = zzbix.f8574i1;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        boolean z = true;
        boolean z2 = (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && this.f9797b.getInt("IABTCF_gdprApplies", -1) == 0) ? false : true;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8523f1)).booleanValue() ? !((str.isEmpty() || str.charAt(0) != '1') && z2) : !(i2 == 0 || ((str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) && z2))) {
            z = false;
        }
        this.f9798c.mo3157S(z);
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8512e7)).booleanValue() && z && (context = this.f9796a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        byte b;
        try {
            zzbio zzbioVar = zzbix.f8557h1;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            zzbiv zzbivVar = zzbaVar.f3098c;
            zzbiv zzbivVar2 = zzbaVar.f3098c;
            if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                boolean zEquals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.f9796a;
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.f9798c;
                if (zEquals) {
                    int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i2 != zzgVar.mo3176y()) {
                        zzgVar.mo3157S(true);
                        com.google.android.gms.ads.internal.util.zzac.m3088a(context);
                    }
                    zzgVar.mo3162a0(i2);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    String strMo3173t = zzgVar.mo3173t();
                    zzgVar.mo3160Y(string);
                    if ((((Boolean) zzbivVar2.m5030a(zzbix.f8574i1)).booleanValue() && sharedPreferences.getInt("IABTCF_gdprApplies", -1) == 0) || Objects.equals(string, strMo3173t)) {
                        return;
                    }
                    zzgVar.mo3157S(true);
                    com.google.android.gms.ads.internal.util.zzac.m3088a(context);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i3 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode != -2004976699) {
                if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (strValueOf.equals("IABTCF_PurposeConsents")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                if (string2.equals("-1") || this.f9799d.equals(string2)) {
                    return;
                }
                this.f9799d = string2;
                m5354a(i3, string2);
                return;
            }
            if (b == 1 && ((Boolean) zzbivVar2.m5030a(zzbix.f8523f1)).booleanValue() && i3 != -1 && this.f9800e != i3) {
                this.f9800e = i3;
                m5354a(i3, string2);
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdMobPlusIdlessListener.onSharedPreferenceChanged", th);
            com.google.android.gms.ads.internal.util.zze.m3151l("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
