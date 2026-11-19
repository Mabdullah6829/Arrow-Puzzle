package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class zzauz extends zzimi {

    /* JADX INFO: renamed from: B */
    public Date f6961B;

    /* JADX INFO: renamed from: C */
    public Date f6962C;

    /* JADX INFO: renamed from: D */
    public long f6963D;

    /* JADX INFO: renamed from: E */
    public long f6964E;

    /* JADX INFO: renamed from: F */
    public double f6965F;

    /* JADX INFO: renamed from: G */
    public float f6966G;

    /* JADX INFO: renamed from: H */
    public zzims f6967H;

    /* JADX INFO: renamed from: I */
    public long f6968I;

    public zzauz() {
        super("mvhd");
        this.f6965F = 1.0d;
        this.f6966G = 1.0f;
        this.f6967H = zzims.f19985j;
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    /* JADX INFO: renamed from: b */
    public final void mo4434b(ByteBuffer byteBuffer) {
        int i2 = byteBuffer.get();
        if (i2 < 0) {
            i2 += 256;
        }
        this.f19970A = i2;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f19964t) {
            m8540d();
        }
        if (this.f19970A == 1) {
            this.f6961B = zzimn.m8543a(zzauv.m4430b(byteBuffer));
            this.f6962C = zzimn.m8543a(zzauv.m4430b(byteBuffer));
            this.f6963D = zzauv.m4429a(byteBuffer);
            this.f6964E = zzauv.m4430b(byteBuffer);
        } else {
            this.f6961B = zzimn.m8543a(zzauv.m4429a(byteBuffer));
            this.f6962C = zzimn.m8543a(zzauv.m4429a(byteBuffer));
            this.f6963D = zzauv.m4429a(byteBuffer);
            this.f6964E = zzauv.m4429a(byteBuffer);
        }
        this.f6965F = zzauv.m4431c(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f6966G = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        zzauv.m4429a(byteBuffer);
        zzauv.m4429a(byteBuffer);
        this.f6967H = new zzims(zzauv.m4431c(byteBuffer), zzauv.m4431c(byteBuffer), zzauv.m4431c(byteBuffer), zzauv.m4431c(byteBuffer), zzauv.m4432d(byteBuffer), zzauv.m4432d(byteBuffer), zzauv.m4432d(byteBuffer), zzauv.m4431c(byteBuffer), zzauv.m4431c(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f6968I = zzauv.m4429a(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f6961B + ";modificationTime=" + this.f6962C + ";timescale=" + this.f6963D + ";duration=" + this.f6964E + ";rate=" + this.f6965F + ";volume=" + this.f6966G + ";matrix=" + this.f6967H + ";nextTrackId=" + this.f6968I + "]";
    }
}
