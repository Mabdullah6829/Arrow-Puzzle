package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.collection.ArraySet;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyh extends zzbyn {

    /* JADX INFO: renamed from: c */
    public String f9513c;

    /* JADX INFO: renamed from: d */
    public boolean f9514d;

    /* JADX INFO: renamed from: e */
    public int f9515e;

    /* JADX INFO: renamed from: f */
    public int f9516f;

    /* JADX INFO: renamed from: g */
    public int f9517g;

    /* JADX INFO: renamed from: h */
    public int f9518h;

    /* JADX INFO: renamed from: i */
    public int f9519i;

    /* JADX INFO: renamed from: j */
    public int f9520j;

    /* JADX INFO: renamed from: k */
    public final Object f9521k;

    /* JADX INFO: renamed from: l */
    public final zzclb f9522l;

    /* JADX INFO: renamed from: m */
    public final Activity f9523m;

    /* JADX INFO: renamed from: n */
    public zzcnl f9524n;

    /* JADX INFO: renamed from: o */
    public ImageView f9525o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f9526p;

    /* JADX INFO: renamed from: q */
    public final zzbyo f9527q;

    /* JADX INFO: renamed from: r */
    public PopupWindow f9528r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f9529s;

    /* JADX INFO: renamed from: t */
    public ViewGroup f9530t;

    static {
        ArraySet arraySet = new ArraySet(7);
        Collections.addAll(arraySet, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(arraySet);
    }

    public zzbyh(zzclx zzclxVar, zzbyo zzbyoVar) {
        super(zzclxVar, "resize");
        this.f9513c = "top-right";
        this.f9514d = true;
        this.f9515e = 0;
        this.f9516f = 0;
        this.f9517g = -1;
        this.f9518h = 0;
        this.f9519i = 0;
        this.f9520j = -1;
        this.f9521k = new Object();
        this.f9522l = zzclxVar;
        this.f9523m = ((zzcme) zzclxVar.f10483s).zzj();
        this.f9527q = zzbyoVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m5259f(final boolean z) {
        synchronized (this.f9521k) {
            try {
                if (this.f9528r != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8601jc)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        m5260g(z);
                    } else {
                        ((zzhbb) zzcfy.f9951f).submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbyg
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.f9511s.m5260g(z);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m5260g(boolean z) {
        zzbio zzbioVar = zzbix.f8618kc;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        boolean zBooleanValue = ((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue();
        zzclb zzclbVar = this.f9522l;
        if (zBooleanValue) {
            this.f9529s.removeView((View) zzclbVar);
            this.f9528r.dismiss();
        } else {
            this.f9528r.dismiss();
            this.f9529s.removeView((View) zzclbVar);
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8635lc)).booleanValue()) {
            View view = (View) zzclbVar;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.f9530t;
        if (viewGroup != null) {
            viewGroup.removeView(this.f9525o);
            if (((Boolean) zzbivVar2.m5030a(zzbix.f8652mc)).booleanValue()) {
                try {
                    this.f9530t.addView((View) zzclbVar);
                    zzclbVar.mo5602h0(this.f9524n);
                } catch (IllegalStateException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to add webview back to view hierarchy.", e);
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("MraidCallResizeHandler.collapseInternal", e);
                }
            } else {
                this.f9530t.addView((View) zzclbVar);
                zzclbVar.mo5602h0(this.f9524n);
            }
        }
        if (z) {
            m5264d("default");
            zzbyo zzbyoVar = this.f9527q;
            if (zzbyoVar != null) {
                zzbyoVar.zzb();
            }
        }
        this.f9528r = null;
        this.f9529s = null;
        this.f9530t = null;
        this.f9526p = null;
    }
}
