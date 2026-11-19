package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzebu implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzece f13513a;

    public zzebu(zzece zzeceVar) {
        Objects.requireNonNull(zzeceVar);
        this.f13513a = zzeceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzece zzeceVar = this.f13513a;
            zzeceVar.f13542c = true;
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            zzeceVar.m6153d((int) (SystemClock.elapsedRealtime() - zzeceVar.f13543d), "com.google.android.gms.ads.MobileAds", "", true);
            zzeceVar.f13548i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebt
                @Override // java.lang.Runnable
                public final void run() {
                    final zzece zzeceVar2 = this.f13511s.f13513a;
                    String str2 = str;
                    Context context = zzeceVar2.f13545f;
                    int i2 = 5;
                    final zzfqg zzfqgVarM6562l = zzfqg.m6562l(context, 5);
                    zzfqgVarM6562l.zza();
                    try {
                        ArrayList arrayList = new ArrayList();
                        JSONObject jSONObject = new JSONObject(str2).getJSONObject("initializer_settings").getJSONObject("config");
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            final String next = itKeys.next();
                            final zzfqg zzfqgVarM6562l2 = zzfqg.m6562l(context, i2);
                            zzfqgVarM6562l2.zza();
                            zzfqgVarM6562l2.mo6571p0(next);
                            final Object obj2 = new Object();
                            final zzcgd zzcgdVar = new zzcgd();
                            ListenableFuture listenableFutureM7373g = zzhcf.m7373g(zzcgdVar, ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8795v2)).longValue(), TimeUnit.SECONDS, zzeceVar2.f13550k);
                            zzeceVar2.f13551l.m6129a(next);
                            zzeceVar2.f13554o.zza(next);
                            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                            final long jElapsedRealtime = SystemClock.elapsedRealtime();
                            listenableFutureM7373g.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebz
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzece zzeceVar3 = zzeceVar2;
                                    Object obj3 = obj2;
                                    zzcgd zzcgdVar2 = zzcgdVar;
                                    String str3 = next;
                                    long j2 = jElapsedRealtime;
                                    zzfqg zzfqgVar = zzfqgVarM6562l2;
                                    zzeceVar3.getClass();
                                    synchronized (obj3) {
                                        try {
                                            if (!zzcgdVar2.f9959s.isDone()) {
                                                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                                zzeceVar3.m6153d((int) (SystemClock.elapsedRealtime() - j2), str3, "Timeout.", false);
                                                zzeceVar3.f13551l.m6131c(str3, "timeout");
                                                zzeceVar3.f13554o.mo5932d(str3, "timeout");
                                                zzfqt zzfqtVar = zzeceVar3.f13555p;
                                                zzfqgVar.mo6565g("Timeout");
                                                zzfqgVar.mo6563L(false);
                                                zzfqtVar.m6588b(zzfqgVar.mo6564e());
                                                zzcgdVar2.m5397a(Boolean.FALSE);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }, zzeceVar2.f13548i);
                            arrayList.add(listenableFutureM7373g);
                            final zzebv zzebvVar = new zzebv(jElapsedRealtime, zzcgdVar, zzeceVar2, zzfqgVarM6562l2, obj2, next);
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                            final ArrayList arrayList2 = new ArrayList();
                            if (jSONObjectOptJSONObject != null) {
                                try {
                                    JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                                    int i3 = 0;
                                    while (i3 < jSONArray.length()) {
                                        JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                        String strOptString = jSONObject2.optString("format", "");
                                        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                                        Bundle bundle = new Bundle();
                                        if (jSONObjectOptJSONObject2 != null) {
                                            Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                            while (itKeys2.hasNext()) {
                                                String next2 = itKeys2.next();
                                                bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                                jSONArray = jSONArray;
                                            }
                                        }
                                        JSONArray jSONArray2 = jSONArray;
                                        arrayList2.add(new zzbsg(bundle, strOptString));
                                        i3++;
                                        jSONArray = jSONArray2;
                                    }
                                } catch (JSONException unused) {
                                }
                            }
                            zzeceVar2.m6153d(0, next, "", false);
                            try {
                                final zzfme zzfmeVarM6082a = zzeceVar2.f13547h.m6082a(new JSONObject(), next);
                                Executor executor = zzeceVar2.f13549j;
                                try {
                                    final zzece zzeceVar3 = zzeceVar2;
                                    try {
                                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzecb
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                String str3 = next;
                                                zzbsa zzbsaVar = zzebvVar;
                                                zzfme zzfmeVar = zzfmeVarM6082a;
                                                ArrayList arrayList3 = arrayList2;
                                                zzece zzeceVar4 = zzeceVar3;
                                                zzeceVar4.getClass();
                                                try {
                                                    try {
                                                        if (Objects.equals(str3, "com.google.ads.mediation.admob.AdMobAdapter")) {
                                                            ((zzebv) zzbsaVar).m6147a();
                                                            return;
                                                        }
                                                        Context context2 = (Context) zzeceVar4.f13546g.get();
                                                        if (context2 == null) {
                                                            context2 = zzeceVar4.f13545f;
                                                        }
                                                        try {
                                                            zzfmeVar.f16105a.mo5183v1(new ObjectWrapper(context2), zzbsaVar, arrayList3);
                                                        } catch (Throwable th) {
                                                            throw new zzfln(th);
                                                        }
                                                    } catch (RemoteException e) {
                                                        int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
                                                    }
                                                } catch (RemoteException e2) {
                                                    throw new zzguo(e2);
                                                } catch (zzfln unused2) {
                                                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 74);
                                                    sb.append("Failed to initialize adapter. ");
                                                    sb.append(str3);
                                                    sb.append(" does not implement the initialize() method.");
                                                    ((zzebv) zzbsaVar).m6148j0(sb.toString());
                                                }
                                            }
                                        };
                                        zzeceVar2 = zzeceVar3;
                                        zzebvVar = zzebvVar;
                                        executor.execute(runnable);
                                    } catch (zzfln e) {
                                        e = e;
                                        zzeceVar2 = zzeceVar3;
                                        zzebvVar = zzebvVar;
                                        try {
                                            String string = "Failed to create Adapter.";
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8841xe)).booleanValue()) {
                                                String message = e.getMessage();
                                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                                sb.append("Failed to create Adapter.");
                                                sb.append(" ");
                                                sb.append(message);
                                                string = sb.toString();
                                            }
                                            zzebvVar.m6148j0(string);
                                        } catch (RemoteException e2) {
                                            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e2);
                                        }
                                    } catch (JSONException e3) {
                                        e = e3;
                                        zzeceVar2 = zzeceVar3;
                                        com.google.android.gms.ads.internal.util.zze.m3151l("Malformed CLD response", e);
                                        zzeceVar2.f13554o.mo5929G("MalformedJson");
                                        zzeae zzeaeVar = zzeceVar2.f13551l;
                                        synchronized (zzeaeVar) {
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8107G2)).booleanValue()) {
                                                HashMap mapM6133e = zzeaeVar.m6133e();
                                                mapM6133e.put("action", "aaia");
                                                mapM6133e.put("aair", "MalformedJson");
                                                zzeaeVar.f13457b.add(mapM6133e);
                                            }
                                        }
                                        zzeceVar2.f13544e.m5398b(e);
                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdapterInitializer.updateAdapterStatus", e);
                                        zzfqt zzfqtVar = zzeceVar2.f13555p;
                                        zzfqgVarM6562l.mo6566h(e);
                                        zzfqgVarM6562l.mo6563L(false);
                                        zzfqtVar.m6588b(zzfqgVarM6562l.mo6564e());
                                        return;
                                    }
                                } catch (zzfln e4) {
                                    e = e4;
                                }
                            } catch (zzfln e5) {
                                e = e5;
                            }
                            i2 = 5;
                        }
                        new zzhce(zzgwt.m7220t(arrayList), false).m7366a(zzeceVar2.f13548i, new Callable() { // from class: com.google.android.gms.internal.ads.zzeca
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                zzece zzeceVar4 = zzeceVar2;
                                zzeceVar4.f13544e.m5397a(Boolean.TRUE);
                                zzfqg zzfqgVar = zzfqgVarM6562l;
                                zzfqgVar.mo6563L(true);
                                zzeceVar4.f13555p.m6588b(zzfqgVar.mo6564e());
                                return null;
                            }
                        });
                    } catch (JSONException e6) {
                        e = e6;
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        synchronized (this) {
            zzece zzeceVar = this.f13513a;
            zzeceVar.f13542c = true;
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            zzeceVar.m6153d((int) (SystemClock.elapsedRealtime() - zzeceVar.f13543d), "com.google.android.gms.ads.MobileAds", "Internal Error.", false);
            zzeceVar.f13544e.m5398b(new Exception());
        }
    }
}
