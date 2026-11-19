package com.google.android.gms.internal.ads;

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
/* JADX INFO: loaded from: classes2.dex */
public final class zzihq {

    /* JADX INFO: renamed from: u */
    public static final zzihq f19911u;

    /* JADX INFO: renamed from: v */
    public static final zzihq f19912v;

    /* JADX INFO: renamed from: w */
    public static final zzihq f19913w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ zzihq[] f19914x;

    /* JADX INFO: renamed from: s */
    public final zzihr f19915s;

    /* JADX INFO: renamed from: t */
    public final int f19916t;

    /* JADX INFO: Fake field, exist only in values array */
    zzihq EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzihq EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zzihq EF0;

    static {
        zzihq zzihqVar = new zzihq("DOUBLE", 0, zzihr.f19922v, 1);
        zzihq zzihqVar2 = new zzihq("FLOAT", 1, zzihr.f19921u, 5);
        zzihr zzihrVar = zzihr.f19920t;
        zzihq zzihqVar3 = new zzihq("INT64", 2, zzihrVar, 0);
        zzihq zzihqVar4 = new zzihq("UINT64", 3, zzihrVar, 0);
        zzihr zzihrVar2 = zzihr.f19919s;
        zzihq zzihqVar5 = new zzihq("INT32", 4, zzihrVar2, 0);
        zzihq zzihqVar6 = new zzihq("FIXED64", 5, zzihrVar, 1);
        zzihq zzihqVar7 = new zzihq("FIXED32", 6, zzihrVar2, 5);
        zzihq zzihqVar8 = new zzihq("BOOL", 7, zzihr.f19923w, 0);
        zzihq zzihqVar9 = new zzihq("STRING", 8, zzihr.f19924x, 2);
        f19911u = zzihqVar9;
        zzihr zzihrVar3 = zzihr.f19917A;
        zzihq zzihqVar10 = new zzihq("GROUP", 9, zzihrVar3, 3);
        f19912v = zzihqVar10;
        zzihq zzihqVar11 = new zzihq("MESSAGE", 10, zzihrVar3, 2);
        f19913w = zzihqVar11;
        f19914x = new zzihq[]{zzihqVar, zzihqVar2, zzihqVar3, zzihqVar4, zzihqVar5, zzihqVar6, zzihqVar7, zzihqVar8, zzihqVar9, zzihqVar10, zzihqVar11, new zzihq("BYTES", 11, zzihr.f19925y, 2), new zzihq("UINT32", 12, zzihrVar2, 0), new zzihq("ENUM", 13, zzihr.f19926z, 0), new zzihq("SFIXED32", 14, zzihrVar2, 5), new zzihq("SFIXED64", 15, zzihrVar, 1), new zzihq("SINT32", 16, zzihrVar2, 0), new zzihq("SINT64", 17, zzihrVar, 0)};
    }

    public zzihq(String str, int i2, zzihr zzihrVar, int i3) {
        super(str, i2);
        this.f19915s = zzihrVar;
        this.f19916t = i3;
    }

    public static zzihq[] values() {
        return (zzihq[]) f19914x.clone();
    }
}
