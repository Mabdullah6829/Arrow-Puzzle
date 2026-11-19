package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
final class zzlj extends zzf implements zzjx {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ int f20218d0 = 0;

    /* JADX INFO: renamed from: A */
    public final zzdn f20219A;

    /* JADX INFO: renamed from: B */
    public final zzfd f20220B;

    /* JADX INFO: renamed from: C */
    public final zzli f20221C;

    /* JADX INFO: renamed from: D */
    public final zzjz f20222D;

    /* JADX INFO: renamed from: E */
    public final zzjz f20223E;

    /* JADX INFO: renamed from: F */
    public int f20224F;

    /* JADX INFO: renamed from: G */
    public int f20225G;

    /* JADX INFO: renamed from: H */
    public boolean f20226H;

    /* JADX INFO: renamed from: I */
    public final zznj f20227I;

    /* JADX INFO: renamed from: J */
    public final zznk f20228J;

    /* JADX INFO: renamed from: K */
    public final zzjw f20229K;

    /* JADX INFO: renamed from: L */
    public zzax f20230L;

    /* JADX INFO: renamed from: M */
    public zzan f20231M;

    /* JADX INFO: renamed from: N */
    public Object f20232N;

    /* JADX INFO: renamed from: O */
    public Surface f20233O;

    /* JADX INFO: renamed from: P */
    public final int f20234P;

    /* JADX INFO: renamed from: Q */
    public zzev f20235Q;

    /* JADX INFO: renamed from: R */
    public final zzd f20236R;

    /* JADX INFO: renamed from: S */
    public float f20237S;

    /* JADX INFO: renamed from: T */
    public boolean f20238T;

    /* JADX INFO: renamed from: U */
    public final boolean f20239U;

    /* JADX INFO: renamed from: V */
    public boolean f20240V;

    /* JADX INFO: renamed from: W */
    public final int f20241W;

    /* JADX INFO: renamed from: X */
    public boolean f20242X;

    /* JADX INFO: renamed from: Y */
    public zzan f20243Y;

    /* JADX INFO: renamed from: Z */
    public zzmu f20244Z;

    /* JADX INFO: renamed from: a0 */
    public int f20245a0;

    /* JADX INFO: renamed from: b */
    public final zzabj f20246b;

    /* JADX INFO: renamed from: b0 */
    public long f20247b0;

    /* JADX INFO: renamed from: c */
    public final zzax f20248c;

    /* JADX INFO: renamed from: c0 */
    public zzzg f20249c0;

    /* JADX INFO: renamed from: d */
    public final zzdt f20250d;

    /* JADX INFO: renamed from: e */
    public final Context f20251e;

    /* JADX INFO: renamed from: f */
    public final zznm f20252f;

    /* JADX INFO: renamed from: g */
    public final zznc[] f20253g;

    /* JADX INFO: renamed from: h */
    public final zznc[] f20254h;

    /* JADX INFO: renamed from: i */
    public final zzabi f20255i;

    /* JADX INFO: renamed from: j */
    public final zzea f20256j;

    /* JADX INFO: renamed from: k */
    public final zzlu f20257k;

    /* JADX INFO: renamed from: l */
    public final zzlw f20258l;

    /* JADX INFO: renamed from: m */
    public final zzeg f20259m;

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArraySet f20260n;

    /* JADX INFO: renamed from: o */
    public final zzbd f20261o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f20262p;

    /* JADX INFO: renamed from: q */
    public final boolean f20263q;

    /* JADX INFO: renamed from: r */
    public final zzpt f20264r;

    /* JADX INFO: renamed from: s */
    public final Looper f20265s;

    /* JADX INFO: renamed from: t */
    public final zzabr f20266t;

    /* JADX INFO: renamed from: u */
    public final zzff f20267u;

    /* JADX INFO: renamed from: v */
    public final zzkf f20268v;

    /* JADX INFO: renamed from: w */
    public final zzle f20269w;

    /* JADX INFO: renamed from: x */
    public final zzfs f20270x;

    /* JADX INFO: renamed from: y */
    public final zzfu f20271y;

    /* JADX INFO: renamed from: z */
    public final long f20272z;

    static {
        zzal.m4188a("media3.exoplayer");
    }

