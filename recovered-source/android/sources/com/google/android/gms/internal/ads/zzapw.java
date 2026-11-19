package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.C1137R;
import com.google.android.material.internal.ViewUtils;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzapw implements zzaqa {

    /* JADX INFO: renamed from: x */
    public static final byte[] f6457x = {73, 68, 51};

    /* JADX INFO: renamed from: a */
    public final boolean f6458a;

    /* JADX INFO: renamed from: d */
    public final String f6461d;

    /* JADX INFO: renamed from: e */
    public final int f6462e;

    /* JADX INFO: renamed from: f */
    public final String f6463f;

    /* JADX INFO: renamed from: g */
    public String f6464g;

    /* JADX INFO: renamed from: h */
    public zzahm f6465h;

    /* JADX INFO: renamed from: i */
    public zzahm f6466i;

    /* JADX INFO: renamed from: m */
    public boolean f6470m;

    /* JADX INFO: renamed from: n */
    public boolean f6471n;

    /* JADX INFO: renamed from: q */
    public int f6474q;

    /* JADX INFO: renamed from: r */
    public boolean f6475r;

    /* JADX INFO: renamed from: t */
    public int f6477t;

    /* JADX INFO: renamed from: v */
    public zzahm f6479v;

    /* JADX INFO: renamed from: w */
    public long f6480w;

    /* JADX INFO: renamed from: b */
    public final zzet f6459b = new zzet(new byte[7], 7);

    /* JADX INFO: renamed from: c */
    public final zzeu f6460c = new zzeu(Arrays.copyOf(f6457x, 10));

    /* JADX INFO: renamed from: o */
    public int f6472o = -1;

    /* JADX INFO: renamed from: p */
    public int f6473p = -1;

    /* JADX INFO: renamed from: s */
    public long f6476s = -9223372036854775807L;

    /* JADX INFO: renamed from: u */
    public long f6478u = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public int f6467j = 0;

    /* JADX INFO: renamed from: k */
    public int f6468k = 0;

    /* JADX INFO: renamed from: l */
    public int f6469l = 256;

    public zzapw(int i2, String str, String str2, boolean z) {
        this.f6458a = z;
        this.f6461d = str;
        this.f6462e = i2;
        this.f6463f = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: a */
    public final void mo4303a(boolean z) {
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:123:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: b */
    public final void mo4304b(zzeu zzeuVar) throws zzat {
        byte b;
        int i2;
        int i3;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10;
        this.f6465h.getClass();
        String str = zzfm.f16091a;
        while (zzeuVar.m6360B() > 0) {
            int i11 = this.f6467j;
            zzeu zzeuVar2 = this.f6460c;
            zzet zzetVar = this.f6459b;
            int i12 = 4;
            int i13 = 3;
            byte b2 = -1;
            int i14 = 0;
            int i15 = 1;
            if (i11 == 0) {
                byte[] bArr = zzeuVar.f14887a;
                int i16 = zzeuVar.f14888b;
                int i17 = zzeuVar.f14889c;
                while (true) {
                    if (i16 < i17) {
                        int i18 = i16 + 1;
                        int i19 = i13;
                        byte b3 = bArr[i16];
                        int i20 = b3 & 255;
                        if (this.f6469l == 512 && (((((byte) i20) & 255 ? 1 : 0) | 65280 ? 1 : 0) & 65526) == 65520) {
                            if (!this.f6471n) {
                                int i21 = i16 - 1;
                                zzeuVar.m6363E(i16);
                                byte[] bArr2 = zzetVar.f14823a;
                                if (zzeuVar.m6360B() < i15) {
                                    i15 = i15;
                                } else {
                                    zzeuVar.m6366H(bArr2, i14, i15);
                                    zzetVar.m6341d(i12);
                                    int iM6345h = zzetVar.m6345h(i15);
                                    int i22 = this.f6472o;
                                    if (i22 == -1 || iM6345h == i22) {
                                        if (this.f6473p != -1) {
                                            byte[] bArr3 = zzetVar.f14823a;
                                            if (zzeuVar.m6360B() >= i15) {
                                                zzeuVar.m6366H(bArr3, i14, i15);
                                                zzetVar.m6341d(2);
                                                i8 = 4;
                                                i6 = i15;
                                                if (zzetVar.m6345h(4) == this.f6473p) {
                                                    zzeuVar.m6363E(i18);
                                                } else {
                                                    i15 = i6;
                                                }
                                            }
                                        } else {
                                            i6 = i15;
                                            i8 = 4;
                                        }
                                        byte[] bArr4 = zzetVar.f14823a;
                                        if (zzeuVar.m6360B() >= i8) {
                                            zzeuVar.m6366H(bArr4, i14, i8);
                                            zzetVar.m6341d(14);
                                            int iM6345h2 = zzetVar.m6345h(13);
                                            if (iM6345h2 >= 7) {
                                                byte[] bArr5 = zzeuVar.f14887a;
                                                int i23 = zzeuVar.f14889c;
                                                int i24 = i21 + iM6345h2;
                                                if (i24 < i23) {
                                                    byte b4 = bArr5[i24];
                                                    b = -1;
                                                    if (b4 == -1) {
                                                        int i25 = i24 + 1;
                                                        if (i25 != i23) {
                                                            byte b5 = bArr5[i25];
                                                            if ((((b5 & 255 ? 1 : 0) | 65280 ? 1 : 0) & 65526) == 65520 && ((b5 & 8) >> 3) == iM6345h) {
                                                            }
                                                        }
                                                    } else if (b4 == 73 && ((i9 = i24 + 1) == i23 || (bArr5[i9] == 68 && ((i10 = i24 + 2) == i23 || bArr5[i10] == 51)))) {
                                                    }
                                                }
                                            } else {
                                                b = -1;
                                            }
                                            i15 = i6;
                                        }
                                        this.f6474q = (b3 & 8) >> 3;
                                        i7 = i6;
                                        if (i7 != ((b3 & 1) ^ 1)) {
                                            z = 0;
                                        } else {
                                            z = i7;
                                        }
                                        this.f6470m = z;
                                        if (this.f6471n) {
                                            this.f6467j = i19;
                                            this.f6468k = 0;
                                        } else {
                                            this.f6467j = i7;
                                            this.f6468k = 0;
                                        }
                                        zzeuVar.m6363E(i18);
                                    } else {
                                        b = -1;
                                    }
                                    i2 = this.f6469l;
                                    i3 = i20 | i2;
                                    if (i3 == 329) {
                                        c = 256;
                                        c2 = 2;
                                        i13 = 3;
                                        i4 = 0;
                                        i5 = ViewUtils.EDGE_TO_EDGE_FLAGS;
                                    } else if (i3 == 511) {
                                        c = 256;
                                        c2 = 2;
                                        i13 = 3;
                                        i4 = 0;
                                        i5 = 512;
                                    } else if (i3 == 836) {
                                        c = 256;
                                        c2 = 2;
                                        i13 = 3;
                                        i4 = 0;
                                        i5 = 1024;
                                    } else if (i3 != 1075) {
                                        c = 256;
                                        if (i2 != 256) {
                                            this.f6469l = 256;
                                            b2 = b;
                                            i12 = 4;
                                            i13 = 3;
                                            i14 = 0;
                                        } else {
                                            c2 = 2;
                                            i13 = 3;
                                            i4 = 0;
                                            byte b6 = b;
                                            i14 = i4;
                                            b2 = b6;
                                            i16 = i18;
                                            i12 = 4;
                                        }
                                    } else {
                                        this.f6467j = 2;
                                        this.f6468k = 3;
                                        this.f6477t = 0;
                                        zzeuVar2.m6363E(0);
                                        zzeuVar.m6363E(i18);
                                    }
                                    this.f6469l = i5;
                                    byte b7 = b;
                                    i14 = i4;
                                    b2 = b7;
                                    i16 = i18;
                                    i12 = 4;
                                }
                                b = -1;
                                i2 = this.f6469l;
                                i3 = i20 | i2;
                                if (i3 == 329) {
                                    c = 256;
                                    c2 = 2;
                                    i13 = 3;
                                    i4 = 0;
                                    i5 = ViewUtils.EDGE_TO_EDGE_FLAGS;
                                } else if (i3 == 511) {
                                    c = 256;
                                    c2 = 2;
                                    i13 = 3;
                                    i4 = 0;
                                    i5 = 512;
                                } else if (i3 == 836) {
                                    c = 256;
                                    c2 = 2;
                                    i13 = 3;
                                    i4 = 0;
                                    i5 = 1024;
                                } else if (i3 != 1075) {
                                    c = 256;
                                    if (i2 != 256) {
                                        this.f6469l = 256;
                                        b2 = b;
                                        i12 = 4;
                                        i13 = 3;
                                        i14 = 0;
                                    } else {
                                        c2 = 2;
                                        i13 = 3;
                                        i4 = 0;
                                        byte b8 = b;
                                        i14 = i4;
                                        b2 = b8;
                                        i16 = i18;
                                        i12 = 4;
                                    }
                                } else {
                                    this.f6467j = 2;
                                    this.f6468k = 3;
                                    this.f6477t = 0;
                                    zzeuVar2.m6363E(0);
                                    zzeuVar.m6363E(i18);
                                }
                                this.f6469l = i5;
                                byte b9 = b;
                                i14 = i4;
                                b2 = b9;
                                i16 = i18;
                                i12 = 4;
                            }
                            i6 = i15;
                            this.f6474q = (b3 & 8) >> 3;
                            i7 = i6;
                            if (i7 != ((b3 & 1) ^ 1)) {
                                z = 0;
                            } else {
                                z = i7;
                            }
                            this.f6470m = z;
                            if (this.f6471n) {
                                this.f6467j = i7;
                                this.f6468k = 0;
                            } else {
                                this.f6467j = i19;
                                this.f6468k = 0;
                            }
                            zzeuVar.m6363E(i18);
                        } else {
                            b = b2;
                        }
                        i15 = i15;
                        i2 = this.f6469l;
                        i3 = i20 | i2;
                        if (i3 == 329) {
                            c = 256;
                            c2 = 2;
                            i13 = 3;
                            i4 = 0;
                            i5 = ViewUtils.EDGE_TO_EDGE_FLAGS;
                        } else if (i3 == 511) {
                            c = 256;
                            c2 = 2;
                            i13 = 3;
                            i4 = 0;
                            i5 = 512;
                        } else if (i3 == 836) {
                            c = 256;
                            c2 = 2;
                            i13 = 3;
                            i4 = 0;
                            i5 = 1024;
                        } else if (i3 != 1075) {
                            c = 256;
                            if (i2 != 256) {
                                this.f6469l = 256;
                                b2 = b;
                                i12 = 4;
                                i13 = 3;
                                i14 = 0;
                            } else {
                                c2 = 2;
                                i13 = 3;
                                i4 = 0;
                                byte b10 = b;
                                i14 = i4;
                                b2 = b10;
                                i16 = i18;
                                i12 = 4;
                            }
                        } else {
                            this.f6467j = 2;
                            this.f6468k = 3;
                            this.f6477t = 0;
                            zzeuVar2.m6363E(0);
                            zzeuVar.m6363E(i18);
                        }
                        this.f6469l = i5;
                        byte b11 = b;
                        i14 = i4;
                        b2 = b11;
                        i16 = i18;
                        i12 = 4;
                    } else {
                        zzeuVar.m6363E(i16);
                    }
                }
            } else if (i11 != 1) {
                if (i11 == 2) {
                    byte[] bArr6 = zzeuVar2.f14887a;
                    int iMin = Math.min(zzeuVar.m6360B(), 10 - this.f6468k);
                    zzeuVar.m6366H(bArr6, this.f6468k, iMin);
                    int i26 = this.f6468k + iMin;
                    this.f6468k = i26;
                    if (i26 == 10) {
                        this.f6466i.mo4121a(10, zzeuVar2);
                        zzeuVar2.m6363E(6);
                        zzahm zzahmVar = this.f6466i;
                        int iM6381g = zzeuVar2.m6381g() + 10;
                        this.f6467j = 4;
                        this.f6468k = 10;
                        this.f6479v = zzahmVar;
                        this.f6480w = 0L;
                        this.f6477t = iM6381g;
                    }
                } else if (i11 != 3) {
                    int iMin2 = Math.min(zzeuVar.m6360B(), this.f6477t - this.f6468k);
                    this.f6479v.mo4121a(iMin2, zzeuVar);
                    int i27 = this.f6468k + iMin2;
                    this.f6468k = i27;
                    if (i27 == this.f6477t) {
                        zzgtr.m7133f(this.f6478u != -9223372036854775807L);
                        this.f6479v.mo4095b(this.f6478u, 1, this.f6477t, 0, null);
                        this.f6478u += this.f6480w;
                        this.f6467j = 0;
                        this.f6468k = 0;
                        this.f6469l = 256;
                    }
                } else {
                    int i28 = true != this.f6470m ? 5 : 7;
                    byte[] bArr7 = zzetVar.f14823a;
                    int iMin3 = Math.min(zzeuVar.m6360B(), i28 - this.f6468k);
                    zzeuVar.m6366H(bArr7, this.f6468k, iMin3);
                    int i29 = this.f6468k + iMin3;
                    this.f6468k = i29;
                    if (i29 == i28) {
                        zzetVar.m6341d(0);
                        if (this.f6475r) {
                            zzetVar.m6343f(10);
                        } else {
                            int iM6345h3 = zzetVar.m6345h(2) + 1;
                            if (iM6345h3 != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(iM6345h3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(iM6345h3);
                                sb.append(", but assuming AAC LC.");
                                zzeh.m6211c("AdtsReader", sb.toString());
                            }
                            zzetVar.m6343f(5);
                            int iM6345h4 = zzetVar.m6345h(3);
                            int i30 = this.f6473p;
                            byte[] bArr8 = {(byte) (((i30 >> 1) & 7) | 16), (byte) (((iM6345h4 << 3) & C1137R.styleable.ConstraintSet_stateLabels) | ((i30 << 7) & 128))};
                            zzaex zzaexVarM4054a = zzaey.m4054a(new zzet(bArr8, 2), false);
                            zzt zztVar = new zzt();
                            zztVar.f20789a = this.f6464g;
                            zztVar.m8852d(this.f6463f);
                            zztVar.m8853e("audio/mp4a-latm");
                            zztVar.f20798j = zzaexVarM4054a.f5138c;
                            zztVar.f20780F = zzaexVarM4054a.f5137b;
                            zztVar.f20782H = zzaexVarM4054a.f5136a;
                            zztVar.f20805q = Collections.singletonList(bArr8);
                            zztVar.f20792d = this.f6461d;
                            zztVar.f20794f = this.f6462e;
                            zzv zzvVar = new zzv(zztVar);
                            this.f6476s = 1024000000 / ((long) zzvVar.f21039I);
                            this.f6465h.mo4097e(zzvVar);
                            this.f6475r = true;
                        }
                        zzetVar.m6343f(4);
                        int iM6345h5 = zzetVar.m6345h(13);
                        int i31 = iM6345h5 - 7;
                        if (this.f6470m) {
                            i31 = iM6345h5 - 9;
                        }
                        zzahm zzahmVar2 = this.f6465h;
                        long j2 = this.f6476s;
                        this.f6467j = 4;
                        this.f6468k = 0;
                        this.f6479v = zzahmVar2;
                        this.f6480w = j2;
                        this.f6477t = i31;
                    }
                }
            } else if (zzeuVar.m6360B() != 0) {
                zzetVar.f14823a[0] = zzeuVar.f14887a[zzeuVar.f14888b];
                zzetVar.m6341d(2);
                int iM6345h6 = zzetVar.m6345h(4);
                int i32 = this.f6473p;
                if (i32 == -1 || iM6345h6 == i32) {
                    if (!this.f6471n) {
                        this.f6471n = true;
                        this.f6472o = this.f6474q;
                        this.f6473p = iM6345h6;
                    }
                    this.f6467j = 3;
                    this.f6468k = 0;
                } else {
                    this.f6471n = false;
                    this.f6467j = 0;
                    this.f6468k = 0;
                    this.f6469l = 256;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: c */
    public final void mo4305c(int i2, long j2) {
        this.f6478u = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: d */
    public final void mo4306d(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.m4339a();
        zzaroVar.m4340b();
        this.f6464g = zzaroVar.f6773e;
        zzaroVar.m4340b();
        zzahm zzahmVarMo4109f = zzagdVar.mo4109f(zzaroVar.f6772d, 1);
        this.f6465h = zzahmVarMo4109f;
        this.f6479v = zzahmVarMo4109f;
        if (!this.f6458a) {
            this.f6466i = new zzafx();
            return;
        }
        zzaroVar.m4339a();
        zzaroVar.m4340b();
        zzahm zzahmVarMo4109f2 = zzagdVar.mo4109f(zzaroVar.f6772d, 5);
        this.f6466i = zzahmVarMo4109f2;
        zzt zztVar = new zzt();
        zzaroVar.m4340b();
        zztVar.f20789a = zzaroVar.f6773e;
        zztVar.m8852d(this.f6463f);
        zztVar.m8853e("application/id3");
        zzahmVarMo4109f2.mo4097e(new zzv(zztVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.f6478u = -9223372036854775807L;
        this.f6471n = false;
        this.f6467j = 0;
        this.f6468k = 0;
        this.f6469l = 256;
    }
}
