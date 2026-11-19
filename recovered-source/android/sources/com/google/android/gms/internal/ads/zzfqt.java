package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfqt implements Runnable {

    /* JADX INFO: renamed from: B */
    public static final Object f16344B = new Object();

    /* JADX INFO: renamed from: C */
    public static final Object f16345C = new Object();

    /* JADX INFO: renamed from: D */
    public static final Object f16346D = new Object();

    /* JADX INFO: renamed from: E */
    public static Boolean f16347E;

    /* JADX INFO: renamed from: s */
    public final Context f16349s;

    /* JADX INFO: renamed from: t */
    public final VersionInfoParcel f16350t;

    /* JADX INFO: renamed from: w */
    public int f16353w;

    /* JADX INFO: renamed from: x */
    public final zzdxh f16354x;

    /* JADX INFO: renamed from: y */
    public final AbstractCollection f16355y;

    /* JADX INFO: renamed from: z */
    public final zzcnn f16356z;

    /* JADX INFO: renamed from: u */
    public final zzfqx f16351u = zzfra.m6618E();

    /* JADX INFO: renamed from: v */
    public String f16352v = "";

    /* JADX INFO: renamed from: A */
    public boolean f16348A = false;

    public zzfqt(Context context, VersionInfoParcel versionInfoParcel, zzdxh zzdxhVar, zzcbs zzcbsVar, zzcnn zzcnnVar) {
        this.f16349s = context;
        this.f16350t = versionInfoParcel;
        this.f16354x = zzdxhVar;
        this.f16356z = zzcnnVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8430Z9)).booleanValue()) {
            this.f16355y = com.google.android.gms.ads.internal.util.zzs.m3192J();
        } else {
            zzgzi zzgziVar = zzgwt.f18303t;
            this.f16355y = zzgyo.f18355w;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m6587a() {
        boolean zBooleanValue;
        synchronized (f16344B) {
            try {
                if (f16347E == null) {
                    if (((Boolean) zzbkq.f9008b.m5057c()).booleanValue()) {
                        f16347E = Boolean.valueOf(Math.random() < ((Double) zzbkq.f9007a.m5057c()).doubleValue());
                    } else {
                        f16347E = Boolean.FALSE;
                    }
                }
                zBooleanValue = f16347E.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public final void m6588b(final zzfqj zzfqjVar) {
        ((zzhbb) zzcfy.f9946a).submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqs
            @Override // java.lang.Runnable
            public final void run() {
                zzbxx zzbxxVar;
                zzfqt zzfqtVar = this.f16342s;
                zzfqj zzfqjVar2 = zzfqjVar;
                synchronized (zzfqt.f16346D) {
                    try {
                        if (!zzfqtVar.f16348A) {
                            zzfqtVar.f16348A = true;
                            if (zzfqt.m6587a()) {
                                try {
                                    com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                                    zzfqtVar.f16352v = com.google.android.gms.ads.internal.util.zzs.m3197P(zzfqtVar.f16349s);
                                } catch (RemoteException | RuntimeException e) {
                                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("CuiMonitor.gettingAppIdFromManifest", e);
                                }
                                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f4157b;
                                Context context = zzfqtVar.f16349s;
                                googleApiAvailabilityLight.getClass();
                                zzfqtVar.f16353w = GoogleApiAvailabilityLight.m3401a(context);
                                zzbio zzbioVar = zzbix.f8350U9;
                                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                                int iIntValue = ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue();
                                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8704pd)).booleanValue()) {
                                    long j2 = iIntValue;
                                    ((ScheduledThreadPoolExecutor) zzcfy.f9949d).scheduleWithFixedDelay(zzfqtVar, j2, j2, TimeUnit.MILLISECONDS);
                                } else {
                                    long j3 = iIntValue;
                                    ((ScheduledThreadPoolExecutor) zzcfy.f9949d).scheduleAtFixedRate(zzfqtVar, j3, j3, TimeUnit.MILLISECONDS);
                                }
                                zzbio zzbioVar2 = zzbix.f8447aa;
                                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar2)).booleanValue()) {
                                    zzcnn zzcnnVar = zzfqtVar.f16356z;
                                    zzcnnVar.getClass();
                                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar2)).booleanValue() && !zzcnnVar.f10609e.getAndSet(true)) {
                                        zzcnnVar.m5678a();
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (zzfqt.m6587a() && zzfqjVar2 != null) {
                    synchronized (zzfqt.f16345C) {
                        try {
                            zzfqx zzfqxVar = zzfqtVar.f16351u;
                            int iM6619D = ((zzfra) zzfqxVar.f19780t).m6619D();
                            zzbio zzbioVar3 = zzbix.f8366V9;
                            com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f3095e;
                            if (iM6619D >= ((Integer) zzbaVar2.f3098c.m5030a(zzbioVar3)).intValue()) {
                                return;
                            }
                            zzfqu zzfquVarM6589F = zzfqw.m6589F();
                            int i2 = zzfqjVar2.f16321m;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6613b0(i2);
                            boolean z = zzfqjVar2.f16310b;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6592G(z);
                            long j4 = zzfqjVar2.f16309a;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6593H(j4);
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6614c0();
                            String str = zzfqtVar.f16350t.f3396s;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6595J(str);
                            String str2 = zzfqtVar.f16352v;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6596K(str2);
                            String str3 = Build.VERSION.RELEASE;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6597L(str3);
                            int i3 = Build.VERSION.SDK_INT;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6598M(i3);
                            int i4 = zzfqjVar2.f16323o;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6590D(i4);
                            int i5 = zzfqjVar2.f16311c;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6600O(i5);
                            long j5 = zzfqtVar.f16353w;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6601P(j5);
                            int i6 = zzfqjVar2.f16322n;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6591E(i6);
                            String str4 = zzfqjVar2.f16312d;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6602Q(str4);
                            String str5 = zzfqjVar2.f16313e;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6603R(str5);
                            String str6 = zzfqjVar2.f16314f;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6604S(str6);
                            zzdxg zzdxgVarM6081b = zzfqtVar.f16354x.m6081b(zzfqjVar2.f16314f);
                            String string = (zzdxgVarM6081b == null || (zzbxxVar = zzdxgVarM6081b.f13244b) == null) ? "" : zzbxxVar.toString();
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6605T(string);
                            String str7 = zzfqjVar2.f16315g;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6606U(str7);
                            zzfqv zzfqvVar = zzfqjVar2.f16316h;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6610Y(zzfqvVar);
                            String str8 = zzfqjVar2.f16319k;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6609X(str8);
                            String str9 = zzfqjVar2.f16317i;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6607V(str9);
                            String str10 = zzfqjVar2.f16318j;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6608W(str10);
                            long j6 = zzfqjVar2.f16320l;
                            zzfquVarM6589F.m8326l();
                            ((zzfqw) zzfquVarM6589F.f19780t).m6594I(j6);
                            if (((Boolean) zzbaVar2.f3098c.m5030a(zzbix.f8430Z9)).booleanValue()) {
                                AbstractCollection abstractCollection = zzfqtVar.f16355y;
                                zzfquVarM6589F.m8326l();
                                ((zzfqw) zzfquVarM6589F.f19780t).m6599N(abstractCollection);
                            }
                            if (((Boolean) zzbaVar2.f3098c.m5030a(zzbix.f8447aa)).booleanValue()) {
                                zzcnn zzcnnVar2 = zzfqtVar.f16356z;
                                zziid zziidVar = zzcnnVar2.f10606b;
                                String str11 = zzcnnVar2.f10605a;
                                if (zziidVar != null) {
                                    zzfquVarM6589F.m8326l();
                                    ((zzfqw) zzfquVarM6589F.f19780t).m6611Z(zziidVar);
                                }
                                if (str11 != null) {
                                    zzfquVarM6589F.m8326l();
                                    ((zzfqw) zzfquVarM6589F.f19780t).m6612a0(str11);
                                }
                            }
                            zzfqy zzfqyVarM6615D = zzfqz.m6615D();
                            zzfqyVarM6615D.m8326l();
                            ((zzfqz) zzfqyVarM6615D.f19780t).m6616E((zzfqw) zzfquVarM6589F.m8328o());
                            zzfqxVar.m8326l();
                            ((zzfra) zzfqxVar.f19780t).m6620F((zzfqz) zzfqyVarM6615D.m8328o());
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrM8099h;
        if (m6587a()) {
            Object obj = f16345C;
            synchronized (obj) {
                try {
                    if (((zzfra) this.f16351u.f19780t).m6619D() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfqx zzfqxVar = this.f16351u;
                            bArrM8099h = ((zzfra) zzfqxVar.m8328o()).m8099h();
                            zzfqxVar.m8326l();
                            ((zzfra) zzfqxVar.f19780t).m6621G();
                        }
                        zzeis zzeisVar = new zzeis((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8334T9), 60000, new HashMap(), bArrM8099h, "application/x-protobuf");
                        Context context = this.f16349s;
                        String str = this.f16350t.f3396s;
                        Binder.getCallingUid();
                        new zzeiu(context, str, null).mo5874b(zzeisVar);
                    } catch (Exception e) {
                        if ((e instanceof zzeel) && ((zzeel) e).f13751s == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("CuiMonitor.sendCuiPing", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
