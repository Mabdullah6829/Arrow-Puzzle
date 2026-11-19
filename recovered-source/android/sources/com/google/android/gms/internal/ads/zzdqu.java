package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdqu extends zzbmt implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdry {

    /* JADX INFO: renamed from: s */
    public final WeakReference f12667s;

    /* JADX INFO: renamed from: t */
    public final HashMap f12668t = new HashMap();

    /* JADX INFO: renamed from: u */
    public final HashMap f12669u = new HashMap();

    /* JADX INFO: renamed from: v */
    public final HashMap f12670v = new HashMap();

    /* JADX INFO: renamed from: w */
    public zzdpw f12671w;

    /* JADX INFO: renamed from: x */
    public final zzbez f12672x;

    public zzdqu(View view, HashMap map, HashMap map2) {
        ViewTreeObserver viewTreeObserver;
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzcgl zzcglVar = com.google.android.gms.ads.internal.zzt.f3698C.f3700B;
        zzcgl.m5402a(view, this);
        zzcgn zzcgnVar = new zzcgn(view, this);
        View view2 = (View) zzcgnVar.f9967s.get();
        ViewTreeObserver viewTreeObserver2 = null;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            zzcgnVar.m5403a(viewTreeObserver2);
        }
        this.f12667s = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view3 = (View) entry.getValue();
            if (view3 != null) {
                this.f12668t.put(str, new WeakReference(view3));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view3.setOnTouchListener(this);
                    view3.setClickable(true);
                    view3.setOnClickListener(this);
                }
            }
        }
        this.f12670v.putAll(this.f12668t);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view4 = (View) entry2.getValue();
            if (view4 != null) {
                this.f12669u.put((String) entry2.getKey(), new WeakReference(view4));
                view4.setOnTouchListener(this);
                view4.setClickable(false);
            }
        }
        this.f12670v.putAll(this.f12669u);
        this.f12672x = new zzbez(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: D0 */
    public final View mo6021D0() {
        return (View) this.f12667s.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: I0 */
    public final synchronized View mo6022I0(String str) {
        WeakReference weakReference = (WeakReference) this.f12670v.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: N3 */
    public final FrameLayout mo6023N3() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: c */
    public final zzbez mo6024c() {
        return this.f12672x;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: e */
    public final synchronized String mo6025e() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: g */
    public final synchronized IObjectWrapper mo6026g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: i */
    public final synchronized JSONObject mo6027i() {
        JSONObject jSONObjectMo5957i;
        zzdpw zzdpwVar = this.f12671w;
        if (zzdpwVar == null) {
            return null;
        }
        View viewMo6021D0 = mo6021D0();
        Map mapZzi = zzi();
        Map mapZzj = zzj();
        synchronized (zzdpwVar) {
            jSONObjectMo5957i = zzdpwVar.f12569n.mo5957i(viewMo6021D0, mapZzi, mapZzj, zzdpwVar.m5986m());
        }
        return jSONObjectMo5957i;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: j */
    public final synchronized JSONObject mo6028j() {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdpw zzdpwVar = this.f12671w;
        if (zzdpwVar != null) {
            zzdpwVar.m5993t(view, mo6021D0(), zzi(), zzj(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdpw zzdpwVar = this.f12671w;
        if (zzdpwVar != null) {
            zzdpwVar.m5994u(mo6021D0(), zzi(), zzj(), zzdpw.m5977d(mo6021D0()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdpw zzdpwVar = this.f12671w;
        if (zzdpwVar != null) {
            zzdpwVar.m5994u(mo6021D0(), zzi(), zzj(), zzdpw.m5977d(mo6021D0()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdpw zzdpwVar = this.f12671w;
        if (zzdpwVar != null) {
            View viewMo6021D0 = mo6021D0();
            synchronized (zzdpwVar) {
                zzdpwVar.f12569n.mo5951d(motionEvent, viewMo6021D0);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: x0 */
    public final synchronized void mo6029x0(String str, View view) {
        this.f12670v.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f12668t.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzi() {
        return this.f12670v;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzj() {
        return this.f12668t;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzk() {
        return this.f12669u;
    }
}
