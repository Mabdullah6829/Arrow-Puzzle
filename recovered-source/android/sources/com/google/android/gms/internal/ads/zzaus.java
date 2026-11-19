package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaus implements zzaut {

    /* JADX INFO: renamed from: b */
    public static final Logger f6959b = Logger.getLogger(zzaus.class.getName());

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f6960a = new zzaur();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaut
    /* JADX INFO: renamed from: a */
    public final zzauw mo4427a(zziml zzimlVar, zzimk zzimkVar) throws EOFException {
        int iMo5497B;
        long jZzb;
        long jZzc = zzimlVar.zzc();
        ThreadLocal threadLocal = this.f6960a;
        ((ByteBuffer) threadLocal.get()).rewind().limit(8);
        do {
            iMo5497B = zzimlVar.mo5497B((ByteBuffer) threadLocal.get());
            if (iMo5497B == 8) {
                ((ByteBuffer) threadLocal.get()).rewind();
                long jM4429a = zzauv.m4429a((ByteBuffer) threadLocal.get());
                if (jM4429a < 8 && jM4429a > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jM4429a);
                    sb.append("). Stop parsing!");
                    f6959b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) threadLocal.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (jM4429a == 1) {
                        ((ByteBuffer) threadLocal.get()).limit(16);
                        zzimlVar.mo5497B((ByteBuffer) threadLocal.get());
                        ((ByteBuffer) threadLocal.get()).position(8);
                        jZzb = zzauv.m4430b((ByteBuffer) threadLocal.get()) - 16;
                    } else {
                        jZzb = jM4429a == 0 ? zzimlVar.zzb() - zzimlVar.zzc() : jM4429a - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) threadLocal.get()).limit(((ByteBuffer) threadLocal.get()).limit() + 16);
                        zzimlVar.mo5497B((ByteBuffer) threadLocal.get());
                        byte[] bArr2 = new byte[16];
                        for (int iPosition = ((ByteBuffer) threadLocal.get()).position() - 16; iPosition < ((ByteBuffer) threadLocal.get()).position(); iPosition++) {
                            bArr2[iPosition - (((ByteBuffer) threadLocal.get()).position() - 16)] = ((ByteBuffer) threadLocal.get()).get(iPosition);
                        }
                        jZzb -= 16;
                    }
                    long j2 = jZzb;
                    if (zzimkVar instanceof zzauw) {
                    }
                    zzauw zzauwVarMo4428b = mo4428b(str);
                    ((ByteBuffer) threadLocal.get()).rewind();
                    zzauwVarMo4428b.mo4433c(zzimlVar, (ByteBuffer) threadLocal.get(), j2, this);
                    return zzauwVarMo4428b;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (iMo5497B >= 0);
        zzimlVar.mo5498f(jZzc);
        throw new EOFException();
    }

    /* JADX INFO: renamed from: b */
    public abstract zzauw mo4428b(String str);
}
