package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
final class zzvc extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f21083b;

    /* JADX INFO: renamed from: c */
    public Handler f21084c;

    /* JADX INFO: renamed from: h */
    public MediaFormat f21089h;

    /* JADX INFO: renamed from: i */
    public MediaFormat f21090i;

    /* JADX INFO: renamed from: j */
    public MediaCodec.CodecException f21091j;

    /* JADX INFO: renamed from: k */
    public MediaCodec.CryptoException f21092k;

    /* JADX INFO: renamed from: l */
    public long f21093l;

    /* JADX INFO: renamed from: m */
    public boolean f21094m;

    /* JADX INFO: renamed from: n */
    public IllegalStateException f21095n;

    /* JADX INFO: renamed from: o */
    public zzvl f21096o;

    /* JADX INFO: renamed from: a */
    public final Object f21082a = new Object();

    /* JADX INFO: renamed from: d */
    public final zzdo f21085d = new zzdo();

    /* JADX INFO: renamed from: e */
    public final zzdo f21086e = new zzdo();

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f21087f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f21088g = new ArrayDeque();

    public zzvc(HandlerThread handlerThread) {
        this.f21083b = handlerThread;
    }

    /* JADX INFO: renamed from: a */
    public final void m8936a() {
        ArrayDeque arrayDeque = this.f21088g;
        if (!arrayDeque.isEmpty()) {
            this.f21090i = (MediaFormat) arrayDeque.getLast();
        }
        zzdo zzdoVar = this.f21085d;
        zzdoVar.f12408c = zzdoVar.f12407b;
        zzdo zzdoVar2 = this.f21086e;
        zzdoVar2.f12408c = zzdoVar2.f12407b;
        this.f21087f.clear();
        arrayDeque.clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m8937b() {
        IllegalStateException illegalStateException = this.f21095n;
        if (illegalStateException != null) {
            this.f21095n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f21091j;
        if (codecException != null) {
            this.f21091j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f21092k;
        if (cryptoException == null) {
            return;
        }
        this.f21092k = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f21082a) {
            this.f21092k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f21082a) {
            this.f21091j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        zznb zznbVar;
        synchronized (this.f21082a) {
            try {
                this.f21085d.m5943a(i2);
                zzvl zzvlVar = this.f21096o;
                if (zzvlVar != null && (zznbVar = ((zzvu) zzvlVar).f21129a.f21176b0) != null) {
                    zznbVar.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        zznb zznbVar;
        synchronized (this.f21082a) {
            try {
                MediaFormat mediaFormat = this.f21090i;
                if (mediaFormat != null) {
                    this.f21086e.m5943a(-2);
                    this.f21088g.add(mediaFormat);
                    this.f21090i = null;
                }
                this.f21086e.m5943a(i2);
                this.f21087f.add(bufferInfo);
                zzvl zzvlVar = this.f21096o;
                if (zzvlVar != null && (zznbVar = ((zzvu) zzvlVar).f21129a.f21176b0) != null) {
                    zznbVar.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f21082a) {
            this.f21086e.m5943a(-2);
            this.f21088g.add(mediaFormat);
            this.f21090i = null;
        }
    }
}
