package com.google.protobuf;

import p072l.AbstractC6468c;

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
/* JADX INFO: renamed from: com.google.protobuf.E */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6169E {

    /* JADX INFO: renamed from: t */
    public static final EnumC6169E f24063t;

    /* JADX INFO: renamed from: u */
    public static final EnumC6169E f24064u;

    /* JADX INFO: renamed from: v */
    public static final EnumC6169E[] f24065v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC6169E[] f24066w;

    /* JADX INFO: renamed from: s */
    public final int f24067s;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6169E EF0;

    static {
        EnumC6219c0 enumC6219c0 = EnumC6219c0.DOUBLE;
        EnumC6169E enumC6169E = new EnumC6169E("DOUBLE", 0, 0, 1, enumC6219c0);
        EnumC6219c0 enumC6219c1 = EnumC6219c0.FLOAT;
        EnumC6169E enumC6169E2 = new EnumC6169E("FLOAT", 1, 1, 1, enumC6219c1);
        EnumC6219c0 enumC6219c2 = EnumC6219c0.LONG;
        EnumC6169E enumC6169E3 = new EnumC6169E("INT64", 2, 2, 1, enumC6219c2);
        EnumC6169E enumC6169E4 = new EnumC6169E("UINT64", 3, 3, 1, enumC6219c2);
        EnumC6219c0 enumC6219c3 = EnumC6219c0.INT;
        EnumC6169E enumC6169E5 = new EnumC6169E("INT32", 4, 4, 1, enumC6219c3);
        EnumC6169E enumC6169E6 = new EnumC6169E("FIXED64", 5, 5, 1, enumC6219c2);
        EnumC6169E enumC6169E7 = new EnumC6169E("FIXED32", 6, 6, 1, enumC6219c3);
        EnumC6219c0 enumC6219c4 = EnumC6219c0.BOOLEAN;
        EnumC6169E enumC6169E8 = new EnumC6169E("BOOL", 7, 7, 1, enumC6219c4);
        EnumC6219c0 enumC6219c5 = EnumC6219c0.STRING;
        EnumC6169E enumC6169E9 = new EnumC6169E("STRING", 8, 8, 1, enumC6219c5);
        EnumC6219c0 enumC6219c6 = EnumC6219c0.MESSAGE;
        EnumC6169E enumC6169E10 = new EnumC6169E("MESSAGE", 9, 9, 1, enumC6219c6);
        EnumC6219c0 enumC6219c7 = EnumC6219c0.BYTE_STRING;
        EnumC6169E enumC6169E11 = new EnumC6169E("BYTES", 10, 10, 1, enumC6219c7);
        EnumC6169E enumC6169E12 = new EnumC6169E("UINT32", 11, 11, 1, enumC6219c3);
        EnumC6219c0 enumC6219c8 = EnumC6219c0.ENUM;
        EnumC6169E enumC6169E13 = new EnumC6169E("ENUM", 12, 12, 1, enumC6219c8);
        EnumC6169E enumC6169E14 = new EnumC6169E("SFIXED32", 13, 13, 1, enumC6219c3);
        EnumC6169E enumC6169E15 = new EnumC6169E("SFIXED64", 14, 14, 1, enumC6219c2);
        EnumC6169E enumC6169E16 = new EnumC6169E("SINT32", 15, 15, 1, enumC6219c3);
        EnumC6169E enumC6169E17 = new EnumC6169E("SINT64", 16, 16, 1, enumC6219c2);
        EnumC6169E enumC6169E18 = new EnumC6169E("GROUP", 17, 17, 1, enumC6219c6);
        EnumC6169E enumC6169E19 = new EnumC6169E("DOUBLE_LIST", 18, 18, 2, enumC6219c0);
        EnumC6169E enumC6169E20 = new EnumC6169E("FLOAT_LIST", 19, 19, 2, enumC6219c1);
        EnumC6169E enumC6169E21 = new EnumC6169E("INT64_LIST", 20, 20, 2, enumC6219c2);
        EnumC6169E enumC6169E22 = new EnumC6169E("UINT64_LIST", 21, 21, 2, enumC6219c2);
        EnumC6169E enumC6169E23 = new EnumC6169E("INT32_LIST", 22, 22, 2, enumC6219c3);
        EnumC6169E enumC6169E24 = new EnumC6169E("FIXED64_LIST", 23, 23, 2, enumC6219c2);
        EnumC6169E enumC6169E25 = new EnumC6169E("FIXED32_LIST", 24, 24, 2, enumC6219c3);
        EnumC6169E enumC6169E26 = new EnumC6169E("BOOL_LIST", 25, 25, 2, enumC6219c4);
        EnumC6169E enumC6169E27 = new EnumC6169E("STRING_LIST", 26, 26, 2, enumC6219c5);
        EnumC6169E enumC6169E28 = new EnumC6169E("MESSAGE_LIST", 27, 27, 2, enumC6219c6);
        EnumC6169E enumC6169E29 = new EnumC6169E("BYTES_LIST", 28, 28, 2, enumC6219c7);
        EnumC6169E enumC6169E30 = new EnumC6169E("UINT32_LIST", 29, 29, 2, enumC6219c3);
        EnumC6169E enumC6169E31 = new EnumC6169E("ENUM_LIST", 30, 30, 2, enumC6219c8);
        EnumC6169E enumC6169E32 = new EnumC6169E("SFIXED32_LIST", 31, 31, 2, enumC6219c3);
        EnumC6169E enumC6169E33 = new EnumC6169E("SFIXED64_LIST", 32, 32, 2, enumC6219c2);
        EnumC6169E enumC6169E34 = new EnumC6169E("SINT32_LIST", 33, 33, 2, enumC6219c3);
        EnumC6169E enumC6169E35 = new EnumC6169E("SINT64_LIST", 34, 34, 2, enumC6219c2);
        EnumC6169E enumC6169E36 = new EnumC6169E("DOUBLE_LIST_PACKED", 35, 35, 3, enumC6219c0);
        f24063t = enumC6169E36;
        EnumC6169E enumC6169E37 = new EnumC6169E("FLOAT_LIST_PACKED", 36, 36, 3, enumC6219c1);
        EnumC6169E enumC6169E38 = new EnumC6169E("INT64_LIST_PACKED", 37, 37, 3, enumC6219c2);
        EnumC6169E enumC6169E39 = new EnumC6169E("UINT64_LIST_PACKED", 38, 38, 3, enumC6219c2);
        EnumC6169E enumC6169E40 = new EnumC6169E("INT32_LIST_PACKED", 39, 39, 3, enumC6219c3);
        EnumC6169E enumC6169E41 = new EnumC6169E("FIXED64_LIST_PACKED", 40, 40, 3, enumC6219c2);
        EnumC6169E enumC6169E42 = new EnumC6169E("FIXED32_LIST_PACKED", 41, 41, 3, enumC6219c3);
        EnumC6169E enumC6169E43 = new EnumC6169E("BOOL_LIST_PACKED", 42, 42, 3, enumC6219c4);
        EnumC6169E enumC6169E44 = new EnumC6169E("UINT32_LIST_PACKED", 43, 43, 3, enumC6219c3);
        EnumC6169E enumC6169E45 = new EnumC6169E("ENUM_LIST_PACKED", 44, 44, 3, enumC6219c8);
        EnumC6169E enumC6169E46 = new EnumC6169E("SFIXED32_LIST_PACKED", 45, 45, 3, enumC6219c3);
        EnumC6169E enumC6169E47 = new EnumC6169E("SFIXED64_LIST_PACKED", 46, 46, 3, enumC6219c2);
        EnumC6169E enumC6169E48 = new EnumC6169E("SINT32_LIST_PACKED", 47, 47, 3, enumC6219c3);
        EnumC6169E enumC6169E49 = new EnumC6169E("SINT64_LIST_PACKED", 48, 48, 3, enumC6219c2);
        f24064u = enumC6169E49;
        f24066w = new EnumC6169E[]{enumC6169E, enumC6169E2, enumC6169E3, enumC6169E4, enumC6169E5, enumC6169E6, enumC6169E7, enumC6169E8, enumC6169E9, enumC6169E10, enumC6169E11, enumC6169E12, enumC6169E13, enumC6169E14, enumC6169E15, enumC6169E16, enumC6169E17, enumC6169E18, enumC6169E19, enumC6169E20, enumC6169E21, enumC6169E22, enumC6169E23, enumC6169E24, enumC6169E25, enumC6169E26, enumC6169E27, enumC6169E28, enumC6169E29, enumC6169E30, enumC6169E31, enumC6169E32, enumC6169E33, enumC6169E34, enumC6169E35, enumC6169E36, enumC6169E37, enumC6169E38, enumC6169E39, enumC6169E40, enumC6169E41, enumC6169E42, enumC6169E43, enumC6169E44, enumC6169E45, enumC6169E46, enumC6169E47, enumC6169E48, enumC6169E49, new EnumC6169E("GROUP_LIST", 49, 49, 2, enumC6219c6), new EnumC6169E("MAP", 50, 50, 4, EnumC6219c0.VOID)};
        EnumC6169E[] enumC6169EArrValues = values();
        f24065v = new EnumC6169E[enumC6169EArrValues.length];
        for (EnumC6169E enumC6169E50 : enumC6169EArrValues) {
            f24065v[enumC6169E50.f24067s] = enumC6169E50;
        }
    }

    public EnumC6169E(String str, int i2, int i3, int i4, EnumC6219c0 enumC6219c0) {
        super(str, i2);
        this.f24067s = i3;
        int iM12193b = AbstractC6468c.m12193b(i4);
        if (iM12193b == 1 || iM12193b == 3) {
            enumC6219c0.getClass();
        }
        if (i4 == 1) {
            enumC6219c0.ordinal();
        }
    }

    public static EnumC6169E valueOf(String str) {
        return (EnumC6169E) Enum.valueOf(EnumC6169E.class, str);
    }

    public static EnumC6169E[] values() {
        return (EnumC6169E[]) f24066w.clone();
    }
}
