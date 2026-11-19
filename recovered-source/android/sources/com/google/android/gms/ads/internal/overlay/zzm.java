package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzbop;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzclb;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzclr;
import com.google.android.gms.internal.ads.zzcmx;
import com.google.android.gms.internal.ads.zzcnl;
import com.google.android.gms.internal.ads.zzddm;
import com.google.android.gms.internal.ads.zzdlg;
import com.google.android.gms.internal.ads.zzdzs;
import com.google.android.gms.internal.ads.zzdzt;
import com.google.android.gms.internal.ads.zzela;
import com.google.android.gms.internal.ads.zzelb;
import com.google.android.gms.internal.ads.zzelt;
import com.google.android.gms.internal.ads.zzelv;
import com.google.android.gms.internal.ads.zzfux;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public class zzm extends zzbzh implements zzah {

    /* JADX INFO: renamed from: Q */
    public static final int f3344Q = Color.argb(0, 0, 0, 0);

    /* JADX INFO: renamed from: A */
    public WebChromeClient.CustomViewCallback f3345A;

    /* JADX INFO: renamed from: D */
    public zzi f3348D;

    /* JADX INFO: renamed from: I */
    public Runnable f3353I;

    /* JADX INFO: renamed from: J */
    public boolean f3354J;

    /* JADX INFO: renamed from: K */
    public boolean f3355K;

    /* JADX INFO: renamed from: O */
    public Toolbar f3359O;

    /* JADX INFO: renamed from: t */
    public final Activity f3361t;

    /* JADX INFO: renamed from: u */
    public AdOverlayInfoParcel f3362u;

    /* JADX INFO: renamed from: v */
    public zzclb f3363v;

    /* JADX INFO: renamed from: w */
    public zzj f3364w;

    /* JADX INFO: renamed from: x */
    public zzu f3365x;

    /* JADX INFO: renamed from: z */
    public FrameLayout f3367z;

    /* JADX INFO: renamed from: y */
    public boolean f3366y = false;

    /* JADX INFO: renamed from: B */
    public boolean f3346B = false;

    /* JADX INFO: renamed from: C */
    public boolean f3347C = false;

    /* JADX INFO: renamed from: E */
    public boolean f3349E = false;

    /* JADX INFO: renamed from: P */
    public int f3360P = 1;

    /* JADX INFO: renamed from: F */
    public int f3350F = 0;

    /* JADX INFO: renamed from: G */
    public final Object f3351G = new Object();

    /* JADX INFO: renamed from: H */
    public final View.OnClickListener f3352H = new zzd(this);

    /* JADX INFO: renamed from: L */
    public boolean f3356L = false;

    /* JADX INFO: renamed from: M */
    public boolean f3357M = false;

    /* JADX INFO: renamed from: N */
    public boolean f3358N = true;

    public zzm(Activity activity) {
        this.f3361t = activity;
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m3003p4(View view, zzelv zzelvVar) {
        if (zzelvVar == null || view == null) {
            return;
        }
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8595j6)).booleanValue() && zzelvVar.f14183b.f16608g == zzfux.HTML) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.f3698C.f3724x.m6278e(zzelvVar.f14182a, view);
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: F */
    public final void mo2989F() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3362u;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.f3305u) != null) {
            zzrVar.mo3023s1();
        }
        zzclb zzclbVar = this.f3363v;
        if (zzclbVar != null) {
            try {
                this.f3348D.removeView(zzclbVar.mo5577H());
            } catch (NullPointerException unused) {
            }
        }
        m3004k4();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: N */
    public final void mo2990N(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: Q */
    public final void mo2991Q() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3362u;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.f3305u) != null) {
            zzrVar.mo3016G0();
        }
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8410Y5)).booleanValue() && this.f3363v != null && (!this.f3361t.isFinishing() || this.f3364w == null)) {
            this.f3363v.onPause();
        }
        m3004k4();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: Q3 */
    public void mo2992Q3(Bundle bundle) {
        zzr zzrVar;
        if (!this.f3355K) {
            this.f3361t.requestWindowFeature(1);
        }
        this.f3346B = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            Activity activity = this.f3361t;
            AdOverlayInfoParcel adOverlayInfoParcelM2984w = AdOverlayInfoParcel.m2984w(activity.getIntent());
            this.f3362u = adOverlayInfoParcelM2984w;
            if (adOverlayInfoParcelM2984w == null) {
                throw new zzh("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelM2984w.f3301O) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.f3362u.f3291E.f3398u > 7500000) {
                this.f3360P = 4;
            }
            if (activity.getIntent() != null) {
                this.f3358N = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f3362u;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel.f3293G;
            if (zzlVar != null) {
                boolean z = zzlVar.f3675s;
                this.f3347C = z;
                this.f3350F = (int) zzlVar.f3679w;
                if (z) {
                    if (adOverlayInfoParcel.f3289C != 5 && zzlVar.f3680x != -1) {
                        new zzl(this).mo3108b();
                    }
                }
                String message = e.getMessage();
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f(message);
                this.f3360P = 4;
                this.f3361t.finish();
            }
            if (adOverlayInfoParcel.f3289C == 5) {
                this.f3347C = true;
                if (adOverlayInfoParcel.f3289C != 5) {
                    new zzl(this).mo3108b();
                }
            } else {
                this.f3347C = false;
            }
            if (bundle == null) {
                if (this.f3358N) {
                    zzddm zzddmVar = this.f3362u.f3298L;
                    if (zzddmVar != null) {
                        synchronized (zzddmVar) {
                            ScheduledFuture scheduledFuture = zzddmVar.f12077u;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(true);
                            }
                        }
                    }
                    zzr zzrVar2 = this.f3362u.f3305u;
                    if (zzrVar2 != null) {
                        zzrVar2.zzh();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f3362u;
                if (adOverlayInfoParcel2.f3289C != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.f3304t;
                    if (zzaVar != null) {
                        zzaVar.mo2730k();
                    }
                    zzdlg zzdlgVar = this.f3362u.f3299M;
                    if (zzdlgVar != null) {
                        zzdlgVar.mo5626C();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f3362u;
            if (adOverlayInfoParcel3 != null && (zzrVar = adOverlayInfoParcel3.f3305u) != null) {
                zzrVar.mo3015B1();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f3362u;
            zzi zziVar = new zzi(activity, adOverlayInfoParcel4.f3292F, adOverlayInfoParcel4.f3291E.f3396s, adOverlayInfoParcel4.f3297K);
            this.f3348D = zziVar;
            zziVar.setId(1000);
            com.google.android.gms.ads.internal.zzt.f3698C.f3706f.mo3243e(activity);
            AdOverlayInfoParcel adOverlayInfoParcel5 = this.f3362u;
            int i3 = adOverlayInfoParcel5.f3289C;
            if (i3 == 1) {
                m3013u4(false);
                return;
            }
            if (i3 == 2) {
                this.f3364w = new zzj(adOverlayInfoParcel5.f3306v);
                m3013u4(false);
            } else if (i3 == 3) {
                m3013u4(true);
            } else {
                if (i3 != 5) {
                    throw new zzh("Could not determine ad overlay type.");
                }
                m3013u4(false);
            }
        } catch (zzh e) {
            String message2 = e.getMessage();
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(message2);
            this.f3360P = 4;
            this.f3361t.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: a */
    public final void mo2993a() {
        this.f3360P = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: b */
    public final void mo2994b() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3362u;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.f3305u) == null) {
            return;
        }
        zzrVar.mo3020a3();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: c */
    public final boolean mo2995c() {
        this.f3360P = 1;
        if (this.f3363v == null) {
            return true;
        }
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8616ka)).booleanValue() && this.f3363v.canGoBack()) {
            this.f3363v.goBack();
            return false;
        }
        boolean zMo5568A = this.f3363v.mo5568A();
        if (!zMo5568A) {
            this.f3363v.mo5129b("onbackblocked", Collections.EMPTY_MAP);
        }
        return zMo5568A;
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: h */
    public final void mo2996h() {
        this.f3355K = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3004k4() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (!this.f3361t.isFinishing() || this.f3356L) {
            return;
        }
        this.f3356L = true;
        zzclb zzclbVar = this.f3363v;
        if (zzclbVar != null) {
            zzclbVar.mo5619x0(this.f3360P - 1);
            synchronized (this.f3351G) {
                try {
                    if (!this.f3354J && this.f3363v.mo5592W()) {
                        zzbio zzbioVar = zzbix.f8394X5;
                        zzba zzbaVar = zzba.f3095e;
                        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && !this.f3357M && (adOverlayInfoParcel = this.f3362u) != null && (zzrVar = adOverlayInfoParcel.f3305u) != null) {
                            zzrVar.mo3018U2();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzf
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.f3333s.m3005l4();
                            }
                        };
                        this.f3353I = runnable;
                        com.google.android.gms.ads.internal.util.zzs.f3626l.postDelayed(runnable, ((Long) zzbaVar.f3098c.m5030a(zzbix.f8089F1)).longValue());
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        m3005l4();
    }

    /* JADX INFO: renamed from: l4 */
    public final void m3005l4() {
        zzclb zzclbVar;
        zzr zzrVar;
        if (this.f3357M) {
            return;
        }
        this.f3357M = true;
        zzclb zzclbVar2 = this.f3363v;
        if (zzclbVar2 != null) {
            this.f3348D.removeView(zzclbVar2.mo5577H());
            zzj zzjVar = this.f3364w;
            if (zzjVar != null) {
                this.f3363v.mo5610p0(zzjVar.f3340d);
                this.f3363v.mo5575E0(false);
                if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8536fe)).booleanValue() && this.f3363v.getParent() != null) {
                    ((ViewGroup) this.f3363v.getParent()).removeView(this.f3363v.mo5577H());
                }
                ViewGroup viewGroup = this.f3364w.f3339c;
                View viewMo5577H = this.f3363v.mo5577H();
                zzj zzjVar2 = this.f3364w;
                viewGroup.addView(viewMo5577H, zzjVar2.f3337a, zzjVar2.f3338b);
                this.f3364w = null;
            } else {
                Activity activity = this.f3361t;
                if (activity.getApplicationContext() != null) {
                    this.f3363v.mo5610p0(activity.getApplicationContext());
                }
            }
            this.f3363v = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3362u;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.f3305u) != null) {
            zzrVar.mo3021c1(this.f3360P);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f3362u;
        if (adOverlayInfoParcel2 == null || (zzclbVar = adOverlayInfoParcel2.f3306v) == null) {
            return;
        }
        m3003p4(this.f3362u.f3306v.mo5577H(), zzclbVar.mo5586P());
    }

    /* JADX INFO: renamed from: m4 */
    public final void m3006m4() {
        this.f3348D.f3336t = true;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m3007n4(zzelb zzelbVar) throws zzh {
        zzbzb zzbzbVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3362u;
        if (adOverlayInfoParcel == null || (zzbzbVar = adOverlayInfoParcel.f3300N) == null) {
            throw new zzh("noioou");
        }
        zzbzbVar.mo5275b0(new ObjectWrapper(zzelbVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: o1 */
    public final void mo2999o1(int i2, String[] strArr, int[] iArr) {
        if (i2 == 12345) {
            zzela zzelaVarM6268e = zzelb.m6268e();
            zzelaVarM6268e.mo6248a(this.f3361t);
            zzelaVarM6268e.mo6249b(this.f3362u.f3289C == 5 ? this : null);
            try {
                this.f3362u.f3300N.mo5273P3(strArr, iArr, new ObjectWrapper(zzelaVarM6268e.mo6252e()));
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final void m3008o4(View view) {
        zzelv zzelvVarMo5586P;
        zzelt zzeltVarMo5607o;
        zzclb zzclbVar = this.f3363v;
        if (zzclbVar == null) {
            return;
        }
        zzbio zzbioVar = zzbix.f8612k6;
        zzba zzbaVar = zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && (zzeltVarMo5607o = zzclbVar.mo5607o()) != null) {
            zzeltVarMo5607o.m6282d(view);
        } else if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8595j6)).booleanValue() && (zzelvVarMo5586P = zzclbVar.mo5586P()) != null && zzelvVarMo5586P.f14183b.f16608g == zzfux.HTML) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3724x.m6277d(zzelvVarMo5586P.f14182a, view);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final void m3009q4(boolean z) {
        if (this.f3362u.f3301O) {
            return;
        }
        zzbio zzbioVar = zzbix.f8443a6;
        zzba zzbaVar = zzba.f3095e;
        int iIntValue = ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue();
        boolean z2 = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8140I1)).booleanValue() || z;
        zzt zztVar = new zzt();
        zztVar.f3383d = 50;
        zztVar.f3380a = true != z2 ? 0 : iIntValue;
        zztVar.f3381b = true != z2 ? iIntValue : 0;
        zztVar.f3382c = iIntValue;
        this.f3365x = new zzu(this.f3361t, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        m3010r4(z, this.f3362u.f3309y);
        this.f3348D.addView(this.f3365x, layoutParams);
        m3008o4(this.f3365x);
    }

    /* JADX INFO: renamed from: r4 */
    public final void m3010r4(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        zzbio zzbioVar = zzbix.f8106G1;
        zzba zzbaVar = zzba.f3095e;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && (adOverlayInfoParcel2 = this.f3362u) != null && (zzlVar2 = adOverlayInfoParcel2.f3293G) != null && zzlVar2.f3682z;
        boolean z5 = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8123H1)).booleanValue() && (adOverlayInfoParcel = this.f3362u) != null && (zzlVar = adOverlayInfoParcel.f3293G) != null && zzlVar.f3674A;
        if (z && z2 && z4 && !z5) {
            new zzbyn(this.f3363v, "useCustomClose").m5262b("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.f3365x;
        if (zzuVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            ImageButton imageButton = zzuVar.f3384s;
            if (!z3) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) zzbaVar.f3098c.m5030a(zzbix.f8174K1)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final void m3011s4(int i2, boolean z) {
        if (!z) {
            this.f3348D.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        this.f3348D.setBackgroundColor(0);
        this.f3350F = i2;
        Window window = this.f3361t.getWindow();
        if (!((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8709q1)).booleanValue() || Build.VERSION.SDK_INT < 31 || window == null) {
            return;
        }
        window.setBackgroundBlurRadius(i2);
    }

    /* JADX INFO: renamed from: t4 */
    public final void m3012t4(int i2) {
        Activity activity = this.f3361t;
        int i3 = activity.getApplicationInfo().targetSdkVersion;
        zzbio zzbioVar = zzbix.f8315S6;
        zzba zzbaVar = zzba.f3095e;
        if (i3 >= ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8331T6)).intValue()) {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8347U6)).intValue()) {
                    if (i4 <= ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8363V6)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i2);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("AdOverlay.setRequestedOrientation", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX INFO: renamed from: u4 */
    public final void m3013u4(boolean z) throws zzh {
        boolean z2;
        Window window;
        int i2;
        boolean z3;
        int i3;
        boolean z4 = this.f3355K;
        Activity activity = this.f3361t;
        if (!z4) {
            activity.requestWindowFeature(1);
        }
        Window window2 = activity.getWindow();
        if (window2 == null) {
            throw new zzh("Invalid activity, no window available.");
        }
        zzclb zzclbVar = this.f3362u.f3306v;
        zzclm zzclmVarMo5582K = zzclbVar != null ? zzclbVar.mo5582K() : null;
        boolean z5 = zzclmVarMo5582K != null && zzclmVarMo5582K.m5646z();
        this.f3349E = false;
        if (z5) {
            int i4 = this.f3362u.f3288B;
            if (i4 == 6) {
                z2 = activity.getResources().getConfiguration().orientation == 1;
                this.f3349E = z2;
            } else if (i4 == 7) {
                z2 = activity.getResources().getConfiguration().orientation == 2;
                this.f3349E = z2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(z2).length() + 41);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(z2);
        String string = sb.toString();
        int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3068a(string);
        m3012t4(this.f3362u.f3288B);
        window2.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Hardware acceleration on the AdActivity window enabled.");
        activity.setContentView(this.f3348D);
        this.f3355K = true;
        if (this.f3347C) {
            this.f3348D.setBackgroundColor(f3344Q);
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8709q1)).booleanValue() && Build.VERSION.SDK_INT >= 31) {
                window2.setBackgroundBlurRadius(this.f3350F);
            }
        } else {
            this.f3348D.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        if (z) {
            try {
                zzclr zzclrVar = com.google.android.gms.ads.internal.zzt.f3698C.f3704d;
                zzclb zzclbVar2 = this.f3362u.f3306v;
                zzcnl zzcnlVarMo5609p = zzclbVar2 != null ? zzclbVar2.mo5609p() : null;
                zzclb zzclbVar3 = this.f3362u.f3306v;
                String strMo5583M = zzclbVar3 != null ? zzclbVar3.mo5583M() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.f3362u;
                VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.f3291E;
                zzclb zzclbVar4 = adOverlayInfoParcel.f3306v;
                window = window2;
                i2 = 31;
                zzclb zzclbVarM5647a = zzclr.m5647a(activity, versionInfoParcel, zzclbVar4 != null ? zzclbVar4.zzk() : null, null, null, zzbhw.m4893a(), null, zzcnlVarMo5609p, null, null, null, null, null, strMo5583M, true, z5);
                z3 = z5;
                this.f3363v = zzclbVarM5647a;
                zzclm zzclmVarMo5582K2 = zzclbVarM5647a.mo5582K();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f3362u;
                zzbon zzbonVar = adOverlayInfoParcel2.f3294H;
                zzbop zzbopVar = adOverlayInfoParcel2.f3307w;
                zzad zzadVar = adOverlayInfoParcel2.f3287A;
                zzclb zzclbVar5 = adOverlayInfoParcel2.f3306v;
                zzclmVarMo5582K2.m5640l(null, zzbonVar, null, zzbopVar, zzadVar, true, null, zzclbVar5 != null ? zzclbVar5.mo5582K().f10432O : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                this.f3363v.mo5582K().f10450y = new zzcmx() { // from class: com.google.android.gms.ads.internal.overlay.zzg
                    @Override // com.google.android.gms.internal.ads.zzcmx
                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ void mo3001a(int i6, String str, String str2, boolean z6) {
                        zzclb zzclbVar6 = this.f3334s.f3363v;
                        if (zzclbVar6 != null) {
                            zzclbVar6.mo5598e0();
                        }
                    }
                };
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.f3362u;
                String str = adOverlayInfoParcel3.f3290D;
                if (str != null) {
                    this.f3363v.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.f3310z;
                    if (str2 == null) {
                        throw new zzh("No URL or HTML to display in ad overlay.");
                    }
                    this.f3363v.loadDataWithBaseURL(adOverlayInfoParcel3.f3308x, str2, "text/html", "UTF-8", null);
                }
                zzclb zzclbVar6 = this.f3362u.f3306v;
                if (zzclbVar6 != null) {
                    zzclbVar6.mo5612q0(this);
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error obtaining webview.", e);
                throw new zzh("Could not obtain webview for the overlay.", e);
            }
        } else {
            window = window2;
            i2 = 31;
            z3 = z5;
            zzclb zzclbVar7 = this.f3362u.f3306v;
            this.f3363v = zzclbVar7;
            zzclbVar7.mo5610p0(activity);
        }
        if (this.f3362u.f3301O) {
            i3 = 0;
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f3363v.mo5620y(), false);
            zzbio zzbioVar = zzbix.f8828x1;
            zzba zzbaVar = zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && Build.VERSION.SDK_INT >= 27) {
                this.f3363v.mo5620y().setTextClassifier(TextClassifier.NO_OP);
            }
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8845y1)).booleanValue()) {
                this.f3363v.mo5620y().setDownloadListener(new DownloadListener() { // from class: com.google.android.gms.ads.internal.overlay.zze
                    @Override // android.webkit.DownloadListener
                    public final /* synthetic */ void onDownloadStart(String str3, String str4, String str5, String str6, long j2) {
                        int i6 = zzm.f3344Q;
                    }
                });
            }
        } else {
            i3 = 0;
        }
        this.f3363v.mo5606m0(this);
        zzclb zzclbVar8 = this.f3362u.f3306v;
        if (zzclbVar8 != null) {
            m3003p4(this.f3348D, zzclbVar8.mo5586P());
        }
        if (this.f3362u.f3289C != 5) {
            ViewParent parent = this.f3363v.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3363v.mo5577H());
            }
            if (this.f3347C) {
                this.f3363v.mo5591V();
                if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8709q1)).booleanValue() && Build.VERSION.SDK_INT >= i2) {
                    window.setBackgroundBlurRadius(this.f3350F);
                }
            }
            if (this.f3362u.f3301O) {
                Toolbar toolbar = new Toolbar(activity);
                this.f3359O = toolbar;
                toolbar.setId(View.generateViewId());
                this.f3363v.mo5577H().setId(View.generateViewId());
                this.f3359O.setBackgroundColor(-12303292);
                this.f3359O.setVisibility(i3);
                try {
                    this.f3359O.setNavigationIcon(com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5383c().getDrawable(R.drawable.admob_close_button_white_cross, null));
                } catch (Resources.NotFoundException | NullPointerException e2) {
                    com.google.android.gms.ads.internal.util.zze.m3151l("Error obtaining close icon.", e2);
                }
                this.f3359O.setNavigationOnClickListener(this.f3352H);
                this.f3359O.setTitleMarginStart(i3);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.f3348D.addView(this.f3359O, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.f3359O.getId());
                layoutParams2.addRule(12);
                this.f3348D.addView(this.f3363v.mo5577H(), layoutParams2);
                m3008o4(this.f3359O);
            } else {
                this.f3348D.addView(this.f3363v.mo5577H(), -1, -1);
            }
        }
        if (!z && !this.f3349E) {
            this.f3363v.mo5598e0();
        }
        if (this.f3362u.f3289C != 5) {
            m3009q4(z3);
            if (this.f3363v.mo5590T()) {
                m3010r4(z3, true);
                return;
            }
            return;
        }
        zzela zzelaVarM6268e = zzelb.m6268e();
        zzelaVarM6268e.mo6248a(activity);
        zzelaVarM6268e.mo6249b(this);
        zzelaVarM6268e.mo6250c(this.f3362u.f3295I);
        zzelaVarM6268e.mo6251d(this.f3362u.f3296J);
        try {
            m3007n4(zzelaVarM6268e.mo6252e());
        } catch (RemoteException | zzh e3) {
            throw new zzh(e3.getMessage(), e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    /* JADX INFO: renamed from: x1 */
    public final void mo3000x1(int i2, int i3, Intent intent) {
        zzdzt zzdztVar;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i2 == 236) {
            zzbio zzbioVar = zzbix.f8068De;
            zzba zzbaVar = zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i3);
                com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
                zzclb zzclbVar = this.f3363v;
                if (zzclbVar == null || zzclbVar.mo5582K() == null || (zzdztVar = zzclbVar.mo5582K().f10435R) == null || (adOverlayInfoParcel = this.f3362u) == null || !((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    return;
                }
                zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
                zzdzsVarM6111a.m6107b("action", "hilca");
                String str = adOverlayInfoParcel.f3295I;
                if (str == null) {
                    str = "";
                }
                zzdzsVarM6111a.m6107b("gqi", str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length());
                sb2.append(i3);
                zzdzsVarM6111a.m6107b("hilr", sb2.toString());
                if (i3 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zzdzsVarM6111a.m6107b("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zzdzsVarM6111a.m6107b("hills", stringExtra2);
                    }
                }
                zzdzsVarM6111a.m6110e();
            }
        }
    }

    public final void zzb() {
        this.f3360P = 3;
        Activity activity = this.f3361t;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3362u;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f3289C != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzclb zzclbVar = this.f3363v;
        if (zzclbVar != null) {
            zzclbVar.mo5606m0(null);
        }
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3362u;
        if (adOverlayInfoParcel != null && this.f3366y) {
            m3012t4(adOverlayInfoParcel.f3288B);
        }
        if (this.f3367z != null) {
            this.f3361t.setContentView(this.f3348D);
            this.f3355K = true;
            this.f3367z.removeAllViews();
            this.f3367z = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f3345A;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f3345A = null;
        }
        this.f3366y = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzi() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3362u;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.f3305u) == null) {
            return;
        }
        zzrVar.mo3024u0();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzj() {
        zzr zzrVar;
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8410Y5)).booleanValue()) {
            zzclb zzclbVar = this.f3363v;
            if (zzclbVar == null || zzclbVar.mo5576F()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("The webview does not exist. Ignoring action.");
            } else {
                this.f3363v.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3362u;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.f3305u) == null) {
            return;
        }
        zzrVar.mo3019W1();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzk() {
        int i2;
        com.google.android.gms.ads.internal.zzl zzlVar;
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3362u;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.f3305u) != null) {
            zzrVar.mo3022d2();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f3362u;
        boolean z = (adOverlayInfoParcel2 == null || (zzlVar = adOverlayInfoParcel2.f3293G) == null || !zzlVar.f3681y) ? false : true;
        Window window = this.f3361t.getWindow();
        zzbio zzbioVar = zzbix.f8208M1;
        zzba zzbaVar = zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(true != z ? 5380 : 5894);
        } else {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z) {
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            }
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8323Se)).booleanValue() && (i2 = Build.VERSION.SDK_INT) <= 34 && i2 >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            WindowCompat.setDecorFitsSystemWindows(window, false);
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8410Y5)).booleanValue()) {
            return;
        }
        zzclb zzclbVar = this.f3363v;
        if (zzclbVar != null && !zzclbVar.mo5576F()) {
            this.f3363v.onResume();
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzl() {
        zzr zzrVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3362u;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.f3305u) != null) {
            zzrVar.mo3017K1();
        }
        if (!((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8410Y5)).booleanValue() && this.f3363v != null && (!this.f3361t.isFinishing() || this.f3364w == null)) {
            this.f3363v.onPause();
        }
        m3004k4();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f3346B);
    }
}
