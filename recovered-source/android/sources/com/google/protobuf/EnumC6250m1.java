package com.google.protobuf;

import java.io.Serializable;

/* JADX INFO: renamed from: com.google.protobuf.m1 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC6250m1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(AbstractC6251n.f24219t),
    ENUM(null),
    MESSAGE(null);


    /* JADX INFO: renamed from: s */
    public final Object f24218s;

    EnumC6250m1(Serializable serializable) {
        this.f24218s = serializable;
    }
}
