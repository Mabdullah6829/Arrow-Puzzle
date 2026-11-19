package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class zzbau extends zzbas {

    /* JADX INFO: renamed from: P */
    public static final Object f7489P = new Object();

    /* JADX INFO: renamed from: Q */
    public static boolean f7490Q = false;

    /* JADX INFO: renamed from: R */
    public static long f7491R;

    /* JADX INFO: renamed from: S */
    public static zzbbc f7492S;

    /* JADX INFO: renamed from: T */
    public static zzbci f7493T;

    /* JADX INFO: renamed from: U */
    public static zzbca f7494U;

    /* JADX INFO: renamed from: V */
    public static zzazt f7495V;

    /* JADX INFO: renamed from: W */
    public static zzbaz f7496W;

    /* JADX INFO: renamed from: N */
    public final zzbat f7497N;

    /* JADX INFO: renamed from: O */
    public zzbcg f7498O;

    public zzbau(Context context, zzbat zzbatVar) {
        super(context);
        new HashMap();
        this.f7497N = zzbatVar;
    }

    /* JADX INFO: renamed from: q */
    public static zzbbz m4699q(Context context, boolean z) {
        if (zzbas.f7465M == null) {
            synchronized (f7489P) {
                try {
                    if (zzbas.f7465M == null) {
                        zzbbz zzbbzVarM4727a = zzbbz.m4727a(context, z, f7496W);
                        if (zzbbzVarM4727a.f7560n) {
                            try {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8577i4)).booleanValue()) {
                                    zzbbzVarM4727a.m4730c("dDkHRfh96kWRNKlCuQv4bcbQkP8hTl8+IryaCt9cMd/svBIVo0Uo/vCqMYwPlijS", "lGOVu04SK1qS7YTVL1GWrSv+Cf1XKJpvbu7KHhGh7cY=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            zzbbzVarM4727a.m4730c("8cGCIT8G/u06HQUQMiN2ifk8cEgbx/Wk97figDVCx+GQZgadMjHBVKMl6PUoXm9E", "8+d2WBKGjAoApH75NCR/Aqn77d5NBFIHb0YR3dAdyeE=", Context.class);
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8644m4)).booleanValue()) {
                                zzbbzVarM4727a.m4730c("iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", new Class[0]);
                            }
                            zzbbzVarM4727a.m4730c("00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", Context.class);
                            zzbbzVarM4727a.m4730c("XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", Context.class);
                            zzbbzVarM4727a.m4730c("m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", Context.class);
                            zzbbzVarM4727a.m4730c("P28XMQKwxb7t4RJM54Abd563bFUm9uASQiuwtqttjr6XDpyPt/FmHs2sVrWjtmTo", "fagQaENWAKeTH7PQjt5vlJiCBcOZOOnM19vGSn9sDlA=", Context.class);
                            Class cls = Boolean.TYPE;
                            zzbbzVarM4727a.m4730c("IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", Context.class, cls);
                            zzbbzVarM4727a.m4730c("GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", Context.class);
                            zzbbzVarM4727a.m4730c("2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", Context.class);
                            zzbbzVarM4727a.m4730c("6fpJXJ/0mHk1BKHieJD271QStaRup/Ve1zgTWQI+7BRFgC5McwJ3e2UlmdWs2x64", "/HyusJxcst6GC6sxvcSXH3tMw8sGRae2S909c2O+Y30=", MotionEvent.class, DisplayMetrics.class);
                            zzbbzVarM4727a.m4730c("t5yhqOem6jC98WR50f+SLS3Uk3sKCmIuutsKOnbEcikRe3zXPIZnZid7K20GrtZF", "M9gaAFNEKOV8YNe1CyHBBl548FwxQflqXjyA5kKaJak=", MotionEvent.class, DisplayMetrics.class);
                            zzbbzVarM4727a.m4730c("y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", new Class[0]);
                            zzbbzVarM4727a.m4730c("9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", new Class[0]);
                            zzbbzVarM4727a.m4730c("XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", new Class[0]);
                            zzbbzVarM4727a.m4730c("c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", new Class[0]);
                            zzbbzVarM4727a.m4730c("AeJvLHy+YL60Equ2/UpZQs9Ok34RPgGTn80fnG3Dx4JfdgAW65En0T0IJD/U8yYs", "sawjrbkZQHxExWkkVyDhv0h3fWiUMmvl7E2YVLpKa+A=", new Class[0]);
                            zzbbzVarM4727a.m4730c("Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", new Class[0]);
                            zzbbzVarM4727a.m4730c("Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", Context.class, cls, String.class);
                            zzbbzVarM4727a.m4730c("X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", StackTraceElement[].class);
                            zzbbzVarM4727a.m4730c("K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", View.class, DisplayMetrics.class, cls, cls);
                            zzbbzVarM4727a.m4730c("NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", Context.class, cls);
                            zzbbzVarM4727a.m4730c("9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", View.class, Activity.class, cls);
                            Class cls2 = Long.TYPE;
                            zzbbzVarM4727a.m4730c("CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", cls2);
                            zzbbzVarM4727a.m4730c("PmZORt2h3FILlRchj3l8QFpH1b4WBi8LAKFq8qXvSXgGWHByOiAJxaqMK9WTkxzB", "Ox3joL3a7fFzYIlEQut3utwsOQDntBqHwHmTdzF1H8c=", new Class[0]);
                            zzbbzVarM4727a.m4730c("sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", Context.class);
                            zzbbzVarM4727a.m4730c("Di5PWAjPtHVrwnaWVY5fRaO+JCXGdUjCOQOYEnFfzjx5tiFy99P00V458wl3+tMS", "24rToqMdm9KIBSWWVKIVzZ6Fu9mGVX1qRD30P4LVPjg=", Context.class);
                            zzbbzVarM4727a.m4730c("0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", NetworkCapabilities.class, cls2, cls2);
                            zzbbzVarM4727a.m4730c("/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", List.class);
                            zzbbzVarM4727a.m4730c("4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", cls2, cls2, cls2, cls2);
                        }
                        zzbas.f7465M = zzbbzVarM4727a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzbas.f7465M;
    }

    /* JADX INFO: renamed from: r */
    public static zzbcb m4700r(zzbbz zzbbzVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws zzbbp {
        Method methodM4731d = zzbbzVar.m4731d("6fpJXJ/0mHk1BKHieJD271QStaRup/Ve1zgTWQI+7BRFgC5McwJ3e2UlmdWs2x64", "/HyusJxcst6GC6sxvcSXH3tMw8sGRae2S909c2O+Y30=");
        if (methodM4731d == null || motionEvent == null) {
            throw new zzbbp();
        }
        try {
            return new zzbcb((String) methodM4731d.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzbbp(e);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m4701t(List list) {
        ExecutorService executorService;
        if (zzbas.f7465M == null || (executorService = zzbas.f7465M.f7548b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8745s3)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            char[] cArr = zzbcc.f7581a;
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            Log.d("zzbau", "class methods got exception: " + stringWriter.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbas, com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: g */
    public final void mo3260g(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8796v3)).booleanValue()) {
            if (this.f7498O == null) {
                zzbbz zzbbzVar = zzbas.f7465M;
                this.f7498O = new zzbcg(zzbbzVar.f7547a, zzbbzVar.f7561o);
            }
            this.f7498O.m4744a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbas
    /* JADX INFO: renamed from: j */
    public final zzaxt mo4692j(Context context) {
        long j2;
        zzbci zzbciVar = f7493T;
        if (zzbciVar != null && zzbciVar.f7607d) {
            zzbciVar.f7605b = System.currentTimeMillis();
        }
        zzbca zzbcaVar = f7494U;
        zzbcaVar.f7563b = zzbcaVar.f7562a;
        zzbcaVar.f7562a = SystemClock.uptimeMillis();
        zzaxt zzaxtVarM4561F0 = zzayt.m4561F0();
        zzbat zzbatVar = this.f7497N;
        String str = zzbatVar.f7487b;
        if (!TextUtils.isEmpty(str)) {
            zzaxtVarM4561F0.m8326l();
            ((zzayt) zzaxtVarM4561F0.f19780t).m4574I0(str);
        }
        zzbbz zzbbzVarM4699q = m4699q(context, zzbatVar.f7486a);
        if (zzbbzVarM4699q.f7548b != null) {
            int iM4732e = zzbbzVarM4699q.m4732e();
            ArrayList arrayList = new ArrayList();
            if (zzbbzVarM4699q.f7560n) {
                arrayList.add(new zzbcn(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e, context, zzbatVar.f7488c, f7495V));
                arrayList.add(new zzbcq(zzbbzVarM4699q, zzaxtVarM4561F0, f7491R, iM4732e));
                arrayList.add(new zzbcz(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e));
                arrayList.add(new zzbdc(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e, context));
                arrayList.add(new zzbdh(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e));
                arrayList.add(new zzbcm(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e, context));
                arrayList.add(new zzbco(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e));
                arrayList.add(new zzbcy(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e));
                arrayList.add(new zzbda(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e));
                arrayList.add(new zzbcp(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e));
                arrayList.add(new zzbcu(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e));
                arrayList.add(new zzbdi(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e));
                arrayList.add(new zzbcl(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e));
                arrayList.add(new zzbdf(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e));
                arrayList.add(new zzbdd(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e));
                zzbci zzbciVar2 = f7493T;
                long j3 = -1;
                if (zzbciVar2 != null) {
                    long j4 = zzbciVar2.f7607d ? zzbciVar2.f7605b - zzbciVar2.f7604a : -1L;
                    long j5 = zzbciVar2.f7606c;
                    zzbciVar2.f7606c = -1L;
                    j3 = j4;
                    j2 = j5;
                } else {
                    j2 = -1;
                }
                arrayList.add(new zzbcx(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e, f7492S, j3, j2));
                arrayList.add(new zzbdb(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e));
                zzbcv zzbcvVar = new zzbcv(zzbbzVarM4699q, "Di5PWAjPtHVrwnaWVY5fRaO+JCXGdUjCOQOYEnFfzjx5tiFy99P00V458wl3+tMS", "24rToqMdm9KIBSWWVKIVzZ6Fu9mGVX1qRD30P4LVPjg=", zzaxtVarM4561F0, iM4732e, 76);
                zzaxtVarM4561F0 = zzaxtVarM4561F0;
                arrayList.add(zzbcvVar);
                arrayList.add(new zzbck(zzbbzVarM4699q, zzaxtVarM4561F0, iM4732e));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8644m4)).booleanValue()) {
                    zzbcr zzbcrVar = new zzbcr(zzbbzVarM4699q, "iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", zzaxtVarM4561F0, iM4732e, 82);
                    zzaxtVarM4561F0 = zzaxtVarM4561F0;
                    arrayList.add(zzbcrVar);
                }
            } else {
                zzaxtVarM4561F0.m4531r(16384L);
            }
            m4701t(arrayList);
        }
        return zzaxtVarM4561F0;
    }

    @Override // com.google.android.gms.internal.ads.zzbas
    /* JADX INFO: renamed from: k */
    public final zzaxt mo4693k(Context context, View view, Activity activity) {
        zzbci zzbciVar = f7493T;
        if (zzbciVar != null && zzbciVar.f7607d) {
            zzbciVar.f7605b = System.currentTimeMillis();
        }
        zzbca zzbcaVar = f7494U;
        zzbcaVar.f7569h = zzbcaVar.f7568g;
        zzbcaVar.f7568g = SystemClock.uptimeMillis();
        zzaxt zzaxtVarM4561F0 = zzayt.m4561F0();
        zzbat zzbatVar = this.f7497N;
        String str = zzbatVar.f7487b;
        if (!TextUtils.isEmpty(str)) {
            zzaxtVarM4561F0.m8326l();
            ((zzayt) zzaxtVarM4561F0.f19780t).m4574I0(str);
        }
        m4702s(m4699q(context, zzbatVar.f7486a), zzaxtVarM4561F0, view, activity, true, context);
        return zzaxtVarM4561F0;
    }

    @Override // com.google.android.gms.internal.ads.zzbas
    /* JADX INFO: renamed from: l */
    public final zzaxt mo4694l(Context context, View view, Activity activity) {
        zzbci zzbciVar = f7493T;
        if (zzbciVar != null && zzbciVar.f7607d) {
            zzbciVar.f7605b = System.currentTimeMillis();
        }
        f7494U.m4741a(context, view);
        zzaxt zzaxtVarM4561F0 = zzayt.m4561F0();
        zzbat zzbatVar = this.f7497N;
        String str = zzbatVar.f7487b;
        zzaxtVarM4561F0.m8326l();
        ((zzayt) zzaxtVarM4561F0.f19780t).m4574I0(str);
        m4702s(m4699q(context, zzbatVar.f7486a), zzaxtVarM4561F0, view, activity, false, context);
        return zzaxtVarM4561F0;
    }

    @Override // com.google.android.gms.internal.ads.zzbas
    /* JADX INFO: renamed from: m */
    public final zzbcb mo4695m(MotionEvent motionEvent) throws zzbbp {
        Method methodM4731d = zzbas.f7465M.m4731d("t5yhqOem6jC98WR50f+SLS3Uk3sKCmIuutsKOnbEcikRe3zXPIZnZid7K20GrtZF", "M9gaAFNEKOV8YNe1CyHBBl548FwxQflqXjyA5kKaJak=");
        if (methodM4731d == null || motionEvent == null) {
            throw new zzbbp();
        }
        try {
            return new zzbcb((String) methodM4731d.invoke(null, motionEvent, this.f7476K));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzbbp(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbas
    /* JADX INFO: renamed from: n */
    public final long mo4696n(StackTraceElement[] stackTraceElementArr) throws zzbbp {
        Method methodM4731d = zzbas.f7465M.m4731d("X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=");
        if (methodM4731d == null || stackTraceElementArr == null) {
            throw new zzbbp();
        }
        try {
            return new zzbbq((String) methodM4731d.invoke(null, stackTraceElementArr)).f7526a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzbbp(e);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m4702s(zzbbz zzbbzVar, zzaxt zzaxtVar, View view, Activity activity, boolean z, Context context) {
        ArrayList arrayList;
        long j2;
        long j3;
        MotionEvent motionEvent;
        List listAsList;
        if (zzbbzVar.f7560n) {
            synchronized (this) {
                try {
                    try {
                        zzbcb zzbcbVarM4700r = m4700r(zzbbzVar, this.f7478s, this.f7476K);
                        Long l2 = zzbcbVarM4700r.f7570a;
                        if (l2 != null) {
                            long jLongValue = l2.longValue();
                            zzaxtVar.m8326l();
                            ((zzayt) zzaxtVar.f19780t).m4586O0(jLongValue);
                        }
                        Long l3 = zzbcbVarM4700r.f7571b;
                        if (l3 != null) {
                            long jLongValue2 = l3.longValue();
                            zzaxtVar.m8326l();
                            ((zzayt) zzaxtVar.f19780t).m4588P0(jLongValue2);
                        }
                        Long l4 = zzbcbVarM4700r.f7572c;
                        if (l4 != null) {
                            long jLongValue3 = l4.longValue();
                            zzaxtVar.m8326l();
                            ((zzayt) zzaxtVar.f19780t).m4590Q0(jLongValue3);
                        }
                        if (this.f7475J) {
                            Long l5 = zzbcbVarM4700r.f7573d;
                            if (l5 != null) {
                                long jLongValue4 = l5.longValue();
                                zzaxtVar.m8326l();
                                ((zzayt) zzaxtVar.f19780t).m4575J(jLongValue4);
                            }
                            Long l6 = zzbcbVarM4700r.f7574e;
                            if (l6 != null) {
                                long jLongValue5 = l6.longValue();
                                zzaxtVar.m8326l();
                                ((zzayt) zzaxtVar.f19780t).m4577K(jLongValue5);
                            }
                        }
                    } catch (zzbbp unused) {
                    }
                    zzayp zzaypVarM4533D = zzayq.m4533D();
                    if (this.f7480u > 0) {
                        DisplayMetrics displayMetrics = this.f7476K;
                        char[] cArr = zzbcc.f7581a;
                        if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                            long jM4743b = zzbcc.m4743b(this.f7467B, displayMetrics);
                            zzaypVarM4533D.m8326l();
                            ((zzayq) zzaypVarM4533D.f19780t).m4545P(jM4743b);
                            long jM4743b2 = zzbcc.m4743b(this.f7472G - this.f7470E, this.f7476K);
                            zzaypVarM4533D.m8326l();
                            ((zzayq) zzaypVarM4533D.f19780t).m4546Q(jM4743b2);
                            long jM4743b3 = zzbcc.m4743b(this.f7473H - this.f7471F, this.f7476K);
                            zzaypVarM4533D.m8326l();
                            ((zzayq) zzaypVarM4533D.f19780t).m4547R(jM4743b3);
                            long jM4743b4 = zzbcc.m4743b(this.f7470E, this.f7476K);
                            zzaypVarM4533D.m8326l();
                            ((zzayq) zzaypVarM4533D.f19780t).m4550U(jM4743b4);
                            long jM4743b5 = zzbcc.m4743b(this.f7471F, this.f7476K);
                            zzaypVarM4533D.m8326l();
                            ((zzayq) zzaypVarM4533D.f19780t).m4551V(jM4743b5);
                            if (this.f7475J && (motionEvent = this.f7478s) != null) {
                                long jM4743b6 = zzbcc.m4743b(((this.f7470E - this.f7472G) + motionEvent.getRawX()) - this.f7478s.getX(), this.f7476K);
                                if (jM4743b6 != 0) {
                                    zzaypVarM4533D.m8326l();
                                    ((zzayq) zzaypVarM4533D.f19780t).m4548S(jM4743b6);
                                }
                                long jM4743b7 = zzbcc.m4743b(((this.f7471F - this.f7473H) + this.f7478s.getRawY()) - this.f7478s.getY(), this.f7476K);
                                if (jM4743b7 != 0) {
                                    zzaypVarM4533D.m8326l();
                                    ((zzayq) zzaypVarM4533D.f19780t).m4549T(jM4743b7);
                                }
                            }
                        }
                    }
                    try {
                        zzbcb zzbcbVarMo4695m = mo4695m(this.f7478s);
                        Long l7 = zzbcbVarMo4695m.f7570a;
                        if (l7 != null) {
                            long jLongValue6 = l7.longValue();
                            zzaypVarM4533D.m8326l();
                            ((zzayq) zzaypVarM4533D.f19780t).m4534E(jLongValue6);
                        }
                        Long l8 = zzbcbVarMo4695m.f7571b;
                        if (l8 != null) {
                            long jLongValue7 = l8.longValue();
                            zzaypVarM4533D.m8326l();
                            ((zzayq) zzaypVarM4533D.f19780t).m4535F(jLongValue7);
                        }
                        long jLongValue8 = zzbcbVarMo4695m.f7572c.longValue();
                        zzaypVarM4533D.m8326l();
                        ((zzayq) zzaypVarM4533D.f19780t).m4541L(jLongValue8);
                        if (this.f7475J) {
                            Long l9 = zzbcbVarMo4695m.f7574e;
                            if (l9 != null) {
                                long jLongValue9 = l9.longValue();
                                zzaypVarM4533D.m8326l();
                                ((zzayq) zzaypVarM4533D.f19780t).m4536G(jLongValue9);
                            }
                            Long l10 = zzbcbVarMo4695m.f7573d;
                            if (l10 != null) {
                                long jLongValue10 = l10.longValue();
                                zzaypVarM4533D.m8326l();
                                ((zzayq) zzaypVarM4533D.f19780t).m4539J(jLongValue10);
                            }
                            Long l11 = zzbcbVarMo4695m.f7575f;
                            if (l11 != null) {
                                int i2 = l11.longValue() != 0 ? 2 : 1;
                                zzaypVarM4533D.m8326l();
                                ((zzayq) zzaypVarM4533D.f19780t).m4552W(i2);
                            }
                            long j4 = this.f7481v;
                            if (j4 > 0) {
                                DisplayMetrics displayMetrics2 = this.f7476K;
                                char[] cArr2 = zzbcc.f7581a;
                                Long lValueOf = displayMetrics2 != null && (displayMetrics2.density > 0.0f ? 1 : (displayMetrics2.density == 0.0f ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.f7466A / j4)) : null;
                                if (lValueOf != null) {
                                    long jLongValue11 = lValueOf.longValue();
                                    zzaypVarM4533D.m8326l();
                                    ((zzayq) zzaypVarM4533D.f19780t).m4537H(jLongValue11);
                                } else {
                                    zzaypVarM4533D.m8326l();
                                    ((zzayq) zzaypVarM4533D.f19780t).m4538I();
                                }
                                long jRound = Math.round(this.f7485z / this.f7481v);
                                zzaypVarM4533D.m8326l();
                                ((zzayq) zzaypVarM4533D.f19780t).m4540K(jRound);
                            }
                            Long l12 = zzbcbVarMo4695m.f7578i;
                            if (l12 != null) {
                                long jLongValue12 = l12.longValue();
                                zzaypVarM4533D.m8326l();
                                ((zzayq) zzaypVarM4533D.f19780t).m4543N(jLongValue12);
                            }
                            Long l13 = zzbcbVarMo4695m.f7579j;
                            if (l13 != null) {
                                long jLongValue13 = l13.longValue();
                                zzaypVarM4533D.m8326l();
                                ((zzayq) zzaypVarM4533D.f19780t).m4542M(jLongValue13);
                            }
                            Long l14 = zzbcbVarMo4695m.f7580k;
                            if (l14 != null) {
                                int i3 = l14.longValue() != 0 ? 2 : 1;
                                zzaypVarM4533D.m8326l();
                                ((zzayq) zzaypVarM4533D.f19780t).m4553X(i3);
                            }
                        }
                    } catch (zzbbp unused2) {
                    }
                    long j5 = this.f7484y;
                    if (j5 > 0) {
                        zzaypVarM4533D.m8326l();
                        ((zzayq) zzaypVarM4533D.f19780t).m4544O(j5);
                    }
                    zzayq zzayqVar = (zzayq) zzaypVarM4533D.m8328o();
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4601W(zzayqVar);
                    long j6 = this.f7480u;
                    if (j6 > 0) {
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4583N(j6);
                    }
                    long j7 = this.f7481v;
                    if (j7 > 0) {
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4581M(j7);
                    }
                    long j8 = this.f7482w;
                    if (j8 > 0) {
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4579L(j8);
                    }
                    long j9 = this.f7483x;
                    if (j9 > 0) {
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4585O(j9);
                    }
                    try {
                        LinkedList linkedList = this.f7479t;
                        int size = linkedList.size() - 1;
                        if (size > 0) {
                            zzaxtVar.m8326l();
                            ((zzayt) zzaxtVar.f19780t).m4603Y();
                            for (int i4 = 0; i4 < size; i4++) {
                                zzbcb zzbcbVarM4700r2 = m4700r(zzbas.f7465M, (MotionEvent) linkedList.get(i4), this.f7476K);
                                zzayp zzaypVarM4533D2 = zzayq.m4533D();
                                long jLongValue14 = zzbcbVarM4700r2.f7570a.longValue();
                                zzaypVarM4533D2.m8326l();
                                ((zzayq) zzaypVarM4533D2.f19780t).m4534E(jLongValue14);
                                long jLongValue15 = zzbcbVarM4700r2.f7571b.longValue();
                                zzaypVarM4533D2.m8326l();
                                ((zzayq) zzaypVarM4533D2.f19780t).m4535F(jLongValue15);
                                zzayq zzayqVar2 = (zzayq) zzaypVarM4533D2.m8328o();
                                zzaxtVar.m8326l();
                                ((zzayt) zzaxtVar.f19780t).m4602X(zzayqVar2);
                            }
                        }
                    } catch (zzbbp unused3) {
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4603Y();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            arrayList = new ArrayList();
            listAsList = arrayList;
            if (zzbbzVar.f7548b != null) {
                int iM4732e = zzbbzVar.m4732e();
                zzbio zzbioVar = zzbix.f8023B3;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    arrayList.add(new zzbcn(zzbbzVar, zzaxtVar, iM4732e, context, this.f7497N.f7488c, f7495V));
                    arrayList.add(new zzbcm(zzbbzVar, zzaxtVar, iM4732e, context));
                    arrayList.add(new zzbdc(zzbbzVar, zzaxtVar, iM4732e, context));
                    arrayList.add(new zzbdh(zzbbzVar, zzaxtVar, iM4732e));
                    zzbci zzbciVar = f7493T;
                    if (zzbciVar != null) {
                        long j10 = zzbciVar.f7607d ? zzbciVar.f7605b - zzbciVar.f7604a : -1L;
                        long j11 = zzbciVar.f7606c;
                        zzbciVar.f7606c = -1L;
                        j3 = j10;
                        j2 = j11;
                    } else {
                        j2 = -1;
                        j3 = -1;
                    }
                    arrayList.add(new zzbcx(zzbbzVar, zzaxtVar, iM4732e, f7492S, j3, j2));
                    arrayList.add(new zzbdb(zzbbzVar, zzaxtVar, iM4732e));
                }
                arrayList.add(new zzbcs(zzbbzVar, zzaxtVar));
                arrayList.add(new zzbcz(zzbbzVar, zzaxtVar, iM4732e));
                arrayList.add(new zzbcq(zzbbzVar, zzaxtVar, f7491R, iM4732e));
                arrayList.add(new zzbcp(zzbbzVar, zzaxtVar, iM4732e));
                arrayList.add(new zzbcy(zzbbzVar, zzaxtVar, iM4732e));
                arrayList.add(new zzbda(zzbbzVar, zzaxtVar, iM4732e));
                arrayList.add(new zzbcu(zzbbzVar, zzaxtVar, iM4732e));
                arrayList.add(new zzbco(zzbbzVar, zzaxtVar, iM4732e));
                arrayList.add(new zzbdi(zzbbzVar, zzaxtVar, iM4732e));
                arrayList.add(new zzbcl(zzbbzVar, zzaxtVar, iM4732e));
                arrayList.add(new zzbdf(zzbbzVar, zzaxtVar, iM4732e));
                arrayList.add(new zzbde(zzbbzVar, zzaxtVar, iM4732e, new Throwable().getStackTrace()));
                arrayList.add(new zzbdj(zzbbzVar, zzaxtVar, iM4732e, view));
                arrayList.add(new zzbdd(zzbbzVar, zzaxtVar, iM4732e));
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8762t3)).booleanValue()) {
                    arrayList.add(new zzbcj(zzbbzVar, zzaxtVar, iM4732e, view, activity));
                }
                arrayList.add(new zzbck(zzbbzVar, zzaxtVar, iM4732e));
                if (!z) {
                    arrayList.add(new zzbct(zzbbzVar, zzaxtVar, iM4732e, f7494U));
                    arrayList.add(new zzbcw(zzbbzVar, zzaxtVar, iM4732e, this.f7477L));
                    listAsList = arrayList;
                } else if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8796v3)).booleanValue()) {
                    listAsList = arrayList;
                    arrayList.add(new zzbdg(zzbbzVar, zzaxtVar, iM4732e, this.f7498O));
                    listAsList = arrayList;
                }
            }
        } else {
            zzaxtVar.m4531r(16384L);
            listAsList = Arrays.asList(new zzbcs(zzbbzVar, zzaxtVar));
        }
        listAsList = arrayList;
        m4701t(listAsList);
    }
}
