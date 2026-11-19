package com.facebook.ads.androidx.media3.extractor.mkv;

import android.net.Uri;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.C1137R;
import androidx.core.view.PointerIconCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.work.WorkRequest;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.firebase.FirebaseError;
import com.instagram.common.viewpoint.core.AbstractC20442Y;
import com.instagram.common.viewpoint.core.AbstractC21273y;
import com.instagram.common.viewpoint.core.AbstractC21714g;
import com.instagram.common.viewpoint.core.AbstractC22035C;
import com.instagram.common.viewpoint.core.AbstractC2942HS;
import com.instagram.common.viewpoint.core.C20883K;
import com.instagram.common.viewpoint.core.C21724h;
import com.instagram.common.viewpoint.core.C21864v;
import com.instagram.common.viewpoint.core.C2945HV;
import com.instagram.common.viewpoint.core.C2951Hb;
import com.instagram.common.viewpoint.core.C3025Io;
import com.instagram.common.viewpoint.core.C3026Ip;
import com.instagram.common.viewpoint.core.C3027Iq;
import com.instagram.common.viewpoint.core.C4832mK;
import com.instagram.common.viewpoint.core.C4834mM;
import com.instagram.common.viewpoint.core.C4850mn;
import com.instagram.common.viewpoint.core.C4860my;
import com.instagram.common.viewpoint.core.InterfaceC2923H9;
import com.instagram.common.viewpoint.core.InterfaceC2924HA;
import com.instagram.common.viewpoint.core.InterfaceC2927HD;
import com.instagram.common.viewpoint.core.InterfaceC2948HY;
import com.instagram.common.viewpoint.core.InterfaceC2953Hd;
import com.instagram.common.viewpoint.core.InterfaceC3022Il;
import com.instagram.common.viewpoint.core.InterfaceC4855ms;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class MatroskaExtractor implements InterfaceC2923H9 {
    public static byte[] A0t;
    public static String[] A0u = {"tBqjpPNwSsfRjGbhoSofYeEQJAfxpzeJ", "SQ32k5yHiSqu0tF5bV2mYZI8q27OK2Wk", "Ew8EcvFtYPYsbuW", "MeCkyRYcfoGShRSoQHq7qyLBTkTGcoSQ", "UyV8GtaWyEclMV8OhG", "yLkQb0Xo1O", "PFhexnCJ0GZtqtRWjlJ7uY4w9", "UodjFtXG6f6h7NmMQ857"};
    public static final InterfaceC2927HD A0v;
    public static final Map<String, Integer> A0w;
    public static final UUID A0x;
    public static final byte[] A0y;
    public static final byte[] A0z;
    public static final byte[] A10;
    public static final byte[] A11;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;

    @MetaExoPlayerCustomization("Removed the final from the member variable")
    public SparseArray<C3025Io> A0P;
    public C21724h A0Q;
    public C21724h A0R;
    public InterfaceC2924HA A0S;
    public C3025Io A0T;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "AR/VC customizations")
    public String A0U;
    public ByteBuffer A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public int[] A0f;
    public final C21864v A0g;
    public final C21864v A0h;
    public final C21864v A0i;
    public final C21864v A0j;
    public final C21864v A0k;
    public final C21864v A0l;
    public final C21864v A0m;
    public final C21864v A0n;
    public final C21864v A0o;
    public final C21864v A0p;
    public final InterfaceC3022Il A0q;
    public final C3027Iq A0r;
    public final boolean A0s;

    /* JADX WARN: Code duplicated, block: B:102:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:104:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:106:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:110:0x03be A[LOOP:1: B:108:0x03ba->B:110:0x03be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:114:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:116:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:119:0x0415  */
    /* JADX WARN: Code duplicated, block: B:131:0x038f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x020d A[PHI: r0
  0x020d: PHI (r0v193 byte[]) = (r0v192 byte[]), (r0v208 byte[]) binds: [B:63:0x0209, B:37:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x0309  */
    /* JADX WARN: Code duplicated, block: B:92:0x0320  */
    /* JADX WARN: Code duplicated, block: B:95:0x0338  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @RequiresNonNull({"#2.output"})
    private int A02(InterfaceC4855ms interfaceC4855ms, C3025Io c3025Io, int i2, boolean z) throws IOException {
        int iA0A;
        byte[] bArrA0l;
        int i3;
        int i4;
        String[] strArr;
        String strA06;
        String str;
        String[] strArr2;
        String[] strArr3;
        boolean z2;
        byte[] bArrA0l2;
        if (A06(PointerIconCompat.TYPE_NO_DROP, 11, 56).equals(c3025Io.A0d)) {
            A0F(interfaceC4855ms, A10, i2);
            return A00();
        }
        String[] strArr4 = A0u;
        if (strArr4[5].length() != strArr4[6].length()) {
            A0u[3] = "Q42iXR6evmRi7JQ7PxfR7toxYIITwFkY";
            if (A06(1002, 10, 101).equals(c3025Io.A0d)) {
                A0F(interfaceC4855ms, A0z, i2);
                return A00();
            }
            if (A06(1023, 13, 32).equals(c3025Io.A0d)) {
                A0F(interfaceC4855ms, A11, i2);
                return A00();
            }
            InterfaceC2953Hd interfaceC2953Hd = c3025Io.A0b;
            if (this.A0Y) {
                iA0A = i2 + this.A0k.A0A();
                if (A06(1207, 15, 14).equals(c3025Io.A0d)) {
                    bArrA0l = this.A0i.A0l();
                    bArrA0l[0] = 0;
                    bArrA0l[1] = 0;
                    bArrA0l[2] = 0;
                    i3 = c3025Io.A0Q;
                    i4 = 4 - c3025Io.A0Q;
                    while (this.A08 < iA0A) {
                        if (this.A0A == 0) {
                            A0G(interfaceC4855ms, bArrA0l, i4, i3);
                            this.A08 += i3;
                            this.A0i.A0f(0);
                            this.A0A = this.A0i.A0L();
                            this.A0j.A0f(0);
                            interfaceC2953Hd.AIr(this.A0j, 4);
                            strArr = A0u;
                            if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                                String[] strArr5 = A0u;
                                strArr5[5] = "fro1mi6zSK";
                                strArr5[6] = "qDDF1oBUoQgRey5lTLsLsLE8f";
                                this.A09 += 4;
                            } else {
                                A0u[7] = "9yo0tJuahVLQaubMcBBhp2wjVELgngje";
                                this.A09 += 4;
                            }
                        } else {
                            int iA01 = A01(interfaceC4855ms, interfaceC2953Hd, this.A0A);
                            this.A08 += iA01;
                            this.A09 += iA01;
                            this.A0A -= iA01;
                        }
                    }
                } else {
                    strArr3 = A0u;
                    if (strArr3[2].length() != strArr3[4].length()) {
                        A0u[3] = "azLjDRwnDORtAkbJr5UmBWWcvu9WrjdT";
                        if (A06(1236, 16, 47).equals(c3025Io.A0d)) {
                            bArrA0l = this.A0i.A0l();
                            bArrA0l[0] = 0;
                            bArrA0l[1] = 0;
                            bArrA0l[2] = 0;
                            i3 = c3025Io.A0Q;
                            i4 = 4 - c3025Io.A0Q;
                            while (this.A08 < iA0A) {
                                if (this.A0A == 0) {
                                    A0G(interfaceC4855ms, bArrA0l, i4, i3);
                                    this.A08 += i3;
                                    this.A0i.A0f(0);
                                    this.A0A = this.A0i.A0L();
                                    this.A0j.A0f(0);
                                    interfaceC2953Hd.AIr(this.A0j, 4);
                                    strArr = A0u;
                                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                                        String[] strArr6 = A0u;
                                        strArr6[5] = "fro1mi6zSK";
                                        strArr6[6] = "qDDF1oBUoQgRey5lTLsLsLE8f";
                                        this.A09 += 4;
                                    } else {
                                        A0u[7] = "9yo0tJuahVLQaubMcBBhp2wjVELgngje";
                                        this.A09 += 4;
                                    }
                                } else {
                                    int iA02 = A01(interfaceC4855ms, interfaceC2953Hd, this.A0A);
                                    this.A08 += iA02;
                                    this.A09 += iA02;
                                    this.A0A -= iA02;
                                }
                            }
                        } else {
                            if (c3025Io.A0c != null) {
                                if (this.A0k.A0A() == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                AbstractC21273y.A08(z2);
                                c3025Io.A0c.A03(interfaceC4855ms);
                            }
                            while (this.A08 < iA0A) {
                                int iA03 = A01(interfaceC4855ms, interfaceC2953Hd, iA0A - this.A08);
                                this.A08 += iA03;
                                this.A09 += iA03;
                            }
                        }
                    }
                }
                strA06 = A06(271, 8, C1137R.styleable.ConstraintSet_pivotAnchor);
                str = c3025Io.A0d;
                strArr2 = A0u;
                if (strArr2[1].charAt(1) != strArr2[0].charAt(1)) {
                    A0u[3] = "L5Y1ZRMfFWOxp58RZlemSr0Ie3cKRoNn";
                    if (strA06.equals(str)) {
                        this.A0p.A0f(0);
                        interfaceC2953Hd.AIr(this.A0p, 4);
                        this.A09 += 4;
                    }
                } else {
                    String[] strArr7 = A0u;
                    strArr7[2] = "6h0vzYYIjFmBqGs";
                    strArr7[4] = "2CBNjdNTCI84kXMqqr";
                    if (strA06.equals(str)) {
                        this.A0p.A0f(0);
                        interfaceC2953Hd.AIr(this.A0p, 4);
                        this.A09 += 4;
                    }
                }
                return A00();
            }
            if (c3025Io.A0i) {
                this.A02 &= -1073741825;
                int i5 = 128;
                if (!this.A0b) {
                    interfaceC4855ms.readFully(this.A0l.A0l(), 0, 1);
                    this.A08++;
                    if ((this.A0l.A0l()[0] & 128) == 128) {
                        throw C20883K.A01(A06(694, 35, 14), null);
                    }
                    this.A00 = this.A0l.A0l()[0];
                    this.A0b = true;
                }
                if ((this.A00 & 1) == 1) {
                    boolean z3 = (this.A00 & 2) == 2;
                    this.A02 |= BasicMeasure.EXACTLY;
                    if (!this.A0Z) {
                        byte[] bArrA0l3 = this.A0g.A0l();
                        String[] strArr8 = A0u;
                        if (strArr8[1].charAt(1) != strArr8[0].charAt(1)) {
                            String[] strArr9 = A0u;
                            strArr9[5] = "0YZVfaON5K";
                            strArr9[6] = "Vpm73VVBoM5AMHA6BL8GPMDLM";
                            interfaceC4855ms.readFully(bArrA0l3, 0, 8);
                            this.A08 += 8;
                            this.A0Z = true;
                            bArrA0l2 = this.A0l.A0l();
                            if (!z3) {
                                i5 = 0;
                            }
                        } else {
                            interfaceC4855ms.readFully(bArrA0l3, 0, 8);
                            this.A08 += 8;
                            this.A0Z = true;
                            bArrA0l2 = this.A0l.A0l();
                            if (!z3) {
                                i5 = 0;
                            }
                        }
                        bArrA0l2[0] = (byte) (i5 | 8);
                        this.A0l.A0f(0);
                        interfaceC2953Hd.AIs(this.A0l, 1, 1);
                        this.A09++;
                        this.A0g.A0f(0);
                        interfaceC2953Hd.AIs(this.A0g, 8, 1);
                        this.A09 += 8;
                    }
                    if (z3) {
                        boolean z4 = this.A0a;
                        String[] strArr10 = A0u;
                        if (strArr10[5].length() == strArr10[6].length()) {
                            throw new RuntimeException();
                        }
                        A0u[3] = "IbloDRbaqkSTIb2EEG1BJ7I1x09YBoFC";
                        if (!z4) {
                            interfaceC4855ms.readFully(this.A0l.A0l(), 0, 1);
                            this.A08++;
                            this.A0l.A0f(0);
                            this.A0B = this.A0l.A0I();
                            this.A0a = true;
                        }
                        int i6 = this.A0B * 4;
                        this.A0l.A0d(i6);
                        interfaceC4855ms.readFully(this.A0l.A0l(), 0, i6);
                        this.A08 += i6;
                        short s2 = (short) ((this.A0B / 2) + 1);
                        int i7 = (s2 * 6) + 2;
                        if (this.A0V == null || this.A0V.capacity() < i7) {
                            this.A0V = ByteBuffer.allocate(i7);
                        }
                        this.A0V.position(0);
                        this.A0V.putShort(s2);
                        int iA0L = 0;
                        for (int i8 = 0; i8 < this.A0B; i8++) {
                            int i9 = iA0L;
                            iA0L = this.A0l.A0L();
                            if (i8 % 2 == 0) {
                                ByteBuffer byteBuffer = this.A0V;
                                short s3 = (short) (iA0L - i9);
                                String[] strArr11 = A0u;
                                if (strArr11[5].length() == strArr11[6].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr12 = A0u;
                                strArr12[5] = "ft008TAv7G";
                                strArr12[6] = "haHnc3qulCtaE6iMk670OeuEn";
                                byteBuffer.putShort(s3);
                            } else {
                                ByteBuffer byteBuffer2 = this.A0V;
                                String[] strArr13 = A0u;
                                if (strArr13[2].length() != strArr13[4].length()) {
                                    String[] strArr14 = A0u;
                                    strArr14[2] = "aiG4mSAFtmR28a0";
                                    strArr14[4] = "af0fkPAZLGHpLmON09";
                                    byteBuffer2.putInt(iA0L - i9);
                                }
                            }
                        }
                        int i10 = (i2 - this.A08) - iA0L;
                        if (this.A0B % 2 == 1) {
                            this.A0V.putInt(i10);
                        } else {
                            this.A0V.putShort((short) i10);
                            this.A0V.putInt(0);
                        }
                        this.A0h.A0j(this.A0V.array(), i7);
                        interfaceC2953Hd.AIs(this.A0h, i7, 1);
                        this.A09 += i7;
                    }
                }
            } else if (c3025Io.A0m != null) {
                this.A0k.A0j(c3025Io.A0m, c3025Io.A0m.length);
            }
            if (c3025Io.A0B(z)) {
                this.A02 |= 268435456;
                this.A0o.A0d(0);
                int iA0A2 = (this.A0k.A0A() + i2) - this.A08;
                this.A0l.A0d(4);
                this.A0l.A0l()[0] = (byte) ((iA0A2 >> 24) & 255);
                this.A0l.A0l()[1] = (byte) ((iA0A2 >> 16) & 255);
                this.A0l.A0l()[2] = (byte) ((iA0A2 >> 8) & 255);
                this.A0l.A0l()[3] = (byte) (iA0A2 & 255);
                interfaceC2953Hd.AIs(this.A0l, 4, 2);
                this.A09 += 4;
            }
            this.A0Y = true;
            iA0A = i2 + this.A0k.A0A();
            if (A06(1207, 15, 14).equals(c3025Io.A0d)) {
                strArr3 = A0u;
                if (strArr3[2].length() != strArr3[4].length()) {
                    A0u[3] = "azLjDRwnDORtAkbJr5UmBWWcvu9WrjdT";
                    if (A06(1236, 16, 47).equals(c3025Io.A0d)) {
                        bArrA0l = this.A0i.A0l();
                        bArrA0l[0] = 0;
                        bArrA0l[1] = 0;
                        bArrA0l[2] = 0;
                        i3 = c3025Io.A0Q;
                        i4 = 4 - c3025Io.A0Q;
                        while (this.A08 < iA0A) {
                            if (this.A0A == 0) {
                                A0G(interfaceC4855ms, bArrA0l, i4, i3);
                                this.A08 += i3;
                                this.A0i.A0f(0);
                                this.A0A = this.A0i.A0L();
                                this.A0j.A0f(0);
                                interfaceC2953Hd.AIr(this.A0j, 4);
                                strArr = A0u;
                                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                                    String[] strArr15 = A0u;
                                    strArr15[5] = "fro1mi6zSK";
                                    strArr15[6] = "qDDF1oBUoQgRey5lTLsLsLE8f";
                                    this.A09 += 4;
                                } else {
                                    A0u[7] = "9yo0tJuahVLQaubMcBBhp2wjVELgngje";
                                    this.A09 += 4;
                                }
                            } else {
                                int iA04 = A01(interfaceC4855ms, interfaceC2953Hd, this.A0A);
                                this.A08 += iA04;
                                this.A09 += iA04;
                                this.A0A -= iA04;
                            }
                        }
                    } else {
                        if (c3025Io.A0c != null) {
                            if (this.A0k.A0A() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            AbstractC21273y.A08(z2);
                            c3025Io.A0c.A03(interfaceC4855ms);
                        }
                        while (this.A08 < iA0A) {
                            int iA05 = A01(interfaceC4855ms, interfaceC2953Hd, iA0A - this.A08);
                            this.A08 += iA05;
                            this.A09 += iA05;
                        }
                    }
                }
            } else {
                bArrA0l = this.A0i.A0l();
                bArrA0l[0] = 0;
                bArrA0l[1] = 0;
                bArrA0l[2] = 0;
                i3 = c3025Io.A0Q;
                i4 = 4 - c3025Io.A0Q;
                while (this.A08 < iA0A) {
                    if (this.A0A == 0) {
                        A0G(interfaceC4855ms, bArrA0l, i4, i3);
                        this.A08 += i3;
                        this.A0i.A0f(0);
                        this.A0A = this.A0i.A0L();
                        this.A0j.A0f(0);
                        interfaceC2953Hd.AIr(this.A0j, 4);
                        strArr = A0u;
                        if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                            String[] strArr16 = A0u;
                            strArr16[5] = "fro1mi6zSK";
                            strArr16[6] = "qDDF1oBUoQgRey5lTLsLsLE8f";
                            this.A09 += 4;
                        } else {
                            A0u[7] = "9yo0tJuahVLQaubMcBBhp2wjVELgngje";
                            this.A09 += 4;
                        }
                    } else {
                        int iA06 = A01(interfaceC4855ms, interfaceC2953Hd, this.A0A);
                        this.A08 += iA06;
                        this.A09 += iA06;
                        this.A0A -= iA06;
                    }
                }
            }
            strA06 = A06(271, 8, C1137R.styleable.ConstraintSet_pivotAnchor);
            str = c3025Io.A0d;
            strArr2 = A0u;
            if (strArr2[1].charAt(1) != strArr2[0].charAt(1)) {
                A0u[3] = "L5Y1ZRMfFWOxp58RZlemSr0Ie3cKRoNn";
                if (strA06.equals(str)) {
                    this.A0p.A0f(0);
                    interfaceC2953Hd.AIr(this.A0p, 4);
                    this.A09 += 4;
                }
            } else {
                String[] strArr17 = A0u;
                strArr17[2] = "6h0vzYYIjFmBqGs";
                strArr17[4] = "2CBNjdNTCI84kXMqqr";
                if (strA06.equals(str)) {
                    this.A0p.A0f(0);
                    interfaceC2953Hd.AIr(this.A0p, 4);
                    this.A09 += 4;
                }
            }
            return A00();
        }
        throw new RuntimeException();
    }

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0t, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0t = new byte[]{90, 23, 15, 9, 14, 90, 24, 31, 90, 19, 20, 90, 27, 90, 57, 15, 31, 9, 96, 45, 53, 51, 52, 96, 34, 37, 96, 41, 46, 96, 33, 96, 20, 50, 33, 35, 43, 5, 46, 52, 50, 57, 19, 93, 92, 71, 19, 64, 70, 67, 67, 92, 65, 71, 86, 87, 111, 122, 123, 46, 112, 111, 122, 120, 46, 112, 111, 122, 120, 46, 112, 111, 122, 120, 46, 22, 3, 1, 87, 9, 22, 3, 1, 87, 9, 22, 3, 1, 87, 31, 22, 3, 0, 87, 19, 6, 4, 82, 12, 19, 6, 4, 82, 12, 19, 6, 4, 82, 24, 19, 6, 5, 82, 0, 4, 18, 18, 36, 53, 53, 40, 47, 38, 50, 2, 40, 49, 41, 36, 51, 12, 46, 37, 36, 97, 94, 64, 94, 94, 92, 23, 9, 23, 21, 101, 58, 36, 63, 47, 40, 58, 36, 63, 47, 40, 84, 62, 35, 43, 41, 62, 40, 40, 80, 78, 85, 69, 66, 62, 93, 94, 66, 66, 93, 84, 66, 66, 120, 102, 124, 120, 122, 10, 110, 112, 105, 99, 110, 108, 33, 63, 45, 48, 37, 39, 79, 44, 82, 2, 28, 14, 19, 6, 4, 108, 15, 112, 33, 63, 45, 51, 79, 33, 35, 45, 31, 1, 17, 14, 11, 13, 82, 76, 67, 80, 94, 60, 85, 95, 92, 82, 71, 60, 90, 86, 86, 86, 82, 76, 67, 80, 94, 60, 90, 93, 71, 60, 81, 90, 84, 12, 18, 29, 14, 0, 98, 4, 3, 25, 98, 1, 4, 25, 116, 106, 97, 103, 96, 112, 125, 113, 56, 38, 47, 54, 43, 59, 48, 42, 105, 75, 68, 13, 94, 10, 89, 73, 75, 70, 79, 10, 94, 67, 71, 79, 73, 69, 78, 79, 10, 90, 88, 67, 69, 88, 10, 94, 69, 10, 94, 67, 71, 79, 73, 69, 78, 79, 121, 73, 75, 70, 79, 10, 72, 79, 67, 68, 77, 10, 89, 79, 94, 4, 5, 41, 34, 35, 37, 15, 34, 102, 47, 53, 102, 43, 47, 53, 53, 47, 40, 33, 102, 47, 40, 102, 18, 52, 39, 37, 45, 3, 40, 50, 52, 63, 102, 35, 42, 35, 43, 35, 40, 50, 117, 89, 91, 84, 95, 88, 95, 88, 81, 22, 83, 88, 85, 68, 79, 70, 66, 95, 89, 88, 22, 87, 88, 82, 22, 85, 89, 91, 70, 68, 83, 69, 69, 95, 89, 88, 22, 95, 69, 22, 88, 89, 66, 22, 69, 67, 70, 70, 89, 68, 66, 83, 82, 86, 122, 123, 97, 112, 123, 97, 86, 122, 120, 101, 84, 121, 114, 122, 53, 107, 71, 70, 92, 77, 70, 92, 109, 70, 75, 105, 68, 79, 71, 8, 82, 126, 127, 101, 116, 127, 101, 84, 127, 114, 126, 117, 120, 127, 118, 94, 99, 117, 116, 99, 49, 95, 115, 114, 104, 121, 114, 104, 89, 114, 127, 115, 120, 117, 114, 123, 79, 127, 115, 108, 121, 60, 110, 67, 89, 73, 75, 88, 78, 67, 68, 77, 10, 70, 75, 89, 94, 10, 73, 95, 79, 10, 90, 69, 67, 68, 94, 10, 93, 67, 94, 66, 10, 95, 68, 79, 82, 90, 79, 73, 94, 79, 78, 10, 78, 95, 88, 75, 94, 67, 69, 68, 16, 10, 13, 38, 42, 29, 48, 57, 44, 105, 83, 120, 116, 67, 110, 103, 114, 69, 114, 118, 115, 65, 114, 101, 100, 126, 120, 121, 55, 71, 64, 79, 78, 34, 110, 99, 97, 107, 108, 101, 34, 113, 99, 111, 114, 110, 103, 34, 113, 107, 120, 103, 34, 109, 119, 118, 34, 109, 100, 34, 112, 99, 108, 101, 103, 44, 51, 52, 59, 58, 36, 19, 23, 18, 32, 19, 4, 5, 31, 25, 24, 86, 1, 40, 33, 41, 33, 42, 48, 100, 119, 92, 81, 64, 75, 66, 70, 87, 86, 18, 102, 64, 83, 81, 89, 18, 84, 93, 71, 92, 86, 18, 80, 71, 70, 18, 113, 93, 92, 70, 87, 92, 70, 119, 92, 81, 121, 87, 75, 123, 118, 18, 69, 83, 65, 18, 92, 93, 70, 18, 84, 93, 71, 92, 86, 71, 122, 118, 103, 108, 113, 107, 109, 108, 34, 96, 107, 118, 34, 107, 113, 34, 113, 103, 118, 34, 107, 108, 34, 113, 107, 101, 108, 99, 110, 34, 96, 123, 118, 103, 108, 69, 88, 71, 75, 94, 16, 10, 121, 94, 75, 88, 94, 6, 10, 111, 68, 78, 6, 10, 120, 79, 75, 78, 101, 88, 78, 79, 88, 6, 10, 102, 75, 83, 79, 88, 6, 10, 121, 94, 83, 70, 79, 6, 10, 100, 75, 71, 79, 6, 10, 103, 75, 88, 77, 67, 68, 102, 6, 10, 103, 75, 88, 77, 67, 68, 120, 6, 10, 103, 75, 88, 77, 67, 68, 124, 6, 10, 111, 76, 76, 79, 73, 94, 6, 10, 126, 79, 82, 94, 56, 20, 27, 17, 20, 1, 26, 7, 12, 85, 16, 25, 16, 24, 16, 27, 1, 85, 38, 16, 16, 30, 60, 49, 85, 26, 7, 85, 38, 16, 16, 30, 37, 26, 6, 28, 1, 28, 26, 27, 85, 27, 26, 1, 85, 19, 26, 0, 27, 17, 14, 34, 55, 49, 44, 48, 40, 34, 6, 59, 55, 49, 34, 32, 55, 44, 49, 54, 14, 23, 15, 18, 11, 23, 30, 91, 40, 30, 28, 22, 30, 21, 15, 91, 30, 23, 30, 22, 30, 21, 15, 8, 91, 21, 20, 15, 91, 8, 14, 11, 11, 20, 9, 15, 30, 31, 32, 1, 78, 24, 15, 2, 7, 10, 78, 26, 28, 15, 13, 5, 29, 78, 25, 11, 28, 11, 78, 8, 1, 27, 0, 10, 91, 122, 53, 99, 116, 121, 124, 113, 53, 99, 116, 103, 124, 123, 97, 53, 121, 112, 123, 114, 97, 125, 53, 120, 116, 102, 126, 53, 115, 122, 96, 123, 113, 61, 49, 42, 56, 44, 61, 59, 44, 105, 101, 114, 126, 119, 108, 21, 106, 
        125, 105, 58, 54, 61, 44, 49, 61, 70, 40, 58, 58, 103, 107, 96, 113, 108, 96, 27, 97, 96, 114, 12, 127, 115, 120, 105, 116, 120, 3, 123, 105, 110, 122, 120, 120, 65, 77, 68, 93, 80, 65, 71, 80, 35, 27, 25, 0, 0, 25, 30, 23, 80, 3, 5, 18, 4, 25, 4, 28, 21, 80, 3, 17, 29, 0, 28, 21, 80, 25, 30, 80, 28, 17, 19, 21, 20, 80, 18, 28, 31, 19, 27, 94, 64, 120, 122, 99, 99, 122, 125, 116, 51, 96, 102, 113, 103, 122, 103, 127, 118, 51, 96, 114, 126, 99, 127, 118, 51, 100, 122, 103, 123, 51, 125, 124, 51, 119, 102, 97, 114, 103, 122, 124, 125, 61, 81, 106, 97, 124, 116, 97, 103, 112, 97, 96, 36, 109, 96, 62, 36, 9, 50, 57, 36, 44, 57, 63, 40, 57, 56, 124, 48, 61, 63, 53, 50, 59, 124, 42, 61, 48, 41, 57, 102, 124, 45, 36, 58, 45, 74, 62, 55, 37, 56, 45, 47, 90, 122, 115, 97, 124, 105, 107, 24, 3, 101, 127, 99, 3, 109, 124, 102, 111, 125, 96, 117, 119, 4, 31, 121, 99, 127, 31, 113, 99, 96, 84, 93, 79, 82, 71, 69, 54, 45, 75, 81, 77, 45, 67, 84, 65, 60, 53, 39, 58, 47, 45, 94, 69, 35, 57, 37, 69, 57, 58, 117, 124, 110, 115, 102, 100, 107, 12, 106, 112, 108, 12, 107, 102, 117, 96, 76, 69, 87, 73, 53, 76, 92, 77, 53, 92, 85, 79, 72, 89, 89, 69, 76, 71, 91, 86, 92, 65, 82, 18, 27, 18, 20, 124, 2, 11, 2, 4, 109, 79, 83, 68, 120, 81, 78, 67, 66, 72, 120, 85, 72, 83, 102, 10, 23, 23, 23, 52, 40, 63, 3, 42, 53, 56, 57, 51, 3, 46, 51, 40, 29, 113, 108, 101, 108, 56, 36, 51, 15, 38, 57, 52, 53, 63, 15, 34, 63, 36, 17, 125, 97, 104, 96, 93, 65, 86, 106, 67, 92, 81, 80, 90, 106, 71, 90, 65, 116, 24, 7, 2, 5, 34, 46, 59, 61, 32, 60, 36, 46, 56, 39, 42, 43, 33, 97, 57, 43, 44, 35, 21, 7, 0, 15};
    }

    static {
        A0B();
        A0v = new InterfaceC2927HD() { // from class: com.facebook.ads.redexgen.X.mL
            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final InterfaceC2923H9[] A5N() {
                return MatroskaExtractor.A0Q();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final /* synthetic */ InterfaceC2923H9[] A5O(Uri uri, Map map) {
                return AbstractC2926HC.A01(this, uri, map);
            }
        };
        A10 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0y = AbstractC22035C.A1G(A06(729, 90, 38));
        A0z = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A11 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        A0x = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put(A06(1285, 18, 43), 0);
        map.put(A06(1303, 18, 80), 90);
        map.put(A06(1321, 18, 92), 180);
        map.put(A06(1339, 18, 57), 270);
        Map<String, Integer> trackNameToRotationDegrees = Collections.unmodifiableMap(map);
        A0w = trackNameToRotationDegrees;
    }

    public MatroskaExtractor() {
        this(0);
    }

    public MatroskaExtractor(int i2) {
        this(new C4834mM(), i2);
    }

    public MatroskaExtractor(InterfaceC3022Il interfaceC3022Il, int i2) {
        this.A0M = -1L;
        this.A0O = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A0H = -1L;
        this.A0L = -1L;
        this.A0G = -9223372036854775807L;
        this.A0q = interfaceC3022Il;
        this.A0q.AAD(new C4832mK(this));
        this.A0s = (i2 & 1) == 0;
        this.A0r = new C3027Iq();
        this.A0P = new SparseArray<>();
        this.A0l = new C21864v(4);
        this.A0p = new C21864v(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0m = new C21864v(4);
        this.A0j = new C21864v(AbstractC2942HS.A03);
        this.A0i = new C21864v(4);
        this.A0k = new C21864v();
        this.A0n = new C21864v();
        this.A0g = new C21864v(8);
        this.A0h = new C21864v();
        this.A0o = new C21864v();
        this.A0f = new int[1];
    }

    private int A00() {
        int sampleSize = this.A09;
        A0A();
        return sampleSize;
    }

    private int A01(InterfaceC4855ms interfaceC4855ms, InterfaceC2953Hd interfaceC2953Hd, int i2) throws IOException {
        int strippedBytesLeft = this.A0k.A07();
        if (strippedBytesLeft > 0) {
            int bytesWritten = Math.min(i2, strippedBytesLeft);
            interfaceC2953Hd.AIr(this.A0k, bytesWritten);
            return bytesWritten;
        }
        return interfaceC2953Hd.AIp(interfaceC4855ms, i2, false);
    }

    private long A03(long j2) throws C20883K {
        if (this.A0O != -9223372036854775807L) {
            return AbstractC22035C.A0U(j2, this.A0O, 1000L);
        }
        throw C20883K.A01(A06(279, 54, 38), null);
    }

    @MetaExoPlayerCustomization("Adding support AR/VR eventListener")
    private InterfaceC2948HY A04(C21724h c21724h, C21724h c21724h2) {
        if (this.A0M == -1 || this.A0J == -9223372036854775807L || c21724h == null || c21724h.A02() == 0 || c21724h2 == null || c21724h2.A02() != c21724h.A02()) {
            return new C4850mn(this.A0J);
        }
        int iA02 = c21724h.A02();
        int[] iArrCopyOf = new int[iA02];
        long[] timesUs = new long[iA02];
        long[] durationsUs = new long[iA02];
        long[] offsets = new long[iA02];
        for (int i2 = 0; i2 < iA02; i2++) {
            offsets[i2] = c21724h.A03(i2);
            timesUs[i2] = this.A0M + c21724h2.A03(i2);
        }
        for (int i3 = 0; i3 < cuePointsSize; i3++) {
            int cuePointsSize = i3 + 1;
            iArrCopyOf[i3] = (int) (timesUs[cuePointsSize] - timesUs[i3]);
            int i4 = i3 + 1;
            if (A0u[7].length() == 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0u;
            strArr[1] = "EcqUdVdOszDxTX1GLg4Sg6FEnSFxXYEO";
            strArr[0] = "f3IXvdxpqPdXnJQYi44axyFnZVKpD9LT";
            durationsUs[i3] = offsets[i4] - offsets[i3];
        }
        iArrCopyOf[iA02 - 1] = (int) ((this.A0M + this.A0N) - timesUs[iA02 - 1]);
        durationsUs[iA02 - 1] = this.A0J - offsets[iA02 - 1];
        int cuePointsSize2 = iA02 - 1;
        long j2 = durationsUs[cuePointsSize2];
        if (j2 <= 0) {
            AbstractC21714g.A07(A06(869, 17, 79), A06(499, 52, 38) + j2);
            int cuePointsSize3 = iArrCopyOf.length;
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, cuePointsSize3 - 1);
            int cuePointsSize4 = timesUs.length;
            timesUs = Arrays.copyOf(timesUs, cuePointsSize4 - 1);
            int cuePointsSize5 = durationsUs.length;
            durationsUs = Arrays.copyOf(durationsUs, cuePointsSize5 - 1);
            int cuePointsSize6 = offsets.length;
            offsets = Arrays.copyOf(offsets, cuePointsSize6 - 1);
        }
        return new C4860my(iArrCopyOf, timesUs, durationsUs, offsets);
    }

    private final C3025Io A05(int i2) throws C20883K {
        A0D(i2);
        return this.A0T;
    }

    @EnsuresNonNull({"extractorOutput"})
    private void A09() {
        AbstractC21273y.A02(this.A0S);
    }

    private void A0A() {
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0Y = false;
        this.A0b = false;
        this.A0a = false;
        this.A0B = 0;
        this.A00 = (byte) 0;
        this.A0Z = false;
        this.A0k.A0d(0);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void A0C(int i2) throws C20883K {
        if (this.A0R != null && this.A0Q != null) {
        } else {
            throw C20883K.A01(A06(631, 8, 72) + i2 + A06(0, 18, C1137R.styleable.ConstraintSet_polarRelativeTo), null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private void A0D(int i2) throws C20883K {
        if (this.A0T != null) {
        } else {
            throw C20883K.A01(A06(631, 8, 72) + i2 + A06(18, 24, 76), null);
        }
    }

    private void A0E(InterfaceC4855ms interfaceC4855ms, int i2) throws IOException {
        if (this.A0l.A0A() >= i2) {
            return;
        }
        if (this.A0l.A08() < i2) {
            this.A0l.A0c(Math.max(this.A0l.A08() * 2, i2));
        }
        interfaceC4855ms.readFully(this.A0l.A0l(), this.A0l.A0A(), i2 - this.A0l.A0A());
        this.A0l.A0e(i2);
    }

    private void A0F(InterfaceC4855ms interfaceC4855ms, byte[] bArr, int i2) throws IOException {
        int length = bArr.length + i2;
        int sizeWithPrefix = this.A0n.A08();
        if (sizeWithPrefix < length) {
            int sizeWithPrefix2 = length + i2;
            this.A0n.A0i(Arrays.copyOf(bArr, sizeWithPrefix2));
        } else {
            byte[] bArrA0l = this.A0n.A0l();
            int sizeWithPrefix3 = bArr.length;
            System.arraycopy(bArr, 0, bArrA0l, 0, sizeWithPrefix3);
        }
        byte[] bArrA0l2 = this.A0n.A0l();
        int sizeWithPrefix4 = bArr.length;
        interfaceC4855ms.readFully(bArrA0l2, sizeWithPrefix4, i2);
        this.A0n.A0f(0);
        this.A0n.A0e(length);
    }

    private void A0G(InterfaceC4855ms interfaceC4855ms, byte[] bArr, int i2, int i3) throws IOException {
        int iMin = Math.min(i3, this.A0k.A07());
        int pendingStrippedBytes = i2 + iMin;
        interfaceC4855ms.readFully(bArr, pendingStrippedBytes, i3 - iMin);
        if (iMin > 0) {
            this.A0k.A0k(bArr, i2, iMin);
        }
    }

    private final void A0H(C3025Io c3025Io, int i2, InterfaceC4855ms interfaceC4855ms, int i3) throws IOException {
        if (i2 == 4) {
            if (A06(1280, 5, 88).equals(c3025Io.A0d)) {
                this.A0o.A0d(i3);
                interfaceC4855ms.readFully(this.A0o.A0l(), 0, i3);
                return;
            }
        }
        interfaceC4855ms.AK3(i3);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0069  */
    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:33:0x010e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0129  */
    /* JADX WARN: Code duplicated, block: B:40:0x014e A[LOOP:0: B:34:0x0121->B:40:0x014e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0133 A[SYNTHETIC] */
    @RequiresNonNull({"#1.output"})
    private void A0I(C3025Io c3025Io, long j2, int i2, int i3, int i4) {
        int i5;
        String strA06;
        int iA09;
        int iA0A = i3;
        if (c3025Io.A0c != null) {
            c3025Io.A0c.A04(c3025Io.A0b, j2, i2, iA0A, i4, c3025Io.A0a);
        } else {
            if (!A06(PointerIconCompat.TYPE_NO_DROP, 11, 56).equals(c3025Io.A0d)) {
                boolean zEquals = A06(1002, 10, 101).equals(c3025Io.A0d);
                if (A0u[7].length() == 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0u;
                strArr[2] = "WUIRLQPYspP06jV";
                strArr[4] = "IKED97K2catgdGs9C7";
                if (!zEquals) {
                    if (A06(1023, 13, 32).equals(c3025Io.A0d)) {
                        i5 = this.A03;
                        strA06 = A06(869, 17, 79);
                        if (i5 > 1) {
                            AbstractC21714g.A07(strA06, A06(1044, 40, 124));
                        } else if (this.A0D == -9223372036854775807L) {
                            AbstractC21714g.A07(strA06, A06(1084, 42, 31));
                        } else {
                            A0K(c3025Io.A0d, this.A0D, this.A0n.A0l());
                            for (iA09 = this.A0n.A09(); iA09 < this.A0n.A0A(); iA09++) {
                                if (this.A0n.A0l()[iA09] == 0) {
                                    this.A0n.A0e(iA09);
                                    break;
                                }
                            }
                            c3025Io.A0b.AIr(this.A0n, this.A0n.A0A());
                            iA0A += this.A0n.A0A();
                        }
                    }
                } else {
                    i5 = this.A03;
                    strA06 = A06(869, 17, 79);
                    if (i5 > 1) {
                        AbstractC21714g.A07(strA06, A06(1044, 40, 124));
                    } else if (this.A0D == -9223372036854775807L) {
                        AbstractC21714g.A07(strA06, A06(1084, 42, 31));
                    } else {
                        A0K(c3025Io.A0d, this.A0D, this.A0n.A0l());
                        while (iA09 < this.A0n.A0A()) {
                            if (this.A0n.A0l()[iA09] == 0) {
                                this.A0n.A0e(iA09);
                                break;
                            }
                        }
                        c3025Io.A0b.AIr(this.A0n, this.A0n.A0A());
                        iA0A += this.A0n.A0A();
                    }
                }
            } else {
                i5 = this.A03;
                strA06 = A06(869, 17, 79);
                if (i5 > 1) {
                    AbstractC21714g.A07(strA06, A06(1044, 40, 124));
                } else if (this.A0D == -9223372036854775807L) {
                    AbstractC21714g.A07(strA06, A06(1084, 42, 31));
                } else {
                    A0K(c3025Io.A0d, this.A0D, this.A0n.A0l());
                    while (iA09 < this.A0n.A0A()) {
                        if (this.A0n.A0l()[iA09] == 0) {
                            this.A0n.A0e(iA09);
                            break;
                        }
                    }
                    c3025Io.A0b.AIr(this.A0n, this.A0n.A0A());
                    iA0A += this.A0n.A0A();
                }
            }
            if ((268435456 & i2) != 0) {
                if (this.A03 > 1) {
                    C21864v c21864v = this.A0o;
                    String[] strArr2 = A0u;
                    if (strArr2[5].length() != strArr2[6].length()) {
                        String[] strArr3 = A0u;
                        strArr3[1] = "YYsRZc3YFjjR6whUDZFnD2lR7qwR3xQu";
                        strArr3[0] = "iPCTe70V3RVZDGWrxpNWfBz9u5oW1N1r";
                        c21864v.A0d(0);
                    } else {
                        A0u[3] = "dzMIMRhm8kdQoNm85GuPxt1OFbbjzRAM";
                        c21864v.A0d(0);
                    }
                } else {
                    int iA0A2 = this.A0o.A0A();
                    c3025Io.A0b.AIs(this.A0o, iA0A2, 2);
                    iA0A += iA0A2;
                }
            }
            InterfaceC2953Hd interfaceC2953Hd = c3025Io.A0b;
            C2951Hb c2951Hb = c3025Io.A0a;
            String[] strArr4 = A0u;
            if (strArr4[5].length() != strArr4[6].length()) {
                String[] strArr5 = A0u;
                strArr5[1] = "aEC8Q2NERZhQKbY6SRlQy9B7oXJI5nDv";
                strArr5[0] = "M5BYDTb0V4PW6b5ziiSZklpOYuXfea8a";
                interfaceC2953Hd.AIu(j2, i2, iA0A, i4, c2951Hb);
            } else {
                interfaceC2953Hd.AIu(j2, i2, iA0A, i4, c2951Hb);
            }
        }
        this.A0X = true;
    }

    private final void A0J(C3025Io c3025Io, InterfaceC4855ms interfaceC4855ms, int i2) throws IOException {
        if (c3025Io.A0n != 1685485123) {
            int i3 = c3025Io.A0n;
            String[] strArr = A0u;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[2] = "z7J25JPdzWy80Kd";
            strArr2[4] = "xEqpvZ1X3IvVWW9v69";
            if (i3 != 1685480259) {
                interfaceC4855ms.AK3(i2);
                return;
            }
        }
        c3025Io.A0k = new byte[i2];
        interfaceC4855ms.readFully(c3025Io.A0k, 0, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    public static void A0K(String str, long j2, byte[] bArr) {
        byte b;
        String[] strArr;
        byte[] bArrA0O;
        int i2;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals(A06(1002, 10, 101))) {
                    b = 1;
                } else {
                    b = -1;
                }
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr2 = A0u;
                    strArr2[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                    strArr2[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                    switch (b) {
                        case 0:
                            bArrA0O = A0O(j2, A06(75, 19, 63), 1000L);
                            i2 = 19;
                            break;
                        case 1:
                            bArrA0O = A0O(j2, A06(56, 19, 70), WorkRequest.MIN_BACKOFF_MILLIS);
                            i2 = 21;
                            break;
                        case 2:
                            bArrA0O = A0O(j2, A06(94, 19, 58), 1000L);
                            i2 = 25;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    System.arraycopy(bArrA0O, 0, bArr, i2, bArrA0O.length);
                    return;
                }
                throw new RuntimeException();
            case 1045209816:
                String[] strArr3 = A0u;
                if (strArr3[1].charAt(1) != strArr3[0].charAt(1)) {
                    String[] strArr4 = A0u;
                    strArr4[5] = "hOu1CB2frr";
                    strArr4[6] = "vZrPTqET3LPV3435yPIFppSrF";
                    if (str.equals(A06(1023, 13, 32))) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    strArr = A0u;
                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                        String[] strArr5 = A0u;
                        strArr5[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                        strArr5[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                        switch (b) {
                            case 0:
                                bArrA0O = A0O(j2, A06(75, 19, 63), 1000L);
                                i2 = 19;
                                break;
                            case 1:
                                bArrA0O = A0O(j2, A06(56, 19, 70), WorkRequest.MIN_BACKOFF_MILLIS);
                                i2 = 21;
                                break;
                            case 2:
                                bArrA0O = A0O(j2, A06(94, 19, 58), 1000L);
                                i2 = 25;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrA0O, 0, bArr, i2, bArrA0O.length);
                        return;
                    }
                }
                throw new RuntimeException();
            case 1422270023:
                if (str.equals(A06(PointerIconCompat.TYPE_NO_DROP, 11, 56))) {
                    b = 0;
                } else {
                    b = -1;
                }
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr6 = A0u;
                    strArr6[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                    strArr6[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                    switch (b) {
                        case 0:
                            bArrA0O = A0O(j2, A06(75, 19, 63), 1000L);
                            i2 = 19;
                            break;
                        case 1:
                            bArrA0O = A0O(j2, A06(56, 19, 70), WorkRequest.MIN_BACKOFF_MILLIS);
                            i2 = 21;
                            break;
                        case 2:
                            bArrA0O = A0O(j2, A06(94, 19, 58), 1000L);
                            i2 = 25;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    System.arraycopy(bArrA0O, 0, bArr, i2, bArrA0O.length);
                    return;
                }
                throw new RuntimeException();
            default:
                b = -1;
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr7 = A0u;
                    strArr7[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                    strArr7[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                    switch (b) {
                        case 0:
                            bArrA0O = A0O(j2, A06(75, 19, 63), 1000L);
                            i2 = 19;
                            break;
                        case 1:
                            bArrA0O = A0O(j2, A06(56, 19, 70), WorkRequest.MIN_BACKOFF_MILLIS);
                            i2 = 21;
                            break;
                        case 2:
                            bArrA0O = A0O(j2, A06(94, 19, 58), 1000L);
                            i2 = 25;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    System.arraycopy(bArrA0O, 0, bArr, i2, bArrA0O.length);
                    return;
                }
                throw new RuntimeException();
        }
    }

    private boolean A0L(C2945HV c2945hv, long j2) {
        if (this.A0c) {
            this.A0L = j2;
            c2945hv.A00 = this.A0H;
            this.A0c = false;
            return true;
        }
        if (!this.A0e || this.A0L == -1) {
            return false;
        }
        c2945hv.A00 = this.A0L;
        this.A0L = -1L;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0300  */
    /* JADX WARN: Code duplicated, block: B:124:0x032d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:6:0x000d A[RETURN] */
    public static boolean A0M(String str) {
        byte b;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(A06(1178, 14, 32))) {
                    b = 6;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -2095575984:
                if (str.equals(A06(1222, 14, 102))) {
                    b = 4;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1985379776:
                boolean zEquals = str.equals(A06(207, 8, 108));
                if (A0u[7].length() != 16) {
                    A0u[3] = "TzGfoRLFuVo7UwCT9UC1nsicdZWWDAlG";
                    if (zEquals) {
                        b = 23;
                    }
                } else if (zEquals) {
                    b = 23;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1784763192:
                if (str.equals(A06(263, 8, 57))) {
                    b = 18;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1730367663:
                if (str.equals(A06(271, 8, C1137R.styleable.ConstraintSet_pivotAnchor))) {
                    b = 12;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1482641358:
                if (str.equals(A06(189, 9, 108))) {
                    b = 14;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1482641357:
                if (str.equals(A06(198, 9, 79))) {
                    b = 15;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1373388978:
                if (str.equals(A06(1252, 15, 22))) {
                    b = 9;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -933872740:
                if (str.equals(A06(984, 8, 98))) {
                    b = 32;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -538363189:
                if (str.equals(A06(1192, 15, 60))) {
                    b = 5;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -538363109:
                if (str.equals(A06(1207, 15, 14))) {
                    b = 7;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -425012669:
                if (str.equals(A06(1036, 8, 30))) {
                    b = 30;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -356037306:
                if (str.equals(A06(163, 14, 29))) {
                    b = 21;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 62923557:
                if (str.equals(A06(135, 5, 19))) {
                    b = 13;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 62923603:
                if (str.equals(A06(140, 5, 90))) {
                    b = 16;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 62927045:
                if (str.equals(A06(145, 5, C1137R.styleable.ConstraintSet_quantizeMotionSteps))) {
                    b = 19;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 82318131:
                if (str.equals(A06(1166, 5, C1137R.styleable.ConstraintSet_quantizeMotionSteps))) {
                    b = 2;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 82338133:
                boolean zEquals2 = str.equals(A06(1275, 5, 72));
                if (A0u[7].length() != 16) {
                    String[] strArr = A0u;
                    strArr[5] = "F8wfBLRr4t";
                    strArr[6] = "m6KkyOOVg8X0ndZUQG2mgE6hH";
                    if (zEquals2) {
                        b = 0;
                    }
                } else {
                    String[] strArr2 = A0u;
                    strArr2[1] = "SKDMUFdFJPMXubKSzq5KjaXHZATq3OUF";
                    strArr2[0] = "Ghj8mYRv51e2wMnC9FEKaN4eHBhVqIAQ";
                    if (zEquals2) {
                        b = 0;
                    }
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 82338134:
                if (str.equals(A06(1280, 5, 88))) {
                    b = 1;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 99146302:
                if (str.equals(A06(992, 10, 54))) {
                    b = 31;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 444813526:
                if (str.equals(A06(1267, 8, 31))) {
                    b = 10;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 542569478:
                if (str.equals(A06(150, 13, C1137R.styleable.ConstraintSet_quantizeMotionSteps))) {
                    b = 20;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 635596514:
                String[] strArr3 = A0u;
                if (strArr3[1].charAt(1) != strArr3[0].charAt(1)) {
                    A0u[3] = "7MRDpRiWazQnh7KPJAJl4vRwzLx1BKGb";
                    if (str.equals(A06(221, 16, 31))) {
                        b = 26;
                    }
                } else {
                    String[] strArr4 = A0u;
                    strArr4[5] = "W6YXr1xbPB";
                    strArr4[6] = "Gbq52SJwNi9qAu2AjciLJePWO";
                    if (str.equals(A06(221, 16, 31))) {
                        b = 26;
                    }
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 725948237:
                boolean zEquals3 = str.equals(A06(237, 13, 31));
                if (A0u[7].length() == 16) {
                    throw new RuntimeException();
                }
                A0u[7] = "zUYiT8JvqtzTusXd0wwrN";
                if (zEquals3) {
                    b = 25;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 725957860:
                if (str.equals(A06(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 13, 65))) {
                    b = 24;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 738597099:
                if (str.equals(A06(1002, 10, 101))) {
                    b = 28;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 855502857:
                if (str.equals(A06(1236, 16, 47))) {
                    b = 8;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1045209816:
                String[] strArr5 = A0u;
                if (strArr5[2].length() == strArr5[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr6 = A0u;
                strArr6[1] = "l6rfMqL6uO4vJf2wQ9BlcS80aS9RAxdU";
                strArr6[0] = "kDo3bZmmggKJDtMwpBeZtATIDXYPDXog";
                if (str.equals(A06(1023, 13, 32))) {
                    b = 29;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1422270023:
                if (str.equals(A06(PointerIconCompat.TYPE_NO_DROP, 11, 56))) {
                    b = 27;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1809237540:
                if (str.equals(A06(1171, 7, 100))) {
                    b = 3;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1950749482:
                if (str.equals(A06(177, 6, 53))) {
                    b = 17;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1950789798:
                if (str.equals(A06(183, 6, 35))) {
                    b = 22;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1951062397:
                if (str.equals(A06(215, 6, 82))) {
                    b = 11;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
        }
        b = -1;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                return true;
            default:
                return false;
        }
    }

    public static byte[] A0O(long j2, String str, long j3) {
        AbstractC21273y.A07(j2 != -9223372036854775807L);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - ((((long) i2) * 3600) * 1000000);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - ((((long) i3) * 60) * 1000000);
        int i4 = (int) (j5 / 1000000);
        int minutes = (int) ((j5 - (((long) i4) * 1000000)) / j3);
        return AbstractC22035C.A1G(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(minutes)));
    }

    public static int[] A0P(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        if (iArr.length >= i2) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i2)];
    }

    public static /* synthetic */ InterfaceC2923H9[] A0Q() {
        return new InterfaceC2923H9[]{new MatroskaExtractor()};
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "Adding support for AR/VR TAGs")
    public final int A0R(int i2) {
        switch (i2) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 26568:
            case 28032:
            case 29555:
            case 30113:
            case 30320:
            case 290298740:
            case 307544935:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                String[] strArr = A0u;
                if (strArr[2].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0u;
                strArr2[1] = "HyhNlEIHHjvGo8KvAMWihGCcOuKz7U7o";
                strArr2[0] = "rV4cPIzb4RrvL4U1RF1zVSCUyrwoic3K";
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            case 17543:
            case 17827:
                return 6;
            default:
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public final void A0S(int i2) throws C20883K {
        A09();
        switch (i2) {
            case 160:
                if (this.A05 == 2) {
                    C3025Io c3025Io = this.A0P.get(this.A06);
                    c3025Io.A06();
                    if (this.A0E > 0 && A06(215, 6, 82).equals(c3025Io.A0d)) {
                        this.A0o.A0i(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0E).array());
                    }
                    int sampleFlags = 0;
                    if (A0u[7].length() != 16) {
                        String[] strArr = A0u;
                        strArr[5] = "BDPY36VwNm";
                        strArr[6] = "7hC1KMOm7DpnqonjeX0jtoaYt";
                        for (int sampleOffset = 0; sampleOffset < i; sampleOffset++) {
                            int i3 = this.A0f[sampleOffset];
                            sampleFlags += i3;
                            break;
                        }
                        for (int i4 = 0; i4 < sampleOffset; i4++) {
                            long j2 = this.A0F;
                            int sampleOffset2 = c3025Io.A0I;
                            long j3 = j2 + ((long) ((sampleOffset2 * i4) / 1000));
                            int i5 = this.A02;
                            if (i4 == 0 && !this.A0W) {
                                i5 |= 1;
                            }
                            int i6 = this.A0f[i4];
                            sampleFlags -= i6;
                            A0I(c3025Io, j3, i5, i6, sampleFlags);
                            break;
                        }
                        this.A05 = 0;
                        return;
                    }
                    throw new RuntimeException();
                }
                return;
            case 174:
                C3025Io c3025Io2 = (C3025Io) AbstractC21273y.A02(this.A0T);
                if (c3025Io2.A0d != null) {
                    if (A0M(c3025Io2.A0d)) {
                        c3025Io2.A0G(this.A0S, c3025Io2.A0R);
                        this.A0P.put(c3025Io2.A0R, c3025Io2);
                    }
                    this.A0T = null;
                    return;
                }
                throw C20883K.A01(A06(333, 40, 74), null);
            case 19899:
                int i7 = this.A0C;
                String[] strArr2 = A0u;
                if (strArr2[1].charAt(1) != strArr2[0].charAt(1)) {
                    A0u[7] = "tg6sq0stTi0cIlF7Upi0qsQ5QklGxJF";
                    if (i7 != -1) {
                        if (this.A0K != -1) {
                            if (this.A0C == 475249515) {
                                this.A0H = this.A0K;
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    String[] strArr3 = A0u;
                    strArr3[2] = "yLIpCO5kJmqKflO";
                    strArr3[4] = "mFIbnXIm9TTTynra4E";
                    if (i7 != -1) {
                        if (this.A0K != -1) {
                            if (this.A0C == 475249515) {
                                this.A0H = this.A0K;
                                return;
                            }
                            return;
                        }
                    }
                }
                throw C20883K.A01(A06(819, 50, C1137R.styleable.ConstraintSet_transitionEasing), null);
            case 25152:
                A0D(i2);
                if (!this.A0T.A0i) {
                    return;
                }
                if (this.A0T.A0a != null) {
                    this.A0T.A0Z = new DrmInitData(new DrmInitData.SchemeData(AbstractC20442Y.A03, A06(1365, 10, 66), this.A0T.A0a.A03));
                    return;
                }
                throw C20883K.A01(A06(639, 55, 62), null);
            case 28032:
                A0D(i2);
                if (!this.A0T.A0i || this.A0T.A0m == null) {
                    return;
                } else {
                    throw C20883K.A01(A06(373, 53, 58), null);
                }
            case 357149030:
                long j4 = this.A0O;
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[7] = "WZACEI803UG8FVl";
                if (j4 == -9223372036854775807L) {
                    this.A0O = 1000000L;
                }
                if (this.A0I != -9223372036854775807L) {
                    this.A0J = A03(this.A0I);
                    return;
                }
                return;
            case 374648427:
                if (this.A0P.size() != 0) {
                    this.A0S.A6O();
                    return;
                }
                throw C20883K.A01(A06(925, 26, 98), null);
            case 475249515:
                if (!this.A0e) {
                    this.A0S.AJ7(A04(this.A0R, this.A0Q));
                    this.A0e = true;
                }
                this.A0R = null;
                this.A0Q = null;
                return;
            default:
                return;
        }
    }

    public final void A0T(int i2, double d) throws C20883K {
        switch (i2) {
            case 181:
                C3025Io c3025IoA05 = A05(i2);
                int i3 = (int) d;
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[7] = "mnSBpt4UIloiGRhCy1GZQUK3TYQANP";
                c3025IoA05.A0T = i3;
                return;
            case 17545:
                this.A0I = (long) d;
                return;
            case 21969:
                A05(i2).A06 = (float) d;
                return;
            case 21970:
                C3025Io c3025IoA06 = A05(i2);
                if (A0u[7].length() != 16) {
                    A0u[7] = "bgRhYiIqKVlSmtLlUnVbMuj";
                    c3025IoA06.A07 = (float) d;
                    return;
                } else {
                    c3025IoA06.A07 = (float) d;
                    return;
                }
            case 21971:
                A05(i2).A04 = (float) d;
                return;
            case 21972:
                A05(i2).A05 = (float) d;
                return;
            case 21973:
                A05(i2).A02 = (float) d;
                return;
            case 21974:
                A05(i2).A03 = (float) d;
                return;
            case 21975:
                A05(i2).A0B = (float) d;
                return;
            case 21976:
                C3025Io c3025IoA07 = A05(i2);
                float f2 = (float) d;
                String[] strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    A0u[7] = "0K";
                    c3025IoA07.A0C = f2;
                    return;
                }
                throw new RuntimeException();
            case 21977:
                A05(i2).A00 = (float) d;
                return;
            case 21978:
                A05(i2).A01 = (float) d;
                return;
            case 30323:
                A05(i2).A0A = (float) d;
                return;
            case 30324:
                A05(i2).A08 = (float) d;
                return;
            case 30325:
                A05(i2).A09 = (float) d;
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x027f A[EDGE_INSN: B:123:0x027f->B:66:0x027f BREAK  A[LOOP:1: B:62:0x0248->B:127:0x0248], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x027f A[EDGE_INSN: B:124:0x027f->B:66:0x027f BREAK  A[LOOP:1: B:62:0x0248->B:127:0x0248], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x01be  */
    /* JADX WARN: Code duplicated, block: B:90:0x033a A[LOOP:4: B:89:0x0338->B:90:0x033a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x035c  */
    public final void A0U(int i2, int i3, InterfaceC4855ms interfaceC4855ms) throws IOException {
        int i4;
        byte[] bArrA0l;
        int iCharAt;
        int totalSamplesSize;
        int i5;
        int i6;
        int timecode;
        int totalSamplesSize2 = 0;
        int i7 = 1;
        switch (i2) {
            case 161:
            case 163:
                if (this.A05 == 0) {
                    this.A06 = (int) this.A0r.A05(interfaceC4855ms, false, true, 8);
                    this.A07 = this.A0r.A04();
                    String[] strArr = A0u;
                    if (strArr[5].length() == strArr[6].length()) {
                        this.A0D = -9223372036854775807L;
                        this.A05 = 1;
                        this.A0l.A0d(0);
                    } else {
                        String[] strArr2 = A0u;
                        strArr2[1] = "LCHoyUIFh4JbWXc3a57uog3rKRFOb5wV";
                        strArr2[0] = "47gJribS0awN4nsHBZkjm7XOEmPrRfLr";
                        this.A0D = -9223372036854775807L;
                        this.A05 = 1;
                        this.A0l.A0d(0);
                    }
                }
                C3025Io c3025Io = this.A0P.get(this.A06);
                if (c3025Io != null) {
                    c3025Io.A06();
                    if (this.A05 == 1) {
                        A0E(interfaceC4855ms, 3);
                        int byteValue = (this.A0l.A0l()[2] & 6) >> 1;
                        int i8 = 255;
                        if (byteValue != 0) {
                            A0E(interfaceC4855ms, 4);
                            int timecode2 = this.A0l.A0l()[3];
                            this.A03 = (timecode2 & 255) + 1;
                            int[] iArr = this.A0f;
                            int timecode3 = this.A03;
                            this.A0f = A0P(iArr, timecode3);
                            if (byteValue == 2) {
                                int timecode4 = this.A07;
                                int i9 = (i3 - timecode4) - 4;
                                int timecode5 = this.A03;
                                int i10 = i9 / timecode5;
                                int[] iArr2 = this.A0f;
                                int blockLacingSampleSize = this.A03;
                                Arrays.fill(iArr2, 0, blockLacingSampleSize, i10);
                            } else if (byteValue != 1) {
                                if (byteValue == 3) {
                                    int i11 = 0;
                                    int sampleIndex = 4;
                                    int i12 = 0;
                                    while (i12 < this.A03 - i7) {
                                        this.A0f[i12] = totalSamplesSize2;
                                        sampleIndex++;
                                        A0E(interfaceC4855ms, sampleIndex);
                                        C21864v c21864v = this.A0l;
                                        if (A0u[7].length() == 16) {
                                            break;
                                        } else {
                                            A0u[7] = "lQQ4f1MYxOwR1g4uON0whOI";
                                            if (c21864v.A0l()[sampleIndex - 1] != 0) {
                                                long j2 = 0;
                                                int i13 = 0;
                                                while (true) {
                                                    if (i13 < 8) {
                                                        int i14 = i7 << (7 - i13);
                                                        C21864v c21864v2 = this.A0l;
                                                        String[] strArr3 = A0u;
                                                        String str = strArr3[1];
                                                        String str2 = strArr3[0];
                                                        int iCharAt2 = str.charAt(1);
                                                        int lengthMask = str2.charAt(1);
                                                        if (iCharAt2 != lengthMask) {
                                                            A0u[3] = "6gmtIRdzQjg9uolj5CgbNQmEFE2eXosQ";
                                                            if ((c21864v2.A0l()[sampleIndex - 1] & i14) != 0) {
                                                                int totalSamplesSize3 = sampleIndex - 1;
                                                                sampleIndex += i13;
                                                                A0E(interfaceC4855ms, sampleIndex);
                                                                i4 = totalSamplesSize3 + 1;
                                                                int totalSamplesSize4 = this.A0l.A0l()[totalSamplesSize3] & i8;
                                                                int lengthMask2 = ~i14;
                                                                j2 = totalSamplesSize4 & lengthMask2;
                                                                while (i4 < sampleIndex) {
                                                                    int readPosition = i4 + 1;
                                                                    j2 = (j2 << 8) | ((long) (this.A0l.A0l()[i4] & i8));
                                                                    i4 = readPosition;
                                                                }
                                                                if (i12 > 0) {
                                                                    j2 -= (1 << ((i13 * 7) + 6)) - 1;
                                                                }
                                                            } else {
                                                                i13++;
                                                                i7 = 1;
                                                            }
                                                        } else if ((c21864v2.A0l()[sampleIndex - 1] & i14) != 0) {
                                                            int totalSamplesSize5 = sampleIndex - 1;
                                                            sampleIndex += i13;
                                                            A0E(interfaceC4855ms, sampleIndex);
                                                            i4 = totalSamplesSize5 + 1;
                                                            int totalSamplesSize6 = this.A0l.A0l()[totalSamplesSize5] & i8;
                                                            int lengthMask3 = ~i14;
                                                            j2 = totalSamplesSize6 & lengthMask3;
                                                            while (i4 < sampleIndex) {
                                                                int readPosition2 = i4 + 1;
                                                                j2 = (j2 << 8) | ((long) (this.A0l.A0l()[i4] & i8));
                                                                i4 = readPosition2;
                                                            }
                                                            if (i12 > 0) {
                                                                j2 -= (1 << ((i13 * 7) + 6)) - 1;
                                                            }
                                                        } else {
                                                            i13++;
                                                            i7 = 1;
                                                        }
                                                    }
                                                    if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                                        int i15 = (int) j2;
                                                        int[] iArr3 = this.A0f;
                                                        if (i12 != 0) {
                                                            i15 += this.A0f[i12 - 1];
                                                        }
                                                        iArr3[i12] = i15;
                                                        i11 += this.A0f[i12];
                                                        i12++;
                                                        i8 = 255;
                                                        totalSamplesSize2 = 0;
                                                        i7 = 1;
                                                    } else {
                                                        throw C20883K.A01(A06(578, 37, 14), null);
                                                    }
                                                }
                                            } else {
                                                throw C20883K.A01(A06(951, 33, 25), null);
                                            }
                                        }
                                    }
                                    this.A0f[this.A03 - 1] = ((i3 - this.A07) - sampleIndex) - i11;
                                } else {
                                    throw C20883K.A01(A06(1141, 25, 80) + byteValue, null);
                                }
                            } else {
                                int i16 = 0;
                                int i17 = 4;
                                int i18 = 0;
                                while (true) {
                                    int i19 = this.A03;
                                    if (A0u[3].charAt(5) != 'R') {
                                        if (i18 >= i19 - 1) {
                                        }
                                        this.A0f[i18] = 0;
                                        while (true) {
                                            i17++;
                                            A0E(interfaceC4855ms, i17);
                                            bArrA0l = this.A0l.A0l();
                                            String[] strArr4 = A0u;
                                            String str3 = strArr4[1];
                                            String str4 = strArr4[0];
                                            iCharAt = str3.charAt(1);
                                            totalSamplesSize = str4.charAt(1);
                                            if (iCharAt != totalSamplesSize) {
                                                String[] strArr5 = A0u;
                                                strArr5[1] = "QqySTVYSyUdR3w6zpaSbgPrcegDpRTeR";
                                                strArr5[0] = "gT3bwZtYi7wT97ycLVgitbKLuY9aoVNS";
                                                int totalSamplesSize7 = i17 - 1;
                                                i5 = bArrA0l[totalSamplesSize7] & 255;
                                                int[] iArr4 = this.A0f;
                                                int totalSamplesSize8 = iArr4[i18];
                                                iArr4[i18] = totalSamplesSize8 + i5;
                                                if (i5 != 255) {
                                                }
                                            } else {
                                                A0u[7] = "opIzPavLvAV6dvwDrp1";
                                                int totalSamplesSize9 = i17 - 1;
                                                i6 = bArrA0l[totalSamplesSize9] & 255;
                                                int[] iArr5 = this.A0f;
                                                int totalSamplesSize10 = iArr5[i18];
                                                iArr5[i18] = totalSamplesSize10 + i6;
                                                if (i6 != 255) {
                                                }
                                            }
                                            break;
                                        }
                                        int totalSamplesSize11 = this.A0f[i18];
                                        i16 += totalSamplesSize11;
                                        i18++;
                                    } else {
                                        String[] strArr6 = A0u;
                                        strArr6[1] = "uG7prxZBXLM0QG5e8GSw94nYMCP7upCE";
                                        strArr6[0] = "tV31aGArCsXy4K1N5Jjs7nQ9FZDzw28J";
                                        if (i18 >= i19 - 1) {
                                        }
                                        this.A0f[i18] = 0;
                                        while (true) {
                                            i17++;
                                            A0E(interfaceC4855ms, i17);
                                            bArrA0l = this.A0l.A0l();
                                            String[] strArr7 = A0u;
                                            String str5 = strArr7[1];
                                            String str6 = strArr7[0];
                                            iCharAt = str5.charAt(1);
                                            totalSamplesSize = str6.charAt(1);
                                            if (iCharAt != totalSamplesSize) {
                                                String[] strArr8 = A0u;
                                                strArr8[1] = "QqySTVYSyUdR3w6zpaSbgPrcegDpRTeR";
                                                strArr8[0] = "gT3bwZtYi7wT97ycLVgitbKLuY9aoVNS";
                                                int totalSamplesSize12 = i17 - 1;
                                                i5 = bArrA0l[totalSamplesSize12] & 255;
                                                int[] iArr6 = this.A0f;
                                                int totalSamplesSize13 = iArr6[i18];
                                                iArr6[i18] = totalSamplesSize13 + i5;
                                                if (i5 != 255) {
                                                }
                                            } else {
                                                A0u[7] = "opIzPavLvAV6dvwDrp1";
                                                int totalSamplesSize14 = i17 - 1;
                                                i6 = bArrA0l[totalSamplesSize14] & 255;
                                                int[] iArr7 = this.A0f;
                                                int totalSamplesSize15 = iArr7[i18];
                                                iArr7[i18] = totalSamplesSize15 + i6;
                                                if (i6 != 255) {
                                                }
                                            }
                                            break;
                                        }
                                        int totalSamplesSize16 = this.A0f[i18];
                                        i16 += totalSamplesSize16;
                                        i18++;
                                    }
                                }
                                int[] iArr8 = this.A0f;
                                int i20 = this.A03 - 1;
                                int totalSamplesSize17 = this.A07;
                                iArr8[i20] = ((i3 - totalSamplesSize17) - i17) - i16;
                            }
                        } else {
                            this.A03 = 1;
                            this.A0f = A0P(this.A0f, 1);
                            this.A0f[0] = (i3 - this.A07) - 3;
                        }
                        int lacing = this.A0l.A0l()[0];
                        this.A0F = this.A0G + A03((lacing << 8) | (this.A0l.A0l()[1] & 255));
                        int timecode6 = c3025Io.A0V;
                        if (timecode6 != 2) {
                            if (i2 == 163) {
                                byte[] bArrA0l2 = this.A0l.A0l();
                                String[] strArr9 = A0u;
                                String str7 = strArr9[1];
                                String str8 = strArr9[0];
                                int iCharAt3 = str7.charAt(1);
                                int timecode7 = str8.charAt(1);
                                if (iCharAt3 == timecode7) {
                                    throw new RuntimeException();
                                }
                                String[] strArr10 = A0u;
                                strArr10[1] = "Vc6YaXBr4sE6Z9Kledba3u83scjXoejR";
                                strArr10[0] = "GPxnjQ5uiYxzVhoi9JJVxDxAifN9s8px";
                                timecode = (bArrA0l2[2] & 128) == 128 ? 1 : 0;
                            }
                        }
                        int timecode8 = timecode != 0 ? 1 : 0;
                        this.A02 = timecode8;
                        this.A05 = 2;
                        this.A04 = 0;
                    }
                    if (i2 == 163) {
                        while (i < timecode) {
                            int[] iArr9 = this.A0f;
                            int timecode9 = this.A04;
                            int iA02 = A02(interfaceC4855ms, c3025Io, iArr9[timecode9], false);
                            c3025Io = c3025Io;
                            A0I(c3025Io, this.A0F + ((long) ((this.A04 * c3025Io.A0I) / 1000)), this.A02, iA02, 0);
                            this.A04++;
                            break;
                        }
                        this.A05 = 0;
                        return;
                    }
                    while (this.A04 < this.A03) {
                        this.A0f[this.A04] = A02(interfaceC4855ms, c3025Io, this.A0f[this.A04], true);
                        this.A04++;
                    }
                    return;
                }
                interfaceC4855ms.AK3(i3 - this.A07);
                this.A05 = 0;
                return;
            case 165:
                if (this.A05 != 2) {
                    return;
                }
                A0H(this.A0P.get(this.A06), this.A01, interfaceC4855ms, i3);
                return;
            case 16877:
                A0J(A05(i2), interfaceC4855ms, i3);
                return;
            case 16981:
                A0D(i2);
                this.A0T.A0m = new byte[i3];
                interfaceC4855ms.readFully(this.A0T.A0m, 0, i3);
                return;
            case 18402:
                byte[] bArr = new byte[i3];
                interfaceC4855ms.readFully(bArr, 0, i3);
                A05(i2).A0a = new C2951Hb(1, bArr, 0, 0);
                return;
            case 21419:
                Arrays.fill(this.A0m.A0l(), (byte) 0);
                interfaceC4855ms.readFully(this.A0m.A0l(), 4 - i3, i3);
                this.A0m.A0f(0);
                this.A0C = (int) this.A0m.A0Q();
                return;
            case 25506:
                A0D(i2);
                String[] strArr11 = A0u;
                if (strArr11[1].charAt(1) != strArr11[0].charAt(1)) {
                    A0u[3] = "vSk1rRCvXwYs114cFInjW7yvt4gWKzzv";
                    this.A0T.A0j = new byte[i3];
                    interfaceC4855ms.readFully(this.A0T.A0j, 0, i3);
                    return;
                }
                break;
            case 30322:
                A0D(i2);
                this.A0T.A0l = new byte[i3];
                interfaceC4855ms.readFully(this.A0T.A0l, 0, i3);
                return;
            default:
                throw C20883K.A01(A06(1126, 15, 8) + i2, null);
        }
        throw new RuntimeException();
    }

    public final void A0V(int i2, long j2) throws C20883K {
        String strA06 = A06(42, 14, 63);
        switch (i2) {
            case 131:
                A05(i2).A0V = (int) j2;
                return;
            case 136:
                A05(i2).A0f = j2 == 1;
                return;
            case 155:
                this.A0D = A03(j2);
                return;
            case 159:
                A05(i2).A0E = (int) j2;
                return;
            case 176:
                A05(i2).A0W = (int) j2;
                return;
            case 179:
                A0C(i2);
                this.A0R.A04(A03(j2));
                return;
            case 186:
                A05(i2).A0M = (int) j2;
                return;
            case 215:
                A05(i2).A0R = (int) j2;
                return;
            case 231:
                this.A0G = A03(j2);
                return;
            case 238:
                this.A01 = (int) j2;
                return;
            case 241:
                if (this.A0d) {
                    return;
                }
                A0C(i2);
                this.A0Q.A04(j2);
                this.A0d = true;
                return;
            case 251:
                this.A0W = true;
                return;
            case 16871:
                A05(i2).A0n = (int) j2;
                return;
            case 16980:
                String[] strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr2 = A0u;
                    strArr2[1] = "siSTSWWHFDsKrirn3iU8fidRJrb4DuSX";
                    strArr2[0] = "o7Su23MSMUKyfq0AiKXYGeUTl03UpruG";
                    if (j2 == 3) {
                        return;
                    }
                } else {
                    String[] strArr3 = A0u;
                    strArr3[5] = "wDyyIq2mnN";
                    strArr3[6] = "u9jmr3hENDVfo4ybwkpsevoxR";
                    if (j2 == 3) {
                        return;
                    }
                }
                throw C20883K.A01(A06(426, 16, 25) + j2 + strA06, null);
            case 17029:
                if (j2 >= 1 && j2 <= 2) {
                    return;
                } else {
                    throw C20883K.A01(A06(559, 19, 27) + j2 + strA06, null);
                }
            case 17143:
                if (j2 == 1) {
                    return;
                } else {
                    throw C20883K.A01(A06(615, 16, C1137R.styleable.ConstraintSet_transitionPathRotate) + j2 + strA06, null);
                }
            case 18401:
                if (j2 == 5) {
                    return;
                } else {
                    throw C20883K.A01(A06(442, 15, 36) + j2 + strA06, null);
                }
            case 18408:
                if (j2 == 1) {
                    return;
                } else {
                    throw C20883K.A01(A06(113, 22, 77) + j2 + strA06, null);
                }
            case 20529:
                if (j2 == 0) {
                    return;
                } else {
                    throw C20883K.A01(A06(457, 21, 29) + j2 + strA06, null);
                }
            case 20530:
                if (j2 == 1) {
                    return;
                } else {
                    throw C20883K.A01(A06(478, 21, 16) + j2 + strA06, null);
                }
            case 21420:
                this.A0K = this.A0M + j2;
                return;
            case 21432:
                int i3 = (int) j2;
                A0D(i2);
                switch (i3) {
                    case 0:
                        this.A0T.A0U = 0;
                        return;
                    case 1:
                        this.A0T.A0U = 2;
                        return;
                    case 3:
                        this.A0T.A0U = 1;
                        return;
                    case 15:
                        this.A0T.A0U = 3;
                        return;
                    default:
                        return;
                }
            case 21680:
                A05(i2).A0L = (int) j2;
                return;
            case 21682:
                A05(i2).A0K = (int) j2;
                return;
            case 21690:
                A05(i2).A0J = (int) j2;
                return;
            case 21930:
                A05(i2).A0g = j2 == 1;
                return;
            case 21945:
                A0D(i2);
                switch ((int) j2) {
                    case 1:
                        C3025Io c3025Io = this.A0T;
                        if (A0u[7].length() != 16) {
                            String[] strArr4 = A0u;
                            strArr4[1] = "46IydxS7gy6otlVQjCqCZWblmnAwVrZG";
                            strArr4[0] = "ABdhU4etfaEDzGqzhVxfZNO7CdkZTY0J";
                            c3025Io.A0F = 2;
                            return;
                        }
                        c3025Io.A0F = 2;
                        return;
                    case 2:
                        this.A0T.A0F = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                A0D(i2);
                int iA01 = ColorInfo.A01((int) j2);
                if (iA01 == -1) {
                    return;
                }
                this.A0T.A0H = iA01;
                return;
            case 21947:
                A0D(i2);
                this.A0T.A0h = true;
                int iA00 = ColorInfo.A00((int) j2);
                if (iA00 == -1) {
                    return;
                }
                this.A0T.A0G = iA00;
                return;
            case 21948:
                A05(i2).A0O = (int) j2;
                return;
            case 21949:
                A05(i2).A0P = (int) j2;
                return;
            case 21998:
                A05(i2).A0N = (int) j2;
                return;
            case 22186:
                A05(i2).A0X = j2;
                return;
            case 22203:
                A05(i2).A0Y = j2;
                return;
            case 25188:
                A05(i2).A0D = (int) j2;
                return;
            case 30114:
                this.A0E = j2;
                return;
            case 30321:
                A0D(i2);
                switch ((int) j2) {
                    case 0:
                        this.A0T.A0S = 0;
                        return;
                    case 1:
                        this.A0T.A0S = 1;
                        return;
                    case 2:
                        this.A0T.A0S = 2;
                        return;
                    case 3:
                        this.A0T.A0S = 3;
                        return;
                    default:
                        return;
                }
            case 2352003:
                C3025Io c3025IoA05 = A05(i2);
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[3] = "17DkRR24xbcR08jR5ve3iaIolPHvV07P";
                c3025IoA05.A0I = (int) j2;
                return;
            case 2807729:
                this.A0O = j2;
                return;
            default:
                return;
        }
    }

    public final void A0W(int i2, long j2, long j3) throws C20883K {
        A09();
        switch (i2) {
            case 160:
                this.A0W = false;
                this.A0E = 0L;
                return;
            case 174:
                this.A0T = new C3025Io();
                return;
            case 187:
                this.A0d = false;
                return;
            case 19899:
                this.A0C = -1;
                this.A0K = -1L;
                return;
            case 20533:
                A05(i2).A0i = true;
                return;
            case 21968:
                A05(i2).A0h = true;
                return;
            case 25152:
            default:
                return;
            case 408125543:
                if (this.A0M == -1 || this.A0M == j2) {
                    this.A0M = j2;
                    this.A0N = j3;
                    return;
                }
                throw C20883K.A01(A06(886, 39, C1137R.styleable.ConstraintSet_quantizeMotionSteps), null);
            case 475249515:
                this.A0R = new C21724h();
                this.A0Q = new C21724h();
                return;
            case 524531317:
                if (this.A0e) {
                    return;
                }
                if (this.A0s && this.A0H != -1) {
                    this.A0c = true;
                    return;
                } else {
                    this.A0S.AJ7(new C4850mn(this.A0J));
                    this.A0e = true;
                    return;
                }
        }
    }

    @MetaExoPlayerCustomization("Adding support for AR/VR TAGs")
    public final void A0X(int i2, String str) throws C20883K {
        switch (i2) {
            case 134:
                A05(i2).A0d = str;
                return;
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                if (!A06(1375, 4, 110).equals(str) && !A06(1357, 8, 67).equals(str)) {
                    throw C20883K.A01(A06(551, 8, 69) + str + A06(42, 14, 63), null);
                }
                return;
            case 17827:
                this.A0U = str;
                return;
            case 21358:
                C3025Io c3025IoA05 = A05(i2);
                if (A0u[7].length() != 16) {
                    String[] strArr = A0u;
                    strArr[1] = "fMu5gmFUMMjyE5zZcj2yfEtnORci9Tka";
                    strArr[0] = "H9jO6y53WPcXDhmRgvdqczqosoX1IojD";
                    c3025IoA05.A0e = str;
                    return;
                }
                throw new RuntimeException();
            case 2274716:
                A05(i2).A0o = str;
                return;
            default:
                return;
        }
    }

    public final boolean A0Y(int i2) {
        if (i2 != 357149030 && i2 != 524531317) {
            String[] strArr = A0u;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[5] = "AFdTkHzIX2";
            strArr2[6] = "QjCHXWDM6RodCI1HM4Zn3pBBf";
            if (i2 != 475249515 && i2 != 374648427) {
                return false;
            }
        }
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AAC(InterfaceC2924HA interfaceC2924HA) {
        this.A0S = interfaceC2924HA;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final int AHL(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        this.A0X = false;
        boolean zAHO = true;
        while (zAHO && !this.A0X) {
            zAHO = this.A0q.AHO(interfaceC4855ms);
            if (zAHO && A0L(c2945hv, interfaceC4855ms.A8n())) {
                return 1;
            }
        }
        if (zAHO) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            C3025Io c3025IoValueAt = this.A0P.valueAt(i2);
            c3025IoValueAt.A06();
            c3025IoValueAt.A0E();
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AJ6(long j2, long j3) {
        this.A0G = -9223372036854775807L;
        this.A05 = 0;
        this.A0q.reset();
        this.A0r.A06();
        A0A();
        for (int i2 = 0; i2 < i; i2++) {
            this.A0P.valueAt(i2).A0F();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final boolean AK5(InterfaceC4855ms interfaceC4855ms) throws IOException {
        return new C3026Ip().A01(interfaceC4855ms);
    }
}
