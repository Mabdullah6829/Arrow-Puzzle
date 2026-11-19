package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzux implements zzvm {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f21018a;

    /* JADX INFO: renamed from: b */
    public final zzvc f21019b;

    /* JADX INFO: renamed from: c */
    public final zzvn f21020c;

    /* JADX INFO: renamed from: d */
    public final zzvi f21021d;

    /* JADX INFO: renamed from: e */
    public boolean f21022e;

    /* JADX INFO: renamed from: f */
    public int f21023f = 0;

    public /* synthetic */ zzux(MediaCodec mediaCodec, HandlerThread handlerThread, zzvn zzvnVar, zzvi zzviVar) {
        this.f21018a = mediaCodec;
        this.f21019b = new zzvc(handlerThread);
        this.f21020c = zzvnVar;
        this.f21021d = zzviVar;
    }

    /* JADX INFO: renamed from: p */
    public static String m8908p(int i2, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i2 == 1) {
            sb.append("Audio");
        } else if (i2 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i2);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: A */
    public final void mo8909A(int i2) {
        this.f21018a.releaseOutputBuffer(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: R */
    public final ByteBuffer mo8910R(int i2) {
        return this.f21018a.getOutputBuffer(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: a */
    public final int mo8911a() {
        this.f21020c.mo8932c();
        zzvc zzvcVar = this.f21019b;
        synchronized (zzvcVar.f21082a) {
            try {
                zzvcVar.m8937b();
                int i2 = -1;
                if (zzvcVar.f21093l > 0 || zzvcVar.f21094m) {
                    return -1;
                }
                zzdo zzdoVar = zzvcVar.f21085d;
                int i3 = zzdoVar.f12407b;
                int i4 = zzdoVar.f12408c;
                if (!(i3 == i4)) {
                    if (i3 == i4) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i2 = zzdoVar.f12406a[i3];
                    zzdoVar.f12407b = (i3 + 1) & zzdoVar.f12409d;
                }
                return i2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: b */
    public final void mo8912b(ArrayList arrayList) {
        this.f21018a.subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: c */
    public final MediaFormat mo8913c() {
        MediaFormat mediaFormat;
        zzvc zzvcVar = this.f21019b;
        synchronized (zzvcVar.f21082a) {
            try {
                mediaFormat = zzvcVar.f21089h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: d */
    public final void mo8914d(Bundle bundle) {
        this.f21020c.mo8933d(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: e */
    public final void mo8915e(final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.google.android.gms.internal.ads.zzut
            @Override // java.lang.Runnable
            public final void run() {
                zzux zzuxVar = this.f21012s;
                Runnable runnable3 = runnable;
                zzuxVar.f21020c.mo8932c();
                zzvc zzvcVar = zzuxVar.f21019b;
                synchronized (zzvcVar.f21082a) {
                    zzvcVar.m8937b();
                    ((zzvt) runnable3).run();
                }
            }
        };
        zzvc zzvcVar = this.f21019b;
        synchronized (zzvcVar.f21082a) {
            zzvcVar.m8937b();
            runnable2.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: f */
    public final void mo8916f(Surface surface) {
        this.f21018a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: g */
    public final void mo8917g(int i2, zziu zziuVar, long j2, int i3) {
        this.f21020c.mo8934e(i2, zziuVar, j2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: h */
    public final int mo8918h(MediaCodec.BufferInfo bufferInfo) {
        this.f21020c.mo8932c();
        zzvc zzvcVar = this.f21019b;
        synchronized (zzvcVar.f21082a) {
            try {
                zzvcVar.m8937b();
                if (zzvcVar.f21093l > 0 || zzvcVar.f21094m) {
                    return -1;
                }
                zzdo zzdoVar = zzvcVar.f21086e;
                int i2 = zzdoVar.f12407b;
                int i3 = zzdoVar.f12408c;
                if (i2 == i3) {
                    return -1;
                }
                if (i2 == i3) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i4 = zzdoVar.f12406a[i2];
                zzdoVar.f12407b = zzdoVar.f12409d & (i2 + 1);
                if (i4 >= 0) {
                    if (zzvcVar.f21089h == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) zzvcVar.f21087f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i4 == -2) {
                    zzvcVar.f21089h = (MediaFormat) zzvcVar.f21088g.remove();
                    i4 = -2;
                }
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: i */
    public final void mo8919i(int i2) {
        this.f21018a.setVideoScalingMode(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: j */
    public final void mo8920j() {
        this.f21018a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: k */
    public final boolean mo8921k(zzvl zzvlVar) {
        zzvc zzvcVar = this.f21019b;
        synchronized (zzvcVar.f21082a) {
            zzvcVar.f21096o = zzvlVar;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: l */
    public final ByteBuffer mo8922l(int i2) {
        return this.f21018a.getInputBuffer(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: m */
    public final void mo8923m(int i2, int i3, int i4, long j2) {
        this.f21020c.mo8935f(i2, i3, i4, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    /* JADX INFO: renamed from: n */
    public final void mo8924n(int i2, long j2) {
        this.f21018a.releaseOutputBuffer(i2, j2);
    }

    /* JADX INFO: renamed from: o */
    public final void m8925o(MediaFormat mediaFormat, Surface surface, int i2) {
        zzvi zzviVar;
        LoudnessCodecController loudnessCodecController;
        zzvc zzvcVar = this.f21019b;
        zzgtr.m7133f(zzvcVar.f21084c == null);
        HandlerThread handlerThread = zzvcVar.f21083b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.f21018a;
        mediaCodec.setCallback(zzvcVar, handler);
        zzvcVar.f21084c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i2);
        Trace.endSection();
        this.f21020c.zza();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zzviVar = this.f21021d) != null && ((loudnessCodecController = zzviVar.f21104b) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            zzgtr.m7133f(zzviVar.f21103a.add(mediaCodec));
        }
        this.f21023f = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk() {
        this.f21020c.mo8930a();
        MediaCodec mediaCodec = this.f21018a;
        mediaCodec.flush();
        final zzvc zzvcVar = this.f21019b;
        synchronized (zzvcVar.f21082a) {
            zzvcVar.f21093l++;
            Handler handler = zzvcVar.f21084c;
            String str = zzfm.f16091a;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzvc zzvcVar2 = zzvcVar;
                    Object obj = zzvcVar2.f21082a;
                    synchronized (obj) {
                        try {
                            if (zzvcVar2.f21094m) {
                                return;
                            }
                            long j2 = zzvcVar2.f21093l - 1;
                            zzvcVar2.f21093l = j2;
                            if (j2 > 0) {
                                return;
                            }
                            if (j2 >= 0) {
                                zzvcVar2.m8936a();
                                return;
                            }
                            IllegalStateException illegalStateException = new IllegalStateException();
                            synchronized (obj) {
                                zzvcVar2.f21095n = illegalStateException;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzl() {
        zzvi zzviVar;
        zzvi zzviVar2;
        zzvi zzviVar3;
        try {
            try {
                if (this.f21023f == 1) {
                    this.f21020c.mo8931b();
                    zzvc zzvcVar = this.f21019b;
                    synchronized (zzvcVar.f21082a) {
                        zzvcVar.f21094m = true;
                        zzvcVar.f21083b.quit();
                        zzvcVar.m8936a();
                    }
                }
                this.f21023f = 2;
                if (this.f21022e) {
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30 && i2 < 33) {
                    this.f21018a.stop();
                }
                if (i2 >= 35 && (zzviVar3 = this.f21021d) != null) {
                    zzviVar3.m8942b(this.f21018a);
                }
                this.f21018a.release();
                this.f21022e = true;
            } catch (Throwable th) {
                if (!this.f21022e) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 30 && i3 < 33) {
                        this.f21018a.stop();
                    }
                    if (i3 >= 35 && (zzviVar2 = this.f21021d) != null) {
                        zzviVar2.m8942b(this.f21018a);
                    }
                    this.f21018a.release();
                    this.f21022e = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (zzviVar = this.f21021d) != null) {
                zzviVar.m8942b(this.f21018a);
            }
            this.f21018a.release();
            this.f21022e = true;
            throw th2;
        }
    }
}
