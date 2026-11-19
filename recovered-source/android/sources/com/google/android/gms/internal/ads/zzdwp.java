package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdwp {

    /* JADX INFO: renamed from: a */
    public final zzdcx f13167a;

    /* JADX INFO: renamed from: b */
    public final zzdle f13168b;

    /* JADX INFO: renamed from: c */
    public final zzdeg f13169c;

    /* JADX INFO: renamed from: d */
    public final zzdet f13170d;

    /* JADX INFO: renamed from: e */
    public final zzdfk f13171e;

    /* JADX INFO: renamed from: f */
    public final zzdid f13172f;

    /* JADX INFO: renamed from: g */
    public final Executor f13173g;

    /* JADX INFO: renamed from: h */
    public final zzdla f13174h;

    /* JADX INFO: renamed from: i */
    public final zzcun f13175i;

    /* JADX INFO: renamed from: j */
    public final com.google.android.gms.ads.internal.zzb f13176j;

    /* JADX INFO: renamed from: k */
    public final zzcdu f13177k;

    /* JADX INFO: renamed from: l */
    public final zzbaw f13178l;

    /* JADX INFO: renamed from: m */
    public final zzdhu f13179m;

    /* JADX INFO: renamed from: n */
    public final zzeko f13180n;

    /* JADX INFO: renamed from: o */
    public final zzfsm f13181o;

    /* JADX INFO: renamed from: p */
    public final zzdzt f13182p;

    /* JADX INFO: renamed from: q */
    public final zzctq f13183q;

    /* JADX INFO: renamed from: r */
    public final zzdwv f13184r;

    /* JADX INFO: renamed from: s */
    public final zzeaw f13185s;

    /* JADX INFO: renamed from: t */
    public final zzdca f13186t;

    /* JADX INFO: renamed from: u */
    public final zzdbv f13187u;

    public zzdwp(zzdcx zzdcxVar, zzdeg zzdegVar, zzdet zzdetVar, zzdfk zzdfkVar, zzdid zzdidVar, Executor executor, zzdla zzdlaVar, zzcun zzcunVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdu zzcduVar, zzbaw zzbawVar, zzdhu zzdhuVar, zzeko zzekoVar, zzfsm zzfsmVar, zzdzt zzdztVar, zzdle zzdleVar, zzctq zzctqVar, zzdwv zzdwvVar, zzeaw zzeawVar, zzdca zzdcaVar, zzdbv zzdbvVar) {
        this.f13167a = zzdcxVar;
        this.f13169c = zzdegVar;
        this.f13170d = zzdetVar;
        this.f13171e = zzdfkVar;
        this.f13172f = zzdidVar;
        this.f13173g = executor;
        this.f13174h = zzdlaVar;
        this.f13175i = zzcunVar;
        this.f13176j = zzbVar;
        this.f13177k = zzcduVar;
        this.f13178l = zzbawVar;
        this.f13179m = zzdhuVar;
        this.f13180n = zzekoVar;
        this.f13181o = zzfsmVar;
        this.f13182p = zzdztVar;
        this.f13168b = zzdleVar;
        this.f13183q = zzctqVar;
        this.f13184r = zzdwvVar;
        this.f13185s = zzeawVar;
        this.f13186t = zzdcaVar;
        this.f13187u = zzdbvVar;
    }

    /* JADX INFO: renamed from: b */
    public static final zzcgd m6075b(zzclb zzclbVar, String str, String str2, final zzdzo zzdzoVar, zzfqq zzfqqVar) {
        zzbio zzbioVar = zzbix.f8209M2;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-webview-load-html-start");
        }
        final zzcgd zzcgdVar = new zzcgd();
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8532fa)).booleanValue()) {
            zzfqg zzfqgVarM6562l = zzfqg.m6562l(zzclbVar.getContext(), 112);
            zzfqgVarM6562l.zza();
            zzfqp.m6577c(zzcgdVar, zzfqqVar, zzfqgVarM6562l, false);
        }
        zzclbVar.mo5582K().f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdwn
            @Override // com.google.android.gms.internal.ads.zzcmx
            /* JADX INFO: renamed from: a */
            public final void mo3001a(int i2, String str3, String str4, boolean z) {
                zzcgd zzcgdVar2 = zzcgdVar;
                if (z) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8209M2)).booleanValue()) {
                        AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-webview-load-html-end");
                    }
                    zzcgdVar2.m5397a(null);
                    return;
                }
                int length = String.valueOf(i2).length();
                StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Ad Web View failed to load. Error code: ");
                sb.append(i2);
                sb.append(", Description: ");
                sb.append(str3);
                zzcgdVar2.m5398b(new Exception(AbstractC0271e0.m403k(sb, ", Failing URL: ", str4)));
            }
        };
        zzclbVar.mo5608o0(str, str2);
        return zzcgdVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6076a(final zzclb zzclbVar, boolean z, zzbqa zzbqaVar, zzdzo zzdzoVar) {
        zzbar zzbarVar;
        zzbio zzbioVar = zzbix.f8209M2;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-configure-webview-start");
        }
        zzclbVar.mo5582K().m5640l(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdwo
            @Override // com.google.android.gms.ads.internal.client.zza
            /* JADX INFO: renamed from: k */
            public final /* synthetic */ void mo2730k() {
                this.f13166s.f13167a.mo2730k();
            }
        }, this.f13170d, this.f13171e, new zzbop() { // from class: com.google.android.gms.internal.ads.zzdwh
            @Override // com.google.android.gms.internal.ads.zzbop
            /* JADX INFO: renamed from: n0 */
            public final /* synthetic */ void mo5097n0(String str, String str2) {
                this.f13157s.f13172f.mo5097n0(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdwi
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                this.f13158s.f13169c.m5907K0();
            }
        }, z, zzbqaVar, this.f13176j, new zzdwg(this), this.f13177k, this.f13180n, this.f13181o, this.f13182p, null, this.f13168b, null, null, null, this.f13183q, this.f13185s, this.f13186t, this.f13187u);
        zzclbVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdwj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdwp zzdwpVar = this.f13159s;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8804vb)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    zzdwpVar.f13184r.f13232a = motionEvent;
                }
                zzdwpVar.f13176j.f3642b = true;
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            }
        });
        zzclbVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdwk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13160s.f13176j.f3642b = true;
            }
        });
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8796v3)).booleanValue() && (zzbarVar = this.f13178l.f7501b) != null) {
            zzbarVar.mo3260g(zzclbVar.mo5577H());
        }
        zzdla zzdlaVar = this.f13174h;
        Executor executor = this.f13173g;
        zzdlaVar.m5924Y(zzclbVar, executor);
        zzdlaVar.m5924Y(new zzbex() { // from class: com.google.android.gms.internal.ads.zzdwl
            @Override // com.google.android.gms.internal.ads.zzbex
            /* JADX INFO: renamed from: t */
            public final /* synthetic */ void mo4826t(zzbew zzbewVar) {
                Rect rect = zzbewVar.f7701d;
                zzclbVar.mo5582K().m5639j(rect.left, rect.top);
            }
        }, executor);
        zzdlaVar.m5935K0(zzclbVar.mo5577H());
        zzclbVar.mo5616v0("/trackActiveViewUnit", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdwm
            @Override // com.google.android.gms.internal.ads.zzbpx
            /* JADX INFO: renamed from: a */
            public final void mo5095a(Object obj, Map map) {
                zzdwp zzdwpVar = this.f13162a;
                zzclb zzclbVar2 = zzclbVar;
                zzcun zzcunVar = zzdwpVar.f13175i;
                synchronized (zzcunVar) {
                    zzcunVar.f11498u.add(zzclbVar2);
                    zzcui zzcuiVar = zzcunVar.f11496s;
                    zzclbVar2.mo5616v0("/updateActiveView", zzcuiVar.f11480e);
                    zzclbVar2.mo5616v0("/untrackActiveViewUnit", zzcuiVar.f11481f);
                }
            }
        });
        zzcun zzcunVar = this.f13175i;
        zzcunVar.getClass();
        zzcunVar.f11495B = new WeakReference(zzclbVar);
        if (((Boolean) zzbivVar2.m5030a(zzbioVar)).booleanValue()) {
            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-configure-webview-end");
        }
    }
}
