package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class zzvd extends zzix {

    /* JADX INFO: renamed from: h */
    public long f21097h;

    /* JADX INFO: renamed from: i */
    public int f21098i;

    /* JADX INFO: renamed from: j */
    public int f21099j;

    public zzvd() {
        super(2);
        this.f21099j = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzix
    /* JADX INFO: renamed from: c */
    public final void mo8566c() {
        super.mo8566c();
        this.f21098i = 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m8938h() {
        return this.f21098i;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m8939i() {
        return this.f21098i > 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m8940j(zzix zzixVar) {
        ByteBuffer byteBuffer;
        zzgtr.m7128a(!zzixVar.m8564b(BasicMeasure.EXACTLY));
        zzgtr.m7128a(!zzixVar.m8564b(268435456));
        zzgtr.m7128a(!zzixVar.m8564b(4));
        if (m8939i()) {
            if (this.f21098i >= this.f21099j) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzixVar.f20048d;
            if (byteBuffer2 != null && (byteBuffer = this.f20048d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i2 = this.f21098i;
        this.f21098i = i2 + 1;
        if (i2 == 0) {
            this.f20049e = zzixVar.f20049e;
            if (zzixVar.m8564b(1)) {
                this.f20033a = 1;
            }
        }
        ByteBuffer byteBuffer3 = zzixVar.f20048d;
        if (byteBuffer3 != null) {
            m8567d(byteBuffer3.remaining());
            this.f20048d.put(byteBuffer3);
        }
        this.f21097h = zzixVar.f20049e;
        return true;
    }
}
