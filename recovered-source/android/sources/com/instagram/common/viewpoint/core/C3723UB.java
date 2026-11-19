package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.UB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3723UB {
    public static String A00;
    public static EnumC3922XT A01;
    public static byte[] A02;
    public static String[] A03 = {"voSC7", "XZAhka0CvCOYv4I2O5x3YaAw3CbuYBFN", "p9gqIJ2nr", "98tXqko6jTMLdbqfVFP5nvRcnbiOcAti", "T2H4NPeAA8j3XC4jkS0zz8rIAu9TBODq", "PgqQ", "DWYdqAxgZwpx5TFll0r56voildH8EXHj", "oGCSEutn0BLuvxJJ07JBH6t"};
    public static final Map<String, Integer> A04;
    public static final AtomicInteger A05;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            A03[1] = "U3LMWoXZ5NcjJWeamIlVlKUbevsxyVyN";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 91);
            i5++;
        }
    }

    public static void A05() {
        A02 = new byte[]{115, 6, 1, 23};
    }

    static {
        A05();
        A00 = null;
        A05 = new AtomicInteger(0);
        A04 = new HashMap();
    }

    public static synchronized EnumC3922XT A00(C3659T8 c3659t8) {
        if (A01 == null) {
            A01 = AbstractC3923XU.A00(c3659t8);
        }
        return A01;
    }

    public static Integer A01(String str) {
        synchronized (A04) {
            Integer num = A04.get(str);
            if (num == null) {
                return 0;
            }
            return num;
        }
    }

    public static void A06(C3659T8 c3659t8, String str, Map<String, String> params) {
        String strA03;
        if (A0A(c3659t8)) {
            strA03 = C3882Wn.A03(str);
        } else {
            strA03 = A00;
        }
        if (strA03 != null) {
            String fingerprint = A02(1, 3, 28);
            params.put(fingerprint, strA03);
        }
    }

    public static void A07(C3659T8 c3659t8, boolean z) {
        if (!A05.compareAndSet(0, 1)) {
            return;
        }
        A00(c3659t8);
        try {
            SharedPreferences sharedPreferencesA00 = AbstractC3856WN.A00(c3659t8);
            C3701To c3701To = new C3701To(c3659t8);
            String str = Build.FINGERPRINT + A02(0, 1, 19) + c3701To.A06();
            A00 = sharedPreferencesA00.getString(str, null);
            FutureTask futureTask = new FutureTask(new CallableC3722UA(c3659t8, c3701To, sharedPreferencesA00, str));
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            A05.set(0);
        }
    }

    public static void A08(C3659T8 c3659t8, boolean z, String str) {
        if (A0A(c3659t8)) {
            A09(c3659t8, z, str);
        } else {
            A07(c3659t8, z);
        }
    }

    public static void A09(C3659T8 c3659t8, boolean z, String str) {
        if (str == null) {
            str = c3659t8.getPackageName();
        }
        if (A0B(str)) {
            return;
        }
        A00(c3659t8);
        C3882Wn c3882Wn = new C3882Wn(c3659t8, str);
        try {
            c3882Wn.A06();
            FutureTask futureTask = new FutureTask(new CallableC3721U9(c3882Wn, str));
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            synchronized (A04) {
                A04.put(str, 0);
            }
        }
    }

    public static boolean A0A(C3659T8 c3659t8) {
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            boolean zA2t = C3763Up.A2t(c3659t8);
            if (A03[4].charAt(29) == 'E') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "Hubg";
            strArr[0] = "jm3dJ";
            if (!zA2t) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0B(String str) {
        synchronized (A04) {
            int status = A01(str).intValue();
            if (status != 0) {
                return true;
            }
            A04.put(str, 1);
            return false;
        }
    }
}
