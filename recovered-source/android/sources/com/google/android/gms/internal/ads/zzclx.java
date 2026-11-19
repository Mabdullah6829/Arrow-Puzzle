package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzclx extends FrameLayout implements zzclb {

    /* JADX INFO: renamed from: s */
    public final zzclb f10483s;

    /* JADX INFO: renamed from: t */
    public final zzchj f10484t;

    /* JADX INFO: renamed from: u */
    public final AtomicBoolean f10485u;

    /* JADX WARN: Multi-variable type inference failed */
    public zzclx(zzclb zzclbVar, zzdzt zzdztVar) {
        super(((View) zzclbVar).getContext());
        this.f10485u = new AtomicBoolean();
        this.f10483s = zzclbVar;
        this.f10484t = new zzchj(((zzcme) zzclbVar).f10541s.f10587c, this, this, zzdztVar);
        addView((View) zzclbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: A */
    public final boolean mo5568A() {
        return this.f10483s.mo5568A();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: A0 */
    public final void mo5569A0(boolean z) {
        this.f10483s.mo5569A0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcks
    /* JADX INFO: renamed from: B */
    public final zzfkn mo5565B() {
        return this.f10483s.mo5565B();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: B0 */
    public final void mo5570B0(String str, Predicate predicate) {
        ((zzcme) this.f10483s).mo5570B0(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    /* JADX INFO: renamed from: C */
    public final void mo5626C() {
        zzclb zzclbVar = this.f10483s;
        if (zzclbVar != null) {
            zzclbVar.mo5626C();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: C0 */
    public final void mo5571C0() {
        ((zzcme) this.f10483s).f10544t0 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: D */
    public final void mo5572D() {
        this.f10483s.mo5572D();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: D0 */
    public final void mo5573D0() {
        this.f10483s.mo5573D0();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: E */
    public final void mo5574E() {
        this.f10483s.mo5574E();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: E0 */
    public final void mo5575E0(boolean z) {
        ((zzcme) this.f10483s).mo5575E0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: F */
    public final boolean mo5576F() {
        return ((zzcme) this.f10483s).mo5576F();
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    /* JADX INFO: renamed from: F0 */
    public final void mo5627F0() {
        zzclb zzclbVar = this.f10483s;
        if (zzclbVar != null) {
            zzclbVar.mo5627F0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    /* JADX INFO: renamed from: G */
    public final void mo5648G(boolean z, int i2, String str, boolean z2, boolean z3) {
        this.f10483s.mo5648G(z, i2, str, z2, z3);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m5649G0() {
        zzchj zzchjVar = this.f10484t;
        zzchjVar.getClass();
        Preconditions.m3540d("onDestroy must be called from the UI thread.");
        zzchi zzchiVar = zzchjVar.f10037e;
        if (zzchiVar != null) {
            zzchiVar.f10029w.m5484a();
            zzcha zzchaVar = zzchiVar.f10031y;
            if (zzchaVar != null) {
                zzchaVar.mo5412l();
            }
            zzchiVar.m5435d();
            zzchjVar.f10035c.removeView(zzchjVar.f10037e);
            zzchjVar.f10037e = null;
        }
        ((zzcme) this.f10483s).m5657J0();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmw
    /* JADX INFO: renamed from: H */
    public final View mo5577H() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: H0 */
    public final void mo5578H0(boolean z) {
        this.f10483s.mo5578H0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: I */
    public final void mo5579I() {
        this.f10483s.mo5579I();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: I0 */
    public final void mo5580I0(zzbly zzblyVar) {
        ((zzcme) this.f10483s).mo5580I0(zzblyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: J */
    public final Context mo5581J() {
        return this.f10483s.mo5581J();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: K */
    public final zzclm mo5582K() {
        return ((zzcme) this.f10483s).f10505F;
    }

    @Override // com.google.android.gms.ads.internal.zzn
    /* JADX INFO: renamed from: L */
    public final void mo3269L() {
        this.f10483s.mo3269L();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: M */
    public final String mo5583M() {
        return this.f10483s.mo5583M();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: N */
    public final zzflk mo5584N() {
        return this.f10483s.mo5584N();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: O */
    public final com.google.android.gms.ads.internal.overlay.zzm mo5585O() {
        return this.f10483s.mo5585O();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: P */
    public final zzelv mo5586P() {
        return this.f10483s.mo5586P();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmi
    /* JADX INFO: renamed from: Q */
    public final zzfkq mo5587Q() {
        return this.f10483s.mo5587Q();
    }

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
    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: R */
    public final void mo5588R() {
        zzelv zzelvVarMo5586P;
        zzelt zzeltVarMo5607o;
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        com.google.android.gms.ads.internal.util.zzs zzsVar = zztVar.f3703c;
        com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
        Resources resourcesM5383c = zztVar.f3708h.m5383c();
        textView.setText(resourcesM5383c != null ? resourcesM5383c.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        zzbio zzbioVar = zzbix.f8612k6;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        boolean zBooleanValue = ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue();
        zzclb zzclbVar = this.f10483s;
        if (zBooleanValue && (zzeltVarMo5607o = ((zzcme) zzclbVar).mo5607o()) != null) {
            zzeltVarMo5607o.m6282d(textView);
        } else if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8595j6)).booleanValue() && (zzelvVarMo5586P = ((zzcme) zzclbVar).mo5586P()) != null && zzelvVarMo5586P.f14183b.f16608g == zzfux.HTML) {
            zztVar.f3724x.m6277d(zzelvVarMo5586P.f14182a, textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: S */
    public final com.google.android.gms.ads.internal.overlay.zzm mo5589S() {
        return this.f10483s.mo5589S();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: T */
    public final boolean mo5590T() {
        return this.f10483s.mo5590T();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: U */
    public final zzchj mo5467U() {
        return this.f10484t;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: V */
    public final void mo5591V() {
        setBackgroundColor(0);
        this.f10483s.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: W */
    public final boolean mo5592W() {
        return this.f10483s.mo5592W();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: X */
    public final void mo5468X(int i2) {
        zzchi zzchiVar = this.f10484t.f10037e;
        if (zzchiVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8691p0)).booleanValue()) {
                zzchiVar.f10026t.setBackgroundColor(i2);
                zzchiVar.f10027u.setBackgroundColor(i2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: Y */
    public final void mo5469Y() {
        ((zzcme) this.f10483s).mo5469Y();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: Z */
    public final zzbly mo5593Z() {
        return this.f10483s.mo5593Z();
    }

    @Override // com.google.android.gms.internal.ads.zzbst
    /* JADX INFO: renamed from: a */
    public final void mo5128a(JSONObject jSONObject, String str) {
        ((zzcme) this.f10483s).mo5128a(jSONObject, str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: a0 */
    public final void mo5594a0(zzduh zzduhVar) {
        ((zzcme) this.f10483s).mo5594a0(zzduhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbst
    /* JADX INFO: renamed from: b */
    public final void mo5129b(String str, Map map) {
        ((zzcme) this.f10483s).mo5129b(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: b0 */
    public final void mo5595b0(zzelt zzeltVar) {
        this.f10483s.mo5595b0(zzeltVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    /* JADX INFO: renamed from: c */
    public final void mo5650c(boolean z, int i2, String str, String str2, boolean z2) {
        this.f10483s.mo5650c(z, i2, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: c0 */
    public final void mo5596c0(int i2) {
        this.f10483s.mo5596c0(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final boolean canGoBack() {
        return this.f10483s.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    /* JADX INFO: renamed from: d */
    public final void mo5130d(String str, String str2) {
        ((zzcme) this.f10483s).mo5130d("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: d0 */
    public final void mo5597d0(zzbgk zzbgkVar) {
        this.f10483s.mo5597d0(zzbgkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void destroy() {
        final zzelt zzeltVarMo5607o;
        final zzcme zzcmeVar = (zzcme) this.f10483s;
        final zzelv zzelvVarMo5586P = zzcmeVar.mo5586P();
        if (zzelvVarMo5586P != null) {
            com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
            zzfVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclw
                @Override // java.lang.Runnable
                public final void run() {
                    zzelp zzelpVar = com.google.android.gms.ads.internal.zzt.f3698C.f3724x;
                    final zzfuy zzfuyVar = zzelvVarMo5586P.f14182a;
                    zzelpVar.getClass();
                    zzelp.m6273j(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelh
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8562h6)).booleanValue() && zzfus.f16595a.f16596a) {
                                zzfuyVar.mo6722b();
                            }
                        }
                    });
                }
            });
            zzfVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcmeVar.destroy();
                }
            }, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8579i6)).intValue());
        } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8612k6)).booleanValue() || (zzeltVarMo5607o = zzcmeVar.mo5607o()) == null) {
            zzcmeVar.destroy();
        } else {
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclu
                @Override // java.lang.Runnable
                public final void run() {
                    zzclb zzclbVar;
                    final zzclv zzclvVar = new zzclv(this.f10479s);
                    zzelt zzeltVar = zzeltVarMo5607o;
                    synchronized (zzeltVar) {
                        final zzfvg zzfvgVar = zzeltVar.f14176f;
                        if (zzfvgVar == null || (zzclbVar = zzeltVar.f14174d) == null) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzt.f3698C.f3724x.getClass();
                        zzelp.m6273j(new Runnable() { // from class: com.google.android.gms.internal.ads.zzell
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzfvg zzfvgVar2 = zzfvgVar;
                                Iterator it = zzfvgVar2.f16646d.values().iterator();
                                while (it.hasNext()) {
                                    ((zzfuu) it.next()).mo6722b();
                                }
                                Timer timer = new Timer();
                                timer.schedule(new zzfvd(zzfvgVar2, zzclvVar, timer), 1000L);
                            }
                        });
                        zzeltVar.f14176f = null;
                        zzclbVar.mo5595b0(null);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: e */
    public final String mo5470e() {
        return this.f10483s.mo5470e();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: e0 */
    public final void mo5598e0() {
        ((zzcme) this.f10483s).mo5598e0();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: f */
    public final zzbjk mo5599f() {
        return this.f10483s.mo5599f();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: f0 */
    public final zzbgk mo5600f0() {
        return this.f10483s.mo5600f0();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: g */
    public final String mo5471g() {
        return this.f10483s.mo5471g();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: g0 */
    public final void mo5601g0(zzelv zzelvVar) {
        this.f10483s.mo5601g0(zzelvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void goBack() {
        this.f10483s.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmv, com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: h */
    public final VersionInfoParcel mo5472h() {
        return this.f10483s.mo5472h();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: h0 */
    public final void mo5602h0(zzcnl zzcnlVar) {
        this.f10483s.mo5602h0(zzcnlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: i */
    public final int mo5473i() {
        return this.f10483s.mo5473i();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: i0 */
    public final ListenableFuture mo5603i0() {
        return this.f10483s.mo5603i0();
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    /* JADX INFO: renamed from: j */
    public final void mo5131j(JSONObject jSONObject, String str) {
        ((zzcme) this.f10483s).mo5130d(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: j0 */
    public final void mo5604j0(boolean z) {
        this.f10483s.mo5604j0(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public final void mo2730k() {
        zzclb zzclbVar = this.f10483s;
        if (zzclbVar != null) {
            ((zzcme) zzclbVar).mo2730k();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: k0 */
    public final void mo5605k0(int i2, boolean z) {
        this.f10483s.mo5605k0(i2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: l */
    public final int mo5474l() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8177K4)).booleanValue() ? this.f10483s.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: l0 */
    public final void mo5475l0(boolean z, long j2) {
        this.f10483s.mo5475l0(z, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void loadData(String str, String str2, String str3) {
        this.f10483s.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f10483s.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void loadUrl(String str) {
        this.f10483s.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    /* JADX INFO: renamed from: m */
    public final void mo5651m(String str, String str2) {
        ((zzcme) this.f10483s).mo5651m(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: m0 */
    public final void mo5606m0(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.f10483s.mo5606m0(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: n0 */
    public final void mo5476n0(zzcmh zzcmhVar) {
        ((zzcme) this.f10483s).mo5476n0(zzcmhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: o */
    public final zzelt mo5607o() {
        return this.f10483s.mo5607o();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: o0 */
    public final void mo5608o0(String str, String str2) {
        ((zzcme) this.f10483s).mo5608o0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void onPause() {
        zzcha zzchaVar;
        zzchj zzchjVar = this.f10484t;
        zzchjVar.getClass();
        Preconditions.m3540d("onPause must be called from the UI thread.");
        zzchi zzchiVar = zzchjVar.f10037e;
        if (zzchiVar != null && (zzchaVar = zzchiVar.f10031y) != null) {
            zzchaVar.mo5414n();
        }
        ((zzcme) this.f10483s).onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void onResume() {
        this.f10483s.onResume();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmt
    /* JADX INFO: renamed from: p */
    public final zzcnl mo5609p() {
        return this.f10483s.mo5609p();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: p0 */
    public final void mo5610p0(Context context) {
        this.f10483s.mo5610p0(context);
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmu
    /* JADX INFO: renamed from: q */
    public final zzbaw mo5611q() {
        return this.f10483s.mo5611q();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: q0 */
    public final void mo5612q0(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        ((zzcme) this.f10483s).mo5612q0(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: r0 */
    public final void mo5613r0(String str, zzbpx zzbpxVar) {
        this.f10483s.mo5613r0(str, zzbpxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: s */
    public final int mo5477s() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8177K4)).booleanValue() ? this.f10483s.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: s0 */
    public final boolean mo5614s0() {
        return ((zzcme) this.f10483s).mo5614s0();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzclb
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10483s.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzclb
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f10483s.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f10483s.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f10483s.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    /* JADX INFO: renamed from: t */
    public final void mo4826t(zzbew zzbewVar) {
        ((zzcme) this.f10483s).mo4826t(zzbewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: t0 */
    public final void mo5615t0(boolean z) {
        ((zzcme) this.f10483s).mo5615t0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: u */
    public final void mo5478u(String str, zzcjh zzcjhVar) {
        ((zzcme) this.f10483s).mo5478u(str, zzcjhVar);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    /* JADX INFO: renamed from: u0 */
    public final void mo3270u0() {
        this.f10483s.mo3270u0();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    /* JADX INFO: renamed from: v */
    public final void mo5479v(int i2) {
        this.f10483s.mo5479v(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: v0 */
    public final void mo5616v0(String str, zzbpx zzbpxVar) {
        ((zzcme) this.f10483s).mo5616v0(str, zzbpxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: w */
    public final ArrayList mo5617w() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != this.f10483s) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: w0 */
    public final void mo5618w0(zzfkn zzfknVar, zzfkq zzfkqVar) {
        zzcme zzcmeVar = (zzcme) this.f10483s;
        zzcmeVar.f10501B = zzfknVar;
        zzcmeVar.f10502C = zzfkqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    /* JADX INFO: renamed from: x */
    public final void mo5652x(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        ((zzcme) this.f10483s).mo5652x(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: x0 */
    public final void mo5619x0(int i2) {
        this.f10483s.mo5619x0(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: y */
    public final WebView mo5620y() {
        return (WebView) this.f10483s;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: y0 */
    public final boolean mo5621y0() {
        return this.f10485u.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    /* JADX INFO: renamed from: z */
    public final void mo5653z(boolean z, int i2, boolean z2) {
        this.f10483s.mo5653z(z, i2, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // com.google.android.gms.internal.ads.zzclb
    /* JADX INFO: renamed from: z0 */
    public final boolean mo5622z0(int i2, boolean z) {
        if (!this.f10485u.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8760t1)).booleanValue()) {
            return false;
        }
        zzclb zzclbVar = this.f10483s;
        if (zzclbVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzclbVar.getParent()).removeView((View) zzclbVar);
        }
        zzclbVar.mo5622z0(i2, z);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zza(String str) {
        ((zzcme) this.f10483s).m5659L0(str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final zzcmh zzh() {
        return this.f10483s.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final zzbjj zzi() {
        return this.f10483s.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final Activity zzj() {
        return this.f10483s.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.f10483s.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzl() {
        this.f10483s.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final zzcjh zzr(String str) {
        return this.f10483s.zzr(str);
    }
}
