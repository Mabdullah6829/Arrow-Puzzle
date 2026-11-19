package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class ByteOutput {
    public abstract void write(byte b);

    public abstract void write(ByteBuffer byteBuffer);

    public abstract void write(byte[] bArr, int i2, int i3);

    public abstract void writeLazy(ByteBuffer byteBuffer);

    public abstract void writeLazy(byte[] bArr, int i2, int i3);
}
