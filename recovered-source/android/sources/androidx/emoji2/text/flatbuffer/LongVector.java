package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class LongVector extends BaseVector {
    public LongVector __assign(int i2, ByteBuffer byteBuffer) {
        __reset(i2, 8, byteBuffer);
        return this;
    }

    public long get(int i2) {
        return this.f2785bb.getLong(__element(i2));
    }
}
