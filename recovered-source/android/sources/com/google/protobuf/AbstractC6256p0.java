package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6256p0 {

    /* JADX INFO: renamed from: a */
    public static final C6254o0 f24241a;

    /* JADX INFO: renamed from: b */
    public static final C6254o0 f24242b;

    static {
        C6254o0 c6254o0 = null;
        try {
            c6254o0 = (C6254o0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f24241a = c6254o0;
        f24242b = new C6254o0();
    }
}
