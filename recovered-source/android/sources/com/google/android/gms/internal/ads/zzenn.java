package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenn implements zzema {

    /* JADX INFO: renamed from: a */
    public final Context f14302a;

    /* JADX INFO: renamed from: b */
    public final zzdno f14303b;

    /* JADX INFO: renamed from: c */
    public final Executor f14304c;

    /* JADX INFO: renamed from: d */
    public final zzfkm f14305d;

    /* JADX INFO: renamed from: e */
    public final zzdzt f14306e;

    public zzenn(Context context, Executor executor, zzdno zzdnoVar, zzfkm zzfkmVar, zzdzt zzdztVar) {
        this.f14302a = context;
        this.f14303b = zzdnoVar;
        this.f14304c = executor;
        this.f14305d = zzfkmVar;
        this.f14306e = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6284a(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        String string;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8034Be)).booleanValue()) {
            zzdzs zzdzsVarM6111a = this.f14306e.m6111a();
            zzdzsVarM6111a.m6107b("action", "cstm_tbs_rndr");
            zzdzsVarM6111a.m6108c();
        }
        try {
            string = zzfknVar.f15958v.getString("tab_url");
        } catch (Exception unused) {
            string = null;
        }
        final Uri uri = string != null ? Uri.parse(string) : null;
        final zzfkq zzfkqVar = zzfkyVar.f16006b.f16002b;
        return zzhcf.m7374h(zzhcj.f18518t, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzenm
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) {
                zzenn zzennVar = this.f14297a;
                Uri uri2 = uri;
                zzfky zzfkyVar2 = zzfkyVar;
                zzfkn zzfknVar2 = zzfknVar;
                zzfkq zzfkqVar2 = zzfkqVar;
                try {
                    CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
                    customTabsIntentBuild.intent.setData(uri2);
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(customTabsIntentBuild.intent, null);
                    zzcgd zzcgdVar = new zzcgd();
                    zzdmi zzdmiVarMo5777d = zzennVar.f14303b.mo5777d(new zzcyq(zzfkyVar2, zzfknVar2, null), new zzdml(new zzenl(zzennVar, zzcgdVar, zzfknVar2), null));
                    zzcgdVar.m5397a(new AdOverlayInfoParcel(zzcVar, null, (zzdfk) ((zzcpv) zzdmiVarMo5777d).f11064s.zzb(), null, new VersionInfoParcel(0, 0, false), null, null, zzfkqVar2.f15973b));
                    zzennVar.f14305d.m6480c(2, 3);
                    return zzhcf.m7367a(zzdmiVarMo5777d.mo5769g());
                } catch (Throwable th) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            }
        }, this.f14304c);
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: b */
    public final boolean mo6285b(zzfky zzfkyVar, zzfkn zzfknVar) {
        String string;
        Context context = this.f14302a;
        if (!(context instanceof Activity) || !zzbjy.m5047a(context)) {
            return false;
        }
        try {
            string = zzfknVar.f15958v.getString("tab_url");
        } catch (Exception unused) {
            string = null;
        }
        return !TextUtils.isEmpty(string);
    }
}
