package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcg implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: E */
    public static final Handler f7589E = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: A */
    public final zzbbo f7590A;

    /* JADX INFO: renamed from: B */
    public byte f7591B = -1;

    /* JADX INFO: renamed from: C */
    public int f7592C = -1;

    /* JADX INFO: renamed from: D */
    public long f7593D = -3;

    /* JADX INFO: renamed from: s */
    public final Context f7594s;

    /* JADX INFO: renamed from: t */
    public final Application f7595t;

    /* JADX INFO: renamed from: u */
    public final PowerManager f7596u;

    /* JADX INFO: renamed from: v */
    public final KeyguardManager f7597v;

    /* JADX INFO: renamed from: w */
    public BroadcastReceiver f7598w;

    /* JADX INFO: renamed from: x */
    public final zzbbs f7599x;

    /* JADX INFO: renamed from: y */
    public WeakReference f7600y;

    /* JADX INFO: renamed from: z */
    public WeakReference f7601z;

    public zzbcg(Context context, zzbbs zzbbsVar) {
        Context applicationContext = context.getApplicationContext();
        this.f7594s = applicationContext;
        this.f7599x = zzbbsVar;
        this.f7596u = (PowerManager) applicationContext.getSystemService("power");
        this.f7597v = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f7595t = application;
            this.f7590A = new zzbbo(application, this);
        }
        m4744a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m4744a(View view) {
        long j2;
        WeakReference weakReference = this.f7601z;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m4748e(view2);
        }
        this.f7601z = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                m4747d(view);
            }
            view.addOnAttachStateChangeListener(this);
            j2 = -2;
        } else {
            j2 = -3;
        }
        this.f7593D = j2;
    }

    /* JADX INFO: renamed from: b */
    public final void m4745b(Activity activity, int i2) {
        Window window;
        if (this.f7601z == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        WeakReference weakReference = this.f7601z;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f7592C = i2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0086  */
    /* JADX INFO: renamed from: c */
    public final void m4746c() {
        Activity activity;
        WeakReference weakReference = this.f7601z;
        if (weakReference == null) {
            return;
        }
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            this.f7593D = -3L;
            this.f7591B = (byte) -1;
            return;
        }
        int i2 = 0;
        int i3 = view.getVisibility() != 0 ? 1 : 0;
        if (!view.isShown()) {
            i3 |= 2;
        }
        PowerManager powerManager = this.f7596u;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i3 |= 4;
        }
        if (!this.f7599x.f7530a) {
            KeyguardManager keyguardManager = this.f7597v;
            if (keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode()) {
                i3 |= 8;
            } else {
                char[] cArr = zzbcc.f7581a;
                View rootView = view.getRootView();
                if (rootView == null) {
                    rootView = view;
                }
                Context context = rootView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper) || i2 >= 10) {
                        activity = null;
                        break;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                        i2++;
                    }
                }
                if (activity != null) {
                    Window window = activity.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes == null || (attributes.flags & 524288) == 0) {
                        i3 |= 8;
                    }
                } else {
                    i3 |= 8;
                }
            }
        }
        if (!view.getGlobalVisibleRect(new Rect())) {
            i3 |= 16;
        }
        if (!view.getLocalVisibleRect(new Rect())) {
            i3 |= 32;
        }
        int windowVisibility = view.getWindowVisibility();
        int i4 = this.f7592C;
        if (i4 != -1) {
            windowVisibility = i4;
        }
        if (windowVisibility != 0) {
            i3 |= 64;
        }
        if (this.f7591B != i3) {
            this.f7591B = (byte) i3;
            this.f7593D = i3 == 0 ? SystemClock.elapsedRealtime() : (-3) - ((long) i3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4747d(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f7600y = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f7598w == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzbcf zzbcfVar = new zzbcf(this);
            this.f7598w = zzbcfVar;
            this.f7594s.registerReceiver(zzbcfVar, intentFilter);
        }
        Application application = this.f7595t;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f7590A);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4748e(View view) {
        try {
            WeakReference weakReference = this.f7600y;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f7600y = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f7598w;
        if (broadcastReceiver != null) {
            try {
                this.f7594s.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f7598w = null;
        }
        Application application = this.f7595t;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f7590A);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m4745b(activity, 0);
        m4746c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m4746c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m4745b(activity, 4);
        m4746c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m4745b(activity, 0);
        m4746c();
        f7589E.post(new zzbce(this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m4746c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m4745b(activity, 0);
        m4746c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m4746c();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m4746c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m4746c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f7592C = -1;
        m4747d(view);
        m4746c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f7592C = -1;
        m4746c();
        f7589E.post(new zzbce(this));
        m4748e(view);
    }
}
