package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezl implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final Context f15226a;

    /* JADX INFO: renamed from: b */
    public final zzhcp f15227b;

    public zzezl(Context context, zzhcp zzhcpVar) {
        this.f15226a = context;
        this.f15227b = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15227b.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context = this.f15225a.f15226a;
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                zzbio zzbioVar = zzbix.f8379W6;
                zzbiv zzbivVar = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
                String string = !((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue() ? "" : context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
                String string2 = ((Boolean) zzbivVar.m5030a(zzbix.f8411Y6)).booleanValue() ? context.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
                Bundle bundle = null;
                if (((Boolean) zzbivVar.m5030a(zzbix.f8395X6)).booleanValue()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    Bundle bundle2 = new Bundle();
                    if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                        bundle2.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
                    }
                    String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
                    for (int i2 = 0; i2 < 4; i2++) {
                        String str = strArr[i2];
                        if (defaultSharedPreferences.contains(str)) {
                            bundle2.putString(str, defaultSharedPreferences.getString(str, null));
                        }
                    }
                    bundle = bundle2;
                }
                return new zzezj(string, string2, bundle);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 18;
    }
}
