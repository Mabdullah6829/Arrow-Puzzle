package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.C1137R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4748kx implements InterfaceC3191LU<Bitmap> {
    public static byte[] A06;
    public final int A00;
    public final int A01;
    public final String A02 = C4748kx.class.getSimpleName();
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-110, -40, -47, -44, 3, 42, 53, 46, 34, 49, -31, 42, 52, -31, 47, 54, 45, 45, -55, -4, -25, -23, -12, -8, -19, -13, -14, -92, -24, -7, -10, -19, -14, -21, -92, -22, -19, -16, -23, -92, -25, -13, -15, -12, -10, -23, -9, -9, -19, -13, -14};
    }

    public C4748kx(int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.A01 = i2;
        this.A00 = i3;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = z3;
    }

    public static C3190LT<Bitmap> A00(Throwable th) {
        return new C3190LT<>(false, null, th);
    }

    private void A03(File file, Bitmap bitmap) throws IOException {
        if (bitmap == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            ByteArrayOutputStream compressedBitmapOS = new ByteArrayOutputStream();
            byteArrayOutputStream = compressedBitmapOS;
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= 3145728) {
                return;
            }
            String str = file.getCanonicalPath() + A01(0, 4, 25);
            File file2 = new File(str);
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(str);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileInputStream = new FileInputStream(str);
            fileOutputStream2 = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 > 0) {
                    fileOutputStream2.write(bArr, 0, i2);
                } else {
                    file2.delete();
                    return;
                }
            }
        } finally {
            AbstractC3210Ln.A07(byteArrayOutputStream);
            AbstractC3210Ln.A07(fileOutputStream);
            AbstractC3210Ln.A07(fileInputStream);
            AbstractC3210Ln.A07(fileOutputStream2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3191LU
    public final C3190LT<Bitmap> A3x(File file, InterfaceC3209Lm interfaceC3209Lm) {
        if (!this.A04) {
            return new C3190LT<>(true, null);
        }
        try {
            Bitmap bitmapA03 = AbstractC3210Ln.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
            if (bitmapA03 != null) {
                return new C3190LT<>(true, bitmapA03);
            }
            interfaceC3209Lm.AB4(new C4739kn(A01(4, 14, C1137R.styleable.ConstraintSet_polarRelativeTo)));
            return A00(null);
        } catch (Throwable t) {
            file.delete();
            interfaceC3209Lm.AB4(t);
            return A00(t);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3191LU
    public final void A5D(File file, InterfaceC3209Lm interfaceC3209Lm) throws Throwable {
        if (this.A03) {
            try {
                Bitmap bitmap = AbstractC3210Ln.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
                if (bitmap != null) {
                    A03(file, bitmap);
                } else {
                    file.delete();
                    throw new C4739kn(A01(4, 14, C1137R.styleable.ConstraintSet_polarRelativeTo));
                }
            } catch (C4739kn e) {
                interfaceC3209Lm.ABI(e);
                throw e;
            } catch (Throwable th) {
                interfaceC3209Lm.ABI(th);
                Throwable t = new C4739kn(A01(18, 33, 57), th);
                throw t;
            }
        }
    }
}
