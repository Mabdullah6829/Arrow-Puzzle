package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zztb implements zzqx {

    /* JADX INFO: renamed from: o */
    public static final Object f20818o = new Object();

    /* JADX INFO: renamed from: p */
    public static ScheduledExecutorService f20819p;

    /* JADX INFO: renamed from: q */
    public static int f20820q;

    /* JADX INFO: renamed from: a */
    public final AudioTrack f20821a;

    /* JADX INFO: renamed from: b */
    public final zzrg f20822b;

    /* JADX INFO: renamed from: c */
    public final zzso f20823c;

    /* JADX INFO: renamed from: d */
    public zzss f20824d;

    /* JADX INFO: renamed from: e */
    public final zzti f20825e;

    /* JADX INFO: renamed from: f */
    public final boolean f20826f;

    /* JADX INFO: renamed from: g */
    public final int f20827g;

    /* JADX INFO: renamed from: h */
    public final zzta f20828h;

    /* JADX INFO: renamed from: i */
    public final zzeg f20829i = new zzeg(Thread.currentThread());

    /* JADX INFO: renamed from: j */
    public boolean f20830j;

    /* JADX INFO: renamed from: k */
    public long f20831k;

    /* JADX INFO: renamed from: l */
    public long f20832l;

    /* JADX INFO: renamed from: m */
    public int f20833m;

    /* JADX INFO: renamed from: n */
    public int f20834n;

    public zztb(AudioTrack audioTrack, zzrg zzrgVar, zzso zzsoVar, zzdp zzdpVar) {
        this.f20821a = audioTrack;
        this.f20822b = zzrgVar;
        this.f20823c = zzsoVar;
        boolean zM6502d = zzfm.m6502d(zzrgVar.f20696a);
        this.f20826f = zM6502d;
        if (zM6502d) {
            this.f20827g = zzfm.m6504f(zzrgVar.f20696a) * Integer.bitCount(zzrgVar.f20698c);
        } else {
            this.f20827g = -1;
        }
        this.f20825e = new zzti(new zzsu(this), zzdpVar, audioTrack, zzrgVar.f20696a, this.f20827g, zzrgVar.f20699d);
        if (zzsoVar != null) {
            this.f20824d = new zzss(audioTrack, zzsoVar);
        }
        this.f20828h = m8855b() ? new zzta(this) : null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8854a(int i2, ByteBuffer byteBuffer) throws zzqw {
        zzso zzsoVar;
        zztg zztgVar;
        zzqp zzqpVar;
        boolean z = this.f20826f;
        if (!z && this.f20833m == 0) {
            this.f20833m = zztu.m8872c(this.f20822b.f20696a, byteBuffer);
        }
        zzeg zzegVar = this.f20829i;
        zzegVar.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = zzegVar.f13832a;
        AudioTrack audioTrack = this.f20821a;
        if (threadCurrentThread == thread) {
            m8859f();
            int underrunCount = audioTrack.getUnderrunCount();
            int i3 = this.f20834n;
            this.f20834n = underrunCount;
            if (underrunCount > i3) {
                zzegVar.m6197c(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzsk
                    @Override // com.google.android.gms.internal.ads.zzeb
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6141b(Object obj) {
                        ((zzqv) obj).mo8843d();
                    }
                });
                zzegVar.m6198d();
            }
        }
        int iRemaining = byteBuffer.remaining();
        boolean z2 = true;
        int iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        if (iWrite >= 0) {
            z2 = iWrite == iRemaining;
            if (z) {
                this.f20831k += (long) iWrite;
                return z2;
            }
            if (z2) {
                this.f20832l = (((long) this.f20833m) * ((long) i2)) + this.f20832l;
            }
            return z2;
        }
        if (iWrite != -6 && iWrite != -32) {
            z2 = false;
        }
        if (z2 && (zzsoVar = this.f20823c) != null && (zzqpVar = (zztgVar = ((zztf) zzsoVar).f20841a).f20847f) != null) {
            zzqj zzqjVar = zzqj.f20632f;
            zztgVar.f20846e = zzqjVar;
            zzqpVar.m8838b(zzqjVar);
        }
        throw new zzqw(iWrite, z2);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8855b() {
        return Build.VERSION.SDK_INT >= 29 && this.f20821a.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: c */
    public final long m8856c() {
        return this.f20821a.getBufferSizeInFrames();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0328  */
    /* JADX WARN: Code duplicated, block: B:102:0x0333  */
    /* JADX WARN: Code duplicated, block: B:104:0x033b  */
    /* JADX WARN: Code duplicated, block: B:73:0x029f  */
    /* JADX WARN: Code duplicated, block: B:75:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:77:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:82:0x02b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:84:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:86:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:91:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:92:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:94:0x0302  */
    /* JADX WARN: Code duplicated, block: B:95:0x0308  */
    /* JADX WARN: Code duplicated, block: B:96:0x0314  */
    /* JADX WARN: Code duplicated, block: B:97:0x0319  */
    /* JADX WARN: Code duplicated, block: B:99:0x031e  */
    /* JADX INFO: renamed from: d */
    public final long m8857d() {
        AudioTrack audioTrack;
        int i2;
        long j2;
        zzti zztiVar;
        float f2;
        long jM8866b;
        int i3;
        int i4;
        int i5;
        long j3;
        long j4;
        int i6;
        int i7;
        int i8;
        AudioTimestamp audioTimestamp;
        long j5;
        AudioTimestamp audioTimestamp2;
        long j6;
        long j7;
        int i9;
        float f3;
        Method method;
        Method method2;
        zzti zztiVar2 = this.f20825e;
        zzsi zzsiVar = zztiVar2.f20858h;
        zzdp zzdpVar = zztiVar2.f20852b;
        float f4 = zztiVar2.f20859i;
        AudioTrack audioTrack2 = zztiVar2.f20854d;
        if (audioTrack2.getPlayState() == 3) {
            j2 = 1000;
            long jZzc = zzdpVar.zzc() / 1000;
            if (jZzc - zztiVar2.f20862l >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                long jM6520v = zzfm.m6520v(zztiVar2.f20855e, zztiVar2.m8867c());
                if (jM6520v != 0) {
                    long[] jArr = zztiVar2.f20853c;
                    i4 = 2;
                    int i10 = zztiVar2.f20869s;
                    if (f4 == 1.0f) {
                        i5 = 1;
                    } else {
                        i5 = 1;
                        jM6520v = Math.round(jM6520v / ((double) f4));
                    }
                    jArr[i10] = jM6520v - jZzc;
                    zztiVar2.f20869s = (zztiVar2.f20869s + 1) % 10;
                    int i11 = zztiVar2.f20870t;
                    if (i11 < 10) {
                        zztiVar2.f20870t = i11 + 1;
                    }
                    zztiVar2.f20862l = jZzc;
                    zztiVar2.f20861k = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = zztiVar2.f20870t;
                        if (i12 >= i13) {
                            break;
                        }
                        zztiVar2.f20861k = (jArr[i12] / ((long) i13)) + zztiVar2.f20861k;
                        i12++;
                        jZzc = jZzc;
                    }
                } else {
                    zztiVar2 = zztiVar2;
                    zzdpVar = zzdpVar;
                    f4 = f4;
                    audioTrack = audioTrack2;
                }
                i2 = 0;
            } else {
                i4 = 2;
                i5 = 1;
            }
            long j8 = jZzc;
            long j9 = zztiVar2.f20864n;
            if (!zztiVar2.f20857g || (method = zztiVar2.f20863m) == null) {
                j3 = j8;
                j4 = 500000;
            } else {
                j4 = 500000;
                if (j8 - zztiVar2.f20865o >= 500000) {
                    try {
                        Integer num = (Integer) method.invoke(audioTrack2, null);
                        String str = zzfm.f16091a;
                        try {
                            long jIntValue = (((long) num.intValue()) * 1000) - zztiVar2.f20856f;
                            zztiVar2.f20864n = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            zztiVar2.f20864n = jMax;
                            if (jMax > 10000000) {
                                StringBuilder sb = new StringBuilder(String.valueOf(jMax).length() + 41);
                                sb.append("Ignoring impossibly large audio latency: ");
                                sb.append(jMax);
                                zzeh.m6211c("AudioTrackAudioOutput", sb.toString());
                                zztiVar2.f20864n = 0L;
                            }
                        } catch (Exception unused) {
                            method2 = null;
                            zztiVar2.f20863m = method2;
                        }
                    } catch (Exception unused2) {
                        method2 = null;
                    }
                    j3 = j8;
                    zztiVar2.f20865o = j3;
                } else {
                    j3 = j8;
                }
            }
            int i14 = j9 != zztiVar2.f20864n ? i5 : 0;
            float f5 = zztiVar2.f20859i;
            long jM8866b2 = zztiVar2.m8866b(j3);
            zzth zzthVar = zzsiVar.f20745c;
            int i15 = zzsiVar.f20744b;
            zzsh zzshVar = zzsiVar.f20743a;
            audioTrack = audioTrack2;
            if (i14 != 0 || j3 - zzsiVar.f20749g >= zzsiVar.f20748f) {
                zzsiVar.f20749g = j3;
                AudioTrack audioTrack3 = zzshVar.f20738a;
                AudioTimestamp audioTimestamp3 = zzshVar.f20739b;
                boolean timestamp = audioTrack3.getTimestamp(audioTimestamp3);
                if (timestamp) {
                    long j10 = audioTimestamp3.framePosition;
                    if (zzshVar.f20741d > j10) {
                        zzshVar.f20740c++;
                    }
                    zzshVar.f20741d = j10;
                    zzshVar.f20742e = j10 + (zzshVar.f20740c << 32);
                }
                if (timestamp) {
                    long j11 = audioTimestamp3.nanoTime / 1000;
                    long jM6523y = zzfm.m6523y(j3 - (audioTimestamp3.nanoTime / 1000), f5) + zzfm.m6520v(i15, zzshVar.f20742e);
                    if (Math.abs(j11 - j3) > 5000000) {
                        long j12 = zzshVar.f20742e;
                        long jM8859f = ((zzsu) zzthVar).f20769a.m8859f();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(j12).length() + 52 + String.valueOf(j11).length() + 2 + String.valueOf(j3).length() + 2 + String.valueOf(jM8866b2).length() + 2 + String.valueOf(jM8859f).length());
                        AbstractC1456a.m2456w(sb2, "Spurious audio timestamp (system clock mismatch): ", j12, ", ");
                        sb2.append(j11);
                        AbstractC1456a.m2456w(sb2, ", ", j3, ", ");
                        sb2.append(jM8866b2);
                        sb2.append(", ");
                        sb2.append(jM8859f);
                        zzeh.m6211c("AudioTrackAudioOutput", sb2.toString());
                        zzsiVar.m8848a(4);
                    } else {
                        timestamp = timestamp;
                        audioTimestamp3 = audioTimestamp3;
                        f5 = f5;
                        if (Math.abs(jM6523y - jM8866b2) > 5000000) {
                            long j13 = zzshVar.f20742e;
                            long jM8859f2 = ((zzsu) zzthVar).f20769a.m8859f();
                            i6 = i15;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j13).length() + 54 + String.valueOf(j11).length() + 2 + String.valueOf(j3).length() + 2 + String.valueOf(jM8866b2).length() + 2 + String.valueOf(jM8859f2).length());
                            AbstractC1456a.m2456w(sb3, "Spurious audio timestamp (frame position mismatch): ", j13, ", ");
                            sb3.append(j11);
                            AbstractC1456a.m2456w(sb3, ", ", j3, ", ");
                            sb3.append(jM8866b2);
                            sb3.append(", ");
                            sb3.append(jM8859f2);
                            zzeh.m6211c("AudioTrackAudioOutput", sb3.toString());
                            zzsiVar.m8848a(4);
                        } else {
                            i6 = i15;
                            if (zzsiVar.f20746d == 4) {
                                i7 = 0;
                                zzsiVar.m8848a(0);
                            }
                        }
                        i7 = 0;
                    }
                    i8 = zzsiVar.f20746d;
                    if (i8 != 0) {
                        i2 = i7;
                        audioTimestamp = audioTimestamp3;
                        if (timestamp) {
                            j5 = audioTimestamp.nanoTime / 1000;
                            if (j5 >= zzsiVar.f20747e) {
                                zzsiVar.f20750h = zzshVar.f20742e;
                                zzsiVar.f20751i = j5;
                                zzsiVar.m8848a(1);
                            }
                        } else if (j3 - zzsiVar.f20747e > j4) {
                            zzsiVar.m8848a(3);
                        }
                    } else if (i8 != i5) {
                        if (i8 != i4) {
                            if (i8 == 3 && timestamp) {
                                zzsiVar.m8848a(i7);
                            }
                        } else if (!timestamp) {
                            zzsiVar.m8848a(i7);
                        }
                        i2 = i7;
                    } else {
                        audioTimestamp2 = audioTimestamp3;
                        if (timestamp) {
                            j6 = zzshVar.f20742e;
                            j7 = zzsiVar.f20750h;
                            if (j6 <= j7) {
                                i9 = i6;
                                f3 = f5;
                                if (Math.abs((zzfm.m6523y(j3 - (audioTimestamp2.nanoTime / 1000), f3) + zzfm.m6520v(i9, zzshVar.f20742e)) - (zzfm.m6523y(j3 - zzsiVar.f20751i, f3) + zzfm.m6520v(i9, j7))) < 1000) {
                                    zzsiVar.m8848a(2);
                                } else if (j3 - zzsiVar.f20747e > 2000000) {
                                    zzsiVar.m8848a(3);
                                } else {
                                    zzsiVar.f20750h = zzshVar.f20742e;
                                    zzsiVar.f20751i = audioTimestamp2.nanoTime / 1000;
                                }
                            } else if (j3 - zzsiVar.f20747e > 2000000) {
                                zzsiVar.m8848a(3);
                            } else {
                                zzsiVar.f20750h = zzshVar.f20742e;
                                zzsiVar.f20751i = audioTimestamp2.nanoTime / 1000;
                            }
                        } else {
                            i2 = 0;
                            zzsiVar.m8848a(0);
                        }
                    }
                }
                i6 = i15;
                i7 = 0;
                i8 = zzsiVar.f20746d;
                if (i8 != 0) {
                    i2 = i7;
                    audioTimestamp = audioTimestamp3;
                    if (timestamp) {
                        j5 = audioTimestamp.nanoTime / 1000;
                        if (j5 >= zzsiVar.f20747e) {
                            zzsiVar.f20750h = zzshVar.f20742e;
                            zzsiVar.f20751i = j5;
                            zzsiVar.m8848a(1);
                        }
                    } else if (j3 - zzsiVar.f20747e > j4) {
                        zzsiVar.m8848a(3);
                    }
                } else if (i8 != i5) {
                    if (i8 != i4) {
                        if (i8 == 3) {
                            zzsiVar.m8848a(i7);
                        }
                    } else if (!timestamp) {
                        zzsiVar.m8848a(i7);
                    }
                    i2 = i7;
                } else {
                    audioTimestamp2 = audioTimestamp3;
                    if (timestamp) {
                        j6 = zzshVar.f20742e;
                        j7 = zzsiVar.f20750h;
                        if (j6 <= j7) {
                            i9 = i6;
                            f3 = f5;
                            if (Math.abs((zzfm.m6523y(j3 - (audioTimestamp2.nanoTime / 1000), f3) + zzfm.m6520v(i9, zzshVar.f20742e)) - (zzfm.m6523y(j3 - zzsiVar.f20751i, f3) + zzfm.m6520v(i9, j7))) < 1000) {
                                zzsiVar.m8848a(2);
                            } else if (j3 - zzsiVar.f20747e > 2000000) {
                                zzsiVar.m8848a(3);
                            } else {
                                zzsiVar.f20750h = zzshVar.f20742e;
                                zzsiVar.f20751i = audioTimestamp2.nanoTime / 1000;
                            }
                        } else if (j3 - zzsiVar.f20747e > 2000000) {
                            zzsiVar.m8848a(3);
                        } else {
                            zzsiVar.f20750h = zzshVar.f20742e;
                            zzsiVar.f20751i = audioTimestamp2.nanoTime / 1000;
                        }
                    } else {
                        i2 = 0;
                        zzsiVar.m8848a(0);
                    }
                }
            } else {
                zztiVar2 = zztiVar2;
                zzdpVar = zzdpVar;
                f4 = f4;
            }
            i2 = 0;
        } else {
            zztiVar2 = zztiVar2;
            zzdpVar = zzdpVar;
            f4 = f4;
            audioTrack = audioTrack2;
            i2 = 0;
            j2 = 1000;
        }
        long jZzc2 = zzdpVar.zzc() / j2;
        int i16 = zzsiVar.f20746d == 2 ? 1 : i2;
        if (i16 != 0) {
            zzsh zzshVar2 = zzsiVar.f20743a;
            f2 = f4;
            jM8866b = zzfm.m6523y(jZzc2 - (zzshVar2.f20739b.nanoTime / j2), f2) + zzfm.m6520v(zzsiVar.f20744b, zzshVar2.f20742e);
            zztiVar = zztiVar2;
        } else {
            zztiVar = zztiVar2;
            f2 = f4;
            jM8866b = zztiVar.m8866b(jZzc2);
        }
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (i16 != 0 || ((i3 = zzsiVar.f20746d) != 0 && i3 != 1)) {
                zztiVar.m8865a(jM8866b);
            }
            long j14 = zztiVar.f20876z;
            if (j14 != -9223372036854775807L) {
                long j15 = jM8866b - zztiVar.f20875y;
                long jM6523y2 = zzfm.m6523y(jZzc2 - j14, f2);
                long j16 = zztiVar.f20875y + jM6523y2;
                long jAbs = Math.abs(j16 - jM8866b);
                if (j15 != 0 && jAbs < 1000000) {
                    long j17 = (jM6523y2 * 10) / 100;
                    jM8866b = Math.max(j16 - j17, Math.min(jM8866b, j16 + j17));
                }
            }
            zztiVar.f20876z = jZzc2;
            zztiVar.f20875y = jM8866b;
        } else if (playState == 1) {
            zztiVar.m8865a(jM8866b);
        }
        return jM8866b;
    }

    /* JADX INFO: renamed from: e */
    public final void m8858e(AudioDeviceInfo audioDeviceInfo) {
        this.f20821a.setPreferredDevice(audioDeviceInfo);
    }

    /* JADX INFO: renamed from: f */
    public final long m8859f() {
        if (!this.f20826f) {
            return this.f20832l;
        }
        long j2 = this.f20831k;
        String str = zzfm.f16091a;
        long j3 = this.f20827g;
        return ((j2 + j3) - 1) / j3;
    }
}
