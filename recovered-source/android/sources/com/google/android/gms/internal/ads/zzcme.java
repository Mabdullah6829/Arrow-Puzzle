package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
final class zzcme extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzclb {

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ int f10499u0 = 0;

    /* JADX INFO: renamed from: A */
    public final float f10500A;

    /* JADX INFO: renamed from: B */
    public zzfkn f10501B;

    /* JADX INFO: renamed from: C */
    public zzfkq f10502C;

    /* JADX INFO: renamed from: D */
    public boolean f10503D;

    /* JADX INFO: renamed from: E */
    public boolean f10504E;

    /* JADX INFO: renamed from: F */
    public zzclm f10505F;

    /* JADX INFO: renamed from: G */
    public com.google.android.gms.ads.internal.overlay.zzm f10506G;

    /* JADX INFO: renamed from: H */
    public zzelv f10507H;

    /* JADX INFO: renamed from: I */
    public zzelt f10508I;

    /* JADX INFO: renamed from: J */
    public zzcnl f10509J;

    /* JADX INFO: renamed from: K */
    public final String f10510K;

    /* JADX INFO: renamed from: L */
    public boolean f10511L;

    /* JADX INFO: renamed from: M */
    public boolean f10512M;

    /* JADX INFO: renamed from: N */
    public boolean f10513N;

    /* JADX INFO: renamed from: O */
    public boolean f10514O;

    /* JADX INFO: renamed from: P */
    public Boolean f10515P;

    /* JADX INFO: renamed from: Q */
    public boolean f10516Q;

    /* JADX INFO: renamed from: R */
    public final String f10517R;

    /* JADX INFO: renamed from: S */
    public zzcmh f10518S;

    /* JADX INFO: renamed from: T */
    public boolean f10519T;

    /* JADX INFO: renamed from: U */
    public boolean f10520U;

    /* JADX INFO: renamed from: V */
    public zzbly f10521V;

    /* JADX INFO: renamed from: W */
    public zzduh f10522W;

    /* JADX INFO: renamed from: a0 */
    public zzbgk f10523a0;

    /* JADX INFO: renamed from: b0 */
    public int f10524b0;

    /* JADX INFO: renamed from: c0 */
    public int f10525c0;

    /* JADX INFO: renamed from: d0 */
    public zzbjj f10526d0;

    /* JADX INFO: renamed from: e0 */
    public final zzbjj f10527e0;

    /* JADX INFO: renamed from: f0 */
    public zzbjj f10528f0;

    /* JADX INFO: renamed from: g0 */
    public final zzbjk f10529g0;

    /* JADX INFO: renamed from: h0 */
    public int f10530h0;

    /* JADX INFO: renamed from: i0 */
    public com.google.android.gms.ads.internal.overlay.zzm f10531i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f10532j0;

    /* JADX INFO: renamed from: k0 */
    public final com.google.android.gms.ads.internal.util.zzci f10533k0;

    /* JADX INFO: renamed from: l0 */
    public int f10534l0;

    /* JADX INFO: renamed from: m0 */
    public int f10535m0;

    /* JADX INFO: renamed from: n0 */
    public int f10536n0;

    /* JADX INFO: renamed from: o0 */
    public int f10537o0;

    /* JADX INFO: renamed from: p0 */
    public int f10538p0;

    /* JADX INFO: renamed from: q0 */
    public HashMap f10539q0;

    /* JADX INFO: renamed from: r0 */
    public final WindowManager f10540r0;

    /* JADX INFO: renamed from: s */
    public final zzcnd f10541s;

    /* JADX INFO: renamed from: s0 */
    public final zzbhw f10542s0;

    /* JADX INFO: renamed from: t */
    public final zzbaw f10543t;

    /* JADX INFO: renamed from: t0 */
    public boolean f10544t0;

    /* JADX INFO: renamed from: u */
    public final zzflk f10545u;

    /* JADX INFO: renamed from: v */
    public final zzbke f10546v;

    /* JADX INFO: renamed from: w */
    public final VersionInfoParcel f10547w;

    /* JADX INFO: renamed from: x */
    public com.google.android.gms.ads.internal.zzn f10548x;

    /* JADX INFO: renamed from: y */
    public final com.google.android.gms.ads.internal.zza f10549y;

    /* JADX INFO: renamed from: z */
    public final DisplayMetrics f10550z;

