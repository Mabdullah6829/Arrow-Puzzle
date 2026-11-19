package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.core.app.NotificationManagerCompat;
import com.google.firebase.firestore.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjv {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ int f20150A = 0;

    /* JADX INFO: renamed from: a */
    public final Context f20151a;

    /* JADX INFO: renamed from: b */
    public final zzff f20152b;

    /* JADX INFO: renamed from: c */
    public final zzguj f20153c;

    /* JADX INFO: renamed from: d */
    public final zzguj f20154d;

    /* JADX INFO: renamed from: e */
    public zzguj f20155e;

    /* JADX INFO: renamed from: f */
    public zzguj f20156f;

    /* JADX INFO: renamed from: g */
    public final zzguj f20157g;

    /* JADX INFO: renamed from: h */
    public final zzgti f20158h;

    /* JADX INFO: renamed from: i */
    public final Looper f20159i;

    /* JADX INFO: renamed from: j */
    public final int f20160j;

    /* JADX INFO: renamed from: k */
    public final zzd f20161k;

    /* JADX INFO: renamed from: l */
    public final int f20162l;

    /* JADX INFO: renamed from: m */
    public final boolean f20163m;

    /* JADX INFO: renamed from: n */
    public final zznk f20164n;

    /* JADX INFO: renamed from: o */
    public final zznj f20165o;

    /* JADX INFO: renamed from: p */
    public final long f20166p;

    /* JADX INFO: renamed from: q */
    public final long f20167q;

    /* JADX INFO: renamed from: r */
    public final int f20168r;

    /* JADX INFO: renamed from: s */
    public final int f20169s;

    /* JADX INFO: renamed from: t */
    public final int f20170t;

    /* JADX INFO: renamed from: u */
    public final int f20171u;

    /* JADX INFO: renamed from: v */
    public final boolean f20172v;

    /* JADX INFO: renamed from: w */
    public boolean f20173w;

    /* JADX INFO: renamed from: x */
    public final String f20174x;

    /* JADX INFO: renamed from: y */
    public final boolean f20175y;

    /* JADX INFO: renamed from: z */
    public final zzjf f20176z;

    static {
        String str = zzfm.f16091a;
        String strM7119a = zzgsz.m7119a(Build.DEVICE);
        if (strM7119a.contains(BuildConfig.TARGET_BACKEND) || strM7119a.contains("emu64a") || strM7119a.contains("emu64x")) {
            return;
        }
        strM7119a.contains("generic");
    }

    public zzjv(final Context context, zznh zznhVar) {
        zzju zzjuVar = new zzju(zznhVar);
        zzjp zzjpVar = new zzjp(context);
        zzguj zzgujVar = new zzguj() { // from class: com.google.android.gms.internal.ads.zzjq
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                int i2 = zzjv.f20150A;
                return new zzaaz(context);
            }
        };
        zzjo zzjoVar = new zzguj() { // from class: com.google.android.gms.internal.ads.zzjo
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return new zzji();
            }
        };
        zzjr zzjrVar = new zzjr(context);
        zzjn zzjnVar = zzjn.f20142a;
        context.getClass();
        this.f20151a = context;
        this.f20153c = zzjuVar;
        this.f20154d = zzjpVar;
        this.f20155e = zzgujVar;
        this.f20156f = zzjoVar;
        this.f20157g = zzjrVar;
        this.f20158h = zzjnVar;
        String str = zzfm.f16091a;
        Looper looperMyLooper = Looper.myLooper();
        this.f20159i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f20161k = zzd.f11854b;
        this.f20162l = 1;
        this.f20163m = true;
        this.f20164n = zznk.f20505c;
        this.f20165o = zznj.f20502b;
        this.f20176z = new zzjf(zzfm.m6519u(20L), zzfm.m6519u(500L));
        this.f20152b = zzdp.f12520a;
        this.f20166p = 500L;
        this.f20167q = 2000L;
        this.f20168r = 600000;
        this.f20169s = Integer.MAX_VALUE;
        this.f20170t = Integer.MAX_VALUE;
        this.f20171u = 600000;
        this.f20172v = true;
        this.f20174x = "";
        this.f20160j = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        if (Build.VERSION.SDK_INT >= 35) {
            int i2 = zzjl.f20134a;
        }
        this.f20175y = true;
    }
}
