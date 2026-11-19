package p012H0;

import p011H.AbstractC0243G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H0.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0299b {

    /* JADX INFO: renamed from: s */
    public static final EnumC0299b f591s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0299b f592t;

    /* JADX INFO: renamed from: u */
    public static final EnumC0299b f593u;

    /* JADX INFO: renamed from: v */
    public static final EnumC0299b f594v;

    /* JADX INFO: renamed from: w */
    public static final EnumC0299b f595w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC0299b[] f596x;

    static {
        EnumC0299b enumC0299b = new EnumC0299b("CPU_ACQUIRED", 0);
        f591s = enumC0299b;
        EnumC0299b enumC0299b2 = new EnumC0299b("BLOCKING", 1);
        f592t = enumC0299b2;
        EnumC0299b enumC0299b3 = new EnumC0299b("PARKING", 2);
        f593u = enumC0299b3;
        EnumC0299b enumC0299b4 = new EnumC0299b("DORMANT", 3);
        f594v = enumC0299b4;
        EnumC0299b enumC0299b5 = new EnumC0299b("TERMINATED", 4);
        f595w = enumC0299b5;
        EnumC0299b[] enumC0299bArr = {enumC0299b, enumC0299b2, enumC0299b3, enumC0299b4, enumC0299b5};
        f596x = enumC0299bArr;
        AbstractC0243G.m373k(enumC0299bArr);
    }

    public static EnumC0299b valueOf(String str) {
        return (EnumC0299b) Enum.valueOf(EnumC0299b.class, str);
    }

    public static EnumC0299b[] values() {
        return (EnumC0299b[]) f596x.clone();
    }
}
