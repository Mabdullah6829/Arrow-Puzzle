package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.protobuf.l1 */
/* JADX INFO: loaded from: classes.dex */
public class EnumC6247l1 {

    /* JADX INFO: renamed from: u */
    public static final C6235h1 f24199u;

    /* JADX INFO: renamed from: v */
    public static final C6238i1 f24200v;

    /* JADX INFO: renamed from: w */
    public static final C6241j1 f24201w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC6247l1[] f24202x;

    /* JADX INFO: renamed from: s */
    public final EnumC6250m1 f24203s;

    /* JADX INFO: renamed from: t */
    public final int f24204t;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6247l1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6247l1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6247l1 EF2;

    static {
        EnumC6247l1 enumC6247l1 = new EnumC6247l1("DOUBLE", 0, EnumC6250m1.DOUBLE, 1);
        EnumC6247l1 enumC6247l2 = new EnumC6247l1("FLOAT", 1, EnumC6250m1.FLOAT, 5);
        EnumC6250m1 enumC6250m1 = EnumC6250m1.LONG;
        EnumC6247l1 enumC6247l3 = new EnumC6247l1("INT64", 2, enumC6250m1, 0);
        EnumC6247l1 enumC6247l4 = new EnumC6247l1("UINT64", 3, enumC6250m1, 0);
        EnumC6250m1 enumC6250m2 = EnumC6250m1.INT;
        EnumC6247l1 enumC6247l5 = new EnumC6247l1("INT32", 4, enumC6250m2, 0);
        EnumC6247l1 enumC6247l6 = new EnumC6247l1("FIXED64", 5, enumC6250m1, 1);
        EnumC6247l1 enumC6247l7 = new EnumC6247l1("FIXED32", 6, enumC6250m2, 5);
        EnumC6247l1 enumC6247l8 = new EnumC6247l1("BOOL", 7, EnumC6250m1.BOOLEAN, 0);
        C6235h1 c6235h1 = new C6235h1("STRING", 8, EnumC6250m1.STRING, 2);
        f24199u = c6235h1;
        EnumC6250m1 enumC6250m3 = EnumC6250m1.MESSAGE;
        C6238i1 c6238i1 = new C6238i1("GROUP", 9, enumC6250m3, 3);
        f24200v = c6238i1;
        C6241j1 c6241j1 = new C6241j1("MESSAGE", 10, enumC6250m3, 2);
        f24201w = c6241j1;
        f24202x = new EnumC6247l1[]{enumC6247l1, enumC6247l2, enumC6247l3, enumC6247l4, enumC6247l5, enumC6247l6, enumC6247l7, enumC6247l8, c6235h1, c6238i1, c6241j1, new C6244k1("BYTES", 11, EnumC6250m1.BYTE_STRING, 2), new EnumC6247l1("UINT32", 12, enumC6250m2, 0), new EnumC6247l1("ENUM", 13, EnumC6250m1.ENUM, 0), new EnumC6247l1("SFIXED32", 14, enumC6250m2, 5), new EnumC6247l1("SFIXED64", 15, enumC6250m1, 1), new EnumC6247l1("SINT32", 16, enumC6250m2, 0), new EnumC6247l1("SINT64", 17, enumC6250m1, 0)};
    }

    public EnumC6247l1(String str, int i2, EnumC6250m1 enumC6250m1, int i3) {
        super(str, i2);
        this.f24203s = enumC6250m1;
        this.f24204t = i3;
    }

    public static EnumC6247l1 valueOf(String str) {
        return (EnumC6247l1) Enum.valueOf(EnumC6247l1.class, str);
    }

    public static EnumC6247l1[] values() {
        return (EnumC6247l1[]) f24202x.clone();
    }
}
