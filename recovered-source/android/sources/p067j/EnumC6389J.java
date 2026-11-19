package p067j;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j.J */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6389J {

    /* JADX INFO: renamed from: s */
    public static final SparseArray f24454s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC6389J[] f24455t;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6389J EF1;

    static {
        EnumC6389J enumC6389J = new EnumC6389J("MOBILE", 0);
        EnumC6389J enumC6389J2 = new EnumC6389J("WIFI", 1);
        EnumC6389J enumC6389J3 = new EnumC6389J("MOBILE_MMS", 2);
        EnumC6389J enumC6389J4 = new EnumC6389J("MOBILE_SUPL", 3);
        EnumC6389J enumC6389J5 = new EnumC6389J("MOBILE_DUN", 4);
        EnumC6389J enumC6389J6 = new EnumC6389J("MOBILE_HIPRI", 5);
        EnumC6389J enumC6389J7 = new EnumC6389J("WIMAX", 6);
        EnumC6389J enumC6389J8 = new EnumC6389J("BLUETOOTH", 7);
        EnumC6389J enumC6389J9 = new EnumC6389J("DUMMY", 8);
        EnumC6389J enumC6389J10 = new EnumC6389J("ETHERNET", 9);
        EnumC6389J enumC6389J11 = new EnumC6389J("MOBILE_FOTA", 10);
        EnumC6389J enumC6389J12 = new EnumC6389J("MOBILE_IMS", 11);
        EnumC6389J enumC6389J13 = new EnumC6389J("MOBILE_CBS", 12);
        EnumC6389J enumC6389J14 = new EnumC6389J("WIFI_P2P", 13);
        EnumC6389J enumC6389J15 = new EnumC6389J("MOBILE_IA", 14);
        EnumC6389J enumC6389J16 = new EnumC6389J("MOBILE_EMERGENCY", 15);
        EnumC6389J enumC6389J17 = new EnumC6389J("PROXY", 16);
        EnumC6389J enumC6389J18 = new EnumC6389J("VPN", 17);
        EnumC6389J enumC6389J19 = new EnumC6389J("NONE", 18);
        f24455t = new EnumC6389J[]{enumC6389J, enumC6389J2, enumC6389J3, enumC6389J4, enumC6389J5, enumC6389J6, enumC6389J7, enumC6389J8, enumC6389J9, enumC6389J10, enumC6389J11, enumC6389J12, enumC6389J13, enumC6389J14, enumC6389J15, enumC6389J16, enumC6389J17, enumC6389J18, enumC6389J19};
        SparseArray sparseArray = new SparseArray();
        f24454s = sparseArray;
        sparseArray.put(0, enumC6389J);
        sparseArray.put(1, enumC6389J2);
        sparseArray.put(2, enumC6389J3);
        sparseArray.put(3, enumC6389J4);
        sparseArray.put(4, enumC6389J5);
        sparseArray.put(5, enumC6389J6);
        sparseArray.put(6, enumC6389J7);
        sparseArray.put(7, enumC6389J8);
        sparseArray.put(8, enumC6389J9);
        sparseArray.put(9, enumC6389J10);
        sparseArray.put(10, enumC6389J11);
        sparseArray.put(11, enumC6389J12);
        sparseArray.put(12, enumC6389J13);
        sparseArray.put(13, enumC6389J14);
        sparseArray.put(14, enumC6389J15);
        sparseArray.put(15, enumC6389J16);
        sparseArray.put(16, enumC6389J17);
        sparseArray.put(17, enumC6389J18);
        sparseArray.put(-1, enumC6389J19);
    }

    public static EnumC6389J valueOf(String str) {
        return (EnumC6389J) Enum.valueOf(EnumC6389J.class, str);
    }

    public static EnumC6389J[] values() {
        return (EnumC6389J[]) f24455t.clone();
    }
}
