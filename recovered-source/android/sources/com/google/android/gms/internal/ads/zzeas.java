package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeas implements AppEventListener, zzdgf, com.google.android.gms.ads.internal.client.zza, zzdcz, zzddt, zzddu, zzden, zzddc, zzfpt {

    /* JADX INFO: renamed from: s */
    public final List f13475s;

    /* JADX INFO: renamed from: t */
    public final zzeag f13476t;

    /* JADX INFO: renamed from: u */
    public long f13477u;

    public zzeas(zzeag zzeagVar, zzcnq zzcnqVar) {
        this.f13476t = zzeagVar;
        this.f13475s = Collections.singletonList(zzcnqVar);
    }

    /* JADX INFO: renamed from: C */
    public final void m6135C(Class cls, String str, Object... objArr) {
        String simpleName = cls.getSimpleName();
        List list = this.f13475s;
        String strConcat = "Event-".concat(simpleName);
        zzeag zzeagVar = this.f13476t;
        zzeagVar.getClass();
        if (((Boolean) zzbkz.f9078a.m5057c()).booleanValue()) {
            long jCurrentTimeMillis = zzeagVar.f13464a.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jCurrentTimeMillis);
                jsonWriter.name("source").value(strConcat);
                jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj = objArr[i2];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("unable to log", e);
            }
            String strValueOf = String.valueOf(stringWriter.toString());
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3072e("AD-DBG ".concat(strValueOf));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: G */
    public final void mo5824G() {
        m6135C(zzdcz.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: a */
    public final void mo5825a() {
        m6135C(zzdcz.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: b */
    public final void mo5826b() {
        m6135C(zzdcz.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    /* JADX INFO: renamed from: c */
    public final void mo5833c() {
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f13477u;
        StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(jElapsedRealtime);
        com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        m6135C(zzden.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: d */
    public final void mo5818d(Context context) {
        m6135C(zzddu.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: e */
    public final void mo6090e(zzfpm zzfpmVar, String str) {
        m6135C(zzfpl.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: g */
    public final void mo6091g(String str) {
        m6135C(zzfpl.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    /* JADX INFO: renamed from: i */
    public final void mo2729i(String str, String str2) {
        m6135C(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: j */
    public final void mo5819j(Context context) {
        m6135C(zzddu.class, "onPause", context);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public final void mo2730k() {
        m6135C(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: l */
    public final void mo5827l(zzcbt zzcbtVar, String str, String str2) {
        m6135C(zzdcz.class, "onRewarded", zzcbtVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: m */
    public final void mo5820m(Context context) {
        m6135C(zzddu.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    /* JADX INFO: renamed from: n */
    public final void mo5838n() {
        m6135C(zzddt.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: r */
    public final void mo6092r(zzfpm zzfpmVar, String str) {
        m6135C(zzfpl.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: s */
    public final void mo5866s(zzfky zzfkyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: t */
    public final void mo6093t(zzfpm zzfpmVar, String str, Throwable th) {
        m6135C(zzfpl.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: u */
    public final void mo5828u() {
        m6135C(zzdcz.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    /* JADX INFO: renamed from: v */
    public final void mo5830v(com.google.android.gms.ads.internal.client.zze zzeVar) {
        m6135C(zzddc.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.f3106s), zzeVar.f3107t, zzeVar.f3108u);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: x */
    public final void mo5829x() {
        m6135C(zzdcz.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: z */
    public final void mo5867z(zzcbk zzcbkVar) {
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        this.f13477u = SystemClock.elapsedRealtime();
        m6135C(zzdgf.class, "onAdRequest", new Object[0]);
    }
}
