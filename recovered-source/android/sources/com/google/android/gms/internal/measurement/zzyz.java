package com.google.android.gms.internal.measurement;

import p011H.AbstractC0271e0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF3' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class zzyz {

    /* JADX INFO: renamed from: w */
    public static final zzyz f23122w;

    /* JADX INFO: renamed from: x */
    public static final zzyz[] f23123x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ zzyz[] f23124y;

    /* JADX INFO: renamed from: s */
    public final char f23125s;

    /* JADX INFO: renamed from: t */
    public final zzzb f23126t;

    /* JADX INFO: renamed from: u */
    public final int f23127u;

    /* JADX INFO: renamed from: v */
    public final String f23128v;

    /* JADX INFO: Fake field, exist only in values array */
    zzyz EF0;

    /* JADX INFO: Fake field, exist only in values array */
    zzyz EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzyz EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zzyz EF3;

    static {
        zzyz zzyzVar = new zzyz("STRING", 0, 's', zzzb.GENERAL, "-#", true);
        zzyz zzyzVar2 = new zzyz("BOOLEAN", 1, 'b', zzzb.BOOLEAN, "-", true);
        zzyz zzyzVar3 = new zzyz("CHAR", 2, 'c', zzzb.CHARACTER, "-", true);
        zzzb zzzbVar = zzzb.INTEGRAL;
        zzyz zzyzVar4 = new zzyz("DECIMAL", 3, 'd', zzzbVar, "-0+ ,(", false);
        zzyz zzyzVar5 = new zzyz("OCTAL", 4, 'o', zzzbVar, "-#0(", false);
        zzyz zzyzVar6 = new zzyz("HEX", 5, 'x', zzzbVar, "-#0(", true);
        f23122w = zzyzVar6;
        zzzb zzzbVar2 = zzzb.FLOAT;
        f23124y = new zzyz[]{zzyzVar, zzyzVar2, zzyzVar3, zzyzVar4, zzyzVar5, zzyzVar6, new zzyz("FLOAT", 6, 'f', zzzbVar2, "-#0+ ,(", false), new zzyz("EXPONENT", 7, 'e', zzzbVar2, "-#0+ (", true), new zzyz("GENERAL", 8, 'g', zzzbVar2, "-0+ ,(", true), new zzyz("EXPONENT_HEX", 9, 'a', zzzbVar2, "-#0+ ", true)};
        f23123x = new zzyz[26];
        for (zzyz zzyzVar7 : values()) {
            f23123x[(zzyzVar7.f23125s | ' ') - 97] = zzyzVar7;
        }
    }

    public zzyz(String str, int i2, char c, zzzb zzzbVar, String str2, boolean z) {
        super(str, i2);
        this.f23125s = c;
        this.f23126t = zzzbVar;
        zzza zzzaVar = zzza.f23132e;
        int i3 = true != z ? 0 : 128;
        for (int i4 = 0; i4 < str2.length(); i4++) {
            int iCharAt = ((int) ((zzza.f23131d >>> ((str2.charAt(i4) - ' ') * 3)) & 7)) - 1;
            if (iCharAt < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str2));
            }
            i3 |= 1 << iCharAt;
        }
        this.f23127u = i3;
        this.f23128v = AbstractC0271e0.m401i(new StringBuilder(String.valueOf(c).length() + 1), "%", c);
    }

    public static zzyz[] values() {
        return (zzyz[]) f23124y.clone();
    }
}
