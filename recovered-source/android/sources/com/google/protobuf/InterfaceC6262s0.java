package com.google.protobuf;

import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.protobuf.s0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6262s0 extends InterfaceC6264t0 {
    InterfaceC6162A0 getParserForType();

    int getSerializedSize();

    InterfaceC6260r0 newBuilderForType();

    byte[] toByteArray();

    void writeTo(AbstractC6269w abstractC6269w);

    void writeTo(OutputStream outputStream);
}
