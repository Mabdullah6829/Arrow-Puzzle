package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iy */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4630iy implements InterfaceC3296NC {
    public static byte[] A02;
    public final /* synthetic */ C23607j A00;
    public final /* synthetic */ Runnable A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{66, 70, 66, 21, 21, 68, 19, 17, 77, 104, 109, 124, 120, 105, 126, 44, 101, 127, 44, 98, 121, 96, 96, 44, 99, 98, 44, 96, 99, 109, 104, 69, 98, 120, 105, 126, 127, 120, 101, 120, 101, 109, 96, 77, 104, 59, 28, 6, 23, 0, 1, 6, 27, 6, 27, 19, 30, 82, 27, 31, 2, 0, 23, 1, 1, 27, 29, 28, 82, 20, 27, 0, 23, 22, 63, 48, 1, 63, 61, 42, 55, 40, 55, 42, 39, 101, 106, 96, 118, 107, 109, 96, 42, 109, 106, 112, 97, 106, 112, 42, 101, 103, 112, 109, 107, 106, 42, 82, 77, 65, 83, 34, 51, 42, 109, 108, 75, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 78, 109, 101, 101, 107, 108, 101, 75, 111, 114, 112, 103, 113, 113, 107, 109, 108};
    }

    public C4630iy(C23607j c23607j, Runnable runnable) {
        this.A00 = c23607j;
        this.A01 = runnable;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3296NC
    public final void AEC(C4691jz c4691jz, String str, boolean z) {
        this.A00.A07.A0C();
        boolean z2 = !TextUtils.isEmpty(str);
        if (z && z2) {
            try {
                Intent intent = new Intent(A00(85, 26, 62));
                intent.setData(AbstractC3904XB.A00(str));
                C3889Wu.A0D(this.A00.A0B, intent);
            } catch (C3887Ws e) {
                Throwable cause = e.getCause();
                C3887Ws cause2 = e;
                if (cause != null) {
                    cause2 = e.getCause();
                }
                this.A00.A0B.A08().ABC(A00(74, 11, 100), AbstractC3690Td.A04, new C3691Te(cause2));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3296NC
    public final void AED(C4691jz c4691jz) {
        this.A00.A07.A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3296NC
    public final void AEE(C4691jz c4691jz) {
        this.A00.A07.A05();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3296NC
    public final void AEF(C4691jz c4691jz) {
        if (c4691jz != this.A00.A00) {
            return;
        }
        if (c4691jz == null) {
            this.A00.A0B.A08().ABC(A00(111, 3, C1137R.styleable.ConstraintSet_transitionEasing), AbstractC3690Td.A0X, new C3691Te(A00(8, 37, 54)));
            AEG(c4691jz, AdError.internalError(AdError.INTERNAL_ERROR_2004));
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A01 = c4691jz;
        this.A00.A0L();
        this.A00.A07.A0F(c4691jz);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3296NC
    public final void AEG(C4691jz c4691jz, AdError adError) {
        if (c4691jz != this.A00.A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(c4691jz);
        this.A00.A0B.A0F().A5g(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A07.A0G(new C3821Vm(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3296NC
    public final void AEH(C4691jz c4691jz) {
        AbstractC3832Vy.A05(A00(114, 31, 56), A00(45, 29, 72), A00(0, 8, 77));
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3296NC
    public final void AEI() {
        this.A00.A07.A08();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3296NC
    public final void AEJ() {
        this.A00.A07.A06();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3296NC
    public final void AEK() {
        this.A00.A07.A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3296NC
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A02();
    }
}
