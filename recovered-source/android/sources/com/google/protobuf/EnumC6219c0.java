package com.google.protobuf;

import java.io.Serializable;

/* JADX INFO: renamed from: com.google.protobuf.c0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC6219c0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC6251n.class, AbstractC6251n.f24219t),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: s */
    public final Object f24158s;

    EnumC6219c0(Class cls, Serializable serializable) {
        this.f24158s = serializable;
    }
}
