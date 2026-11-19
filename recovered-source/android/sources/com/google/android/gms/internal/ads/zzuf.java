package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzuf extends zzcq {
    /* JADX INFO: renamed from: m */
    public static void m8904m(int i2, ByteBuffer byteBuffer) {
        float f2 = (float) (((double) i2) * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f2) ? 0 : Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: d */
    public final void mo5717d(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM5781h;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.f11134b.f10389c;
        if (i3 == 2) {
            byteBufferM5781h = m5781h(i2 + i2);
            while (iPosition < iLimit) {
                m8904m(byteBuffer.getShort(iPosition) << 16, byteBufferM5781h);
                iPosition += 2;
            }
        } else if (i3 == 3) {
            byteBufferM5781h = m5781h(i2 * 4);
            while (iPosition < iLimit) {
                m8904m(((byteBuffer.get(iPosition) & 255) - 128) << 24, byteBufferM5781h);
                iPosition++;
            }
        } else if (i3 == 21) {
            byteBufferM5781h = m5781h((i2 / 3) * 4);
            while (iPosition < iLimit) {
                m8904m(zzhaq.m7306c(byteBuffer.get(iPosition + 2), byteBuffer.get(iPosition + 1), byteBuffer.get(iPosition), (byte) 0), byteBufferM5781h);
                iPosition += 3;
            }
        } else if (i3 == 22) {
            byteBufferM5781h = m5781h(i2);
            while (iPosition < iLimit) {
                m8904m(byteBuffer.getInt(iPosition), byteBufferM5781h);
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            byteBufferM5781h = m5781h(i2 + i2);
            while (iPosition < iLimit) {
                m8904m(Short.reverseBytes(byteBuffer.getShort(iPosition)) << 16, byteBufferM5781h);
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            byteBufferM5781h = m5781h((i2 / 3) * 4);
            while (iPosition < iLimit) {
                m8904m(zzhaq.m7306c(byteBuffer.get(iPosition), byteBuffer.get(iPosition + 1), byteBuffer.get(iPosition + 2), (byte) 0), byteBufferM5781h);
                iPosition += 3;
            }
        } else if (i3 == 1610612736) {
            byteBufferM5781h = m5781h(i2);
            while (iPosition < iLimit) {
                m8904m(Integer.reverseBytes(byteBuffer.getInt(iPosition)), byteBufferM5781h);
                iPosition += 4;
            }
        } else if (i3 == 1879048192) {
            byteBufferM5781h = m5781h(i2 / 2);
            while (iPosition < iLimit) {
                byteBufferM5781h.putFloat((float) byteBuffer.getDouble(iPosition));
                iPosition += 8;
            }
        } else if (i3 == 1895825408) {
            byteBufferM5781h = m5781h(i2);
            while (iPosition < iLimit) {
                byteBufferM5781h.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition))));
                iPosition += 4;
            }
        } else {
            if (i3 != 1912602624) {
                throw new IllegalStateException();
            }
            byteBufferM5781h = m5781h(i2 / 2);
            while (iPosition < iLimit) {
                byteBufferM5781h.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition))));
                iPosition += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM5781h.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    /* JADX INFO: renamed from: i */
    public final zzcl mo5782i(zzcl zzclVar) throws zzco {
        int i2 = zzclVar.f10389c;
        if (zzfm.m6502d(i2)) {
            return i2 != 4 ? new zzcl(zzclVar.f10387a, zzclVar.f10388b, 4) : zzcl.f10386e;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }
}
