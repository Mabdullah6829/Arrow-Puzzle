package p067j;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j.I */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6388I {

    /* JADX INFO: renamed from: s */
    public static final SparseArray f24452s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC6388I[] f24453t;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6388I EF1;

    static {
        EnumC6388I enumC6388I = new EnumC6388I("UNKNOWN_MOBILE_SUBTYPE", 0);
        EnumC6388I enumC6388I2 = new EnumC6388I("GPRS", 1);
        EnumC6388I enumC6388I3 = new EnumC6388I("EDGE", 2);
        EnumC6388I enumC6388I4 = new EnumC6388I("UMTS", 3);
        EnumC6388I enumC6388I5 = new EnumC6388I("CDMA", 4);
        EnumC6388I enumC6388I6 = new EnumC6388I("EVDO_0", 5);
        EnumC6388I enumC6388I7 = new EnumC6388I("EVDO_A", 6);
        EnumC6388I enumC6388I8 = new EnumC6388I("RTT", 7);
        EnumC6388I enumC6388I9 = new EnumC6388I("HSDPA", 8);
        EnumC6388I enumC6388I10 = new EnumC6388I("HSUPA", 9);
        EnumC6388I enumC6388I11 = new EnumC6388I("HSPA", 10);
        EnumC6388I enumC6388I12 = new EnumC6388I("IDEN", 11);
        EnumC6388I enumC6388I13 = new EnumC6388I("EVDO_B", 12);
        EnumC6388I enumC6388I14 = new EnumC6388I("LTE", 13);
        EnumC6388I enumC6388I15 = new EnumC6388I("EHRPD", 14);
        EnumC6388I enumC6388I16 = new EnumC6388I("HSPAP", 15);
        EnumC6388I enumC6388I17 = new EnumC6388I("GSM", 16);
        EnumC6388I enumC6388I18 = new EnumC6388I("TD_SCDMA", 17);
        EnumC6388I enumC6388I19 = new EnumC6388I("IWLAN", 18);
        EnumC6388I enumC6388I20 = new EnumC6388I("LTE_CA", 19);
        f24453t = new EnumC6388I[]{enumC6388I, enumC6388I2, enumC6388I3, enumC6388I4, enumC6388I5, enumC6388I6, enumC6388I7, enumC6388I8, enumC6388I9, enumC6388I10, enumC6388I11, enumC6388I12, enumC6388I13, enumC6388I14, enumC6388I15, enumC6388I16, enumC6388I17, enumC6388I18, enumC6388I19, enumC6388I20, new EnumC6388I("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f24452s = sparseArray;
        sparseArray.put(0, enumC6388I);
        sparseArray.put(1, enumC6388I2);
        sparseArray.put(2, enumC6388I3);
        sparseArray.put(3, enumC6388I4);
        sparseArray.put(4, enumC6388I5);
        sparseArray.put(5, enumC6388I6);
        sparseArray.put(6, enumC6388I7);
        sparseArray.put(7, enumC6388I8);
        sparseArray.put(8, enumC6388I9);
        sparseArray.put(9, enumC6388I10);
        sparseArray.put(10, enumC6388I11);
        sparseArray.put(11, enumC6388I12);
        sparseArray.put(12, enumC6388I13);
        sparseArray.put(13, enumC6388I14);
        sparseArray.put(14, enumC6388I15);
        sparseArray.put(15, enumC6388I16);
        sparseArray.put(16, enumC6388I17);
        sparseArray.put(17, enumC6388I18);
        sparseArray.put(18, enumC6388I19);
        sparseArray.put(19, enumC6388I20);
    }

    public static EnumC6388I valueOf(String str) {
        return (EnumC6388I) Enum.valueOf(EnumC6388I.class, str);
    }

    public static EnumC6388I[] values() {
        return (EnumC6388I[]) f24453t.clone();
    }
}
