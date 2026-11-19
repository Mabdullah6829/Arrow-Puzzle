package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.WD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3847WD {
    public static byte[] A08;
    public static String[] A09 = {"gkSyaXwR", "2VU3Nz3voiV1lmdRee4U2QJOpqB0EmXx", "l2PJ1mhNLKomP6h8XAPCJTvwOfm7DNfm", "U14uMoZpedA5MoqMp8wF", "ZGFJtzG5houIZuhA5wVIi53yZAjLLlX2", "TKuU0S0TRmpOZ7a0gUh222TH0KiJMCsX", "Ntgwe7QRVjptK5Vt0gMbvLxTukJluaCr", "4nIPbhAhAn1Dg8Q4wgXTfE5Yoh5xfpBP"};
    public static final ThreadFactoryC3969YE A0A;
    public static final Executor A0B;
    public static final AtomicReference<InterfaceC3851WH> A0C;
    public long A00;
    public long A01;
    public InterfaceC3846WC A02;
    public Map<String, String> A03;
    public final C3388Og A04;
    public final C4494gi A05;
    public final C3848WE A06;
    public final String A07;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A08 = new byte[]{113, 107, -97, 108, 106, 111, -96, 112, -32, -15, -17, -21, -19, -25, -16, -19, -23, -14, -8, 3, -10, -23, -11, -7, -23, -9, -8, 3, -19, -24, -126, -84, 89, -117, -121, 115, 89, -62, -61, -108, -70, -67, -64, -64, -108, -26, -39, -41, -39, -35, -22, -39, -40, -39, -6, -85, -47, -12, -9, -9, -85, -16, -3, -3, -6, -3, -85, -18, -6, -17, -16, -85, -26, -80, -2, -24, -85, -80, -2, -33, -35, -26, -35, -22, -31, -37, -57, -66, -51, -48, -56, -53, -60, 10, 11, -30, 5, 8, 8, -28, 11, 11, 7, -35, -33, -36, -29, -42, -47, -46};
    }

    static {
        A0B();
        A0A = new ThreadFactoryC3969YE();
        A0B = Executors.newCachedThreadPool(A0A);
        A0C = new AtomicReference<>();
    }

    public C3847WD(C4494gi c4494gi) {
        this(c4494gi, AbstractC3389Oh.A00(c4494gi.A02()));
    }

    public C3847WD(C4494gi c4494gi, C3388Og c3388Og) {
        this.A01 = -1L;
        this.A00 = -1L;
        this.A05 = c4494gi;
        this.A06 = C3848WE.A00();
        this.A07 = AbstractC3852WI.A01(c4494gi);
        this.A04 = c3388Og;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3636Sl A03(long j2, C3844WA c3844wa) {
        return new C3636Sl(this, c3844wa, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        if (this.A05 == null || !C4463gD.A0A(this.A05)) {
            return;
        }
        C3691Te c3691Te = new C3691Te(A06(8, 5, 102));
        c3691Te.A05(1);
        this.A05.A08().ABC(A06(86, 7, 32), AbstractC3690Td.A1x, c3691Te);
    }

    private void A0C(int i2, String str) {
        String strA06 = A06(37, 16, 59);
        String strA07 = A06(0, 8, 1);
        String strA08 = A06(93, 10, 99);
        AbstractC3832Vy.A05(strA08, strA06, strA07);
        AbstractC3832Vy.A04(strA08, String.format(Locale.US, A06(53, 26, 82), Integer.valueOf(i2), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C3821Vm c3821Vm) {
        if (this.A02 != null) {
            this.A02.ADp(c3821Vm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C3821Vm c3821Vm) {
        ExecutorC3959Y4.A00(new C3552RO(this, c3821Vm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(C3544RG c3544rg) {
        if (this.A02 != null) {
            this.A02.AG7(c3544rg);
        } else {
            if (c3544rg.A00() == null || c3544rg.A00().A06() == null) {
                return;
            }
            C3880Wl.A00(this.A05).A0D(c3544rg.A00().A06().toString(), c3544rg.A00().A0B());
        }
    }

    private void A0M(C3544RG c3544rg) {
        InterfaceC3665TE syncModule;
        ExecutorC3959Y4.A00(new C3614SO(this, c3544rg));
        if (C3763Up.A2e(this.A05) && (syncModule = this.A05.A06()) != null) {
            syncModule.A6d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j2, C3844WA c3844wa) {
        String clientChallenge;
        try {
            try {
                C3850WG c3850wgA07 = this.A06.A07(this.A05, str, j2);
                C3709Tw c3709TwA00 = c3850wgA07.A00();
                if (c3709TwA00 != null) {
                    C3763Up.A0V(this.A05).A36(c3709TwA00.A0A());
                    if (C3763Up.A0x(this.A05) && c3709TwA00.A08() != null) {
                        AbstractC3718U6.A04(this.A05.A02(), c3709TwA00.A08());
                    }
                    if (C3763Up.A0y(this.A05) && c3709TwA00.A0D() != null) {
                        AbstractC3718U6.A05(this.A05.A02(), c3709TwA00.A0D());
                    }
                    this.A05.A08().ACP();
                    this.A04.A0N(c3709TwA00.A07());
                    AbstractC3843W9.A05(c3709TwA00.A05().A0B(), c3844wa);
                    C3983YS.A01(this.A05, A0B, c3709TwA00);
                    C3691Te c3691Te = new C3691Te(A06(30, 7, 0) + C3927XY.A02());
                    c3691Te.A06(1);
                    c3691Te.A0A(false);
                    this.A05.A08().ACA(A06(79, 7, 63), AbstractC3690Td.A1W, c3691Te);
                }
                switch (c3850wgA07.A01()) {
                    case A02:
                        C3544RG c3544rg = (C3544RG) c3850wgA07;
                        if (c3709TwA00 != null) {
                            if (c3709TwA00.A05().A0E()) {
                                AbstractC3843W9.A07(str, c3844wa);
                            }
                            if (this.A03 != null) {
                                clientChallenge = this.A03.get(A06(13, 17, 107));
                            } else {
                                clientChallenge = null;
                            }
                            if (!TextUtils.isEmpty(c3850wgA07.A02()) && !TextUtils.isEmpty(clientChallenge)) {
                                this.A05.A03().AIi(this.A05, clientChallenge, c3850wgA07.A02());
                            }
                        }
                        this.A05.A0F().A3X(C3956Y1.A01(this.A01), C3956Y1.A02(this.A01, this.A00));
                        A0M(c3544rg);
                        return;
                    case A03:
                        C3532R4 c3532r4 = (C3532R4) c3850wgA07;
                        String strA04 = c3532r4.A04();
                        AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c3532r4.A03(), AdErrorType.ERROR_MESSAGE);
                        A0C(c3532r4.A03(), strA04);
                        if (strA04 == null) {
                            strA04 = str;
                        }
                        this.A05.A0F().A3W(C3956Y1.A01(this.A01), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA04, adErrorTypeAdErrorTypeFromCode.isPublicError());
                        A0E(C3821Vm.A01(adErrorTypeAdErrorTypeFromCode, strA04));
                        return;
                    default:
                        AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                        this.A05.A0F().A3W(C3956Y1.A01(this.A01), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                        A0E(C3821Vm.A01(adErrorType, str));
                        return;
                }
            } catch (Exception e) {
                e = e;
                String message = e.getMessage();
                AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
                C4494gi c4494gi = this.A05;
                if (A09[0].length() == 29) {
                    throw new RuntimeException();
                }
                A09[0] = "STn1t4NLUPoQ";
                c4494gi.A0F().A3W(C3956Y1.A01(this.A01), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
                A0E(C3821Vm.A01(adErrorType2, message));
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(String str, long j2, C3844WA c3844wa) {
        A0B.execute(new C3642Sr(this, str, j2, c3844wa));
    }

    private boolean A0P(C3844WA c3844wa) {
        String string = c3844wa.A06().toString();
        if (C3880Wl.A00(this.A05).A0F(string)) {
            return false;
        }
        int iA0A = C3880Wl.A00(this.A05).A0A(string);
        int storedAdsCount = C3763Up.A0J(this.A05);
        int iA09 = C3880Wl.A00(this.A05).A09(string);
        if (iA0A >= storedAdsCount || iA0A > iA09) {
            C3880Wl c3880WlA00 = C3880Wl.A00(this.A05);
            String type = c3844wa.A06().toString();
            Pair<String, String> pairA0B = c3880WlA00.A0B(type);
            if (pairA0B != null) {
                Object obj = pairA0B.second;
                String[] strArr = A09;
                String str = strArr[1];
                String str2 = strArr[4];
                int storedAdsCount2 = str.charAt(27);
                if (storedAdsCount2 == str2.charAt(27)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A09;
                strArr2[5] = "wxWvHA1chxzz72CPhzVDSI5kTKVxH7gh";
                strArr2[2] = "qa9WwGn6xu1bvFfukLGFlV7cMdAOaohF";
                if (obj != null && pairA0B.first != null) {
                    A0O(pairA0B.second.toString(), 0L, c3844wa);
                    return true;
                }
            }
        }
        return false;
    }

    public final void A0Q(C3844WA c3844wa) {
        this.A01 = System.currentTimeMillis();
        C3700Tn.A0B(this.A05);
        A0C.get();
        if (0 != 0) {
            throw new NullPointerException(A06(103, 7, 52));
        }
        if (C3763Up.A02(this.A05) > 0 && A0P(c3844wa)) {
            return;
        }
        if (AbstractC3843W9.A08(c3844wa)) {
            ExecutorC3971YG.A06.execute(new C3693Tg(this));
            String strA02 = AbstractC3843W9.A02(c3844wa);
            if (strA02 != null) {
                this.A05.A0F().AKg();
                A0O(strA02, 0L, c3844wa);
                return;
            } else {
                AdErrorType error = AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A05.A0F().A3W(C3956Y1.A01(this.A01), error.getErrorCode(), error.getDefaultErrorMessage(), error.isPublicError());
                A0E(C3821Vm.A01(error, null));
                return;
            }
        }
        A0B.execute(new C3686TZ(this, c3844wa));
    }

    public final void A0R(InterfaceC3846WC interfaceC3846WC) {
        this.A02 = interfaceC3846WC;
    }
}
