package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyy implements zzdib, com.google.android.gms.ads.internal.client.zza, zzddt, zzddd, zzdfu {

    /* JADX INFO: renamed from: A */
    public Boolean f13303A;

    /* JADX INFO: renamed from: s */
    public final Context f13307s;

    /* JADX INFO: renamed from: t */
    public final zzflz f13308t;

    /* JADX INFO: renamed from: u */
    public final zzdzt f13309u;

    /* JADX INFO: renamed from: v */
    public final zzfky f13310v;

    /* JADX INFO: renamed from: w */
    public final zzfkn f13311w;

    /* JADX INFO: renamed from: x */
    public final zzeko f13312x;

    /* JADX INFO: renamed from: y */
    public final String f13313y;

    /* JADX INFO: renamed from: z */
    public long f13314z = -1;

    /* JADX INFO: renamed from: C */
    public final AtomicBoolean f13305C = new AtomicBoolean(false);

    /* JADX INFO: renamed from: D */
    public final AtomicBoolean f13306D = new AtomicBoolean(false);

    /* JADX INFO: renamed from: B */
    public final boolean f13304B = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8163J7)).booleanValue();

    public zzdyy(Context context, zzflz zzflzVar, zzdzt zzdztVar, zzfky zzfkyVar, zzfkn zzfknVar, zzeko zzekoVar, String str) {
        this.f13307s = context;
        this.f13308t = zzflzVar;
        this.f13309u = zzdztVar;
        this.f13310v = zzfkyVar;
        this.f13311w = zzfknVar;
        this.f13312x = zzekoVar;
        this.f13313y = str;
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    /* JADX INFO: renamed from: a */
    public final void mo5901a() {
        if (this.f13304B) {
            zzdzs zzdzsVarM6095c = m6095c("ifts");
            zzdzsVarM6095c.m6107b("reason", "blocked");
            zzdzsVarM6095c.m6108c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6094b() {
        String strM3197P;
        if (this.f13303A == null) {
            synchronized (this) {
                if (this.f13303A == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8439a2);
                    com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                    try {
                        strM3197P = com.google.android.gms.ads.internal.util.zzs.m3197P(this.f13307s);
                    } catch (RemoteException unused) {
                        strM3197P = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strM3197P != null) {
                        try {
                            zMatches = Pattern.matches(str, strM3197P);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("CsiActionsListener.isPatternMatched", e);
                        }
                    }
                    this.f13303A = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f13303A.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final zzdzs m6095c(String str) {
        zzfky zzfkyVar = this.f13310v;
        zzfkx zzfkxVar = zzfkyVar.f16006b;
        zzfkv zzfkvVar = zzfkyVar.f16005a;
        zzdzs zzdzsVarM6111a = this.f13309u.m6111a();
        zzdzsVarM6111a.m6107b("gqi", zzfkxVar.f16002b.f15973b);
        zzfkn zzfknVar = this.f13311w;
        zzdzsVarM6111a.m6106a(zzfknVar);
        zzdzsVarM6111a.m6107b("action", str);
        zzdzsVarM6111a.m6107b(FirebaseAnalytics.Param.AD_FORMAT, this.f13313y.toUpperCase(Locale.ROOT));
        List list = zzfknVar.f15954t;
        if (!list.isEmpty()) {
            zzdzsVarM6111a.m6107b("ancn", (String) list.get(0));
        }
        if (zzfknVar.m6482b()) {
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            zzdzsVarM6111a.m6107b("device_connectivity", true != zztVar.f3708h.m5389i(this.f13307s) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zztVar.f3711k.getClass();
            zzdzsVarM6111a.m6107b("event_timestamp", String.valueOf(System.currentTimeMillis()));
            zzdzsVarM6111a.m6107b("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8282Q7)).booleanValue()) {
            boolean z = com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3349e(zzfkvVar.f15998a) != 1;
            zzdzsVarM6111a.m6107b("scar", String.valueOf(z));
            if (z) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkvVar.f15998a.f16040d;
                zzdzsVarM6111a.m6107b("ragent", zzmVar.f3213H);
                zzdzsVarM6111a.m6107b("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3345a(com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3346b(zzmVar)));
            }
        }
        return zzdzsVarM6111a;
    }

    /* JADX INFO: renamed from: d */
    public final void m6096d(zzdzs zzdzsVar) {
        if (!this.f13311w.m6482b()) {
            zzdzsVar.m6108c();
            return;
        }
        zzdzy zzdzyVar = zzdzsVar.f13423b.f13424a;
        String strM3355a = zzdzyVar.f13448f.m3355a(zzdzsVar.f13422a);
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        zzekq zzekqVar = new zzekq(System.currentTimeMillis(), this.f13310v.f16006b.f16002b.f15973b, strM3355a, 2);
        zzeko zzekoVar = this.f13312x;
        zzekoVar.getClass();
        zzekoVar.m6258c(new zzekl(zzekoVar, zzekqVar));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6097e() {
        int i2 = this.f13311w.f15918b;
        return i2 == 2 || i2 == 5 || i2 == 6 || i2 == 7;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public final void mo2730k() {
        if (this.f13311w.m6482b()) {
            m6096d(m6095c("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    /* JADX INFO: renamed from: l */
    public final void mo5902l(zzdnv zzdnvVar) {
        if (this.f13304B) {
            zzdzs zzdzsVarM6095c = m6095c("ifts");
            zzdzsVarM6095c.m6107b("reason", "exception");
            if (!TextUtils.isEmpty(zzdnvVar.getMessage())) {
                zzdzsVarM6095c.m6107b(NotificationCompat.CATEGORY_MESSAGE, zzdnvVar.getMessage());
            }
            zzdzsVarM6095c.m6108c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // com.google.android.gms.internal.ads.zzddd
    /* JADX INFO: renamed from: l0 */
    public final void mo5903l0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String strGroup;
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.f13304B) {
            zzdzs zzdzsVarM6095c = m6095c("ifts");
            zzdzsVarM6095c.m6107b("reason", "adapter");
            int i2 = zzeVar.f3106s;
            String str = zzeVar.f3107t;
            if (zzeVar.f3108u.equals("com.google.android.gms.ads") && (zzeVar2 = zzeVar.f3109v) != null && !zzeVar2.f3108u.equals("com.google.android.gms.ads")) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.f3109v;
                i2 = zzeVar3.f3106s;
                str = zzeVar3.f3107t;
            }
            if (i2 >= 0) {
                zzdzsVarM6095c.m6107b("arec", String.valueOf(i2));
            }
            Pattern pattern = this.f13308t.f16090a;
            if (pattern == null || str == null) {
                strGroup = null;
            } else {
                Matcher matcher = pattern.matcher(str);
                if (matcher.find()) {
                    strGroup = matcher.group();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup != null) {
                zzdzsVarM6095c.m6107b("areec", strGroup);
            }
            zzdzsVarM6095c.m6108c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    /* JADX INFO: renamed from: n */
    public final void mo5838n() {
        boolean zM6094b = m6094b();
        zzfkn zzfknVar = this.f13311w;
        if (zM6094b || zzfknVar.m6482b()) {
            zzdzs zzdzsVarM6095c = m6095c(AdSDKNotificationListener.IMPRESSION_EVENT);
            zzdzsVarM6095c.m6107b("imp_type", String.valueOf(zzfknVar.f15924e));
            if (this.f13314z > 0) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                zzdzsVarM6095c.m6107b("p_imp_l", String.valueOf(System.currentTimeMillis() - this.f13314z));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8435Ze)).booleanValue() && m6097e()) {
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                zzdzsVarM6095c.m6107b("foreground", true != com.google.android.gms.ads.internal.util.zzs.m3208g(this.f13307s) ? "1" : "0");
                zzdzsVarM6095c.m6107b("fg_show", true == this.f13305C.get() ? "1" : "0");
            }
            m6096d(zzdzsVarM6095c);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    /* JADX INFO: renamed from: r */
    public final void mo5864r() {
        if (m6094b()) {
            zzdzs zzdzsVarM6095c = m6095c("adapter_impression");
            zzdzsVarM6095c.m6107b("imp_type", String.valueOf(this.f13311w.f15924e));
            if (this.f13306D.get()) {
                zzdzsVarM6095c.m6107b("po", "1");
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                zzdzsVarM6095c.m6107b("pil", String.valueOf(System.currentTimeMillis() - this.f13314z));
            } else {
                zzdzsVarM6095c.m6107b("po", "0");
            }
            zzbio zzbioVar = zzbix.f8435Ze;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && m6097e()) {
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                zzdzsVarM6095c.m6107b("foreground", true != com.google.android.gms.ads.internal.util.zzs.m3208g(this.f13307s) ? "1" : "0");
                zzdzsVarM6095c.m6107b("fg_show", true != this.f13305C.get() ? "0" : "1");
            }
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8452af)).booleanValue() && m6097e()) {
                zzdzsVarM6095c.m6107b("fg_al", true == com.google.android.gms.ads.internal.zzt.f3698C.f3707g.m4855e() ? "1" : "0");
            }
            zzdzsVarM6095c.m6108c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    /* JADX INFO: renamed from: z */
    public final void mo5865z() {
        if (m6094b()) {
            m6095c("adapter_shown").m6108c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfu
    public final void zzk() {
        if (m6094b()) {
            this.f13306D.set(true);
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            zztVar.f3711k.getClass();
            this.f13314z = System.currentTimeMillis();
            zzdzs zzdzsVarM6095c = m6095c("presentation");
            zzbio zzbioVar = zzbix.f8435Ze;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && m6097e()) {
                boolean z = !com.google.android.gms.ads.internal.util.zzs.m3208g(this.f13307s);
                AtomicBoolean atomicBoolean = this.f13305C;
                atomicBoolean.set(z);
                zzdzsVarM6095c.m6107b("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8452af)).booleanValue() && m6097e()) {
                zzdzsVarM6095c.m6107b("fg_al", true != zztVar.f3707g.m4855e() ? "0" : "1");
            }
            zzdzsVarM6095c.m6108c();
        }
    }
}