    public zzlj(zzjv zzjvVar, zznm zznmVar) {
        zzff zzffVar = zzdp.f12520a;
        this.f20250d = new zzdt();
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfm.f16091a;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 31 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.10.0] [");
            sb.append(str);
            sb.append("]");
            zzeh.m6210b("ExoPlayerImpl", sb.toString());
            Context context = zzjvVar.f20151a;
            zzff zzffVar2 = zzjvVar.f20152b;
            Looper looper = zzjvVar.f20159i;
            this.f20251e = context.getApplicationContext();
            ((zzjn) zzjvVar.f20158h).getClass();
            this.f20264r = new zzpt(zzffVar2);
            this.f20241W = zzjvVar.f20160j;
            this.f20236R = zzjvVar.f20161k;
            this.f20234P = zzjvVar.f20162l;
            this.f20238T = false;
            this.f20272z = zzjvVar.f20167q;
            zzkf zzkfVar = new zzkf(this);
            this.f20268v = zzkfVar;
            this.f20269w = new zzle();
            Handler handler = new Handler(looper);
            zzju zzjuVar = (zzju) zzjvVar.f20153c;
            zzjuVar.getClass();
            int i2 = zzjv.f20150A;
            this.f20253g = ((zzcke) zzjuVar.f20149s).m5536a(handler, zzkfVar, zzkfVar);
            this.f20254h = new zznc[2];
            int i3 = 0;
            while (true) {
                zznc[] zzncVarArr = this.f20254h;
                int length = zzncVarArr.length;
                if (i3 >= 2) {
                    break;
                }
                zznc zzncVar = this.f20253g[i3];
                zzncVarArr[i3] = null;
                i3++;
            }
            this.f20255i = (zzabi) zzjvVar.f20155e.zza();
            ((zzjp) zzjvVar.f20154d).zza();
            this.f20266t = (zzabr) ((zzjr) zzjvVar.f20157g).zza();
            this.f20263q = zzjvVar.f20163m;
            this.f20228J = zzjvVar.f20164n;
            this.f20227I = zzjvVar.f20165o;
            this.f20265s = looper;
            this.f20267u = zzffVar2;
            this.f20252f = zznmVar;
            this.f20259m = new zzeg(new CopyOnWriteArraySet(), looper, looper.getThread(), zzffVar2, new zzld(), true);
            this.f20260n = new CopyOnWriteArraySet();
            this.f20262p = new ArrayList();
            this.f20249c0 = new zzzg();
            this.f20229K = zzjw.f20177a;
            int length2 = this.f20253g.length;
            this.f20246b = new zzabj(new zznf[2], new zzabb[2], zzbn.f9184b, null);
            this.f20261o = new zzbd();
            zzaw zzawVar = new zzaw();
            zzr zzrVar = zzawVar.f7163a;
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i4 = 0; i4 < 20; i4++) {
                zzrVar.m8845a(iArr[i4]);
            }
            this.f20255i.mo3913b();
            zzawVar.m4451a(29, true);
            zzs zzsVarM8846b = zzrVar.m8846b();
            this.f20248c = new zzax(zzsVarM8846b);
            zzr zzrVar2 = new zzaw().f7163a;
            SparseBooleanArray sparseBooleanArray = zzsVarM8846b.f20733a;
            for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
                zzgtr.m7136i(i5, sparseBooleanArray.size());
                zzrVar2.m8845a(sparseBooleanArray.keyAt(i5));
            }
            zzrVar2.m8845a(4);
            zzrVar2.m8845a(10);
            this.f20230L = new zzax(zzrVar2.m8846b());
            this.f20256j = this.f20267u.mo5975a(this.f20265s, null);
            zzkg zzkgVar = new zzkg(this);
            this.f20257k = zzkgVar;
            this.f20244Z = zzmu.m8756a(this.f20246b);
            this.f20264r.m8820y(this.f20252f, this.f20265s);
            final zzqh zzqhVar = new zzqh(zzjvVar.f20174x);
            zzlw zzlwVar = new zzlw(this.f20251e, this.f20253g, this.f20254h, this.f20255i, this.f20246b, (zzma) zzjvVar.f20156f.zza(), this.f20266t, this.f20264r, this.f20228J, zzjvVar.f20176z, zzjvVar.f20166p, zzjvVar.f20175y, this.f20265s, this.f20267u, zzkgVar, zzqhVar, this.f20229K, this.f20269w);
            Looper looper2 = zzlwVar.f20295A;
            zzea zzeaVar = zzlwVar.f20348y;
            this.f20258l = zzlwVar;
            this.f20237S = 1.0f;
            zzan zzanVar = zzan.f6067B;
            this.f20231M = zzanVar;
            this.f20243Y = zzanVar;
            this.f20245a0 = -1;
            zzgyn zzgynVar = zzda.f11856a;
            this.f20239U = true;
            zzpt zzptVar = this.f20264r;
            zzptVar.getClass();
            this.f20259m.m6195a(zzptVar);
            this.f20266t.mo3933b(new Handler(this.f20265s), this.f20264r);
            this.f20260n.add(this.f20268v);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 31) {
                final Context context2 = this.f20251e;
                final boolean z = zzjvVar.f20172v;
                ((zzfh) this.f20267u.mo5975a(looper2, null)).mo6122g(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjy
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context3 = context2;
                        MediaMetricsManager mediaMetricsManagerM3844b = AbstractC5159m.m3844b(context3.getSystemService("media_metrics"));
                        zzqd zzqdVar = mediaMetricsManagerM3844b == null ? null : new zzqd(context3, mediaMetricsManagerM3844b.createPlaybackSession());
                        if (zzqdVar == null) {
                            zzeh.m6211c("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z) {
                            this.m8629c(zzqdVar);
                        }
                        zzqh zzqhVar2 = zzqhVar;
                        LogSessionId sessionId = zzqdVar.f20618v.getSessionId();
                        synchronized (zzqhVar2) {
                            zzqg zzqgVar = zzqhVar2.f20626b;
                            if (zzqgVar == null) {
                                throw null;
                            }
                            LogSessionId logSessionId = zzqgVar.f20623a;
                            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                            zzgtr.m7133f(logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE));
                            zzqgVar.f20623a = sessionId;
                        }
                    }
                });
            }
            zzdn zzdnVar = new zzdn(looper2, this.f20265s, this.f20267u, new zzkr(this));
            this.f20219A = zzdnVar;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    String str2 = zzfm.f16091a;
                    zzlj zzljVar = this.f20203s;
                    int iGenerateAudioSessionId = zzcj.m5503a(zzljVar.f20251e).generateAudioSessionId();
                    if (iGenerateAudioSessionId == -1) {
                        iGenerateAudioSessionId = 0;
                    }
                    final zzdn zzdnVar2 = zzljVar.f20219A;
                    zzea zzeaVar2 = zzdnVar2.f12368b;
                    Looper looperMyLooper = Looper.myLooper();
                    if (looperMyLooper == zzeaVar2.zza()) {
                        obj = zzdnVar2.f12370d;
                    } else {
                        zzgtr.m7133f(looperMyLooper == zzdnVar2.f12367a.zza());
                        obj = zzdnVar2.f12371e;
                    }
                    if (((Integer) obj).intValue() != iGenerateAudioSessionId) {
                        final Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
                        zzdnVar2.f12371e = numValueOf;
                        Runnable runnable2 = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdj
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdn zzdnVar3 = zzdnVar2;
                                if (zzdnVar3.f12372f == 0) {
                                    Object obj2 = zzdnVar3.f12370d;
                                    Integer num = numValueOf;
                                    zzdnVar3.f12370d = num;
                                    if (obj2.equals(num)) {
                                        return;
                                    }
                                    zzkr zzkrVar = (zzkr) zzdnVar3.f12369c;
                                    zzkrVar.getClass();
                                    int iIntValue = num.intValue();
                                    zzlj zzljVar2 = zzkrVar.f20200a;
                                    zzljVar2.m8639w();
                                    zzljVar2.m8640y(1, 10, num);
                                    zzljVar2.m8640y(2, 10, num);
                                    zzku zzkuVar = new zzku(iIntValue);
                                    zzeg zzegVar = zzljVar2.f20259m;
                                    zzegVar.m6197c(21, zzkuVar);
                                    zzegVar.m6198d();
                                }
                            }
                        };
                        zzea zzeaVar3 = zzdnVar2.f12368b;
                        if (zzeaVar3.zza().getThread().isAlive()) {
                            zzeaVar3.mo6122g(runnable2);
                        }
                        zzljVar.m8640y(1, 10, numValueOf);
                        zzljVar.m8640y(2, 10, numValueOf);
                    }
                }
            };
            zzea zzeaVar2 = zzdnVar.f12367a;
            if (zzeaVar2.zza().getThread().isAlive()) {
                zzeaVar2.mo6122g(runnable);
            }
            zzff zzffVar3 = this.f20267u;
            zzbz zzbzVar = new zzbz();
            context.getApplicationContext();
            zzffVar3.mo5975a(looper2, null);
            new zzbx(zzbzVar, zzffVar3.mo5975a(looper, null));
            boolean z2 = (zzjvVar.f20169s == Integer.MAX_VALUE || zzjvVar.f20170t == Integer.MAX_VALUE) ? false : true;
            zzfs zzfsVar = new zzfs(context, looper2, this.f20267u);
            this.f20270x = zzfsVar;
            if (zzfsVar.f16375d != z2) {
                zzfsVar.f16375d = z2;
                zzfsVar.m6635b(z2, zzfsVar.f16376e);
            }
            zzff zzffVar4 = this.f20267u;
            zzfu zzfuVar = new zzfu();
            context.getApplicationContext();
            zzffVar4.mo5975a(looper2, null);
            zzffVar4.mo5975a(Looper.getMainLooper(), null);
            this.f20271y = zzfuVar;
            int i7 = zzm.f20359a;
            zzbv zzbvVar = zzbv.f9425d;
            this.f20235Q = zzev.f14942c;
            this.f20221C = i6 >= 34 ? new zzli(this, context) : null;
            this.f20222D = new zzjz(this);
            this.f20223E = new zzjz(this);
            this.f20220B = new zzfd(this, this.f20268v, this.f20267u, zzjvVar.f20168r, zzjvVar.f20169s, zzjvVar.f20170t, zzjvVar.f20171u);
            ((zzfg) zzeaVar.mo6124i(38, this.f20227I)).m6435a();
            ((zzfg) zzeaVar.mo6118c(this.f20236R)).m6435a();
            m8640y(1, 3, this.f20236R);
            m8640y(2, 4, Integer.valueOf(this.f20234P));
            m8640y(2, 5, 0);
            m8640y(1, 9, Boolean.valueOf(this.f20238T));
            m8640y(6, 8, this.f20269w);
            m8640y(-1, 16, Integer.valueOf(this.f20241W));
        } finally {
            this.f20250d.m6050a();
        }
    }

    /* JADX INFO: renamed from: p */
    public static long m8624p(zzmu zzmuVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmuVar.f20456a;
        zzbfVar.mo4841o(zzmuVar.f20457b.f21278a, zzbdVar);
        long j2 = zzmuVar.f20458c;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        zzbfVar.mo4736b(zzbdVar.f7634c, zzbeVar, 0L).getClass();
        return 0L;
    }

    /* JADX INFO: renamed from: r */
    public static zzmu m8625r(zzmu zzmuVar, int i2) {
        zzmu zzmuVarM8759d = zzmuVar.m8759d(i2);
        return (i2 == 1 || i2 == 4) ? zzmuVarM8759d.m8761f(false) : zzmuVarM8759d;
    }

    /* JADX INFO: renamed from: A */
    public final long m8626A() {
        m8639w();
        if (!mo4715s()) {
            zzbf zzbfVarMo4709f = mo4709f();
            if (zzbfVarMo4709f.m4833g()) {
                return -9223372036854775807L;
            }
            return zzfm.m6518t(zzbfVarMo4709f.mo4736b(mo4710h(), this.f15244a, 0L).f7684j);
        }
        zzmu zzmuVar = this.f20244Z;
        zzxl zzxlVar = zzmuVar.f20457b;
        zzbf zzbfVar = zzmuVar.f20456a;
        Object obj = zzxlVar.f21278a;
        zzbd zzbdVar = this.f20261o;
        zzbfVar.mo4841o(obj, zzbdVar);
        return zzfm.m6518t(zzbdVar.m4754b(zzxlVar.f21279b, zzxlVar.f21280c));
    }

    /* JADX INFO: renamed from: B */
    public final long m8627B() {
        m8639w();
        if (mo4715s()) {
            zzmu zzmuVar = this.f20244Z;
            return zzmuVar.f20466k.equals(zzmuVar.f20457b) ? zzfm.m6518t(this.f20244Z.f20471p) : m8626A();
        }
        m8639w();
        if (this.f20244Z.f20456a.m4833g()) {
            return this.f20247b0;
        }
        zzmu zzmuVar2 = this.f20244Z;
        long j2 = 0;
        if (zzmuVar2.f20466k.f21281d != zzmuVar2.f20457b.f21281d) {
            return zzfm.m6518t(zzmuVar2.f20456a.mo4736b(mo4710h(), this.f15244a, 0L).f7684j);
        }
        long j3 = zzmuVar2.f20471p;
        if (this.f20244Z.f20466k.m9025b()) {
            zzmu zzmuVar3 = this.f20244Z;
            zzmuVar3.f20456a.mo4841o(zzmuVar3.f20466k.f21278a, this.f20261o).f7637f.m5285a(this.f20244Z.f20466k.f21279b).getClass();
        } else {
            j2 = j3;
        }
        zzmu zzmuVar4 = this.f20244Z;
        zzmuVar4.f20456a.mo4841o(zzmuVar4.f20466k.f21278a, this.f20261o);
        return zzfm.m6518t(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    /* JADX INFO: renamed from: C */
    public final long mo4707C() {
        m8639w();
        return m8632j(this.f20244Z);
    }

    /* JADX INFO: renamed from: b */
    public final void m8628b(float f2) {
        m8639w();
        String str = zzfm.f16091a;
        float fMax = Math.max(0.0f, Math.min(f2, 1.0f));
        if (this.f20237S == fMax) {
            return;
        }
        this.f20237S = fMax;
        ((zzfg) this.f20258l.f20348y.mo6124i(32, Float.valueOf(fMax))).m6435a();
        zzky zzkyVar = new zzky();
        zzeg zzegVar = this.f20259m;
        zzegVar.m6197c(22, zzkyVar);
        zzegVar.m6198d();
    }

    /* JADX INFO: renamed from: c */
    public final void m8629c(zznr zznrVar) {
        this.f20264r.f20560f.m6195a(zznrVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m8630d(zzjm zzjmVar) {
        zzmu zzmuVar = this.f20244Z;
        zzmu zzmuVarM8762g = zzmuVar.m8762g(zzmuVar.f20457b);
        zzmuVarM8762g.f20471p = zzmuVarM8762g.f20473r;
        zzmuVarM8762g.f20472q = 0L;
        zzmu zzmuVarM8625r = m8625r(zzmuVarM8762g, 1);
        if (zzjmVar != null) {
            zzmuVarM8625r = zzmuVarM8625r.m8760e(zzjmVar);
        }
        this.f20224F++;
        ((zzfg) this.f20258l.f20348y.mo6114A(6)).m6435a();
        m8634o(zzmuVarM8625r, 0, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    /* JADX INFO: renamed from: e */
    public final void mo4708e() {
        m8639w();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    /* JADX INFO: renamed from: f */
    public final zzbf mo4709f() {
        m8639w();
        return this.f20244Z.f20456a;
    }

    /* JADX INFO: renamed from: g */
    public final int m8631g(zzmu zzmuVar) {
        zzbf zzbfVar = zzmuVar.f20456a;
        return zzbfVar.m4833g() ? this.f20245a0 : zzbfVar.mo4841o(zzmuVar.f20457b.f21278a, this.f20261o).f7634c;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    /* JADX INFO: renamed from: h */
    public final int mo4710h() {
        m8639w();
        int iM8631g = m8631g(this.f20244Z);
        if (iM8631g == -1) {
            return 0;
        }
        return iM8631g;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    /* JADX INFO: renamed from: i */
    public final zzbn mo4711i() {
        m8639w();
        return this.f20244Z.f20464i.f4847d;
    }

    /* JADX INFO: renamed from: j */
    public final long m8632j(zzmu zzmuVar) {
        long jM6518t = zzfm.m6518t(0L);
        zzxl zzxlVar = zzmuVar.f20457b;
        if (!zzxlVar.m9025b()) {
            return zzfm.m6518t(m8633m(zzmuVar));
        }
        zzbf zzbfVar = zzmuVar.f20456a;
        zzbfVar.mo4841o(zzxlVar.f21278a, this.f20261o);
        long j2 = zzmuVar.f20458c;
        if (j2 != -9223372036854775807L) {
            return zzfm.m6518t(j2) + jM6518t;
        }
        zzbfVar.mo4736b(m8631g(zzmuVar), this.f15244a, 0L).getClass();
        return jM6518t;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    /* JADX INFO: renamed from: k */
    public final long mo4712k() {
        m8639w();
        return zzfm.m6518t(m8633m(this.f20244Z));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    /* JADX INFO: renamed from: l */
    public final int mo4713l() {
        m8639w();
        if (mo4715s()) {
            return this.f20244Z.f20457b.f21279b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public final long m8633m(zzmu zzmuVar) {
        zzbf zzbfVar = zzmuVar.f20456a;
        if (zzbfVar.m4833g()) {
            return zzfm.m6519u(this.f20247b0);
        }
        long j2 = zzmuVar.f20473r;
        zzxl zzxlVar = zzmuVar.f20457b;
        if (zzxlVar.m9025b()) {
            return j2;
        }
        zzbfVar.mo4841o(zzxlVar.f21278a, this.f20261o);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    /* JADX INFO: renamed from: n */
    public final int mo4714n() {
        m8639w();
        if (!this.f20244Z.f20456a.m4833g()) {
            zzmu zzmuVar = this.f20244Z;
            return zzmuVar.f20456a.mo4739e(zzmuVar.f20457b.f21278a);
        }
        int i2 = this.f20245a0;
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:115:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:118:0x0204  */
    /* JADX WARN: Code duplicated, block: B:121:0x020a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0210  */
    /* JADX WARN: Code duplicated, block: B:127:0x0216  */
    /* JADX WARN: Code duplicated, block: B:130:0x021c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0222  */
    /* JADX WARN: Code duplicated, block: B:136:0x0228  */
    /* JADX WARN: Code duplicated, block: B:139:0x022e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0234  */
    /* JADX WARN: Code duplicated, block: B:145:0x023e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0257  */
    /* JADX WARN: Code duplicated, block: B:150:0x0259  */
    /* JADX WARN: Code duplicated, block: B:153:0x0261  */
    /* JADX WARN: Code duplicated, block: B:154:0x0263  */
    /* JADX WARN: Code duplicated, block: B:157:0x0269  */
    /* JADX WARN: Code duplicated, block: B:159:0x0274  */
    /* JADX WARN: Code duplicated, block: B:165:0x0284  */
    /* JADX WARN: Code duplicated, block: B:168:0x029c  */
    /* JADX WARN: Code duplicated, block: B:171:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:172:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:176:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:183:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:184:0x030c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0311  */
    /* JADX WARN: Code duplicated, block: B:188:0x0319  */
    /* JADX WARN: Code duplicated, block: B:189:0x031c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0324  */
    /* JADX WARN: Code duplicated, block: B:192:0x032b  */
    /* JADX WARN: Code duplicated, block: B:195:0x035b  */
    /* JADX WARN: Code duplicated, block: B:197:0x0389  */
    /* JADX WARN: Code duplicated, block: B:200:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:201:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:203:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:205:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:206:0x03df  */
    /* JADX WARN: Code duplicated, block: B:209:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:211:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:214:0x0402  */
    /* JADX WARN: Code duplicated, block: B:216:0x0416  */
    /* JADX WARN: Code duplicated, block: B:218:0x0424  */
    /* JADX WARN: Code duplicated, block: B:221:0x0433  */
    /* JADX WARN: Code duplicated, block: B:224:0x0441  */
    /* JADX WARN: Code duplicated, block: B:229:0x0454  */
    /* JADX WARN: Code duplicated, block: B:232:0x0465  */
    /* JADX WARN: Code duplicated, block: B:235:0x047a  */
    /* JADX WARN: Code duplicated, block: B:238:0x0490  */
    /* JADX WARN: Code duplicated, block: B:244:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:247:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:248:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:250:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:251:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:254:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:255:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:257:0x0503  */
    /* JADX WARN: Code duplicated, block: B:258:0x0506  */
    /* JADX WARN: Code duplicated, block: B:261:0x0512  */
    /* JADX WARN: Code duplicated, block: B:263:0x0526  */
    /* JADX WARN: Code duplicated, block: B:265:0x052a  */
    /* JADX WARN: Code duplicated, block: B:268:0x0539  */
    /* JADX WARN: Code duplicated, block: B:271:0x0549  */
    /* JADX WARN: Code duplicated, block: B:275:0x0562 A[LOOP:0: B:273:0x055c->B:275:0x0562, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:278:0x057c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:280:0x0580  */
    /* JADX WARN: Code duplicated, block: B:283:0x0586 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:285:0x058a  */
    /* JADX WARN: Code duplicated, block: B:288:0x0590 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:292:0x0597  */
    /* JADX WARN: Code duplicated, block: B:297:0x05a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:299:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:302:0x05af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:306:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:311:0x05c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:313:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:316:0x05d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:318:0x05db  */
    /* JADX WARN: Code duplicated, block: B:321:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x0111  */
    /* JADX WARN: Code duplicated, block: B:48:0x0117  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0158 A[LOOP:2: B:57:0x0153->B:59:0x0158, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0178  */
    /* JADX WARN: Code duplicated, block: B:65:0x017c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0196  */
    /* JADX WARN: Code duplicated, block: B:70:0x019a  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.google.android.gms.internal.ads.zzfs] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [int] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v24, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    public final void m8634o(final zzmu zzmuVar, final int i2, boolean z, int i3, long j2, int i4) {
        int i5;
        final int i6;
        boolean z2;
        Pair pair;
        boolean z3;
        boolean z4;
        int i7;
        boolean zBooleanValue;
        zzam zzamVarM4233a;
        List list;
        int i8;
        zzap zzapVar;
        int i9;
        zzao[] zzaoVarArr;
        zzbf zzbfVarMo4709f;
        zzam zzamVarM4233a2;
        zzan zzanVar;
        zzan zzanVar2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        byte[] bArr;
        Integer num;
        Integer num2;
        Integer num3;
        Boolean bool;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        Integer num11;
        Integer num12;
        CharSequence charSequence9;
        CharSequence charSequence10;
        Integer num13;
        zzgwt zzgwtVar;
        boolean zEquals;
        int i10;
        int i11;
        zzfu zzfuVar;
        ?? r12;
        int iZzh;
        boolean zZzk;
        boolean z5;
        boolean z6;
        zzjm zzjmVar;
        zzjm zzjmVar2;
        zzabj zzabjVar;
        zzabj zzabjVar2;
        zzax zzaxVar;
        zznm zznmVar;
        boolean zMo4715s;
        zzbf zzbfVarMo4709f2;
        boolean z7;
        zzbf zzbfVarMo4709f3;
        int iMo4835i;
        int i12;
        boolean z8;
        zzbf zzbfVarMo4709f4;
        int iMo4710h;
        boolean z9;
        boolean z10;
        zzbf zzbfVarMo4709f5;
        boolean z11;
        long j3;
        boolean z12;
        zzbf zzbfVarMo4709f6;
        boolean z13;
        boolean zM4833g;
        zzaw zzawVar;
        ?? r8;
        ?? r13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i13;
        boolean z17;
        boolean z18;
        boolean z19;
        int i14;
        boolean z20;
        int i15;
        zzax zzaxVar2;
        zzeg zzegVar;
        zzbd zzbdVar;
        int i16;
        int i17;
        Object obj;
        zzak zzakVar;
        Object obj2;
        long jM8624p;
        long jM8624p2;
        int iMo4710h2;
        int iMo4714n;
        Object obj3;
        zzak zzakVar2;
        Object obj4;
        long jM6518t;
        long jM6518t2;
        zzxl zzxlVar;
        int i18 = i3;
        zzmu zzmuVar2 = this.f20244Z;
        this.f20244Z = zzmuVar;
        zzbf zzbfVar = zzmuVar.f20456a;
        if (!zzbfVar.m4833g()) {
            Object obj5 = zzmuVar.f20457b.f21278a;
            zzgtr.m7134g(String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", obj5, zzbfVar.getClass().getName(), Integer.valueOf(zzbfVar.mo4735a())), zzbfVar.mo4739e(obj5) != -1);
        }
        zzbf zzbfVar2 = zzmuVar2.f20456a;
        boolean zEquals2 = zzbfVar2.equals(zzbfVar);
        if (!zzbfVar.m4833g() || !zzbfVar2.m4833g()) {
            if (zzbfVar.m4833g() != zzbfVar2.m4833g()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else {
                zzxl zzxlVar2 = zzmuVar2.f20457b;
                Object obj6 = zzxlVar2.f21278a;
                i5 = 0;
                zzbd zzbdVar2 = this.f20261o;
                int i19 = zzbfVar2.mo4841o(obj6, zzbdVar2).f7634c;
                zzbe zzbeVar = this.f15244a;
                Object obj7 = zzbfVar2.mo4736b(i19, zzbeVar, 0L).f7675a;
                zzxl zzxlVar3 = zzmuVar.f20457b;
                if (obj7.equals(zzbfVar.mo4736b(zzbfVar.mo4841o(zzxlVar3.f21278a, zzbdVar2).f7634c, zzbeVar, 0L).f7675a)) {
                    if (z) {
                        if (i18 != 0) {
                            i6 = i18;
                        } else if (zzxlVar2.f21281d < zzxlVar3.f21281d) {
                            pair = new Pair(Boolean.TRUE, 0);
                            i6 = 0;
                            z2 = true;
                        } else {
                            i6 = 0;
                        }
                        z2 = true;
                    } else {
                        i6 = i18;
                        z2 = false;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                } else {
                    if (z) {
                        if (i18 == 0) {
                            i18 = 0;
                            i7 = 1;
                            z4 = true;
                        } else {
                            z3 = true;
                            z4 = true;
                        }
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i7));
                        i6 = i18;
                        z2 = z4;
                    } else {
                        z3 = false;
                        z4 = false;
                    }
                    if (z3 && i18 == 1) {
                        i7 = 2;
                    } else {
                        if (zEquals2) {
                            throw new IllegalStateException();
                        }
                        i7 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i7));
                    i6 = i18;
                    z2 = z4;
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (!zzbfVar.m4833g()) {
                    zzak zzakVar3 = zzbfVar.mo4736b(zzbfVar.mo4841o(zzmuVar.f20457b.f21278a, this.f20261o).f7634c, this.f15244a, 0L).f7676b;
                }
                this.f20243Y = zzan.f6067B;
            }
            if (zBooleanValue || !zzmuVar2.f20465j.equals(zzmuVar.f20465j)) {
                zzamVarM4233a = this.f20243Y.m4233a();
                list = zzmuVar.f20465j;
                for (i8 = i5; i8 < list.size(); i8++) {
                    zzapVar = (zzap) list.get(i8);
                    i9 = i5;
                    while (true) {
                        zzaoVarArr = zzapVar.f6355a;
                        if (i9 < zzaoVarArr.length) {
                            zzaoVarArr[i9].mo4149a(zzamVarM4233a);
                            i9++;
                        }
                    }
                }
                this.f20243Y = new zzan(zzamVarM4233a);
            }
            zzbfVarMo4709f = mo4709f();
            if (zzbfVarMo4709f.m4833g()) {
                zzanVar2 = this.f20243Y;
            } else {
                zzak zzakVar4 = zzbfVarMo4709f.mo4736b(mo4710h(), this.f15244a, 0L).f7676b;
                zzamVarM4233a2 = this.f20243Y.m4233a();
                zzanVar = zzakVar4.f5576d;
                if (zzanVar != null) {
                    charSequence = zzanVar.f6069a;
                    if (charSequence != null) {
                        zzamVarM4233a2.f5899a = charSequence;
                    }
                    charSequence2 = zzanVar.f6070b;
                    if (charSequence2 != null) {
                        zzamVarM4233a2.f5900b = charSequence2;
                    }
                    charSequence3 = zzanVar.f6071c;
                    if (charSequence3 != null) {
                        zzamVarM4233a2.f5901c = charSequence3;
                    }
                    charSequence4 = zzanVar.f6072d;
                    if (charSequence4 != null) {
                        zzamVarM4233a2.f5902d = charSequence4;
                    }
                    charSequence5 = zzanVar.f6073e;
                    if (charSequence5 != null) {
                        zzamVarM4233a2.f5903e = charSequence5;
                    }
                    bArr = zzanVar.f6074f;
                    if (bArr != null) {
                        Integer num14 = zzanVar.f6075g;
                        zzamVarM4233a2.f5904f = (byte[]) bArr.clone();
                        zzamVarM4233a2.f5905g = num14;
                    }
                    num = zzanVar.f6076h;
                    if (num != null) {
                        zzamVarM4233a2.f5906h = num;
                    }
                    num2 = zzanVar.f6077i;
                    if (num2 != null) {
                        zzamVarM4233a2.f5907i = num2;
                    }
                    num3 = zzanVar.f6078j;
                    if (num3 != null) {
                        zzamVarM4233a2.f5908j = num3;
                    }
                    bool = zzanVar.f6079k;
                    if (bool != null) {
                        zzamVarM4233a2.f5909k = bool;
                    }
                    num4 = zzanVar.f6080l;
                    if (num4 != null) {
                        zzamVarM4233a2.f5910l = num4;
                    }
                    num5 = zzanVar.f6081m;
                    if (num5 != null) {
                        zzamVarM4233a2.f5910l = num5;
                    }
                    num6 = zzanVar.f6082n;
                    if (num6 != null) {
                        zzamVarM4233a2.f5911m = num6;
                    }
                    num7 = zzanVar.f6083o;
                    if (num7 != null) {
                        zzamVarM4233a2.f5912n = num7;
                    }
                    num8 = zzanVar.f6084p;
                    if (num8 != null) {
                        zzamVarM4233a2.f5913o = num8;
                    }
                    num9 = zzanVar.f6085q;
                    if (num9 != null) {
                        zzamVarM4233a2.f5914p = num9;
                    }
                    num10 = zzanVar.f6086r;
                    if (num10 != null) {
                        zzamVarM4233a2.f5915q = num10;
                    }
                    charSequence6 = zzanVar.f6087s;
                    if (charSequence6 != null) {
                        zzamVarM4233a2.f5916r = charSequence6;
                    }
                    charSequence7 = zzanVar.f6088t;
                    if (charSequence7 != null) {
                        zzamVarM4233a2.f5917s = charSequence7;
                    }
                    charSequence8 = zzanVar.f6089u;
                    if (charSequence8 != null) {
                        zzamVarM4233a2.f5918t = charSequence8;
                    }
                    num11 = zzanVar.f6090v;
                    if (num11 != null) {
                        zzamVarM4233a2.f5919u = num11;
                    }
                    num12 = zzanVar.f6091w;
                    if (num12 != null) {
                        zzamVarM4233a2.f5920v = num12;
                    }
                    charSequence9 = zzanVar.f6092x;
                    if (charSequence9 != null) {
                        zzamVarM4233a2.f5921w = charSequence9;
                    }
                    charSequence10 = zzanVar.f6093y;
                    if (charSequence10 != null) {
                        zzamVarM4233a2.f5922x = charSequence10;
                    }
                    num13 = zzanVar.f6094z;
                    if (num13 != null) {
                        zzamVarM4233a2.f5923y = num13;
                    }
                    zzgwtVar = zzanVar.f6068A;
                    if (!zzgwtVar.isEmpty()) {
                        zzamVarM4233a2.f5924z = zzgwt.m7220t(zzgwtVar);
                    }
                }
                zzanVar2 = new zzan(zzamVarM4233a2);
            }
            zEquals = zzanVar2.equals(this.f20231M);
            this.f20231M = zzanVar2;
            if (zzmuVar2.f20467l != zzmuVar.f20467l) {
                i10 = 1;
            } else {
                i10 = i5;
            }
            if (zzmuVar2.f20460e != zzmuVar.f20460e) {
                i11 = 1;
            } else {
                i11 = i5;
            }
            if (i11 == 0 || i10 != 0) {
                zzfuVar = this.f20271y;
                r12 = this.f20270x;
                iZzh = zzh();
                if (iZzh != 2 || iZzh == 3) {
                    m8639w();
                    this.f20244Z.getClass();
                    r12.m6634a(zzk());
                    zZzk = zzk();
                    if (zzfuVar.f16532a != zZzk) {
                        zzfuVar.f16532a = zZzk;
                    }
                } else {
                    ?? r14 = i5;
                    r12.m6634a(r14);
                    if (zzfuVar.f16532a) {
                        zzfuVar.f16532a = r14;
                    }
                }
            }
            if (zzmuVar2.f20462g != zzmuVar.f20462g) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!zEquals2) {
                this.f20259m.m6197c(0, new zzeb(i2) { // from class: com.google.android.gms.internal.ads.zzkz
                    @Override // com.google.android.gms.internal.ads.zzeb
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6141b(Object obj8) {
                        int i20 = zzlj.f20218d0;
                        zzbf zzbfVar3 = this.f20205a.f20456a;
                        ((zzaz) obj8).zzb();
                    }
                });
            }
            if (z2) {
                zzbdVar = new zzbd();
                if (zzbfVar2.m4833g()) {
                    i16 = i4;
                    i17 = i16;
                    obj = null;
                    zzakVar = null;
                    obj2 = null;
                } else {
                    Object obj8 = zzmuVar2.f20457b.f21278a;
                    zzbfVar2.mo4841o(obj8, zzbdVar);
                    int i20 = zzbdVar.f7634c;
                    int iMo4739e = zzbfVar2.mo4739e(obj8);
                    zzbe zzbeVar2 = this.f15244a;
                    obj = zzbfVar2.mo4736b(i20, zzbeVar2, 0L).f7675a;
                    zzakVar = zzbeVar2.f7676b;
                    obj2 = obj8;
                    i16 = i20;
                    i17 = iMo4739e;
                }
                if (i6 == 0) {
                    zzxlVar = zzmuVar2.f20457b;
                    if (zzxlVar.m9025b()) {
                        jM8624p = zzbdVar.m4754b(zzxlVar.f21279b, zzxlVar.f21280c);
                        jM8624p2 = m8624p(zzmuVar2);
                    } else {
                        if (zzxlVar.f21282e != -1) {
                            jM8624p = m8624p(this.f20244Z);
                        } else {
                            jM8624p = zzbdVar.f7635d;
                        }
                        jM8624p2 = jM8624p;
                    }
                } else if (zzmuVar2.f20457b.m9025b()) {
                    jM8624p = zzmuVar2.f20473r;
                    jM8624p2 = m8624p(zzmuVar2);
                } else {
                    jM8624p = zzmuVar2.f20473r;
                    jM8624p2 = jM8624p;
                }
                String str = zzfm.f16091a;
                zzxl zzxlVar4 = zzmuVar2.f20457b;
                final zzba zzbaVar = new zzba(obj, i16, zzakVar, obj2, i17, zzfm.m6518t(jM8624p), zzfm.m6518t(jM8624p2), zzxlVar4.f21279b, zzxlVar4.f21280c);
                iMo4710h2 = mo4710h();
                iMo4714n = mo4714n();
                if (this.f20244Z.f20456a.m4833g()) {
                    obj3 = null;
                    zzakVar2 = null;
                    obj4 = null;
                } else {
                    zzmu zzmuVar3 = this.f20244Z;
                    Object obj9 = zzmuVar3.f20457b.f21278a;
                    zzmuVar3.f20456a.mo4841o(obj9, this.f20261o);
                    iMo4714n = this.f20244Z.f20456a.mo4739e(obj9);
                    zzbf zzbfVar3 = this.f20244Z.f20456a;
                    zzbe zzbeVar3 = this.f15244a;
                    obj3 = zzbfVar3.mo4736b(iMo4710h2, zzbeVar3, 0L).f7675a;
                    zzakVar2 = zzbeVar3.f7676b;
                    obj4 = obj9;
                }
                int i21 = iMo4714n;
                jM6518t = zzfm.m6518t(j2);
                if (this.f20244Z.f20457b.m9025b()) {
                    jM6518t2 = zzfm.m6518t(m8624p(this.f20244Z));
                } else {
                    jM6518t2 = jM6518t;
                }
                zzxl zzxlVar5 = this.f20244Z.f20457b;
                final zzba zzbaVar2 = new zzba(obj3, iMo4710h2, zzakVar2, obj4, i21, jM6518t, jM6518t2, zzxlVar5.f21279b, zzxlVar5.f21280c);
                this.f20259m.m6197c(11, new zzeb() { // from class: com.google.android.gms.internal.ads.zzla
                    @Override // com.google.android.gms.internal.ads.zzeb
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6141b(Object obj10) {
                        int i22 = zzlj.f20218d0;
                        ((zzaz) obj10).mo4645K(i6, zzbaVar, zzbaVar2);
                    }
                });
            } else {
                z5 = z5;
            }
            if (zBooleanValue) {
                z6 = true;
                this.f20259m.m6197c(1, new zzlb());
            } else {
                z6 = true;
            }
            zzjmVar = zzmuVar2.f20461f;
            zzjmVar2 = zzmuVar.f20461f;
            if (zzjmVar != zzjmVar2) {
                zzegVar = this.f20259m;
                zzegVar.m6197c(10, new zzeb() { // from class: com.google.android.gms.internal.ads.zzlc
                    @Override // com.google.android.gms.internal.ads.zzeb
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6141b(Object obj10) {
                        int i22 = zzlj.f20218d0;
                        ((zzaz) obj10).mo4646L(zzmuVar.f20461f);
                    }
                });
                if (zzjmVar2 != null) {
                    zzegVar.m6197c(10, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkh
                        @Override // com.google.android.gms.internal.ads.zzeb
                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ void mo6141b(Object obj10) {
                            int i22 = zzlj.f20218d0;
                            ((zzaz) obj10).mo4647M(zzmuVar.f20461f);
                        }
                    });
                }
            }
            zzabjVar = zzmuVar2.f20464i;
            zzabjVar2 = zzmuVar.f20464i;
            if (zzabjVar != zzabjVar2) {
                this.f20255i.mo3922e(zzabjVar2.f4848e);
                this.f20259m.m6197c(2, new zzeb() { // from class: com.google.android.gms.internal.ads.zzki
                    @Override // com.google.android.gms.internal.ads.zzeb
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6141b(Object obj10) {
                        int i22 = zzlj.f20218d0;
                        zzbn zzbnVar = zzmuVar.f20464i.f4847d;
                        ((zzaz) obj10).mo4651d();
                    }
                });
            }
            if (!zEquals) {
                this.f20259m.m6197c(14, new zzkj());
            }
            if (z5) {
                this.f20259m.m6197c(3, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkk
                    @Override // com.google.android.gms.internal.ads.zzeb
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6141b(Object obj10) {
                        int i22 = zzlj.f20218d0;
                        boolean z21 = zzmuVar.f20462g;
                        ((zzaz) obj10).mo4649b();
                    }
                });
            }
            if (i11 == 0 || i10 != 0) {
                this.f20259m.m6197c(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkl
                    @Override // com.google.android.gms.internal.ads.zzeb
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6141b(Object obj10) {
                        int i22 = zzlj.f20218d0;
                        boolean z21 = zzmuVar.f20467l;
                        ((zzaz) obj10).zzh();
                    }
                });
            }
            if (i11 != 0) {
                this.f20259m.m6197c(4, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkm
                    @Override // com.google.android.gms.internal.ads.zzeb
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6141b(Object obj10) {
                        int i22 = zzlj.f20218d0;
                        ((zzaz) obj10).mo4643I(zzmuVar.f20460e);
                    }
                });
            }
            if (i10 == 0 || zzmuVar2.f20468m != zzmuVar.f20468m) {
                this.f20259m.m6197c(5, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkn
                    @Override // com.google.android.gms.internal.ads.zzeb
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6141b(Object obj10) {
                        int i22 = zzlj.f20218d0;
                        boolean z21 = zzmuVar.f20467l;
                        ((zzaz) obj10).zzj();
                    }
                });
            }
            if (zzmuVar2.f20469n != zzmuVar.f20469n) {
                this.f20259m.m6197c(6, new zzeb() { // from class: com.google.android.gms.internal.ads.zzko
                    @Override // com.google.android.gms.internal.ads.zzeb
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6141b(Object obj10) {
                        int i22 = zzlj.f20218d0;
                        int i23 = zzmuVar.f20469n;
                        ((zzaz) obj10).zzk();
                    }
                });
            }
            if (zzmuVar2.m8764i() != zzmuVar.m8764i()) {
                this.f20259m.m6197c(7, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkp
                    @Override // com.google.android.gms.internal.ads.zzeb
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6141b(Object obj10) {
                        int i22 = zzlj.f20218d0;
                        zzmuVar.getClass();
                        ((zzaz) obj10).zzl();
                    }
                });
            }
            if (!zzmuVar2.f20470o.equals(zzmuVar.f20470o)) {
                this.f20259m.m6197c(12, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkq
                    @Override // com.google.android.gms.internal.ads.zzeb
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6141b(Object obj10) {
                        int i22 = zzlj.f20218d0;
                        zzav zzavVar = zzmuVar.f20470o;
                        ((zzaz) obj10).mo4654i();
                    }
                });
            }
            zzaxVar = this.f20230L;
            zznmVar = this.f20252f;
            zzax zzaxVar3 = this.f20248c;
            String str2 = zzfm.f16091a;
            zMo4715s = zznmVar.mo4715s();
            zzbfVarMo4709f2 = zznmVar.mo4709f();
            if (zzbfVarMo4709f2.m4833g() && zzbfVarMo4709f2.mo4736b(zznmVar.mo4710h(), zznmVar.f15244a, 0L).f7680f) {
                z7 = z6;
            } else {
                z7 = false;
            }
            zzbfVarMo4709f3 = zznmVar.mo4709f();
            if (zzbfVarMo4709f3.m4833g()) {
                z8 = false;
                i12 = -1;
            } else {
                int iMo4710h3 = zznmVar.mo4710h();
                zznmVar.zzl();
                zznmVar.mo4708e();
                iMo4835i = zzbfVarMo4709f3.mo4835i(iMo4710h3);
                i12 = -1;
                if (iMo4835i != -1) {
                    z8 = z6;
                } else {
                    z8 = false;
                }
            }
            zzbfVarMo4709f4 = zznmVar.mo4709f();
            if (zzbfVarMo4709f4.m4833g()) {
                z9 = false;
                z10 = false;
            } else {
                iMo4710h = zznmVar.mo4710h();
                zznmVar.zzl();
                zznmVar.mo4708e();
                z9 = false;
                if (zzbfVarMo4709f4.mo4834h(iMo4710h, 0, false) != i12) {
                    z10 = z6;
                } else {
                    z10 = false;
                }
            }
            zzbfVarMo4709f5 = zznmVar.mo4709f();
            if (!zzbfVarMo4709f5.m4833g()) {
                z11 = zMo4715s;
                j3 = 0;
                if (zzbfVarMo4709f5.mo4736b(zznmVar.mo4710h(), zznmVar.f15244a, 0L).m4777b()) {
                    z12 = z6;
                }
                zzbfVarMo4709f6 = zznmVar.mo4709f();
                if (zzbfVarMo4709f6.m4833g() && zzbfVarMo4709f6.mo4736b(zznmVar.mo4710h(), zznmVar.f15244a, j3).f7681g) {
                    z13 = true;
                } else {
                    z13 = z9;
                }
                zM4833g = zznmVar.mo4709f().m4833g();
                zzawVar = new zzaw();
                r8 = zzaxVar3.f7192a.f20733a;
                for (r13 = z9; r13 < r8.size(); r13++) {
                    zzr zzrVar = zzawVar.f7163a;
                    zzgtr.m7136i(r13, r8.size());
                    zzrVar.m8845a(r8.keyAt(r13));
                }
                boolean z21 = !z11;
                zzawVar.m4451a(4, z21);
                if (z7 || z11) {
                    z14 = z9;
                } else {
                    z14 = true;
                }
                zzawVar.m4451a(5, z14);
                if (z8 || z11) {
                    z15 = z9;
                } else {
                    z15 = true;
                }
                zzawVar.m4451a(6, z15);
                if (!zM4833g || (!(z8 || !z12 || z7) || z11)) {
                    z16 = z9;
                    i13 = 7;
                } else {
                    i13 = 7;
                    z16 = true;
                }
                zzawVar.m4451a(i13, z16);
                if (z10 || z11) {
                    z17 = z9;
                } else {
                    z17 = true;
                }
                zzawVar.m4451a(8, z17);
                if (!zM4833g || (!(z10 || (z12 && z13)) || z11)) {
                    z18 = z9;
                } else {
                    z18 = true;
                }
                zzawVar.m4451a(9, z18);
                zzawVar.m4451a(10, z21);
                if (z7 || z11) {
                    z19 = z9;
                    i14 = 11;
                } else {
                    i14 = 11;
                    z19 = true;
                }
                zzawVar.m4451a(i14, z19);
                if (z7 || z11) {
                    z20 = z9;
                    i15 = 12;
                } else {
                    i15 = 12;
                    z20 = true;
                }
                zzawVar.m4451a(i15, z20);
                zzaxVar2 = new zzax(zzawVar.f7163a.m8846b());
                this.f20230L = zzaxVar2;
                if (!zzaxVar2.equals(zzaxVar)) {
                    this.f20259m.m6197c(13, new zzks());
                }
                this.f20259m.m6198d();
            }
            z11 = zMo4715s;
            j3 = 0;
            z12 = z9;
            zzbfVarMo4709f6 = zznmVar.mo4709f();
            if (zzbfVarMo4709f6.m4833g()) {
                z13 = z9;
            } else {
                z13 = z9;
            }
            zM4833g = zznmVar.mo4709f().m4833g();
            zzawVar = new zzaw();
            r8 = zzaxVar3.f7192a.f20733a;
            while (r13 < r8.size()) {
                zzr zzrVar2 = zzawVar.f7163a;
                zzgtr.m7136i(r13, r8.size());
                zzrVar2.m8845a(r8.keyAt(r13));
            }
            boolean z22 = !z11;
            zzawVar.m4451a(4, z22);
            if (z7) {
                z14 = z9;
            } else {
                z14 = z9;
            }
            zzawVar.m4451a(5, z14);
            if (z8) {
                z15 = z9;
            } else {
                z15 = z9;
            }
            zzawVar.m4451a(6, z15);
            if (zM4833g) {
                z16 = z9;
                i13 = 7;
            } else {
                z16 = z9;
                i13 = 7;
            }
            zzawVar.m4451a(i13, z16);
            if (z10) {
                z17 = z9;
            } else {
                z17 = z9;
            }
            zzawVar.m4451a(8, z17);
            if (zM4833g) {
                z18 = z9;
            } else {
                z18 = z9;
            }
            zzawVar.m4451a(9, z18);
            zzawVar.m4451a(10, z22);
            if (z7) {
                z19 = z9;
                i14 = 11;
            } else {
                z19 = z9;
                i14 = 11;
            }
            zzawVar.m4451a(i14, z19);
            if (z7) {
                z20 = z9;
                i15 = 12;
            } else {
                z20 = z9;
                i15 = 12;
            }
            zzawVar.m4451a(i15, z20);
            zzaxVar2 = new zzax(zzawVar.f7163a.m8846b());
            this.f20230L = zzaxVar2;
            if (!zzaxVar2.equals(zzaxVar)) {
                this.f20259m.m6197c(13, new zzks());
            }
            this.f20259m.m6198d();
        }
        pair = new Pair(Boolean.FALSE, -1);
        i6 = i18;
        i5 = 0;
        z2 = z;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (!zzbfVar.m4833g()) {
                zzak zzakVar5 = zzbfVar.mo4736b(zzbfVar.mo4841o(zzmuVar.f20457b.f21278a, this.f20261o).f7634c, this.f15244a, 0L).f7676b;
            }
            this.f20243Y = zzan.f6067B;
        }
        if (zBooleanValue) {
            zzamVarM4233a = this.f20243Y.m4233a();
            list = zzmuVar.f20465j;
            while (i8 < list.size()) {
                zzapVar = (zzap) list.get(i8);
                i9 = i5;
                while (true) {
                    zzaoVarArr = zzapVar.f6355a;
                    if (i9 < zzaoVarArr.length) {
                        zzaoVarArr[i9].mo4149a(zzamVarM4233a);
                        i9++;
                    }
                }
            }
            this.f20243Y = new zzan(zzamVarM4233a);
        } else {
            zzamVarM4233a = this.f20243Y.m4233a();
            list = zzmuVar.f20465j;
            while (i8 < list.size()) {
                zzapVar = (zzap) list.get(i8);
                i9 = i5;
                while (true) {
                    zzaoVarArr = zzapVar.f6355a;
                    if (i9 < zzaoVarArr.length) {
                        zzaoVarArr[i9].mo4149a(zzamVarM4233a);
                        i9++;
                    }
                }
            }
            this.f20243Y = new zzan(zzamVarM4233a);
        }
        zzbfVarMo4709f = mo4709f();
        if (zzbfVarMo4709f.m4833g()) {
            zzanVar2 = this.f20243Y;
        } else {
            zzak zzakVar6 = zzbfVarMo4709f.mo4736b(mo4710h(), this.f15244a, 0L).f7676b;
            zzamVarM4233a2 = this.f20243Y.m4233a();
            zzanVar = zzakVar6.f5576d;
            if (zzanVar != null) {
                charSequence = zzanVar.f6069a;
                if (charSequence != null) {
                    zzamVarM4233a2.f5899a = charSequence;
                }
                charSequence2 = zzanVar.f6070b;
                if (charSequence2 != null) {
                    zzamVarM4233a2.f5900b = charSequence2;
                }
                charSequence3 = zzanVar.f6071c;
                if (charSequence3 != null) {
                    zzamVarM4233a2.f5901c = charSequence3;
                }
                charSequence4 = zzanVar.f6072d;
                if (charSequence4 != null) {
                    zzamVarM4233a2.f5902d = charSequence4;
                }
                charSequence5 = zzanVar.f6073e;
                if (charSequence5 != null) {
                    zzamVarM4233a2.f5903e = charSequence5;
                }
                bArr = zzanVar.f6074f;
                if (bArr != null) {
                    Integer num15 = zzanVar.f6075g;
                    zzamVarM4233a2.f5904f = (byte[]) bArr.clone();
                    zzamVarM4233a2.f5905g = num15;
                }
                num = zzanVar.f6076h;
                if (num != null) {
                    zzamVarM4233a2.f5906h = num;
                }
                num2 = zzanVar.f6077i;
                if (num2 != null) {
                    zzamVarM4233a2.f5907i = num2;
                }
                num3 = zzanVar.f6078j;
                if (num3 != null) {
                    zzamVarM4233a2.f5908j = num3;
                }
                bool = zzanVar.f6079k;
                if (bool != null) {
                    zzamVarM4233a2.f5909k = bool;
                }
                num4 = zzanVar.f6080l;
                if (num4 != null) {
                    zzamVarM4233a2.f5910l = num4;
                }
                num5 = zzanVar.f6081m;
                if (num5 != null) {
                    zzamVarM4233a2.f5910l = num5;
                }
                num6 = zzanVar.f6082n;
                if (num6 != null) {
                    zzamVarM4233a2.f5911m = num6;
                }
                num7 = zzanVar.f6083o;
                if (num7 != null) {
                    zzamVarM4233a2.f5912n = num7;
                }
                num8 = zzanVar.f6084p;
                if (num8 != null) {
                    zzamVarM4233a2.f5913o = num8;
                }
                num9 = zzanVar.f6085q;
                if (num9 != null) {
                    zzamVarM4233a2.f5914p = num9;
                }
                num10 = zzanVar.f6086r;
                if (num10 != null) {
                    zzamVarM4233a2.f5915q = num10;
                }
                charSequence6 = zzanVar.f6087s;
                if (charSequence6 != null) {
                    zzamVarM4233a2.f5916r = charSequence6;
                }
                charSequence7 = zzanVar.f6088t;
                if (charSequence7 != null) {
                    zzamVarM4233a2.f5917s = charSequence7;
                }
                charSequence8 = zzanVar.f6089u;
                if (charSequence8 != null) {
                    zzamVarM4233a2.f5918t = charSequence8;
                }
                num11 = zzanVar.f6090v;
                if (num11 != null) {
                    zzamVarM4233a2.f5919u = num11;
                }
                num12 = zzanVar.f6091w;
                if (num12 != null) {
                    zzamVarM4233a2.f5920v = num12;
                }
                charSequence9 = zzanVar.f6092x;
                if (charSequence9 != null) {
                    zzamVarM4233a2.f5921w = charSequence9;
                }
                charSequence10 = zzanVar.f6093y;
                if (charSequence10 != null) {
                    zzamVarM4233a2.f5922x = charSequence10;
                }
                num13 = zzanVar.f6094z;
                if (num13 != null) {
                    zzamVarM4233a2.f5923y = num13;
                }
                zzgwtVar = zzanVar.f6068A;
                if (!zzgwtVar.isEmpty()) {
                    zzamVarM4233a2.f5924z = zzgwt.m7220t(zzgwtVar);
                }
            }
            zzanVar2 = new zzan(zzamVarM4233a2);
        }
        zEquals = zzanVar2.equals(this.f20231M);
        this.f20231M = zzanVar2;
        if (zzmuVar2.f20467l != zzmuVar.f20467l) {
            i10 = 1;
        } else {
            i10 = i5;
        }
        if (zzmuVar2.f20460e != zzmuVar.f20460e) {
            i11 = 1;
        } else {
            i11 = i5;
        }
        if (i11 == 0) {
            zzfuVar = this.f20271y;
            r12 = this.f20270x;
            iZzh = zzh();
            if (iZzh != 2) {
                m8639w();
                this.f20244Z.getClass();
                r12.m6634a(zzk());
                zZzk = zzk();
                if (zzfuVar.f16532a != zZzk) {
                    zzfuVar.f16532a = zZzk;
                }
            } else {
                m8639w();
                this.f20244Z.getClass();
                r12.m6634a(zzk());
                zZzk = zzk();
                if (zzfuVar.f16532a != zZzk) {
                    zzfuVar.f16532a = zZzk;
                }
            }
        } else {
            zzfuVar = this.f20271y;
            r12 = this.f20270x;
            iZzh = zzh();
            if (iZzh != 2) {
                m8639w();
                this.f20244Z.getClass();
                r12.m6634a(zzk());
                zZzk = zzk();
                if (zzfuVar.f16532a != zZzk) {
                    zzfuVar.f16532a = zZzk;
                }
            } else {
                m8639w();
                this.f20244Z.getClass();
                r12.m6634a(zzk());
                zZzk = zzk();
                if (zzfuVar.f16532a != zZzk) {
                    zzfuVar.f16532a = zZzk;
                }
            }
        }
        if (zzmuVar2.f20462g != zzmuVar.f20462g) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!zEquals2) {
            this.f20259m.m6197c(0, new zzeb(i2) { // from class: com.google.android.gms.internal.ads.zzkz
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj10) {
                    int i22 = zzlj.f20218d0;
                    zzbf zzbfVar4 = this.f20205a.f20456a;
                    ((zzaz) obj10).zzb();
                }
            });
        }
        if (z2) {
            zzbdVar = new zzbd();
            if (zzbfVar2.m4833g()) {
                Object obj10 = zzmuVar2.f20457b.f21278a;
                zzbfVar2.mo4841o(obj10, zzbdVar);
                int i22 = zzbdVar.f7634c;
                int iMo4739e2 = zzbfVar2.mo4739e(obj10);
                zzbe zzbeVar4 = this.f15244a;
                obj = zzbfVar2.mo4736b(i22, zzbeVar4, 0L).f7675a;
                zzakVar = zzbeVar4.f7676b;
                obj2 = obj10;
                i16 = i22;
                i17 = iMo4739e2;
            } else {
                i16 = i4;
                i17 = i16;
                obj = null;
                zzakVar = null;
                obj2 = null;
            }
            if (i6 == 0) {
                zzxlVar = zzmuVar2.f20457b;
                if (zzxlVar.m9025b()) {
                    jM8624p = zzbdVar.m4754b(zzxlVar.f21279b, zzxlVar.f21280c);
                    jM8624p2 = m8624p(zzmuVar2);
                } else {
                    if (zzxlVar.f21282e != -1) {
                        jM8624p = m8624p(this.f20244Z);
                    } else {
                        jM8624p = zzbdVar.f7635d;
                    }
                    jM8624p2 = jM8624p;
                }
            } else if (zzmuVar2.f20457b.m9025b()) {
                jM8624p = zzmuVar2.f20473r;
                jM8624p2 = m8624p(zzmuVar2);
            } else {
                jM8624p = zzmuVar2.f20473r;
                jM8624p2 = jM8624p;
            }
            String str3 = zzfm.f16091a;
            zzxl zzxlVar6 = zzmuVar2.f20457b;
            final zzba zzbaVar3 = new zzba(obj, i16, zzakVar, obj2, i17, zzfm.m6518t(jM8624p), zzfm.m6518t(jM8624p2), zzxlVar6.f21279b, zzxlVar6.f21280c);
            iMo4710h2 = mo4710h();
            iMo4714n = mo4714n();
            if (this.f20244Z.f20456a.m4833g()) {
                zzmu zzmuVar4 = this.f20244Z;
                Object obj11 = zzmuVar4.f20457b.f21278a;
                zzmuVar4.f20456a.mo4841o(obj11, this.f20261o);
                iMo4714n = this.f20244Z.f20456a.mo4739e(obj11);
                zzbf zzbfVar4 = this.f20244Z.f20456a;
                zzbe zzbeVar5 = this.f15244a;
                obj3 = zzbfVar4.mo4736b(iMo4710h2, zzbeVar5, 0L).f7675a;
                zzakVar2 = zzbeVar5.f7676b;
                obj4 = obj11;
            } else {
                obj3 = null;
                zzakVar2 = null;
                obj4 = null;
            }
            int i23 = iMo4714n;
            jM6518t = zzfm.m6518t(j2);
            if (this.f20244Z.f20457b.m9025b()) {
                jM6518t2 = zzfm.m6518t(m8624p(this.f20244Z));
            } else {
                jM6518t2 = jM6518t;
            }
            zzxl zzxlVar7 = this.f20244Z.f20457b;
            final zzba zzbaVar4 = new zzba(obj3, iMo4710h2, zzakVar2, obj4, i23, jM6518t, jM6518t2, zzxlVar7.f21279b, zzxlVar7.f21280c);
            this.f20259m.m6197c(11, new zzeb() { // from class: com.google.android.gms.internal.ads.zzla
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj12) {
                    int i24 = zzlj.f20218d0;
                    ((zzaz) obj12).mo4645K(i6, zzbaVar3, zzbaVar4);
                }
            });
        } else {
            z5 = z5;
        }
        if (zBooleanValue) {
            z6 = true;
            this.f20259m.m6197c(1, new zzlb());
        } else {
            z6 = true;
        }
        zzjmVar = zzmuVar2.f20461f;
        zzjmVar2 = zzmuVar.f20461f;
        if (zzjmVar != zzjmVar2) {
            zzegVar = this.f20259m;
            zzegVar.m6197c(10, new zzeb() { // from class: com.google.android.gms.internal.ads.zzlc
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj12) {
                    int i24 = zzlj.f20218d0;
                    ((zzaz) obj12).mo4646L(zzmuVar.f20461f);
                }
            });
            if (zzjmVar2 != null) {
                zzegVar.m6197c(10, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkh
                    @Override // com.google.android.gms.internal.ads.zzeb
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6141b(Object obj12) {
                        int i24 = zzlj.f20218d0;
                        ((zzaz) obj12).mo4647M(zzmuVar.f20461f);
                    }
                });
            }
        }
        zzabjVar = zzmuVar2.f20464i;
        zzabjVar2 = zzmuVar.f20464i;
        if (zzabjVar != zzabjVar2) {
            this.f20255i.mo3922e(zzabjVar2.f4848e);
            this.f20259m.m6197c(2, new zzeb() { // from class: com.google.android.gms.internal.ads.zzki
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj12) {
                    int i24 = zzlj.f20218d0;
                    zzbn zzbnVar = zzmuVar.f20464i.f4847d;
                    ((zzaz) obj12).mo4651d();
                }
            });
        }
        if (!zEquals) {
            this.f20259m.m6197c(14, new zzkj());
        }
        if (z5) {
            this.f20259m.m6197c(3, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkk
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj12) {
                    int i24 = zzlj.f20218d0;
                    boolean z23 = zzmuVar.f20462g;
                    ((zzaz) obj12).mo4649b();
                }
            });
        }
        if (i11 == 0) {
            this.f20259m.m6197c(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkl
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj12) {
                    int i24 = zzlj.f20218d0;
                    boolean z23 = zzmuVar.f20467l;
                    ((zzaz) obj12).zzh();
                }
            });
        } else {
            this.f20259m.m6197c(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkl
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj12) {
                    int i24 = zzlj.f20218d0;
                    boolean z23 = zzmuVar.f20467l;
                    ((zzaz) obj12).zzh();
                }
            });
        }
        if (i11 != 0) {
            this.f20259m.m6197c(4, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkm
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj12) {
                    int i24 = zzlj.f20218d0;
                    ((zzaz) obj12).mo4643I(zzmuVar.f20460e);
                }
            });
        }
        if (i10 == 0) {
            this.f20259m.m6197c(5, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkn
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj12) {
                    int i24 = zzlj.f20218d0;
                    boolean z23 = zzmuVar.f20467l;
                    ((zzaz) obj12).zzj();
                }
            });
        } else {
            this.f20259m.m6197c(5, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkn
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj12) {
                    int i24 = zzlj.f20218d0;
                    boolean z23 = zzmuVar.f20467l;
                    ((zzaz) obj12).zzj();
                }
            });
        }
        if (zzmuVar2.f20469n != zzmuVar.f20469n) {
            this.f20259m.m6197c(6, new zzeb() { // from class: com.google.android.gms.internal.ads.zzko
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj12) {
                    int i24 = zzlj.f20218d0;
                    int i25 = zzmuVar.f20469n;
                    ((zzaz) obj12).zzk();
                }
            });
        }
        if (zzmuVar2.m8764i() != zzmuVar.m8764i()) {
            this.f20259m.m6197c(7, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkp
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj12) {
                    int i24 = zzlj.f20218d0;
                    zzmuVar.getClass();
                    ((zzaz) obj12).zzl();
                }
            });
        }
        if (!zzmuVar2.f20470o.equals(zzmuVar.f20470o)) {
            this.f20259m.m6197c(12, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkq
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj12) {
                    int i24 = zzlj.f20218d0;
                    zzav zzavVar = zzmuVar.f20470o;
                    ((zzaz) obj12).mo4654i();
                }
            });
        }
        zzaxVar = this.f20230L;
        zznmVar = this.f20252f;
        zzax zzaxVar4 = this.f20248c;
        String str4 = zzfm.f16091a;
        zMo4715s = zznmVar.mo4715s();
        zzbfVarMo4709f2 = zznmVar.mo4709f();
        if (zzbfVarMo4709f2.m4833g()) {
            z7 = false;
        } else {
            z7 = false;
        }
        zzbfVarMo4709f3 = zznmVar.mo4709f();
        if (zzbfVarMo4709f3.m4833g()) {
            z8 = false;
            i12 = -1;
        } else {
            int iMo4710h4 = zznmVar.mo4710h();
            zznmVar.zzl();
            zznmVar.mo4708e();
            iMo4835i = zzbfVarMo4709f3.mo4835i(iMo4710h4);
            i12 = -1;
            if (iMo4835i != -1) {
                z8 = z6;
            } else {
                z8 = false;
            }
        }
        zzbfVarMo4709f4 = zznmVar.mo4709f();
        if (zzbfVarMo4709f4.m4833g()) {
            z9 = false;
            z10 = false;
        } else {
            iMo4710h = zznmVar.mo4710h();
            zznmVar.zzl();
            zznmVar.mo4708e();
            z9 = false;
            if (zzbfVarMo4709f4.mo4834h(iMo4710h, 0, false) != i12) {
                z10 = z6;
            } else {
                z10 = false;
            }
        }
        zzbfVarMo4709f5 = zznmVar.mo4709f();
        if (!zzbfVarMo4709f5.m4833g()) {
            z11 = zMo4715s;
            j3 = 0;
            if (zzbfVarMo4709f5.mo4736b(zznmVar.mo4710h(), zznmVar.f15244a, 0L).m4777b()) {
                z12 = z6;
            }
            zzbfVarMo4709f6 = zznmVar.mo4709f();
            if (zzbfVarMo4709f6.m4833g()) {
                z13 = z9;
            } else {
                z13 = z9;
            }
            zM4833g = zznmVar.mo4709f().m4833g();
            zzawVar = new zzaw();
            r8 = zzaxVar4.f7192a.f20733a;
            while (r13 < r8.size()) {
                zzr zzrVar3 = zzawVar.f7163a;
                zzgtr.m7136i(r13, r8.size());
                zzrVar3.m8845a(r8.keyAt(r13));
            }
            boolean z23 = !z11;
            zzawVar.m4451a(4, z23);
            if (z7) {
                z14 = z9;
            } else {
                z14 = z9;
            }
            zzawVar.m4451a(5, z14);
            if (z8) {
                z15 = z9;
            } else {
                z15 = z9;
            }
            zzawVar.m4451a(6, z15);
            if (zM4833g) {
                z16 = z9;
                i13 = 7;
            } else {
                z16 = z9;
                i13 = 7;
            }
            zzawVar.m4451a(i13, z16);
            if (z10) {
                z17 = z9;
            } else {
                z17 = z9;
            }
            zzawVar.m4451a(8, z17);
            if (zM4833g) {
                z18 = z9;
            } else {
                z18 = z9;
            }
            zzawVar.m4451a(9, z18);
            zzawVar.m4451a(10, z23);
            if (z7) {
                z19 = z9;
                i14 = 11;
            } else {
                z19 = z9;
                i14 = 11;
            }
            zzawVar.m4451a(i14, z19);
            if (z7) {
                z20 = z9;
                i15 = 12;
            } else {
                z20 = z9;
                i15 = 12;
            }
            zzawVar.m4451a(i15, z20);
            zzaxVar2 = new zzax(zzawVar.f7163a.m8846b());
            this.f20230L = zzaxVar2;
            if (!zzaxVar2.equals(zzaxVar)) {
                this.f20259m.m6197c(13, new zzks());
            }
            this.f20259m.m6198d();
        }
        z11 = zMo4715s;
        j3 = 0;
        z12 = z9;
        zzbfVarMo4709f6 = zznmVar.mo4709f();
        if (zzbfVarMo4709f6.m4833g()) {
            z13 = z9;
        } else {
            z13 = z9;
        }
        zM4833g = zznmVar.mo4709f().m4833g();
        zzawVar = new zzaw();
        r8 = zzaxVar4.f7192a.f20733a;
        while (r13 < r8.size()) {
            zzr zzrVar4 = zzawVar.f7163a;
            zzgtr.m7136i(r13, r8.size());
            zzrVar4.m8845a(r8.keyAt(r13));
        }
        boolean z24 = !z11;
        zzawVar.m4451a(4, z24);
        if (z7) {
            z14 = z9;
        } else {
            z14 = z9;
        }
        zzawVar.m4451a(5, z14);
        if (z8) {
            z15 = z9;
        } else {
            z15 = z9;
        }
        zzawVar.m4451a(6, z15);
        if (zM4833g) {
            z16 = z9;
            i13 = 7;
        } else {
            z16 = z9;
            i13 = 7;
        }
        zzawVar.m4451a(i13, z16);
        if (z10) {
            z17 = z9;
        } else {
            z17 = z9;
        }
        zzawVar.m4451a(8, z17);
        if (zM4833g) {
            z18 = z9;
        } else {
            z18 = z9;
        }
        zzawVar.m4451a(9, z18);
        zzawVar.m4451a(10, z24);
        if (z7) {
            z19 = z9;
            i14 = 11;
        } else {
            z19 = z9;
            i14 = 11;
        }
        zzawVar.m4451a(i14, z19);
        if (z7) {
            z20 = z9;
            i15 = 12;
        } else {
            z20 = z9;
            i15 = 12;
        }
        zzawVar.m4451a(i15, z20);
        zzaxVar2 = new zzax(zzawVar.f7163a.m8846b());
        this.f20230L = zzaxVar2;
        if (!zzaxVar2.equals(zzaxVar)) {
            this.f20259m.m6197c(13, new zzks());
        }
        this.f20259m.m6198d();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /* JADX INFO: renamed from: q */
    public final zzmu m8635q(zzmu zzmuVar, zzbf zzbfVar, Pair pair) {
        boolean z;
        List list;
        zzgtr.m7128a(zzbfVar.m4833g() || pair != null);
        zzbf zzbfVar2 = zzmuVar.f20456a;
        long jM8632j = m8632j(zzmuVar);
        zzmu zzmuVarM8758c = zzmuVar.m8758c(zzbfVar);
        if (zzbfVar.m4833g()) {
            zzxl zzxlVar = zzmu.f20455t;
            long jM6519u = zzfm.m6519u(this.f20247b0);
            zzmu zzmuVarM8762g = zzmuVarM8758c.m8757b(zzxlVar, jM6519u, jM6519u, jM6519u, 0L, zzzo.f21490d, this.f20246b, zzgyo.f18355w).m8762g(zzxlVar);
            zzmuVarM8762g.f20471p = zzmuVarM8762g.f20473r;
            return zzmuVarM8762g;
        }
        zzxl zzxlVar2 = zzmuVarM8758c.f20457b;
        Object obj = zzxlVar2.f21278a;
        String str = zzfm.f16091a;
        boolean zEquals = obj.equals(pair.first);
        zzxl zzxlVar3 = !zEquals ? new zzxl(-1L, pair.first) : zzxlVar2;
        long jLongValue = ((Long) pair.second).longValue();
        long jM6519u2 = zzfm.m6519u(jM8632j);
        if (zzbfVar2.m4833g()) {
            z = true;
        } else {
            zzbd zzbdVar = this.f20261o;
            zzbfVar2.mo4841o(obj, zzbdVar);
            if (zEquals && jM6519u2 - jLongValue == 1) {
                zzbd zzbdVarMo4841o = zzbfVar2.mo4841o(obj, zzbdVar);
                z = true;
                if (jM6519u2 == zzbdVarMo4841o.f7635d) {
                    jM6519u2--;
                }
            } else {
                z = true;
            }
        }
        if (!zEquals || jLongValue < jM6519u2) {
            zzgtr.m7133f(zzxlVar3.m9025b() ^ z);
            zzzo zzzoVar = !zEquals ? zzzo.f21490d : zzmuVarM8758c.f20463h;
            zzabj zzabjVar = !zEquals ? this.f20246b : zzmuVarM8758c.f20464i;
            if (zEquals) {
                list = zzmuVarM8758c.f20465j;
            } else {
                zzgzi zzgziVar = zzgwt.f18303t;
                list = zzgyo.f18355w;
            }
            zzxl zzxlVar4 = zzxlVar3;
            zzmu zzmuVarM8762g2 = zzmuVarM8758c.m8757b(zzxlVar4, jLongValue, jLongValue, jLongValue, 0L, zzzoVar, zzabjVar, list).m8762g(zzxlVar4);
            zzmuVarM8762g2.f20471p = jLongValue;
            return zzmuVarM8762g2;
        }
        if (jLongValue != jM6519u2) {
            zzgtr.m7133f(zzxlVar3.m9025b() ^ z);
            long jMax = Math.max(0L, zzmuVarM8758c.f20472q - (jLongValue - jM6519u2));
            long j2 = zzmuVarM8758c.f20471p;
            if (zzmuVarM8758c.f20466k.equals(zzxlVar2)) {
                j2 = jLongValue + jMax;
            }
            zzmu zzmuVarM8757b = zzmuVarM8758c.m8757b(zzxlVar3, jLongValue, jLongValue, jLongValue, jMax, zzmuVarM8758c.f20463h, zzmuVarM8758c.f20464i, zzmuVarM8758c.f20465j);
            zzmuVarM8757b.f20471p = j2;
            return zzmuVarM8757b;
        }
        int iMo4739e = zzbfVar.mo4739e(zzmuVarM8758c.f20466k.f21278a);
        if (iMo4739e != -1) {
            zzbd zzbdVar2 = this.f20261o;
            if (zzbfVar.mo4738d(iMo4739e, zzbdVar2, false).f7634c == zzbfVar.mo4841o(zzxlVar3.f21278a, zzbdVar2).f7634c) {
                return zzmuVarM8758c;
            }
        }
        Object obj2 = zzxlVar3.f21278a;
        zzbd zzbdVar3 = this.f20261o;
        zzbfVar.mo4841o(obj2, zzbdVar3);
        long jM4754b = zzxlVar3.m9025b() ? zzbdVar3.m4754b(zzxlVar3.f21279b, zzxlVar3.f21280c) : zzbdVar3.f7635d;
        zzxl zzxlVar5 = zzxlVar3;
        zzmu zzmuVarM8762g3 = zzmuVarM8758c.m8757b(zzxlVar5, zzmuVarM8758c.f20473r, zzmuVarM8758c.f20473r, zzmuVarM8758c.f20459d, jM4754b - zzmuVarM8758c.f20473r, zzmuVarM8758c.f20463h, zzmuVarM8758c.f20464i, zzmuVarM8758c.f20465j).m8762g(zzxlVar5);
        zzmuVarM8762g3.f20471p = jM4754b;
        return zzmuVarM8762g3;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    /* JADX INFO: renamed from: s */
    public final boolean mo4715s() {
        m8639w();
        return this.f20244Z.f20457b.m9025b();
    }

    /* JADX INFO: renamed from: t */
    public final Pair m8636t(zzbf zzbfVar, int i2, long j2) {
        if (zzbfVar.m4833g()) {
            this.f20245a0 = i2;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.f20247b0 = j2;
            return null;
        }
        if (i2 == -1 || i2 >= zzbfVar.mo4735a()) {
            i2 = zzbfVar.mo4837k(false);
            zzbfVar.mo4736b(i2, this.f15244a, 0L).getClass();
            j2 = zzfm.m6518t(0L);
        }
        return zzbfVar.m4839m(this.f15244a, this.f20261o, i2, zzfm.m6519u(j2));
    }

    /* JADX INFO: renamed from: u */
    public final void m8637u(Surface surface) {
        Object obj = this.f20232N;
        boolean z = false;
        boolean zM6052c = true;
        if (obj != null && obj != surface) {
            z = true;
        }
        long j2 = z ? this.f20272z : -9223372036854775807L;
        zzlw zzlwVar = this.f20258l;
        if (!zzlwVar.f20320Z && zzlwVar.f20295A.getThread().isAlive()) {
            zzdt zzdtVar = new zzdt();
            ((zzfg) zzlwVar.f20348y.mo6124i(30, new Pair(surface, zzdtVar))).m6435a();
            if (j2 != -9223372036854775807L) {
                zM6052c = zzdtVar.m6052c(j2);
            }
        }
        if (z) {
            Object obj2 = this.f20232N;
            Surface surface2 = this.f20233O;
            if (obj2 == surface2) {
                surface2.release();
                this.f20233O = null;
            }
        }
        this.f20232N = surface;
        if (zM6052c) {
            return;
        }
        m8630d(new zzjm(2, new zzlx("Detaching surface timed out."), PointerIconCompat.TYPE_HELP));
    }

    /* JADX INFO: renamed from: v */
    public final void m8638v(int i2, int i3) {
        zzev zzevVar = this.f20235Q;
        if (i2 == zzevVar.f14943a && i3 == zzevVar.f14944b) {
            return;
        }
        this.f20235Q = new zzev(i2, i3);
        zzkt zzktVar = new zzkt();
        zzeg zzegVar = this.f20259m;
        zzegVar.m6197c(24, zzktVar);
        zzegVar.m6198d();
        m8640y(2, 14, new zzev(i2, i3));
    }

    /* JADX INFO: renamed from: w */
    public final void m8639w() {
        this.f20250d.m6051b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f20265s;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = zzfm.f16091a;
            Locale locale = Locale.US;
            String str2 = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.f20239U) {
                throw new IllegalStateException(str2);
            }
            zzeh.m6212d("ExoPlayerImpl", str2, this.f20240V ? null : new IllegalStateException());
            this.f20240V = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    /* JADX INFO: renamed from: x */
    public final int mo4716x() {
        m8639w();
        if (mo4715s()) {
            return this.f20244Z.f20457b.f21280c;
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public final void m8640y(int i2, int i3, Object obj) {
        zzlw zzlwVar;
        zznc[] zzncVarArr = this.f20253g;
        int length = zzncVarArr.length;
        int i4 = 0;
        while (true) {
            zzlwVar = this.f20258l;
            if (i4 >= 2) {
                break;
            }
            zznc zzncVar = zzncVarArr[i4];
            if (i2 == -1 || zzncVar.zza() == i2) {
                m8631g(this.f20244Z);
                zzbf zzbfVar = this.f20244Z.f20456a;
                zzmy zzmyVar = new zzmy(zzlwVar, zzncVar, zzlwVar.f20295A);
                zzgtr.m7133f(!zzmyVar.f20484f);
                zzmyVar.f20481c = i3;
                zzgtr.m7133f(!zzmyVar.f20484f);
                zzmyVar.f20482d = obj;
                zzgtr.m7133f(!zzmyVar.f20484f);
                zzmyVar.f20484f = true;
                zzlwVar.mo8667a(zzmyVar);
            }
            i4++;
        }
        zznc[] zzncVarArr2 = this.f20254h;
        int length2 = zzncVarArr2.length;
        for (int i5 = 0; i5 < 2; i5++) {
            zznc zzncVar2 = zzncVarArr2[i5];
            if (zzncVar2 != null && (i2 == -1 || zzncVar2.zza() == i2)) {
                m8631g(this.f20244Z);
                zzbf zzbfVar2 = this.f20244Z.f20456a;
                zzmy zzmyVar2 = new zzmy(zzlwVar, zzncVar2, zzlwVar.f20295A);
                zzgtr.m7133f(!zzmyVar2.f20484f);
                zzmyVar2.f20481c = i3;
                zzgtr.m7133f(!zzmyVar2.f20484f);
                zzmyVar2.f20482d = obj;
                zzgtr.m7133f(!zzmyVar2.f20484f);
                zzmyVar2.f20484f = true;
                zzlwVar.mo8667a(zzmyVar2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    /* JADX INFO: renamed from: z */
    public final long mo4717z() {
        m8639w();
        return zzfm.m6518t(this.f20244Z.f20472q);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        m8639w();
        return this.f20244Z.f20460e;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        m8639w();
        return this.f20244Z.f20469n;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        m8639w();
        return this.f20244Z.f20467l;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzl() {
        m8639w();
    }
}
