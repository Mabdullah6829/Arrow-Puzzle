package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.w */
/* JADX INFO: loaded from: classes.dex */
public final class C6464w {
    /* JADX INFO: renamed from: a */
    public static String m12190a(InterfaceC6449h interfaceC6449h) {
        String string = interfaceC6449h.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
