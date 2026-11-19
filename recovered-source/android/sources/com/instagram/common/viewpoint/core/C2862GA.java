package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2862GA {
    public static byte[] A0C;
    public static String[] A0D = {"vrjy3LPqmZ4VYL", "kldC8xOSHjGgI0Rq8UB5uDItbCAb4yeD", "ZtlkL6mqEDvYXWdJ148AMfPypAXzloX0", "vv3uN80MDVvh0kr3i18f6F5St9zthXAP", "5vSY45XZaWTc5ARQpJ6MABJkKRGBO5p9", "E4RES2qVkVhri6POLSj0lZrJ1TN13SFq", "ZPGU8CInoZ6FL7owV0UYW5v36RZ6UHPP", "wFHJA8K1ufuqr0OxwfXIZVwS7Glp9Dxp"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final C2860G8 A0A;
    public final ChoreographerFrameCallbackC2861G9 A0B;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{108, 97, 123, 120, 100, 105, 113, 38, 56, 63, 53, 62, 38};
    }

    static {
        A04();
    }

    public C2862GA() {
        this(null);
    }

    public C2862GA(Context context) {
        if (context != null) {
            this.A09 = (WindowManager) context.getSystemService(A02(7, 6, 32));
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            this.A0A = AbstractC22035C.A02 >= 17 ? A01(context) : null;
            this.A0B = ChoreographerFrameCallbackC2861G9.A00();
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public static long A00(long j2, long j3, long j4) {
        long j5;
        long vsyncCount = j4 * ((j2 - j3) / j4);
        long j6 = j3 + vsyncCount;
        if (j2 <= j6) {
            j5 = j6 - j4;
        } else {
            j5 = j6;
            j6 += j4;
        }
        return j6 - j2 < j2 - j5 ? j6 : j5;
    }

    private C2860G8 A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, C1137R.styleable.ConstraintSet_transitionEasing));
        if (displayManager == null) {
            return null;
        }
        return new C2860G8(this, displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            this.A06 = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.A07 = (this.A06 * 80) / 100;
        }
    }

    private boolean A06(long j2, long j3) {
        long j4 = j2 - this.A04;
        long elapsedFrameTimeNs = this.A05;
        return Math.abs((j3 - elapsedFrameTimeNs) - j4) > 20000000;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    public final long A07(long j2, long j3) {
        long j4 = 1000 * j2;
        long j5 = j4;
        long j6 = j3;
        if (this.A08) {
            if (j2 != this.A02) {
                this.A01++;
                this.A00 = this.A03;
            }
            if (this.A01 >= 6) {
                long j7 = this.A00 + ((j4 - this.A04) / this.A01);
                if (A06(j7, j3)) {
                    this.A08 = false;
                } else {
                    long j8 = this.A05;
                    if (A0D[4].length() == 4) {
                        throw new RuntimeException();
                    }
                    A0D[2] = "LxalG4mHATb18PeqaNeAayN2I9HozhV7";
                    j6 = (j8 + j7) - this.A04;
                    j5 = j7;
                }
            } else {
                boolean zA06 = A06(j4, j3);
                if (A0D[2].charAt(6) == 'm') {
                    A0D[0] = "QXST6c0zZjLjc8mFjZqys1TY6ZZx4";
                    if (zA06) {
                        this.A08 = false;
                    }
                } else if (zA06) {
                    this.A08 = false;
                }
            }
        }
        if (!this.A08) {
            this.A04 = j4;
            this.A05 = j3;
            this.A01 = 0L;
            this.A08 = true;
        }
        this.A02 = j2;
        this.A03 = j5;
        if (this.A0B == null || this.A06 == -9223372036854775807L) {
            return j6;
        }
        long j9 = this.A0B.A04;
        if (j9 == -9223372036854775807L) {
            return j6;
        }
        return A00(j6, j9, this.A06) - this.A07;
    }

    public final void A08() {
        if (this.A09 != null) {
            if (this.A0A != null) {
                this.A0A.A01();
            }
            this.A0B.A07();
        }
    }

    public final void A09() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A06();
            if (this.A0A != null) {
                this.A0A.A00();
            }
            A03();
        }
    }
}
