package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebSettings;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.UJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3731UJ {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"qZcb6NmBns1n3v1", "rTLETUx3xNnjwSb02Sx6jVZM5Fuzg7Of", "ujF8Yx1ooHYTWOANWsLoHgp9GHsWq5OG", "emoc9RIZRY17k1iV3jHEmbNdIKvpuqWe", "9dj0hHqqeHaqkXambHAPXjsskYxWzSoy", "H6Wp9lsP8ocDK9Bk7hE2Cfl7XjXVKK5i", "baRwZ59Bd0PN8tFBdjuxnLHZSOlJTNRT", "2xLvEFwTfIQTf34sGOrn6donSx3FaGAc"};
    public static final AtomicReference<String> A03;
    public static final AtomicBoolean A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{-56, 3, -18, -22, -23, -10, -41, -23, 29, 12, 17, 13, 22, 11, 13, -10, 13, 28, 31, 23, 26, 19, -18, 23, 26, -23, 22, 12, 26, 23, 17, 12, -29, -18, -22, -5, -10, -41, 6, -18, -7, -11, -12, 9, -30, -18, -7, -11, -11, 9, -30, -71, -60, -64, -54, -63, -83, -53, -42, -46, -29, -26, -65, -63, -67, -68, -67, -86, -55, -59, -39, -42, -78, 64, 57, 79, 62, 69, 60, 60, 54, 79, 76, 79, 80, 88, 79, -9, 57, 69, 67, 4, 60, 55, 57, 59, 56, 69, 69, 65, 4, 55, 58, 73, 4, 63, 68, 74, 59, 72, 68, 55, 66, 4, 75, 55, 52, 50, 59, 50, 63, 54, 48, 25, 37, 37, 33, -33, 18, 24, 22, 31, 37, 31, 29, 15, 28, 9, 11, 17, 15, 24, 30, -20, -22, -36, -23, -42, -40, -34, -36, -27, -21, -42, -29, -40, -22, -21, -42, -23, -36, -35, -23, -36, -22, -33, 59, 41, 38, 35, 58, 45, 41, 59};
    }

    static {
        A07();
        A00 = A00(80, 7, 107);
        A04 = new AtomicBoolean();
        A03 = new AtomicReference<>();
    }

    public static String A01(C3659T8 c3659t8) {
        return WebSettings.getDefaultUserAgent(c3659t8);
    }

    public static String A02(C3659T8 c3659t8) {
        FutureTask futureTask = new FutureTask(new CallableC3730UI(c3659t8));
        for (int i2 = 0; i2 < 3; i2++) {
            ExecutorC3959Y4.A00(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable th) {
                A08(c3659t8, th);
                SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static String A03(C3659T8 c3659t8, C3701To c3701To) {
        String strA07 = c3701To.A07();
        if (TextUtils.isEmpty(strA07) && !A04.getAndSet(true)) {
            InterfaceC3689Tc interfaceC3689TcA08 = c3659t8.A08();
            int i2 = AbstractC3690Td.A1Z;
            String bundle = A00(73, 7, C1137R.styleable.ConstraintSet_transitionPathRotate);
            C3691Te c3691Te = new C3691Te(bundle);
            String bundle2 = A00(C1137R.styleable.ConstraintSet_pathMotionArc, 7, 87);
            interfaceC3689TcA08.ABC(bundle2, i2, c3691Te);
        }
        return strA07;
    }

    public static String A04(C3659T8 c3659t8, boolean z) {
        if (c3659t8 == null) {
            return A00;
        }
        if (z) {
            return System.getProperty(A00(123, 10, 59));
        }
        String str = A03.get();
        if (str != null) {
            return str;
        }
        long spUserAgentRefresh = AbstractC3762Uo.A01(c3659t8);
        String strA00 = A00(143, 23, 1);
        String strA01 = A00(133, 10, 52);
        String strA02 = A00(88, 28, 96);
        if (spUserAgentRefresh > 0) {
            SharedPreferences sharedPreferences = c3659t8.getSharedPreferences(ProcessUtils.getProcessSpecificName(strA02, c3659t8), 0);
            String string = sharedPreferences.getString(strA01, null);
            long j2 = sharedPreferences.getLong(strA00, 0L);
            if (!TextUtils.isEmpty(string) && System.currentTimeMillis() - j2 < spUserAgentRefresh) {
                A03.set(string);
                String[] strArr = A02;
                String str2 = strArr[6];
                String browserUserAgent = strArr[3];
                if (str2.charAt(17) != browserUserAgent.charAt(17)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[6] = "raDju45r7vWAWvtCMjs7ezmbeHuUzRMZ";
                strArr2[3] = "IEXEfOXuBGyf1jRfSjx88B0PyUJh9Pa6";
                return string;
            }
        }
        String strA03 = null;
        try {
            strA03 = A01(c3659t8);
            A03.set(strA03);
        } catch (Throwable t) {
            A08(c3659t8, t);
        }
        if (strA03 == null) {
            strA03 = A02(c3659t8);
        }
        if (strA03 == null) {
            return A00;
        }
        if (spUserAgentRefresh > 0) {
            SharedPreferences sharedPreferences2 = c3659t8.getSharedPreferences(ProcessUtils.getProcessSpecificName(strA02, c3659t8), 0);
            sharedPreferences2.edit().putString(strA01, A03.get()).apply();
            sharedPreferences2.edit().putLong(strA00, System.currentTimeMillis()).apply();
        }
        return strA03;
    }

    public static String A05(C3701To c3701To, C3659T8 c3659t8) {
        if (AbstractC3762Uo.A04(c3659t8)) {
            return A00(63, 5, 5) + A03(c3659t8, c3701To) + A00(39, 6, 61) + c3701To.A06() + A00(45, 6, 61) + c3701To.A04() + A00(38, 1, 85);
        }
        return A00(0, 0, 76);
    }

    public static String A06(C3701To c3701To, C3659T8 c3659t8, boolean z) {
        return A04(c3659t8, z) + A00(0, 38, 50) + c3659t8.A05().A9S() + A00(57, 6, 26) + C3701To.A04 + A00(38, 1, 85) + A05(c3701To, c3659t8) + A00(68, 5, 13) + c3659t8.A05().A9T() + A00(51, 6, 8) + Locale.getDefault().toString() + A00(87, 1, 36);
    }

    public static void A08(C3659T8 c3659t8, Throwable th) {
        c3659t8.A08().ABC(A00(166, 8, 78), AbstractC3690Td.A2i, new C3691Te(th));
    }
}
