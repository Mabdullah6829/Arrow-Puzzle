package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class zztj extends zzcq {

    /* JADX INFO: renamed from: i */
    public zzham f20877i;

    /* JADX INFO: renamed from: j */
    public zzham f20878j;

    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:60:0x0102  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124  */
    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: d */
    public final void mo5717d(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        zzham zzhamVar = this.f20878j;
        zzhamVar.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM5781h = m5781h(((iLimit - iPosition) / this.f11134b.f10390d) * this.f11135c.f10390d);
        while (iPosition < iLimit) {
            for (int i7 = 0; i7 < zzhamVar.f18427t; i7++) {
                int iM6504f = (zzfm.m6504f(this.f11134b.f10389c) * zzhamVar.m7301a(i7)) + iPosition;
                int i8 = this.f11134b.f10389c;
                if (i8 == 2) {
                    byteBufferM5781h.putShort(byteBuffer.getShort(iM6504f));
                } else if (i8 == 3) {
                    byteBufferM5781h.put(byteBuffer.get(iM6504f));
                } else if (i8 == 4) {
                    byteBufferM5781h.putFloat(byteBuffer.getFloat(iM6504f));
                } else if (i8 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i2 = iM6504f;
                    } else {
                        i2 = iM6504f + 2;
                    }
                    byte b = byteBuffer.get(i2);
                    byte b2 = byteBuffer.get(iM6504f + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iM6504f += 2;
                    }
                    i3 = ((b << 24) & ViewCompat.MEASURED_STATE_MASK) | ((b2 << 16) & 16711680) | ((byteBuffer.get(iM6504f) << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                    i4 = i3 >> 8;
                    if ((i4 & ViewCompat.MEASURED_STATE_MASK) != 0 || (i4 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzgtr.m7132e("Value out of range of 24-bit integer: %s", z, Integer.toHexString(i4));
                    zzgtr.m7128a(byteBufferM5781h.remaining() >= 3);
                    if (byteBufferM5781h.order() == byteOrder) {
                        i5 = (i3 >> 24) & 255;
                    } else {
                        i5 = i4 & 255;
                    }
                    byte b3 = (byte) i5;
                    int i9 = (i3 >> 16) & 255;
                    if (byteBufferM5781h.order() == byteOrder) {
                        i6 = i4 & 255;
                    } else {
                        i6 = (i3 >> 24) & 255;
                    }
                    byteBufferM5781h.put(b3).put((byte) i9).put((byte) i6);
                } else if (i8 == 22) {
                    byteBufferM5781h.putInt(byteBuffer.getInt(iM6504f));
                } else if (i8 == 268435456) {
                    byteBufferM5781h.putShort(byteBuffer.getShort(iM6504f));
                } else if (i8 == 1342177280) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i2 = iM6504f;
                    } else {
                        i2 = iM6504f + 2;
                    }
                    byte b4 = byteBuffer.get(i2);
                    byte b5 = byteBuffer.get(iM6504f + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iM6504f += 2;
                    }
                    i3 = ((b4 << 24) & ViewCompat.MEASURED_STATE_MASK) | ((b5 << 16) & 16711680) | ((byteBuffer.get(iM6504f) << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                    i4 = i3 >> 8;
                    if ((i4 & ViewCompat.MEASURED_STATE_MASK) != 0) {
                        z = true;
                    } else {
                        z = true;
                    }
                    zzgtr.m7132e("Value out of range of 24-bit integer: %s", z, Integer.toHexString(i4));
                    zzgtr.m7128a(byteBufferM5781h.remaining() >= 3);
                    if (byteBufferM5781h.order() == byteOrder) {
                        i5 = (i3 >> 24) & 255;
                    } else {
                        i5 = i4 & 255;
                    }
                    byte b6 = (byte) i5;
                    int i10 = (i3 >> 16) & 255;
                    if (byteBufferM5781h.order() == byteOrder) {
                        i6 = i4 & 255;
                    } else {
                        i6 = (i3 >> 24) & 255;
                    }
                    byteBufferM5781h.put(b6).put((byte) i10).put((byte) i6);
                } else if (i8 != 1610612736) {
                    if (i8 != 1879048192) {
                        if (i8 == 1895825408) {
                            byteBufferM5781h.putFloat(byteBuffer.getFloat(iM6504f));
                        } else if (i8 != 1912602624) {
                            throw new IllegalStateException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i8).length() + 21), "Unexpected encoding: ", i8));
                        }
                    }
                    byteBufferM5781h.putDouble(byteBuffer.getDouble(iM6504f));
                } else {
                    byteBufferM5781h.putInt(byteBuffer.getInt(iM6504f));
                }
            }
            iPosition += this.f11134b.f10390d;
        }
        byteBuffer.position(iLimit);
        byteBufferM5781h.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    /* JADX INFO: renamed from: i */
    public final zzcl mo5782i(zzcl zzclVar) throws zzco {
        zzham zzhamVar = this.f20877i;
        if (zzhamVar == null) {
            return zzcl.f10386e;
        }
        int i2 = zzclVar.f10389c;
        if (!zzfm.m6502d(i2)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int i3 = zzhamVar.f18427t;
        int i4 = zzclVar.f10388b;
        boolean z = i4 != i3;
        int i5 = 0;
        while (i5 < i3) {
            int iM7301a = zzhamVar.m7301a(i5);
            if (iM7301a >= i4) {
                String string = zzhamVar.toString();
                throw new zzco(AbstractC1456a.m2450q(new StringBuilder(string.length() + 59), "Channel map (", string, ") trying to access non-existent input channel."), zzclVar);
            }
            z |= iM7301a != i5;
            i5++;
        }
        return z ? new zzcl(zzclVar.f10387a, i3, i2) : zzcl.f10386e;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    /* JADX INFO: renamed from: k */
    public final void mo5784k() {
        this.f20878j = this.f20877i;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    /* JADX INFO: renamed from: l */
    public final void mo5785l() {
        this.f20878j = null;
        this.f20877i = null;
    }
}
