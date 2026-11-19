package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzchv {

    /* JADX INFO: renamed from: r */
    public static final boolean f10094r;

    /* JADX INFO: renamed from: a */
    public final Context f10095a;

    /* JADX INFO: renamed from: b */
    public final String f10096b;

    /* JADX INFO: renamed from: c */
    public final VersionInfoParcel f10097c;

    /* JADX INFO: renamed from: d */
    public final zzbjj f10098d;

    /* JADX INFO: renamed from: e */
    public final zzbjm f10099e;

    /* JADX INFO: renamed from: f */
    public final com.google.android.gms.ads.internal.util.zzbf f10100f;

    /* JADX INFO: renamed from: g */
    public final long[] f10101g;

    /* JADX INFO: renamed from: h */
    public final String[] f10102h;

    /* JADX INFO: renamed from: i */
    public boolean f10103i;

    /* JADX INFO: renamed from: j */
    public boolean f10104j;

    /* JADX INFO: renamed from: k */
    public boolean f10105k;

    /* JADX INFO: renamed from: l */
    public boolean f10106l;

    /* JADX INFO: renamed from: m */
    public boolean f10107m;

    /* JADX INFO: renamed from: n */
    public zzcha f10108n;

    /* JADX INFO: renamed from: o */
    public boolean f10109o;

    /* JADX INFO: renamed from: p */
    public boolean f10110p;

    /* JADX INFO: renamed from: q */
    public long f10111q;

    static {
        f10094r = com.google.android.gms.ads.internal.client.zzay.f3085g.f3090e.nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8553ge)).intValue();
    }

    public zzchv(Context context, VersionInfoParcel versionInfoParcel, String str, zzbjm zzbjmVar, zzbjj zzbjjVar) {
        com.google.android.gms.ads.internal.util.zzbe zzbeVar = new com.google.android.gms.ads.internal.util.zzbe();
        zzbeVar.m3109a("min_1", Double.MIN_VALUE, 1.0d);
        zzbeVar.m3109a("1_5", 1.0d, 5.0d);
        zzbeVar.m3109a("5_10", 5.0d, 10.0d);
        zzbeVar.m3109a("10_20", 10.0d, 20.0d);
        zzbeVar.m3109a("20_30", 20.0d, 30.0d);
        zzbeVar.m3109a("30_max", 30.0d, Double.MAX_VALUE);
        this.f10100f = new com.google.android.gms.ads.internal.util.zzbf(zzbeVar);
        this.f10103i = false;
        this.f10104j = false;
        this.f10105k = false;
        this.f10106l = false;
        this.f10111q = -1L;
        this.f10095a = context;
        this.f10097c = versionInfoParcel;
        this.f10096b = str;
        this.f10099e = zzbjmVar;
        this.f10098d = zzbjjVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8606k0);
        if (str2 == null) {
            this.f10102h = new String[0];
            this.f10101g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.f10102h = new String[length];
        this.f10101g = new long[length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                this.f10101g[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Unable to parse frame hash target time number.", e);
                this.f10101g[i2] = -1;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5480a(zzcha zzchaVar) {
        zzbjj zzbjjVar = this.f10098d;
        zzbjm zzbjmVar = this.f10099e;
        zzbje.m5038a(zzbjmVar, zzbjjVar, "vpc2");
        this.f10103i = true;
        zzbjmVar.m5044c("vpn", zzchaVar.mo5409i());
        this.f10108n = zzchaVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m5481b() {
        if (!f10094r || this.f10109o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f10096b);
        bundle.putString("player", this.f10108n.mo5409i());
        com.google.android.gms.ads.internal.util.zzbf zzbfVar = this.f10100f;
        String[] strArr = zzbfVar.f3520a;
        ArrayList arrayList = new ArrayList(strArr.length);
        int i2 = 0;
        while (i2 < strArr.length) {
            String str = strArr[i2];
            double[] dArr = zzbfVar.f3522c;
            double[] dArr2 = zzbfVar.f3521b;
            int[] iArr = zzbfVar.f3523d;
            double d = dArr[i2];
            double d2 = dArr2[i2];
            int i3 = iArr[i2];
            arrayList.add(new com.google.android.gms.ads.internal.util.zzbd(str, d, d2, ((double) i3) / ((double) zzbfVar.f3524e), i3));
            i2++;
            zzbfVar = zzbfVar;
            strArr = strArr;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            com.google.android.gms.ads.internal.util.zzbd zzbdVar = (com.google.android.gms.ads.internal.util.zzbd) obj;
            String str2 = zzbdVar.f3512a;
            String strValueOf = String.valueOf(str2);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(zzbdVar.f3516e));
            String strValueOf2 = String.valueOf(str2);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(zzbdVar.f3515d));
        }
        int i5 = 0;
        while (true) {
            long[] jArr = this.f10101g;
            if (i5 >= jArr.length) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3703c.m3233G(this.f10095a, this.f10097c.f3396s, bundle);
                this.f10109o = true;
                return;
            }
            String str3 = this.f10102h[i5];
            if (str3 != null) {
                Long lValueOf = Long.valueOf(jArr[i5]);
                new StringBuilder(lValueOf.toString().length() + 3);
                bundle.putString("fh_".concat(lValueOf.toString()), str3);
            }
            i5++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5482c(zzcha zzchaVar) {
        if (this.f10105k && !this.f10106l) {
            if (com.google.android.gms.ads.internal.util.zze.m3152m() && !this.f10106l) {
                com.google.android.gms.ads.internal.util.zze.m3150k("VideoMetricsMixin first frame");
            }
            zzbje.m5038a(this.f10099e, this.f10098d, "vff2");
            this.f10106l = true;
        }
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        long jNanoTime = System.nanoTime();
        if (this.f10107m && this.f10110p && this.f10111q != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L) / (jNanoTime - this.f10111q);
            com.google.android.gms.ads.internal.util.zzbf zzbfVar = this.f10100f;
            zzbfVar.f3524e++;
            int i2 = 0;
            while (true) {
                double[] dArr = zzbfVar.f3522c;
                if (i2 >= dArr.length) {
                    break;
                }
                double d = dArr[i2];
                if (d <= nanos && nanos < zzbfVar.f3521b[i2]) {
                    int[] iArr = zzbfVar.f3523d;
                    iArr[i2] = iArr[i2] + 1;
                }
                if (nanos < d) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.f10110p = this.f10107m;
        this.f10111q = jNanoTime;
        long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8623l0)).longValue();
        long jMo5416p = zzchaVar.mo5416p();
        int i3 = 0;
        while (true) {
            String[] strArr = this.f10102h;
            if (i3 >= strArr.length) {
                return;
            }
            if (strArr[i3] == null && jLongValue > Math.abs(jMo5416p - this.f10101g[i3])) {
                int i4 = 8;
                Bitmap bitmap = zzchaVar.getBitmap(8, 8);
                long j2 = 63;
                int i5 = 0;
                long j3 = 0;
                while (i5 < i4) {
                    int i6 = 0;
                    while (i6 < i4) {
                        int pixel = bitmap.getPixel(i6, i5);
                        j3 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j2);
                        j2--;
                        i6++;
                        i4 = 8;
                    }
                    i5++;
                    i4 = 8;
                }
                strArr[i3] = String.format("%016X", Long.valueOf(j3));
                return;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5483d() {
        this.f10107m = true;
        if (!this.f10104j || this.f10105k) {
            return;
        }
        zzbje.m5038a(this.f10099e, this.f10098d, "vfp2");
        this.f10105k = true;
    }
}
