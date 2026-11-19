package com.instagram.common.viewpoint.core;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.TZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3686TZ extends AbstractRunnableC3871Wc {
    public static byte[] A02;
    public static String[] A03 = {"rr4pEtDer0K6hYSMypGI4SVA4", "qv2m0fG", "2OIR1Yv9Y7RzsB5MK8fjyIRTaeFBsJy", "02JyCSWW55zn1AQ6h7F4FoBumR9MK", "PV14KCf6Ep37wllo1HHxqudNmgtveNCD", "8xcTKK5W7UNHePnVaLckl2F", "lGpL0wggi73mqN0I3cVtORcNpouSV80j", "84RqxglWV7M6OmuSAB1gnMVf4"};
    public final /* synthetic */ C3844WA A00;
    public final /* synthetic */ C3847WD A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{121, 115, 97, 124, 127, 112, 112, 123, 108, 97, 117, 123, 103, 18, 51, 124, 50, 57, 40, 43, 51, 46, 55, 124, 63, 51, 50, 50, 57, 63, 40, 53, 51, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A01.A00 = System.currentTimeMillis();
        if (AbstractC3954Xz.A00(this.A01.A05) == EnumC3953Xy.A07) {
            this.A01.A0A();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String strA00 = A00(13, 21, 62);
            this.A01.A05.A0F().A3W(C3956Y1.A01(this.A01.A01), adErrorType.getErrorCode(), strA00, adErrorType.isPublicError());
            this.A01.A0E(new C3821Vm(adErrorType, strA00));
            return;
        }
        C3700Tn.A08(this.A01.A05);
        AbstractC3625SZ.A07(this.A01.A05);
        boolean z = true;
        Map<String, String> mapA0A = this.A00.A0A(C3728UG.A00().A01(this.A01.A05, true).A7y(this.A00.A05()));
        this.A01.A03 = mapA0A;
        try {
            PackageManager packageManager = this.A01.A05.getPackageManager();
            if (packageManager != null) {
                mapA0A.put(A00(1, 12, 92), new String(Base64.encode((this.A01.A05.getPackageName() + A00(0, 1, 59) + packageManager.getInstallerPackageName(this.A01.A05.getPackageName())).getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A07() != EnumC3824Vq.A04 && this.A00.A07() != EnumC3824Vq.A06 && this.A00.A07() != EnumC3824Vq.A05 && this.A00.A07() != null) {
                z = false;
            }
            C4463gD.A02(z, this.A01.A05).AGy(this.A01.A07, new C4459g9().A05(this.A01.A03).A08(), this.A01.A03(C3956Y1.A00(), this.A00));
        } catch (Exception e) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e.getMessage();
            this.A01.A05.A0F().A3W(C3956Y1.A01(this.A01.A01), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            C3847WD c3847wd = this.A01;
            C3821Vm c3821VmA01 = C3821Vm.A01(adErrorType2, message);
            if (A03[3].length() != 29) {
                throw new RuntimeException();
            }
            A03[3] = "TysUXKeFt8WChM0CalDFmuBH7ELd8";
            c3847wd.A0E(c3821VmA01);
        }
    }

    static {
        A01();
    }

    public C3686TZ(C3847WD c3847wd, C3844WA c3844wa) {
        this.A01 = c3847wd;
        this.A00 = c3844wa;
    }
}
