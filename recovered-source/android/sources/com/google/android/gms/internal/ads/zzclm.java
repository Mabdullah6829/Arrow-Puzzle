package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class zzclm extends WebViewClient implements zzcmz {

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ int f10417a0 = 0;

    /* JADX INFO: renamed from: A */
    public zzbon f10418A;

    /* JADX INFO: renamed from: B */
    public zzbop f10419B;

    /* JADX INFO: renamed from: C */
    public zzdlg f10420C;

    /* JADX INFO: renamed from: D */
    public boolean f10421D;

    /* JADX INFO: renamed from: E */
    public boolean f10422E;

    /* JADX INFO: renamed from: I */
    public boolean f10426I;

    /* JADX INFO: renamed from: J */
    public boolean f10427J;

    /* JADX INFO: renamed from: K */
    public boolean f10428K;

    /* JADX INFO: renamed from: L */
    public boolean f10429L;

    /* JADX INFO: renamed from: M */
    public com.google.android.gms.ads.internal.overlay.zzad f10430M;

    /* JADX INFO: renamed from: N */
    public zzbym f10431N;

    /* JADX INFO: renamed from: O */
    public com.google.android.gms.ads.internal.zzb f10432O;

    /* JADX INFO: renamed from: Q */
    public zzcdu f10434Q;

    /* JADX INFO: renamed from: R */
    public zzdzt f10435R;

    /* JADX INFO: renamed from: S */
    public zzdbv f10436S;

    /* JADX INFO: renamed from: T */
    public boolean f10437T;

    /* JADX INFO: renamed from: U */
    public boolean f10438U;

    /* JADX INFO: renamed from: V */
    public int f10439V;

    /* JADX INFO: renamed from: W */
    public boolean f10440W;

    /* JADX INFO: renamed from: Y */
    public final zzekz f10442Y;

    /* JADX INFO: renamed from: Z */
    public View.OnAttachStateChangeListener f10443Z;

    /* JADX INFO: renamed from: s */
    public final zzclx f10444s;

    /* JADX INFO: renamed from: t */
    public final zzbhw f10445t;

    /* JADX INFO: renamed from: w */
    public com.google.android.gms.ads.internal.client.zza f10448w;

    /* JADX INFO: renamed from: x */
    public com.google.android.gms.ads.internal.overlay.zzr f10449x;

    /* JADX INFO: renamed from: y */
    public zzcmx f10450y;

    /* JADX INFO: renamed from: z */
    public zzcmy f10451z;

    /* JADX INFO: renamed from: u */
    public final HashMap f10446u = new HashMap();

    /* JADX INFO: renamed from: v */
    public final Object f10447v = new Object();

    /* JADX INFO: renamed from: F */
    public int f10423F = 0;

    /* JADX INFO: renamed from: G */
    public String f10424G = "";

    /* JADX INFO: renamed from: H */
    public String f10425H = "";

    /* JADX INFO: renamed from: P */
    public zzbyh f10433P = null;

    /* JADX INFO: renamed from: X */
    public final HashSet f10441X = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8077E6)).split(",")));

    public zzclm(zzclx zzclxVar, zzbhw zzbhwVar, boolean z, zzbym zzbymVar, zzekz zzekzVar) {
        this.f10445t = zzbhwVar;
        this.f10444s = zzclxVar;
        this.f10426I = z;
        this.f10431N = zzbymVar;
        this.f10442Y = zzekzVar;
    }

    /* JADX INFO: renamed from: n */
    public static WebResourceResponse m5623n() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8726r1)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m5624t(zzclx zzclxVar) {
        return ((zzcme) zzclxVar.f10483s).mo5565B() != null && ((zzcme) zzclxVar.f10483s).mo5565B().m6482b();
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m5625u(boolean z, zzclx zzclxVar) {
        return (!z || ((zzcme) zzclxVar.f10483s).mo5609p().m5677b() || ((zzcme) zzclxVar.f10483s).mo5583M().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    /* JADX INFO: renamed from: C */
    public final void mo5626C() {
        zzdlg zzdlgVar = this.f10420C;
        if (zzdlgVar != null) {
            zzdlgVar.mo5626C();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    /* JADX INFO: renamed from: F0 */
    public final void mo5627F0() {
        zzdlg zzdlgVar = this.f10420C;
        if (zzdlgVar != null) {
            zzdlgVar.mo5627F0();
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m5628G() {
        boolean z;
        synchronized (this.f10447v) {
            z = this.f10427J;
        }
        return z;
    }

    /* JADX INFO: renamed from: L */
    public final void m5629L() {
        zzcdu zzcduVar = this.f10434Q;
        if (zzcduVar != null) {
            zzclx zzclxVar = this.f10444s;
            WebView webView = (WebView) zzclxVar.f10483s;
            if (ViewCompat.isAttachedToWindow(webView)) {
                m5641m(webView, zzcduVar, 10);
                return;
            }
            View.OnAttachStateChangeListener onAttachStateChangeListener = this.f10443Z;
            if (onAttachStateChangeListener != null) {
                zzclxVar.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            }
            zzclc zzclcVar = new zzclc(this, zzcduVar);
            this.f10443Z = zzclcVar;
            zzclxVar.addOnAttachStateChangeListener(zzclcVar);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m5630U() {
        zzcmx zzcmxVar = this.f10450y;
        zzclx zzclxVar = this.f10444s;
        if (zzcmxVar != null && ((this.f10437T && this.f10439V <= 0) || this.f10438U || this.f10422E)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8829x2)).booleanValue()) {
                zzclb zzclbVar = zzclxVar.f10483s;
                zzclb zzclbVar2 = zzclxVar.f10483s;
                if (((zzcme) zzclbVar).mo5599f() != null) {
                    zzbje.m5038a(((zzcme) zzclbVar2).mo5599f().f8899b, ((zzcme) zzclbVar2).zzi(), "awfllc");
                }
            }
            zzcmx zzcmxVar2 = this.f10450y;
            boolean z = false;
            if (!this.f10438U && !this.f10422E) {
                z = true;
            }
            zzcmxVar2.mo3001a(this.f10423F, this.f10424G, this.f10425H, z);
            this.f10450y = null;
        }
        zzclxVar.mo5572D();
    }

    /* JADX INFO: renamed from: X */
    public final void m5631X(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        zzclx zzclxVar = this.f10444s;
        boolean zMo5614s0 = zzclxVar.mo5614s0();
        boolean z3 = false;
        boolean z4 = m5625u(zMo5614s0, zzclxVar) || z2;
        if (z4 || !z) {
            z3 = true;
        }
        m5632a(new AdOverlayInfoParcel(zzcVar, z4 ? null : this.f10448w, zMo5614s0 ? null : this.f10449x, this.f10430M, ((zzcme) zzclxVar.f10483s).mo5472h(), zzclxVar, z3 ? null : this.f10420C, str));
    }

    /* JADX INFO: renamed from: a */
    public final void m5632a(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbyh zzbyhVar = this.f10433P;
        boolean z = false;
        if (zzbyhVar != null) {
            synchronized (zzbyhVar.f9521k) {
                z = zzbyhVar.f9528r != null;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzn zznVar = com.google.android.gms.ads.internal.zzt.f3698C.f3702b;
        com.google.android.gms.ads.internal.overlay.zzn.m3014a(this.f10444s.getContext(), adOverlayInfoParcel, !z, this.f10435R);
        zzcdu zzcduVar = this.f10434Q;
        if (zzcduVar != null) {
            String str = adOverlayInfoParcel.f3290D;
            if (str == null && (zzcVar = adOverlayInfoParcel.f3303s) != null) {
                str = zzcVar.f3324t;
            }
            zzcduVar.mo5352m(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5633b(String str, zzbpx zzbpxVar) {
        synchronized (this.f10447v) {
            try {
                HashMap map = this.f10446u;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(zzbpxVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5634c(String str) {
        synchronized (this.f10447v) {
            try {
                List list = (List) this.f10446u.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5635d() {
        zzcdu zzcduVar = this.f10434Q;
        if (zzcduVar != null) {
            zzcduVar.mo5350b();
            this.f10434Q = null;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f10443Z;
        if (onAttachStateChangeListener != null) {
            this.f10444s.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        synchronized (this.f10447v) {
            try {
                this.f10446u.clear();
                this.f10448w = null;
                this.f10449x = null;
                this.f10450y = null;
                this.f10451z = null;
                this.f10418A = null;
                this.f10419B = null;
                this.f10421D = false;
                this.f10426I = false;
                this.f10427J = false;
                this.f10428K = false;
                this.f10430M = null;
                this.f10432O = null;
                this.f10431N = null;
                zzbyh zzbyhVar = this.f10433P;
                if (zzbyhVar != null) {
                    zzbyhVar.m5259f(true);
                    this.f10433P = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0308 A[Catch: NoClassDefFoundError -> 0x0030, Exception -> 0x0033, TryCatch #16 {Exception -> 0x0033, NoClassDefFoundError -> 0x0030, blocks: (B:3:0x0014, B:5:0x0025, B:10:0x0036, B:12:0x0046, B:14:0x004d, B:16:0x005b, B:18:0x0077, B:20:0x0091, B:22:0x00aa, B:24:0x00b0, B:26:0x00b4, B:28:0x00c6, B:31:0x00d2, B:33:0x00e2, B:35:0x00f7, B:95:0x0244, B:53:0x018e, B:121:0x0308, B:124:0x031a, B:126:0x0320, B:128:0x032e, B:84:0x01e5, B:96:0x0279, B:97:0x02af, B:52:0x015d, B:34:0x00ed, B:98:0x02b0, B:100:0x02ba, B:102:0x02c0, B:104:0x02c3, B:105:0x02c4, B:106:0x02e1, B:108:0x02e4, B:109:0x02e5, B:111:0x02f3, B:115:0x0300, B:118:0x0303), top: B:142:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0320 A[Catch: NoClassDefFoundError -> 0x0030, Exception -> 0x0033, TryCatch #16 {Exception -> 0x0033, NoClassDefFoundError -> 0x0030, blocks: (B:3:0x0014, B:5:0x0025, B:10:0x0036, B:12:0x0046, B:14:0x004d, B:16:0x005b, B:18:0x0077, B:20:0x0091, B:22:0x00aa, B:24:0x00b0, B:26:0x00b4, B:28:0x00c6, B:31:0x00d2, B:33:0x00e2, B:35:0x00f7, B:95:0x0244, B:53:0x018e, B:121:0x0308, B:124:0x031a, B:126:0x0320, B:128:0x032e, B:84:0x01e5, B:96:0x0279, B:97:0x02af, B:52:0x015d, B:34:0x00ed, B:98:0x02b0, B:100:0x02ba, B:102:0x02c0, B:104:0x02c3, B:105:0x02c4, B:106:0x02e1, B:108:0x02e4, B:109:0x02e5, B:111:0x02f3, B:115:0x0300, B:118:0x0303), top: B:142:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cb A[Catch: all -> 0x01d3, TryCatch #10 {all -> 0x01d3, blocks: (B:91:0x0223, B:93:0x0235, B:94:0x023c, B:78:0x01b9, B:80:0x01cb, B:83:0x01d6), top: B:137:0x00f7 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0235 A[Catch: all -> 0x01d3, TryCatch #10 {all -> 0x01d3, blocks: (B:91:0x0223, B:93:0x0235, B:94:0x023c, B:78:0x01b9, B:80:0x01cb, B:83:0x01d6), top: B:137:0x00f7 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final WebResourceResponse m5636e(String str, Map map) throws Throwable {
        WebResourceResponse webResourceResponse;
        int i2;
        InputStream zzgzsVar;
        boolean z;
        long j2;
        InputStream inputStreamM4887w;
        Long l2;
        final boolean z2;
        Future future;
        final boolean z3;
        final boolean z4;
        String string;
        String str2 = "ms";
        try {
            HashMap map2 = new HashMap();
            zzclx zzclxVar = this.f10444s;
            if (((zzcme) zzclxVar.f10483s).mo5565B() != null) {
                map2 = ((zzcme) zzclxVar.f10483s).mo5565B().f15961w0;
            }
            String strM5373a = zzcei.m5373a(str, zzclxVar.getContext(), this.f10440W, map2);
            if (!strM5373a.equals(str)) {
                return m5642r(strM5373a, map);
            }
            Parcelable.Creator<zzbhi> creator = zzbhi.CREATOR;
            zzbhi zzbhiVarM4889w = zzbhi.m4889w(Uri.parse(str));
            if (zzbhiVarM4889w != null) {
                HashMap map3 = new HashMap();
                webResourceResponse = null;
                map3.put("Access-Control-Allow-Origin", ProxyConfig.MATCH_ALL_SCHEMES);
                Uri uri = Uri.parse(str);
                if (uri.getQueryParameterNames().contains("range")) {
                    List listM7147e = zzgug.m7143a(new zzgtb('-')).m7147e(uri.getQueryParameter("range"));
                    if (listM7147e.size() == 2) {
                        int i3 = Integer.parseInt((String) listM7147e.get(0));
                        int i4 = Integer.parseInt((String) listM7147e.get(1)) + 1;
                        if (i3 > 0) {
                            zzbhiVarM4889w.f7862z = i3;
                        }
                        i2 = i4 - i3;
                    } else {
                        str2 = "ms";
                        i2 = -1;
                    }
                } else {
                    str2 = "ms";
                    i2 = -1;
                }
                zzbio zzbioVar = zzbix.f8594j5;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    String strMo5471g = ((zzcme) zzclxVar.f10483s).mo5471g();
                    if (strMo5471g == null) {
                        strMo5471g = "";
                    }
                    zzbhiVarM4889w.f7853A = strMo5471g;
                    zzbhiVarM4889w.f7854B = ((zzcme) zzclxVar.f10483s).mo5473i();
                    if (zzbhiVarM4889w.f7861y) {
                        l2 = (Long) zzbaVar.f3098c.m5030a(zzbix.f8628l5);
                    } else {
                        l2 = (Long) zzbaVar.f3098c.m5030a(zzbix.f8611k5);
                    }
                    try {
                        long jLongValue = l2.longValue();
                        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                        zztVar.f3711k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Future futureM4891a = zzbht.m4891a(zzclxVar.getContext(), zzbhiVarM4889w);
                        try {
                            try {
                                future = futureM4891a;
                                try {
                                    zzbhu zzbhuVar = (zzbhu) ((zzcgd) future).f9959s.get(jLongValue, TimeUnit.MILLISECONDS);
                                    try {
                                        try {
                                            map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbhuVar.f7880b));
                                            map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbhuVar.f7881c));
                                            map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbhuVar.f7883e));
                                            map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbhuVar.f7882d));
                                            inputStreamM4887w = zzbhuVar.f7879a;
                                            if (i2 != -1) {
                                                long j3 = i2 == true ? 1L : 0L;
                                                try {
                                                    int i5 = zzgzt.f18406a;
                                                    inputStreamM4887w = new zzgzs(inputStreamM4887w, j3);
                                                } catch (InterruptedException e) {
                                                    e = e;
                                                    z4 = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8679o5)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewClient.interceptRequest.gcache", e);
                                                    }
                                                    ((zzbhm) future).cancel(true);
                                                    Thread.currentThread().interrupt();
                                                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                                    final long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclg
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            this.f10403s.f10444s.mo5475l0(z4, jElapsedRealtime2);
                                                        }
                                                    });
                                                    StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 24);
                                                    sb.append("Cache connection took ");
                                                    sb.append(jElapsedRealtime2);
                                                    sb.append(str2);
                                                    string = sb.toString();
                                                } catch (ExecutionException e2) {
                                                    e = e2;
                                                    z3 = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8679o5)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewClient.interceptRequest.gcache", e);
                                                    }
                                                    ((zzbhm) future).cancel(true);
                                                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                                    final long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            this.f10400s.f10444s.mo5475l0(z3, jElapsedRealtime3);
                                                        }
                                                    });
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 24);
                                                    sb2.append("Cache connection took ");
                                                    sb2.append(jElapsedRealtime3);
                                                    sb2.append(str2);
                                                    string = sb2.toString();
                                                } catch (TimeoutException e3) {
                                                    e = e3;
                                                    z3 = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8679o5)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewClient.interceptRequest.gcache", e);
                                                    }
                                                    ((zzbhm) future).cancel(true);
                                                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                                    final long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            this.f10400s.f10444s.mo5475l0(z3, jElapsedRealtime4);
                                                        }
                                                    });
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 24);
                                                    sb3.append("Cache connection took ");
                                                    sb3.append(jElapsedRealtime4);
                                                    sb3.append(str2);
                                                    string = sb3.toString();
                                                }
                                            }
                                            zztVar.f3711k.getClass();
                                            final long jElapsedRealtime5 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcle
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    this.f10398s.f10444s.mo5475l0(true, jElapsedRealtime5);
                                                }
                                            });
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime5).length() + 24);
                                            sb4.append("Cache connection took ");
                                            sb4.append(jElapsedRealtime5);
                                            sb4.append(str2);
                                            string = sb4.toString();
                                        } catch (Throwable th) {
                                            th = th;
                                            z2 = 1;
                                            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                            final long jElapsedRealtime6 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclh
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    this.f10406s.f10444s.mo5475l0(z2, jElapsedRealtime6);
                                                }
                                            });
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(jElapsedRealtime6).length() + 24);
                                            sb5.append("Cache connection took ");
                                            sb5.append(jElapsedRealtime6);
                                            sb5.append(str2);
                                            com.google.android.gms.ads.internal.util.zze.m3150k(sb5.toString());
                                            throw th;
                                        }
                                    } catch (InterruptedException e4) {
                                        e = e4;
                                        inputStreamM4887w = null;
                                    } catch (ExecutionException e5) {
                                        e = e5;
                                        inputStreamM4887w = null;
                                        z3 = true;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8679o5)).booleanValue()) {
                                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewClient.interceptRequest.gcache", e);
                                        }
                                        ((zzbhm) future).cancel(true);
                                        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                        final long jElapsedRealtime7 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                this.f10400s.f10444s.mo5475l0(z3, jElapsedRealtime7);
                                            }
                                        });
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(jElapsedRealtime7).length() + 24);
                                        sb6.append("Cache connection took ");
                                        sb6.append(jElapsedRealtime7);
                                        sb6.append(str2);
                                        string = sb6.toString();
                                        com.google.android.gms.ads.internal.util.zze.m3150k(string);
                                        zzgzsVar = inputStreamM4887w;
                                        if (zzgzsVar != null) {
                                            return new WebResourceResponse("", "", 200, "OK", map3, zzgzsVar);
                                        }
                                        if (com.google.android.gms.ads.internal.util.client.zzl.m3052e()) {
                                        }
                                    } catch (TimeoutException e6) {
                                        e = e6;
                                        inputStreamM4887w = null;
                                        z3 = true;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8679o5)).booleanValue()) {
                                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewClient.interceptRequest.gcache", e);
                                        }
                                        ((zzbhm) future).cancel(true);
                                        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                        final long jElapsedRealtime8 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                this.f10400s.f10444s.mo5475l0(z3, jElapsedRealtime8);
                                            }
                                        });
                                        StringBuilder sb7 = new StringBuilder(String.valueOf(jElapsedRealtime8).length() + 24);
                                        sb7.append("Cache connection took ");
                                        sb7.append(jElapsedRealtime8);
                                        sb7.append(str2);
                                        string = sb7.toString();
                                        com.google.android.gms.ads.internal.util.zze.m3150k(string);
                                        zzgzsVar = inputStreamM4887w;
                                        if (zzgzsVar != null) {
                                            return new WebResourceResponse("", "", 200, "OK", map3, zzgzsVar);
                                        }
                                        if (com.google.android.gms.ads.internal.util.client.zzl.m3052e()) {
                                        }
                                    }
                                } catch (InterruptedException e7) {
                                    e = e7;
                                    inputStreamM4887w = null;
                                    z4 = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8679o5)).booleanValue()) {
                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewClient.interceptRequest.gcache", e);
                                    }
                                    ((zzbhm) future).cancel(true);
                                    Thread.currentThread().interrupt();
                                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                    final long jElapsedRealtime9 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclg
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.f10403s.f10444s.mo5475l0(z4, jElapsedRealtime9);
                                        }
                                    });
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(jElapsedRealtime9).length() + 24);
                                    sb8.append("Cache connection took ");
                                    sb8.append(jElapsedRealtime9);
                                    sb8.append(str2);
                                    string = sb8.toString();
                                    com.google.android.gms.ads.internal.util.zze.m3150k(string);
                                    zzgzsVar = inputStreamM4887w;
                                    if (zzgzsVar != null) {
                                        return new WebResourceResponse("", "", 200, "OK", map3, zzgzsVar);
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.m3052e()) {
                                    }
                                } catch (ExecutionException e8) {
                                    e = e8;
                                    inputStreamM4887w = null;
                                    z3 = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8679o5)).booleanValue()) {
                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewClient.interceptRequest.gcache", e);
                                    }
                                    ((zzbhm) future).cancel(true);
                                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                    final long jElapsedRealtime10 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.f10400s.f10444s.mo5475l0(z3, jElapsedRealtime10);
                                        }
                                    });
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(jElapsedRealtime10).length() + 24);
                                    sb9.append("Cache connection took ");
                                    sb9.append(jElapsedRealtime10);
                                    sb9.append(str2);
                                    string = sb9.toString();
                                    com.google.android.gms.ads.internal.util.zze.m3150k(string);
                                    zzgzsVar = inputStreamM4887w;
                                    if (zzgzsVar != null) {
                                        return new WebResourceResponse("", "", 200, "OK", map3, zzgzsVar);
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.m3052e()) {
                                    }
                                } catch (TimeoutException e9) {
                                    e = e9;
                                    inputStreamM4887w = null;
                                    z3 = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8679o5)).booleanValue()) {
                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewClient.interceptRequest.gcache", e);
                                    }
                                    ((zzbhm) future).cancel(true);
                                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                    final long jElapsedRealtime11 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.f10400s.f10444s.mo5475l0(z3, jElapsedRealtime11);
                                        }
                                    });
                                    StringBuilder sb10 = new StringBuilder(String.valueOf(jElapsedRealtime11).length() + 24);
                                    sb10.append("Cache connection took ");
                                    sb10.append(jElapsedRealtime11);
                                    sb10.append(str2);
                                    string = sb10.toString();
                                    com.google.android.gms.ads.internal.util.zze.m3150k(string);
                                    zzgzsVar = inputStreamM4887w;
                                    if (zzgzsVar != null) {
                                        return new WebResourceResponse("", "", 200, "OK", map3, zzgzsVar);
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.m3052e()) {
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z2 = 0;
                            }
                        } catch (InterruptedException e10) {
                            e = e10;
                            future = futureM4891a;
                        } catch (ExecutionException e11) {
                            e = e11;
                            future = futureM4891a;
                            inputStreamM4887w = null;
                            z3 = false;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8679o5)).booleanValue()) {
                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewClient.interceptRequest.gcache", e);
                            }
                            ((zzbhm) future).cancel(true);
                            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                            final long jElapsedRealtime12 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.f10400s.f10444s.mo5475l0(z3, jElapsedRealtime12);
                                }
                            });
                            StringBuilder sb11 = new StringBuilder(String.valueOf(jElapsedRealtime12).length() + 24);
                            sb11.append("Cache connection took ");
                            sb11.append(jElapsedRealtime12);
                            sb11.append(str2);
                            string = sb11.toString();
                            com.google.android.gms.ads.internal.util.zze.m3150k(string);
                            zzgzsVar = inputStreamM4887w;
                            if (zzgzsVar != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, zzgzsVar);
                            }
                            if (com.google.android.gms.ads.internal.util.client.zzl.m3052e()) {
                            }
                        } catch (TimeoutException e12) {
                            e = e12;
                            future = futureM4891a;
                            inputStreamM4887w = null;
                            z3 = false;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8679o5)).booleanValue()) {
                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewClient.interceptRequest.gcache", e);
                            }
                            ((zzbhm) future).cancel(true);
                            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                            final long jElapsedRealtime13 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.f10400s.f10444s.mo5475l0(z3, jElapsedRealtime13);
                                }
                            });
                            StringBuilder sb12 = new StringBuilder(String.valueOf(jElapsedRealtime13).length() + 24);
                            sb12.append("Cache connection took ");
                            sb12.append(jElapsedRealtime13);
                            sb12.append(str2);
                            string = sb12.toString();
                            com.google.android.gms.ads.internal.util.zze.m3150k(string);
                            zzgzsVar = inputStreamM4887w;
                            if (zzgzsVar != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, zzgzsVar);
                            }
                            if (com.google.android.gms.ads.internal.util.client.zzl.m3052e()) {
                            }
                        }
                        com.google.android.gms.ads.internal.util.zze.m3150k(string);
                    } catch (Throwable th3) {
                        th = th3;
                        z2 = i2;
                    }
                } else {
                    zzbhf zzbhfVarM4882b = com.google.android.gms.ads.internal.zzt.f3698C.f3710j.m4882b(zzbhiVarM4889w);
                    if (zzbhfVarM4882b == null || !zzbhfVarM4882b.zza()) {
                        zzgzsVar = null;
                    } else {
                        synchronized (zzbhfVarM4882b) {
                            z = zzbhfVarM4882b.f7849t;
                        }
                        map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(z));
                        map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbhfVarM4882b.m4885H()));
                        map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbhfVarM4882b.m4886a()));
                        synchronized (zzbhfVarM4882b) {
                            j2 = zzbhfVarM4882b.f7851v;
                        }
                        map3.put("X-Afma-Gcache-CachedBytes", Long.toString(j2));
                        inputStreamM4887w = zzbhfVarM4882b.m4887w();
                        if (i2 != -1) {
                            long j4 = i2 == true ? 1L : 0L;
                            int i6 = zzgzt.f18406a;
                            zzgzsVar = new zzgzs(inputStreamM4887w, j4);
                        }
                    }
                    if (zzgzsVar != null) {
                        return new WebResourceResponse("", "", 200, "OK", map3, zzgzsVar);
                    }
                }
                zzgzsVar = inputStreamM4887w;
                if (zzgzsVar != null) {
                    return new WebResourceResponse("", "", 200, "OK", map3, zzgzsVar);
                }
            } else {
                webResourceResponse = null;
            }
            return (com.google.android.gms.ads.internal.util.client.zzl.m3052e() || !((Boolean) zzbkt.f9017b.m5057c()).booleanValue()) ? webResourceResponse : m5642r(str, map);
        } catch (Exception e13) {
            e = e13;
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewClient.interceptRequest", e);
            return m5623n();
        } catch (NoClassDefFoundError e14) {
            e = e14;
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewClient.interceptRequest", e);
            return m5623n();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5637g(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.m3150k("Received GMSG: ".concat(String.valueOf(uri)));
        String path = uri.getPath();
        List list = (List) this.f10446u.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.m3150k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8078E7)).booleanValue() || com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5381a() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            ((zzcfx) zzcfy.f9946a).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclj
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i2 = zzclm.f10417a0;
                    zzbjc zzbjcVarM5381a = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5381a();
                    HashSet hashSet = zzbjcVarM5381a.f8889g;
                    String str = strSubstring;
                    if (hashSet.contains(str)) {
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("sdkVersion", zzbjcVarM5381a.f8888f);
                    linkedHashMap.put("ue", str);
                    zzbjcVarM5381a.m5036b(zzbjcVarM5381a.m5035a(zzbjcVarM5381a.f8884b, linkedHashMap), null);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        zzbio zzbioVar = zzbix.f8060D6;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && this.f10441X.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8094F6)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.m3150k("Parsing gmsg query params on BG thread: ".concat(path));
                ListenableFuture listenableFutureM3232F = com.google.android.gms.ads.internal.zzt.f3698C.f3703c.m3232F(uri);
                zzcld zzcldVar = new zzcld(this, list, path, uri);
                ((zzhay) listenableFutureM3232F).addListener(new zzhcd(listenableFutureM3232F, zzcldVar), zzcfy.f9951f);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        m5643s(path, com.google.android.gms.ads.internal.util.zzs.m3216o(uri), list);
    }

    /* JADX INFO: renamed from: i */
    public final void m5638i(boolean z) {
        synchronized (this.f10447v) {
            this.f10429L = z;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5639j(int i2, int i3) {
        zzbym zzbymVar = this.f10431N;
        if (zzbymVar != null) {
            zzbymVar.m5261f(i2, i3);
        }
        zzbyh zzbyhVar = this.f10433P;
        if (zzbyhVar != null) {
            synchronized (zzbyhVar.f9521k) {
                zzbyhVar.f9515e = i2;
                zzbyhVar.f9516f = i3;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public final void mo2730k() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.f10448w;
        if (zzaVar != null) {
            zzaVar.mo2730k();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5640l(com.google.android.gms.ads.internal.client.zza zzaVar, zzbon zzbonVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbop zzbopVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z, zzbqa zzbqaVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbyo zzbyoVar, zzcdu zzcduVar, final zzeko zzekoVar, final zzfsm zzfsmVar, zzdzt zzdztVar, zzbqs zzbqsVar, zzdlg zzdlgVar, zzbqr zzbqrVar, zzbql zzbqlVar, zzbpy zzbpyVar, zzctq zzctqVar, zzeaw zzeawVar, zzdca zzdcaVar, zzdbv zzdbvVar) {
        zzclx zzclxVar = this.f10444s;
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(zzclxVar.getContext(), zzcduVar) : zzbVar;
        this.f10433P = new zzbyh(zzclxVar, zzbyoVar);
        this.f10434Q = zzcduVar;
        zzbio zzbioVar = zzbix.f8004A1;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            m5633b("/adMetadata", new zzbom(zzbonVar));
        }
        if (zzbopVar != null) {
            m5633b("/appEvent", new zzboo(zzbopVar));
        }
        m5633b("/backButton", zzbpw.f9230j);
        m5633b("/refresh", zzbpw.f9231k);
        m5633b("/canOpenApp", zzbpw.f9222b);
        m5633b("/canOpenURLs", zzbpw.f9221a);
        m5633b("/canOpenIntents", zzbpw.f9223c);
        m5633b("/close", zzbpw.f9224d);
        m5633b("/customClose", zzbpw.f9225e);
        m5633b("/instrument", zzbpw.f9234n);
        m5633b("/delayPageLoaded", zzbpw.f9236p);
        m5633b("/delayPageClosed", zzbpw.f9237q);
        m5633b("/getLocationInfo", zzbpw.f9238r);
        m5633b("/log", zzbpw.f9227g);
        m5633b("/mraid", new zzbqe(zzbVar2, this.f10433P, zzbyoVar));
        zzbym zzbymVar = this.f10431N;
        if (zzbymVar != null) {
            m5633b("/mraidLoaded", zzbymVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        m5633b("/open", new zzbqk(zzbVar3, this.f10433P, zzekoVar, zzdztVar, zzctqVar, zzdcaVar));
        m5633b("/precache", new zzcji());
        m5633b("/touch", zzbpw.f9229i);
        m5633b("/video", zzbpw.f9232l);
        m5633b("/videoMeta", zzbpw.f9233m);
        if (zzekoVar == null || zzfsmVar == null) {
            m5633b("/click", new zzbpr(zzdlgVar, zzctqVar));
            m5633b("/httpTrack", zzbpw.f9226f);
        } else {
            m5633b("/click", new zzflq(zzdlgVar, zzctqVar, zzfsmVar, zzekoVar));
            m5633b("/httpTrack", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzflp
                @Override // com.google.android.gms.internal.ads.zzbpx
                /* JADX INFO: renamed from: a */
                public final void mo5095a(Object obj, Map map) {
                    zzcks zzcksVar = (zzcks) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("URL missing from httpTrack GMSG.");
                        return;
                    }
                    zzfkn zzfknVarMo5565B = zzcksVar.mo5565B();
                    if (zzfknVarMo5565B != null && !zzfknVarMo5565B.f15933i0) {
                        zzfsmVar.m6643b(str, zzfknVarMo5565B.f15963x0, null, null);
                        return;
                    }
                    zzfkq zzfkqVarMo5587Q = ((zzcmi) zzcksVar).mo5587Q();
                    if (zzfkqVarMo5587Q == null) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                    zzekq zzekqVar = new zzekq(System.currentTimeMillis(), zzfkqVarMo5587Q.f15973b, str, 2);
                    zzeko zzekoVar2 = zzekoVar;
                    zzekoVar2.getClass();
                    zzekoVar2.m6258c(new zzekl(zzekoVar2, zzekqVar));
                }
            });
        }
        zzceg zzcegVar = com.google.android.gms.ads.internal.zzt.f3698C.f3725y;
        Context context = zzclxVar.getContext();
        zzclb zzclbVar = zzclxVar.f10483s;
        if (zzcegVar.m5361a(context)) {
            HashMap map = new HashMap();
            if (((zzcme) zzclbVar).mo5565B() != null) {
                map = ((zzcme) zzclbVar).mo5565B().f15961w0;
            }
            m5633b("/logScionEvent", new zzbqd(zzclxVar.getContext(), map));
        }
        if (zzbqaVar != null) {
            m5633b("/setInterstitialProperties", new zzbpz(zzbqaVar));
        }
        if (zzbqsVar != null && ((Boolean) zzbivVar2.m5030a(zzbix.f8616ka)).booleanValue()) {
            m5633b("/inspectorNetworkExtras", zzbqsVar);
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8064Da)).booleanValue() && zzbqrVar != null) {
            m5633b("/shareSheet", zzbqrVar);
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8130H8)).booleanValue() && zzeawVar != null) {
            m5633b("/onDeviceStorageEvent", new zzbqf(zzeawVar));
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8149Ia)).booleanValue() && zzbqlVar != null) {
            m5633b("/inspectorOutOfContextTest", zzbqlVar);
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8234Na)).booleanValue() && zzbpyVar != null) {
            m5633b("/inspectorStorage", zzbpyVar);
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8385Wc)).booleanValue()) {
            m5633b("/bindPlayStoreOverlay", zzbpw.f9241u);
            m5633b("/presentPlayStoreOverlay", zzbpw.f9242v);
            m5633b("/expandPlayStoreOverlay", zzbpw.f9243w);
            m5633b("/collapsePlayStoreOverlay", zzbpw.f9244x);
            m5633b("/closePlayStoreOverlay", zzbpw.f9245y);
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8560h4)).booleanValue()) {
            m5633b("/setPAIDPersonalizationEnabled", zzbpw.f9218A);
            m5633b("/resetPAID", zzbpw.f9246z);
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8721qd)).booleanValue() && ((zzcme) zzclbVar).mo5565B() != null && ((zzcme) zzclbVar).mo5565B().f15951r0) {
            m5633b("/writeToLocalStorage", zzbpw.f9219B);
            m5633b("/clearLocalStorageKeys", zzbpw.f9220C);
        }
        this.f10448w = zzaVar;
        this.f10449x = zzrVar;
        this.f10418A = zzbonVar;
        this.f10419B = zzbopVar;
        this.f10430M = zzadVar;
        this.f10432O = zzbVar3;
        this.f10420C = zzdlgVar;
        this.f10435R = zzdztVar;
        this.f10436S = zzdbvVar;
        this.f10421D = z;
    }

    /* JADX INFO: renamed from: m */
    public final void m5641m(final View view, final zzcdu zzcduVar, final int i2) {
        if (!zzcduVar.zzc() || i2 <= 0) {
            return;
        }
        zzcduVar.mo5349a(view);
        if (zzcduVar.zzc()) {
            com.google.android.gms.ads.internal.util.zzs.f3626l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f10411s.m5641m(view, zzcduVar, i2 - 1);
                }
            }, 100L);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.m3150k("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            m5637g(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.f10447v) {
            try {
                zzclx zzclxVar = this.f10444s;
                if (zzclxVar.mo5576F()) {
                    com.google.android.gms.ads.internal.util.zze.m3150k("Blank page loaded, 1...");
                    zzclxVar.m5649G0();
                    return;
                }
                this.f10437T = true;
                zzcmy zzcmyVar = this.f10451z;
                if (zzcmyVar != null) {
                    zzcmyVar.zza();
                    this.f10451z = null;
                }
                m5630U();
                zzclx zzclxVar2 = this.f10444s;
                if (((zzcme) zzclxVar2.f10483s).mo5585O() != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8738rd)).booleanValue() || (toolbar = ((zzcme) zzclxVar2.f10483s).mo5585O().f3359O) == null) {
                        return;
                    }
                    toolbar.setSubtitle(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        this.f10422E = true;
        this.f10423F = i2;
        this.f10424G = str;
        this.f10425H = str2;
    }

    /* JADX INFO: renamed from: r */
    public final WebResourceResponse m5642r(String str, Map map) throws Throwable {
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i2 = 0;
            while (true) {
                i2++;
                if (i2 > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                try {
                    zzclx zzclxVar = this.f10444s;
                    zzsVar.m3228B(zzclxVar.getContext(), ((zzcme) zzclxVar.f10483s).mo5472h().f3396s, httpURLConnection, 60000);
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(0);
                    WebResourceResponse webResourceResponse = null;
                    zzlVar.m3054a(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzlVar.m3056c(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        String contentType = httpURLConnection.getContentType();
                        String strTrim = "";
                        String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
                        String contentType2 = httpURLConnection.getContentType();
                        if (!TextUtils.isEmpty(contentType2)) {
                            String[] strArrSplit = contentType2.split(";");
                            if (strArrSplit.length != 1) {
                                for (int i3 = 1; i3 < strArrSplit.length; i3++) {
                                    if (strArrSplit[i3].trim().startsWith("charset")) {
                                        String[] strArrSplit2 = strArrSplit[i3].trim().split("=");
                                        if (strArrSplit2.length > 1) {
                                            strTrim = strArrSplit2[1].trim();
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        String str2 = strTrim;
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        HashMap map2 = new HashMap(headerFields.size());
                        for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                            if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                                map2.put(entry2.getKey(), entry2.getValue().get(0));
                            }
                        }
                        com.google.android.gms.ads.internal.util.zzu zzuVar = com.google.android.gms.ads.internal.zzt.f3698C.f3706f;
                        int responseCode2 = httpURLConnection.getResponseCode();
                        String responseMessage = httpURLConnection.getResponseMessage();
                        InputStream inputStream = httpURLConnection.getInputStream();
                        zzuVar.getClass();
                        webResourceResponse = new WebResourceResponse(strTrim2, str2, responseCode2, responseMessage, map2, inputStream);
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField == null) {
                            throw new IOException("Missing Location header in redirect");
                        }
                        if (!headerField.startsWith("tel:")) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Protocol is null");
                                webResourceResponse = m5623n();
                            } else if (protocol.equals(ProxyConfig.MATCH_HTTP) || protocol.equals(ProxyConfig.MATCH_HTTPS)) {
                                StringBuilder sb = new StringBuilder(headerField.length() + 15);
                                sb.append("Redirecting to ");
                                sb.append(headerField);
                                String string = sb.toString();
                                int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3068a(string);
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                StringBuilder sb2 = new StringBuilder(protocol.length() + 20);
                                sb2.append("Unsupported scheme: ");
                                sb2.append(protocol);
                                String string2 = sb2.toString();
                                int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3073f(string2);
                                webResourceResponse = m5623n();
                            }
                        }
                    }
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponse;
                } catch (Throwable th) {
                    th = th;
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m5643s(String str, Map map, List list) {
        if (com.google.android.gms.ads.internal.util.zze.m3152m()) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbpx) it.next()).mo5095a(this.f10444s, map);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m5636e(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.m3150k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriM4705b = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriM4705b.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriM4705b.getHost())) {
            m5637g(uriM4705b);
            return true;
        }
        boolean z = this.f10421D;
        zzclx zzclxVar = this.f10444s;
        if (z && webView == ((WebView) zzclxVar.f10483s)) {
            String scheme = uriM4705b.getScheme();
            if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(scheme)) {
                com.google.android.gms.ads.internal.client.zza zzaVar = this.f10448w;
                if (zzaVar != null) {
                    zzaVar.mo2730k();
                    zzcdu zzcduVar = this.f10434Q;
                    if (zzcduVar != null) {
                        zzcduVar.mo5352m(str);
                    }
                    this.f10448w = null;
                }
                zzdlg zzdlgVar = this.f10420C;
                if (zzdlgVar != null) {
                    zzdlgVar.mo5626C();
                    this.f10420C = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        Object obj = zzclxVar.f10483s;
        zzclb zzclbVar = zzclxVar.f10483s;
        if (((WebView) obj).willNotDraw()) {
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            zzbaw zzbawVarMo5611q = ((zzcme) zzclbVar).mo5611q();
            zzflk zzflkVarMo5584N = ((zzcme) zzclbVar).mo5584N();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8806vd)).booleanValue() || zzflkVarMo5584N == null) {
                if (zzbawVarMo5611q != null && zzbawVarMo5611q.m4704a(uriM4705b)) {
                    uriM4705b = zzbawVarMo5611q.m4705b(uriM4705b, zzclxVar.getContext(), zzclxVar, ((zzcme) zzclbVar).zzj());
                }
            } else if (zzbawVarMo5611q != null && zzbawVarMo5611q.m4704a(uriM4705b)) {
                uriM4705b = zzflkVarMo5584N.m6489a(uriM4705b, zzclxVar.getContext(), zzclxVar, ((zzcme) zzclbVar).zzj());
            }
        } catch (zzbax unused) {
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.f10432O;
        if (zzbVar == null || zzbVar.m3246a()) {
            m5631X(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriM4705b.toString(), null, null, null, null, null, null), true, false, ((zzcme) zzclbVar).mo5471g());
        } else {
            zzbVar.m3247b(str);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final void m5644v(zzctq zzctqVar, zzeko zzekoVar, zzfsm zzfsmVar) {
        m5634c("/click");
        if (zzekoVar != null && zzfsmVar != null) {
            m5633b("/click", new zzflq(this.f10420C, zzctqVar, zzfsmVar, zzekoVar));
            return;
        }
        zzdlg zzdlgVar = this.f10420C;
        zzbpx zzbpxVar = zzbpw.f9221a;
        m5633b("/click", new zzbpr(zzdlgVar, zzctqVar));
    }

    /* JADX INFO: renamed from: x */
    public final void m5645x(zzctq zzctqVar, zzeko zzekoVar, zzdzt zzdztVar) {
        m5634c("/open");
        m5633b("/open", new zzbqk(this.f10432O, this.f10433P, zzekoVar, zzdztVar, zzctqVar, null));
    }

    /* JADX INFO: renamed from: z */
    public final boolean m5646z() {
        boolean z;
        synchronized (this.f10447v) {
            z = this.f10426I;
        }
        return z;
    }
}
