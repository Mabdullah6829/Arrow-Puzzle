package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzduh extends zzbsk implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzblv {

    /* JADX INFO: renamed from: s */
    public View f12983s;

    /* JADX INFO: renamed from: t */
    public com.google.android.gms.ads.internal.client.zzea f12984t;

    /* JADX INFO: renamed from: u */
    public zzdpw f12985u;

    /* JADX INFO: renamed from: v */
    public boolean f12986v;

    /* JADX INFO: renamed from: w */
    public boolean f12987w;

    /* JADX INFO: renamed from: k4 */
    public final void m6062k4(IObjectWrapper iObjectWrapper, zzbso zzbsoVar) {
        ViewTreeObserver viewTreeObserver;
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        if (this.f12986v) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Instream ad can not be shown after destroy().");
            try {
                zzbsoVar.mo5123o(2);
                return;
            } catch (RemoteException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
                return;
            }
        }
        View view = this.f12983s;
        if (view == null || this.f12984t == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Instream internal error: ".concat(str));
            try {
                zzbsoVar.mo5123o(0);
                return;
            } catch (RemoteException e2) {
                int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e2);
                return;
            }
        }
        if (this.f12987w) {
            int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Instream ad should not be used again.");
            try {
                zzbsoVar.mo5123o(1);
                return;
            } catch (RemoteException e3) {
                int i7 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e3);
                return;
            }
        }
        this.f12987w = true;
        m6063l4();
        ((ViewGroup) ObjectWrapper.m3697u0(iObjectWrapper)).addView(this.f12983s, new ViewGroup.LayoutParams(-1, -1));
        zzcgl zzcglVar = com.google.android.gms.ads.internal.zzt.f3698C.f3700B;
        zzcgl.m5402a(this.f12983s, this);
        zzcgn zzcgnVar = new zzcgn(this.f12983s, this);
        View view2 = (View) zzcgnVar.f9967s.get();
        ViewTreeObserver viewTreeObserver2 = null;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            zzcgnVar.m5403a(viewTreeObserver2);
        }
        m6064m4();
        try {
            zzbsoVar.mo5122a();
        } catch (RemoteException e4) {
            int i8 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e4);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final void m6063l4() {
        View view = this.f12983s;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f12983s);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final void m6064m4() {
        View view;
        zzdpw zzdpwVar = this.f12985u;
        if (zzdpwVar == null || (view = this.f12983s) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        zzdpwVar.m5994u(view, map, map, zzdpw.m5977d(view));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m6064m4();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m6064m4();
    }
}
