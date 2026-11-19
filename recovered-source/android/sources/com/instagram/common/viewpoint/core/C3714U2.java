package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.U2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3714U2 {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"i0FOsf0o9fpBvAlaEaGgnCYFRbNnwBKJ", "ZsBa2nEfyhltTo", "ZG6g5nWnUhxh", "6zjosiDwJWE47kuMvKAUCDrCWUeR8P3q", "Gh89HIHHDqfPtiuASbXLVil627eRz", "Lsbp3nhJR34oAmuvtJAouWbaxC4Ny9OM", "s0Y", "C"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-89, -39, -39, -89, -39, -88, -40, -84, -54, -58, -59, -7, -24, -19, -23, -14, -25, -23, -46, -23, -8, -5, -13, -10, -17, -88, -103, -96, 117, -66, -61, -66, -55, -66, -74, -63, -66, -49, -74, -55, -66, -60, -61, 117, -56, -55, -74, -57, -55, -70, -71, -84, -67, -60, 121, -48, -70, -52, 121, -70, -59, -53, -66, -70, -67, -46, 121, -62, -57, -62, -51, -62, -70, -59, -62, -45, -66, -67, 122, 121, -84, -60, -62, -55, -55, -62, -57, -64, -121, -90, -68, -62, 109, -79, -68, -69, 116, -63, 109, -80, -82, -71, -71, 109, -114, -62, -79, -74, -78, -69, -80, -78, -101, -78, -63, -60, -68, -65, -72, -114, -79, -64, 123, -74, -69, -74, -63, -74, -82, -71, -74, -57, -78, 117, 118, 123, 109, -96, -68, -70, -78, 109, -77, -62, -69, -80, -63, -74, -68, -69, -82, -71, -74, -63, -58, 109, -70, -82, -58, 109, -69, -68, -63, 109, -60, -68, -65, -72, 109, -67, -65, -68, -67, -78, -65, -71, -58, 123, -120, -105, -112, -58, -52, -63, -45, -56, 0, 6, -5, 13, 2, -7, -3, 9, 8, 0, 3, 1, -42, -44, -35, -44, -31, -40, -46, -3, 2, -3, 8, -3, -11, 0, -3, 14, -7, -51, -46, -51, -40, -51, -59, -48, -51, -34, -55, -116, -115, -124, -46, -45, -40, -124, -57, -59, -48, -48, -55, -56, -110, 1, -10, 8, 9, -12, 7, -6, 8, 10, 1, 9};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static C4338eB A00() {
        return new C4338eB();
    }

    public static C4337eA A01(C4490ge c4490ge) {
        return new C4337eA(c4490ge);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        ExecutorC3959Y4.A01.execute(new C4339eC(initListener, initResult));
    }

    public static void A06(C4490ge c4490ge) {
        if (AbstractC3765Ur.A0P(c4490ge) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new C3680TT(Thread.getDefaultUncaughtExceptionHandler(), c4490ge, new C4271d6());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e) {
                c4490ge.A08().ABC(A02(198, 7, 78), AbstractC3690Td.A1X, new C3691Te(e));
            }
        }
    }

    public static void A07(C4490ge c4490ge) {
        A0H(c4490ge, null, null, 3);
    }

    public static void A08(C4490ge c4490ge) {
        A0H(c4490ge, null, null, 3);
    }

    public static void A09(C4490ge c4490ge) {
        if (C3763Up.A2O(c4490ge)) {
            A0F(c4490ge, 0);
        }
        if (C3763Up.A2X(c4490ge)) {
            A0B(c4490ge);
        }
    }

    public static void A0A(C4490ge c4490ge) {
        if (C3763Up.A2P(c4490ge)) {
            String[] strArr = A03;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "XjvPwbQrSqkAxC";
            strArr2[6] = "skO";
            A0G(c4490ge, null, 3);
        }
    }

    public static void A0B(C4490ge c4490ge) {
        ExecutorC3971YG.A06.execute(new C4340eD(c4490ge));
    }

    public static void A0C(C4490ge c4490ge) {
        AbstractC3371OP.A02(c4490ge);
        C3684TX.A0C(c4490ge, new C4241cc(c4490ge), new C4390f2(), BuildConfigApi.isDebug());
        c4490ge.A0A();
        A0D(c4490ge);
    }

    public static void A0D(C4490ge c4490ge) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(c4490ge);
        String string = sharedPreferences.getString(A02(186, 12, C1137R.styleable.ConstraintSet_transitionEasing), null);
        String string2 = sharedPreferences.getString(A02(239, 11, C1137R.styleable.ConstraintSet_pathMotionArc), null);
        if (string != null && string2 != null) {
            InterfaceC3689Tc interfaceC3689TcA08 = c4490ge.A08();
            C3691Te c3691Te = new C3691Te(string2);
            String flashConfig = A02(181, 5, 63);
            interfaceC3689TcA08.ABz(flashConfig, 3701, c3691Te);
        }
    }

    public static void A0F(C4490ge c4490ge, int i2) {
        AbstractC3658T7.A01(c4490ge);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            AbstractC3832Vy.A02();
        }
        A06(c4490ge);
        AbstractC3874Wf.A00(C3763Up.A0q(c4490ge), BuildConfigApi.isDebug(), A00(), A01(c4490ge));
        C3633Si.A03(C3763Up.A04(c4490ge));
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            C4463gD.A09(new C4328e1(c4490ge));
        }
        if (i2 == 3) {
            Log.e(A02(8, 17, 99), A02(89, 89, 44));
            c4490ge.A08().ABz(A02(178, 3, 6), AbstractC3690Td.A0R, new C3691Te(A02(215, 24, 67)));
        }
        ActivityUtils.A04(c4490ge, AudienceNetworkActivity.class);
        ExecutorC3971YG.A05(c4490ge);
        C3795VL.A05(c4490ge);
        C3292N8.A01(c4490ge);
        if (C3763Up.A16(c4490ge)) {
            AbstractC3561RX.A00(c4490ge);
        }
        if (C3763Up.A1z(c4490ge)) {
            C4044ZR.A02().A90(c4490ge);
        }
    }

    public static void A0G(C4490ge c4490ge, AudienceNetworkAds.InitListener initListener, int i2) {
        AbstractC3658T7.A01(c4490ge);
        boolean z = false;
        synchronized (C3714U2.class) {
            boolean execute = A00;
            if (!execute) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z = true;
                        }
                    }
                } else {
                    A00 = true;
                    z = true;
                }
            }
        }
        if (z) {
            A0F(c4490ge, i2);
            ExecutorC3971YG.A08.execute(new C4365ed(c4490ge, initListener));
        } else {
            if (i2 != 1) {
                return;
            }
            String strA02 = A02(51, 38, 56);
            if (initListener != null) {
                A04(initListener, new C3713U1(true, strA02));
            } else {
                Log.w(A02(8, 17, 99), strA02);
            }
        }
    }

    public static void A0H(C4490ge c4490ge, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i2) {
        AbstractC3832Vy.A05(A02(205, 10, 115), A02(25, 26, 52), A02(0, 8, 82));
        C4463gD.A06();
        A0G(c4490ge, initListener, i2);
    }

    public static synchronized boolean A0I() {
        return A00;
    }
}
