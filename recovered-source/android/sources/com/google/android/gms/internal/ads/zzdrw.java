package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdrw {

    /* JADX INFO: renamed from: a */
    public final zzdwq f12763a;

    /* JADX INFO: renamed from: b */
    public final zzdvf f12764b;

    /* JADX INFO: renamed from: c */
    public ViewTreeObserver.OnScrollChangedListener f12765c = null;

    public zzdrw(zzdwq zzdwqVar, zzdvf zzdvfVar) {
        this.f12763a = zzdwqVar;
        this.f12764b = zzdvfVar;
    }

    /* JADX INFO: renamed from: b */
    public static final int m6041b(Context context, int i2, String str) {
        try {
            i2 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
        return com.google.android.gms.ads.internal.util.client.zzf.m3033b(context, i2);
    }

    /* JADX INFO: renamed from: a */
    public final View m6042a(final FrameLayout frameLayout, final WindowManager windowManager) throws zzclq {
        zzclb zzclbVarM6077a = this.f12763a.m6077a(com.google.android.gms.ads.internal.client.zzr.m2981w(), null, null);
        zzclbVarM6077a.mo5577H().setVisibility(4);
        zzclbVarM6077a.mo5577H().setContentDescription("policy_validator");
        zzclbVarM6077a.mo5616v0("/sendMessageToSdk", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrv
            @Override // com.google.android.gms.internal.ads.zzbpx
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo5095a(Object obj, Map map) {
                this.f12762a.f12764b.m6071d(map);
            }
        });
        zzclbVarM6077a.mo5616v0("/hideValidatorOverlay", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrq
            @Override // com.google.android.gms.internal.ads.zzbpx
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo5095a(Object obj, Map map) {
                zzclb zzclbVar = (zzclb) obj;
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Hide native ad policy validator overlay.");
                zzclbVar.mo5577H().setVisibility(8);
                if (zzclbVar.mo5577H().getWindowToken() != null) {
                    windowManager.removeView(zzclbVar.mo5577H());
                }
                zzclbVar.destroy();
                ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
                zzdrw zzdrwVar = this;
                if (zzdrwVar.f12765c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                    return;
                }
                viewTreeObserver.removeOnScrollChangedListener(zzdrwVar.f12765c);
            }
        });
        zzclbVarM6077a.mo5616v0("/open", new zzbqk(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zzclbVarM6077a);
        zzbpx zzbpxVar = new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrr
            @Override // com.google.android.gms.internal.ads.zzbpx
            /* JADX INFO: renamed from: a */
            public final void mo5095a(Object obj, final Map map) {
                final zzclb zzclbVar = (zzclb) obj;
                zzclm zzclmVarMo5582K = zzclbVar.mo5582K();
                final zzdrw zzdrwVar = this;
                zzclmVarMo5582K.f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdru
                    @Override // com.google.android.gms.internal.ads.zzcmx
                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ void mo3001a(int i2, String str, String str2, boolean z) {
                        HashMap map2 = new HashMap();
                        map2.put("messageType", "validatorHtmlLoaded");
                        map2.put("id", (String) map.get("id"));
                        zzdrwVar.f12764b.m6071d(map2);
                    }
                };
                if (map == null) {
                    return;
                }
                final View view = frameLayout;
                Context context = view.getContext();
                String str = (String) map.get("validator_width");
                zzbio zzbioVar = zzbix.f8632l9;
                zzbiv zzbivVar = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
                int iM6041b = zzdrw.m6041b(context, ((Integer) zzbivVar.m5030a(zzbioVar)).intValue(), str);
                int iM6041b2 = zzdrw.m6041b(context, ((Integer) zzbivVar.m5030a(zzbix.f8649m9)).intValue(), (String) map.get("validator_height"));
                int iM6041b3 = zzdrw.m6041b(context, 0, (String) map.get("validator_x"));
                int iM6041b4 = zzdrw.m6041b(context, 0, (String) map.get("validator_y"));
                zzclbVar.mo5602h0(new zzcnl(1, iM6041b, iM6041b2));
                try {
                    zzclbVar.mo5620y().getSettings().setUseWideViewPort(((Boolean) zzbivVar.m5030a(zzbix.f8666n9)).booleanValue());
                    zzclbVar.mo5620y().getSettings().setLoadWithOverviewMode(((Boolean) zzbivVar.m5030a(zzbix.f8683o9)).booleanValue());
                } catch (NullPointerException unused) {
                }
                final WindowManager.LayoutParams layoutParamsM3137i = com.google.android.gms.ads.internal.util.zzbs.m3137i();
                layoutParamsM3137i.x = iM6041b3;
                layoutParamsM3137i.y = iM6041b4;
                View viewMo5577H = zzclbVar.mo5577H();
                final WindowManager windowManager2 = windowManager;
                windowManager2.updateViewLayout(viewMo5577H, layoutParamsM3137i);
                final String str2 = (String) map.get("orientation");
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    final int i2 = (("1".equals(str2) || "2".equals(str2)) ? rect.bottom : rect.top) - iM6041b4;
                    zzdrwVar.f12765c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdrt
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final /* synthetic */ void onScrollChanged() {
                            Rect rect2 = new Rect();
                            if (view.getGlobalVisibleRect(rect2)) {
                                zzclb zzclbVar2 = zzclbVar;
                                if (zzclbVar2.mo5577H().getWindowToken() == null) {
                                    return;
                                }
                                String str3 = str2;
                                boolean zEquals = "1".equals(str3);
                                int i3 = i2;
                                WindowManager.LayoutParams layoutParams = layoutParamsM3137i;
                                if (zEquals || "2".equals(str3)) {
                                    layoutParams.y = rect2.bottom - i3;
                                } else {
                                    layoutParams.y = rect2.top - i3;
                                }
                                windowManager2.updateViewLayout(zzclbVar2.mo5577H(), layoutParams);
                            }
                        }
                    };
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnScrollChangedListener(zzdrwVar.f12765c);
                    }
                }
                String str3 = (String) map.get("overlay_url");
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                zzclbVar.loadUrl(str3);
            }
        };
        zzdvf zzdvfVar = this.f12764b;
        zzdvfVar.m6069b("/loadNativeAdPolicyViolations", new zzdve(zzdvfVar, weakReference, "/loadNativeAdPolicyViolations", zzbpxVar));
        zzdvfVar.m6069b("/showValidatorOverlay", new zzdve(zzdvfVar, new WeakReference(zzclbVarM6077a), "/showValidatorOverlay", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrs
            @Override // com.google.android.gms.internal.ads.zzbpx
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo5095a(Object obj, Map map) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Show native ad policy validator overlay.");
                ((zzclb) obj).mo5577H().setVisibility(0);
            }
        }));
        return zzclbVarM6077a.mo5577H();
    }
}
