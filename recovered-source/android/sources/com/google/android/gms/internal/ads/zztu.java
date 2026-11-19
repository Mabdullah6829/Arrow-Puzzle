package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zztu implements zzsg {

    /* JADX INFO: renamed from: Y */
    public static final AtomicInteger f20911Y = new AtomicInteger();

    /* JADX INFO: renamed from: A */
    public long f20912A;

    /* JADX INFO: renamed from: B */
    public int f20913B;

    /* JADX INFO: renamed from: C */
    public boolean f20914C;

    /* JADX INFO: renamed from: D */
    public boolean f20915D;

    /* JADX INFO: renamed from: E */
    public long f20916E;

    /* JADX INFO: renamed from: F */
    public long f20917F;

    /* JADX INFO: renamed from: G */
    public float f20918G;

    /* JADX INFO: renamed from: H */
    public ByteBuffer f20919H;

    /* JADX INFO: renamed from: I */
    public int f20920I;

    /* JADX INFO: renamed from: J */
    public ByteBuffer f20921J;

    /* JADX INFO: renamed from: K */
    public boolean f20922K;

    /* JADX INFO: renamed from: L */
    public boolean f20923L;

    /* JADX INFO: renamed from: M */
    public boolean f20924M;

    /* JADX INFO: renamed from: N */
    public boolean f20925N;

    /* JADX INFO: renamed from: O */
    public int f20926O;

    /* JADX INFO: renamed from: P */
    public boolean f20927P;

    /* JADX INFO: renamed from: Q */
    public zze f20928Q;

    /* JADX INFO: renamed from: R */
    public AudioDeviceInfo f20929R;

    /* JADX INFO: renamed from: S */
    public int f20930S;

    /* JADX INFO: renamed from: T */
    public long f20931T;

    /* JADX INFO: renamed from: U */
    public long f20932U;

    /* JADX INFO: renamed from: V */
    public long f20933V;

    /* JADX INFO: renamed from: W */
    public Handler f20934W;

    /* JADX INFO: renamed from: X */
    public final zztp f20935X;

    /* JADX INFO: renamed from: a */
    public final Context f20936a;

    /* JADX INFO: renamed from: b */
    public final zztj f20937b;

    /* JADX INFO: renamed from: c */
    public final zzug f20938c;

    /* JADX INFO: renamed from: d */
    public final zzcw f20939d;

    /* JADX INFO: renamed from: e */
    public final zzuf f20940e;

    /* JADX INFO: renamed from: f */
    public final zzgwt f20941f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f20942g;

    /* JADX INFO: renamed from: h */
    public zztl f20943h;

    /* JADX INFO: renamed from: i */
    public final zztt f20944i;

    /* JADX INFO: renamed from: j */
    public final zztt f20945j;

    /* JADX INFO: renamed from: k */
    public zzqh f20946k;

    /* JADX INFO: renamed from: l */
    public zzsd f20947l;

    /* JADX INFO: renamed from: m */
    public zzto f20948m;

    /* JADX INFO: renamed from: n */
    public zzto f20949n;

    /* JADX INFO: renamed from: o */
    public zzck f20950o;

    /* JADX INFO: renamed from: p */
    public final zztg f20951p;

    /* JADX INFO: renamed from: q */
    public zzre f20952q;

    /* JADX INFO: renamed from: r */
    public zztb f20953r;

    /* JADX INFO: renamed from: s */
    public zzd f20954s;

    /* JADX INFO: renamed from: t */
    public zzts f20955t;

    /* JADX INFO: renamed from: u */
    public zzts f20956u;

    /* JADX INFO: renamed from: v */
    public zzav f20957v;

    /* JADX INFO: renamed from: w */
    public boolean f20958w;

    /* JADX INFO: renamed from: x */
    public long f20959x;

    /* JADX INFO: renamed from: y */
    public long f20960y;

    /* JADX INFO: renamed from: z */
    public long f20961z;

    public zztu(zztn zztnVar) {
        int deviceId;
        Context context = zztnVar.f20884a;
        this.f20936a = context == null ? null : context.getApplicationContext();
        this.f20954s = zzd.f11854b;
        this.f20935X = zztnVar.f20889f;
        this.f20951p = zztnVar.f20888e;
        zztj zztjVar = new zztj();
        this.f20937b = zztjVar;
        zzug zzugVar = new zzug();
        this.f20938c = zzugVar;
        this.f20939d = new zzcw();
        this.f20940e = new zzuf();
        this.f20941f = zzgwt.m7217q(zzugVar, zztjVar);
        this.f20918G = 1.0f;
        this.f20926O = 0;
        this.f20928Q = new zze();
        zzav zzavVar = zzav.f6969d;
        this.f20956u = new zzts(zzavVar, 0L, 0L);
        this.f20957v = zzavVar;
        this.f20958w = false;
        this.f20942g = new ArrayDeque();
        this.f20944i = new zztt();
        this.f20945j = new zztt();
        int i2 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i2 = deviceId;
        }
        this.f20930S = i2;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX INFO: renamed from: c */
    public static int m8872c(int i2, ByteBuffer byteBuffer) {
        int i3;
        int i4;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (i2 == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i3 = 0;
            } else {
                byte b2 = byteBuffer.get(26);
                int i11 = 28;
                int i12 = 28;
                for (int i13 = 0; i13 < b2; i13++) {
                    i12 += byteBuffer.get(i13 + 27);
                }
                byte b3 = byteBuffer.get(i12 + 26);
                for (int i14 = 0; i14 < b3; i14++) {
                    i11 += byteBuffer.get(i12 + 27 + i14);
                }
                i3 = i12 + i11;
            }
            int i15 = byteBuffer.get(i3 + 26) + 27 + i3;
            return (int) ((zzgx.m7234b(byteBuffer.get(i15), byteBuffer.limit() - i15 > 1 ? byteBuffer.get(i15 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i2 != 30) {
            switch (i2) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    String str = zzfm.f16091a;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    if ((iReverseBytes & (-2097152)) != -2097152 || (i8 = (iReverseBytes >>> 19) & 3) == 1 || (i9 = (iReverseBytes >>> 17) & 3) == 0) {
                        i7 = -1;
                    } else {
                        int i16 = iReverseBytes >>> 12;
                        int i17 = (iReverseBytes >>> 10) & 3;
                        int i18 = i16 & 15;
                        if (i18 == 0 || i18 == 15 || i17 == 3) {
                            i7 = -1;
                        } else {
                            i7 = 1152;
                            if (i9 != 1) {
                                if (i9 != 2) {
                                    i7 = 384;
                                }
                            } else if (i8 != 3) {
                                i7 = 576;
                            }
                        }
                    }
                    if (i7 != -1) {
                        return i7;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i2) {
                        case 14:
                            int iPosition2 = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i19 = iPosition2;
                            while (true) {
                                if (i19 <= iLimit) {
                                    String str2 = zzfm.f16091a;
                                    int iReverseBytes2 = byteBuffer.getInt(i19 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                    }
                                    if ((iReverseBytes2 & (-2)) == -126718022) {
                                        i10 = i19 - iPosition2;
                                    } else {
                                        i19++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 != -1) {
                                return (40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            }
                            return 0;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int iPosition3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition3);
                            return zzafd.m4057a(new zzet(bArr, 16)).f5156c;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 27), "Unexpected audio encoding: ", i2));
                    }
                    break;
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return zzafa.f5141a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition4 = byteBuffer.position();
        byte b4 = byteBuffer.get(iPosition4);
        if (b4 != -2) {
            if (b4 != -1) {
                if (b4 != 31) {
                    i5 = (byteBuffer.get(iPosition4 + 4) & 1) << 6;
                    i6 = byteBuffer.get(iPosition4 + 5) & 252;
                } else {
                    i5 = (byteBuffer.get(iPosition4 + 5) & 7) << 4;
                    b = byteBuffer.get(iPosition4 + 6);
                }
                i4 = (i6 >> 2) | i5;
            } else {
                i5 = (byteBuffer.get(iPosition4 + 4) & 7) << 4;
                b = byteBuffer.get(iPosition4 + 7);
            }
            i6 = b & 60;
            i4 = (i6 >> 2) | i5;
        } else {
            i4 = ((byteBuffer.get(iPosition4 + 5) & 1) << 6) | ((byteBuffer.get(iPosition4 + 4) & 252) >> 2);
        }
        return (i4 + 1) * 32;
    }

    /* JADX INFO: renamed from: a */
    public final void m8873a() {
        if (m8883l()) {
            this.f20959x = 0L;
            this.f20960y = 0L;
            this.f20961z = 0L;
            this.f20912A = 0L;
            this.f20913B = 0;
            this.f20956u = new zzts(this.f20957v, 0L, 0L);
            this.f20916E = 0L;
            this.f20955t = null;
            this.f20942g.clear();
            this.f20919H = null;
            this.f20920I = 0;
            this.f20921J = null;
            this.f20923L = false;
            this.f20922K = false;
            this.f20924M = false;
            this.f20938c.f21003o = 0L;
            m8875d(-9223372036854775807L);
            this.f20943h = null;
            zzto zztoVar = this.f20948m;
            if (zztoVar != null) {
                this.f20949n = zztoVar;
                this.f20948m = null;
            }
            f20911Y.incrementAndGet();
            zztb zztbVar = this.f20953r;
            if (zztbVar.f20825e.f20854d.getPlayState() == 3) {
                zztbVar.f20821a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && zztbVar.m8855b()) {
                zzta zztaVar = zztbVar.f20828h;
                zztaVar.getClass();
                zztaVar.f20817c.f20821a.unregisterStreamEventCallback(zztaVar.f20816b);
                zztaVar.f20815a.removeCallbacksAndMessages(null);
            }
            zzss zzssVar = zztbVar.f20824d;
            if (zzssVar != null) {
                AudioRouting.OnRoutingChangedListener onRoutingChangedListener = zzssVar.f20767d;
                onRoutingChangedListener.getClass();
                zzssVar.f20764a.removeOnRoutingChangedListener(onRoutingChangedListener);
                zzssVar.f20767d = null;
                zztbVar.f20824d = null;
            }
            final AudioTrack audioTrack = zztbVar.f20821a;
            final zzeg zzegVar = zztbVar.f20829i;
            final Handler handlerM6514p = zzfm.m6514p();
            synchronized (zztb.f20818o) {
                try {
                    if (zztb.f20819p == null) {
                        zztb.f20819p = Executors.newSingleThreadScheduledExecutor(new zzfk());
                    }
                    zztb.f20820q++;
                    zztb.f20819p.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsn
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            AudioTrack audioTrack2 = audioTrack;
                            Handler handler = handlerM6514p;
                            final zzeg zzegVar2 = zzegVar;
                            try {
                                audioTrack2.flush();
                                audioTrack2.release();
                                if (handler.getLooper().getThread().isAlive()) {
                                    handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsl
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzeg zzegVar3 = zzegVar2;
                                            zzegVar3.getClass();
                                            if (Thread.currentThread() == zzegVar3.f13832a) {
                                                zzegVar3.m6197c(-1, zzsj.f20752a);
                                                zzegVar3.m6198d();
                                            }
                                        }
                                    });
                                }
                                synchronized (zztb.f20818o) {
                                    try {
                                        int i2 = zztb.f20820q - 1;
                                        zztb.f20820q = i2;
                                        if (i2 == 0) {
                                            ScheduledExecutorService scheduledExecutorService = zztb.f20819p;
                                            if (scheduledExecutorService == null) {
                                                throw null;
                                            }
                                            scheduledExecutorService.shutdown();
                                            zztb.f20819p = null;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                if (handler.getLooper().getThread().isAlive()) {
                                    handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzeg zzegVar3 = zzegVar2;
                                            zzegVar3.getClass();
                                            if (Thread.currentThread() == zzegVar3.f13832a) {
                                                zzegVar3.m6197c(-1, zzsj.f20752a);
                                                zzegVar3.m6198d();
                                            }
                                        }
                                    });
                                }
                                synchronized (zztb.f20818o) {
                                    try {
                                        int i3 = zztb.f20820q - 1;
                                        zztb.f20820q = i3;
                                        if (i3 == 0) {
                                            ScheduledExecutorService scheduledExecutorService2 = zztb.f20819p;
                                            if (scheduledExecutorService2 == null) {
                                                throw null;
                                            }
                                            scheduledExecutorService2.shutdown();
                                            zztb.f20819p = null;
                                        }
                                        throw th2;
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f20953r = null;
        }
        zztt zzttVar = this.f20945j;
        zzttVar.f20908a = null;
        zzttVar.f20909b = -9223372036854775807L;
        zzttVar.f20910c = -9223372036854775807L;
        zztt zzttVar2 = this.f20944i;
        zzttVar2.f20908a = null;
        zzttVar2.f20909b = -9223372036854775807L;
        zzttVar2.f20910c = -9223372036854775807L;
        this.f20932U = 0L;
        this.f20933V = 0L;
        Handler handler = this.f20934W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8874b() {
        m8873a();
        zzgyo zzgyoVar = (zzgyo) this.f20941f;
        int i2 = zzgyoVar.f18357v;
        for (int i3 = 0; i3 < i2; i3++) {
            ((zzcp) zzgyoVar.get(i3)).zzj();
        }
        this.f20939d.zzj();
        this.f20940e.zzj();
        zzck zzckVar = this.f20950o;
        if (zzckVar != null) {
            int i4 = 0;
            while (true) {
                zzgwt zzgwtVar = zzckVar.f10310a;
                if (i4 >= zzgwtVar.size()) {
                    break;
                }
                zzcp zzcpVar = (zzcp) zzgwtVar.get(i4);
                zzcpVar.mo5720g(zzcn.f10579d);
                zzcpVar.zzj();
                i4++;
            }
            zzckVar.f10311b.clear();
            zzckVar.f10312c = new ByteBuffer[0];
            zzcl zzclVar = zzcl.f10386e;
            zzckVar.f10313d = false;
        }
        this.f20925N = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m8875d(long j2) {
        long j3;
        zzto zztoVar = this.f20949n;
        this.f20950o = zztoVar.f20896f;
        if (j2 == -9223372036854775807L) {
            j3 = 0;
        } else {
            j3 = j2 - this.f20917F;
            if (zztoVar.f20897g != zzbf.f7725a && zztoVar.f20898h != null) {
                zzbd zzbdVar = new zzbd();
                zzto zztoVar2 = this.f20949n;
                zztoVar2.f20897g.mo4841o(zztoVar2.f20898h, zzbdVar);
            }
        }
        zzck zzckVar = this.f20950o;
        zzcm zzcmVar = new zzcm();
        zzto zztoVar3 = this.f20949n;
        zzcmVar.f10489b = zztoVar3.f20897g;
        zzcmVar.f10490c = zztoVar3.f20898h;
        zzcmVar.f10488a = j3;
        zzcn zzcnVarM5654a = zzcmVar.m5654a();
        ArrayList arrayList = zzckVar.f10311b;
        arrayList.clear();
        zzckVar.f10313d = false;
        int i2 = 0;
        while (true) {
            zzgwt zzgwtVar = zzckVar.f10310a;
            if (i2 >= zzgwtVar.size()) {
                break;
            }
            zzcp zzcpVar = (zzcp) zzgwtVar.get(i2);
            zzcpVar.mo5720g(zzcnVarM5654a);
            if (zzcpVar.zzc()) {
                zzcm zzcmVar2 = new zzcm();
                long j4 = zzcnVarM5654a.f10580a;
                zzcmVar2.f10488a = j4;
                zzcmVar2.f10489b = zzcnVarM5654a.f10581b;
                zzcmVar2.f10490c = zzcnVarM5654a.f10582c;
                zzcmVar2.f10488a = zzcpVar.mo5718e(j4);
                zzcnVarM5654a = zzcmVar2.m5654a();
                arrayList.add(zzcpVar);
            }
            i2++;
        }
        zzckVar.f10312c = new ByteBuffer[arrayList.size()];
        for (int i3 = 0; i3 <= zzckVar.m5535e(); i3++) {
            zzckVar.f10312c[i3] = ((zzcp) arrayList.get(i3)).mo5715b();
        }
    }

    /* JADX INFO: renamed from: e */
    public final zztb m8876e(zzrg zzrgVar) throws zzsc {
        try {
            return this.f20951p.m8862c(zzrgVar);
        } catch (zzrd e) {
            int i2 = zzrgVar.f20697b;
            int i3 = zzrgVar.f20698c;
            int i4 = zzrgVar.f20696a;
            int i5 = zzrgVar.f20699d;
            String strValueOf = String.valueOf(this.f20949n.f20891a);
            int length = String.valueOf(i2).length();
            int length2 = String.valueOf(i3).length();
            int length3 = String.valueOf(i4).length();
            StringBuilder sb = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i5).length() + 2 + strValueOf.length());
            AbstractC1456a.m2455v(sb, "AudioTrack init failed 0 Config(", i2, ", ", i3);
            AbstractC1456a.m2455v(sb, ", ", i4, ", ", i5);
            zzsc zzscVar = new zzsc(AbstractC1456a.m2450q(sb, ") ", strValueOf, ""), e);
            zzsd zzsdVar = this.f20947l;
            if (zzsdVar == null) {
                throw zzscVar;
            }
            ((zztz) zzsdVar).m8893a(zzscVar);
            throw zzscVar;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8877f(long j2) throws zzsf {
        ByteBuffer byteBuffer;
        m8880i(j2);
        if (this.f20921J != null) {
            return;
        }
        if (!this.f20950o.m5532b()) {
            ByteBuffer byteBuffer2 = this.f20919H;
            if (byteBuffer2 != null) {
                m8879h(byteBuffer2);
                m8880i(j2);
                return;
            }
            return;
        }
        while (!this.f20950o.m5533c()) {
            do {
                zzck zzckVar = this.f20950o;
                if (zzckVar.m5532b()) {
                    ByteBuffer byteBuffer3 = zzckVar.f10312c[zzckVar.m5535e()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        zzckVar.m5534d(zzcp.f10655a);
                        byteBuffer = zzckVar.f10312c[zzckVar.m5535e()];
                    }
                } else {
                    byteBuffer = zzcp.f10655a;
                }
                if (byteBuffer.hasRemaining()) {
                    m8879h(byteBuffer);
                    m8880i(j2);
                } else {
                    ByteBuffer byteBuffer4 = this.f20919H;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    zzck zzckVar2 = this.f20950o;
                    ByteBuffer byteBuffer5 = this.f20919H;
                    if (zzckVar2.m5532b() && !zzckVar2.f10313d) {
                        zzckVar2.m5534d(byteBuffer5);
                    }
                }
            } while (this.f20921J == null);
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0045 A[RETURN] */
    /* JADX INFO: renamed from: g */
    public final boolean m8878g() throws zzsf {
        ByteBuffer byteBuffer;
        if (!this.f20950o.m5532b()) {
            m8880i(Long.MIN_VALUE);
            if (this.f20921J == null) {
                return true;
            }
            return false;
        }
        zzck zzckVar = this.f20950o;
        if (zzckVar.m5532b() && !zzckVar.f10313d) {
            zzckVar.f10313d = true;
            ((zzcp) zzckVar.f10311b.get(0)).mo5714a();
        }
        m8877f(Long.MIN_VALUE);
        if (!this.f20950o.m5533c() || ((byteBuffer = this.f20921J) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0297 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0299  */
    /* JADX WARN: Code duplicated, block: B:102:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:104:0x02af  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:116:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9 A[PHI: r3
  0x00b9: PHI (r3v98 double) = (r3v93 double), (r3v106 double) binds: [B:46:0x00f7, B:34:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf A[PHI: r3
  0x00bf: PHI (r3v94 double) = (r3v93 double), (r3v106 double) binds: [B:46:0x00f7, B:34:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0 A[PHI: r3 r23
  0x00e0: PHI (r3v68 float) = (r3v63 float), (r3v105 float) binds: [B:57:0x019e, B:41:0x00de] A[DONT_GENERATE, DONT_INLINE]
  0x00e0: PHI (r23v7 long) = (r23v4 long), (r23v15 long) binds: [B:57:0x019e, B:41:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6 A[PHI: r3 r23
  0x00e6: PHI (r3v64 float) = (r3v63 float), (r3v105 float) binds: [B:57:0x019e, B:41:0x00de] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r23v5 long) = (r23v4 long), (r23v15 long) binds: [B:57:0x019e, B:41:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01da  */
    /* JADX WARN: Code duplicated, block: B:74:0x01de  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x020b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x020d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0212  */
    /* JADX WARN: Code duplicated, block: B:92:0x0222 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0224  */
    /* JADX WARN: Code duplicated, block: B:94:0x022d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0235  */
    /* JADX WARN: Code duplicated, block: B:96:0x024d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0260  */
    /* JADX WARN: Code duplicated, block: B:98:0x026d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0284  */
    /* JADX INFO: renamed from: h */
    public final void m8879h(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        double d;
        float fMax;
        float f3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        double dMax;
        double d2;
        zzgtr.m7133f(this.f20921J == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f20949n.m8870b()) {
                int iM6521w = (int) zzfm.m6521w(zzfm.m6519u(20L), this.f20949n.f20895e.f20697b, 1000000L, RoundingMode.UP);
                long jM8884m = m8884m();
                long j2 = iM6521w;
                if (jM8884m < j2) {
                    zzto zztoVar = this.f20949n;
                    int i13 = zztoVar.f20895e.f20696a;
                    int i14 = zztoVar.f20894d;
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i15 = (int) jM8884m;
                    while (byteBuffer.hasRemaining() && i15 < iM6521w) {
                        if (i13 != 2) {
                            if (i13 == 3) {
                                j2 = j2;
                                i4 = (byteBuffer.get() & 255) << 24;
                            } else if (i13 != 4) {
                                if (i13 != 21) {
                                    if (i13 == 22) {
                                        i9 = byteBuffer.get() & 255;
                                        i10 = (byteBuffer.get() & 255) << 8;
                                        i11 = (byteBuffer.get() & 255) << 16;
                                        i12 = (byteBuffer.get() & 255) << 24;
                                    } else if (i13 == 268435456) {
                                        i2 = (byteBuffer.get() & 255) << 24;
                                        i3 = (byteBuffer.get() & 255) << 16;
                                    } else if (i13 == 1342177280) {
                                        i6 = (byteBuffer.get() & 255) << 24;
                                        i7 = (byteBuffer.get() & 255) << 16;
                                        i8 = (byteBuffer.get() & 255) << 8;
                                    } else if (i13 != 1610612736) {
                                        j2 = j2;
                                        if (i13 == 1879048192) {
                                            dMax = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                            if (dMax < 0.0d) {
                                                d2 = (-dMax) * (-2.147483648E9d);
                                            } else {
                                                d2 = dMax * 2.147483647E9d;
                                            }
                                        } else if (i13 == 1895825408) {
                                            fMax = Math.max(-1.0f, Math.min(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), 1.0f));
                                            if (fMax < 0.0f) {
                                                f3 = (-fMax) * (-2.1474836E9f);
                                            } else {
                                                f3 = fMax * 2.1474836E9f;
                                            }
                                            i4 = (int) f3;
                                        } else {
                                            if (i13 != 1912602624) {
                                                throw new IllegalStateException();
                                            }
                                            dMax = Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), 1.0d));
                                            if (dMax < 0.0d) {
                                                d2 = (-dMax) * (-2.147483648E9d);
                                            } else {
                                                d2 = dMax * 2.147483647E9d;
                                            }
                                        }
                                        i4 = (int) d2;
                                    } else {
                                        i9 = (byteBuffer.get() & 255) << 24;
                                        i10 = (byteBuffer.get() & 255) << 16;
                                        i11 = (byteBuffer.get() & 255) << 8;
                                        i12 = byteBuffer.get() & 255;
                                    }
                                    i4 = i9 | i10 | i11 | i12;
                                } else {
                                    i6 = (byteBuffer.get() & 255) << 8;
                                    i7 = (byteBuffer.get() & 255) << 16;
                                    i8 = (byteBuffer.get() & 255) << 24;
                                }
                                i4 = i6 | i7 | i8;
                            } else {
                                j2 = j2;
                                fMax = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                if (fMax < 0.0f) {
                                    f3 = (-fMax) * (-2.1474836E9f);
                                } else {
                                    f3 = fMax * 2.1474836E9f;
                                }
                                i4 = (int) f3;
                            }
                            i5 = (int) ((((long) i4) * ((long) i15)) / j2);
                            if (i13 != 2) {
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 24));
                            } else if (i13 != 3) {
                                byteBufferOrder.put((byte) (i5 >> 24));
                            } else if (i13 != 4) {
                                if (i13 != 21) {
                                    byteBufferOrder.put((byte) (i5 >> 8));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                } else if (i13 != 22) {
                                    byteBufferOrder.put((byte) i5);
                                    byteBufferOrder.put((byte) (i5 >> 8));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                } else if (i13 != 268435456) {
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                } else if (i13 != 1342177280) {
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                    byteBufferOrder.put((byte) (i5 >> 8));
                                } else if (i13 != 1610612736) {
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                    byteBufferOrder.put((byte) (i5 >> 8));
                                    byteBufferOrder.put((byte) i5);
                                } else if (i13 != 1879048192) {
                                    if (i13 != 1895825408) {
                                        if (i5 < 0) {
                                            f2 = (-i5) / (-2.1474836E9f);
                                        } else {
                                            f2 = i5 / 2.1474836E9f;
                                        }
                                        byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f2)));
                                    } else {
                                        if (i13 == 1912602624) {
                                            throw new IllegalStateException();
                                        }
                                        if (i5 < 0) {
                                            d = (-i5) / (-2.147483648E9d);
                                        } else {
                                            d = ((double) i5) / 2.147483647E9d;
                                        }
                                        byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d)));
                                    }
                                } else if (i5 < 0) {
                                    byteBufferOrder.putDouble((-i5) / (-2.147483648E9d));
                                } else {
                                    byteBufferOrder.putDouble(((double) i5) / 2.147483647E9d);
                                }
                            } else if (i5 < 0) {
                                byteBufferOrder.putFloat((-i5) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i5 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i14) {
                                i15++;
                                iPosition = byteBuffer.position();
                            }
                            j2 = j2;
                        } else {
                            i2 = (byteBuffer.get() & 255) << 16;
                            i3 = (byteBuffer.get() & 255) << 24;
                        }
                        i4 = i2 | i3;
                        i5 = (int) ((((long) i4) * ((long) i15)) / j2);
                        if (i13 != 2) {
                            byteBufferOrder.put((byte) (i5 >> 16));
                            byteBufferOrder.put((byte) (i5 >> 24));
                        } else if (i13 != 3) {
                            byteBufferOrder.put((byte) (i5 >> 24));
                        } else if (i13 != 4) {
                            if (i13 != 21) {
                                byteBufferOrder.put((byte) (i5 >> 8));
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 24));
                            } else if (i13 != 22) {
                                byteBufferOrder.put((byte) i5);
                                byteBufferOrder.put((byte) (i5 >> 8));
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 24));
                            } else if (i13 != 268435456) {
                                byteBufferOrder.put((byte) (i5 >> 24));
                                byteBufferOrder.put((byte) (i5 >> 16));
                            } else if (i13 != 1342177280) {
                                byteBufferOrder.put((byte) (i5 >> 24));
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 8));
                            } else if (i13 != 1610612736) {
                                byteBufferOrder.put((byte) (i5 >> 24));
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 8));
                                byteBufferOrder.put((byte) i5);
                            } else if (i13 != 1879048192) {
                                if (i13 != 1895825408) {
                                    if (i5 < 0) {
                                        f2 = (-i5) / (-2.1474836E9f);
                                    } else {
                                        f2 = i5 / 2.1474836E9f;
                                    }
                                    byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f2)));
                                } else {
                                    if (i13 == 1912602624) {
                                        throw new IllegalStateException();
                                    }
                                    if (i5 < 0) {
                                        d = (-i5) / (-2.147483648E9d);
                                    } else {
                                        d = ((double) i5) / 2.147483647E9d;
                                    }
                                    byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d)));
                                }
                            } else if (i5 < 0) {
                                byteBufferOrder.putDouble((-i5) / (-2.147483648E9d));
                            } else {
                                byteBufferOrder.putDouble(((double) i5) / 2.147483647E9d);
                            }
                        } else if (i5 < 0) {
                            byteBufferOrder.putFloat((-i5) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i5 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i14) {
                            i15++;
                            iPosition = byteBuffer.position();
                        }
                        j2 = j2;
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.f20921J = byteBuffer2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8880i(long j2) throws zzsf {
        if (this.f20921J == null) {
            return;
        }
        zztt zzttVar = this.f20945j;
        if (zzttVar.f20908a != null && (f20911Y.get() > 0 || SystemClock.elapsedRealtime() < zzttVar.f20910c)) {
            return;
        }
        int iRemaining = this.f20921J.remaining();
        boolean z = false;
        try {
            boolean zM8854a = this.f20953r.m8854a(this.f20920I, this.f20921J);
            this.f20931T = SystemClock.elapsedRealtime();
            zzttVar.f20908a = null;
            zzttVar.f20909b = -9223372036854775807L;
            zzttVar.f20910c = -9223372036854775807L;
            this.f20953r.m8855b();
            if (this.f20949n.m8870b()) {
                this.f20961z += (long) (iRemaining - this.f20921J.remaining());
            }
            if (zM8854a) {
                if (!this.f20949n.m8870b()) {
                    zzgtr.m7133f(this.f20921J == this.f20919H);
                    this.f20912A = (((long) this.f20913B) * ((long) this.f20920I)) + this.f20912A;
                }
                this.f20921J = null;
            }
        } catch (zzqw e) {
            boolean z2 = e.f20666t;
            if (z2) {
                if (m8884m() > 0) {
                    z = true;
                } else if (this.f20953r.m8855b()) {
                    this.f20949n.getClass();
                    z = true;
                }
            }
            zzsf zzsfVar = new zzsf(e.f20665s, this.f20949n.f20891a, z);
            zzsd zzsdVar = this.f20947l;
            if (zzsdVar != null) {
                ((zztz) zzsdVar).m8893a(zzsfVar);
            }
            if (z2) {
                throw zzsfVar;
            }
            zzttVar.m8871a(zzsfVar);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8881j() {
        if (this.f20949n != null) {
            zzto zztoVar = this.f20948m;
            if (zztoVar != null) {
                this.f20949n = zztoVar;
                this.f20948m = null;
            }
            try {
                this.f20949n = this.f20949n.m8869a(this.f20951p.m8861b(m8885n(this.f20949n.f20892b)));
            } catch (zzqy e) {
                throw new IllegalStateException(new zzsb(e, this.f20949n.f20891a));
            }
        }
        m8873a();
    }

    /* JADX INFO: renamed from: k */
    public final void m8882k(long j2) {
        zzav zzavVar;
        boolean zM8870b = this.f20949n.m8870b();
        boolean z = false;
        zztp zztpVar = this.f20935X;
        if (zM8870b) {
            int i2 = this.f20949n.f20891a.f21040J;
            zzavVar = this.f20957v;
            zzcv zzcvVar = zztpVar.f20901c;
            float f2 = zzavVar.f6970a;
            zzcvVar.getClass();
            zzgtr.m7128a(f2 > 0.0f);
            if (zzcvVar.f11541c != f2) {
                zzcvVar.f11541c = f2;
                zzcvVar.f11547i = true;
            }
            float f3 = zzavVar.f6971b;
            zzgtr.m7128a(f3 > 0.0f);
            if (zzcvVar.f11542d != f3) {
                zzcvVar.f11542d = f3;
                zzcvVar.f11547i = true;
            }
        } else {
            zzavVar = zzav.f6969d;
        }
        zzav zzavVar2 = zzavVar;
        this.f20957v = zzavVar2;
        if (this.f20949n.m8870b()) {
            int i3 = this.f20949n.f20891a.f21040J;
            z = this.f20958w;
            zztpVar.f20900b.f20987j = z;
        }
        this.f20958w = z;
        this.f20942g.add(new zzts(zzavVar2, Math.max(0L, j2), zzfm.m6520v(this.f20949n.f20895e.f20697b, m8884m())));
        m8875d(j2);
        zzsd zzsdVar = this.f20947l;
        if (zzsdVar != null) {
            final boolean z2 = this.f20958w;
            final zzrw zzrwVar = ((zztz) zzsdVar).f20963a.f20966Y0;
            Handler handler = zzrwVar.f20723a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzrw zzrwVar2 = zzrwVar;
                        zzrwVar2.getClass();
                        String str = zzfm.f16091a;
                        zzlj zzljVar = ((zzkf) zzrwVar2.f20724b).f20189s;
                        boolean z3 = zzljVar.f20238T;
                        boolean z4 = z2;
                        if (z3 == z4) {
                            return;
                        }
                        zzljVar.f20238T = z4;
                        zzeg zzegVar = zzljVar.f20259m;
                        zzegVar.m6197c(23, new zzka());
                        zzegVar.m6198d();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m8883l() {
        return this.f20953r != null;
    }

    /* JADX INFO: renamed from: m */
    public final long m8884m() {
        if (!this.f20949n.m8870b()) {
            return this.f20912A;
        }
        long j2 = this.f20961z;
        long j3 = this.f20949n.f20894d;
        String str = zzfm.f16091a;
        return ((j2 + j3) - 1) / j3;
    }

    /* JADX INFO: renamed from: n */
    public final zzra m8885n(zzv zzvVar) {
        zzqz zzqzVar = new zzqz(zzvVar);
        zzqzVar.f20668b = this.f20954s;
        zzqzVar.f20669c = this.f20929R;
        zzqzVar.f20670d = this.f20926O;
        zzqzVar.f20672f = -1;
        zzqzVar.f20671e = this.f20930S;
        return new zzra(zzqzVar);
    }

    /* JADX INFO: renamed from: o */
    public final int m8886o(zzv zzvVar) {
        boolean z;
        int i2 = zzvVar.f21040J;
        if (!zzfm.m6502d(i2) || i2 == 2) {
            z = false;
        } else {
            zzt zztVar = new zzt(zzvVar);
            zztVar.f20783I = 2;
            zzvVar = new zzv(zztVar);
            z = true;
        }
        int i3 = this.f20951p.m8860a(m8885n(zzvVar)).f20688d;
        if (i3 != 1) {
            if (i3 != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: p */
    public final void m8887p(zzrz zzrzVar) throws zzsb {
        zzck zzckVar;
        int iM6504f;
        int iM6504f2;
        zzv zzvVar;
        zzre zzreVar = this.f20952q;
        zztg zztgVar = this.f20951p;
        if (zzreVar == null && this.f20936a != null) {
            zzre zzreVar2 = new zzre() { // from class: com.google.android.gms.internal.ads.zztq
                @Override // com.google.android.gms.internal.ads.zzre
                public final void zza() {
                    zznd zzndVar;
                    zzsd zzsdVar = this.f20902a.f20947l;
                    if (zzsdVar != null) {
                        zzua zzuaVar = ((zztz) zzsdVar).f20963a;
                        synchronized (zzuaVar.f20065s) {
                            zzndVar = zzuaVar.f20064K;
                        }
                        if (zzndVar != null) {
                            zzndVar.zza();
                        }
                    }
                }
            };
            this.f20952q = zzreVar2;
            zztgVar.m8864e();
            if (zztgVar.f20844c == null) {
                zztgVar.f20844c = new zzeg(Thread.currentThread());
            }
            zztgVar.f20844c.m6195a(zzreVar2);
        }
        zzv zzvVar2 = zzrzVar.f20729a;
        String str = zzvVar2.f21061o;
        int i2 = zzvVar2.f21037G;
        if ("audio/raw".equals(str)) {
            int i3 = zzvVar2.f21040J;
            zzgtr.m7128a(zzfm.m6502d(i3));
            iM6504f = zzfm.m6504f(i3) * i2;
            zzgwq zzgwqVar = new zzgwq();
            zzgwqVar.m7204d(this.f20941f);
            zzgwqVar.m7203c(this.f20939d);
            zzcp[] zzcpVarArr = this.f20935X.f20899a;
            zzgym.m7263a(2, zzcpVarArr);
            zzgwqVar.m7205e(2);
            System.arraycopy(zzcpVarArr, 0, zzgwqVar.f18295a, zzgwqVar.f18296b, 2);
            zzgwqVar.f18296b += 2;
            zzckVar = new zzck(zzgwqVar.m7214f());
            if (zzckVar.equals(this.f20950o)) {
                zzckVar = this.f20950o;
            }
            int i4 = zzvVar2.f21041K;
            int i5 = zzvVar2.f21042L;
            zzug zzugVar = this.f20938c;
            zzugVar.f20997i = i4;
            zzugVar.f20998j = i5;
            this.f20937b.f20877i = zzrzVar.f20730b;
            try {
                zzcl zzclVarM5531a = zzckVar.m5531a(new zzcl(zzvVar2.f21039I, i2, i3));
                zzt zztVar = new zzt(zzvVar2);
                int i6 = zzclVarM5531a.f10389c;
                zztVar.f20783I = i6;
                zztVar.f20782H = zzclVarM5531a.f10387a;
                int i7 = zzclVarM5531a.f10388b;
                zztVar.f20780F = i7;
                zztVar.f20781G = i7 == i2 ? zzvVar2.f21038H : -1;
                zzvVar = new zzv(zztVar);
                iM6504f2 = zzfm.m6504f(i6) * i7;
            } catch (zzco e) {
                throw new zzsb(e, zzvVar2);
            }
        } else {
            zzgzi zzgziVar = zzgwt.f18303t;
            zzckVar = new zzck(zzgyo.f18355w);
            iM6504f = -1;
            iM6504f2 = -1;
            zzvVar = zzvVar2;
        }
        zzck zzckVar2 = zzckVar;
        zzra zzraVarM8885n = m8885n(zzvVar);
        zzv zzvVar3 = zzraVarM8885n.f20675a;
        try {
            zzrg zzrgVarM8861b = zztgVar.m8861b(zzraVarM8885n);
            if (zzrgVarM8861b.f20696a == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(false).length() + 36);
                sb.append("Invalid output encoding (isOffload=false)");
                throw new zzsb(zzvVar3, sb.toString());
            }
            if (zzrgVarM8861b.f20698c == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 42);
                sb2.append("Invalid output channel config (isOffload=false)");
                throw new zzsb(zzvVar3, sb2.toString());
            }
            zzbf zzbfVar = zzrzVar.f20731c;
            zzxl zzxlVar = zzrzVar.f20732d;
            zzto zztoVar = new zzto(zzvVar2, zzvVar, iM6504f, iM6504f2, zzrgVarM8861b, zzckVar2, zzbfVar, zzxlVar != null ? zzxlVar.f21278a : null);
            if (m8883l()) {
                this.f20948m = zztoVar;
            } else {
                this.f20949n = zztoVar;
            }
        } catch (zzqy e2) {
            throw new zzsb(e2, zzvVar2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m8888q() {
        this.f20925N = true;
        if (m8883l()) {
            zztb zztbVar = this.f20953r;
            zzti zztiVar = zztbVar.f20825e;
            if (zztiVar.f20871u != -9223372036854775807L) {
                zztiVar.f20871u = zzfm.m6519u(zztiVar.f20852b.zzb());
            }
            zztiVar.f20860j = zzfm.m6520v(zztiVar.f20855e, zztiVar.m8867c());
            zztiVar.f20858h.m8848a(0);
            if (!zztbVar.f20830j || zztbVar.m8855b()) {
                zztbVar.f20821a.play();
            }
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    /* JADX INFO: renamed from: r */
    public final boolean m8889r(java.nio.ByteBuffer r21, long r22, int r24) {
        /*
            Method dump skipped, instruction units count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztu.m8889r(java.nio.ByteBuffer, long, int):boolean");
    }

    /* JADX INFO: renamed from: s */
    public final void m8890s() {
        if (!this.f20922K && m8883l() && m8878g()) {
            if (!this.f20923L) {
                this.f20923L = true;
                if (this.f20953r.m8855b()) {
                    this.f20924M = false;
                }
                zztb zztbVar = this.f20953r;
                if (!zztbVar.f20830j) {
                    zztbVar.f20830j = true;
                    zzti zztiVar = zztbVar.f20825e;
                    long jM8859f = zztbVar.m8859f();
                    zztiVar.f20873w = zztiVar.m8867c();
                    zztiVar.f20871u = zzfm.m6519u(zztiVar.f20852b.zzb());
                    zztiVar.f20874x = jM8859f;
                    zztbVar.f20821a.stop();
                }
            }
            this.f20922K = true;
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m8891t() {
        if (!m8883l()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.f20953r.m8855b() && this.f20924M) {
            return false;
        }
        long jM8884m = m8884m();
        long jM8857d = this.f20953r.m8857d();
        zztb zztbVar = this.f20953r;
        zztbVar.getClass();
        return jM8884m > zzfm.m6521w(jM8857d, (long) zztbVar.f20821a.getSampleRate(), 1000000L, RoundingMode.UP);
    }
}
