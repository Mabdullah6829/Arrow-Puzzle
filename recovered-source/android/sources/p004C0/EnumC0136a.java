package p004C0;

import p011H.AbstractC0243G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: C0.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0136a {

    /* JADX INFO: renamed from: s */
    public static final EnumC0136a f215s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0136a f216t;

    /* JADX INFO: renamed from: u */
    public static final EnumC0136a f217u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ EnumC0136a[] f218v;

    static {
        EnumC0136a enumC0136a = new EnumC0136a("SUSPEND", 0);
        f215s = enumC0136a;
        EnumC0136a enumC0136a2 = new EnumC0136a("DROP_OLDEST", 1);
        f216t = enumC0136a2;
        EnumC0136a enumC0136a3 = new EnumC0136a("DROP_LATEST", 2);
        f217u = enumC0136a3;
        EnumC0136a[] enumC0136aArr = {enumC0136a, enumC0136a2, enumC0136a3};
        f218v = enumC0136aArr;
        AbstractC0243G.m373k(enumC0136aArr);
    }

    public static EnumC0136a valueOf(String str) {
        return (EnumC0136a) Enum.valueOf(EnumC0136a.class, str);
    }

    public static EnumC0136a[] values() {
        return (EnumC0136a[]) f218v.clone();
    }
}
