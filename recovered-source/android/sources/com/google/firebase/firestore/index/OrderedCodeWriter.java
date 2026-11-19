package com.google.firebase.firestore.index;

import com.google.protobuf.AbstractC6251n;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class OrderedCodeWriter {
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    public static final long DOUBLE_ALL_BITS = -1;
    public static final long DOUBLE_SIGN_MASK = Long.MIN_VALUE;
    public static final byte ESCAPE1 = 0;
    public static final byte ESCAPE2 = -1;
    public static final byte FF_BYTE = 0;
    public static final byte INFINITY = -1;
    private static final byte[][] LENGTH_TO_HEADER_BITS = {new byte[]{0, 0}, new byte[]{-128, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, -128}, new byte[]{-1, -64}};
    public static final byte NULL_BYTE = -1;
    public static final byte SEPARATOR = 1;
    private int position = 0;
    private byte[] buffer = new byte[1024];

    private void ensureAvailable(int i2) {
        int i3 = i2 + this.position;
        byte[] bArr = this.buffer;
        if (i3 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i3) {
            i3 = length;
        }
        this.buffer = Arrays.copyOf(bArr, i3);
    }

    private int signedNumLength(long j2) {
        if (j2 < 0) {
            j2 = ~j2;
        }
        return IntMath.divide(65 - Long.numberOfLeadingZeros(j2), 7, RoundingMode.UP);
    }

    private int unsignedNumLength(long j2) {
        return IntMath.divide(64 - Long.numberOfLeadingZeros(j2), 8, RoundingMode.UP);
    }

    private void writeByteAscending(byte b) {
        if (b == 0) {
            writeEscapedByteAscending((byte) 0);
            writeEscapedByteAscending((byte) -1);
        } else if (b != -1) {
            writeEscapedByteAscending(b);
        } else {
            writeEscapedByteAscending((byte) -1);
            writeEscapedByteAscending((byte) 0);
        }
    }

    private void writeByteDescending(byte b) {
        if (b == 0) {
            writeEscapedByteDescending((byte) 0);
            writeEscapedByteDescending((byte) -1);
        } else if (b != -1) {
            writeEscapedByteDescending(b);
        } else {
            writeEscapedByteDescending((byte) -1);
            writeEscapedByteDescending((byte) 0);
        }
    }

    private void writeEscapedByteAscending(byte b) {
        ensureAvailable(1);
        byte[] bArr = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = b;
    }

    private void writeEscapedByteDescending(byte b) {
        ensureAvailable(1);
        byte[] bArr = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = (byte) (~b);
    }

    private void writeSeparatorAscending() {
        writeEscapedByteAscending((byte) 0);
        writeEscapedByteAscending((byte) 1);
    }

    private void writeSeparatorDescending() {
        writeEscapedByteDescending((byte) 0);
        writeEscapedByteDescending((byte) 1);
    }

    public byte[] encodedBytes() {
        return Arrays.copyOf(this.buffer, this.position);
    }

    public void reset() {
        this.position = 0;
    }

    public void seed(byte[] bArr) {
        ensureAvailable(bArr.length);
        for (byte b : bArr) {
            byte[] bArr2 = this.buffer;
            int i2 = this.position;
            this.position = i2 + 1;
            bArr2[i2] = b;
        }
    }

    public void writeBytesAscending(AbstractC6251n abstractC6251n) {
        for (int i2 = 0; i2 < abstractC6251n.size(); i2++) {
            writeByteAscending(abstractC6251n.mo11719d(i2));
        }
        writeSeparatorAscending();
    }

    public void writeBytesDescending(AbstractC6251n abstractC6251n) {
        for (int i2 = 0; i2 < abstractC6251n.size(); i2++) {
            writeByteDescending(abstractC6251n.mo11719d(i2));
        }
        writeSeparatorDescending();
    }

    public void writeDoubleAscending(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        writeUnsignedLongAscending(jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    public void writeDoubleDescending(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        writeUnsignedLongDescending(jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    public void writeInfinityAscending() {
        writeEscapedByteAscending((byte) -1);
        writeEscapedByteAscending((byte) -1);
    }

    public void writeInfinityDescending() {
        writeEscapedByteDescending((byte) -1);
        writeEscapedByteDescending((byte) -1);
    }

    public void writeSignedLongAscending(long j2) {
        int i2;
        long j3 = j2 < 0 ? ~j2 : j2;
        if (j3 < 64) {
            ensureAvailable(1);
            byte[] bArr = this.buffer;
            int i3 = this.position;
            this.position = i3 + 1;
            bArr[i3] = (byte) (j2 ^ ((long) LENGTH_TO_HEADER_BITS[1][0]));
            return;
        }
        int iSignedNumLength = signedNumLength(j3);
        ensureAvailable(iSignedNumLength);
        if (iSignedNumLength < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(iSignedNumLength)));
        }
        byte b = j2 < 0 ? (byte) -1 : (byte) 0;
        int i4 = this.position;
        if (iSignedNumLength == 10) {
            i2 = i4 + 2;
            byte[] bArr2 = this.buffer;
            bArr2[i4] = b;
            bArr2[i4 + 1] = b;
        } else if (iSignedNumLength == 9) {
            i2 = i4 + 1;
            this.buffer[i4] = b;
        } else {
            i2 = i4;
        }
        for (int i5 = (iSignedNumLength - 1) + i4; i5 >= i2; i5--) {
            this.buffer[i5] = (byte) (255 & j2);
            j2 >>= 8;
        }
        byte[] bArr3 = this.buffer;
        int i6 = this.position;
        byte b2 = bArr3[i6];
        byte[] bArr4 = LENGTH_TO_HEADER_BITS[iSignedNumLength];
        bArr3[i6] = (byte) (b2 ^ bArr4[0]);
        int i7 = i6 + 1;
        bArr3[i7] = (byte) (bArr4[1] ^ bArr3[i7]);
        this.position = i6 + iSignedNumLength;
    }

    public void writeSignedLongDescending(long j2) {
        writeSignedLongAscending(~j2);
    }

    public void writeUnsignedLongAscending(long j2) {
        int iUnsignedNumLength = unsignedNumLength(j2);
        ensureAvailable(iUnsignedNumLength + 1);
        byte[] bArr = this.buffer;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        bArr[i2] = (byte) iUnsignedNumLength;
        int i4 = i3 + iUnsignedNumLength;
        while (true) {
            i4--;
            int i5 = this.position;
            if (i4 < i5) {
                this.position = i5 + iUnsignedNumLength;
                return;
            } else {
                this.buffer[i4] = (byte) (255 & j2);
                j2 >>>= 8;
            }
        }
    }

    public void writeUnsignedLongDescending(long j2) {
        int iUnsignedNumLength = unsignedNumLength(j2);
        ensureAvailable(iUnsignedNumLength + 1);
        byte[] bArr = this.buffer;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        bArr[i2] = (byte) (~iUnsignedNumLength);
        int i4 = i3 + iUnsignedNumLength;
        while (true) {
            i4--;
            int i5 = this.position;
            if (i4 < i5) {
                this.position = i5 + iUnsignedNumLength;
                return;
            } else {
                this.buffer[i4] = (byte) (~(255 & j2));
                j2 >>>= 8;
            }
        }
    }

    public void writeUtf8Ascending(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 128) {
                writeByteAscending((byte) cCharAt);
            } else if (cCharAt < 2048) {
                writeByteAscending((byte) ((cCharAt >>> 6) | 960));
                writeByteAscending((byte) ((cCharAt & '?') | 128));
            } else if (cCharAt < 55296 || 57343 < cCharAt) {
                writeByteAscending((byte) ((cCharAt >>> '\f') | 480));
                writeByteAscending((byte) (((cCharAt >>> 6) & 63) | 128));
                writeByteAscending((byte) ((cCharAt & '?') | 128));
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i2);
                i2++;
                writeByteAscending((byte) ((iCodePointAt >>> 18) | 240));
                writeByteAscending((byte) (((iCodePointAt >>> 12) & 63) | 128));
                writeByteAscending((byte) (((iCodePointAt >>> 6) & 63) | 128));
                writeByteAscending((byte) ((iCodePointAt & 63) | 128));
            }
            i2++;
        }
        writeSeparatorAscending();
    }

    public void writeUtf8Descending(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 128) {
                writeByteDescending((byte) cCharAt);
            } else if (cCharAt < 2048) {
                writeByteDescending((byte) ((cCharAt >>> 6) | 960));
                writeByteDescending((byte) ((cCharAt & '?') | 128));
            } else if (cCharAt < 55296 || 57343 < cCharAt) {
                writeByteDescending((byte) ((cCharAt >>> '\f') | 480));
                writeByteDescending((byte) (((cCharAt >>> 6) & 63) | 128));
                writeByteDescending((byte) ((cCharAt & '?') | 128));
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i2);
                i2++;
                writeByteDescending((byte) ((iCodePointAt >>> 18) | 240));
                writeByteDescending((byte) (((iCodePointAt >>> 12) & 63) | 128));
                writeByteDescending((byte) (((iCodePointAt >>> 6) & 63) | 128));
                writeByteDescending((byte) ((iCodePointAt & 63) | 128));
            }
            i2++;
        }
        writeSeparatorDescending();
    }
}
