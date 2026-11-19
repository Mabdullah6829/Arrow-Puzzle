package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdpw extends zzcya {

    /* JADX INFO: renamed from: J */
    public static final zzgwt f12557J;

    /* JADX INFO: renamed from: A */
    public boolean f12558A;

    /* JADX INFO: renamed from: B */
    public final zzced f12559B;

    /* JADX INFO: renamed from: C */
    public final zzbaw f12560C;

    /* JADX INFO: renamed from: D */
    public final VersionInfoParcel f12561D;

    /* JADX INFO: renamed from: E */
    public final Context f12562E;

    /* JADX INFO: renamed from: F */
    public final zzdpy f12563F;

    /* JADX INFO: renamed from: G */
    public final zzetn f12564G;

    /* JADX INFO: renamed from: H */
    public final HashMap f12565H;

    /* JADX INFO: renamed from: I */
    public final ArrayList f12566I;

    /* JADX INFO: renamed from: l */
    public final Executor f12567l;

    /* JADX INFO: renamed from: m */
    public final zzdqb f12568m;

    /* JADX INFO: renamed from: n */
    public final zzdqj f12569n;

    /* JADX INFO: renamed from: o */
    public final zzdra f12570o;

    /* JADX INFO: renamed from: p */
    public final zzdqg f12571p;

    /* JADX INFO: renamed from: q */
    public final zzdql f12572q;

    /* JADX INFO: renamed from: r */
    public final zzimt f12573r;

    /* JADX INFO: renamed from: s */
    public final zzimt f12574s;

    /* JADX INFO: renamed from: t */
    public final zzimt f12575t;

    /* JADX INFO: renamed from: u */
    public final zzimt f12576u;

    /* JADX INFO: renamed from: v */
    public final zzimt f12577v;

    /* JADX INFO: renamed from: w */
    public zzdry f12578w;

    /* JADX INFO: renamed from: x */
    public boolean f12579x;

    /* JADX INFO: renamed from: y */
    public boolean f12580y;

    /* JADX INFO: renamed from: z */
    public boolean f12581z;

    static {
        zzgzi zzgziVar = zzgwt.f18303t;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzgym.m7263a(6, objArr);
        f12557J = zzgwt.m7222v(6, objArr);
    }

    public zzdpw(zzcxz zzcxzVar, Executor executor, zzdqb zzdqbVar, zzdqj zzdqjVar, zzdra zzdraVar, zzdqg zzdqgVar, zzdql zzdqlVar, zzimt zzimtVar, zzimt zzimtVar2, zzimt zzimtVar3, zzimt zzimtVar4, zzimt zzimtVar5, zzced zzcedVar, zzbaw zzbawVar, VersionInfoParcel versionInfoParcel, Context context, zzdpy zzdpyVar, zzetn zzetnVar) {
        super(zzcxzVar);
        this.f12567l = executor;
        this.f12568m = zzdqbVar;
        this.f12569n = zzdqjVar;
        this.f12570o = zzdraVar;
        this.f12571p = zzdqgVar;
        this.f12572q = zzdqlVar;
        this.f12573r = zzimtVar;
        this.f12574s = zzimtVar2;
        this.f12575t = zzimtVar3;
        this.f12576u = zzimtVar4;
        this.f12577v = zzimtVar5;
        this.f12559B = zzcedVar;
        this.f12560C = zzbawVar;
        this.f12561D = versionInfoParcel;
        this.f12562E = context;
        this.f12563F = zzdpyVar;
        this.f12564G = zzetnVar;
        this.f12565H = new HashMap();
        this.f12566I = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m5977d(View view) {
        zzbio zzbioVar = zzbix.f8416Yb;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        long jM3201T = com.google.android.gms.ads.internal.util.zzs.m3201T(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (jM3201T >= ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8432Zb)).intValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    /* JADX INFO: renamed from: a */
    public final void mo5855a() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpu
            @Override // java.lang.Runnable
            public final void run() {
                zzdpw zzdpwVar = this.f12555s;
                zzdql zzdqlVar = zzdpwVar.f12572q;
                try {
                    zzdqb zzdqbVar = zzdpwVar.f12568m;
                    int iM6011q = zzdqbVar.m6011q();
                    if (iM6011q == 1) {
                        zzbnj zzbnjVar = zzdqlVar.f12654a;
                        if (zzbnjVar != null) {
                            zzdpwVar.m5987n();
                            zzbnjVar.mo5073V2((zzbmz) zzdpwVar.f12573r.zzb());
                            return;
                        }
                        return;
                    }
                    if (iM6011q == 2) {
                        zzbng zzbngVar = zzdqlVar.f12655b;
                        if (zzbngVar != null) {
                            zzdpwVar.m5987n();
                            zzbngVar.mo5072G3((zzbmx) zzdpwVar.f12574s.zzb());
                            return;
                        }
                        return;
                    }
                    if (iM6011q == 3) {
                        String strM6004g = zzdqbVar.m6004g();
                        zzbnp zzbnpVar = strM6004g == null ? null : (zzbnp) zzdqlVar.f12659f.get(strM6004g);
                        if (zzbnpVar != null) {
                            if (zzdqbVar.m6005h() != null) {
                                zzdpwVar.m5979f("Google", true);
                            }
                            zzbnpVar.mo5075E3((zzbnc) zzdpwVar.f12577v.zzb());
                            return;
                        }
                        return;
                    }
                    if (iM6011q == 6) {
                        zzbnw zzbnwVar = zzdqlVar.f12656c;
                        if (zzbnwVar != null) {
                            zzdpwVar.m5987n();
                            zzbnwVar.mo5077j1((zzboc) zzdpwVar.f12575t.zzb());
                            return;
                        }
                        return;
                    }
                    if (iM6011q != 7) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3070c("Wrong native template id!");
                    } else {
                        zzbsr zzbsrVar = zzdqlVar.f12658e;
                        if (zzbsrVar != null) {
                            zzbsrVar.mo5124E2((zzbsl) zzdpwVar.f12576u.zzb());
                        }
                    }
                } catch (RemoteException e) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3071d("RemoteException when notifyAdLoad is called", e);
                }
            }
        };
        Executor executor = this.f12567l;
        executor.execute(runnable);
        if (this.f12568m.m6011q() != 7) {
            final zzdqj zzdqjVar = this.f12569n;
            Objects.requireNonNull(zzdqjVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdqjVar.mo5960l();
                }
            });
        }
        super.mo5855a();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m5978c(final View view, final int i2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8401Xc)).booleanValue()) {
            zzdry zzdryVar = this.f12578w;
            if (zzdryVar == null) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = zzdryVar instanceof zzdqu;
                this.f12567l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdps
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzdpw zzdpwVar = this.f12549s;
                        zzdry zzdryVar2 = zzdpwVar.f12578w;
                        if (zzdryVar2 == null) {
                            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                            return;
                        }
                        zzdpwVar.f12569n.mo5961m(view, zzdryVar2.mo6021D0(), zzdpwVar.f12578w.zzi(), zzdpwVar.f12578w.zzj(), z, zzdpwVar.m5986m(), i2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final zzelv m5979f(final String str, boolean z) {
        boolean z2;
        final String str2;
        zzelr zzelrVar;
        zzels zzelsVar;
        String str3;
        zzdqg zzdqgVar = this.f12571p;
        if (zzdqgVar.mo6016c() && !TextUtils.isEmpty(str)) {
            zzdqb zzdqbVar = this.f12568m;
            zzclb zzclbVarM6007j = zzdqbVar.m6007j();
            zzclb zzclbVarM6005h = zzdqbVar.m6005h();
            if (zzclbVarM6007j == null && zzclbVarM6005h == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdqgVar.mo6019f();
            int iM6487a = zzdqgVar.mo6019f().m6487a();
            int i3 = iM6487a - 1;
            boolean z3 = false;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (iM6487a != 1) {
                        str3 = iM6487a != 2 ? "UNKNOWN" : "DISPLAY";
                    } else {
                        str3 = "VIDEO";
                    }
                    String strM2450q = AbstractC1456a.m2450q(new StringBuilder(str3.length() + 49), "Unknown omid media type: ", str3, ". Not initializing Omid.");
                    int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f(strM2450q);
                    return null;
                }
                if (zzclbVarM6007j == null) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Omid media type was display but there was no display webview.");
                    return null;
                }
                z2 = false;
                z3 = true;
            } else if (zzclbVarM6005h != null) {
                z2 = true;
            } else {
                int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Omid media type was video but there was no video webview.");
            }
            if (z3) {
                str2 = null;
            } else if (z2) {
                str2 = "javascript";
                zzclbVarM6007j = zzclbVarM6005h;
            } else {
                zzclbVarM6007j = null;
                str2 = null;
            }
            if (zzclbVarM6007j == null) {
                int i7 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Webview is null in InternalNativeAd");
                return null;
            }
            Context context = this.f12562E;
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            if (!zztVar.f3724x.m6274a(context)) {
                int i8 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.f12561D;
            int i9 = versionInfoParcel.f3397t;
            int i10 = versionInfoParcel.f3398u;
            StringBuilder sb = new StringBuilder(AbstractC1456a.m2434a(i9, 1) + String.valueOf(i10).length());
            sb.append(i9);
            sb.append(".");
            sb.append(i10);
            final String string = sb.toString();
            if (z2) {
                zzelrVar = zzelr.VIDEO;
                zzelsVar = zzels.DEFINED_BY_JAVASCRIPT;
            } else {
                zzelrVar = zzelr.NATIVE_DISPLAY;
                zzelsVar = zzdqbVar.m6011q() == 3 ? zzels.UNSPECIFIED : zzels.ONE_PIXEL;
            }
            final zzelr zzelrVar2 = zzelrVar;
            final zzels zzelsVar2 = zzelsVar;
            zzelp zzelpVar = zztVar.f3724x;
            final WebView webViewMo5620y = zzclbVarM6007j.mo5620y();
            final String str4 = this.f11760b.f15939l0;
            zzelpVar.getClass();
            zzelv zzelvVar = (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8562h6)).booleanValue() && zzfus.f16595a.f16596a) ? (zzelv) zzelp.m6272i(new zzelo() { // from class: com.google.android.gms.internal.ads.zzelg
                @Override // com.google.android.gms.internal.ads.zzelo
                public final Object zza() {
                    String str5 = str;
                    if (TextUtils.isEmpty(str5)) {
                        throw new IllegalArgumentException("Name is null or empty");
                    }
                    String str6 = string;
                    if (TextUtils.isEmpty(str6)) {
                        throw new IllegalArgumentException("Version is null or empty");
                    }
                    zzfvi zzfviVar = new zzfvi(str5, str6);
                    zzfvh zzfvhVarM6269f = zzelp.m6269f("javascript");
                    String str7 = str2;
                    zzfvh zzfvhVarM6269f2 = zzelp.m6269f(str7);
                    zzelr zzelrVar3 = zzelrVar2;
                    zzfuz zzfuzVarM6271h = zzelp.m6271h(zzelrVar3.f14164s);
                    zzfvh zzfvhVar = zzfvh.NONE;
                    if (zzfvhVarM6269f == zzfvhVar) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Omid js session error; Unable to parse impression owner: javascript");
                        return null;
                    }
                    if (zzfuzVarM6271h == null) {
                        String strValueOf = String.valueOf(zzelrVar3);
                        int i12 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Omid js session error; Unable to parse creative type: ".concat(strValueOf));
                        return null;
                    }
                    if (zzfuzVarM6271h == zzfuz.VIDEO && zzfvhVarM6269f2 == zzfvhVar) {
                        String strValueOf2 = String.valueOf(str7);
                        int i13 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2));
                        return null;
                    }
                    zzfuw zzfuwVar = new zzfuw(zzfviVar, webViewMo5620y, str4, "", zzfux.JAVASCRIPT);
                    zzfuv zzfuvVarM6724a = zzfuv.m6724a(zzfuzVarM6271h, zzelp.m6270g(zzelsVar2.f14170s), zzfvhVarM6269f, zzfvhVarM6269f2, true);
                    if (zzfus.f16595a.f16596a) {
                        return new zzelv(new zzfuy(zzfuvVarM6724a, zzfuwVar, UUID.randomUUID().toString()), zzfuwVar);
                    }
                    throw new IllegalStateException("Method called before OM SDK activation");
                }
            }) : null;
            if (zzelvVar == null) {
                int i11 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to create omid session in InternalNativeAd");
                return null;
            }
            synchronized (zzdqbVar) {
                zzdqbVar.f12621l = zzelvVar;
            }
            zzclbVarM6007j.mo5601g0(zzelvVar);
            if (z2) {
                zzfuy zzfuyVar = zzelvVar.f14182a;
                if (zzclbVarM6005h != null) {
                    zztVar.f3724x.m6278e(zzfuyVar, zzclbVarM6005h.mo5577H());
                }
                this.f12558A = true;
            }
            if (z) {
                zztVar.f3724x.m6276c(zzelvVar.f14182a);
                zzclbVarM6007j.mo5129b("onSdkLoaded", new ArrayMap());
            }
            return zzelvVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m5980g(View view) {
        zzcgd zzcgdVar;
        zzdqb zzdqbVar = this.f12568m;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8680o6)).booleanValue() || zzdqbVar.m6011q() == 3) {
            m5988o(view, zzdqbVar.m6008k());
            return;
        }
        synchronized (zzdqbVar) {
            zzcgdVar = zzdqbVar.f12623n;
        }
        if (zzcgdVar == null) {
            return;
        }
        zzdpn zzdpnVar = new zzdpn(this, view);
        zzcgdVar.addListener(new zzhcd(zzcgdVar, zzdpnVar), this.f12567l);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m5981h(final zzdry zzdryVar) {
        Iterator<String> itKeys;
        View view;
        zzbar zzbarVar;
        try {
            if (!this.f12579x) {
                this.f12578w = zzdryVar;
                final zzdra zzdraVar = this.f12570o;
                zzdraVar.f12705g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqz
                    /* JADX WARN: Code duplicated, block: B:113:0x0286  */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewGroup viewGroup;
                        View view2;
                        int i2;
                        View view3;
                        final ViewGroup viewGroup2;
                        zzbmi zzbmiVar;
                        Drawable drawable;
                        final zzdra zzdraVar2 = zzdraVar;
                        zzdry zzdryVar2 = zzdryVar;
                        zzdqg zzdqgVar = zzdraVar2.f12701c;
                        if (!zzdqgVar.mo6017d() && !zzdqgVar.mo6015b()) {
                            viewGroup = null;
                            break;
                        }
                        String[] strArr = {"1098", "3011"};
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 2) {
                                viewGroup = null;
                                break;
                            }
                            View viewMo6022I0 = zzdryVar2.mo6022I0(strArr[i3]);
                            if (viewMo6022I0 instanceof ViewGroup) {
                                viewGroup = (ViewGroup) viewMo6022I0;
                                break;
                            }
                            i3++;
                        }
                        Context context = zzdryVar2.mo6021D0().getContext();
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                        zzdqb zzdqbVar = zzdraVar2.f12702d;
                        synchronized (zzdqbVar) {
                            view2 = zzdqbVar.f12613d;
                        }
                        if (view2 != null) {
                            synchronized (zzdqbVar) {
                                view3 = zzdqbVar.f12613d;
                            }
                            zzbma zzbmaVar = zzdraVar2.f12707i;
                            if (zzbmaVar != null && viewGroup == null) {
                                zzdra.m6036b(layoutParams, zzbmaVar.f9170w);
                                view3.setLayoutParams(layoutParams);
                                viewGroup = null;
                            }
                        } else if (zzdqbVar.m6013s() instanceof zzblt) {
                            zzblt zzbltVar = (zzblt) zzdqbVar.m6013s();
                            if (viewGroup == null) {
                                zzdra.m6036b(layoutParams, zzbltVar.f9149z);
                                viewGroup = null;
                            }
                            zzblu zzbluVar = new zzblu(context);
                            Preconditions.m3544h(zzbltVar);
                            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zzblu.f9150t, null, null));
                            shapeDrawable.getPaint().setColor(zzbltVar.f9145v);
                            zzbluVar.setLayoutParams(layoutParams);
                            zzbluVar.setBackground(shapeDrawable);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                            String str = zzbltVar.f9142s;
                            if (TextUtils.isEmpty(str)) {
                                i2 = 1;
                            } else {
                                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                                TextView textView = new TextView(context);
                                textView.setLayoutParams(layoutParams3);
                                textView.setId(1195835393);
                                textView.setTypeface(Typeface.DEFAULT);
                                textView.setText(str);
                                textView.setTextColor(zzbltVar.f9146w);
                                textView.setTextSize(zzbltVar.f9147x);
                                com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
                                textView.setPadding(com.google.android.gms.ads.internal.util.client.zzf.m3033b(context, 4), 0, com.google.android.gms.ads.internal.util.client.zzf.m3041r(context.getResources().getDisplayMetrics(), 4), 0);
                                zzbluVar.addView(textView);
                                i2 = 1;
                                layoutParams2.addRule(1, textView.getId());
                            }
                            ImageView imageView = new ImageView(context);
                            imageView.setLayoutParams(layoutParams2);
                            imageView.setId(1195835394);
                            ArrayList arrayList = zzbltVar.f9143t;
                            if (arrayList != null && arrayList.size() > i2) {
                                zzbluVar.f9151s = new AnimationDrawable();
                                int size = arrayList.size();
                                int i4 = 0;
                                while (i4 < size) {
                                    int i5 = i4 + 1;
                                    try {
                                        zzbluVar.f9151s.addFrame((Drawable) ObjectWrapper.m3697u0(((zzblw) arrayList.get(i4)).zzb()), zzbltVar.f9148y);
                                    } catch (Exception e) {
                                        int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error while getting drawable.", e);
                                    }
                                    i4 = i5;
                                }
                                imageView.setBackground(zzbluVar.f9151s);
                            } else if (arrayList.size() == 1) {
                                try {
                                    imageView.setImageDrawable((Drawable) ObjectWrapper.m3697u0(((zzblw) arrayList.get(0)).zzb()));
                                } catch (Exception e2) {
                                    int i7 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error while getting drawable.", e2);
                                }
                            }
                            zzbluVar.addView(imageView);
                            zzbluVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8126H4));
                            view3 = zzbluVar;
                        } else {
                            view3 = null;
                        }
                        if (view3 != null) {
                            if (view3.getParent() instanceof ViewGroup) {
                                ((ViewGroup) view3.getParent()).removeView(view3);
                            }
                            if (viewGroup != null) {
                                viewGroup.removeAllViews();
                                viewGroup.addView(view3);
                            } else {
                                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdryVar2.mo6021D0().getContext());
                                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                zzaVar.addView(view3);
                                FrameLayout frameLayoutMo6023N3 = zzdryVar2.mo6023N3();
                                if (frameLayoutMo6023N3 != null) {
                                    frameLayoutMo6023N3.addView(zzaVar);
                                }
                            }
                            zzdryVar2.mo6029x0(zzdryVar2.mo6025e(), view3);
                        }
                        zzgyo zzgyoVar = (zzgyo) zzdqw.f12674H;
                        int i8 = zzgyoVar.f18357v;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= i8) {
                                viewGroup2 = null;
                                break;
                            }
                            View viewMo6022I1 = zzdryVar2.mo6022I0((String) zzgyoVar.get(i9));
                            i9++;
                            if (viewMo6022I1 instanceof ViewGroup) {
                                viewGroup2 = (ViewGroup) viewMo6022I1;
                                break;
                            }
                        }
                        zzdraVar2.f12706h.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqy
                            @Override // java.lang.Runnable
                            public final void run() {
                                View view4;
                                zzdra zzdraVar3 = zzdraVar2;
                                ViewGroup viewGroup3 = viewGroup2;
                                zzflg zzflgVar = zzdraVar3.f12700b;
                                com.google.android.gms.ads.internal.util.zzg zzgVar = zzdraVar3.f12699a;
                                zzdqb zzdqbVar2 = zzdraVar3.f12702d;
                                synchronized (zzdqbVar2) {
                                    view4 = zzdqbVar2.f12624o;
                                }
                                if (view4 != null) {
                                    boolean z = viewGroup3 != null;
                                    if (zzdqbVar2.m6011q() == 2 || zzdqbVar2.m6011q() == 1) {
                                        zzgVar.mo3163b0(zzflgVar.f16043g, String.valueOf(zzdqbVar2.m6011q()), z);
                                    } else if (zzdqbVar2.m6011q() == 6) {
                                        String str2 = zzflgVar.f16043g;
                                        zzgVar.mo3163b0(str2, "2", z);
                                        zzgVar.mo3163b0(str2, "1", z);
                                    }
                                }
                            }
                        });
                        if (viewGroup2 == null) {
                            return;
                        }
                        if (zzdraVar2.m6038c(viewGroup2, true)) {
                            if (zzdqbVar.m6005h() != null) {
                                zzdqbVar.m6005h().mo5580I0(new zzdqx(zzdryVar2, viewGroup2));
                                return;
                            }
                            return;
                        }
                        zzbio zzbioVar = zzbix.f8787ub;
                        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && zzdraVar2.m6038c(viewGroup2, false)) {
                            if (zzdqbVar.m6006i() != null) {
                                zzdqbVar.m6006i().mo5580I0(new zzdqx(zzdryVar2, viewGroup2));
                                return;
                            }
                            return;
                        }
                        viewGroup2.removeAllViews();
                        View viewMo6021D0 = zzdryVar2.mo6021D0();
                        Context context2 = viewMo6021D0 != null ? viewMo6021D0.getContext() : null;
                        if (context2 != null) {
                            zzdpy zzdpyVar = zzdraVar2.f12708j;
                            synchronized (zzdpyVar) {
                                zzbmiVar = zzdpyVar.f12601a;
                            }
                            if (zzbmiVar != null) {
                                try {
                                    IObjectWrapper iObjectWrapperMo5065c = zzbmiVar.mo5065c();
                                    if (iObjectWrapperMo5065c == null || (drawable = (Drawable) ObjectWrapper.m3697u0(iObjectWrapperMo5065c)) == null) {
                                        return;
                                    }
                                    ImageView imageView2 = new ImageView(context2);
                                    imageView2.setImageDrawable(drawable);
                                    IObjectWrapper iObjectWrapperMo6026g = zzdryVar2.mo6026g();
                                    if (iObjectWrapperMo6026g == null) {
                                        imageView2.setScaleType(zzdra.f12698k);
                                    } else if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8495d7)).booleanValue()) {
                                        imageView2.setScaleType((ImageView.ScaleType) ObjectWrapper.m3697u0(iObjectWrapperMo6026g));
                                    } else {
                                        imageView2.setScaleType(zzdra.f12698k);
                                    }
                                    imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    viewGroup2.addView(imageView2);
                                } catch (RemoteException unused) {
                                    int i10 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not get main image drawable");
                                }
                            }
                        }
                    }
                });
                this.f12569n.mo5958j(zzdryVar.mo6021D0(), zzdryVar.zzj(), zzdryVar.zzk(), zzdryVar, zzdryVar);
                zzbio zzbioVar = zzbix.f8796v3;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && (zzbarVar = this.f12560C.f7501b) != null) {
                    zzbarVar.mo3260g(zzdryVar.mo6021D0());
                }
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8727r2)).booleanValue()) {
                    zzfkn zzfknVar = this.f11760b;
                    if (zzfknVar.f15937k0 && (itKeys = zzfknVar.f15935j0.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            zzdry zzdryVar2 = this.f12578w;
                            WeakReference weakReference = zzdryVar2 == null ? null : (WeakReference) zzdryVar2.zzi().get(next);
                            this.f12565H.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                zzbez zzbezVar = new zzbez(this.f12562E, view);
                                this.f12566I.add(zzbezVar);
                                zzbezVar.f7714D.add(new zzdpl(this, next));
                                zzbezVar.m4830d(3);
                            }
                        }
                    }
                }
                if (zzdryVar.mo6024c() != null) {
                    zzbez zzbezVarMo6024c = zzdryVar.mo6024c();
                    zzbezVarMo6024c.f7714D.add(this.f12559B);
                    zzbezVarMo6024c.m4830d(3);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5982i(zzdry zzdryVar) {
        View viewMo6021D0 = zzdryVar.mo6021D0();
        zzdryVar.zzi();
        this.f12569n.mo5956h(viewMo6021D0);
        if (zzdryVar.mo6023N3() != null) {
            zzdryVar.mo6023N3().setClickable(false);
            zzdryVar.mo6023N3().removeAllViews();
        }
        if (zzdryVar.mo6024c() != null) {
            zzbez zzbezVarMo6024c = zzdryVar.mo6024c();
            zzbezVarMo6024c.f7714D.remove(this.f12559B);
        }
        this.f12578w = null;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m5983j(View view, Map map, Map map2) {
        this.f12570o.m6037a(this.f12578w);
        this.f12569n.mo5965q(view, map, map2, m5986m());
        this.f12580y = true;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m5984k(View view, Map map, Map map2) {
        View viewM5985l;
        if (!this.f12581z && (viewM5985l = m5985l(map)) != null) {
            zzbio zzbioVar = zzbix.f8486cf;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                Rect rect = new Rect();
                if (viewM5985l.getGlobalVisibleRect(rect, new Point()) && viewM5985l.getHeight() == rect.height() && viewM5985l.getWidth() == rect.width()) {
                    this.f12569n.mo5964p(view, map, map2, m5986m());
                    this.f12581z = true;
                }
            } else if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8503df)).booleanValue()) {
                zzbio zzbioVar2 = zzbix.f8520ef;
                if (((Float) zzbaVar.f3098c.m5030a(zzbioVar2)).floatValue() > 0.0d) {
                    double dFloatValue = ((Float) zzbaVar.f3098c.m5030a(zzbioVar2)).floatValue();
                    Rect rect2 = new Rect();
                    if (viewM5985l.getGlobalVisibleRect(rect2, new Point())) {
                        if (rect2.height() * rect2.width() >= ((double) (viewM5985l.getHeight() * viewM5985l.getWidth())) * (dFloatValue / 100.0d)) {
                            this.f12569n.mo5964p(view, map, map2, m5986m());
                            this.f12581z = true;
                        }
                    }
                }
            } else if (m5977d(viewM5985l)) {
                this.f12569n.mo5964p(view, map, map2, m5986m());
                this.f12581z = true;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized View m5985l(Map map) {
        if (map != null) {
            zzgwt zzgwtVar = f12557J;
            int i2 = ((zzgyo) zzgwtVar).f18357v;
            int i3 = 0;
            while (i3 < i2) {
                WeakReference weakReference = (WeakReference) map.get((String) ((zzgyo) zzgwtVar).get(i3));
                i3++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized ImageView.ScaleType m5986m() {
        zzdry zzdryVar = this.f12578w;
        if (zzdryVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper iObjectWrapperMo6026g = zzdryVar.mo6026g();
        if (iObjectWrapperMo6026g != null) {
            return (ImageView.ScaleType) ObjectWrapper.m3697u0(iObjectWrapperMo6026g);
        }
        return zzdra.f12698k;
    }

    /* JADX INFO: renamed from: n */
    public final void m5987n() {
        ListenableFuture listenableFuture;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8680o6)).booleanValue()) {
            m5979f("Google", true);
            return;
        }
        zzdqb zzdqbVar = this.f12568m;
        synchronized (zzdqbVar) {
            listenableFuture = zzdqbVar.f12622m;
        }
        if (listenableFuture == null) {
            return;
        }
        zzdpm zzdpmVar = new zzdpm(this);
        listenableFuture.addListener(new zzhcd(listenableFuture, zzdpmVar), this.f12567l);
    }

    /* JADX INFO: renamed from: o */
    public final void m5988o(View view, zzelv zzelvVar) {
        zzclb zzclbVarM6007j = this.f12568m.m6007j();
        if (!this.f12571p.mo6016c() || zzelvVar == null || zzclbVarM6007j == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.f3698C.f3724x.m6278e(zzelvVar.f14182a, view);
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m5989p() {
        this.f12579x = true;
        this.f12567l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpo
            @Override // java.lang.Runnable
            public final void run() {
                zzdpw zzdpwVar = this.f12542s;
                zzdpwVar.f12569n.mo5944C();
                zzdqb zzdqbVar = zzdpwVar.f12568m;
                synchronized (zzdqbVar) {
                    try {
                        zzclb zzclbVar = zzdqbVar.f12618i;
                        if (zzclbVar != null) {
                            zzclbVar.destroy();
                            zzdqbVar.f12618i = null;
                        }
                        zzclb zzclbVar2 = zzdqbVar.f12619j;
                        if (zzclbVar2 != null) {
                            zzclbVar2.destroy();
                            zzdqbVar.f12619j = null;
                        }
                        zzclb zzclbVar3 = zzdqbVar.f12620k;
                        if (zzclbVar3 != null) {
                            zzclbVar3.destroy();
                            zzdqbVar.f12620k = null;
                        }
                        ListenableFuture listenableFuture = zzdqbVar.f12622m;
                        if (listenableFuture != null) {
                            listenableFuture.cancel(false);
                            zzdqbVar.f12622m = null;
                        }
                        zzcgd zzcgdVar = zzdqbVar.f12623n;
                        if (zzcgdVar != null) {
                            zzcgdVar.cancel(false);
                            zzdqbVar.f12623n = null;
                        }
                        zzdqbVar.f12621l = null;
                        zzdqbVar.f12631v.clear();
                        zzdqbVar.f12632w.clear();
                        zzdqbVar.f12611b = null;
                        zzdqbVar.f12612c = null;
                        zzdqbVar.f12613d = null;
                        zzdqbVar.f12614e = null;
                        zzdqbVar.f12617h = null;
                        zzdqbVar.f12624o = null;
                        zzdqbVar.f12625p = null;
                        zzdqbVar.f12626q = null;
                        zzdqbVar.f12628s = null;
                        zzdqbVar.f12629t = null;
                        zzdqbVar.f12630u = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        zzddy zzddyVar = this.f11761c;
        zzddyVar.getClass();
        zzddyVar.m5923J0(new zzddw(null));
    }

    /* JADX INFO: renamed from: q */
    public final synchronized boolean m5990q(Bundle bundle) {
        if (this.f12580y) {
            return true;
        }
        boolean zMo5967s = this.f12569n.mo5967s(bundle);
        this.f12580y = zMo5967s;
        return zMo5967s;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m5991r(final zzdry zzdryVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8693p2)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f12543s.m5981h(zzdryVar);
                }
            });
        } else {
            m5981h(zzdryVar);
        }
    }

    /* JADX INFO: renamed from: s */
    public final synchronized void m5992s(final zzdry zzdryVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8693p2)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f12545s.m5982i(zzdryVar);
                }
            });
        } else {
            m5982i(zzdryVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[Catch: all -> 0x0059, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:10:0x0012, B:12:0x001a, B:15:0x0027, B:16:0x002c, B:18:0x003e, B:21:0x0047, B:23:0x004d), top: B:34:0x0001, inners: #0 }] */
    /* JADX INFO: renamed from: t */
    public final synchronized void m5993t(View view, View view2, Map map, Map map2, boolean z) {
        zzdqb zzdqbVar;
        zzclb zzclbVarM6005h;
        zzdro zzdroVar;
        zzdra zzdraVar = this.f12570o;
        zzdry zzdryVar = this.f12578w;
        if (zzdryVar == null || (zzdroVar = zzdraVar.f12703e) == null || zzdryVar.mo6023N3() == null || !zzdraVar.f12701c.mo6014a()) {
            this.f12569n.mo5955g(view, view2, map, map2, z, m5986m());
            if (this.f12558A) {
                zzdqbVar = this.f12568m;
                if (zzdqbVar.m6005h() != null && (zzclbVarM6005h = zzdqbVar.m6005h()) != null) {
                    zzclbVarM6005h.mo5129b("onSdkAdUserInteractionClick", new ArrayMap());
                    return;
                }
            }
            return;
        }
        try {
            zzdryVar.mo6023N3().addView(zzdroVar.m6040a());
        } catch (zzclq e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("web view can not be obtained", e);
        }
        this.f12569n.mo5955g(view, view2, map, map2, z, m5986m());
        if (this.f12558A) {
            zzdqbVar = this.f12568m;
            if (zzdqbVar.m6005h() != null) {
                zzclbVarM6005h.mo5129b("onSdkAdUserInteractionClick", new ArrayMap());
                return;
            }
        }
        return;
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006c A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX INFO: renamed from: u */
    public final synchronized void m5994u(View view, Map map, Map map2, boolean z) {
        Iterator it;
        View view2;
        if (this.f12580y) {
            m5984k(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8727r2)).booleanValue() && this.f11760b.f15937k0) {
            HashMap map3 = this.f12565H;
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                if (!((Boolean) map3.get((String) it2.next())).booleanValue()) {
                }
            }
            if (!z) {
                m5983j(view, map, map2);
                m5984k(view, map, map2);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8194L4)).booleanValue()) {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (view2 == null) {
                    }
                }
            }
        } else {
            if (!z) {
                m5983j(view, map, map2);
                m5984k(view, map, map2);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8194L4)).booleanValue() && map != null) {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (view2 == null && m5977d(view2)) {
                        m5983j(view, map, map2);
                        return;
                    }
                }
            }
        }
    }
}
