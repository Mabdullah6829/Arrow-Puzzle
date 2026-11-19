package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbaw;
import com.google.android.gms.internal.ads.zzbax;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkc;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzceq;
import com.google.android.gms.internal.ads.zzces;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzcnq;
import com.google.android.gms.internal.ads.zzdci;
import com.google.android.gms.internal.ads.zzdcj;
import com.google.android.gms.internal.ads.zzdiy;
import com.google.android.gms.internal.ads.zzdvf;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzfkt;
import com.google.android.gms.internal.ads.zzflf;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfmf;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzfqq;
import com.google.android.gms.internal.ads.zzfqt;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzgti;
import com.google.android.gms.internal.ads.zzgui;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbb;
import com.google.android.gms.internal.ads.zzhbm;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbx;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.ads.zzhcp;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public final class zzap extends zzces {

    /* JADX INFO: renamed from: Z */
    public static final ArrayList f3840Z = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* JADX INFO: renamed from: a0 */
    public static final ArrayList f3841a0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* JADX INFO: renamed from: b0 */
    public static final ArrayList f3842b0 = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* JADX INFO: renamed from: c0 */
    public static final ArrayList f3843c0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* JADX INFO: renamed from: A */
    public zzcaa f3844A;

    /* JADX INFO: renamed from: D */
    public final zzdzy f3847D;

    /* JADX INFO: renamed from: E */
    public final zzfsm f3848E;

    /* JADX INFO: renamed from: F */
    public final boolean f3849F;

    /* JADX INFO: renamed from: G */
    public final boolean f3850G;

    /* JADX INFO: renamed from: H */
    public final boolean f3851H;

    /* JADX INFO: renamed from: I */
    public final boolean f3852I;

    /* JADX INFO: renamed from: J */
    public final String f3853J;

    /* JADX INFO: renamed from: K */
    public final String f3854K;

    /* JADX INFO: renamed from: M */
    public final VersionInfoParcel f3856M;

    /* JADX INFO: renamed from: N */
    public String f3857N;

    /* JADX INFO: renamed from: O */
    public final String f3858O;

    /* JADX INFO: renamed from: P */
    public final ArrayList f3859P;

    /* JADX INFO: renamed from: Q */
    public final ArrayList f3860Q;

    /* JADX INFO: renamed from: R */
    public final ArrayList f3861R;

    /* JADX INFO: renamed from: S */
    public final ArrayList f3862S;

    /* JADX INFO: renamed from: W */
    public final zzbkc f3866W;

    /* JADX INFO: renamed from: X */
    public final zzj f3867X;

    /* JADX INFO: renamed from: Y */
    public final zza f3868Y;

    /* JADX INFO: renamed from: t */
    public final zzcnq f3869t;

    /* JADX INFO: renamed from: u */
    public Context f3870u;

    /* JADX INFO: renamed from: v */
    public final zzbaw f3871v;

    /* JADX INFO: renamed from: w */
    public final zzflk f3872w;

    /* JADX INFO: renamed from: x */
    public final zzfmf f3873x;

    /* JADX INFO: renamed from: y */
    public final zzhcp f3874y;

    /* JADX INFO: renamed from: z */
    public final ScheduledExecutorService f3875z;

    /* JADX INFO: renamed from: B */
    public Point f3845B = new Point();

    /* JADX INFO: renamed from: C */
    public Point f3846C = new Point();

    /* JADX INFO: renamed from: L */
    public final AtomicInteger f3855L = new AtomicInteger(0);

    /* JADX INFO: renamed from: T */
    public final AtomicBoolean f3863T = new AtomicBoolean(false);

    /* JADX INFO: renamed from: U */
    public final AtomicBoolean f3864U = new AtomicBoolean(false);

    /* JADX INFO: renamed from: V */
    public final AtomicInteger f3865V = new AtomicInteger(0);

    public zzap(zzcnq zzcnqVar, Context context, zzbaw zzbawVar, zzfmf zzfmfVar, zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, zzdzy zzdzyVar, zzfsm zzfsmVar, VersionInfoParcel versionInfoParcel, zzbkc zzbkcVar, zzflk zzflkVar, zzj zzjVar, zza zzaVar) {
        ArrayList arrayListM3320s4;
        this.f3869t = zzcnqVar;
        this.f3870u = context;
        this.f3871v = zzbawVar;
        this.f3872w = zzflkVar;
        this.f3873x = zzfmfVar;
        this.f3874y = zzhcpVar;
        this.f3875z = scheduledExecutorService;
        this.f3847D = zzdzyVar;
        this.f3848E = zzfsmVar;
        this.f3856M = versionInfoParcel;
        this.f3866W = zzbkcVar;
        zzbio zzbioVar = zzbix.f8564h8;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        this.f3849F = ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue();
        zzbio zzbioVar2 = zzbix.f8547g8;
        zzbiv zzbivVar = zzbaVar.f3098c;
        this.f3850G = ((Boolean) zzbivVar.m5030a(zzbioVar2)).booleanValue();
        this.f3851H = ((Boolean) zzbivVar.m5030a(zzbix.f8597j8)).booleanValue();
        this.f3852I = ((Boolean) zzbivVar.m5030a(zzbix.f8631l8)).booleanValue();
        this.f3853J = (String) zzbivVar.m5030a(zzbix.f8614k8);
        this.f3854K = (String) zzbivVar.m5030a(zzbix.f8648m8);
        this.f3858O = (String) zzbivVar.m5030a(zzbix.f8665n8);
        this.f3867X = zzjVar;
        this.f3868Y = zzaVar;
        if (((Boolean) zzbivVar.m5030a(zzbix.f8682o8)).booleanValue()) {
            this.f3859P = m3320s4((String) zzbivVar.m5030a(zzbix.f8699p8));
            this.f3860Q = m3320s4((String) zzbivVar.m5030a(zzbix.f8716q8));
            this.f3861R = m3320s4((String) zzbivVar.m5030a(zzbix.f8733r8));
            arrayListM3320s4 = m3320s4((String) zzbivVar.m5030a(zzbix.f8750s8));
        } else {
            this.f3859P = f3840Z;
            this.f3860Q = f3841a0;
            this.f3861R = f3842b0;
            arrayListM3320s4 = f3843c0;
        }
        this.f3862S = arrayListM3320s4;
    }

    /* JADX INFO: renamed from: o4 */
    public static boolean m3318o4(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Uri m3319r4(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i2 = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(string.substring(0, i2));
        AbstractC0271e0.m413u(sb, str, "=", str2, "&");
        sb.append(string.substring(i2));
        return Uri.parse(sb.toString());
    }

    /* JADX INFO: renamed from: s4 */
    public static final ArrayList m3320s4(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzgui.m7148a(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t4 */
    public static zzfqq m3321t4(ListenableFuture listenableFuture, zzcex zzcexVar) {
        if (zzfqt.m6587a() && ((Boolean) zzbkq.f9011e.m5057c()).booleanValue()) {
            try {
                zzfqq zzfqqVarMo3353b = ((zzx) zzhcf.m7378l(listenableFuture)).mo3353b();
                zzfqqVarMo3353b.m6579b(new ArrayList(Collections.singletonList(zzcexVar.f9852t)));
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzcexVar.f9854v;
                zzfqqVarMo3353b.m6580c(zzmVar == null ? "" : zzmVar.f3213H);
                zzfqqVarMo3353b.m6581d(zzmVar.f3210E);
                return zzfqqVarMo3353b;
            } catch (ExecutionException e) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cf  */
    @Override // com.google.android.gms.internal.ads.zzcet
    /* JADX INFO: renamed from: E0 */
    public final void mo3322E0(IObjectWrapper iObjectWrapper, final zzcex zzcexVar, zzceq zzceqVar) {
        ListenableFuture listenableFutureM7368b;
        ListenableFuture listenableFutureM7368b2;
        ListenableFuture listenableFutureSubmit;
        ListenableFuture listenableFutureM7368b3;
        final Bundle bundle = new Bundle();
        zzbio zzbioVar = zzbix.f8158J2;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            bundle.putLong("api-call", zzcexVar.f9854v.f3223R);
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            bundle.putLong("dynamite-enter", System.currentTimeMillis());
        }
        this.f3870u = (Context) ObjectWrapper.m3697u0(iObjectWrapper);
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8508e3)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.m2812a();
        }
        zzfqg zzfqgVarM6562l = zzfqg.m6562l(this.f3870u, 22);
        zzfqgVarM6562l.zza();
        if ("UNKNOWN".equals(zzcexVar.f9852t)) {
            List arrayList = new ArrayList();
            zzbio zzbioVar2 = zzbix.f8818w8;
            if (!((String) zzbivVar2.m5030a(zzbioVar2)).isEmpty()) {
                arrayList = Arrays.asList(((String) zzbivVar2.m5030a(zzbioVar2)).split(","));
            }
            if (arrayList.contains(zzv.m3346b(zzcexVar.f9854v))) {
                ListenableFuture listenableFutureM7368b4 = zzhcf.m7368b(new IllegalArgumentException("Unknown format is no longer supported."));
                listenableFutureM7368b2 = zzhcf.m7368b(new IllegalArgumentException("Unknown format is no longer supported."));
                listenableFutureSubmit = listenableFutureM7368b4;
            } else if (((Boolean) zzbivVar2.m5030a(zzbix.f8839xc)).booleanValue()) {
                zzhbb zzhbbVar = (zzhbb) zzcfy.f9946a;
                listenableFutureSubmit = zzhbbVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        zzap zzapVar = this.f3837a;
                        Context context = zzapVar.f3870u;
                        zzcex zzcexVar2 = zzcexVar;
                        return zzapVar.m3328p4(context, zzcexVar2.f9851s, zzcexVar2.f9852t, zzcexVar2.f9853u, zzcexVar2.f9854v, bundle);
                    }
                });
                try {
                    listenableFutureM7368b3 = zzhcf.m7374h(listenableFutureSubmit, new zzhbn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzac
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                            return ((zzx) obj).mo3352a();
                        }
                    }, zzhbbVar);
                } catch (NullPointerException e) {
                    listenableFutureM7368b3 = zzhcf.m7368b(e);
                }
                listenableFutureM7368b2 = listenableFutureM7368b3;
            } else {
                zzx zzxVarM3328p4 = m3328p4(this.f3870u, zzcexVar.f9851s, zzcexVar.f9852t, zzcexVar.f9853u, zzcexVar.f9854v, bundle);
                ListenableFuture listenableFutureM7367a = zzhcf.m7367a(zzxVarM3328p4);
                try {
                    listenableFutureM7368b = zzxVarM3328p4.mo3352a();
                } catch (NullPointerException e2) {
                    listenableFutureM7368b = zzhcf.m7368b(e2);
                }
                listenableFutureM7368b2 = listenableFutureM7368b;
                listenableFutureSubmit = listenableFutureM7367a;
            }
        } else if (((Boolean) zzbivVar2.m5030a(zzbix.f8839xc)).booleanValue()) {
            zzhbb zzhbbVar2 = (zzhbb) zzcfy.f9946a;
            listenableFutureSubmit = zzhbbVar2.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzap zzapVar = this.f3837a;
                    Context context = zzapVar.f3870u;
                    zzcex zzcexVar2 = zzcexVar;
                    return zzapVar.m3328p4(context, zzcexVar2.f9851s, zzcexVar2.f9852t, zzcexVar2.f9853u, zzcexVar2.f9854v, bundle);
                }
            });
            listenableFutureM7368b3 = zzhcf.m7374h(listenableFutureSubmit, new zzhbn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzac
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                    return ((zzx) obj).mo3352a();
                }
            }, zzhbbVar2);
            listenableFutureM7368b2 = listenableFutureM7368b3;
        } else {
            zzx zzxVarM3328p5 = m3328p4(this.f3870u, zzcexVar.f9851s, zzcexVar.f9852t, zzcexVar.f9853u, zzcexVar.f9854v, bundle);
            ListenableFuture listenableFutureM7367a2 = zzhcf.m7367a(zzxVarM3328p5);
            listenableFutureM7368b = zzxVarM3328p5.mo3352a();
            listenableFutureM7368b2 = listenableFutureM7368b;
            listenableFutureSubmit = listenableFutureM7367a2;
        }
        zzhcf.m7377k(listenableFutureM7368b2, new zzy(this, listenableFutureSubmit, zzcexVar, zzceqVar, zzfqgVarM6562l), this.f3869t.mo5688g());
    }

    /* JADX INFO: renamed from: d3 */
    public final void m3323d3(IObjectWrapper iObjectWrapper) {
        zzbio zzbioVar = zzbix.f8383Wa;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            zzbio zzbioVar2 = zzbix.f8801v8;
            if (!((Boolean) zzbivVar2.m5030a(zzbioVar2)).booleanValue()) {
                m3326m4();
            }
            WebView webView = (WebView) ObjectWrapper.m3697u0(iObjectWrapper);
            if (webView == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3070c("The webView cannot be null.");
                return;
            }
            zzhcp zzhcpVar = zzcfy.f9951f;
            zza zzaVar = this.f3868Y;
            final zze zzeVar = new zze(webView, zzaVar, zzhcpVar);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.f3871v, this.f3847D, this.f3848E, this.f3872w, this.f3867X, zzaVar, zzeVar), "gmaSdk");
            if (((Boolean) zzbivVar2.m5030a(zzbix.f8550gb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.f9900l.incrementAndGet();
            }
            if (((Boolean) zzblc.f9106c.m5057c()).booleanValue()) {
                zzaVar.m3314a(webView);
                if (((Boolean) zzblc.f9107d.m5057c()).booleanValue()) {
                    zzeVar.f3930d = ((ScheduledThreadPoolExecutor) zzcfy.f9949d).scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzd
                        @Override // java.lang.Runnable
                        public final void run() {
                            zze zzeVar2 = zzeVar;
                            zzeVar2.f3928b.execute(new zzc(zzeVar2));
                        }
                    }, 0L, ((Integer) zzbivVar2.m5030a(zzbix.f8567hb)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) zzbivVar2.m5030a(zzbioVar2)).booleanValue()) {
                m3326m4();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3324k4(final ArrayList arrayList, final IObjectWrapper iObjectWrapper, zzbzx zzbzxVar, boolean z) {
        Map map;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8835x8)).booleanValue()) {
            try {
                zzbzxVar.mo5280j0("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
                return;
            }
        }
        Callable callable = new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                zzap zzapVar = this.f3818a;
                zzbar zzbarVar = zzapVar.f3871v.f7501b;
                String strMo3262i = zzbarVar != null ? zzbarVar.mo3262i(zzapVar.f3870u, (View) ObjectWrapper.m3697u0(iObjectWrapper), null) : "";
                if (TextUtils.isEmpty(strMo3262i)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList2 = new ArrayList();
                for (Uri uri : arrayList) {
                    if (zzap.m3318o4(uri, zzapVar.f3861R, zzapVar.f3862S)) {
                        arrayList2.add(zzap.m3319r4(uri, "ms", strMo3262i));
                    } else {
                        String strValueOf = String.valueOf(uri);
                        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Not a Google URL: ".concat(strValueOf));
                        arrayList2.add(uri);
                    }
                }
                if (arrayList2.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList2;
            }
        };
        zzhcp zzhcpVar = this.f3874y;
        ListenableFuture listenableFutureSubmit = zzhcpVar.submit(callable);
        zzcaa zzcaaVar = this.f3844A;
        if (zzcaaVar == null || (map = zzcaaVar.f9578t) == null || map.isEmpty()) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3072e("Asset view map is empty.");
        } else {
            listenableFutureSubmit = zzhcf.m7374h(listenableFutureSubmit, new zzhbn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                    final ArrayList arrayList2 = (ArrayList) obj;
                    final zzap zzapVar = this.f3823a;
                    return zzhcf.m7375i(zzapVar.m3329q4("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzgti() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
                        @Override // com.google.android.gms.internal.ads.zzgti
                        public final Object apply(Object obj2) {
                            String str = (String) obj2;
                            ArrayList arrayList3 = new ArrayList();
                            for (Uri uri : arrayList2) {
                                zzap zzapVar2 = zzapVar;
                                if (!zzap.m3318o4(uri, zzapVar2.f3861R, zzapVar2.f3862S) || TextUtils.isEmpty(str)) {
                                    arrayList3.add(uri);
                                } else {
                                    arrayList3.add(zzap.m3319r4(uri, "nas", str));
                                }
                            }
                            return arrayList3;
                        }
                    }, zzapVar.f3874y);
                }
            }, zzhcpVar);
        }
        zzhcf.m7377k(listenableFutureSubmit, new zzz(this, zzbzxVar, z), this.f3869t.mo5688g());
    }

    /* JADX INFO: renamed from: l4 */
    public final void m3325l4(ArrayList arrayList, final IObjectWrapper iObjectWrapper, zzbzx zzbzxVar, boolean z) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ListenableFuture listenableFutureM7374h;
        Map map;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8835x8)).booleanValue()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("The updating URL feature is not enabled.");
            try {
                zzbzxVar.mo5280j0("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
                return;
            }
        }
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            arrayList2 = this.f3860Q;
            arrayList3 = this.f3859P;
            if (i5 >= size) {
                break;
            }
            Object obj = arrayList.get(i5);
            i5++;
            if (m3318o4((Uri) obj, arrayList3, arrayList2)) {
                i4++;
            }
        }
        if (i4 > 1) {
            String strValueOf = String.valueOf(arrayList);
            int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Multiple google urls found: ".concat(strValueOf));
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            final Uri uri = (Uri) obj2;
            if (m3318o4(uri, arrayList3, arrayList2)) {
                Callable callable = new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Exception {
                        zzflk zzflkVar;
                        Uri uriM4705b = uri;
                        try {
                            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8806vd)).booleanValue();
                            zzap zzapVar = this.f3824a;
                            IObjectWrapper iObjectWrapper2 = iObjectWrapper;
                            uriM4705b = (!zBooleanValue || (zzflkVar = zzapVar.f3872w) == null) ? zzapVar.f3871v.m4705b(uriM4705b, zzapVar.f3870u, (View) ObjectWrapper.m3697u0(iObjectWrapper2), null) : zzflkVar.m6489a(uriM4705b, zzapVar.f3870u, (View) ObjectWrapper.m3697u0(iObjectWrapper2), null);
                        } catch (zzbax e2) {
                            int i7 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3074g("", e2);
                        }
                        if (uriM4705b.getQueryParameter("ms") != null) {
                            return uriM4705b;
                        }
                        throw new Exception("Failed to append spam signals to click url.");
                    }
                };
                zzhcp zzhcpVar = this.f3874y;
                ListenableFuture listenableFutureSubmit = zzhcpVar.submit(callable);
                zzcaa zzcaaVar = this.f3844A;
                if (zzcaaVar == null || (map = zzcaaVar.f9578t) == null || map.isEmpty()) {
                    int i7 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3072e("Asset view map is empty.");
                    listenableFutureM7374h = listenableFutureSubmit;
                } else {
                    listenableFutureM7374h = zzhcf.m7374h(listenableFutureSubmit, new zzhbn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ ListenableFuture mo3248b(Object obj3) {
                            final Uri uri2 = (Uri) obj3;
                            zzap zzapVar = this.f3827a;
                            return zzhcf.m7375i(zzapVar.m3329q4("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzgti() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                                @Override // com.google.android.gms.internal.ads.zzgti
                                public final /* synthetic */ Object apply(Object obj4) {
                                    String str = (String) obj4;
                                    ArrayList arrayList5 = zzap.f3840Z;
                                    boolean zIsEmpty = TextUtils.isEmpty(str);
                                    Uri uri3 = uri2;
                                    return !zIsEmpty ? zzap.m3319r4(uri3, "nas", str) : uri3;
                                }
                            }, zzapVar.f3874y);
                        }
                    }, zzhcpVar);
                }
            } else {
                String strValueOf2 = String.valueOf(uri);
                int i8 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Not a Google URL: ".concat(strValueOf2));
                listenableFutureM7374h = zzhcf.m7367a(uri);
            }
            arrayList4.add(listenableFutureM7374h);
        }
        zzhcf.m7377k(zzhcf.m7376j(arrayList4), new zzaa(this, zzbzxVar, z), this.f3869t.mo5688g());
    }

    /* JADX INFO: renamed from: m4 */
    public final void m3326m4() {
        zzbio zzbioVar = zzbix.f8399Xa;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8448ab)).booleanValue()) {
                return;
            }
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8516eb)).booleanValue() && this.f3863T.getAndSet(true)) {
                return;
            }
            m3327n4();
        }
    }

    /* JADX INFO: renamed from: n4 */
    public final void m3327n4() {
        zzap zzapVar;
        ListenableFuture listenableFutureM7368b;
        if (((Boolean) zzblc.f9108e.m5057c()).booleanValue()) {
            zzj zzjVar = this.f3867X;
            synchronized (zzjVar) {
                zzjVar.m3336c(true);
                zzjVar.m3336c(false);
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8839xc)).booleanValue()) {
            listenableFutureM7368b = zzhcf.m7370d(new zzhbm() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
                @Override // com.google.android.gms.internal.ads.zzhbm
                public final /* synthetic */ ListenableFuture zza() {
                    zzap zzapVar2 = this.f3828a;
                    try {
                        return zzapVar2.m3328p4(zzapVar2.f3870u, null, "BANNER", null, null, new Bundle()).mo3352a();
                    } catch (NullPointerException e) {
                        return zzhcf.m7368b(e);
                    }
                }
            }, zzcfy.f9946a);
            zzapVar = this;
        } else {
            try {
                zzapVar = this;
                try {
                    listenableFutureM7368b = zzapVar.m3328p4(this.f3870u, null, "BANNER", null, null, new Bundle()).mo3352a();
                } catch (NullPointerException e) {
                    e = e;
                    listenableFutureM7368b = zzhcf.m7368b(e);
                }
            } catch (NullPointerException e2) {
                e = e2;
                zzapVar = this;
            }
        }
        zzhcf.m7377k(listenableFutureM7368b, new zzab(this), zzapVar.f3869t.mo5688g());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX INFO: renamed from: p4 */
    public final zzx m3328p4(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, Bundle bundle) {
        com.google.android.gms.ads.internal.client.zzr zzrVar2;
        byte b;
        zzflf zzflfVar = new zzflf();
        boolean zEquals = "REWARDED".equals(str2);
        zzfkt zzfktVar = zzflfVar.f16027o;
        if (zEquals) {
            zzfktVar.f15996a = 2;
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfktVar.f15996a = 3;
        }
        zzw zzwVarMo5702u = this.f3869t.mo5702u();
        zzdci zzdciVar = new zzdci();
        zzdciVar.f12021a = context;
        zzflfVar.f16015c = str == null ? "adUnitId" : str;
        zzflfVar.f16013a = zzmVar == null ? new com.google.android.gms.ads.internal.client.zzn().m2978a() : zzmVar;
        if (zzrVar == null) {
            switch (str2) {
                case "NATIVE":
                    b = 3;
                    break;
                case "APP_OPEN_AD":
                    b = 4;
                    break;
                case "REWARDED":
                    b = 1;
                    break;
                case "REWARDED_INTERSTITIAL":
                    b = 2;
                    break;
                case "BANNER":
                    b = 0;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                zzrVar2 = new com.google.android.gms.ads.internal.client.zzr(context, AdSize.f2946i);
            } else if (b == 1 || b == 2) {
                zzrVar2 = new com.google.android.gms.ads.internal.client.zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
            } else if (b != 3) {
                zzrVar2 = b != 4 ? new com.google.android.gms.ads.internal.client.zzr() : com.google.android.gms.ads.internal.client.zzr.m2980H();
            } else {
                zzrVar2 = com.google.android.gms.ads.internal.client.zzr.m2981w();
            }
        } else {
            zzrVar2 = zzrVar;
        }
        zzflfVar.f16014b = zzrVar2;
        zzflfVar.f16031s = true;
        zzflfVar.f16032t = bundle;
        zzdciVar.f12022b = zzflfVar.m6485a();
        zzwVarMo5702u.mo3350a(new zzdcj(zzdciVar));
        zzas zzasVar = new zzas();
        zzasVar.f3889a = str2;
        zzwVarMo5702u.mo3351b(new zzat(zzasVar));
        new zzdiy();
        return zzwVarMo5702u.zza();
    }

    /* JADX INFO: renamed from: q4 */
    public final zzhbx m3329q4(final String str) {
        final zzdvf[] zzdvfVarArr = new zzdvf[1];
        ListenableFuture listenableFutureM6531b = this.f3873x.m6531b();
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) throws JSONException {
                zzdvf zzdvfVar = (zzdvf) obj;
                zzap zzapVar = this.f3834a;
                zzapVar.getClass();
                zzdvfVarArr[0] = zzdvfVar;
                Context context = zzapVar.f3870u;
                zzcaa zzcaaVar = zzapVar.f3844A;
                Map map = zzcaaVar.f9578t;
                JSONObject jSONObjectM3133e = zzbs.m3133e(context, map, map, zzcaaVar.f9577s, null);
                JSONObject jSONObjectM3130b = zzbs.m3130b(zzapVar.f3870u, zzapVar.f3844A.f9577s);
                JSONObject jSONObjectM3131c = zzbs.m3131c(zzapVar.f3844A.f9577s);
                JSONObject jSONObjectM3132d = zzbs.m3132d(zzapVar.f3870u, zzapVar.f3844A.f9577s);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectM3133e);
                jSONObject.put("ad_view_signal", jSONObjectM3130b);
                jSONObject.put("scroll_view_signal", jSONObjectM3131c);
                jSONObject.put("lock_screen_signal", jSONObjectM3132d);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", zzbs.m3134f(null, zzapVar.f3870u, zzapVar.f3846C, zzapVar.f3845B));
                }
                return zzdvfVar.m6068a(jSONObject, str2);
            }
        };
        zzhcp zzhcpVar = this.f3874y;
        ListenableFuture listenableFutureM7374h = zzhcf.m7374h(listenableFutureM6531b, zzhbnVar, zzhcpVar);
        ((zzhay) listenableFutureM7374h).addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
            @Override // java.lang.Runnable
            public final void run() {
                zzap zzapVar = this.f3821s;
                zzdvf zzdvfVar = zzdvfVarArr[0];
                if (zzdvfVar != null) {
                    zzfmf zzfmfVar = zzapVar.f3873x;
                    ListenableFuture listenableFutureM7367a = zzhcf.m7367a(zzdvfVar);
                    synchronized (zzfmfVar) {
                        zzfmfVar.f16106a.addFirst(listenableFutureM7367a);
                    }
                }
            }
        }, zzhcpVar);
        return (zzhbx) zzhcf.m7371e((zzhbx) zzhcf.m7375i((zzhbx) zzhcf.m7373g(zzhbx.m7360q(listenableFutureM7374h), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8852y8)).intValue(), TimeUnit.MILLISECONDS, this.f3875z), new zzgti() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                ArrayList arrayList = zzap.f3840Z;
                return ((JSONObject) obj).optString("nas");
            }
        }, zzhcpVar), Exception.class, new zzgti() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                ArrayList arrayList = zzap.f3840Z;
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("", (Exception) obj);
                return null;
            }
        }, zzhcpVar);
    }
}
