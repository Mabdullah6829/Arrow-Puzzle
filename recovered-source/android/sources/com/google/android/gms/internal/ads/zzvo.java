package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes2.dex */
public class zzvo extends zziv {

    /* JADX INFO: renamed from: s */
    public final int f21110s;

    public zzvo(IllegalStateException illegalStateException, zzvp zzvpVar) {
        super("Decoder failed: ".concat(String.valueOf(zzvpVar == null ? null : zzvpVar.f21111a)), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f21110s = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
