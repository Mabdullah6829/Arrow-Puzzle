package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class FloatVector extends BaseVector {
    public FloatVector __assign(int i2, ByteBuffer byteBuffer) {
        __reset(i2, 4, byteBuffer);
        return this;
    }

    public float get(int i2) {
        return this.f2785bb.getFloat(__element(i2));
    }
}
