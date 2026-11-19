package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbez implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: G */
    public static final long f7710G = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8342U1)).longValue();

    /* JADX INFO: renamed from: A */
    public final com.google.android.gms.ads.internal.util.zzbu f7711A = new com.google.android.gms.ads.internal.util.zzbu(f7710G);

    /* JADX INFO: renamed from: B */
    public boolean f7712B = false;

    /* JADX INFO: renamed from: C */
    public int f7713C = -1;

    /* JADX INFO: renamed from: D */
    public final HashSet f7714D = new HashSet();

    /* JADX INFO: renamed from: E */
    public final DisplayMetrics f7715E;

    /* JADX INFO: renamed from: F */
    public final Rect f7716F;

    /* JADX INFO: renamed from: s */
    public final Context f7717s;

    /* JADX INFO: renamed from: t */
    public final Application f7718t;

    /* JADX INFO: renamed from: u */
    public final PowerManager f7719u;

    /* JADX INFO: renamed from: v */
    public final KeyguardManager f7720v;

    /* JADX INFO: renamed from: w */
    public BroadcastReceiver f7721w;

    /* JADX INFO: renamed from: x */
    public WeakReference f7722x;

    /* JADX INFO: renamed from: y */
    public final WeakReference f7723y;

    /* JADX INFO: renamed from: z */
    public final zzbfl f7724z;

    public zzbez(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f7717s = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f7719u = (PowerManager) applicationContext.getSystemService("power");
        this.f7720v = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f7718t = application;
            this.f7724z = new zzbfl(application, this);
        }
        this.f7715E = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f7716F = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f7723y;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m4832f(view2);
        }
        this.f7723y = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                m4831e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Rect m4827a(Rect rect) {
        float f2 = rect.left;
        float f3 = this.f7715E.density;
        return new Rect((int) (f2 / f3), (int) (rect.top / f3), (int) (rect.right / f3), (int) (rect.bottom / f3));
    }

    /* JADX INFO: renamed from: b */
    public final void m4828b() {
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbey
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f7709s.m4830d(3);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m4829c(Activity activity, int i2) {
        Window window;
        WeakReference weakReference = this.f7723y;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f7713C = i2;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0132  */
    /* JADX WARN: Code duplicated, block: B:56:0x0137  */
    /* JADX WARN: Code duplicated, block: B:57:0x0139  */
    /* JADX WARN: Code duplicated, block: B:58:0x013d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX INFO: renamed from: d */
    public final void m4830d(int i2) {
        WeakReference weakReference;
        View view;
        boolean globalVisibleRect;
        boolean localVisibleRect;
        ?? arrayList;
        int i3;
        boolean z;
        HashSet hashSet = this.f7714D;
        if (hashSet.isEmpty() || (weakReference = this.f7723y) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e) {
                int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Failure getting view location.", e);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8426Z5)).booleanValue()) {
                rect.left = iArr2[0];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[0];
                rect.top = iArr[1];
            }
            rect.right = view2.getWidth() + rect.left;
            rect.bottom = view2.getHeight() + rect.top;
            view = view2;
        } else {
            view = null;
            globalVisibleRect = false;
            localVisibleRect = false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8390X1)).booleanValue() || view == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            try {
                arrayList = new ArrayList();
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        arrayList.add(m4827a(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("PositionWatcher.getParentScrollViewRects", e2);
                arrayList = Collections.EMPTY_LIST;
            }
        }
        ?? r27 = arrayList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i5 = this.f7713C;
        if (i5 != -1) {
            windowVisibility = i5;
        }
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        com.google.android.gms.ads.internal.util.zzs zzsVar = zztVar.f3703c;
        long jM3201T = com.google.android.gms.ads.internal.util.zzs.m3201T(view);
        zzbio zzbioVar = zzbix.f8384Wb;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        boolean zBooleanValue = ((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue();
        KeyguardManager keyguardManager = this.f7720v;
        PowerManager powerManager = this.f7719u;
        if (zBooleanValue) {
            if (view2 == null || !com.google.android.gms.ads.internal.util.zzs.m3219r(view, powerManager, keyguardManager)) {
                i3 = 0;
            } else if (!globalVisibleRect) {
                i3 = 0;
                globalVisibleRect = false;
            } else if (localVisibleRect) {
                if (jM3201T < ((Integer) zzbivVar2.m5030a(zzbix.f8432Zb)).intValue() || windowVisibility != 0) {
                    i3 = 0;
                } else {
                    i3 = 1;
                    windowVisibility = 0;
                }
                globalVisibleRect = true;
                localVisibleRect = true;
            } else {
                i3 = 0;
                globalVisibleRect = true;
                localVisibleRect = false;
            }
        } else if (view2 == null || !com.google.android.gms.ads.internal.util.zzs.m3219r(view, powerManager, keyguardManager)) {
            i3 = 0;
        } else if (!globalVisibleRect) {
            i3 = 0;
            globalVisibleRect = false;
        } else if (localVisibleRect) {
            if (windowVisibility == 0) {
                i3 = 1;
                windowVisibility = 0;
            } else {
                i3 = 0;
            }
            globalVisibleRect = true;
            localVisibleRect = true;
        } else {
            i3 = 0;
            globalVisibleRect = true;
            localVisibleRect = false;
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8466bc)).booleanValue()) {
            int i6 = true != com.google.android.gms.ads.internal.util.zzs.m3219r(view, powerManager, keyguardManager) ? 0 : 64;
            int i7 = true != globalVisibleRect ? 0 : 8;
            com.google.android.gms.ads.internal.util.zzs.m3211j(view, (jM3201T >= ((long) ((Integer) zzbivVar2.m5030a(zzbix.f8432Zb)).intValue()) ? 32 : 0) | i6 | i7 | (true != localVisibleRect ? 0 : 16) | (windowVisibility == 0 ? 128 : 0) | i3);
        }
        if (i2 == 1 && !this.f7711A.m3140a() && i3 == this.f7712B) {
            return;
        }
        if (i3 != 0 || this.f7712B) {
            z = true;
        } else {
            z = true;
            if (i2 == 1) {
                return;
            }
        }
        zztVar.f3711k.getClass();
        SystemClock.elapsedRealtime();
        powerManager.isScreenOn();
        boolean z2 = (view == null || !view.isAttachedToWindow()) ? false : z;
        int windowVisibility2 = view != null ? view.getWindowVisibility() : 8;
        Rect rectM4827a = m4827a(this.f7716F);
        Rect rectM4827a2 = m4827a(rect);
        Rect rectM4827a3 = m4827a(rect2);
        Rect rectM4827a4 = m4827a(rect3);
        Rect rectM4827a5 = m4827a(rect4);
        float f2 = this.f7715E.density;
        ?? r26 = i3;
        zzbew zzbewVar = new zzbew(z2, windowVisibility2, rectM4827a, rectM4827a2, rectM4827a3, globalVisibleRect, rectM4827a4, localVisibleRect, rectM4827a5, r26, r27);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((zzbex) it.next()).mo4826t(zzbewVar);
        }
        this.f7712B = r26;
    }

    /* JADX INFO: renamed from: e */
    public final void m4831e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f7722x = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f7721w == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzbev zzbevVar = new zzbev(this);
            this.f7721w = zzbevVar;
            Context context = this.f7717s;
            com.google.android.gms.ads.internal.util.zzcg zzcgVar = com.google.android.gms.ads.internal.zzt.f3698C.f3726z;
            synchronized (zzcgVar) {
                if (zzcgVar.f3563d) {
                    zzcgVar.f3561b.put(zzbevVar, intentFilter);
                } else {
                    zzbix.m5032a(context);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8771tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                        context.registerReceiver(zzbevVar, intentFilter);
                    } else {
                        context.registerReceiver(zzbevVar, intentFilter, 4);
                    }
                }
            }
        }
        Application application = this.f7718t;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f7724z);
            } catch (Exception e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4832f(View view) {
        try {
            WeakReference weakReference = this.f7722x;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f7722x = null;
            }
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        BroadcastReceiver broadcastReceiver = this.f7721w;
        if (broadcastReceiver != null) {
            try {
                com.google.android.gms.ads.internal.zzt.f3698C.f3726z.m3145b(this.f7717s, broadcastReceiver);
            } catch (IllegalStateException e3) {
                int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("ActiveViewUnit.stopScreenStatusMonitoring", e4);
            }
            this.f7721w = null;
        }
        Application application = this.f7718t;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f7724z);
            } catch (Exception e5) {
                int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m4829c(activity, 0);
        m4830d(3);
        m4828b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m4830d(3);
        m4828b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m4829c(activity, 4);
        m4830d(3);
        m4828b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m4829c(activity, 0);
        m4830d(3);
        m4828b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m4830d(3);
        m4828b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m4829c(activity, 0);
        m4830d(3);
        m4828b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m4830d(3);
        m4828b();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m4830d(2);
        m4828b();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m4830d(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f7713C = -1;
        m4831e(view);
        m4830d(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f7713C = -1;
        m4830d(3);
        m4828b();
        m4832f(view);
    }
}
