package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6165C {

    /* JADX INFO: renamed from: a */
    public static final C6163B f24053a = new C6163B();

    /* JADX INFO: renamed from: b */
    public static final C6163B f24054b;

    static {
        C6163B c6163b = null;
        try {
            c6163b = (C6163B) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f24054b = c6163b;
    }
}