    public zzcme(zzcnd zzcndVar, zzcnl zzcnlVar, String str, boolean z, zzbaw zzbawVar, zzbke zzbkeVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbhw zzbhwVar, zzfkn zzfknVar, zzfkq zzfkqVar, zzflk zzflkVar) {
        zzfkq zzfkqVar2;
        String str2;
        super(zzcndVar);
        this.f10503D = false;
        this.f10504E = false;
        this.f10516Q = true;
        this.f10517R = "";
        this.f10534l0 = -1;
        this.f10535m0 = -1;
        this.f10536n0 = -1;
        this.f10537o0 = -1;
        this.f10538p0 = -1;
        this.f10541s = zzcndVar;
        this.f10509J = zzcnlVar;
        this.f10510K = str;
        this.f10513N = z;
        this.f10543t = zzbawVar;
        this.f10545u = zzflkVar;
        this.f10546v = zzbkeVar;
        this.f10547w = versionInfoParcel;
        this.f10548x = zznVar;
        this.f10549y = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f10540r0 = windowManager;
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.f10550z = displayMetrics;
        this.f10500A = displayMetrics.density;
        this.f10542s0 = zzbhwVar;
        this.f10501B = zzfknVar;
        this.f10502C = zzfkqVar;
        this.f10533k0 = new com.google.android.gms.ads.internal.util.zzci(zzcndVar.f10585a, this, this);
        this.f10544t0 = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8450ad)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        zzbio zzbioVar = zzbix.f8433Zc;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8119Ge)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        settings.setUserAgentString(zztVar.f3703c.m3231E(zzcndVar, versionInfoParcel.f3396s));
        com.google.android.gms.ads.internal.util.zzs.m3195N(getContext(), settings);
        setDownloadListener(this);
        m5665S0();
        addJavascriptInterface(new zzcmm(this, new zzcmk(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbjk zzbjkVar = this.f10529g0;
        if (zzbjkVar != null) {
            zzbjm zzbjmVar = zzbjkVar.f8899b;
            zzbjc zzbjcVarM5381a = zztVar.f3708h.m5381a();
            if (zzbjcVarM5381a != null) {
                zzbjcVarM5381a.f8883a.offer(zzbjmVar);
            }
        }
        zzbjm zzbjmVar2 = new zzbjm(this.f10510K);
        zzbjk zzbjkVar2 = new zzbjk(zzbjmVar2);
        this.f10529g0 = zzbjkVar2;
        synchronized (zzbjmVar2.f8904c) {
        }
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8829x2)).booleanValue() && (zzfkqVar2 = this.f10502C) != null && (str2 = zzfkqVar2.f15973b) != null) {
            zzbjmVar2.m5044c("gqi", str2);
        }
        zzbjj zzbjjVarM5041d = zzbjm.m5041d();
        this.f10527e0 = zzbjjVarM5041d;
        zzbjkVar2.f8898a.put("native:view_create", zzbjjVarM5041d);
        Context contextCreatePackageContext = null;
        this.f10528f0 = null;
        this.f10526d0 = null;
        com.google.android.gms.ads.internal.util.zzce zzceVarM3143a = com.google.android.gms.ads.internal.util.zzce.m3143a();
        zzceVarM3143a.getClass();
        com.google.android.gms.ads.internal.util.zze.m3150k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(zzcndVar);
        if (!defaultUserAgent.equals(zzceVarM3143a.f3558a)) {
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f4161a;
            try {
                contextCreatePackageContext = zzcndVar.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (contextCreatePackageContext == null) {
                zzcndVar.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(zzcndVar)).apply();
            }
            zzceVarM3143a.f3558a = defaultUserAgent;
        }
        com.google.android.gms.ads.internal.util.zze.m3150k("User agent is updated.");
        zztVar.f3708h.f9899k.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: A */
    public final synchronized boolean mo5568A() {
        return this.f10516Q;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: A0 */
    public final void mo5569A0(boolean z) {
        this.f10505F.f10440W = z;
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcks
    /* JADX INFO: renamed from: B */
    public final zzfkn mo5565B() {
        return this.f10501B;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: B0 */
    public final void mo5570B0(String str, Predicate predicate) {
        boolean z;
        zzclm zzclmVar = this.f10505F;
        if (zzclmVar != null) {
            synchronized (zzclmVar.f10447v) {
                try {
                    List<zzbpx> list = (List) zzclmVar.f10446u.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (zzbpx zzbpxVar : list) {
                        zzbtc zzbtcVar = (zzbtc) predicate;
                        if (zzbpxVar instanceof zzbsx) {
                            if (((zzbsx) zzbpxVar).f9323a.equals(zzbtcVar.f9332a)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(zzbpxVar);
                        }
                    }
                    list.removeAll(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    /* JADX INFO: renamed from: C */
    public final void mo5626C() {
        zzclm zzclmVar = this.f10505F;
        if (zzclmVar != null) {
            zzclmVar.mo5626C();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: C0 */
    public final void mo5571C0() {
        this.f10544t0 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: D */
    public final void mo5572D() {
        if (this.f10528f0 == null) {
            zzbjk zzbjkVar = this.f10529g0;
            zzbjkVar.getClass();
            zzbjj zzbjjVarM5041d = zzbjm.m5041d();
            this.f10528f0 = zzbjjVarM5041d;
            zzbjkVar.f8898a.put("native:view_load", zzbjjVarM5041d);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: D0 */
    public final void mo5573D0() {
        boolean z;
        HashMap map = new HashMap(3);
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        com.google.android.gms.ads.internal.util.zzaa zzaaVar = zztVar.f3709i;
        synchronized (zzaaVar) {
            z = zzaaVar.f3451a;
        }
        map.put("app_muted", String.valueOf(z));
        map.put("app_volume", String.valueOf(zztVar.f3709i.m3087a()));
        map.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzaa.m3086b(getContext())));
        mo5129b("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: E */
    public final void mo5574E() {
        zzbje.m5038a(this.f10529g0.f8899b, this.f10527e0, "aeh2");
        HashMap map = new HashMap(1);
        map.put("version", this.f10547w.f3396s);
        mo5129b("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: E0 */
    public final synchronized void mo5575E0(boolean z) {
        try {
            boolean z2 = this.f10513N;
            this.f10513N = z;
            m5665S0();
            if (z != z2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8861z0)).booleanValue()) {
                    if (!this.f10509J.m5677b()) {
                    }
                }
                new zzbyn(this, "").m5264d(true != z ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: F */
    public final synchronized boolean mo5576F() {
        return this.f10512M;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    /* JADX INFO: renamed from: F0 */
    public final void mo5627F0() {
        zzclm zzclmVar = this.f10505F;
        if (zzclmVar != null) {
            zzclmVar.mo5627F0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    /* JADX INFO: renamed from: G */
    public final void mo5648G(boolean z, int i2, String str, boolean z2, boolean z3) {
        zzclm zzclmVar = this.f10505F;
        zzclx zzclxVar = zzclmVar.f10444s;
        boolean zMo5614s0 = zzclxVar.mo5614s0();
        boolean zM5625u = zzclm.m5625u(zMo5614s0, zzclxVar);
        boolean z4 = true;
        if (!zM5625u && z2) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zM5625u ? null : zzclmVar.f10448w;
        zzcll zzcllVar = zMo5614s0 ? null : new zzcll(zzclxVar, zzclmVar.f10449x);
        zzbon zzbonVar = zzclmVar.f10418A;
        zzekz zzekzVar = null;
        zzbop zzbopVar = zzclmVar.f10419B;
        boolean z5 = z4;
        zzcll zzcllVar2 = zzcllVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = zzclmVar.f10430M;
        VersionInfoParcel versionInfoParcelMo5472h = ((zzcme) zzclxVar.f10483s).mo5472h();
        zzdlg zzdlgVar = z5 ? null : zzclmVar.f10420C;
        if (zzclm.m5624t(zzclxVar)) {
            zzekzVar = zzclmVar.f10442Y;
        }
        zzclmVar.m5632a(new AdOverlayInfoParcel(zzaVar, zzcllVar2, zzbonVar, zzbopVar, zzadVar, zzclxVar, z, i2, str, versionInfoParcelMo5472h, zzdlgVar, zzekzVar, z3));
    }

    /* JADX INFO: renamed from: G0 */
    public final WebViewClient m5656G0() {
        return this.f10505F;
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmw
    /* JADX INFO: renamed from: H */
    public final View mo5577H() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: H0 */
    public final synchronized void mo5578H0(boolean z) {
        this.f10516Q = z;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: I */
    public final void mo5579I() {
        com.google.android.gms.ads.internal.util.zzci zzciVar = this.f10533k0;
        zzciVar.f3572e = true;
        if (zzciVar.f3571d) {
            zzciVar.m3148a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: I0 */
    public final synchronized void mo5580I0(zzbly zzblyVar) {
        this.f10521V = zzblyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: J */
    public final Context mo5581J() {
        return this.f10541s.f10587c;
    }

    /* JADX INFO: renamed from: J0 */
    public final synchronized void m5657J0() {
        com.google.android.gms.ads.internal.util.zze.m3150k("Destroying WebView!");
        m5666T0();
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzclz(this));
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ zzclm mo5582K() {
        return this.f10505F;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        if (r10.f10538p0 != r9) goto L28;
     */
    /* JADX INFO: renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5658K0() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcme.m5658K0():boolean");
    }

    @Override // com.google.android.gms.ads.internal.zzn
    /* JADX INFO: renamed from: L */
    public final synchronized void mo3269L() {
        com.google.android.gms.ads.internal.zzn zznVar = this.f10548x;
        if (zznVar != null) {
            zznVar.mo3269L();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x003a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0041 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #4 {, blocks: (B:33:0x003b, B:35:0x0041, B:40:0x0048), top: B:74:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0048 A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #4 {, blocks: (B:33:0x003b, B:35:0x0041, B:40:0x0048), top: B:74:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0053  */
    /* JADX WARN: Code duplicated, block: B:49:0x0060 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #2 {, blocks: (B:47:0x005a, B:49:0x0060, B:54:0x0067), top: B:69:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0067 A[Catch: all -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:47:0x005a, B:49:0x0060, B:54:0x0067), top: B:69:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:69:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: L0 */
    public final void m5659L0(String str) {
        Boolean bool;
        Boolean bool2;
        String strConcat;
        Boolean bool3;
        synchronized (this) {
            bool = this.f10515P;
        }
        if (bool == null) {
            synchronized (this) {
                zzcfk zzcfkVar = com.google.android.gms.ads.internal.zzt.f3698C.f3708h;
                synchronized (zzcfkVar.f9889a) {
                    bool3 = zzcfkVar.f9898j;
                }
                this.f10515P = bool3;
                if (bool3 == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        m5660M0(Boolean.TRUE);
                    } catch (IllegalStateException unused) {
                        m5660M0(Boolean.FALSE);
                    }
                }
            }
            if (bool2.booleanValue()) {
                synchronized (this) {
                    if (mo5576F()) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("#004 The webview is destroyed. Ignoring action.");
                    } else {
                        evaluateJavascript(str, null);
                    }
                }
                return;
            }
            strConcat = "javascript:".concat(str);
            synchronized (this) {
                if (mo5576F()) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("#004 The webview is destroyed. Ignoring action.");
                } else {
                    loadUrl(strConcat);
                }
            }
        }
        synchronized (this) {
            bool2 = this.f10515P;
            if (bool2.booleanValue()) {
                synchronized (this) {
                    if (mo5576F()) {
                        evaluateJavascript(str, null);
                    } else {
                        int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("#004 The webview is destroyed. Ignoring action.");
                    }
                    return;
                }
            }
            strConcat = "javascript:".concat(str);
            synchronized (this) {
                if (mo5576F()) {
                    loadUrl(strConcat);
                } else {
                    int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("#004 The webview is destroyed. Ignoring action.");
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: M */
    public final synchronized String mo5583M() {
        return this.f10510K;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m5660M0(Boolean bool) {
        synchronized (this) {
            this.f10515P = bool;
        }
        zzcfk zzcfkVar = com.google.android.gms.ads.internal.zzt.f3698C.f3708h;
        synchronized (zzcfkVar.f9889a) {
            zzcfkVar.f9898j = bool;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: N */
    public final zzflk mo5584N() {
        return this.f10545u;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: O */
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm mo5585O() {
        return this.f10506G;
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m5661O0(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: P */
    public final synchronized zzelv mo5586P() {
        return this.f10507H;
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m5662P0(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmi
    /* JADX INFO: renamed from: Q */
    public final zzfkq mo5587Q() {
        return this.f10502C;
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m5663Q0() {
        super.loadUrl("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: R */
    public final void mo5588R() {
        com.google.android.gms.ads.internal.util.zze.m3150k("Cannot add text view to inner AdWebView");
    }

    /* JADX INFO: renamed from: R0 */
    public final synchronized void m5664R0() {
        try {
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f10493s.m5663Q0();
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewImpl.loadUrlUnsafe", th);
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: S */
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm mo5589S() {
        return this.f10531i0;
    }

    /* JADX INFO: renamed from: S0 */
    public final synchronized void m5665S0() {
        try {
            zzfkn zzfknVar = this.f10501B;
            if (zzfknVar != null && zzfknVar.f15941m0) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Disabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (!this.f10514O) {
                            setLayerType(1, null);
                        }
                        this.f10514O = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            if (this.f10513N || this.f10509J.m5677b()) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Enabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (this.f10514O) {
                            setLayerType(0, null);
                        }
                        this.f10514O = false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Enabling hardware acceleration on an AdView.");
            synchronized (this) {
                try {
                    if (this.f10514O) {
                        setLayerType(0, null);
                    }
                    this.f10514O = false;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return;
        } catch (Throwable th4) {
            throw th4;
        }
        throw th4;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: T */
    public final synchronized boolean mo5590T() {
        return this.f10511L;
    }

    /* JADX INFO: renamed from: T0 */
    public final synchronized void m5666T0() {
        if (this.f10532j0) {
            return;
        }
        this.f10532j0 = true;
        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.f9899k.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: U */
    public final zzchj mo5467U() {
        return null;
    }

    /* JADX INFO: renamed from: U0 */
    public final synchronized void m5667U0() {
        try {
            HashMap map = this.f10539q0;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzcjh) it.next()).release();
                }
            }
            this.f10539q0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: V */
    public final void mo5591V() {
        setBackgroundColor(0);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m5668V0(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z ? "0" : "1");
        mo5129b("onAdVisibilityChanged", map);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: W */
    public final synchronized boolean mo5592W() {
        return this.f10524b0 > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: X */
    public final void mo5468X(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: Y */
    public final synchronized void mo5469Y() {
        final zzduh zzduhVar = this.f10522W;
        if (zzduhVar != null) {
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdug
                @Override // java.lang.Runnable
                public final void run() {
                    zzduh zzduhVar2 = zzduhVar;
                    try {
                        Preconditions.m3540d("#008 Must be called on the main UI thread.");
                        zzduhVar2.m6063l4();
                        zzdpw zzdpwVar = zzduhVar2.f12985u;
                        if (zzdpwVar != null) {
                            zzdpwVar.m5989p();
                        }
                        zzduhVar2.f12985u = null;
                        zzduhVar2.f12983s = null;
                        zzduhVar2.f12984t = null;
                        zzduhVar2.f12986v = true;
                    } catch (RemoteException e) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: Z */
    public final synchronized zzbly mo5593Z() {
        return this.f10521V;
    }

    @Override // com.google.android.gms.internal.ads.zzbst
    /* JADX INFO: renamed from: a */
    public final void mo5128a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        String string2 = sb.toString();
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Dispatching AFMA event: ".concat(string2));
        m5659L0(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: a0 */
    public final synchronized void mo5594a0(zzduh zzduhVar) {
        this.f10522W = zzduhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbst
    /* JADX INFO: renamed from: b */
    public final void mo5129b(String str, Map map) {
        try {
            mo5128a(com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a.m3048m(map), str);
        } catch (JSONException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: b0 */
    public final synchronized void mo5595b0(zzelt zzeltVar) {
        this.f10508I = zzeltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    /* JADX INFO: renamed from: c */
    public final void mo5650c(boolean z, int i2, String str, String str2, boolean z2) {
        zzclm zzclmVar = this.f10505F;
        zzclx zzclxVar = zzclmVar.f10444s;
        boolean zMo5614s0 = zzclxVar.mo5614s0();
        boolean zM5625u = zzclm.m5625u(zMo5614s0, zzclxVar);
        boolean z3 = true;
        if (!zM5625u && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zM5625u ? null : zzclmVar.f10448w;
        zzcll zzcllVar = zMo5614s0 ? null : new zzcll(zzclxVar, zzclmVar.f10449x);
        zzbon zzbonVar = zzclmVar.f10418A;
        zzekz zzekzVar = null;
        zzbop zzbopVar = zzclmVar.f10419B;
        boolean z4 = z3;
        zzcll zzcllVar2 = zzcllVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = zzclmVar.f10430M;
        VersionInfoParcel versionInfoParcelMo5472h = ((zzcme) zzclxVar.f10483s).mo5472h();
        zzdlg zzdlgVar = z4 ? null : zzclmVar.f10420C;
        if (zzclm.m5624t(zzclxVar)) {
            zzekzVar = zzclmVar.f10442Y;
        }
        zzclmVar.m5632a(new AdOverlayInfoParcel(zzaVar, zzcllVar2, zzbonVar, zzbopVar, zzadVar, zzclxVar, z, i2, str, str2, versionInfoParcelMo5472h, zzdlgVar, zzekzVar));
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: c0 */
    public final synchronized void mo5596c0(int i2) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.f10506G;
        if (zzmVar != null) {
            zzmVar.m3012t4(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    /* JADX INFO: renamed from: d */
    public final void mo5130d(String str, String str2) {
        m5659L0(AbstractC1456a.m2451r(new StringBuilder(AbstractC1456a.m2438e(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: d0 */
    public final synchronized void mo5597d0(zzbgk zzbgkVar) {
        this.f10523a0 = zzbgkVar;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclb
    public final synchronized void destroy() {
        View decorView;
        try {
            zzbjk zzbjkVar = this.f10529g0;
            if (zzbjkVar != null) {
                zzbjm zzbjmVar = zzbjkVar.f8899b;
                zzbjc zzbjcVarM5381a = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5381a();
                if (zzbjcVarM5381a != null) {
                    zzbjcVarM5381a.f8883a.offer(zzbjmVar);
                }
            }
            com.google.android.gms.ads.internal.util.zzci zzciVar = this.f10533k0;
            zzciVar.f3572e = false;
            Activity activity = zzciVar.f3569b;
            if (activity != null && zzciVar.f3570c) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = zzciVar.f3573f;
                Window window = activity.getWindow();
                ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                zzciVar.f3570c = false;
            }
            com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.f10506G;
            if (zzmVar != null) {
                zzmVar.zzb();
                this.f10506G.mo2989F();
                this.f10506G = null;
            }
            this.f10507H = null;
            this.f10508I = null;
            this.f10505F.m5635d();
            this.f10523a0 = null;
            this.f10548x = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f10512M) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.f3698C.f3699A.m5504a(this);
            m5667U0();
            this.f10512M = true;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8568hc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.m3150k("Destroying the WebView immediately...");
                m5657J0();
                return;
            }
            Activity activity2 = this.f10541s.f10585a;
            if (activity2 != null && activity2.isDestroyed()) {
                com.google.android.gms.ads.internal.util.zze.m3150k("Destroying the WebView immediately...");
                m5657J0();
            } else {
                com.google.android.gms.ads.internal.util.zze.m3150k("Initiating WebView self destruct sequence in 3...");
                com.google.android.gms.ads.internal.util.zze.m3150k("Loading blank page in WebView, 2...");
                m5664R0();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: e */
    public final synchronized String mo5470e() {
        return this.f10517R;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: e0 */
    public final void mo5598e0() {
        if (this.f10526d0 == null) {
            zzbjk zzbjkVar = this.f10529g0;
            zzbje.m5038a(zzbjkVar.f8899b, this.f10527e0, "aes2");
            zzbjj zzbjjVarM5041d = zzbjm.m5041d();
            this.f10526d0 = zzbjjVarM5041d;
            zzbjkVar.f8898a.put("native:view_show", zzbjjVarM5041d);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f10547w.f3396s);
        mo5129b("onshow", map);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (mo5576F()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8585ic)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        ((zzhbb) zzcfy.f9951f).submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f10496s.m5661O0(str, valueCallback);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: f */
    public final zzbjk mo5599f() {
        return this.f10529g0;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: f0 */
    public final synchronized zzbgk mo5600f0() {
        return this.f10523a0;
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.f10512M) {
                        this.f10505F.m5635d();
                        com.google.android.gms.ads.internal.zzt.f3698C.f3699A.m5504a(this);
                        m5667U0();
                        m5666T0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: g */
    public final synchronized String mo5471g() {
        zzfkq zzfkqVar = this.f10502C;
        if (zzfkqVar == null) {
            return null;
        }
        return zzfkqVar.f15973b;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: g0 */
    public final synchronized void mo5601g0(zzelv zzelvVar) {
        this.f10507H = zzelvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmv, com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: h */
    public final VersionInfoParcel mo5472h() {
        return this.f10547w;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: h0 */
    public final synchronized void mo5602h0(zzcnl zzcnlVar) {
        this.f10509J = zzcnlVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: i */
    public final synchronized int mo5473i() {
        return this.f10530h0;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: i0 */
    public final ListenableFuture mo5603i0() {
        zzbke zzbkeVar = this.f10546v;
        return zzbkeVar == null ? zzhcj.f18518t : (zzhbx) zzhcf.m7373g(zzhbx.m7360q(zzhcj.f18518t), ((Long) zzbkw.f9052c.m5057c()).longValue(), TimeUnit.MILLISECONDS, zzbkeVar.f8969c);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    /* JADX INFO: renamed from: j */
    public final void mo5131j(JSONObject jSONObject, String str) {
        mo5130d(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: j0 */
    public final synchronized void mo5604j0(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.f10506G;
        if (zzmVar != null) {
            zzmVar.m3010r4(this.f10505F.m5646z(), z);
        } else {
            this.f10511L = z;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public final void mo2730k() {
        zzclm zzclmVar = this.f10505F;
        if (zzclmVar != null) {
            zzclmVar.mo2730k();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: k0 */
    public final synchronized void mo5605k0(int i2, boolean z) {
        if (z) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.f10506G;
        if (zzmVar != null) {
            zzmVar.m3011s4(i2, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: l */
    public final int mo5474l() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: l0 */
    public final void mo5475l0(boolean z, long j2) {
        HashMap map = new HashMap(2);
        map.put(FirebaseAnalytics.Param.SUCCESS, true != z ? "0" : "1");
        map.put(TypedValues.TransitionType.S_DURATION, Long.toString(j2));
        mo5129b("onCacheAccessComplete", map);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclb
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo5576F()) {
            super.loadData(str, str2, str3);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclb
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (!mo5576F()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                } else {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("#004 The webview is destroyed. Ignoring action.");
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclb
    public final synchronized void loadUrl(final String str) {
        if (mo5576F()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcma
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f10491s.m5662P0(str);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewImpl.loadUrl", th);
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    /* JADX INFO: renamed from: m */
    public final void mo5651m(String str, String str2) {
        zzclm zzclmVar = this.f10505F;
        zzekz zzekzVar = zzclmVar.f10442Y;
        zzclx zzclxVar = zzclmVar.f10444s;
        zzclmVar.m5632a(new AdOverlayInfoParcel(zzclxVar, ((zzcme) zzclxVar.f10483s).mo5472h(), str, str2, zzekzVar));
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: m0 */
    public final synchronized void mo5606m0(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.f10506G = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: n0 */
    public final synchronized void mo5476n0(zzcmh zzcmhVar) {
        if (this.f10518S == null) {
            this.f10518S = zzcmhVar;
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: o */
    public final synchronized zzelt mo5607o() {
        return this.f10508I;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: o0 */
    public final synchronized void mo5608o0(String str, String str2) {
        Throwable th;
        String str3;
        try {
            try {
                if (mo5576F()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str4 = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8844y0);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str4);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (JSONException e) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3074g("Unable to build MRAID_ENV", e);
                    str3 = null;
                }
                super.loadDataWithBaseURL(str, zzcms.m5672a(str2, str3), "text/html", "UTF-8", null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z = true;
            if (!mo5576F()) {
                com.google.android.gms.ads.internal.util.zzci zzciVar = this.f10533k0;
                zzciVar.f3571d = true;
                if (zzciVar.f3572e) {
                    zzciVar.m3148a();
                }
            }
            if (this.f10544t0) {
                onResume();
                this.f10544t0 = false;
            }
            boolean z2 = this.f10519T;
            zzclm zzclmVar = this.f10505F;
            if (zzclmVar == null || !zzclmVar.m5628G()) {
                z = z2;
            } else {
                if (!this.f10520U) {
                    synchronized (this.f10505F.f10447v) {
                    }
                    synchronized (this.f10505F.f10447v) {
                    }
                    this.f10520U = true;
                }
                m5658K0();
            }
            m5668V0(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzclm zzclmVar;
        View decorView;
        synchronized (this) {
            try {
                if (!mo5576F()) {
                    com.google.android.gms.ads.internal.util.zzci zzciVar = this.f10533k0;
                    zzciVar.f3571d = false;
                    Activity activity = zzciVar.f3569b;
                    if (activity != null && zzciVar.f3570c) {
                        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = zzciVar.f3573f;
                        Window window = activity.getWindow();
                        ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                        }
                        zzciVar.f3570c = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.f10520U && (zzclmVar = this.f10505F) != null && zzclmVar.m5628G() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    synchronized (this.f10505F.f10447v) {
                    }
                    synchronized (this.f10505F.f10447v) {
                    }
                    this.f10520U = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m5668V0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8822wc)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            com.google.android.gms.ads.internal.util.zzs.m3220s(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            String strM2451r = AbstractC1456a.m2451r(new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length()), "Couldn't find an Activity to view url/mimetype: ", str, " / ", str4);
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a(strM2451r);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (mo5576F()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zM5658K0 = m5658K0();
        com.google.android.gms.ads.internal.overlay.zzm zzmVarMo5585O = mo5585O();
        if (zzmVarMo5585O != null && zM5658K0 && zzmVarMo5585O.f3349E) {
            zzmVarMo5585O.f3349E = false;
            zzmVarMo5585O.f3363v.mo5598e0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0077 A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:10:0x0010, B:12:0x0016, B:14:0x001a, B:19:0x0025, B:24:0x002d, B:26:0x003f, B:29:0x0044, B:31:0x004b, B:35:0x0055, B:38:0x005a, B:41:0x006b, B:49:0x0083, B:43:0x0072, B:46:0x0077, B:54:0x0093, B:56:0x00a5, B:59:0x00aa, B:61:0x00c6, B:63:0x00ce, B:62:0x00ca, B:66:0x00d3, B:68:0x00d9, B:71:0x00e4, B:80:0x0108, B:82:0x010f, B:86:0x0116, B:88:0x0128, B:90:0x0136, B:94:0x0143, B:97:0x0148, B:99:0x01bc, B:100:0x01bf, B:102:0x01c6, B:107:0x01d3, B:109:0x01d9, B:110:0x01dc, B:112:0x01e0, B:113:0x01e9, B:116:0x01f4), top: B:121:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final synchronized void onMeasure(int i2, int i3) {
        zzcnl zzcnlVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (mo5576F()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.f10513N && (i4 = (zzcnlVar = this.f10509J).f10601a) != 0) {
            if (i4 == 5) {
                super.onMeasure(i2, i3);
                return;
            }
            if (i4 == 4) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8160J4)).booleanValue()) {
                    super.onMeasure(i2, i3);
                    return;
                }
                zzcmh zzcmhVarZzh = zzh();
                float fMo2922e = zzcmhVarZzh != null ? zzcmhVarZzh.mo2922e() : 0.0f;
                if (fMo2922e == 0.0f) {
                    super.onMeasure(i2, i3);
                    return;
                }
                int size = View.MeasureSpec.getSize(i2);
                int size2 = View.MeasureSpec.getSize(i3);
                float f2 = size2 * fMo2922e;
                int i9 = (int) (size / fMo2922e);
                if (size2 != 0) {
                    i5 = (int) f2;
                    if (size == 0) {
                        i8 = size;
                    } else if (i5 != 0) {
                        i9 = (int) (i5 / fMo2922e);
                        i6 = size2;
                        i7 = i5;
                        i8 = i7;
                    }
                    i6 = size2;
                    i7 = i5;
                } else if (i9 != 0) {
                    i7 = (int) (i9 * fMo2922e);
                    i8 = size;
                    i6 = i9;
                } else {
                    size2 = 0;
                    i5 = (int) f2;
                    if (size == 0) {
                        i8 = size;
                    } else if (i5 != 0) {
                        i9 = (int) (i5 / fMo2922e);
                        i6 = size2;
                        i7 = i5;
                        i8 = i7;
                    }
                    i6 = size2;
                    i7 = i5;
                }
                setMeasuredDimension(Math.min(i7, i8), Math.min(i9, i6));
                return;
            }
            if (i4 == 2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8296R4)).booleanValue()) {
                    super.onMeasure(i2, i3);
                    return;
                }
                mo5616v0("/contentHeight", new zzcly(this));
                m5659L0("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f3 = this.f10550z.density;
                int size3 = View.MeasureSpec.getSize(i2);
                int i10 = this.f10525c0;
                setMeasuredDimension(size3, i10 != -1 ? (int) (i10 * f3) : View.MeasureSpec.getSize(i3));
                return;
            }
            if (zzcnlVar.m5677b()) {
                DisplayMetrics displayMetrics = this.f10550z;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i2);
            int size4 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size5 = View.MeasureSpec.getSize(i3);
            int i11 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i12 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            zzcnl zzcnlVar2 = this.f10509J;
            boolean z = zzcnlVar2.f10603c > i11 || zzcnlVar2.f10602b > i12;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8782u6)).booleanValue()) {
                zzcnl zzcnlVar3 = this.f10509J;
                float f4 = zzcnlVar3.f10603c;
                float f5 = this.f10500A;
                z &= f4 / f5 <= ((float) i11) / f5 && ((float) zzcnlVar3.f10602b) / f5 <= ((float) i12) / f5;
            }
            if (!z) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.f10504E) {
                    this.f10542s0.m4895c(10002);
                    this.f10504E = true;
                }
                zzcnl zzcnlVar4 = this.f10509J;
                setMeasuredDimension(zzcnlVar4.f10603c, zzcnlVar4.f10602b);
                return;
            }
            zzcnl zzcnlVar5 = this.f10509J;
            float f6 = zzcnlVar5.f10603c;
            float f7 = this.f10500A;
            int i13 = (int) (f6 / f7);
            int i14 = (int) (zzcnlVar5.f10602b / f7);
            int i15 = (int) (size4 / f7);
            int i16 = (int) (size5 / f7);
            StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 36 + String.valueOf(i14).length() + 18 + String.valueOf(i15).length() + 1 + String.valueOf(i16).length() + 4);
            sb.append("Not enough space to show ad. Needs ");
            sb.append(i13);
            sb.append("x");
            sb.append(i14);
            sb.append(" dp, but only has ");
            sb.append(i15);
            sb.append("x");
            sb.append(i16);
            sb.append(" dp.");
            String string = sb.toString();
            int i17 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(string);
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.f10503D) {
                return;
            }
            this.f10542s0.m4895c(10001);
            this.f10503D = true;
            return;
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclb
    public final void onPause() {
        if (mo5576F()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8451ae)).booleanValue() && WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Muting webview");
                WebViewCompat.setAudioMuted(this, true);
            }
        } catch (Exception e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Could not pause webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8502de)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewImpl.onPause", e);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclb
    public final void onResume() {
        if (mo5576F()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8451ae)).booleanValue() && WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Unmuting webview");
                WebViewCompat.setAudioMuted(this, false);
            }
        } catch (Exception e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Could not resume webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8502de)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdWebViewImpl.onResume", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:26:0x003d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0042 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:27:0x003e, B:29:0x0042, B:32:0x0048), top: B:58:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:36:0x004c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0050  */
    /* JADX WARN: Code duplicated, block: B:41:0x0059  */
    /* JADX WARN: Code duplicated, block: B:46:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:58:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        zzbaw zzbawVar;
        zzbke zzbkeVar;
        zzbly zzblyVar;
        boolean z2;
        boolean z3;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8729r4)).booleanValue()) {
            zzclm zzclmVar = this.f10505F;
            synchronized (zzclmVar.f10447v) {
                z3 = zzclmVar.f10428K;
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (this.f10505F.m5628G()) {
            zzclm zzclmVar2 = this.f10505F;
            synchronized (zzclmVar2.f10447v) {
                z2 = zzclmVar2.f10429L;
            }
            if (!z2) {
                synchronized (this) {
                    zzblyVar = this.f10521V;
                    if (zzblyVar != null) {
                        zzblyVar.mo5062a(motionEvent);
                    }
                }
            } else if (z) {
                synchronized (this) {
                    try {
                        zzblyVar = this.f10521V;
                        if (zzblyVar != null) {
                            zzblyVar.mo5062a(motionEvent);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                zzbawVar = this.f10543t;
                if (zzbawVar != null) {
                    zzbawVar.f7501b.mo3255b(motionEvent);
                }
                zzbkeVar = this.f10546v;
                if (zzbkeVar != null) {
                    if (motionEvent.getAction() != 1 && motionEvent.getEventTime() > zzbkeVar.f8967a.getEventTime()) {
                        zzbkeVar.f8967a = MotionEvent.obtain(motionEvent);
                    } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > zzbkeVar.f8968b.getEventTime()) {
                        zzbkeVar.f8968b = MotionEvent.obtain(motionEvent);
                    }
                }
            }
        } else if (z) {
            synchronized (this) {
                zzblyVar = this.f10521V;
                if (zzblyVar != null) {
                    zzblyVar.mo5062a(motionEvent);
                }
            }
        } else {
            zzbawVar = this.f10543t;
            if (zzbawVar != null) {
                zzbawVar.f7501b.mo3255b(motionEvent);
            }
            zzbkeVar = this.f10546v;
            if (zzbkeVar != null) {
                if (motionEvent.getAction() != 1) {
                    if (motionEvent.getAction() == 0) {
                        zzbkeVar.f8968b = MotionEvent.obtain(motionEvent);
                    }
                } else if (motionEvent.getAction() == 0) {
                    zzbkeVar.f8968b = MotionEvent.obtain(motionEvent);
                }
            }
        }
        if (mo5576F()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmt
    /* JADX INFO: renamed from: p */
    public final synchronized zzcnl mo5609p() {
        return this.f10509J;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: p0 */
    public final void mo5610p0(Context context) {
        zzcnd zzcndVar = this.f10541s;
        zzcndVar.setBaseContext(context);
        this.f10533k0.f3569b = zzcndVar.f10585a;
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmu
    /* JADX INFO: renamed from: q */
    public final zzbaw mo5611q() {
        return this.f10543t;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: q0 */
    public final synchronized void mo5612q0(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.f10531i0 = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: r0 */
    public final void mo5613r0(String str, zzbpx zzbpxVar) {
        zzclm zzclmVar = this.f10505F;
        if (zzclmVar != null) {
            synchronized (zzclmVar.f10447v) {
                try {
                    List list = (List) zzclmVar.f10446u.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(zzbpxVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: s */
    public final int mo5477s() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: s0 */
    public final synchronized boolean mo5614s0() {
        return this.f10513N;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclb
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzclm) {
            this.f10505F = (zzclm) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (mo5576F()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    /* JADX INFO: renamed from: t */
    public final void mo4826t(zzbew zzbewVar) {
        boolean z;
        synchronized (this) {
            z = zzbewVar.f7707j;
            this.f10519T = z;
        }
        m5668V0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: t0 */
    public final synchronized void mo5615t0(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i2 = this.f10524b0 + (true != z ? -1 : 1);
        this.f10524b0 = i2;
        if (i2 > 0 || (zzmVar = this.f10506G) == null) {
            return;
        }
        synchronized (zzmVar.f3351G) {
            try {
                zzmVar.f3354J = true;
                Runnable runnable = zzmVar.f3353I;
                if (runnable != null) {
                    com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
                    zzfVar.removeCallbacks(runnable);
                    zzfVar.post(zzmVar.f3353I);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: u */
    public final synchronized void mo5478u(String str, zzcjh zzcjhVar) {
        try {
            if (this.f10539q0 == null) {
                this.f10539q0 = new HashMap();
            }
            this.f10539q0.put(str, zzcjhVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    /* JADX INFO: renamed from: u0 */
    public final synchronized void mo3270u0() {
        com.google.android.gms.ads.internal.zzn zznVar = this.f10548x;
        if (zznVar != null) {
            zznVar.mo3270u0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: v */
    public final synchronized void mo5479v(int i2) {
        this.f10530h0 = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: v0 */
    public final void mo5616v0(String str, zzbpx zzbpxVar) {
        zzclm zzclmVar = this.f10505F;
        if (zzclmVar != null) {
            zzclmVar.m5633b(str, zzbpxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: w */
    public final ArrayList mo5617w() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: w0 */
    public final void mo5618w0(zzfkn zzfknVar, zzfkq zzfkqVar) {
        this.f10501B = zzfknVar;
        this.f10502C = zzfkqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    /* JADX INFO: renamed from: x */
    public final void mo5652x(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        this.f10505F.m5631X(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: x0 */
    public final void mo5619x0(int i2) {
        zzbjj zzbjjVar = this.f10527e0;
        zzbjk zzbjkVar = this.f10529g0;
        if (i2 == 0) {
            zzbje.m5038a(zzbjkVar.f8899b, zzbjjVar, "aebb2");
        }
        zzbje.m5038a(zzbjkVar.f8899b, zzbjjVar, "aeh2");
        zzbjkVar.getClass();
        zzbjkVar.f8899b.m5044c("close_type", String.valueOf(i2));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i2));
        map.put("version", this.f10547w.f3396s);
        mo5129b("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: y */
    public final WebView mo5620y() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: y0 */
    public final boolean mo5621y0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcmr
    /* JADX INFO: renamed from: z */
    public final void mo5653z(boolean z, int i2, boolean z2) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzdlg zzdlgVar;
        zzclm zzclmVar = this.f10505F;
        zzclx zzclxVar = zzclmVar.f10444s;
        boolean zM5625u = zzclm.m5625u(zzclxVar.mo5614s0(), zzclxVar);
        boolean z3 = true;
        if (!zM5625u && z2) {
            z3 = false;
        }
        if (zM5625u) {
            zzaVar = null;
            zzdlgVar = null;
        } else {
            zzaVar = zzclmVar.f10448w;
            zzdlgVar = null;
        }
        zzdlg zzdlgVar2 = zzdlgVar;
        zzclmVar.m5632a(new AdOverlayInfoParcel(zzaVar, zzclmVar.f10449x, zzclmVar.f10430M, zzclxVar, z, i2, ((zzcme) zzclxVar.f10483s).mo5472h(), z3 ? zzdlgVar2 : zzclmVar.f10420C, zzclm.m5624t(zzclxVar) ? zzclmVar.f10442Y : zzdlgVar2));
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: z0 */
    public final boolean mo5622z0(final int i2, final boolean z) {
        destroy();
        zzbhv zzbhvVar = new zzbhv() { // from class: com.google.android.gms.internal.ads.zzcmc
            @Override // com.google.android.gms.internal.ads.zzbhv
            /* JADX INFO: renamed from: a */
            public final void mo4892a(zzbic.zzt.zza zzaVar) {
                int i3 = zzcme.f10499u0;
                zzbic.zzbl.zza zzaVarM4974E = zzbic.zzbl.m4974E();
                boolean zM4976D = ((zzbic.zzbl) zzaVarM4974E.f19780t).m4976D();
                boolean z2 = z;
                if (zM4976D != z2) {
                    zzaVarM4974E.m8326l();
                    ((zzbic.zzbl) zzaVarM4974E.f19780t).m4977F(z2);
                }
                zzaVarM4974E.m8326l();
                ((zzbic.zzbl) zzaVarM4974E.f19780t).m4978G(i2);
                zzbic.zzbl zzblVar = (zzbic.zzbl) zzaVarM4974E.m8328o();
                zzaVar.m8326l();
                ((zzbic.zzt) zzaVar.f19780t).m5002N(zzblVar);
            }
        };
        zzbhw zzbhwVar = this.f10542s0;
        zzbhwVar.m4894b(zzbhvVar);
        zzbhwVar.m4895c(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zza(String str) {
        m5659L0(str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final synchronized zzcmh zzh() {
        return this.f10518S;
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final zzbjj zzi() {
        return this.f10527e0;
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final Activity zzj() {
        return this.f10541s.f10585a;
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.f10549y;
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarMo5585O = mo5585O();
        if (zzmVarMo5585O != null) {
            zzmVarMo5585O.m3006m4();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final synchronized zzcjh zzr(String str) {
        HashMap map = this.f10539q0;
        if (map == null) {
            return null;
        }
        return (zzcjh) map.get(str);
    }
}
