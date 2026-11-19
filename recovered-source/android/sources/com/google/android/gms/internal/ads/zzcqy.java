package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcqy extends com.google.android.gms.ads.internal.client.zzcx {

    /* JADX INFO: renamed from: A */
    public final zzecz f11264A;

    /* JADX INFO: renamed from: B */
    public final zzblr f11265B;

    /* JADX INFO: renamed from: C */
    public final zzfqt f11266C;

    /* JADX INFO: renamed from: D */
    public final zzfmc f11267D;

    /* JADX INFO: renamed from: E */
    public final zzdal f11268E;

    /* JADX INFO: renamed from: F */
    public final zzdzt f11269F;

    /* JADX INFO: renamed from: G */
    public final zzeeg f11270G;

    /* JADX INFO: renamed from: H */
    public boolean f11271H = false;

    /* JADX INFO: renamed from: I */
    public final Long f11272I;

    /* JADX INFO: renamed from: s */
    public final Context f11273s;

    /* JADX INFO: renamed from: t */
    public final VersionInfoParcel f11274t;

    /* JADX INFO: renamed from: u */
    public final zzdxk f11275u;

    /* JADX INFO: renamed from: v */
    public final zzemc f11276v;

    /* JADX INFO: renamed from: w */
    public final zzese f11277w;

    /* JADX INFO: renamed from: x */
    public final zzece f11278x;

    /* JADX INFO: renamed from: y */
    public final zzceg f11279y;

    /* JADX INFO: renamed from: z */
    public final zzdxp f11280z;

    public zzcqy(Context context, VersionInfoParcel versionInfoParcel, zzdxk zzdxkVar, zzemc zzemcVar, zzese zzeseVar, zzece zzeceVar, zzceg zzcegVar, zzdxp zzdxpVar, zzecz zzeczVar, zzblr zzblrVar, zzfqt zzfqtVar, zzfmc zzfmcVar, zzdal zzdalVar, zzdzt zzdztVar, zzeeg zzeegVar) {
        this.f11273s = context;
        this.f11274t = versionInfoParcel;
        this.f11275u = zzdxkVar;
        this.f11276v = zzemcVar;
        this.f11277w = zzeseVar;
        this.f11278x = zzeceVar;
        this.f11279y = zzcegVar;
        this.f11280z = zzdxpVar;
        this.f11264A = zzeczVar;
        this.f11265B = zzblrVar;
        this.f11266C = zzfqtVar;
        this.f11267D = zzfmcVar;
        this.f11268E = zzdalVar;
        this.f11269F = zzdztVar;
        this.f11270G = zzeegVar;
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        this.f11272I = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: C1 */
    public final void mo2898C1(com.google.android.gms.ads.internal.client.zzdk zzdkVar) {
        this.f11264A.m6166e(zzdkVar, zzecy.f13626t);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: H0 */
    public final void mo2890H0(IObjectWrapper iObjectWrapper, String str) {
        String strM3197P;
        Runnable runnable;
        Context context = this.f11273s;
        zzbix.m5032a(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8425Z4)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                strM3197P = com.google.android.gms.ads.internal.util.zzs.m3197P(context);
            } catch (RemoteException | RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("NonagonMobileAdsSettingManager_AppId", e);
                strM3197P = "";
            }
        } else {
            strM3197P = "";
        }
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(strM3197P) ? str : strM3197P;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzbio zzbioVar = zzbix.f8313S4;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        boolean zBooleanValue = ((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue();
        zzbio zzbioVar2 = zzbix.f8862z1;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) zzbivVar2.m5030a(zzbioVar2)).booleanValue();
        if (((Boolean) zzbivVar2.m5030a(zzbioVar2)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.m3697u0(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzhcp zzhcpVar = zzcfy.f9951f;
                    final zzcqy zzcqyVar = this.f11259s;
                    final Runnable runnable3 = runnable2;
                    ((zzcfx) zzhcpVar).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqw
                        @Override // java.lang.Runnable
                        public final void run() {
                            Preconditions.m3540d("Adapters must be initialized on the main thread.");
                            HashMap map = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().zzi().f9875c;
                            if (map.isEmpty()) {
                                return;
                            }
                            Runnable runnable4 = runnable3;
                            if (runnable4 != null) {
                                try {
                                    runnable4.run();
                                } catch (Throwable th) {
                                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not initialize rewarded ads.", th);
                                    return;
                                }
                            }
                            zzcqy zzcqyVar2 = zzcqyVar;
                            if (((zzbvj) zzcqyVar2.f11275u.f13249a.f16104c.get()) != null) {
                                HashMap map2 = new HashMap();
                                Iterator it = map.values().iterator();
                                while (it.hasNext()) {
                                    for (zzbvc zzbvcVar : ((zzbvd) it.next()).f9435a) {
                                        String str3 = zzbvcVar.f9433b;
                                        for (String str4 : zzbvcVar.f9432a) {
                                            if (!map2.containsKey(str4)) {
                                                map2.put(str4, new ArrayList());
                                            }
                                            if (str3 != null) {
                                                ((List) map2.get(str4)).add(str3);
                                            }
                                        }
                                    }
                                }
                                JSONObject jSONObject = new JSONObject();
                                for (Map.Entry entry : map2.entrySet()) {
                                    String str5 = (String) entry.getKey();
                                    try {
                                        zzemd zzemdVarMo6286a = zzcqyVar2.f11276v.mo6286a(jSONObject, str5);
                                        if (zzemdVarMo6286a != null) {
                                            zzfme zzfmeVar = (zzfme) zzemdVarMo6286a.f14192b;
                                            boolean zM6528a = zzfmeVar.m6528a();
                                            zzbvm zzbvmVar = zzfmeVar.f16105a;
                                            if (!zM6528a) {
                                                try {
                                                    if (zzbvmVar.mo5180s()) {
                                                        try {
                                                            zzbvmVar.mo5185w2(new ObjectWrapper(zzcqyVar2.f11273s), (zzenq) zzemdVarMo6286a.f14193c, (List) entry.getValue());
                                                            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 45);
                                                            sb.append("Initialized rewarded video mediation adapter ");
                                                            sb.append(str5);
                                                            String string = sb.toString();
                                                            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                            com.google.android.gms.ads.internal.util.client.zzo.m3068a(string);
                                                        } catch (Throwable th2) {
                                                            throw new zzfln(th2);
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    throw new zzfln(th3);
                                                }
                                            }
                                        }
                                    } catch (zzfln e2) {
                                        String strM2450q = AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str5).length() + 56), "Failed to initialize rewarded video mediation adapter \"", str5, "\"");
                                        int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                        com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q, e2);
                                    }
                                }
                            }
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3712l.m3250a(this.f11273s, this.f11274t, true, null, str2, null, runnable3, this.f11266C, this.f11269F, this.f11272I, this.f11264A.m6167f());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: M2 */
    public final void mo2891M2(zzbvj zzbvjVar) {
        this.f11267D.m6525b(zzbvjVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: V */
    public final void mo2899V(boolean z) throws RemoteException {
        try {
            zzgcs.m6881a(this.f11273s).m6882b(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: W0 */
    public final void mo2892W0(zzbsd zzbsdVar) {
        zzece zzeceVar = this.f11278x;
        zzeceVar.getClass();
        zzeceVar.f13544e.addListener(new zzecd(zzeceVar, zzbsdVar), zzeceVar.f13549j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: X2 */
    public final void mo2893X2(com.google.android.gms.ads.internal.client.zzfr zzfrVar) {
        zzceg zzcegVar = this.f11279y;
        Context context = this.f11273s;
        zzcegVar.getClass();
        zzcdz zzcdzVarMo5357a = zzceh.m5372b(context).mo5357a();
        zzcdzVarMo5357a.f9808b.m5355a(-1, zzcdzVarMo5357a.f9807a.currentTimeMillis());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8405Y0)).booleanValue() && zzcegVar.m5361a(context) && zzceg.m5360g(context)) {
            synchronized (zzcegVar.f9837j) {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: a */
    public final synchronized void mo2894a() {
        if (this.f11271H) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Mobile ads is initialized already.");
            return;
        }
        zzbio zzbioVar = zzbix.f8508e3;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.m2812a();
        }
        Context context = this.f11273s;
        zzbix.m5032a(context);
        VersionInfoParcel versionInfoParcel = this.f11274t;
        zzdzt zzdztVar = this.f11269F;
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zztVar.f3708h.m5382b(context, versionInfoParcel, zzdztVar);
        this.f11268E.m5887b();
        zztVar.f3710j.m4881a(context);
        this.f11271H = true;
        this.f11278x.m6150a();
        final zzese zzeseVar = this.f11277w;
        zzeseVar.getClass();
        com.google.android.gms.ads.internal.util.zzj zzjVarM5387g = zztVar.f3708h.m5387g();
        zzjVarM5387g.f3587c.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final zzese zzeseVar2 = zzeseVar;
                zzeseVar2.getClass();
                zzeseVar2.f14769f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzeseVar2.m6326c();
                    }
                });
            }
        });
        zzeseVar.f14769f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeseVar.m6326c();
            }
        });
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8345U4)).booleanValue()) {
            final zzdxp zzdxpVar = this.f11280z;
            if (!zzdxpVar.f13261f.getAndSet(true)) {
                com.google.android.gms.ads.internal.util.zzj zzjVarM5387g2 = zztVar.f3708h.m5387g();
                zzjVarM5387g2.f3587c.add(new zzdxm(zzdxpVar));
            }
            zzdxpVar.f13258c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdxpVar.m6084a();
                }
            });
        }
        this.f11264A.m6162a();
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8871za)).booleanValue()) {
            ((zzcfx) zzcfy.f9946a).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqx
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    String str;
                    zzcqy zzcqyVar = this.f11263s;
                    com.google.android.gms.ads.internal.zzt zztVar2 = com.google.android.gms.ads.internal.zzt.f3698C;
                    com.google.android.gms.ads.internal.util.zzj zzjVarM5387g3 = zztVar2.f3708h.m5387g();
                    zzjVarM5387g3.m3180e();
                    synchronized (zzjVarM5387g3.f3585a) {
                        z = zzjVarM5387g3.f3609y;
                    }
                    if (z) {
                        com.google.android.gms.ads.internal.util.zzj zzjVarM5387g4 = zztVar2.f3708h.m5387g();
                        zzjVarM5387g4.m3180e();
                        synchronized (zzjVarM5387g4.f3585a) {
                            str = zzjVarM5387g4.f3610z;
                        }
                        if (zztVar2.f3715o.m3097b(zzcqyVar.f11273s, str, zzcqyVar.f11274t.f3396s)) {
                            return;
                        }
                        zztVar2.f3708h.m5387g().m3177a(false);
                        zztVar2.f3708h.m5387g().m3178b("");
                    }
                }
            });
        }
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8720qc)).booleanValue()) {
            ((zzcfx) zzcfy.f9946a).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqu
                @Override // java.lang.Runnable
                public final void run() {
                    zzcaj zzcajVar = new zzcaj();
                    zzblr zzblrVar = this.f11258s.f11265B;
                    zzblrVar.getClass();
                    try {
                        zzbls zzblsVar = (zzbls) com.google.android.gms.ads.internal.util.client.zzs.m3079a(zzblrVar.f9139a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzblq
                            @Override // com.google.android.gms.ads.internal.util.client.zzq
                            /* JADX INFO: renamed from: a */
                            public final Object mo2799a(IBinder iBinder) {
                                IBinder iBinder2 = iBinder;
                                if (iBinder2 == null) {
                                    return null;
                                }
                                IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                return iInterfaceQueryLocalInterface instanceof zzbls ? (zzbls) iInterfaceQueryLocalInterface : new zzbls(iBinder2, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                            }
                        });
                        Parcel parcelM4810u = zzblsVar.m4810u();
                        zzben.m4817e(parcelM4810u, zzcajVar);
                        zzblsVar.m4811u0(1, parcelM4810u);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
                    } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
                    }
                }
            });
        }
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8295R3)).booleanValue()) {
            ((zzcfx) zzcfy.f9946a).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfml.m6536a(this.f11256s.f11273s, true);
                }
            });
        }
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8866z5)).booleanValue()) {
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8008A5)).booleanValue()) {
                ((zzcfx) zzcfy.f9946a).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqt
                    @Override // java.lang.Runnable
                    public final void run() {
                        String packageName;
                        zzbjw zzbjwVar = com.google.android.gms.ads.internal.zzt.f3698C.f3714n;
                        zzcqy zzcqyVar = this.f11257s;
                        Context context2 = zzcqyVar.f11273s;
                        zzdzt zzdztVar2 = zzcqyVar.f11269F;
                        if (zzbjwVar.f8912s.getAndSet(true)) {
                            return;
                        }
                        zzbjwVar.f8913t = context2;
                        zzbjwVar.f8914u = zzdztVar2;
                        if (zzbjwVar.f8916w != null || context2 == null || (packageName = CustomTabsClient.getPackageName(context2, null)) == null || packageName.equals(context2.getPackageName())) {
                            return;
                        }
                        CustomTabsClient.bindCustomTabsService(context2, packageName, zzbjwVar);
                    }
                });
            }
        }
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8246O5)).booleanValue()) {
            final zzeeg zzeegVar = this.f11270G;
            zzhcp zzhcpVar = zzcfy.f9951f;
            Objects.requireNonNull(zzeegVar);
            ((zzcfx) zzhcpVar).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqr
                @Override // java.lang.Runnable
                public final void run() {
                    zzeeg zzeegVar2 = zzeegVar;
                    Context context2 = zzeegVar2.f13734a;
                    try {
                        if (zzeegVar2.f13737d.mo3154K()) {
                            return;
                        }
                        zzeed zzeedVar = zzeegVar2.f13735b;
                        zzeedVar.f13731b = new zzasg(zzeedVar.f13730a);
                        zzeedVar.m6186a(new zzeef(zzeegVar2));
                    } catch (Exception e) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8280Q5)).booleanValue()) {
                            if (zzeegVar2.f13739f == null) {
                                zzeegVar2.f13739f = zzcaf.m5288e(context2);
                            }
                            zzeegVar2.f13739f.mo5291a("InstallReferrerUnsampled.initializeAndReport", e);
                        } else {
                            if (zzeegVar2.f13738e == null) {
                                zzeegVar2.f13738e = zzcaf.m5286c(context2);
                            }
                            zzeegVar2.f13738e.mo5291a("InstallReferrer.initializeAndReport", e);
                        }
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: c0 */
    public final void mo2895c0(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8200La)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.f9895g = str;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: c3 */
    public final synchronized void mo2900c3(String str) {
        Context context = this.f11273s;
        zzbix.m5032a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8313S4)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3712l.m3250a(context, this.f11274t, true, null, str, null, null, this.f11266C, null, null, this.f11264A.m6167f());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: e */
    public final String mo2901e() {
        return this.f11274t.f3396s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: f */
    public final List mo2896f() {
        return this.f11278x.m6151b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: h */
    public final void mo2902h() {
        this.f11278x.f13556q = false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: i0 */
    public final synchronized void mo2903i0(boolean z) {
        com.google.android.gms.ads.internal.util.zzaa zzaaVar = com.google.android.gms.ads.internal.zzt.f3698C.f3709i;
        synchronized (zzaaVar) {
            zzaaVar.f3451a = z;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: q1 */
    public final void mo2904q1(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.m3697u0(iObjectWrapper);
        if (context == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Context is null. Failed to open debug menu.");
        } else {
            com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
            zzatVar.f3484d = str;
            zzatVar.f3485e = this.f11274t.f3396s;
            zzatVar.m3092b();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: w1 */
    public final synchronized void mo2905w1(float f2) {
        com.google.android.gms.ads.internal.util.zzaa zzaaVar = com.google.android.gms.ads.internal.zzt.f3698C.f3709i;
        synchronized (zzaaVar) {
            zzaaVar.f3452b = f2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: z */
    public final synchronized void mo2897z() {
        zzbio zzbioVar = zzbix.f8491d3;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            zzbug zzbugVar = com.google.android.gms.ads.internal.zzt.f3698C.f3718r;
            synchronized (zzbugVar.f9393a) {
                try {
                    zzbup zzbupVar = zzbugVar.f9395c;
                    if (zzbupVar != null) {
                        zzbub zzbubVar = zzbupVar.f9402a;
                        zzbua zzbuaVar = zzbubVar.f9389h;
                        if (zzbuaVar != null) {
                            zzbuaVar.m5139f();
                            zzbubVar.f9389h = null;
                        }
                        zzbugVar.f9395c = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8508e3)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzay.f3085g.f3088c = true;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized float zzk() {
        return com.google.android.gms.ads.internal.zzt.f3698C.f3709i.m3087a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized boolean zzl() {
        boolean z;
        com.google.android.gms.ads.internal.util.zzaa zzaaVar = com.google.android.gms.ads.internal.zzt.f3698C.f3709i;
        synchronized (zzaaVar) {
            z = zzaaVar.f3451a;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(String str) {
        this.f11277w.m6325b(str);
    }
}
