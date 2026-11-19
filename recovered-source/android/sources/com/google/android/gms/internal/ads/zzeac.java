package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class zzeac {

    /* JADX INFO: renamed from: a */
    public final HashMap f13443a;

    /* JADX INFO: renamed from: b */
    public final Context f13444b;

    /* JADX INFO: renamed from: c */
    public final Executor f13445c;

    /* JADX INFO: renamed from: d */
    public final com.google.android.gms.ads.internal.util.client.zzu f13446d;

    /* JADX INFO: renamed from: e */
    public final boolean f13447e;

    /* JADX INFO: renamed from: f */
    public final CsiUrlBuilder f13448f;

    /* JADX INFO: renamed from: g */
    public final boolean f13449g;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f13450h;

    /* JADX INFO: renamed from: i */
    public final AtomicReference f13451i;

    public zzeac(Executor executor, com.google.android.gms.ads.internal.util.client.zzu zzuVar, CsiUrlBuilder csiUrlBuilder, Context context) {
        this.f13443a = new HashMap();
        this.f13450h = new AtomicBoolean();
        this.f13451i = new AtomicReference(new Bundle());
        this.f13445c = executor;
        this.f13446d = zzuVar;
        zzbio zzbioVar = zzbix.f8073E2;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        this.f13447e = ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue();
        this.f13448f = csiUrlBuilder;
        this.f13449g = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8299R7)).booleanValue();
        this.f13444b = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m6126a(Map map) {
        Bundle bundleM3089b;
        if (map == null || map.isEmpty()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.f13450h.getAndSet(true);
        AtomicReference atomicReference = this.f13451i;
        if (!andSet) {
            final String str = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8352Ub);
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzeaa
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    zzeac zzeacVar = this.f13439a;
                    zzeacVar.f13451i.set(com.google.android.gms.ads.internal.util.zzac.m3089b(zzeacVar.f13444b, str));
                }
            };
            if (TextUtils.isEmpty(str)) {
                bundleM3089b = Bundle.EMPTY;
            } else {
                Context context = this.f13444b;
                PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                bundleM3089b = com.google.android.gms.ads.internal.util.zzac.m3089b(context, str);
            }
            atomicReference.set(bundleM3089b);
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6127b(Map map) {
        if (map.isEmpty()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Empty paramMap.");
            return;
        }
        m6126a(map);
        final String strM3355a = this.f13448f.m3355a(map);
        com.google.android.gms.ads.internal.util.zze.m3150k(strM3355a);
        boolean z = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f13447e) {
            if (!z || this.f13449g) {
                final zzdzy zzdzyVar = (zzdzy) this;
                this.f13445c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeab
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzdzyVar.f13446d.m3081a(null, strM3355a);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6128c(AbstractMap abstractMap) {
        if (abstractMap.isEmpty()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Empty paramMap.");
            return;
        }
        m6126a(abstractMap);
        final String strM3355a = this.f13448f.m3355a(abstractMap);
        com.google.android.gms.ads.internal.util.zze.m3150k(strM3355a);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8102Fe)).booleanValue() || this.f13447e) {
            final zzdzy zzdzyVar = (zzdzy) this;
            this.f13445c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdzyVar.f13446d.m3081a(null, strM3355a);
                }
            });
        }
    }
}
