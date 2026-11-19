package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzva implements zzvn {

    /* JADX INFO: renamed from: g */
    public static final ArrayDeque f21073g = new ArrayDeque();

    /* JADX INFO: renamed from: h */
    public static final Object f21074h = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f21075a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f21076b;

    /* JADX INFO: renamed from: c */
    public Handler f21077c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f21078d;

    /* JADX INFO: renamed from: e */
    public final zzdt f21079e;

    /* JADX INFO: renamed from: f */
    public boolean f21080f;

    public zzva(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzff zzffVar = zzdp.f12520a;
        zzdt zzdtVar = new zzdt();
        this.f21075a = mediaCodec;
        this.f21076b = handlerThread;
        this.f21079e = zzdtVar;
        this.f21078d = new AtomicReference();
    }

    /* JADX INFO: renamed from: g */
    public static zzuz m8929g() {
        ArrayDeque arrayDeque = f21073g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zzuz();
                }
                return (zzuz) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    /* JADX INFO: renamed from: a */
    public final void mo8930a() {
        if (this.f21080f) {
            try {
                Handler handler = this.f21077c;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                zzdt zzdtVar = this.f21079e;
                synchronized (zzdtVar) {
                    zzdtVar.f12859a = false;
                }
                Handler handler2 = this.f21077c;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                synchronized (zzdtVar) {
                    while (!zzdtVar.f12859a) {
                        zzdtVar.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    /* JADX INFO: renamed from: b */
    public final void mo8931b() {
        if (this.f21080f) {
            mo8930a();
            this.f21076b.quit();
        }
        this.f21080f = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    /* JADX INFO: renamed from: c */
    public final void mo8932c() {
        RuntimeException runtimeException = (RuntimeException) this.f21078d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    /* JADX INFO: renamed from: d */
    public final void mo8933d(Bundle bundle) {
        mo8932c();
        Handler handler = this.f21077c;
        String str = zzfm.f16091a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    /* JADX INFO: renamed from: e */
    public final void mo8934e(int i2, zziu zziuVar, long j2, int i3) {
        int length;
        int length2;
        int length3;
        int length4;
        mo8932c();
        zzuz zzuzVarM8929g = m8929g();
        zzuzVarM8929g.f21025a = i2;
        zzuzVarM8929g.f21026b = 0;
        zzuzVarM8929g.f21028d = j2;
        zzuzVarM8929g.f21029e = i3;
        MediaCodec.CryptoInfo cryptoInfo = zzuzVarM8929g.f21027c;
        cryptoInfo.numSubSamples = zziuVar.f20041f;
        int[] iArr = zziuVar.f20039d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < (length4 = iArr.length)) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = zziuVar.f20040e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < (length3 = iArr2.length)) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = zziuVar.f20037b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < (length2 = bArr.length)) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, length2);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = zziuVar.f20036a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < (length = bArr2.length)) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = zziuVar.f20038c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zziuVar.f20042g, zziuVar.f20043h));
        Handler handler = this.f21077c;
        String str = zzfm.f16091a;
        handler.obtainMessage(2, zzuzVarM8929g).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    /* JADX INFO: renamed from: f */
    public final void mo8935f(int i2, int i3, int i4, long j2) {
        mo8932c();
        zzuz zzuzVarM8929g = m8929g();
        zzuzVarM8929g.f21025a = i2;
        zzuzVarM8929g.f21026b = i3;
        zzuzVarM8929g.f21028d = j2;
        zzuzVarM8929g.f21029e = i4;
        Handler handler = this.f21077c;
        String str = zzfm.f16091a;
        handler.obtainMessage(1, zzuzVarM8929g).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zza() {
        if (this.f21080f) {
            return;
        }
        HandlerThread handlerThread = this.f21076b;
        handlerThread.start();
        this.f21077c = new zzuy(this, handlerThread.getLooper());
        this.f21080f = true;
    }
}
