package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.widget.C1137R;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4921nx implements InterfaceC2623CH {
    public static byte[] A08;
    public static String[] A09 = {"6Pd6msxcVNGBSX02eJXjJuTK1755qRBj", "HohFYYIoFYVFLjySAriRsbI1EyK3MfzH", "CeUiguCmFwn8TW5CDLSIDkbyI8ACimQb", "zlyrIOO0KfkMjpYTb9psfC0NNgHcfA", "hplEZcFLtp2y3xCWfrXOGnyD7Ln2K5MA", "IDL7x3RfZufseciwLxrhiUDjrsxZNied", "XKrD5ajpOT4k5Fxpc35DaF0adCV7zARl", "Sdgzg0MlhPfZZU1TENhiXzUXxxUExQMT"};
    public InterfaceC2622CG A00;
    public final AbstractC21073d A01;
    public final C22355i A02;
    public final C23888B A03;
    public final C3263Me A04;
    public final Executor A05;
    public volatile AbstractRunnableFutureC21894y<Void, IOException> A06;
    public volatile boolean A07;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A09;
            if (strArr[5].charAt(20) == strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[1] = "fxMtGUUqqO78zEEYN3IhZEPjI2AJG4xW";
            strArr2[6] = "cS7s2KNWeBHf1m4W4BuqIbsBl519HGHJ";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 68);
            i5++;
        }
    }

    public static void A02() {
        A08 = new byte[]{31, 34, 34, 28, 30, 27, 15, 17, 17, 16, 12, -1, 7, 9, 16, -1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2623CH
    public final void A63(InterfaceC2622CG interfaceC2622CG) throws InterruptedException, IOException {
        this.A00 = interfaceC2622CG;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 3, C1137R.styleable.ConstraintSet_transitionPathRotate));
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.A07) {
                    break;
                }
                this.A06 = new C4922ny(this);
                if (0 != 0) {
                    throw new NullPointerException(A01(3, 7, 104));
                }
                this.A05.execute(this.A06);
                try {
                    this.A06.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable th = (Throwable) AbstractC21273y.A01(e.getCause());
                    if (0 == 0) {
                        if (th instanceof IOException) {
                            throw ((IOException) th);
                        }
                        AbstractC22035C.A11(th);
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                ((AbstractRunnableFutureC21894y) AbstractC21273y.A01(this.A06)).A02();
                if (0 == 0) {
                    throw th2;
                }
                throw new NullPointerException(A01(10, 6, 86));
            }
        }
        ((AbstractRunnableFutureC21894y) AbstractC21273y.A01(this.A06)).A02();
        if (0 != 0) {
            throw new NullPointerException(A01(10, 6, 86));
        }
    }

    static {
        A02();
    }

    public C4921nx(C5053q7 c5053q7, C4720kT c4720kT, Executor executor) {
        this.A05 = (Executor) AbstractC21273y.A01(executor);
        AbstractC21273y.A01(c5053q7.A03);
        this.A02 = new C22325f().A06(c5053q7.A03.A00).A08(c5053q7.A03.A04).A02(4).A09();
        this.A03 = c4720kT.A07();
        this.A04 = new C3263Me(this.A03, this.A02, null, new InterfaceC3262Md() { // from class: com.facebook.ads.redexgen.X.nz
            @Override // com.instagram.common.viewpoint.core.InterfaceC3262Md
            public final void AFX(long j2, long j3, long j4) {
                this.A00.A03(j2, j3, j4);
            }
        });
        this.A01 = c4720kT.A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(long j2, long j3, long j4) {
        float f2;
        if (this.A00 == null) {
            return;
        }
        if (j2 == -1 || j2 == 0) {
            f2 = -1.0f;
        } else {
            f2 = (j3 * 100.0f) / j2;
        }
        this.A00.AFW(j2, j3, f2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2623CH
    public final void cancel() {
        this.A07 = true;
        AbstractRunnableFutureC21894y<Void, IOException> abstractRunnableFutureC21894y = this.A06;
        if (abstractRunnableFutureC21894y != null) {
            abstractRunnableFutureC21894y.cancel(true);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2623CH
    public final void remove() {
        this.A03.A0E().AIU(this.A03.A0F().A4l(this.A02));
    }
}
