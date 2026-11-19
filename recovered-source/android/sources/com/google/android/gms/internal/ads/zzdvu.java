package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvu extends zzcya {

    /* JADX INFO: renamed from: l */
    public final Context f13126l;

    /* JADX INFO: renamed from: m */
    public final WeakReference f13127m;

    /* JADX INFO: renamed from: n */
    public final zzdnw f13128n;

    /* JADX INFO: renamed from: o */
    public final zzdkk f13129o;

    /* JADX INFO: renamed from: p */
    public final zzddm f13130p;

    /* JADX INFO: renamed from: q */
    public final zzdet f13131q;

    /* JADX INFO: renamed from: r */
    public final zzcyv f13132r;

    /* JADX INFO: renamed from: s */
    public final zzcdg f13133s;

    /* JADX INFO: renamed from: t */
    public final zzfya f13134t;

    /* JADX INFO: renamed from: u */
    public final zzfla f13135u;

    /* JADX INFO: renamed from: v */
    public final zzdzt f13136v;

    /* JADX INFO: renamed from: w */
    public boolean f13137w;

    public zzdvu(zzcxz zzcxzVar, Context context, zzclb zzclbVar, zzdnw zzdnwVar, zzdkk zzdkkVar, zzddm zzddmVar, zzdet zzdetVar, zzcyv zzcyvVar, zzfkn zzfknVar, zzfya zzfyaVar, zzfla zzflaVar, zzdzt zzdztVar) {
        super(zzcxzVar);
        this.f13137w = false;
        this.f13126l = context;
        this.f13128n = zzdnwVar;
        this.f13127m = new WeakReference(zzclbVar);
        this.f13129o = zzdkkVar;
        this.f13130p = zzddmVar;
        this.f13131q = zzdetVar;
        this.f13132r = zzcyvVar;
        this.f13134t = zzfyaVar;
        zzcci zzcciVar = zzfknVar.f15938l;
        this.f13133s = new zzcdg(zzcciVar != null ? zzcciVar.f9740s : "", zzcciVar != null ? zzcciVar.f9741t : 1);
        this.f13135u = zzflaVar;
        this.f13136v = zzdztVar;
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
    public final void m6072c(Activity activity, boolean z) {
        Context context;
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        zzdnw zzdnwVar = this.f13128n;
        boolean zM3214m = com.google.android.gms.ads.internal.util.zzs.m3214m(zzdnwVar.zzb());
        Context context2 = this.f13126l;
        zzddm zzddmVar = this.f13130p;
        if (!zM3214m) {
            zzbio zzbioVar = zzbix.f8469bf;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            zzbiv zzbivVar = zzbaVar.f3098c;
            zzbiv zzbivVar2 = zzbaVar.f3098c;
            if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs.m3213l(context2, this.f11760b, this.f13136v);
            }
            if (((Boolean) zzbivVar2.m5030a(zzbix.f8590j1)).booleanValue() && com.google.android.gms.ads.internal.util.zzs.m3208g(context2)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                zzddmVar.mo5901a();
                if (((Boolean) zzbivVar2.m5030a(zzbix.f8607k1)).booleanValue()) {
                    this.f13134t.m6777a(this.f11759a.f16006b.f16002b.f15973b);
                    return;
                }
                return;
            }
        }
        if (this.f13137w) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("The rewarded ad have been showed.");
            zzddmVar.mo5903l0(zzfmi.m6535d(10, null, null));
            return;
        }
        this.f13137w = true;
        zzdkk zzdkkVar = this.f13129o;
        zzdkkVar.getClass();
        zzdkkVar.m5923J0(zzdkj.f12284a);
        if (activity == null) {
            context = activity;
            context = context2;
        }
        try {
            context = activity;
            zzdnwVar.mo5941a(z, context, zzddmVar);
            zzdkkVar.m5923J0(zzdki.f12283a);
        } catch (zzdnv e) {
            zzddmVar.mo5902l(e);
        }
    }

    public final void finalize() throws Throwable {
        try {
            final zzclb zzclbVar = (zzclb) this.f13127m.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8061D7)).booleanValue()) {
                if (!this.f13137w && zzclbVar != null) {
                    ((zzcfx) zzcfy.f9951f).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvt
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
