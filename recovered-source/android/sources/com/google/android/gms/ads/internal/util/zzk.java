package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbjy;
import com.google.android.gms.internal.ads.zzinp;
import com.google.android.gms.internal.ads.zzinq;

/* JADX INFO: loaded from: classes.dex */
final class zzk implements zzbjx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbjy f3611a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f3612b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f3613c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Uri f3614d;

    public zzk(zzs zzsVar, zzbjy zzbjyVar, Bundle bundle, Context context, Uri uri) {
        this.f3611a = zzbjyVar;
        this.f3612b = bundle;
        this.f3613c = context;
        this.f3614d = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbjx
    public final void zza() {
        zzbjy zzbjyVar = this.f3611a;
        CustomTabsClient customTabsClient = zzbjyVar.f8918b;
        if (customTabsClient == null) {
            zzbjyVar.f8917a = null;
        } else if (zzbjyVar.f8917a == null) {
            zzbjyVar.f8917a = customTabsClient.newSession(null);
        }
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(zzbjyVar.f8917a);
        zzs.m3227z(builder, this.f3612b);
        CustomTabsIntent customTabsIntentBuild = builder.build();
        Intent intent = customTabsIntentBuild.intent;
        Context context = this.f3613c;
        intent.setPackage(zzinp.m8562a(context));
        customTabsIntentBuild.launchUrl(context, this.f3614d);
        Activity activity = (Activity) context;
        zzinq zzinqVar = zzbjyVar.f8919c;
        if (zzinqVar == null) {
            return;
        }
        activity.unbindService(zzinqVar);
        zzbjyVar.f8918b = null;
        zzbjyVar.f8917a = null;
        zzbjyVar.f8919c = null;
    }
}
