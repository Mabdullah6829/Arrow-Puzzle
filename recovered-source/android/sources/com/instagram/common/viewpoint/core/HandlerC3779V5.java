package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.V5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class HandlerC3779V5 extends Handler {
    public static byte[] A04;
    public static String[] A05 = {"4udqyVbWZXJvSc0AlbflTWwfFOYrDaDf", "2YLZ8zu95yTf3T209", "2VJPb0Yp69Qd6undQokFBSWI7sS3NGkE", "Nq0QHebF7aCImjCS8", "WfWu3jj6ZslW8HMUv7JinXygwhejXyBb", "C4PEiJW5iwJTin2vYgbWRkUl1o", "sWvNSKALPWxj", "lJrPEKSWvzui7DJNo"};
    public static final String A06;
    public final Context A00;
    public final AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public final AudienceNetworkRemoteServiceApi.PackageVerifier A02;
    public final C3902X9 A03;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-8, -16, -12, -13, -16, -14, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -13, -12, -14, -1, -31, -28, -1, -23, -28, -1, -21, -27, -7, 17, 18, 16, 29, 0, 19, 12, 2, 10, 3, 29, 9, 3, 23, -48, -47, -49, -36, -48, -62, -49, -45, -58, -64, -62, -36, -62, -43, -47, -49, -66, -48, 21, 22, 20, 33, 21, 7, 20, 24, 11, 5, 7, 33, 21, 6, 13, 33, 24, 7, 20, 21, 11, 17, 16};
        if (A05[5].length() == 23) {
            throw new RuntimeException();
        }
        A05[5] = "AJ3";
        A04 = bArr;
    }

    static {
        A04();
        A06 = HandlerC3779V5.class.getSimpleName();
    }

    public HandlerC3779V5(Context context, AudienceNetworkRemoteServiceApi.MessageHandler messageHandler, AudienceNetworkRemoteServiceApi.PackageVerifier packageVerifier) {
        super(Looper.getMainLooper());
        this.A00 = context;
        this.A02 = packageVerifier;
        this.A03 = C3902X9.A00();
        this.A01 = messageHandler;
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString(A03(72, 23, 92), A03(0, 6, 92));
        bundle.putString(A03(54, 18, 23), new JSONObject().toString());
        return bundle;
    }

    private C4609id A01(C4604iY c4604iY, String str) {
        C4609id c4609id = new C4609id(c4604iY, this.A03, str);
        c4609id.A0G(c4604iY.A0B(), c4604iY.A07());
        return c4609id;
    }

    private C4605iZ A02(C4589iI c4589iI, String str) {
        C4605iZ c4605iZ = new C4605iZ(c4589iI, this.A03, str);
        c4605iZ.A0J(c4589iI.A05, c4589iI.A02, c4589iI.A08);
        return c4605iZ;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) throws Throwable {
        String strVerifyPackage;
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A01 != null && this.A01.handleMessage(msg)) {
                return;
            }
            Messenger messenger = msg.replyTo;
            if (msg.what == 1) {
                if (messenger != null) {
                    C3902X9.A00().A07(2, null, A00(), messenger);
                    return;
                }
                return;
            }
            String callingAppPackage = msg.getData().getString(A03(27, 13, 58));
            if (callingAppPackage == null) {
                return;
            }
            C4494gi c4494giA05 = C3579Rp.A05(this.A00, callingAppPackage);
            c4494giA05.A0F().AJS(msg.getData().getBoolean(A03(6, 21, 22), false));
            if (this.A02 != null) {
                strVerifyPackage = this.A02.verifyPackage(this.A00, msg, msg.getData().getString(A03(40, 14, 88)));
            } else {
                strVerifyPackage = null;
            }
            if (strVerifyPackage == null) {
                if (messenger != null) {
                    C3902X9.A00().A07(20, callingAppPackage, null, messenger);
                }
                c4494giA05.A0F().AHv();
                return;
            }
            switch (msg.what) {
                case PointerIconCompat.TYPE_ALIAS /* 1010 */:
                    if (messenger == null) {
                        return;
                    }
                    C3776V2 c3776v2A04 = C3902X9.A00().A04(callingAppPackage);
                    if (c3776v2A04 == null) {
                        c3776v2A04 = C3902X9.A00().A05(callingAppPackage, messenger, strVerifyPackage);
                    }
                    C4604iY intAdModel = AbstractC3379OX.A04(c4494giA05, msg.getData(), strVerifyPackage);
                    if (c3776v2A04.A00 == null) {
                        c3776v2A04.A00 = A01(intAdModel, callingAppPackage);
                    } else if (c3776v2A04.A00 instanceof C4609id) {
                        ((C4609id) c3776v2A04.A00).A0G(intAdModel.A0B(), intAdModel.A07());
                    }
                    C3902X9.A00().A07(PointerIconCompat.TYPE_COPY, callingAppPackage, A00(), messenger);
                    return;
                case PointerIconCompat.TYPE_NO_DROP /* 1012 */:
                case AdError.CACHE_ERROR_CODE /* 2002 */:
                    C3902X9.A00().A08(callingAppPackage);
                    return;
                case AdError.SERVER_ERROR_CODE /* 2000 */:
                    if (messenger == null) {
                        return;
                    }
                    C3776V2 c3776v2A05 = C3902X9.A00().A04(callingAppPackage);
                    if (c3776v2A05 == null) {
                        c3776v2A05 = C3902X9.A00().A05(callingAppPackage, messenger, strVerifyPackage);
                    }
                    C4589iI c4589iIA05 = AbstractC3379OX.A05(c4494giA05, msg.getData(), strVerifyPackage);
                    if (c3776v2A05.A00 == null) {
                        c3776v2A05.A00 = A02(c4589iIA05, callingAppPackage);
                    } else if (c3776v2A05.A00 instanceof C4605iZ) {
                        C4605iZ c4605iZ = (C4605iZ) c3776v2A05.A00;
                        String adId = c4589iIA05.A05;
                        c4605iZ.A0J(adId, c4589iIA05.A02, c4589iIA05.A08);
                    }
                    C3902X9.A00().A07(AdError.INTERNAL_ERROR_CODE, callingAppPackage, A00(), messenger);
                    return;
                case AdError.INTERNAL_ERROR_2003 /* 2003 */:
                    InterfaceC3362OG interfaceC3362OGA03 = C3902X9.A00().A03(callingAppPackage);
                    if (interfaceC3362OGA03 instanceof C4605iZ) {
                        RewardData rewardDataA01 = AbstractC3380OY.A01(msg.getData());
                        C4605iZ c4605iZ2 = (C4605iZ) interfaceC3362OGA03;
                        if (rewardDataA01 != null) {
                            c4605iZ2.A0I(rewardDataA01);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            if (A05[5].length() == 23) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "nIV8RMn07Ah5";
            strArr[1] = "ZacTvu5dUvRq7FGBf";
            AbstractC3863WU.A00(th, this);
        }
    }
}
