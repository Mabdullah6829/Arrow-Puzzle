package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.V3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3777V3 implements AudienceNetworkExportedActivityApi {
    public static byte[] A01;
    public static String[] A02 = {"mk4JADweKGMdEipgs7lqzWCmp9MhwBVd", "7Ny", "iKbrrxCAW5LmmXQLv4pN0A2xOojW5LEh", "hTGooAwgeIivj8mmjwzyxJz5o5QVTAJv", "t2q", "TYEvFDV2ICGQhAA5rVoFfbgoEst1cigG", "6Z5Mtc9AK5a0redP3ZVrPDgigSlCVve8", "dEPXAz2Hd7rZMNq86xusU7gw49uZCQrL"};
    public final Activity A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -12, -6, 5, -8, -4, 5, -25, -10, -10, 5, -11, -8, -17, -21, -12, -6, -25, -6, -17, -11, -12, 5, -15, -21, -1, -44, -43, -45, -32, -62, -59, -32, -54, -59, -32, -52, -58, -38};
    }

    static {
        A01();
    }

    public C3777V3(Activity activity) {
        this.A00 = activity;
    }

    private void A02(int i2) {
        this.A00.setResult(i2);
        this.A00.finish();
    }

    private boolean A03(C3776V2 c3776v2) {
        String callingPackage = this.A00.getCallingPackage();
        if (callingPackage != null) {
            String callingPackage2 = c3776v2.A04;
            if (callingPackage.equals(callingPackage2)) {
                if (A02[6].charAt(24) != 'N') {
                    String[] strArr = A02;
                    strArr[3] = "K8elIBMg7jYz2h1Vp3N7ST3gxgb7rcrL";
                    strArr[2] = "atbN7xR2A34bPDsarDq1XfYhUcdmo37f";
                    return true;
                }
                String[] strArr2 = A02;
                strArr2[3] = "WL8DJ1n8qMW41xfoDndW3QEL4VTWFS4X";
                strArr2[2] = "L472DFJOuggr64sYy3SVVGT8Lyt3cNtD";
                return true;
            }
        }
        A02(12);
        if (c3776v2.A00 instanceof C4609id) {
            ((C4609id) c3776v2.A00).A0F().A0F().AHu();
        }
        if (c3776v2.A00 instanceof C4605iZ) {
            InterfaceC3216Lt interfaceC3216LtA0F = ((C4605iZ) c3776v2.A00).A0H().A0F();
            if (A02[6].charAt(24) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr3 = A02;
            strArr3[3] = "KnmB7vQIkrX7k7dgjGlnkXpo8slRCHvd";
            strArr3[2] = "L31mVvLUBUTWDHfS0xNAbfc4Adshav9b";
            interfaceC3216LtA0F.AHu();
            return false;
        }
        return false;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi
    public final void onCreate(Bundle bundle) {
        C4494gi c4494giA05 = C3579Rp.A05(this.A00, UUID.randomUUID().toString());
        if (this.A00.isTaskRoot()) {
            c4494giA05.A0F().AHm();
            A02(10);
            return;
        }
        String stringExtra = this.A00.getIntent().getStringExtra(A00(26, 13, 64));
        if (stringExtra == null) {
            c4494giA05.A0F().AHq();
            A02(11);
            return;
        }
        C3902X9 c3902x9A00 = C3902X9.A00();
        String[] strArr = A02;
        String adId = strArr[3];
        if (adId.charAt(2) == strArr[2].charAt(2)) {
            throw new RuntimeException();
        }
        A02[6] = "lksFSMsleDiju0zPRojKCtBItYjbAveN";
        C3776V2 c3776v2A04 = c3902x9A00.A04(stringExtra);
        InterfaceC3362OG interfaceC3362OG = c3776v2A04 != null ? c3776v2A04.A00 : null;
        if (c3776v2A04 != null && (interfaceC3362OG instanceof C4605iZ)) {
            boolean zA03 = A03(c3776v2A04);
            String[] strArr2 = A02;
            String adId2 = strArr2[3];
            if (adId2.charAt(2) == strArr2[2].charAt(2)) {
                throw new RuntimeException();
            }
            A02[6] = "e1bxVkSqO5M4Y9q0gpYlqAB3DYjxjVYF";
            if (!zA03) {
                return;
            }
            C4605iZ c4605iZ = (C4605iZ) interfaceC3362OG;
            c4605iZ.A0G().A01().A0J(this.A00);
            c4605iZ.A0M(this.A00.getIntent().getIntExtra(A00(0, 26, 101), -1), 0L);
        } else if (c3776v2A04 != null && (interfaceC3362OG instanceof C4609id)) {
            if (!A03(c3776v2A04)) {
                return;
            }
            C4609id c4609id = (C4609id) interfaceC3362OG;
            c4609id.A0E().A05().A0J(this.A00);
            c4609id.A0J();
        } else {
            c4494giA05.A0F().AII();
            A02(13);
            return;
        }
        this.A00.setResult(-1);
        this.A00.finish();
    }
}
