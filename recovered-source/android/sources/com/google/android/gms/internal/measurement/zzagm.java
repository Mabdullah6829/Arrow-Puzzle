package com.google.android.gms.internal.measurement;

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
public final class zzagm {

    /* JADX INFO: renamed from: u */
    public static final zzagm f22134u;

    /* JADX INFO: renamed from: v */
    public static final zzagm f22135v;

    /* JADX INFO: renamed from: w */
    public static final zzagm f22136w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ zzagm[] f22137x;

    /* JADX INFO: renamed from: s */
    public final zzagn f22138s;

    /* JADX INFO: renamed from: t */
    public final int f22139t;

    /* JADX INFO: Fake field, exist only in values array */
    zzagm EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzagm EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zzagm EF0;

    static {
        zzagm zzagmVar = new zzagm("DOUBLE", 0, zzagn.f22145v, 1);
        zzagm zzagmVar2 = new zzagm("FLOAT", 1, zzagn.f22144u, 5);
        zzagn zzagnVar = zzagn.f22143t;
        zzagm zzagmVar3 = new zzagm("INT64", 2, zzagnVar, 0);
        zzagm zzagmVar4 = new zzagm("UINT64", 3, zzagnVar, 0);
        zzagn zzagnVar2 = zzagn.f22142s;
        zzagm zzagmVar5 = new zzagm("INT32", 4, zzagnVar2, 0);
        zzagm zzagmVar6 = new zzagm("FIXED64", 5, zzagnVar, 1);
        zzagm zzagmVar7 = new zzagm("FIXED32", 6, zzagnVar2, 5);
        zzagm zzagmVar8 = new zzagm("BOOL", 7, zzagn.f22146w, 0);
        zzagm zzagmVar9 = new zzagm("STRING", 8, zzagn.f22147x, 2);
        f22134u = zzagmVar9;
        zzagn zzagnVar3 = zzagn.f22140A;
        zzagm zzagmVar10 = new zzagm("GROUP", 9, zzagnVar3, 3);
        f22135v = zzagmVar10;
        zzagm zzagmVar11 = new zzagm("MESSAGE", 10, zzagnVar3, 2);
        f22136w = zzagmVar11;
        f22137x = new zzagm[]{zzagmVar, zzagmVar2, zzagmVar3, zzagmVar4, zzagmVar5, zzagmVar6, zzagmVar7, zzagmVar8, zzagmVar9, zzagmVar10, zzagmVar11, new zzagm("BYTES", 11, zzagn.f22148y, 2), new zzagm("UINT32", 12, zzagnVar2, 0), new zzagm("ENUM", 13, zzagn.f22149z, 0), new zzagm("SFIXED32", 14, zzagnVar2, 5), new zzagm("SFIXED64", 15, zzagnVar, 1), new zzagm("SINT32", 16, zzagnVar2, 0), new zzagm("SINT64", 17, zzagnVar, 0)};
    }

    public zzagm(String str, int i2, zzagn zzagnVar, int i3) {
        super(str, i2);
        this.f22138s = zzagnVar;
        this.f22139t = i3;
    }

    public static zzagm[] values() {
        return (zzagm[]) f22137x.clone();
    }
}
