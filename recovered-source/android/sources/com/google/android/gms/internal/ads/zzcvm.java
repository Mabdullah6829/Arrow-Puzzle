package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcvm extends zzcya {

    /* JADX INFO: renamed from: l */
    public final zzclb f11563l;

    /* JADX INFO: renamed from: m */
    public final int f11564m;

    /* JADX INFO: renamed from: n */
    public final Context f11565n;

    /* JADX INFO: renamed from: o */
    public final zzcva f11566o;

    /* JADX INFO: renamed from: p */
    public final zzdnw f11567p;

    /* JADX INFO: renamed from: q */
    public final zzdkk f11568q;

    /* JADX INFO: renamed from: r */
    public final zzddm f11569r;

    /* JADX INFO: renamed from: s */
    public final boolean f11570s;

    /* JADX INFO: renamed from: t */
    public final zzcfp f11571t;

    /* JADX INFO: renamed from: u */
    public final zzdzt f11572u;

    /* JADX INFO: renamed from: v */
    public boolean f11573v;

    public zzcvm(zzcxz zzcxzVar, Context context, zzclb zzclbVar, int i2, zzcva zzcvaVar, zzdnw zzdnwVar, zzdkk zzdkkVar, zzddm zzddmVar, zzcfp zzcfpVar, zzdzt zzdztVar) {
        super(zzcxzVar);
        this.f11573v = false;
        this.f11563l = zzclbVar;
        this.f11565n = context;
        this.f11564m = i2;
        this.f11566o = zzcvaVar;
        this.f11567p = zzdnwVar;
        this.f11568q = zzdkkVar;
        this.f11569r = zzddmVar;
        this.f11570s = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8748s6)).booleanValue();
        this.f11571t = zzcfpVar;
        this.f11572u = zzdztVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public final void m5843c(Activity activity, boolean z) {
        zzclb zzclbVar;
        zzfkn zzfknVarMo5565B;
        int i2;
        zzdkk zzdkkVar = this.f11568q;
        zzddm zzddmVar = this.f11569r;
        Context context = activity;
        if (activity == null) {
            context = this.f11565n;
        }
        boolean z2 = this.f11570s;
        if (z2) {
            zzdkkVar.m5923J0(zzdkj.f12284a);
        }
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        com.google.android.gms.ads.internal.util.zzs zzsVar = zztVar.f3703c;
        zzdnw zzdnwVar = this.f11567p;
        if (!com.google.android.gms.ads.internal.util.zzs.m3214m(zzdnwVar.zzb())) {
            zzbio zzbioVar = zzbix.f8469bf;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs.m3213l(context, this.f11760b, this.f11572u);
            }
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8590j1)).booleanValue() && com.google.android.gms.ads.internal.util.zzs.m3208g(context)) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                zzddmVar.mo5901a();
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8607k1)).booleanValue()) {
                    new zzfya(context.getApplicationContext(), zztVar.f3720t.m3128a()).m6777a(this.f11759a.f16006b.f16002b.f15973b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8721qd)).booleanValue() && (zzclbVar = this.f11563l) != null && (zzfknVarMo5565B = zzclbVar.mo5565B()) != null && zzfknVarMo5565B.f15951r0) {
            int i4 = zzfknVarMo5565B.f15953s0;
            zzcfp zzcfpVar = this.f11571t;
            synchronized (zzcfpVar.f9926s) {
                zzcfm zzcfmVar = zzcfpVar.f9929v;
                synchronized (zzcfmVar.f9914f) {
                    i2 = zzcfmVar.f9920l;
                }
            }
            if (i4 != i2) {
                int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("The app open consent form has been shown.");
                zzddmVar.mo5903l0(zzfmi.m6535d(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f11573v) {
            int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("App open interstitial ad is already visible.");
            zzddmVar.mo5903l0(zzfmi.m6535d(10, null, null));
        }
        if (this.f11573v) {
            return;
        }
        try {
            zzdnwVar.mo5941a(z, context, zzddmVar);
            if (z2) {
                zzdkkVar.m5923J0(zzdki.f12283a);
            }
            this.f11573v = true;
        } catch (zzdnv e) {
            zzddmVar.mo5902l(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5844d() {
        zzddy zzddyVar = this.f11761c;
        zzddyVar.getClass();
        zzddyVar.m5923J0(new zzddw(null));
        zzclb zzclbVar = this.f11563l;
        if (zzclbVar != null) {
            zzclbVar.destroy();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5845f(int i2, long j2) {
        String str;
        zzcva zzcvaVar = this.f11566o;
        zzdzs zzdzsVarM6111a = zzcvaVar.f11554a.m6111a();
        zzdzsVarM6111a.m6107b("gqi", zzcvaVar.f11555b.f16006b.f16002b.f15973b);
        zzdzsVarM6111a.m6107b("action", "ad_closed");
        zzdzsVarM6111a.m6107b("show_time", String.valueOf(j2));
        zzdzsVarM6111a.m6107b(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        int i3 = i2 - 1;
        if (i3 == 0) {
            str = "h";
        } else if (i3 == 1) {
            str = "bb";
        } else if (i3 == 2) {
            str = "cc";
        } else if (i3 != 3) {
            str = i3 != 4 ? "u" : "ac";
        } else {
            str = "cb";
        }
        zzdzsVarM6111a.m6107b("acr", str);
        zzdzsVarM6111a.m6108c();
    }
}
