package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4530hI implements InterfaceC4266d1 {
    public static String[] A03 = {"nDiRY7f5TVWQOdU6I2mqi9PFa0bJ0VdN", "dUUtDl8unUO3GnPy3lwgtNvfo3F9XuVE", "auWwlwtRUPVHuGctx8NQwZ9fHxwXm1Rl", "TBzFY5XPxTfovmrmdBuO6vWMd6W8Cva2", "LKANgRtOSZEoLNHfrBEFH87LShAEPYie", "UCBlHB7WfBTqWuynAgT0g", "VPae1XPQy5IfYkfssFJoJg5Ye50RabOh", "Wz70ndlImsTWQI2daID25L24SXF8SnWJ"};
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ C4524hC A01;
    public final /* synthetic */ C3732UK A02;

    public C4530hI(C4524hC c4524hC, C3732UK c3732uk, NativeAd nativeAd) {
        this.A01 = c4524hC;
        this.A02 = c3732uk;
        this.A00 = nativeAd;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4266d1
    public final void AAn() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4266d1
    public final void ADm(C225562 c225562) {
        new Handler(Looper.getMainLooper()).postDelayed(new C4531hJ(this, c225562), 1L);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4266d1
    public final void AE2() {
        if (this.A01.A0H != null) {
            C225562 c225562 = this.A01.A0H;
            String[] strArr = A03;
            if (strArr[4].charAt(31) == strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            A03[1] = "TOeEN4NbTJF6yCcoA7wHZFJASn52oXHD";
            c225562.A08();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4266d1
    public final void AGC(View view, MotionEvent motionEvent) {
        this.A02.A1E().A06(this.A01.A0C, motionEvent, view, view);
        if (motionEvent.getAction() == 1 && !this.A01.A0U(this.A00) && this.A02.A17() != null) {
            this.A02.A17().onClick(view);
        }
    }
}
