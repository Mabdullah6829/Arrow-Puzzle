package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class zzix extends zzis {

    /* JADX INFO: renamed from: b */
    public zzv f20046b;

    /* JADX INFO: renamed from: c */
    public final zziu f20047c = new zziu();

    /* JADX INFO: renamed from: d */
    public ByteBuffer f20048d;

    /* JADX INFO: renamed from: e */
    public long f20049e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f20050f;

    /* JADX INFO: renamed from: g */
    public final int f20051g;

    static {
        zzal.m4188a("media3.decoder");
    }

    public zzix(int i2) {
        this.f20051g = i2;
    }

    /* JADX INFO: renamed from: c */
    public void mo8566c() {
        this.f20033a = 0;
        ByteBuffer byteBuffer = this.f20048d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f20050f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8567d(int i2) {
        ByteBuffer byteBuffer = this.f20048d;
        if (byteBuffer == null) {
            this.f20048d = m8570g(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f20048d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM8570g = m8570g(i3);
        byteBufferM8570g.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM8570g.put(byteBuffer);
        }
        this.f20048d = byteBufferM8570g;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8568e() {
        return m8564b(BasicMeasure.EXACTLY);
    }

    /* JADX INFO: renamed from: f */
    public final void m8569f() {
        ByteBuffer byteBuffer = this.f20048d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f20050f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* JADX INFO: renamed from: g */
    public final ByteBuffer m8570g(int i2) {
        int i3 = this.f20051g;
        if (i3 == 1) {
            return ByteBuffer.allocate(i2);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i2);
        }
        ByteBuffer byteBuffer = this.f20048d;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(String.valueOf(iCapacity).length() + 21 + String.valueOf(i2).length() + 1);
        AbstractC1456a.m2455v(sb, "Buffer too small (", iCapacity, " < ", i2);
        sb.append(")");
        throw new zziw(sb.toString());
    }
}
