package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfx extends Thread {

    /* JADX INFO: renamed from: A */
    public final int f7785A;

    /* JADX INFO: renamed from: B */
    public final int f7786B;

    /* JADX INFO: renamed from: C */
    public final int f7787C;

    /* JADX INFO: renamed from: D */
    public final int f7788D;

    /* JADX INFO: renamed from: E */
    public final String f7789E;

    /* JADX INFO: renamed from: F */
    public final boolean f7790F;

    /* JADX INFO: renamed from: G */
    public final boolean f7791G;

    /* JADX INFO: renamed from: s */
    public boolean f7792s;

    /* JADX INFO: renamed from: t */
    public boolean f7793t;

    /* JADX INFO: renamed from: u */
    public final Object f7794u;

    /* JADX INFO: renamed from: v */
    public final zzbfo f7795v;

    /* JADX INFO: renamed from: w */
    public final int f7796w;

    /* JADX INFO: renamed from: x */
    public final int f7797x;

    /* JADX INFO: renamed from: y */
    public final int f7798y;

    /* JADX INFO: renamed from: z */
    public final int f7799z;

    public zzbfx() {
        zzbfo zzbfoVar = new zzbfo();
        this.f7792s = false;
        this.f7793t = false;
        this.f7795v = zzbfoVar;
        this.f7794u = new Object();
        this.f7797x = ((Long) zzbko.f8994d.m5057c()).intValue();
        this.f7798y = ((Long) zzbko.f8991a.m5057c()).intValue();
        this.f7799z = ((Long) zzbko.f8995e.m5057c()).intValue();
        this.f7785A = ((Long) zzbko.f8993c.m5057c()).intValue();
        zzbio zzbioVar = zzbix.f8037C0;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        this.f7786B = ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue();
        zzbio zzbioVar2 = zzbix.f8054D0;
        zzbiv zzbivVar = zzbaVar.f3098c;
        this.f7787C = ((Integer) zzbivVar.m5030a(zzbioVar2)).intValue();
        this.f7788D = ((Integer) zzbivVar.m5030a(zzbix.f8071E0)).intValue();
        this.f7796w = ((Long) zzbko.f8996f.m5057c()).intValue();
        this.f7789E = (String) zzbivVar.m5030a(zzbix.f8105G0);
        this.f7790F = ((Boolean) zzbivVar.m5030a(zzbix.f8122H0)).booleanValue();
        this.f7791G = ((Boolean) zzbivVar.m5030a(zzbix.f8139I0)).booleanValue();
        ((Boolean) zzbivVar.m5030a(zzbix.f8156J0)).getClass();
        setName("ContentFetchTask");
    }

    /* JADX INFO: renamed from: a */
    public final zzbfw m4856a(View view, zzbfn zzbfnVar) {
        if (view == null) {
            return new zzbfw(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbfw(this, 0, 0);
            }
            zzbfnVar.m4847c(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzbfw(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzclb)) {
            WebView webView = (WebView) view;
            synchronized (zzbfnVar.f7746g) {
                zzbfnVar.f7752m++;
            }
            webView.post(new zzbfv(this, zzbfnVar, webView, globalVisibleRect));
            return new zzbfw(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzbfw(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            zzbfw zzbfwVarM4856a = m4856a(viewGroup.getChildAt(i4), zzbfnVar);
            i2 += zzbfwVarM4856a.f7783a;
            i3 += zzbfwVarM4856a.f7784b;
        }
        return new zzbfw(this, i2, i3);
    }

    /* JADX INFO: renamed from: b */
    public final void m4857b() {
        synchronized (this.f7794u) {
            this.f7793t = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = true");
            String string = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a(string);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00c9 A[Catch: Exception -> 0x007c, InterruptedException -> 0x007e, TryCatch #7 {InterruptedException -> 0x007e, Exception -> 0x007c, blocks: (B:33:0x0067, B:35:0x0071, B:58:0x00d3, B:50:0x00b3, B:48:0x00a1, B:57:0x00c9, B:56:0x00c0, B:41:0x0080, B:43:0x0086, B:45:0x0090, B:2:0x0000, B:3:0x0006, B:15:0x0019, B:18:0x002d, B:20:0x0033, B:21:0x0037, B:23:0x003d, B:25:0x004b, B:27:0x0051, B:29:0x0057, B:31:0x0061, B:55:0x00bf, B:4:0x0007, B:6:0x000c, B:7:0x000e, B:11:0x0013), top: B:85:0x0067, inners: #0, #5 }] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        View viewFindViewById;
        Application application;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        while (true) {
            try {
                zzbfs zzbfsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3707g;
                synchronized (zzbfsVar.f7771a) {
                    try {
                        zzbfq zzbfqVar = zzbfsVar.f7772b;
                        viewFindViewById = null;
                        application = zzbfqVar != null ? zzbfqVar.f7764t : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (application != null) {
                    ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
                    KeyguardManager keyguardManager = (KeyguardManager) application.getSystemService("keyguard");
                    if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ActivityManager.RunningAppProcessInfo next = it.next();
                                if (Process.myPid() == next.pid) {
                                    if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) application.getSystemService("power")) == null || !powerManager.isScreenOn()) {
                                        break;
                                    }
                                    try {
                                        Activity activityM4854d = com.google.android.gms.ads.internal.zzt.f3698C.f3707g.m4854d();
                                        if (activityM4854d != null) {
                                            try {
                                                if (activityM4854d.getWindow() != null && activityM4854d.getWindow().getDecorView() != null) {
                                                    viewFindViewById = activityM4854d.getWindow().getDecorView().findViewById(R.id.content);
                                                }
                                            } catch (Exception e) {
                                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("ContentFetchTask.extractContent", e);
                                                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Failed getting root view of activity. Content not extracted.");
                                            }
                                            if (viewFindViewById == null) {
                                                break;
                                            }
                                            viewFindViewById.post(new zzbft(this, viewFindViewById));
                                            break;
                                        }
                                        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                        com.google.android.gms.ads.internal.util.client.zzo.m3068a("ContentFetchThread: no activity. Sleeping.");
                                        m4857b();
                                        break;
                                    } catch (InterruptedException e2) {
                                        int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error in ContentFetchTask", e2);
                                    } catch (Exception e3) {
                                        int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error in ContentFetchTask", e3);
                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("ContentFetchTask.run", e3);
                                    }
                                }
                            }
                            int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3068a("ContentFetchTask: sleeping");
                            m4857b();
                            break;
                        }
                    }
                    int i7 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3068a("ContentFetchTask: sleeping");
                    m4857b();
                    break;
                }
                int i8 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("ContentFetchTask: sleeping");
                m4857b();
                break;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("ContentFetchTask.isInForeground", th2);
            }
            Thread.sleep(this.f7796w * 1000);
            Object obj = this.f7794u;
            synchronized (obj) {
                while (this.f7793t) {
                    try {
                        int i9 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3068a("ContentFetchTask: waiting");
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }
}
