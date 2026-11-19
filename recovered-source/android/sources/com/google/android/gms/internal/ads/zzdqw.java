package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdqw extends zzbmo implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdry {

    /* JADX INFO: renamed from: H */
    public static final zzgwt f12674H;

    /* JADX INFO: renamed from: A */
    public zzdpw f12675A;

    /* JADX INFO: renamed from: B */
    public zzbez f12676B;

    /* JADX INFO: renamed from: D */
    public zzbmi f12678D;

    /* JADX INFO: renamed from: E */
    public boolean f12679E;

    /* JADX INFO: renamed from: G */
    public GestureDetector f12681G;

    /* JADX INFO: renamed from: t */
    public final String f12682t;

    /* JADX INFO: renamed from: v */
    public FrameLayout f12684v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f12685w;

    /* JADX INFO: renamed from: x */
    public final zzhcp f12686x;

    /* JADX INFO: renamed from: y */
    public View f12687y;

    /* JADX INFO: renamed from: u */
    public HashMap f12683u = new HashMap();

    /* JADX INFO: renamed from: C */
    public IObjectWrapper f12677C = null;

    /* JADX INFO: renamed from: F */
    public boolean f12680F = false;

    /* JADX INFO: renamed from: z */
    public final int f12688z = 261710000;

    static {
        zzgzi zzgziVar = zzgwt.f18303t;
        Object[] objArr = {"2011", "1009", "3010"};
        zzgym.m7263a(3, objArr);
        f12674H = zzgwt.m7222v(3, objArr);
    }

    public zzdqw(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.f12684v = frameLayout;
        this.f12685w = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f12682t = str;
        zzcgl zzcglVar = com.google.android.gms.ads.internal.zzt.f3698C.f3700B;
        zzcgl.m5402a(frameLayout, this);
        zzcgn zzcgnVar = new zzcgn(frameLayout, this);
        View view = (View) zzcgnVar.f9967s.get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            zzcgnVar.m5403a(viewTreeObserver2);
        }
        this.f12686x = zzcfy.f9951f;
        this.f12676B = new zzbez(this.f12684v.getContext(), this.f12684v);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: D */
    public final synchronized IObjectWrapper mo2951D(String str) {
        return new ObjectWrapper(mo6022I0(str));
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ View mo6021D0() {
        return this.f12684v;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: I0 */
    public final synchronized View mo6022I0(String str) {
        WeakReference weakReference;
        if (!this.f12680F && (weakReference = (WeakReference) this.f12683u.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: L2 */
    public final synchronized void mo2952L2(IObjectWrapper iObjectWrapper) {
        zzdpw zzdpwVar = this.f12675A;
        View view = (View) ObjectWrapper.m3697u0(iObjectWrapper);
        synchronized (zzdpwVar) {
            zzdpwVar.f12569n.mo5948a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: N3 */
    public final FrameLayout mo6023N3() {
        return this.f12685w;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: X1 */
    public final void mo2953X1(IObjectWrapper iObjectWrapper) {
        onTouch(this.f12684v, (MotionEvent) ObjectWrapper.m3697u0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: a */
    public final synchronized void mo2954a() {
        try {
            if (this.f12680F) {
                return;
            }
            zzdpw zzdpwVar = this.f12675A;
            if (zzdpwVar != null) {
                zzdpwVar.m5992s(this);
                this.f12675A = null;
            }
            this.f12683u.clear();
            this.f12684v.removeAllViews();
            this.f12685w.removeAllViews();
            this.f12683u = null;
            this.f12684v = null;
            this.f12685w = null;
            this.f12687y = null;
            this.f12676B = null;
            this.f12680F = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: c */
    public final zzbez mo6024c() {
        return this.f12676B;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: e */
    public final synchronized String mo6025e() {
        return this.f12682t;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: f0 */
    public final synchronized void mo2955f0(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: g */
    public final IObjectWrapper mo6026g() {
        return this.f12677C;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: i */
    public final synchronized JSONObject mo6027i() {
        JSONObject jSONObjectMo5957i;
        zzdpw zzdpwVar = this.f12675A;
        if (zzdpwVar == null) {
            return null;
        }
        FrameLayout frameLayout = this.f12684v;
        Map mapZzi = zzi();
        Map mapZzj = zzj();
        synchronized (zzdpwVar) {
            jSONObjectMo5957i = zzdpwVar.f12569n.mo5957i(frameLayout, mapZzi, mapZzj, zzdpwVar.m5986m());
        }
        return jSONObjectMo5957i;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: j */
    public final synchronized JSONObject mo6028j() {
        JSONObject jSONObjectMo5952e;
        zzdpw zzdpwVar = this.f12675A;
        if (zzdpwVar == null) {
            return null;
        }
        FrameLayout frameLayout = this.f12684v;
        Map mapZzi = zzi();
        Map mapZzj = zzj();
        synchronized (zzdpwVar) {
            jSONObjectMo5952e = zzdpwVar.f12569n.mo5952e(frameLayout, mapZzi, mapZzj, zzdpwVar.m5986m());
        }
        return jSONObjectMo5952e;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: j2 */
    public final synchronized void mo2956j2(zzbmi zzbmiVar) {
        if (!this.f12680F) {
            this.f12679E = true;
            this.f12678D = zzbmiVar;
            zzdpw zzdpwVar = this.f12675A;
            if (zzdpwVar != null) {
                zzdpy zzdpyVar = zzdpwVar.f12563F;
                synchronized (zzdpyVar) {
                    zzdpyVar.f12601a = zzbmiVar;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final synchronized void m6030k4() {
        int iMo5959k;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8401Xc)).booleanValue()) {
            zzdpw zzdpwVar = this.f12675A;
            synchronized (zzdpwVar) {
                iMo5959k = zzdpwVar.f12569n.mo5959k();
            }
            if (iMo5959k != 0) {
                this.f12681G = new GestureDetector(this.f12684v.getContext(), new zzdre(this.f12675A, this));
            }
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final synchronized void m6031l4(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f12685w.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f12685w.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.m3074g("Encountered invalid base64 watermark.", e);
                    }
                }
            }
            this.f12685w.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        boolean zMo5970v;
        zzdpw zzdpwVar = this.f12675A;
        if (zzdpwVar != null) {
            synchronized (zzdpwVar) {
                zMo5970v = zzdpwVar.f12569n.mo5970v();
            }
            if (zMo5970v) {
                zzdpw zzdpwVar2 = this.f12675A;
                synchronized (zzdpwVar2) {
                    zzdpwVar2.f12569n.mo5945F();
                }
                this.f12675A.m5993t(view, this.f12684v, zzi(), zzj(), false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdpw zzdpwVar = this.f12675A;
        if (zzdpwVar != null) {
            FrameLayout frameLayout = this.f12684v;
            zzdpwVar.m5994u(frameLayout, zzi(), zzj(), zzdpw.m5977d(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdpw zzdpwVar = this.f12675A;
        if (zzdpwVar != null) {
            FrameLayout frameLayout = this.f12684v;
            zzdpwVar.m5994u(frameLayout, zzi(), zzj(), zzdpw.m5977d(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        int iMo5959k;
        zzdpw zzdpwVar = this.f12675A;
        if (zzdpwVar != null) {
            FrameLayout frameLayout = this.f12684v;
            synchronized (zzdpwVar) {
                zzdpwVar.f12569n.mo5951d(motionEvent, frameLayout);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8401Xc)).booleanValue() && this.f12681G != null) {
                zzdpw zzdpwVar2 = this.f12675A;
                synchronized (zzdpwVar2) {
                    iMo5959k = zzdpwVar2.f12569n.mo5959k();
                }
                if (iMo5959k != 0) {
                    this.f12681G.onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: p3 */
    public final synchronized void mo2957p3(IObjectWrapper iObjectWrapper) {
        if (this.f12680F) {
            return;
        }
        Object objM3697u0 = ObjectWrapper.m3697u0(iObjectWrapper);
        if (!(objM3697u0 instanceof zzdpw)) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdpw zzdpwVar = this.f12675A;
        if (zzdpwVar != null) {
            zzdpwVar.m5992s(this);
        }
        synchronized (this) {
            ((zzcfx) this.f12686x).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdqw zzdqwVar = this.f12673s;
                    if (zzdqwVar.f12687y == null) {
                        View view = new View(zzdqwVar.f12684v.getContext());
                        zzdqwVar.f12687y = view;
                        view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                    }
                    if (zzdqwVar.f12684v != zzdqwVar.f12687y.getParent()) {
                        zzdqwVar.f12684v.addView(zzdqwVar.f12687y);
                    }
                }
            });
            zzdpw zzdpwVar2 = (zzdpw) objM3697u0;
            this.f12675A = zzdpwVar2;
            zzdpwVar2.m5991r(this);
            this.f12675A.m5980g(this.f12684v);
            zzdpw zzdpwVar3 = this.f12675A;
            FrameLayout frameLayout = this.f12685w;
            zzelv zzelvVarM6008k = zzdpwVar3.f12568m.m6008k();
            if (zzdpwVar3.f12571p.mo6016c() && zzelvVarM6008k != null && frameLayout != null) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3724x.m6277d(zzelvVarM6008k.f14182a, frameLayout);
            }
            if (this.f12679E) {
                zzdpy zzdpyVar = this.f12675A.f12563F;
                zzbmi zzbmiVar = this.f12678D;
                synchronized (zzdpyVar) {
                    zzdpyVar.f12601a = zzbmiVar;
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8211M4)).booleanValue() && !TextUtils.isEmpty(this.f12675A.f12571p.mo6018e())) {
                m6031l4(this.f12675A.f12571p.mo6018e());
            }
            m6030k4();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: s0 */
    public final synchronized void mo2958s0(IObjectWrapper iObjectWrapper, String str) {
        mo6029x0(str, (View) ObjectWrapper.m3697u0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    /* JADX INFO: renamed from: x0 */
    public final synchronized void mo6029x0(String str, View view) {
        if (!this.f12680F) {
            if (view == null) {
                this.f12683u.remove(str);
                return;
            }
            this.f12683u.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.ads.internal.util.zzbs.m3129a(this.f12688z)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    /* JADX INFO: renamed from: z1 */
    public final synchronized void mo2959z1(IObjectWrapper iObjectWrapper) {
        if (this.f12680F) {
            return;
        }
        this.f12677C = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzi() {
        return this.f12683u;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzj() {
        return this.f12683u;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzk() {
        return null;
    }
}
