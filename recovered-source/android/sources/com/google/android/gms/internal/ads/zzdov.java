package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdov implements zzdqj {

    /* JADX INFO: renamed from: A */
    public final zzdle f12456A;

    /* JADX INFO: renamed from: B */
    public final zzfkn f12457B;

    /* JADX INFO: renamed from: C */
    public final VersionInfoParcel f12458C;

    /* JADX INFO: renamed from: D */
    public final zzflg f12459D;

    /* JADX INFO: renamed from: E */
    public final zzcun f12460E;

    /* JADX INFO: renamed from: F */
    public final zzdrg f12461F;

    /* JADX INFO: renamed from: G */
    public final Clock f12462G;

    /* JADX INFO: renamed from: H */
    public final zzdla f12463H;

    /* JADX INFO: renamed from: I */
    public final zzfsm f12464I;

    /* JADX INFO: renamed from: J */
    public final zzdwv f12465J;

    /* JADX INFO: renamed from: K */
    public final zzfqq f12466K;

    /* JADX INFO: renamed from: L */
    public final zzekz f12467L;

    /* JADX INFO: renamed from: N */
    public boolean f12469N;

    /* JADX INFO: renamed from: U */
    public com.google.android.gms.ads.internal.client.zzdc f12476U;

    /* JADX INFO: renamed from: V */
    public final zzdfo f12477V;

    /* JADX INFO: renamed from: W */
    public final zzdrc f12478W;

    /* JADX INFO: renamed from: X */
    public final com.google.android.gms.ads.internal.zzb f12479X;

    /* JADX INFO: renamed from: Y */
    public final zzdbv f12480Y;

    /* JADX INFO: renamed from: s */
    public final Context f12481s;

    /* JADX INFO: renamed from: t */
    public final zzdql f12482t;

    /* JADX INFO: renamed from: u */
    public final JSONObject f12483u;

    /* JADX INFO: renamed from: v */
    public final zzdvf f12484v;

    /* JADX INFO: renamed from: w */
    public final zzdqb f12485w;

    /* JADX INFO: renamed from: x */
    public final zzbaw f12486x;

    /* JADX INFO: renamed from: y */
    public final zzddr f12487y;

    /* JADX INFO: renamed from: z */
    public final zzdcx f12488z;

    /* JADX INFO: renamed from: M */
    public boolean f12468M = false;

    /* JADX INFO: renamed from: O */
    public boolean f12470O = false;

    /* JADX INFO: renamed from: P */
    public boolean f12471P = false;

    /* JADX INFO: renamed from: Q */
    public Point f12472Q = new Point();

    /* JADX INFO: renamed from: R */
    public Point f12473R = new Point();

    /* JADX INFO: renamed from: S */
    public long f12474S = 0;

    /* JADX INFO: renamed from: T */
    public long f12475T = 0;

    public zzdov(Context context, zzdql zzdqlVar, JSONObject jSONObject, zzdvf zzdvfVar, zzdqb zzdqbVar, zzbaw zzbawVar, zzddr zzddrVar, zzdcx zzdcxVar, zzdle zzdleVar, zzfkn zzfknVar, VersionInfoParcel versionInfoParcel, zzflg zzflgVar, zzcun zzcunVar, zzdrg zzdrgVar, Clock clock, zzdla zzdlaVar, zzfsm zzfsmVar, zzfqq zzfqqVar, zzekz zzekzVar, zzdwv zzdwvVar, zzdrc zzdrcVar, zzdfo zzdfoVar, com.google.android.gms.ads.internal.zzb zzbVar, zzdbv zzdbvVar) {
        this.f12481s = context;
        this.f12482t = zzdqlVar;
        this.f12483u = jSONObject;
        this.f12484v = zzdvfVar;
        this.f12485w = zzdqbVar;
        this.f12486x = zzbawVar;
        this.f12487y = zzddrVar;
        this.f12488z = zzdcxVar;
        this.f12456A = zzdleVar;
        this.f12457B = zzfknVar;
        this.f12458C = versionInfoParcel;
        this.f12459D = zzflgVar;
        this.f12460E = zzcunVar;
        this.f12461F = zzdrgVar;
        this.f12462G = clock;
        this.f12463H = zzdlaVar;
        this.f12464I = zzfsmVar;
        this.f12466K = zzfqqVar;
        this.f12467L = zzekzVar;
        this.f12465J = zzdwvVar;
        this.f12478W = zzdrcVar;
        this.f12477V = zzdfoVar;
        this.f12479X = zzbVar;
        this.f12480Y = zzdbvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: C */
    public final void mo5944C() {
        zzdvf zzdvfVar = this.f12484v;
        synchronized (zzdvfVar) {
            ListenableFuture listenableFuture = zzdvfVar.f13075m;
            if (listenableFuture == null) {
                return;
            }
            zzhcf.m7377k(listenableFuture, new zzduu(), zzdvfVar.f13067e);
            zzdvfVar.f13075m = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: F */
    public final void mo5945F() {
        View view;
        if (this.f12483u.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzdrg zzdrgVar = this.f12461F;
            if (zzdrgVar.f12725u == null || zzdrgVar.f12728x == null) {
                return;
            }
            zzdrgVar.f12727w = null;
            zzdrgVar.f12728x = null;
            WeakReference weakReference = zzdrgVar.f12729y;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                zzdrgVar.f12729y = null;
            }
            try {
                zzdrgVar.f12725u.mo5078b();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: G */
    public final void mo5946G(String str) {
        m5973y(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: O */
    public final void mo5947O(Bundle bundle) {
        if (bundle == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Click data is null. No click is reported.");
            return;
        }
        if (!m5966r("click_reporting")) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        JSONObject jSONObjectM3049n = null;
        String string = bundle2 != null ? bundle2.getString("asset_id") : null;
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
        zzfVar.getClass();
        try {
            jSONObjectM3049n = zzfVar.m3049n(bundle);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error converting Bundle to JSON", e);
        }
        m5973y(null, null, null, null, null, string, null, jSONObjectM3049n, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: a */
    public final void mo5948a(View view) {
        if (!this.f12483u.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            zzdrg zzdrgVar = this.f12461F;
            view.setOnClickListener(zzdrgVar);
            view.setClickable(true);
            zzdrgVar.f12729y = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: b */
    public final void mo5949b(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        com.google.android.gms.ads.internal.client.zzew zzewVar;
        com.google.android.gms.ads.internal.client.zzew zzewVar2;
        zzfqq zzfqqVar = this.f12466K;
        zzfkn zzfknVar = this.f12457B;
        zzfsm zzfsmVar = this.f12464I;
        try {
            if (this.f12470O) {
                return;
            }
            if (zzdgVar == null) {
                zzdqb zzdqbVar = this.f12485w;
                synchronized (zzdqbVar) {
                    zzewVar = zzdqbVar.f12616g;
                }
                if (zzewVar != null) {
                    this.f12470O = true;
                    synchronized (zzdqbVar) {
                        zzewVar2 = zzdqbVar.f12616g;
                    }
                    zzfsmVar.m6643b(zzewVar2.f3173t, zzfknVar.f15963x0, zzfqqVar, null);
                    m5974z();
                    return;
                }
            }
            this.f12470O = true;
            zzfsmVar.m6643b(zzdgVar.mo2908b(), zzfknVar.f15963x0, zzfqqVar, null);
            m5974z();
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: c */
    public final void mo5950c() {
        this.f12471P = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: d */
    public final void mo5951d(MotionEvent motionEvent, View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.f12472Q = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        long jCurrentTimeMillis = this.f12462G.currentTimeMillis();
        this.f12475T = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f12465J.f13232a = motionEvent;
            this.f12474S = jCurrentTimeMillis;
            this.f12473R = this.f12472Q;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f12472Q;
        motionEventObtain.setLocation(point.x, point.y);
        this.f12486x.f7501b.mo3255b(motionEventObtain);
        motionEventObtain.recycle();
        m5969u();
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: e */
    public final JSONObject mo5952e(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f12481s;
        JSONObject jSONObjectM3133e = com.google.android.gms.ads.internal.util.zzbs.m3133e(context, map, map2, view, scaleType);
        JSONObject jSONObjectM3130b = com.google.android.gms.ads.internal.util.zzbs.m3130b(context, view);
        JSONObject jSONObjectM3131c = com.google.android.gms.ads.internal.util.zzbs.m3131c(view);
        JSONObject jSONObjectM3132d = com.google.android.gms.ads.internal.util.zzbs.m3132d(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectM3133e);
            jSONObject.put("ad_view_signal", jSONObjectM3130b);
            jSONObject.put("scroll_view_signal", jSONObjectM3131c);
            jSONObject.put("lock_screen_signal", jSONObjectM3132d);
            return jSONObject;
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: e0 */
    public final void mo5953e0() {
        m5971w(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: f */
    public final void mo5954f(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        this.f12476U = zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: g */
    public final void mo5955g(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        Context context = this.f12481s;
        JSONObject jSONObjectM3133e = com.google.android.gms.ads.internal.util.zzbs.m3133e(context, map, map2, view2, scaleType);
        JSONObject jSONObjectM3130b = com.google.android.gms.ads.internal.util.zzbs.m3130b(context, view2);
        JSONObject jSONObjectM3131c = com.google.android.gms.ads.internal.util.zzbs.m3131c(view2);
        JSONObject jSONObjectM3132d = com.google.android.gms.ads.internal.util.zzbs.m3132d(context, view2);
        String strM5968t = m5968t(map, view);
        m5973y(true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8865z4)).booleanValue() ? view2 : view, jSONObjectM3130b, jSONObjectM3133e, jSONObjectM3131c, jSONObjectM3132d, strM5968t, com.google.android.gms.ads.internal.util.zzbs.m3134f(strM5968t, context, this.f12473R, this.f12472Q), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: h */
    public final void mo5956h(View view) {
        this.f12472Q = new Point();
        this.f12473R = new Point();
        if (view != null) {
            zzdla zzdlaVar = this.f12463H;
            synchronized (zzdlaVar) {
                WeakHashMap weakHashMap = zzdlaVar.f12296t;
                if (weakHashMap.containsKey(view)) {
                    ((zzbez) weakHashMap.get(view)).f7714D.remove(zzdlaVar);
                    weakHashMap.remove(view);
                }
            }
        }
        this.f12469N = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: i */
    public final JSONObject mo5957i(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject jSONObjectMo5952e = mo5952e(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f12471P && this.f12483u.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectMo5952e != null) {
                jSONObject.put("nas", jSONObjectMo5952e);
            }
            return jSONObject;
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to create native click meta data JSON.", e);
            return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: j */
    public final void mo5958j(View view, Map map, Map map2, zzdry zzdryVar, zzdry zzdryVar2) {
        this.f12472Q = new Point();
        this.f12473R = new Point();
        if (!this.f12469N) {
            this.f12463H.m5935K0(view);
            this.f12469N = true;
        }
        view.setOnTouchListener(zzdryVar);
        view.setClickable(true);
        view.setOnClickListener(zzdryVar2);
        zzcun zzcunVar = this.f12460E;
        zzcunVar.getClass();
        zzcunVar.f11495B = new WeakReference(this);
        boolean zM3129a = com.google.android.gms.ads.internal.util.zzbs.m3129a(this.f12458C.f3398u);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zM3129a) {
                        view2.setOnTouchListener(zzdryVar);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(zzdryVar2);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zM3129a) {
                        view3.setOnTouchListener(zzdryVar);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: k */
    public final int mo5959k() {
        zzbma zzbmaVar = this.f12459D.f16046j;
        if (zzbmaVar == null) {
            return 0;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8401Xc)).booleanValue()) {
            return zzbmaVar.f9163A;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: l */
    public final void mo5960l() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f12483u);
            zzcgb.m5394a(this.f12484v.m6068a(jSONObject, "google.afma.nativeAds.handleDownloadedImpression"), "Error during performing handleDownloadedImpression", zzcfy.f9953h);
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: m */
    public final void mo5961m(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i2) {
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.f12483u;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8401Xc)).booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!this.f12471P) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!jSONObject2.optBoolean("allow_custom_click_gesture", false)) {
                int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.f12481s;
        JSONObject jSONObjectM3133e = com.google.android.gms.ads.internal.util.zzbs.m3133e(context, map, map2, view2, scaleType);
        JSONObject jSONObjectM3130b = com.google.android.gms.ads.internal.util.zzbs.m3130b(context, view2);
        JSONObject jSONObjectM3131c = com.google.android.gms.ads.internal.util.zzbs.m3131c(view2);
        boolean z3 = z2;
        JSONObject jSONObjectM3132d = com.google.android.gms.ads.internal.util.zzbs.m3132d(context, view2);
        String strM5968t = m5968t(map, view);
        JSONObject jSONObjectM3134f = com.google.android.gms.ads.internal.util.zzbs.m3134f(strM5968t, context, this.f12473R, this.f12472Q);
        if (z3) {
            try {
                Point point = this.f12473R;
                Point point2 = this.f12472Q;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i2);
                    } catch (Exception e) {
                        e = e;
                        int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error occurred while grabbing custom click gesture signals.", e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("FirstPartyNativeAdCore.performCustomClickGesture", e3);
            }
        }
        m5973y(view2, jSONObjectM3130b, jSONObjectM3133e, jSONObjectM3131c, jSONObjectM3132d, strM5968t, jSONObjectM3134f, null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: n */
    public final void mo5962n(Bundle bundle) {
        if (bundle == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Touch event data is null. No touch event is reported.");
        } else {
            if (!m5966r("touch_reporting")) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3070c("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.f12486x.f7501b.mo3254a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            m5969u();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: o */
    public final void mo5963o(final zzbnz zzbnzVar) {
        if (!this.f12483u.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        final zzdrg zzdrgVar = this.f12461F;
        zzdvf zzdvfVar = zzdrgVar.f12723s;
        zzdrgVar.f12725u = zzbnzVar;
        zzbpx zzbpxVar = zzdrgVar.f12726v;
        if (zzbpxVar != null) {
            zzdvfVar.m6070c("/unconfirmedClick", zzbpxVar);
        }
        zzbpx zzbpxVar2 = new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrf
            @Override // com.google.android.gms.internal.ads.zzbpx
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo5095a(Object obj, Map map) {
                zzdrg zzdrgVar2 = zzdrgVar;
                try {
                    zzdrgVar2.f12728x = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3070c("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzdrgVar2.f12727w = (String) map.get("id");
                String str = (String) map.get("asset_id");
                zzbnz zzbnzVar2 = zzbnzVar;
                if (zzbnzVar2 == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3068a("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        zzbnzVar2.mo5079y(str);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
                    }
                }
            }
        };
        zzdrgVar.f12726v = zzbpxVar2;
        zzdvfVar.m6069b("/unconfirmedClick", zzbpxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: p */
    public final void mo5964p(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f12481s;
        JSONObject jSONObjectM3133e = com.google.android.gms.ads.internal.util.zzbs.m3133e(context, map, map2, view, scaleType);
        JSONObject jSONObjectM3130b = com.google.android.gms.ads.internal.util.zzbs.m3130b(context, view);
        JSONObject jSONObjectM3131c = com.google.android.gms.ads.internal.util.zzbs.m3131c(view);
        JSONObject jSONObjectM3132d = com.google.android.gms.ads.internal.util.zzbs.m3132d(context, view);
        boolean zM3135g = com.google.android.gms.ads.internal.util.zzbs.m3135g(context, this.f12457B);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f12483u);
            jSONObject.put("asset_view_signal", jSONObjectM3133e);
            jSONObject.put("ad_view_signal", jSONObjectM3130b);
            jSONObject.put("scroll_view_signal", jSONObjectM3131c);
            jSONObject.put("lock_screen_signal", jSONObjectM3132d);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8746s4)).booleanValue()) {
                jSONObject.put("view_signals", m5972x(view));
            }
            jSONObject.put("policy_validator_enabled", zM3135g);
            jSONObject.put("screen", com.google.android.gms.ads.internal.util.zzbs.m3136h(context));
            zzcgb.m5394a(this.f12484v.m6068a(jSONObject, "google.afma.nativeAds.handleNativeAdSignalsLogging"), "Error during performing handleNativeAdSignalsLogging", zzcfy.f9953h);
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to create native ad signals logging JSON.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: q */
    public final void mo5965q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f12481s;
        m5971w(com.google.android.gms.ads.internal.util.zzbs.m3130b(context, view), com.google.android.gms.ads.internal.util.zzbs.m3133e(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbs.m3131c(view), com.google.android.gms.ads.internal.util.zzbs.m3132d(context, view), m5972x(view), null, com.google.android.gms.ads.internal.util.zzbs.m3135g(context, this.f12457B), view);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m5966r(String str) {
        JSONObject jSONObjectOptJSONObject = this.f12483u.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: s */
    public final boolean mo5967s(Bundle bundle) throws JSONException {
        JSONObject jSONObjectM3049n;
        if (!m5966r("impression_reporting")) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
        zzfVar.getClass();
        if (bundle != null) {
            try {
                jSONObjectM3049n = zzfVar.m3049n(bundle);
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error converting Bundle to JSON", e);
                jSONObjectM3049n = null;
            }
        } else {
            jSONObjectM3049n = null;
        }
        return m5971w(null, null, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8287Qc)).booleanValue() ? m5972x(null) : null, jSONObjectM3049n, false, null);
    }

    /* JADX INFO: renamed from: t */
    public final String m5968t(Map map, View view) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iM6011q = this.f12485w.m6011q();
        if (iM6011q == 1) {
            return "1099";
        }
        if (iM6011q == 2) {
            return "2099";
        }
        if (iM6011q != 6) {
            return null;
        }
        return "3099";
    }

    /* JADX INFO: renamed from: u */
    public final void m5969u() {
        com.google.android.gms.ads.internal.zzb zzbVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8537ff)).booleanValue() || (zzbVar = this.f12479X) == null) {
            return;
        }
        zzbVar.f3642b = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    /* JADX INFO: renamed from: v */
    public final boolean mo5970v() {
        if (mo5959k() == 0) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8401Xc)).booleanValue()) {
            return this.f12459D.f16046j.f9164B;
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m5971w(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z, View view) {
        zzdbv zzdbvVar;
        zzfkn zzfknVar = this.f12457B;
        Context context = this.f12481s;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f12483u);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            zzbio zzbioVar = zzbix.f8746s4;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            zzbiv zzbivVar = zzbaVar.f3098c;
            zzbiv zzbivVar2 = zzbaVar.f3098c;
            if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", com.google.android.gms.ads.internal.util.zzbs.m3136h(context));
            if (((Boolean) zzbivVar2.m5030a(zzbix.f8571hf)).booleanValue() && (zzdbvVar = this.f12480Y) != null) {
                AtomicLong atomicLong = zzdbvVar.f11972a;
                if (atomicLong.get() > 0) {
                    jSONObject6.put("placement_id", atomicLong.get());
                }
            }
            boolean zBooleanValue = ((Boolean) zzbivVar2.m5030a(zzbix.f8233N9)).booleanValue();
            zzdvf zzdvfVar = this.f12484v;
            if (zBooleanValue) {
                zzdvfVar.m6069b("/clickRecorded", new zzdos(this));
            } else {
                zzdvfVar.m6069b("/logScionEvent", new zzdor(this));
            }
            zzdvfVar.m6069b("/nativeImpression", new zzdot(this, view));
            zzdvfVar.m6069b("/nativeImpressionFlowControl", new zzdou(this, this.f12464I, zzfknVar.f15963x0, this.f12466K));
            zzcgb.m5394a(zzdvfVar.m6068a(jSONObject6, "google.afma.nativeAds.handleImpression"), "Error during performing handleImpression", zzcfy.f9953h);
            if (this.f12468M) {
                return true;
            }
            this.f12468M = com.google.android.gms.ads.internal.zzt.f3698C.f3715o.m3099d(context, this.f12458C.f3396s, zzfknVar.f15885C.toString(), this.f12459D.f16043g);
            return true;
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public final String m5972x(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8746s4)).booleanValue()) {
            return null;
        }
        try {
            return this.f12486x.f7501b.mo3262i(this.f12481s, view, null);
        } catch (Exception unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Exception getting data.");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX INFO: renamed from: y */
    public final void m5973y(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        List list;
        boolean z3;
        String strMo3261h;
        com.google.android.gms.ads.internal.client.zzew zzewVar;
        Clock clock = this.f12462G;
        zzdqb zzdqbVar = this.f12485w;
        JSONObject jSONObject7 = this.f12483u;
        try {
            m5969u();
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            zzdql zzdqlVar = this.f12482t;
            jSONObject8.put("has_custom_click_handler", ((zzbnm) zzdqlVar.f12660g.get(zzdqbVar.m6004g())) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", zzdqbVar.m6011q());
            jSONObject9.put("view_aware_api_used", z);
            zzbma zzbmaVar = this.f12459D.f16046j;
            jSONObject9.put("custom_mute_requested", zzbmaVar != null && zzbmaVar.f9172y);
            synchronized (zzdqbVar) {
                list = zzdqbVar.f12615f;
            }
            if (list.isEmpty()) {
                z3 = false;
            } else {
                synchronized (zzdqbVar) {
                    zzewVar = zzdqbVar.f12616g;
                }
                if (zzewVar != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            jSONObject9.put("custom_mute_enabled", z3);
            if (this.f12461F.f12725u != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", clock.currentTimeMillis());
            if (this.f12471P && this.f12483u.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", ((zzbnm) zzdqlVar.f12660g.get(zzdqbVar.m6004g())) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strMo3261h = this.f12486x.f7501b.mo3261h(this.f12481s, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Exception obtaining click signals", e);
                strMo3261h = null;
            }
            jSONObject9.put("click_signals", strMo3261h);
            jSONObject9.put("open_chrome_custom_tab", true);
            zzbio zzbioVar = zzbix.f8301R9;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && PlatformVersion.m3654b()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8318S9)).booleanValue() && PlatformVersion.m3654b()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long jCurrentTimeMillis = clock.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", jCurrentTimeMillis - this.f12474S);
            jSONObject10.put("time_from_last_touch", jCurrentTimeMillis - this.f12475T);
            jSONObject8.put("touch_signal", jSONObject10);
            if (this.f12457B.m6482b()) {
                JSONObject jSONObject11 = (JSONObject) jSONObject7.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.f12467L.m6263k4(string, zzdqbVar);
                }
            }
            zzcgb.m5394a(this.f12484v.m6068a(jSONObject8, "google.afma.nativeAds.handleClick"), "Error during performing handleClick", zzcfy.f9953h);
        } catch (JSONException e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to create click JSON.", e2);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m5974z() {
        try {
            com.google.android.gms.ads.internal.client.zzdc zzdcVar = this.f12476U;
            if (zzdcVar != null) {
                zzdcVar.mo2906a();
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final boolean zzh() {
        return this.f12483u.optBoolean("allow_custom_click_gesture", false);
    }
}
