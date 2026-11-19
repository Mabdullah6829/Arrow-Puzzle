package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzimg implements zzauw {

    /* JADX INFO: renamed from: z */
    public static final zzimr f19962z = zzimr.m8544b(zzimg.class);

    /* JADX INFO: renamed from: s */
    public final String f19963s;

    /* JADX INFO: renamed from: v */
    public ByteBuffer f19966v;

    /* JADX INFO: renamed from: w */
    public long f19967w;

    /* JADX INFO: renamed from: y */
    public zziml f19969y;

    /* JADX INFO: renamed from: x */
    public long f19968x = -1;

    /* JADX INFO: renamed from: u */
    public boolean f19965u = true;

    /* JADX INFO: renamed from: t */
    public boolean f19964t = true;

    public zzimg(String str) {
        this.f19963s = str;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m8539a() {
        try {
            if (this.f19965u) {
                return;
            }
            try {
                zzimr zzimrVar = f19962z;
                String str = this.f19963s;
                zzimrVar.mo8542a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.f19966v = this.f19969y.mo5499g(this.f19967w, this.f19968x);
                this.f19965u = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo4434b(ByteBuffer byteBuffer);

    @Override // com.google.android.gms.internal.ads.zzauw
    /* JADX INFO: renamed from: c */
    public final void mo4433c(zziml zzimlVar, ByteBuffer byteBuffer, long j2, zzaus zzausVar) {
        this.f19967w = zzimlVar.zzc();
        byteBuffer.remaining();
        this.f19968x = j2;
        this.f19969y = zzimlVar;
        zzimlVar.mo5498f(zzimlVar.zzc() + j2);
        this.f19965u = false;
        this.f19964t = false;
        m8540d();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m8540d() {
        try {
            m8539a();
            zzimr zzimrVar = f19962z;
            String str = this.f19963s;
            zzimrVar.mo8542a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f19966v;
            if (byteBuffer != null) {
                this.f19964t = true;
                byteBuffer.rewind();
                mo4434b(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f19966v = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
