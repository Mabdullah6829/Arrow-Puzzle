package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcjn extends zzcjh implements zzip {

    /* JADX INFO: renamed from: G */
    public static final AtomicInteger f10234G = new AtomicInteger(0);

    /* JADX INFO: renamed from: A */
    public ByteBuffer f10235A;

    /* JADX INFO: renamed from: B */
    public boolean f10236B;

    /* JADX INFO: renamed from: C */
    public final Object f10237C;

    /* JADX INFO: renamed from: D */
    public final String f10238D;

    /* JADX INFO: renamed from: E */
    public final int f10239E;

    /* JADX INFO: renamed from: F */
    public boolean f10240F;

    /* JADX INFO: renamed from: v */
    public String f10241v;

    /* JADX INFO: renamed from: w */
    public final zzcht f10242w;

    /* JADX INFO: renamed from: x */
    public boolean f10243x;

    /* JADX INFO: renamed from: y */
    public final zzcjm f10244y;

    /* JADX INFO: renamed from: z */
    public final zzciq f10245z;

    public zzcjn(zzchu zzchuVar, zzcht zzchtVar) {
        super(zzchuVar);
        this.f10242w = zzchtVar;
        this.f10244y = new zzcjm();
        this.f10245z = new zzciq();
        this.f10237C = new Object();
        String strMo5471g = zzchuVar.mo5471g();
        this.f10238D = (String) (strMo5471g == null ? zzgsx.f18165s : new zzgtw(strMo5471g)).mo7116a();
        this.f10239E = zzchuVar.mo5473i();
        f10234G.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzip
    /* JADX INFO: renamed from: e */
    public final void mo3938e(zzhj zzhjVar, zzhv zzhvVar, boolean z) {
        if (zzhjVar instanceof zzic) {
            this.f10244y.f10232a.add((zzic) zzhjVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    @Override // com.google.android.gms.internal.ads.zzcjh
    /* JADX INFO: renamed from: f */
    public final boolean mo5505f(String str) {
        String str2;
        String str3;
        this.f10241v = str;
        String str4 = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
        String strConcat = "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.m3035d(str, "MD5")));
        try {
            zzhy zzhyVar = new zzhy();
            zzhyVar.f19429c = this.f10225t;
            zzcht zzchtVar = this.f10242w;
            zzhyVar.f19430d = zzchtVar.f10083d;
            zzhyVar.f19431e = zzchtVar.f10084e;
            zzhyVar.f19432f = true;
            zzhyVar.f19428b = this;
            zzic zzicVarZza = zzhyVar.zza();
            zzhr zzcioVar = zzicVarZza;
            if (zzchtVar.f10088i) {
                zzcioVar = new zzcio(this.f10224s, zzicVarZza, this.f10238D, this.f10239E);
            }
            zzcioVar.mo5494c(new zzhv(Uri.parse(str), 0L, -1L));
            zzchu zzchuVar = (zzchu) this.f10226u.get();
            if (zzchuVar != null) {
                zzchuVar.mo5478u(strConcat, this);
            }
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbio zzbioVar = zzbix.f8573i0;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            long jLongValue = ((Long) zzbaVar.f3098c.m5030a(zzbioVar)).longValue();
            long jLongValue2 = ((Long) zzbaVar.f3098c.m5030a(zzbix.f8556h0)).longValue();
            this.f10235A = ByteBuffer.allocate(zzchtVar.f10082c);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j2 = jCurrentTimeMillis;
            zzhr zzhrVar = zzcioVar;
            while (true) {
                int iMo4082b = zzhrVar.mo4082b(bArr, 0, Math.min(this.f10235A.remaining(), i2));
                if (iMo4082b == -1) {
                    this.f10240F = true;
                    com.google.android.gms.ads.internal.util.client.zzf.f3409b.post(new zzcjf(this, str, strConcat, (int) this.f10245z.m5500a(this.f10235A)));
                    return true;
                }
                synchronized (this.f10237C) {
                    str2 = str4;
                    try {
                        if (!this.f10243x) {
                            this.f10235A.put(bArr, 0, iMo4082b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    if (this.f10235A.remaining() <= 0) {
                        m5516r();
                        return true;
                    }
                    str3 = this.f10243x;
                    try {
                        if (str3 != 0) {
                            int iLimit = this.f10235A.limit();
                            StringBuilder sb = new StringBuilder(String.valueOf(iLimit).length() + 24);
                            sb.append("Precache abort at ");
                            sb.append(iLimit);
                            sb.append(" bytes");
                            throw new IOException(sb.toString());
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (jCurrentTimeMillis2 - j2 >= jLongValue) {
                            m5516r();
                            j2 = jCurrentTimeMillis2;
                        }
                        if (jCurrentTimeMillis2 - jCurrentTimeMillis > 1000 * jLongValue2) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue2).length() + 29);
                            sb2.append("Timeout exceeded. Limit: ");
                            sb2.append(jLongValue2);
                            sb2.append(" sec");
                            throw new IOException(sb2.toString());
                        }
                        str4 = str2;
                        zzhrVar = zzhrVar;
                        i2 = 8192;
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str3 = str2;
                }
                str3 = str2;
                String canonicalName = e.getClass().getCanonicalName();
                String message = e.getMessage();
                String strM2450q = AbstractC1456a.m2450q(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                String strM2451r = AbstractC1456a.m2451r(new StringBuilder(strM2450q.length() + String.valueOf(str).length() + 34), "Failed to preload url ", str, " Exception: ", strM2450q);
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f(strM2451r);
                m5513p(str, strConcat, str3, strM2450q);
                return false;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = str4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    /* JADX INFO: renamed from: o */
    public final void mo5512o() {
        this.f10243x = true;
    }

    /* JADX INFO: renamed from: r */
    public final void m5516r() {
        zzcjm zzcjmVar = this.f10244y;
        Iterator it = zzcjmVar.f10232a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((zzic) it.next()).zzj().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        zzcjmVar.f10233b = Math.max(zzcjmVar.f10233b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i2 = (int) zzcjmVar.f10233b;
        int iM5500a = (int) this.f10245z.m5500a(this.f10235A);
        int iPosition = this.f10235A.position();
        int iRound = Math.round((iPosition / i2) * iM5500a);
        int i3 = zzchl.f10038s.get();
        int i4 = zzchl.f10039t.get();
        String str = this.f10241v;
        com.google.android.gms.ads.internal.util.client.zzf.f3409b.post(new zzcjd(this, str, "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.m3035d(str, "MD5"))), iPosition, i2, iRound, iM5500a, iRound > 0, i3, i4));
    }

    @Override // com.google.android.gms.internal.ads.zzcjh, com.google.android.gms.common.api.Releasable
    public final void release() {
        f10234G.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzip
    /* JADX INFO: renamed from: k */
    public final void mo3941k(zzhv zzhvVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzip
    /* JADX INFO: renamed from: g */
    public final void mo3940g(zzhv zzhvVar, boolean z, int i2) {
    }
}
