package p000A0;

import p011H.AbstractC0243G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: A0.w */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0067w {

    /* JADX INFO: renamed from: s */
    public static final EnumC0067w f81s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0067w f82t;

    /* JADX INFO: renamed from: u */
    public static final EnumC0067w f83u;

    /* JADX INFO: renamed from: v */
    public static final EnumC0067w f84v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC0067w[] f85w;

    static {
        EnumC0067w enumC0067w = new EnumC0067w("DEFAULT", 0);
        f81s = enumC0067w;
        EnumC0067w enumC0067w2 = new EnumC0067w("LAZY", 1);
        f82t = enumC0067w2;
        EnumC0067w enumC0067w3 = new EnumC0067w("ATOMIC", 2);
        f83u = enumC0067w3;
        EnumC0067w enumC0067w4 = new EnumC0067w("UNDISPATCHED", 3);
        f84v = enumC0067w4;
        EnumC0067w[] enumC0067wArr = {enumC0067w, enumC0067w2, enumC0067w3, enumC0067w4};
        f85w = enumC0067wArr;
        AbstractC0243G.m373k(enumC0067wArr);
    }

    public static EnumC0067w valueOf(String str) {
        return (EnumC0067w) Enum.valueOf(EnumC0067w.class, str);
    }

    public static EnumC0067w[] values() {
        return (EnumC0067w[]) f85w.clone();
    }
}
