package com.instagram.common.viewpoint.core;

import androidx.core.location.LocationRequestCompat;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9v */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C24789v implements InterfaceC4913np, InterfaceC4914nq {
    public static String[] A06 = {"JXRw8dEnvO1Lr4g7cFUS0dvQrSj2gCrD", "hvHNuBxl", "xmWilmV3z2eIIj1", "UUtHfwhImwRJiupXWlBcpFq10hKf2hZ3", "Gjwbiw3zcCnfnivX0C6Z4KLegMayRhyW", "PFLAFIzQgEofbdrT2htWxpP7W2gVOOgi", "405rypbMY6P", "HWuA8Rz9jBHRgd5bymvhijPSyV36G6mN"};
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC4914nq A03;
    public C4917nt[] A04 = new C4917nt[0];
    public final InterfaceC4913np A05;

    public C24789v(InterfaceC4913np interfaceC4913np, boolean z, long j2, long j3) {
        this.A05 = interfaceC4913np;
        this.A02 = z ? j2 : -9223372036854775807L;
        this.A01 = j2;
        this.A00 = j3;
    }

    private C23717u A00(long j2, C23717u c23717u) {
        long toleranceBeforeUs = AbstractC22035C.A0T(c23717u.A01, 0L, j2 - this.A01);
        long jA0T = AbstractC22035C.A0T(c23717u.A00, 0L, this.A00 == Long.MIN_VALUE ? LocationRequestCompat.PASSIVE_INTERVAL : this.A00 - j2);
        if (toleranceBeforeUs == c23717u.A01) {
            long j3 = c23717u.A00;
            if (A06[6].length() != 11) {
                throw new RuntimeException();
            }
            A06[0] = "SySHx2FlEzism2SEaRZKk1Ki9OIwKCgL";
            if (jA0T == j3) {
                return c23717u;
            }
        }
        return new C23717u(toleranceBeforeUs, jA0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2699DW
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ADV(InterfaceC4913np interfaceC4913np) {
        ((InterfaceC4914nq) AbstractC21273y.A01(this.A03)).ADV(this);
    }

    public static boolean A02(long j2, InterfaceC4876nE[] interfaceC4876nEArr) {
        if (j2 != 0) {
            for (InterfaceC4876nE interfaceC4876nE : interfaceC4876nEArr) {
                if (interfaceC4876nE != null) {
                    C5064qI c5064qIA92 = interfaceC4876nE.A92();
                    if (!AbstractC20873J.A0G(c5064qIA92.A0W, c5064qIA92.A0R)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2700DX
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4s(long j2) {
        this.A05.A4s(j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final boolean A5C(long j2) {
        return this.A05.A5C(j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final void A60(long j2, boolean z) {
        this.A05.A60(j2, z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final long A6r(long j2, C23717u c23717u) {
        if (j2 == this.A01) {
            return this.A01;
        }
        return this.A05.A6r(j2, A00(j2, c23717u));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2700DX
    @MetaExoPlayerCustomization("Added in D9949576 for unstall buffer")
    public final long A76(long j2) {
        return this.A05.A76(j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final long A78() {
        long jA78 = this.A05.A78();
        if (jA78 == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && jA78 >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return jA78;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final long A8b() {
        long jA8b = this.A05.A8b();
        if (jA8b != Long.MIN_VALUE) {
            long nextLoadPositionUs = this.A00;
            if (A06[0].charAt(29) != 'C') {
                throw new RuntimeException();
            }
            A06[0] = "QBPPyRyowan8CCGBQiXIHMf03VOUOCSC";
            if (nextLoadPositionUs == Long.MIN_VALUE || jA8b < this.A00) {
                return jA8b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final C4894nW A9M() {
        return this.A05.A9M();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final void ACS() throws IOException {
        if (0 == 0) {
            this.A05.ACS();
            return;
        }
        throw null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4914nq
    public final void AFS(InterfaceC4913np interfaceC4913np) {
        if (0 != 0) {
            return;
        }
        ((InterfaceC4914nq) AbstractC21273y.A01(this.A03)).AFS(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final void AH5(InterfaceC4914nq interfaceC4914nq, long j2) {
        this.A03 = interfaceC4914nq;
        this.A05.AH5(this, j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final long AHQ() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = -9223372036854775807L;
            long jAHQ = AHQ();
            return jAHQ != -9223372036854775807L ? jAHQ : childDiscontinuityUs;
        }
        InterfaceC4913np interfaceC4913np = this.A05;
        if (A06[2].length() == 0) {
            throw new RuntimeException();
        }
        A06[6] = "ABWUoGiNBoa";
        long jAHQ2 = interfaceC4913np.AHQ();
        if (jAHQ2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long discontinuityUs = this.A01;
        boolean z = true;
        AbstractC21273y.A08(jAHQ2 >= discontinuityUs);
        if (this.A00 != Long.MIN_VALUE) {
            long discontinuityUs2 = this.A00;
            if (jAHQ2 > discontinuityUs2) {
                z = false;
            }
        }
        AbstractC21273y.A08(z);
        return jAHQ2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final void AHW(long j2) {
        this.A05.AHW(j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final long AJ8(@MetaExoPlayerCustomization long j2, boolean z) {
        this.A02 = -9223372036854775807L;
        boolean z2 = false;
        for (C4917nt c4917nt : this.A04) {
            if (c4917nt != null) {
                c4917nt.A00();
            }
        }
        long jAJ8 = this.A05.AJ8(j2, z);
        if (jAJ8 == j2 || (jAJ8 >= this.A01 && (this.A00 == Long.MIN_VALUE || jAJ8 <= this.A00))) {
            z2 = true;
        }
        AbstractC21273y.A08(z2);
        return jAJ8;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x011d A[EDGE_INSN: B:58:0x011d->B:54:0x011d BREAK  A[LOOP:1: B:31:0x0097->B:50:0x010e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x011d A[EDGE_INSN: B:60:0x011d->B:54:0x011d BREAK  A[LOOP:1: B:31:0x0097->B:50:0x010e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x010e A[SYNTHETIC] */
    @Override // com.instagram.common.viewpoint.core.InterfaceC4913np
    public final long AJ9(InterfaceC4876nE[] interfaceC4876nEArr, boolean[] zArr, InterfaceC2696DT[] interfaceC2696DTArr, boolean[] zArr2, long j2) {
        long j3;
        boolean z;
        int i2;
        int length;
        InterfaceC2696DT[] childStreams;
        InterfaceC2696DT interfaceC2696DT;
        InterfaceC2696DT interfaceC2696DT2;
        C4917nt[] c4917ntArr;
        String[] strArr;
        this.A04 = new C4917nt[interfaceC2696DTArr.length];
        InterfaceC2696DT[] interfaceC2696DTArr2 = new InterfaceC2696DT[interfaceC2696DTArr.length];
        int i3 = 0;
        while (true) {
            InterfaceC2696DT interfaceC2696DT3 = null;
            if (i3 >= interfaceC2696DTArr.length) {
                break;
            }
            this.A04[i3] = (C4917nt) interfaceC2696DTArr[i3];
            InterfaceC2696DT[] childStreams2 = this.A04;
            if (childStreams2[i3] != null) {
                interfaceC2696DT3 = this.A04[i3].A01;
            }
            interfaceC2696DTArr2[i3] = interfaceC2696DT3;
            i3++;
        }
        long jAJ9 = this.A05.AJ9(interfaceC4876nEArr, zArr, interfaceC2696DTArr2, zArr2, j2);
        if (!A03() || j2 != this.A01) {
            j3 = -9223372036854775807L;
            this.A02 = j3;
            if (jAJ9 != j2 || (jAJ9 >= this.A01 && (this.A00 == Long.MIN_VALUE || jAJ9 <= this.A00))) {
                z = true;
            } else {
                z = false;
            }
            AbstractC21273y.A08(z);
            i2 = 0;
            while (true) {
                length = interfaceC2696DTArr.length;
                if (A06[1].length() != 30) {
                    String[] strArr2 = A06;
                    strArr2[7] = "DNi9UWzwfCWyYPkB4uGGg0YkPCShAQe6";
                    strArr2[5] = "fAixbEz1F3G47KA6JLUGcT01MO1ZofiJ";
                    if (i2 >= length) {
                        break;
                    }
                    if (interfaceC2696DTArr2[i2] == null) {
                        c4917ntArr = this.A04;
                        strArr = A06;
                        if (strArr[4].charAt(5) != strArr[3].charAt(5)) {
                            A06[6] = "ocXNdzhjsFv";
                            c4917ntArr[i2] = null;
                        }
                    } else {
                        childStreams = this.A04;
                        if (childStreams[i2] != null) {
                            interfaceC2696DT = this.A04[i2].A01;
                            interfaceC2696DT2 = interfaceC2696DTArr2[i2];
                            if (A06[1].length() != 30) {
                                String[] strArr3 = A06;
                                strArr3[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                strArr3[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                if (interfaceC2696DT != interfaceC2696DT2) {
                                    this.A04[i2] = new C4917nt(this, interfaceC2696DTArr2[i2]);
                                }
                            } else if (interfaceC2696DT != interfaceC2696DT2) {
                                this.A04[i2] = new C4917nt(this, interfaceC2696DTArr2[i2]);
                            }
                        } else {
                            this.A04[i2] = new C4917nt(this, interfaceC2696DTArr2[i2]);
                        }
                    }
                    InterfaceC2696DT[] childStreams3 = this.A04;
                    interfaceC2696DTArr[i2] = childStreams3[i2];
                    i2++;
                } else {
                    if (i2 >= length) {
                        break;
                    }
                    if (interfaceC2696DTArr2[i2] == null) {
                        c4917ntArr = this.A04;
                        strArr = A06;
                        if (strArr[4].charAt(5) != strArr[3].charAt(5)) {
                            A06[6] = "ocXNdzhjsFv";
                            c4917ntArr[i2] = null;
                        }
                    } else {
                        childStreams = this.A04;
                        if (childStreams[i2] != null) {
                            interfaceC2696DT = this.A04[i2].A01;
                            interfaceC2696DT2 = interfaceC2696DTArr2[i2];
                            if (A06[1].length() != 30) {
                                String[] strArr4 = A06;
                                strArr4[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                strArr4[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                if (interfaceC2696DT != interfaceC2696DT2) {
                                    this.A04[i2] = new C4917nt(this, interfaceC2696DTArr2[i2]);
                                }
                            } else if (interfaceC2696DT != interfaceC2696DT2) {
                                this.A04[i2] = new C4917nt(this, interfaceC2696DTArr2[i2]);
                            }
                        } else {
                            this.A04[i2] = new C4917nt(this, interfaceC2696DTArr2[i2]);
                        }
                    }
                    InterfaceC2696DT[] childStreams4 = this.A04;
                    interfaceC2696DTArr[i2] = childStreams4[i2];
                    i2++;
                }
            }
            return jAJ9;
        }
        long j4 = this.A01;
        String[] strArr5 = A06;
        if (strArr5[4].charAt(5) == strArr5[3].charAt(5)) {
            String[] strArr6 = A06;
            strArr6[7] = "en1LL2zHQFU7eKPWWtw7tqDicZnmZ9l5";
            strArr6[5] = "t66o2OzEfyctLQHjRBlZ897u0IFgDWGZ";
            if (!A02(j4, interfaceC4876nEArr)) {
                j3 = -9223372036854775807L;
            } else {
                j3 = jAJ9;
            }
            this.A02 = j3;
            if (jAJ9 != j2) {
                z = true;
            } else {
                z = true;
            }
            AbstractC21273y.A08(z);
            i2 = 0;
            while (true) {
                length = interfaceC2696DTArr.length;
                if (A06[1].length() != 30) {
                    String[] strArr7 = A06;
                    strArr7[7] = "DNi9UWzwfCWyYPkB4uGGg0YkPCShAQe6";
                    strArr7[5] = "fAixbEz1F3G47KA6JLUGcT01MO1ZofiJ";
                    if (i2 >= length) {
                        break;
                        break;
                    }
                    if (interfaceC2696DTArr2[i2] == null) {
                        c4917ntArr = this.A04;
                        strArr = A06;
                        if (strArr[4].charAt(5) != strArr[3].charAt(5)) {
                            A06[6] = "ocXNdzhjsFv";
                            c4917ntArr[i2] = null;
                        }
                    } else {
                        childStreams = this.A04;
                        if (childStreams[i2] != null) {
                            interfaceC2696DT = this.A04[i2].A01;
                            interfaceC2696DT2 = interfaceC2696DTArr2[i2];
                            if (A06[1].length() != 30) {
                                String[] strArr8 = A06;
                                strArr8[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                strArr8[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                if (interfaceC2696DT != interfaceC2696DT2) {
                                    this.A04[i2] = new C4917nt(this, interfaceC2696DTArr2[i2]);
                                }
                            } else if (interfaceC2696DT != interfaceC2696DT2) {
                                this.A04[i2] = new C4917nt(this, interfaceC2696DTArr2[i2]);
                            }
                        } else {
                            this.A04[i2] = new C4917nt(this, interfaceC2696DTArr2[i2]);
                        }
                    }
                    InterfaceC2696DT[] childStreams5 = this.A04;
                    interfaceC2696DTArr[i2] = childStreams5[i2];
                    i2++;
                } else {
                    if (i2 >= length) {
                        break;
                        break;
                    }
                    if (interfaceC2696DTArr2[i2] == null) {
                        c4917ntArr = this.A04;
                        strArr = A06;
                        if (strArr[4].charAt(5) != strArr[3].charAt(5)) {
                            A06[6] = "ocXNdzhjsFv";
                            c4917ntArr[i2] = null;
                        }
                    } else {
                        childStreams = this.A04;
                        if (childStreams[i2] != null) {
                            interfaceC2696DT = this.A04[i2].A01;
                            interfaceC2696DT2 = interfaceC2696DTArr2[i2];
                            if (A06[1].length() != 30) {
                                String[] strArr9 = A06;
                                strArr9[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                strArr9[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                if (interfaceC2696DT != interfaceC2696DT2) {
                                    this.A04[i2] = new C4917nt(this, interfaceC2696DTArr2[i2]);
                                }
                            } else if (interfaceC2696DT != interfaceC2696DT2) {
                                this.A04[i2] = new C4917nt(this, interfaceC2696DTArr2[i2]);
                            }
                        } else {
                            this.A04[i2] = new C4917nt(this, interfaceC2696DTArr2[i2]);
                        }
                    }
                    InterfaceC2696DT[] childStreams6 = this.A04;
                    interfaceC2696DTArr[i2] = childStreams6[i2];
                    i2++;
                }
            }
            return jAJ9;
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2700DX
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AJc(boolean z) {
        this.A05.AJc(z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2700DX
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AKb(byte b) {
        this.A05.AKb(b);
    }
}
