package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcw extends zzcq {
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: d */
    public final void mo5717d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.f11134b.f10389c;
        if (i3 == 3) {
            i2 += i2;
        } else if (i3 == 4) {
            i2 /= 2;
        } else {
            if (i3 != 21) {
                if (i3 == 22) {
                    i2 /= 2;
                } else if (i3 != 268435456) {
                    if (i3 != 1342177280) {
                        if (i3 == 1610612736) {
                            i2 /= 2;
                        } else {
                            if (i3 != 1879048192) {
                                if (i3 == 1895825408) {
                                    i2 /= 2;
                                } else if (i3 != 1912602624) {
                                    throw new IllegalStateException();
                                }
                            }
                            i2 /= 4;
                        }
                    }
                }
            }
            i2 /= 3;
            i2 += i2;
        }
        ByteBuffer byteBufferM5781h = m5781h(i2);
        int i4 = this.f11134b.f10389c;
        if (i4 == 3) {
            while (iPosition < iLimit) {
                byteBufferM5781h.put((byte) 0);
                byteBufferM5781h.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i4 == 4) {
            while (iPosition < iLimit) {
                float f2 = byteBuffer.getFloat(iPosition);
                String str = zzfm.f16091a;
                short sMax = (short) (Math.max(-1.0f, Math.min(f2, 1.0f)) * 32767.0f);
                byteBufferM5781h.put((byte) (sMax & 255));
                byteBufferM5781h.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i4 == 21) {
            while (iPosition < iLimit) {
                byteBufferM5781h.put(byteBuffer.get(iPosition + 1));
                byteBufferM5781h.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i4 == 22) {
            while (iPosition < iLimit) {
                byteBufferM5781h.put(byteBuffer.get(iPosition + 2));
                byteBufferM5781h.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i4 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM5781h.put(byteBuffer.get(iPosition + 1));
                byteBufferM5781h.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i4 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferM5781h.put(byteBuffer.get(iPosition + 1));
                byteBufferM5781h.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else if (i4 == 1610612736) {
            while (iPosition < iLimit) {
                byteBufferM5781h.put(byteBuffer.get(iPosition + 1));
                byteBufferM5781h.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        } else if (i4 == 1879048192) {
            while (iPosition < iLimit) {
                short sMax2 = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(iPosition), 1.0d)) * 32767.0d);
                byteBufferM5781h.put((byte) (sMax2 & 255));
                byteBufferM5781h.put((byte) ((sMax2 >> 8) & 255));
                iPosition += 8;
            }
        } else if (i4 == 1895825408) {
            while (iPosition < iLimit) {
                float fIntBitsToFloat = Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition)));
                String str2 = zzfm.f16091a;
                short sMax3 = (short) (Math.max(-1.0f, Math.min(fIntBitsToFloat, 1.0f)) * 32767.0f);
                byteBufferM5781h.put((byte) (sMax3 & 255));
                byteBufferM5781h.put((byte) ((sMax3 >> 8) & 255));
                iPosition += 4;
            }
        } else {
            if (i4 != 1912602624) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                short sMax4 = (short) (Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition))), 1.0d)) * 32767.0d);
                byteBufferM5781h.put((byte) (sMax4 & 255));
                byteBufferM5781h.put((byte) ((sMax4 >> 8) & 255));
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
            return i2 != 2 ? new zzcl(zzclVar.f10387a, zzclVar.f10388b, 2) : zzcl.f10386e;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }
}
