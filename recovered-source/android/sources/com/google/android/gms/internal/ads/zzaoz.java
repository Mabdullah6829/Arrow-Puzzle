package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaoz implements zzans {

    /* JADX INFO: renamed from: e */
    public static final zzank f6350e;

    /* JADX INFO: renamed from: a */
    public final zzeu f6351a = new zzeu();

    /* JADX INFO: renamed from: b */
    public final zzeu f6352b = new zzeu();

    /* JADX INFO: renamed from: c */
    public final zzaoy f6353c;

    /* JADX INFO: renamed from: d */
    public Inflater f6354d;

    static {
        zzgzi zzgziVar = zzgwt.f18303t;
        f6350e = new zzank(zzgyo.f18355w, -9223372036854775807L, -9223372036854775807L);
    }

    public zzaoz(List list) {
        int i2;
        zzaoy zzaoyVar = new zzaoy();
        this.f6353c = zzaoyVar;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = zzfm.f16091a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                zzaoyVar.f6344f = new int[strArrSplit.length];
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    int[] iArr = zzaoyVar.f6344f;
                    try {
                        i2 = Integer.parseInt(strArrSplit[i3].trim(), 16);
                    } catch (RuntimeException e) {
                        zzeh.m6212d("VobsubParser", "Parsing color failed", e);
                        i2 = 0;
                    }
                    iArr[i3] = i2;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    StringBuilder sb = new StringBuilder(str2.length() + 36);
                    sb.append("Ignoring malformed IDX size line: '");
                    sb.append(str2);
                    sb.append("'");
                    zzeh.m6211c("VobsubParser", sb.toString());
                } else {
                    try {
                        zzaoyVar.f6345g = Integer.parseInt(strArrSplit2[0]);
                        zzaoyVar.f6346h = Integer.parseInt(strArrSplit2[1]);
                        zzaoyVar.f6342d = true;
                    } catch (RuntimeException e2) {
                        zzeh.m6212d("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0234  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:109:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:111:0x02be  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d0  */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00c1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Switch 'out' block B:34:0x00ad for B:40:0x00c1 already processed. Defaulting to fallback option. */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.zzaoy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzans
    /* JADX INFO: renamed from: a */
    public final void mo4246a(byte[] bArr, int i2, int i3, zzdu zzduVar) {
        zzank zzankVar;
        long j2;
        ?? r5;
        int i4;
        int[] iArr;
        ?? r18;
        ?? r19;
        ?? r6;
        long j3;
        zzcy zzcyVarM5860b;
        long j4;
        zzgwt zzgwtVarM7216n;
        long j5;
        long j6;
        long j7;
        Rect rect;
        zzeu zzeuVar = this.f6351a;
        zzeuVar.m6397z(i2 + i3, bArr);
        zzeuVar.m6363E(i2);
        if (this.f6354d == null) {
            this.f6354d = new Inflater();
        }
        Inflater inflater = this.f6354d;
        zzeu zzeuVar2 = this.f6352b;
        if (zzfm.m6507i(zzeuVar, zzeuVar2, inflater)) {
            zzeuVar.m6397z(zzeuVar2.f14889c, zzeuVar2.f14887a);
        }
        ?? r1 = this.f6353c;
        long j8 = -9223372036854775807L;
        r1.f6340b = -9223372036854775807L;
        r1.f6341c = -9223372036854775807L;
        int i5 = 0;
        r1.f6343e = false;
        r1.f6347i = null;
        r1.f6348j = -1;
        r1.f6349k = -1;
        int iM6360B = zzeuVar.m6360B();
        if (iM6360B < 2 || zzeuVar.m6370L() != iM6360B) {
            zzankVar = f6350e;
        } else {
            int[] iArr2 = r1.f6339a;
            ?? r11 = 1;
            if (r1.f6344f == null) {
                zzeh.m6211c("VobsubParser", "Skipping SPU (no palette)");
            } else {
                if (r1.f6342d) {
                    int i6 = zzeuVar.f14888b - 2;
                    zzeuVar.m6363E(zzeuVar.m6370L() + i6);
                    while (true) {
                        int i7 = 4;
                        if (zzeuVar.m6360B() < 4) {
                            i4 = i5;
                            j2 = j8;
                            iArr = iArr2;
                            r6 = i4;
                        } else {
                            int i8 = zzeuVar.f14888b;
                            int iM6370L = zzeuVar.m6370L() * 10000;
                            j2 = j8;
                            int iM6370L2 = zzeuVar.m6370L() + i6;
                            r5 = (iM6370L2 == i8 || iM6370L2 >= zzeuVar.f14889c) ? i5 : r11;
                            int i9 = r5 != 0 ? iM6370L2 : zzeuVar.f14889c;
                            while (true) {
                                ?? r16 = r11;
                                while (true) {
                                    if (zzeuVar.f14888b >= i9 && r16 != 0) {
                                        iArr2 = iArr2;
                                        long j9 = iM6370L;
                                        int iM6369K = zzeuVar.m6369K();
                                        i5 = i5;
                                        if (iM6369K != 255) {
                                            switch (iM6369K) {
                                                case 0:
                                                    r11 = 1;
                                                    r16 = 1;
                                                    break;
                                                case 1:
                                                    r1.f6340b = j9;
                                                    r11 = 1;
                                                    i7 = 4;
                                                    r16 = 1;
                                                    break;
                                                case 2:
                                                    r1.f6341c = j9;
                                                    r11 = 1;
                                                    i7 = 4;
                                                    r16 = 1;
                                                    break;
                                                case 3:
                                                    ?? r110 = r11;
                                                    if (zzeuVar.m6360B() >= 2) {
                                                        int iM6369K2 = zzeuVar.m6369K();
                                                        int iM6369K3 = zzeuVar.m6369K();
                                                        int[] iArr3 = r1.f6344f;
                                                        int i10 = iM6369K2 >> 4;
                                                        if (i10 >= iArr3.length) {
                                                            i10 = i5;
                                                        }
                                                        iArr2[3] = iArr3[i10];
                                                        int i11 = iM6369K2 & 15;
                                                        if (i11 >= iArr3.length) {
                                                            i11 = i5;
                                                        }
                                                        iArr2[2] = iArr3[i11];
                                                        int i12 = iM6369K3 >> 4;
                                                        if (i12 >= iArr3.length) {
                                                            i12 = i5;
                                                        }
                                                        iArr2[r110 == true ? 1 : 0] = iArr3[i12];
                                                        int i13 = iM6369K3 & 15;
                                                        if (i13 >= iArr3.length) {
                                                            i13 = i5;
                                                        }
                                                        iArr2[i5] = iArr3[i13];
                                                        r1.f6343e = r110;
                                                        r11 = 1;
                                                        i7 = 4;
                                                        r16 = 1;
                                                    } else {
                                                        zzeh.m6211c("VobsubParser", "Incomplete color command");
                                                        r19 = r110;
                                                        i5 = i5;
                                                        r16 = i5;
                                                        r11 = r19;
                                                        i7 = 4;
                                                    }
                                                    break;
                                                case 4:
                                                    ?? r111 = r11;
                                                    if (zzeuVar.m6360B() < 2) {
                                                        zzeh.m6211c("VobsubParser", "Incomplete alpha command");
                                                        r19 = r111;
                                                    } else if (r1.f6343e) {
                                                        int iM6369K4 = zzeuVar.m6369K();
                                                        int iM6369K5 = zzeuVar.m6369K();
                                                        iArr2[3] = zzaoy.m4284a(iArr2[3], iM6369K4 >> 4);
                                                        iArr2[2] = zzaoy.m4284a(iArr2[2], iM6369K4 & 15);
                                                        iArr2[r111 == true ? 1 : 0] = zzaoy.m4284a(iArr2[r111 == true ? 1 : 0], iM6369K5 >> 4);
                                                        iArr2[i5] = zzaoy.m4284a(iArr2[i5], iM6369K5 & 15);
                                                        r18 = r111;
                                                        i5 = i5;
                                                        ?? r12 = r18;
                                                        r16 = r12 == true ? 1 : 0;
                                                        r11 = r12;
                                                        i7 = 4;
                                                    } else {
                                                        zzeh.m6211c("VobsubParser", "Ignoring alpha command before color command");
                                                        r19 = r111;
                                                    }
                                                    i5 = i5;
                                                    r16 = i5;
                                                    r11 = r19;
                                                    i7 = 4;
                                                    break;
                                                case 5:
                                                    if (zzeuVar.m6360B() >= 6) {
                                                        int iM6369K6 = zzeuVar.m6369K();
                                                        int iM6369K7 = zzeuVar.m6369K();
                                                        int i14 = iM6369K6 << i7;
                                                        int i15 = iM6369K7 >> 4;
                                                        int iM6369K8 = ((iM6369K7 & 15) << 8) | zzeuVar.m6369K();
                                                        int iM6369K9 = zzeuVar.m6369K();
                                                        int iM6369K10 = zzeuVar.m6369K();
                                                        int i16 = iM6369K9 << i7;
                                                        int i17 = iM6369K10 >> 4;
                                                        int iM6369K11 = (((iM6369K10 & 15) << 8) | zzeuVar.m6369K()) + 1;
                                                        r18 = r11;
                                                        r1.f6347i = new Rect(i14 | i15, i16 | i17, iM6369K8 + r11, iM6369K11);
                                                        i5 = i5;
                                                        ?? r13 = r18;
                                                        r16 = r13 == true ? 1 : 0;
                                                        r11 = r13;
                                                        i7 = 4;
                                                    } else {
                                                        zzeh.m6211c("VobsubParser", "Incomplete area command");
                                                    }
                                                    break;
                                                case 6:
                                                    if (zzeuVar.m6360B() >= i7) {
                                                        r1.f6348j = zzeuVar.m6370L();
                                                        r1.f6349k = zzeuVar.m6370L();
                                                        iArr2 = iArr2;
                                                        i5 = i5;
                                                    } else {
                                                        zzeh.m6211c("VobsubParser", "Incomplete offsets command");
                                                    }
                                                    break;
                                                default:
                                                    AbstractC5152f.m3776h(new StringBuilder(String.valueOf(iM6369K).length() + 22), "Unrecognized command: ", iM6369K, "VobsubParser");
                                                    break;
                                            }
                                            if (zzeuVar.f14888b >= i9) {
                                            }
                                        }
                                        iArr2 = iArr2;
                                        i5 = i5;
                                        r16 = i5;
                                    }
                                }
                            }
                            i4 = i5;
                            iArr = iArr2;
                            r6 = r5;
                            if (r5 != 0) {
                                zzeuVar.m6363E(iM6370L2);
                            }
                        }
                        if (r6 == 0) {
                            r6 = r5;
                        } else {
                            r6 = r5;
                            j8 = j2;
                            iArr2 = iArr;
                            i5 = i4;
                            r11 = 1;
                        }
                    }
                } else {
                    zzeh.m6211c("VobsubParser", "Skipping SPU (no plane)");
                }
                j3 = r1.f6341c;
                if (r1.f6344f == null && r1.f6342d && r1.f6343e && (rect = r1.f6347i) != null && r1.f6348j != -1 && r1.f6349k != -1 && rect.width() >= 2 && r1.f6347i.height() >= 2) {
                    Rect rect2 = r1.f6347i;
                    int[] iArr4 = new int[rect2.height() * rect2.width()];
                    zzet zzetVar = new zzet();
                    zzeuVar.m6363E(r1.f6348j);
                    zzetVar.m6338a(zzeuVar);
                    r1.m4285b(zzetVar, true, rect2, iArr4);
                    zzeuVar.m6363E(r1.f6349k);
                    zzetVar.m6338a(zzeuVar);
                    r1.m4285b(zzetVar, i4, rect2, iArr4);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr4, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
                    zzcx zzcxVar = new zzcx();
                    zzcxVar.f11650b = bitmapCreateBitmap;
                    zzcxVar.f11649a = null;
                    zzcxVar.f11656h = rect2.left / r1.f6345g;
                    zzcxVar.f11657i = 0;
                    zzcxVar.f11653e = rect2.top / r1.f6346h;
                    zzcxVar.f11654f = 0;
                    zzcxVar.f11655g = 0;
                    zzcxVar.f11660l = rect2.width() / r1.f6345g;
                    zzcxVar.f11661m = rect2.height() / r1.f6346h;
                    zzcyVarM5860b = zzcxVar.m5860b();
                }
                if (j3 != j2) {
                    j5 = r1.f6340b;
                    if (j5 != j2) {
                        j7 = r1.f6341c;
                        if (j7 > j5) {
                            j6 = j7 - j5;
                        } else {
                            j6 = r1.f6341c;
                        }
                    } else {
                        j6 = r1.f6341c;
                    }
                    j4 = j6;
                } else {
                    j4 = j2;
                }
                if (zzcyVarM5860b != null) {
                    zzgwtVarM7216n = zzgwt.m7216n(zzcyVarM5860b);
                } else {
                    zzgwtVarM7216n = zzgyo.f18355w;
                }
                zzankVar = new zzank(zzgwtVarM7216n, r1.f6340b, j4);
            }
            i4 = 0;
            j2 = -9223372036854775807L;
            j3 = r1.f6341c;
            zzcyVarM5860b = r1.f6344f == null ? null : null;
            if (j3 != j2) {
                j5 = r1.f6340b;
                if (j5 != j2) {
                    j7 = r1.f6341c;
                    if (j7 > j5) {
                        j6 = j7 - j5;
                    } else {
                        j6 = r1.f6341c;
                    }
                } else {
                    j6 = r1.f6341c;
                }
                j4 = j6;
            } else {
                j4 = j2;
            }
            if (zzcyVarM5860b != null) {
                zzgwtVarM7216n = zzgwt.m7216n(zzcyVarM5860b);
            } else {
                zzgwtVarM7216n = zzgyo.f18355w;
            }
            zzankVar = new zzank(zzgwtVarM7216n, r1.f6340b, j4);
        }
        ((zzanu) zzduVar).mo3942b(zzankVar);
    }
}
