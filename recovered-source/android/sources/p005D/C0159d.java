package p005D;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: D.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0159d {

    /* JADX INFO: renamed from: d */
    public long f277d;

    /* JADX INFO: renamed from: e */
    public long f278e;

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f274a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    /* JADX INFO: renamed from: b */
    public final int f275b = 16;

    /* JADX INFO: renamed from: c */
    public final int f276c = 16;

    /* JADX INFO: renamed from: f */
    public int f279f = 0;

    public C0159d() {
        long j2 = 0;
        this.f277d = j2;
        this.f278e = j2;
    }

    /* JADX INFO: renamed from: a */
    public final void m254a() {
        ByteBuffer byteBuffer = this.f274a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.f276c) {
            m255b(byteBuffer);
        }
        byteBuffer.compact();
    }

    /* JADX INFO: renamed from: b */
    public final void m255b(ByteBuffer byteBuffer) {
        long j2 = byteBuffer.getLong();
        long j3 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j2 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f277d;
        this.f277d = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j4 = this.f278e;
        this.f277d = ((jRotateLeft2 + j4) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j3 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j4;
        this.f278e = jRotateLeft3;
        this.f278e = ((Long.rotateLeft(jRotateLeft3, 31) + this.f277d) * 5) + 944331445;
        this.f279f += 16;
    }

    /* JADX INFO: renamed from: c */
    public final C0159d m256c(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.f274a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                m254a();
            }
            return this;
        }
        int iPosition = this.f275b - byteBuffer.position();
        for (int i2 = 0; i2 < iPosition; i2++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        m254a();
        while (byteBufferOrder.remaining() >= this.f276c) {
            m255b(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }
}
