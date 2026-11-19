package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class Struct {

    /* JADX INFO: renamed from: bb */
    protected ByteBuffer f2790bb;
    protected int bb_pos;

    public void __reset(int i2, ByteBuffer byteBuffer) {
        this.f2790bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i2;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        __reset(0, null);
    }
}
