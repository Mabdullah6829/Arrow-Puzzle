package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import androidx.browser.customtabs.CustomTabsCallback;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjz extends CustomTabsCallback {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f8921a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final List f8922b = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8685ob)).split(","));

    /* JADX INFO: renamed from: c */
    public final zzbkc f8923c;

    /* JADX INFO: renamed from: d */
    public final CustomTabsCallback f8924d;

    /* JADX INFO: renamed from: e */
    public final zzdzy f8925e;

    public zzbjz(zzbkc zzbkcVar, CustomTabsCallback customTabsCallback, zzdzy zzdzyVar) {
        this.f8924d = customTabsCallback;
        this.f8923c = zzbkcVar;
        this.f8925e = zzdzyVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void extraCallback(String str, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.f8924d;
        if (customTabsCallback != null) {
            customTabsCallback.extraCallback(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.f8924d;
        if (customTabsCallback != null) {
            return customTabsCallback.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onActivityResized(int i2, int i3, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.f8924d;
        if (customTabsCallback != null) {
            customTabsCallback.onActivityResized(i2, i3, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onMessageChannelReady(Bundle bundle) {
        this.f8921a.set(false);
        CustomTabsCallback customTabsCallback = this.f8924d;
        if (customTabsCallback != null) {
            customTabsCallback.onMessageChannelReady(bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i2, Bundle bundle) {
        this.f8921a.set(false);
        CustomTabsCallback customTabsCallback = this.f8924d;
        if (customTabsCallback != null) {
            customTabsCallback.onNavigationEvent(i2, bundle);
        }
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zztVar.f3711k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        final zzbkc zzbkcVar = this.f8923c;
        zzbkcVar.f8960j = jCurrentTimeMillis;
        List list = this.f8922b;
        if (list == null || !list.contains(String.valueOf(i2))) {
            return;
        }
        zztVar.f3711k.getClass();
        zzbkcVar.f8959i = SystemClock.elapsedRealtime() + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8634lb)).intValue());
        if (zzbkcVar.f8955e == null) {
            zzbkcVar.f8955e = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbkb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbkcVar.m5052d();
                }
            };
        }
        zzbkcVar.m5052d();
        com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3348d(this.f8925e, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f8921a.set(true);
                com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3348d(this.f8925e, "pact_action", new Pair("pe", "pact_con"));
                this.f8923c.m5049a(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Message is not in JSON format: ", e);
        }
        CustomTabsCallback customTabsCallback = this.f8924d;
        if (customTabsCallback != null) {
            customTabsCallback.onPostMessage(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onRelationshipValidationResult(int i2, Uri uri, boolean z, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.f8924d;
        if (customTabsCallback != null) {
            customTabsCallback.onRelationshipValidationResult(i2, uri, z, bundle);
        }
    }
}
