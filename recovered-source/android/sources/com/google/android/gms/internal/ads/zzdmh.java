package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdmh extends zzcya {

    /* JADX INFO: renamed from: l */
    public final Context f12333l;

    /* JADX INFO: renamed from: m */
    public final WeakReference f12334m;

    /* JADX INFO: renamed from: n */
    public final zzdkk f12335n;

    /* JADX INFO: renamed from: o */
    public final zzdnw f12336o;

    /* JADX INFO: renamed from: p */
    public final zzcyv f12337p;

    /* JADX INFO: renamed from: q */
    public final zzfya f12338q;

    /* JADX INFO: renamed from: r */
    public final zzddm f12339r;

    /* JADX INFO: renamed from: s */
    public final zzcfp f12340s;

    /* JADX INFO: renamed from: t */
    public final zzdzt f12341t;

    /* JADX INFO: renamed from: u */
    public boolean f12342u;

    public zzdmh(zzcxz zzcxzVar, Context context, zzclb zzclbVar, zzdkk zzdkkVar, zzdnw zzdnwVar, zzcyv zzcyvVar, zzfya zzfyaVar, zzddm zzddmVar, zzcfp zzcfpVar, zzdzt zzdztVar) {
        super(zzcxzVar);
        this.f12342u = false;
        this.f12333l = context;
        this.f12334m = new WeakReference(zzclbVar);
        this.f12335n = zzdkkVar;
        this.f12336o = zzdnwVar;
        this.f12337p = zzcyvVar;
        this.f12338q = zzfyaVar;
        this.f12339r = zzddmVar;
        this.f12340s = zzcfpVar;
        this.f12341t = zzdztVar;
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
    public final void m5938c(Activity activity, boolean z) {
        zzfkn zzfknVarMo5565B;
        int i2;
        Context context = this.f12333l;
        zzddm zzddmVar = this.f12339r;
        zzdkk zzdkkVar = this.f12335n;
        zzdkkVar.getClass();
        zzdkkVar.m5923J0(zzdkj.f12284a);
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        zzdnw zzdnwVar = this.f12336o;
        if (!com.google.android.gms.ads.internal.util.zzs.m3214m(zzdnwVar.zzb())) {
            zzbio zzbioVar = zzbix.f8469bf;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs.m3213l(context, this.f11760b, this.f12341t);
            }
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8590j1)).booleanValue() && com.google.android.gms.ads.internal.util.zzs.m3208g(context)) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                zzddmVar.mo5901a();
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8607k1)).booleanValue()) {
                    this.f12338q.m6777a(this.f11759a.f16006b.f16002b.f15973b);
                    return;
                }
                return;
            }
        }
        zzclb zzclbVar = (zzclb) this.f12334m.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8721qd)).booleanValue() && zzclbVar != null && (zzfknVarMo5565B = zzclbVar.mo5565B()) != null && zzfknVarMo5565B.f15951r0) {
            int i4 = zzfknVarMo5565B.f15953s0;
            zzcfp zzcfpVar = this.f12340s;
            synchronized (zzcfpVar.f9926s) {
                zzcfm zzcfmVar = zzcfpVar.f9929v;
                synchronized (zzcfmVar.f9914f) {
                    i2 = zzcfmVar.f9920l;
                }
            }
            if (i4 != i2) {
                int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("The interstitial consent form has been shown.");
                zzddmVar.mo5903l0(zzfmi.m6535d(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f12342u) {
            int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("The interstitial ad has been shown.");
            zzddmVar.mo5903l0(zzfmi.m6535d(10, null, null));
        }
        Context context2 = activity;
        if (this.f12342u) {
            return;
        }
        if (activity == null) {
            context2 = context;
        }
        try {
            zzdnwVar.mo5941a(z, context2, zzddmVar);
            zzdkkVar.m5923J0(zzdki.f12283a);
            this.f12342u = true;
        } catch (zzdnv e) {
            zzddmVar.mo5902l(e);
        }
    }

    public final void finalize() throws Throwable {
        try {
            final zzclb zzclbVar = (zzclb) this.f12334m.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8061D7)).booleanValue()) {
                if (!this.f12342u && zzclbVar != null) {
                    ((zzcfx) zzcfy.f9951f).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmg
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzclbVar.destroy();
                        }
                    });
                }
            } else if (zzclbVar != null) {
                zzclbVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
