package p034T;

import p011H.AbstractC0271e0;
import p030R.C0589w0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: T.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0755l0 {

    /* JADX INFO: renamed from: u */
    public static final EnumC0755l0 f1905u;

    /* JADX INFO: renamed from: v */
    public static final EnumC0755l0[] f1906v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC0755l0[] f1907w;

    /* JADX INFO: renamed from: s */
    public final int f1908s;

    /* JADX INFO: renamed from: t */
    public final C0589w0 f1909t;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0755l0 EF0;

    static {
        C0589w0 c0589w0 = C0589w0.f1284n;
        EnumC0755l0 enumC0755l0 = new EnumC0755l0("NO_ERROR", 0, 0, c0589w0);
        C0589w0 c0589w1 = C0589w0.f1283m;
        EnumC0755l0 enumC0755l1 = new EnumC0755l0("PROTOCOL_ERROR", 1, 1, c0589w1);
        EnumC0755l0 enumC0755l2 = new EnumC0755l0("INTERNAL_ERROR", 2, 2, c0589w1);
        f1905u = enumC0755l2;
        f1907w = new EnumC0755l0[]{enumC0755l0, enumC0755l1, enumC0755l2, new EnumC0755l0("FLOW_CONTROL_ERROR", 3, 3, c0589w1), new EnumC0755l0("SETTINGS_TIMEOUT", 4, 4, c0589w1), new EnumC0755l0("STREAM_CLOSED", 5, 5, c0589w1), new EnumC0755l0("FRAME_SIZE_ERROR", 6, 6, c0589w1), new EnumC0755l0("REFUSED_STREAM", 7, 7, c0589w0), new EnumC0755l0("CANCEL", 8, 8, C0589w0.f1276f), new EnumC0755l0("COMPRESSION_ERROR", 9, 9, c0589w1), new EnumC0755l0("CONNECT_ERROR", 10, 10, c0589w1), new EnumC0755l0("ENHANCE_YOUR_CALM", 11, 11, C0589w0.f1281k.m1354g("Bandwidth exhausted")), new EnumC0755l0("INADEQUATE_SECURITY", 12, 12, C0589w0.f1279i.m1354g("Permission denied as protocol is not secure enough to call")), new EnumC0755l0("HTTP_1_1_REQUIRED", 13, 13, C0589w0.f1277g)};
        EnumC0755l0[] enumC0755l0ArrValues = values();
        EnumC0755l0[] enumC0755l0Arr = new EnumC0755l0[enumC0755l0ArrValues[enumC0755l0ArrValues.length - 1].f1908s + 1];
        for (EnumC0755l0 enumC0755l3 : enumC0755l0ArrValues) {
            enumC0755l0Arr[enumC0755l3.f1908s] = enumC0755l3;
        }
        f1906v = enumC0755l0Arr;
    }

    public EnumC0755l0(String str, int i2, int i3, C0589w0 c0589w0) {
        super(str, i2);
        this.f1908s = i3;
        String str2 = "HTTP/2 error code: " + name();
        this.f1909t = c0589w0.m1354g(c0589w0.f1288b != null ? AbstractC0271e0.m403k(AbstractC0271e0.m410r(str2, " ("), c0589w0.f1288b, ")") : str2);
    }

    public static EnumC0755l0 valueOf(String str) {
        return (EnumC0755l0) Enum.valueOf(EnumC0755l0.class, str);
    }

    public static EnumC0755l0[] values() {
        return (EnumC0755l0[]) f1907w.clone();
    }
}
