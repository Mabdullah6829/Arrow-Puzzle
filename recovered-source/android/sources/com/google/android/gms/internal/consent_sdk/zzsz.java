package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 't' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsz {

    /* JADX INFO: renamed from: t */
    public static final zzsz f21830t;

    /* JADX INFO: renamed from: u */
    public static final zzsz f21831u;

    /* JADX INFO: renamed from: v */
    public static final zzsz f21832v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ zzsz[] f21833w;

    /* JADX INFO: renamed from: s */
    public final int f21834s;

    /* JADX INFO: Fake field, exist only in values array */
    zzsz EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzsz EF2;

    static {
        zzsz zzszVar = new zzsz("DOUBLE", 0, zzta.f21840v, 1);
        zzsz zzszVar2 = new zzsz("FLOAT", 1, zzta.f21839u, 5);
        zzta zztaVar = zzta.f21838t;
        zzsz zzszVar3 = new zzsz("INT64", 2, zztaVar, 0);
        f21830t = zzszVar3;
        zzsz zzszVar4 = new zzsz("UINT64", 3, zztaVar, 0);
        zzta zztaVar2 = zzta.f21837s;
        zzsz zzszVar5 = new zzsz("INT32", 4, zztaVar2, 0);
        zzsz zzszVar6 = new zzsz("FIXED64", 5, zztaVar, 1);
        zzsz zzszVar7 = new zzsz("FIXED32", 6, zztaVar2, 5);
        zzsz zzszVar8 = new zzsz("BOOL", 7, zzta.f21841w, 0);
        zzsz zzszVar9 = new zzsz("STRING", 8, zzta.f21842x, 2);
        f21831u = zzszVar9;
        zzta zztaVar3 = zzta.f21835A;
        zzsz zzszVar10 = new zzsz("GROUP", 9, zztaVar3, 3);
        f21832v = zzszVar10;
        f21833w = new zzsz[]{zzszVar, zzszVar2, zzszVar3, zzszVar4, zzszVar5, zzszVar6, zzszVar7, zzszVar8, zzszVar9, zzszVar10, new zzsz("MESSAGE", 10, zztaVar3, 2), new zzsz("BYTES", 11, zzta.f21843y, 2), new zzsz("UINT32", 12, zztaVar2, 0), new zzsz("ENUM", 13, zzta.f21844z, 0), new zzsz("SFIXED32", 14, zztaVar2, 5), new zzsz("SFIXED64", 15, zztaVar, 1), new zzsz("SINT32", 16, zztaVar2, 0), new zzsz("SINT64", 17, zztaVar, 0)};
    }

    public zzsz(String str, int i2, zzta zztaVar, int i3) {
        super(str, i2);
        this.f21834s = i3;
    }

    public static zzsz[] values() {
        return (zzsz[]) f21833w.clone();
    }
}
