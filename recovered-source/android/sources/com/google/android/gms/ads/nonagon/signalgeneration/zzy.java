package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzceq;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzfqq;
import com.google.android.gms.internal.ads.zzhcc;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zzy implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ListenableFuture f3989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcex f3990b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzceq f3991c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzfqg f3992d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzap f3993e;

    public zzy(zzap zzapVar, ListenableFuture listenableFuture, zzcex zzcexVar, zzceq zzceqVar, zzfqg zzfqgVar) {
        this.f3989a = listenableFuture;
        this.f3990b = zzcexVar;
        this.f3991c = zzceqVar;
        this.f3992d = zzfqgVar;
        this.f3993e = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        zzap zzapVar = this.f3993e;
        AtomicBoolean atomicBoolean = zzapVar.f3864U;
        zzbc zzbcVar = (zzbc) obj;
        zzfqq zzfqqVarM3321t4 = zzap.m3321t4(this.f3989a, this.f3990b);
        atomicBoolean.set(true);
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8835x8)).booleanValue();
        zzceq zzceqVar = this.f3991c;
        zzfqg zzfqgVar = this.f3992d;
        if (!zBooleanValue) {
            if (zzceqVar != null) {
                try {
                    zzceqVar.mo5282m("QueryInfo generation has been disabled.");
                } catch (RemoteException e) {
                    String strConcat = "QueryInfo generation has been disabled.".concat(e.toString());
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3070c(strConcat);
                }
            }
            if (!((Boolean) zzbkq.f9011e.m5057c()).booleanValue() || zzfqqVarM3321t4 == null) {
                return;
            }
            zzfqgVar.mo6565g("QueryInfo generation has been disabled.");
            zzfqgVar.mo6563L(false);
            zzfqqVarM3321t4.m6578a(zzfqgVar);
            zzfqqVarM3321t4.m6585h();
            return;
        }
        try {
            if (zzbcVar == null) {
                if (zzceqVar != null) {
                    zzceqVar.mo5283p1(null, null, null);
                }
                zzfqgVar.mo6563L(true);
                if (!((Boolean) zzbkq.f9011e.m5057c()).booleanValue() || zzfqqVarM3321t4 == null) {
                    return;
                }
                zzfqqVarM3321t4.m6578a(zzfqgVar);
                zzfqqVarM3321t4.m6585h();
                return;
            }
            try {
                if (TextUtils.isEmpty(new JSONObject(zzbcVar.f3906b).optString("request_id", ""))) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("The request ID is empty in request JSON.");
                    if (zzceqVar != null) {
                        zzceqVar.mo5282m("Internal error: request ID is empty in request JSON.");
                    }
                    zzfqgVar.mo6565g("Request ID empty");
                    zzfqgVar.mo6563L(false);
                    if (!((Boolean) zzbkq.f9011e.m5057c()).booleanValue() || zzfqqVarM3321t4 == null) {
                        return;
                    }
                    zzfqqVarM3321t4.m6578a(zzfqgVar);
                    zzfqqVarM3321t4.m6585h();
                    return;
                }
                Bundle bundle = zzbcVar.f3908d;
                boolean z = zzapVar.f3852I;
                String str = zzapVar.f3853J;
                String str2 = zzapVar.f3854K;
                if (z && bundle != null && bundle.getInt(str2, -1) == -1) {
                    bundle.putInt(str2, zzapVar.f3855L.get());
                }
                if (zzapVar.f3851H && bundle != null && TextUtils.isEmpty(bundle.getString(str))) {
                    if (TextUtils.isEmpty(zzapVar.f3857N)) {
                        zzapVar.f3857N = com.google.android.gms.ads.internal.zzt.f3698C.f3703c.m3231E(zzapVar.f3870u, zzapVar.f3856M.f3396s);
                    }
                    bundle.putString(str, zzapVar.f3857N);
                }
                if (zzceqVar != null) {
                    zzceqVar.mo5283p1(zzbcVar.f3905a, zzbcVar.f3906b, bundle);
                }
                zzfqgVar.mo6563L(true);
                if (!((Boolean) zzbkq.f9011e.m5057c()).booleanValue() || zzfqqVarM3321t4 == null) {
                    return;
                }
                zzfqqVarM3321t4.m6578a(zzfqgVar);
                zzfqqVarM3321t4.m6585h();
            } catch (JSONException e2) {
                int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to create JSON object from the request string.");
                if (zzceqVar != null) {
                    String string = e2.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 33);
                    sb.append("Internal error for request JSON: ");
                    sb.append(string);
                    zzceqVar.mo5282m(sb.toString());
                }
                zzfqgVar.mo6566h(e2);
                zzfqgVar.mo6563L(false);
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("SignalGeneratorImpl.generateSignals.onSuccess", e2);
                if (!((Boolean) zzbkq.f9011e.m5057c()).booleanValue() || zzfqqVarM3321t4 == null) {
                    return;
                }
                zzfqqVarM3321t4.m6578a(zzfqgVar);
                zzfqqVarM3321t4.m6585h();
            }
        } catch (RemoteException e3) {
            zzfqgVar.mo6566h(e3);
            zzfqgVar.mo6563L(false);
            int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e3);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("SignalGeneratorImpl.generateSignals.onSuccess", e3);
        } finally {
            if (((Boolean) zzbkq.f9011e.m5057c()).booleanValue() && zzfqqVarM3321t4 != null) {
                zzfqqVarM3321t4.m6578a(zzfqgVar);
                zzfqqVarM3321t4.m6585h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8062D8)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("SignalGeneratorImpl.generateSignals", th);
        } else {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("SignalGeneratorImpl.generateSignals", th);
        }
        zzfqq zzfqqVarM3321t4 = zzap.m3321t4(this.f3989a, this.f3990b);
        if (((Boolean) zzbkq.f9011e.m5057c()).booleanValue() && zzfqqVarM3321t4 != null) {
            zzfqg zzfqgVar = this.f3992d;
            zzfqgVar.mo6566h(th);
            zzfqgVar.mo6563L(false);
            zzfqqVarM3321t4.m6578a(zzfqgVar);
            zzfqqVarM3321t4.m6585h();
        }
        zzceq zzceqVar = this.f3991c;
        if (zzceqVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            zzceqVar.mo5282m(message);
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
    }
}
