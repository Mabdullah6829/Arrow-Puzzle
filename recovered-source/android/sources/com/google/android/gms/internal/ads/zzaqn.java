package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqn implements zzaqa {

    /* JADX INFO: renamed from: e */
    public String f6651e;

    /* JADX INFO: renamed from: f */
    public zzahm f6652f;

    /* JADX INFO: renamed from: i */
    public boolean f6655i;

    /* JADX INFO: renamed from: k */
    public int f6657k;

    /* JADX INFO: renamed from: l */
    public int f6658l;

    /* JADX INFO: renamed from: n */
    public int f6660n;

    /* JADX INFO: renamed from: o */
    public int f6661o;

    /* JADX INFO: renamed from: s */
    public int f6665s;

    /* JADX INFO: renamed from: u */
    public boolean f6667u;

    /* JADX INFO: renamed from: d */
    public int f6650d = 0;

    /* JADX INFO: renamed from: a */
    public final zzeu f6647a = new zzeu(new byte[15], 2);

    /* JADX INFO: renamed from: b */
    public final zzet f6648b = new zzet();

    /* JADX INFO: renamed from: c */
    public final zzeu f6649c = new zzeu();

    /* JADX INFO: renamed from: p */
    public final zzaqo f6662p = new zzaqo();

    /* JADX INFO: renamed from: q */
    public int f6663q = -2147483647;

    /* JADX INFO: renamed from: r */
    public int f6664r = -1;

    /* JADX INFO: renamed from: t */
    public long f6666t = -1;

    /* JADX INFO: renamed from: j */
    public boolean f6656j = true;

    /* JADX INFO: renamed from: m */
    public boolean f6659m = true;

    /* JADX INFO: renamed from: g */
    public double f6653g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h */
    public double f6654h = -9.223372036854776E18d;

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: a */
    public final void mo4303a(boolean z) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:156:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:158:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:160:0x030c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0316  */
    /* JADX WARN: Code duplicated, block: B:194:0x0415  */
    /* JADX WARN: Instruction removed from duplicated block: B:156:0x02f1, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: b */
    public final void mo4304b(zzeu zzeuVar) throws zzat {
        int i2;
        int i3;
        int iM6345h;
        int iM6345h2;
        int i4;
        char c;
        byte[] bArr;
        long j2;
        long j3;
        zzgwt zzgwtVarM7217q;
        char c2;
        int iM6345h3;
        char c3;
        long jM6346i;
        this.f6652f.getClass();
        while (zzeuVar.m6360B() > 0) {
            int i5 = this.f6650d;
            int i6 = 8;
            int i7 = 1;
            if (i5 == 0) {
                int i8 = this.f6657k;
                if ((i8 & 2) != 0) {
                    if ((i8 & 4) == 0) {
                        while (zzeuVar.m6360B() > 0) {
                            int i9 = this.f6658l << 8;
                            this.f6658l = i9;
                            int iM6369K = i9 | zzeuVar.m6369K();
                            this.f6658l = iM6369K;
                            if ((iM6369K & ViewCompat.MEASURED_SIZE_MASK) == 12583333) {
                                zzeuVar.m6363E(zzeuVar.f14888b - 3);
                                this.f6658l = 0;
                            }
                        }
                    }
                    this.f6650d = 1;
                    break;
                }
                zzeuVar.m6363E(zzeuVar.f14889c);
            } else {
                zzaqo zzaqoVar = this.f6662p;
                zzeu zzeuVar2 = this.f6649c;
                if (i5 != 1) {
                    int i10 = zzaqoVar.f6668a;
                    if (i10 == 1 || i10 == 17) {
                        int i11 = zzeuVar.f14888b;
                        int iMin = Math.min(zzeuVar.m6360B(), zzeuVar2.m6360B());
                        zzeuVar.m6366H(zzeuVar2.f14887a, zzeuVar2.f14888b, iMin);
                        zzeuVar2.m6365G(iMin);
                        zzeuVar.m6363E(i11);
                    }
                    int iMin2 = Math.min(zzeuVar.m6360B(), zzaqoVar.f6670c - this.f6660n);
                    this.f6652f.mo4121a(iMin2, zzeuVar);
                    int i12 = this.f6660n + iMin2;
                    this.f6660n = i12;
                    if (i12 != zzaqoVar.f6670c) {
                        continue;
                    } else {
                        int i13 = zzaqoVar.f6668a;
                        if (i13 == 1) {
                            byte[] bArr2 = zzeuVar2.f14887a;
                            zzet zzetVar = new zzet(bArr2, bArr2.length);
                            int iM6345h4 = zzetVar.m6345h(8);
                            char c4 = 5;
                            int iM6345h5 = zzetVar.m6345h(5);
                            if (iM6345h5 != 31) {
                                switch (iM6345h5) {
                                    case 0:
                                        iM6345h2 = 96000;
                                        break;
                                    case 1:
                                        iM6345h2 = 88200;
                                        break;
                                    case 2:
                                        iM6345h2 = 64000;
                                        break;
                                    case 3:
                                        iM6345h2 = 48000;
                                        break;
                                    case 4:
                                        iM6345h2 = 44100;
                                        break;
                                    case 5:
                                        iM6345h2 = 32000;
                                        break;
                                    case 6:
                                        iM6345h2 = 24000;
                                        break;
                                    case 7:
                                        iM6345h2 = 22050;
                                        break;
                                    case 8:
                                        iM6345h2 = 16000;
                                        break;
                                    case 9:
                                        iM6345h2 = 12000;
                                        break;
                                    case 10:
                                        iM6345h2 = 11025;
                                        break;
                                    case 11:
                                        iM6345h2 = 8000;
                                        break;
                                    case 12:
                                        iM6345h2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        StringBuilder sb = new StringBuilder(String.valueOf(iM6345h5).length() + 32);
                                        sb.append("Unsupported sampling rate index ");
                                        sb.append(iM6345h5);
                                        throw zzat.m4384b(sb.toString());
                                    case 15:
                                        iM6345h2 = 57600;
                                        break;
                                    case 16:
                                        iM6345h2 = 51200;
                                        break;
                                    case 17:
                                        iM6345h2 = 40000;
                                        break;
                                    case 18:
                                        iM6345h2 = 38400;
                                        break;
                                    case 19:
                                        iM6345h2 = 34150;
                                        break;
                                    case 20:
                                        iM6345h2 = 28800;
                                        break;
                                    case 21:
                                        iM6345h2 = 25600;
                                        break;
                                    case 22:
                                        iM6345h2 = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
                                        break;
                                    case 23:
                                        iM6345h2 = 19200;
                                        break;
                                    case 24:
                                        iM6345h2 = 17075;
                                        break;
                                    case 25:
                                        iM6345h2 = 14400;
                                        break;
                                    case 26:
                                        iM6345h2 = 12800;
                                        break;
                                    case 27:
                                        iM6345h2 = 9600;
                                        break;
                                }
                            } else {
                                iM6345h2 = zzetVar.m6345h(24);
                            }
                            int iM6345h6 = zzetVar.m6345h(3);
                            int i14 = 4;
                            if (iM6345h6 == 0) {
                                i4 = ViewUtils.EDGE_TO_EDGE_FLAGS;
                            } else if (iM6345h6 == 1) {
                                i4 = 1024;
                            } else if (iM6345h6 == 2 || iM6345h6 == 3) {
                                i4 = 2048;
                            } else {
                                if (iM6345h6 != 4) {
                                    StringBuilder sb2 = new StringBuilder(AbstractC1456a.m2434a(iM6345h6, 36));
                                    sb2.append("Unsupported coreSbrFrameLengthIndex ");
                                    sb2.append(iM6345h6);
                                    throw zzat.m4384b(sb2.toString());
                                }
                                i4 = 4096;
                            }
                            int i15 = i4;
                            if (iM6345h6 == 0 || iM6345h6 == 1) {
                                c = 0;
                            } else if (iM6345h6 == 2) {
                                c = 2;
                            } else if (iM6345h6 == 3) {
                                c = 3;
                            } else {
                                if (iM6345h6 != 4) {
                                    StringBuilder sb3 = new StringBuilder(AbstractC1456a.m2434a(iM6345h6, 36));
                                    sb3.append("Unsupported coreSbrFrameLengthIndex ");
                                    sb3.append(iM6345h6);
                                    throw zzat.m4384b(sb3.toString());
                                }
                                c = 1;
                            }
                            zzetVar.m6343f(2);
                            zzaqq.m4320a(zzetVar);
                            int iM6345h7 = zzetVar.m6345h(5);
                            int i16 = 0;
                            int iM4322c = 0;
                            while (true) {
                                int i17 = i7;
                                int i18 = 16;
                                if (i16 < iM6345h7 + 1) {
                                    int iM6345h8 = zzetVar.m6345h(3);
                                    iM4322c = zzaqq.m4322c(zzetVar, 5, 8, 16) + 1 + iM4322c;
                                    if ((iM6345h8 == 0 || iM6345h8 == 2) && zzetVar.m6344g()) {
                                        zzaqq.m4320a(zzetVar);
                                    }
                                    i16++;
                                    i7 = i17;
                                } else {
                                    int iM4322c2 = zzaqq.m4322c(zzetVar, 4, 8, 16) + 1;
                                    zzetVar.m6342e();
                                    int i19 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i19 < iM4322c2) {
                                            int iM6345h9 = zzetVar.m6345h(2);
                                            if (iM6345h9 == 0) {
                                                c2 = c4;
                                                zzetVar.m6343f(3);
                                                if (zzetVar.m6344g()) {
                                                    zzetVar.m6343f(13);
                                                }
                                                if (c > 0) {
                                                    zzaqq.m4321b(zzetVar);
                                                }
                                            } else if (iM6345h9 != i17) {
                                                if (iM6345h9 == 3) {
                                                    zzaqq.m4322c(zzetVar, i14, i6, i18);
                                                    int iM4322c3 = zzaqq.m4322c(zzetVar, i14, i6, i18);
                                                    if (zzetVar.m6344g()) {
                                                        zzaqq.m4322c(zzetVar, i6, i18, 0);
                                                    }
                                                    zzetVar.m6342e();
                                                    if (iM4322c3 > 0) {
                                                        zzetVar.m6343f(iM4322c3 * 8);
                                                    }
                                                }
                                                c2 = 5;
                                            } else {
                                                zzetVar.m6343f(3);
                                                boolean zM6344g = zzetVar.m6344g();
                                                if (zM6344g) {
                                                    zzetVar.m6343f(13);
                                                }
                                                if (zM6344g) {
                                                    zzetVar.m6342e();
                                                }
                                                if (c > 0) {
                                                    zzaqq.m4321b(zzetVar);
                                                    iM6345h3 = zzetVar.m6345h(2);
                                                    c3 = c;
                                                } else {
                                                    iM6345h3 = 0;
                                                    c3 = 0;
                                                }
                                                if (iM6345h3 > 0) {
                                                    zzetVar.m6343f(6);
                                                    int iM6345h10 = zzetVar.m6345h(2);
                                                    zzetVar.m6343f(i14);
                                                    c2 = 5;
                                                    if (zzetVar.m6344g()) {
                                                        zzetVar.m6343f(5);
                                                    }
                                                    if (iM6345h3 == 2 || iM6345h3 == 3) {
                                                        zzetVar.m6343f(6);
                                                    }
                                                    if (iM6345h10 == 2) {
                                                        zzetVar.m6342e();
                                                    }
                                                } else {
                                                    c2 = 5;
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iM4322c - 1) / Math.log(2.0d))) + 1;
                                                int iM6345h11 = zzetVar.m6345h(2);
                                                if (iM6345h11 > 0 && zzetVar.m6344g()) {
                                                    zzetVar.m6343f(iFloor);
                                                }
                                                if (zzetVar.m6344g()) {
                                                    zzetVar.m6343f(iFloor);
                                                }
                                                if (c3 == 0 && iM6345h11 == 0) {
                                                    zzetVar.m6342e();
                                                }
                                            }
                                            i19++;
                                            c4 = c2;
                                            i6 = 8;
                                            i18 = 16;
                                            i14 = 4;
                                            i17 = 1;
                                        } else {
                                            if (zzetVar.m6344g()) {
                                                int i20 = 8;
                                                int iM4322c4 = zzaqq.m4322c(zzetVar, 2, 4, 8) + 1;
                                                int i21 = 0;
                                                bArr = null;
                                                while (i21 < iM4322c4) {
                                                    int iM4322c5 = zzaqq.m4322c(zzetVar, 4, i20, 16);
                                                    int iM4322c6 = zzaqq.m4322c(zzetVar, 4, i20, 16);
                                                    if (iM4322c5 == 7) {
                                                        int iM6345h12 = zzetVar.m6345h(4) + 1;
                                                        zzetVar.m6343f(4);
                                                        byte[] bArr3 = new byte[iM6345h12];
                                                        for (int i22 = 0; i22 < iM6345h12; i22++) {
                                                            bArr3[i22] = (byte) zzetVar.m6345h(i20);
                                                        }
                                                        bArr = bArr3;
                                                    } else {
                                                        zzetVar.m6343f(iM4322c6 * i20);
                                                    }
                                                    i21++;
                                                    i20 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iM6345h2) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.f6663q = (int) (((double) iM6345h2) * d);
                                                    this.f6664r = (int) (((double) i15) * d);
                                                    j2 = this.f6666t;
                                                    j3 = zzaqoVar.f6669b;
                                                    if (j2 != j3) {
                                                        this.f6666t = j3;
                                                        String strConcat = iM6345h4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iM6345h4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            zzgwtVarM7217q = null;
                                                        } else {
                                                            zzgwtVarM7217q = zzgwt.m7217q(zzfm.f16092b, bArr);
                                                        }
                                                        zzt zztVar = new zzt();
                                                        zztVar.f20789a = this.f6651e;
                                                        zztVar.m8852d("video/mp2t");
                                                        zztVar.m8853e("audio/mhm1");
                                                        zztVar.f20782H = this.f6663q;
                                                        zztVar.f20798j = strConcat;
                                                        zztVar.f20805q = zzgwtVarM7217q;
                                                        this.f6652f.mo4097e(new zzv(zztVar));
                                                    }
                                                    i3 = 1;
                                                    this.f6667u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f6663q = (int) (((double) iM6345h2) * d);
                                                    this.f6664r = (int) (((double) i15) * d);
                                                    j2 = this.f6666t;
                                                    j3 = zzaqoVar.f6669b;
                                                    if (j2 != j3) {
                                                        this.f6666t = j3;
                                                        if (iM6345h4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            zzgwtVarM7217q = null;
                                                        } else {
                                                            zzgwtVarM7217q = null;
                                                        }
                                                        zzt zztVar2 = new zzt();
                                                        zztVar2.f20789a = this.f6651e;
                                                        zztVar2.m8852d("video/mp2t");
                                                        zztVar2.m8853e("audio/mhm1");
                                                        zztVar2.f20782H = this.f6663q;
                                                        zztVar2.f20798j = strConcat;
                                                        zztVar2.f20805q = zzgwtVarM7217q;
                                                        this.f6652f.mo4097e(new zzv(zztVar2));
                                                    }
                                                    i3 = 1;
                                                    this.f6667u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.f6663q = (int) (((double) iM6345h2) * d);
                                                    this.f6664r = (int) (((double) i15) * d);
                                                    j2 = this.f6666t;
                                                    j3 = zzaqoVar.f6669b;
                                                    if (j2 != j3) {
                                                        this.f6666t = j3;
                                                        if (iM6345h4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            zzgwtVarM7217q = null;
                                                        } else {
                                                            zzgwtVarM7217q = null;
                                                        }
                                                        zzt zztVar3 = new zzt();
                                                        zztVar3.f20789a = this.f6651e;
                                                        zztVar3.m8852d("video/mp2t");
                                                        zztVar3.m8853e("audio/mhm1");
                                                        zztVar3.f20782H = this.f6663q;
                                                        zztVar3.f20798j = strConcat;
                                                        zztVar3.f20805q = zzgwtVarM7217q;
                                                        this.f6652f.mo4097e(new zzv(zztVar3));
                                                    }
                                                    i3 = 1;
                                                    this.f6667u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.f6663q = (int) (((double) iM6345h2) * d);
                                                    this.f6664r = (int) (((double) i15) * d);
                                                    j2 = this.f6666t;
                                                    j3 = zzaqoVar.f6669b;
                                                    if (j2 != j3) {
                                                        this.f6666t = j3;
                                                        if (iM6345h4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            zzgwtVarM7217q = null;
                                                        } else {
                                                            zzgwtVarM7217q = null;
                                                        }
                                                        zzt zztVar4 = new zzt();
                                                        zztVar4.f20789a = this.f6651e;
                                                        zztVar4.m8852d("video/mp2t");
                                                        zztVar4.m8853e("audio/mhm1");
                                                        zztVar4.f20782H = this.f6663q;
                                                        zztVar4.f20798j = strConcat;
                                                        zztVar4.f20805q = zzgwtVarM7217q;
                                                        this.f6652f.mo4097e(new zzv(zztVar4));
                                                    }
                                                    i3 = 1;
                                                    this.f6667u = true;
                                                    break;
                                                default:
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(iM6345h2).length() + 26);
                                                    sb4.append("Unsupported sampling rate ");
                                                    sb4.append(iM6345h2);
                                                    throw zzat.m4384b(sb4.toString());
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i13 == 17) {
                                byte[] bArr4 = zzeuVar2.f14887a;
                                zzet zzetVar2 = new zzet(bArr4, bArr4.length);
                                if (zzetVar2.m6344g()) {
                                    zzetVar2.m6343f(2);
                                    iM6345h = zzetVar2.m6345h(13);
                                } else {
                                    iM6345h = 0;
                                }
                                this.f6665s = iM6345h;
                            } else if (i13 == 2) {
                                if (this.f6667u) {
                                    this.f6656j = false;
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                                int i23 = this.f6664r - this.f6665s;
                                double d2 = this.f6663q;
                                long jRound = Math.round(this.f6653g);
                                if (this.f6655i) {
                                    this.f6655i = false;
                                    this.f6653g = this.f6654h;
                                } else {
                                    this.f6653g += (((double) i23) * 1000000.0d) / d2;
                                }
                                this.f6652f.mo4095b(jRound, i2, this.f6661o, 0, null);
                                this.f6667u = false;
                                this.f6665s = 0;
                                this.f6661o = 0;
                            }
                            i3 = 1;
                        }
                        this.f6650d = i3;
                    }
                } else {
                    int iM6360B = zzeuVar.m6360B();
                    zzeu zzeuVar3 = this.f6647a;
                    int iMin3 = Math.min(iM6360B, zzeuVar3.m6360B());
                    zzeuVar.m6366H(zzeuVar3.f14887a, zzeuVar3.f14888b, iMin3);
                    zzeuVar3.m6365G(iMin3);
                    if (zzeuVar3.m6360B() == 0) {
                        int i24 = zzeuVar3.f14889c;
                        byte[] bArr5 = zzeuVar3.f14887a;
                        zzet zzetVar3 = this.f6648b;
                        zzetVar3.f14823a = bArr5;
                        zzetVar3.f14824b = 0;
                        zzetVar3.f14825c = 0;
                        zzetVar3.f14826d = i24;
                        zzetVar3.m6340c();
                        int iM4322c7 = zzaqq.m4322c(zzetVar3, 3, 8, 8);
                        zzaqoVar.f6668a = iM4322c7;
                        if (iM4322c7 != -1) {
                            zzgtr.m7128a(Math.max(Math.max(2, 8), 32) <= 63);
                            Math.addExact(Math.addExact(3L, 255L), 4294967296L);
                            if (zzetVar3.m6339b() < 2) {
                                jM6346i = -1;
                            } else {
                                jM6346i = zzetVar3.m6346i(2);
                                if (jM6346i == 3) {
                                    if (zzetVar3.m6339b() < 8) {
                                        jM6346i = -1;
                                    } else {
                                        long jM6346i2 = zzetVar3.m6346i(8);
                                        long j4 = jM6346i2 + 3;
                                        if (jM6346i2 != 255) {
                                            jM6346i = j4;
                                        } else if (zzetVar3.m6339b() < 32) {
                                            jM6346i = -1;
                                        } else {
                                            jM6346i = zzetVar3.m6346i(32) + j4;
                                        }
                                    }
                                }
                            }
                            zzaqoVar.f6669b = jM6346i;
                            if (jM6346i != -1) {
                                if (jM6346i > 16) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(jM6346i).length() + 49);
                                    sb5.append("Contains sub-stream with an invalid packet label ");
                                    sb5.append(jM6346i);
                                    throw zzat.m4384b(sb5.toString());
                                }
                                if (jM6346i == 0) {
                                    int i25 = zzaqoVar.f6668a;
                                    if (i25 == 1) {
                                        throw zzat.m4383a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i25 == 2) {
                                        throw zzat.m4383a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i25 == 17) {
                                        throw zzat.m4383a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iM4322c8 = zzaqq.m4322c(zzetVar3, 11, 24, 24);
                                zzaqoVar.f6670c = iM4322c8;
                                if (iM4322c8 != -1) {
                                    this.f6660n = 0;
                                    this.f6661o = iM4322c8 + i24 + this.f6661o;
                                    zzeuVar3.m6363E(0);
                                    this.f6652f.mo4121a(zzeuVar3.f14889c, zzeuVar3);
                                    zzeuVar3.m6396y(2);
                                    zzeuVar2.m6396y(zzaqoVar.f6670c);
                                    this.f6659m = true;
                                    this.f6650d = 2;
                                }
                            }
                        }
                        int i26 = zzeuVar3.f14889c;
                        if (i26 < 15) {
                            zzeuVar3.m6361C(i26 + 1);
                        }
                    }
                    this.f6659m = false;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: c */
    public final void mo4305c(int i2, long j2) {
        this.f6657k = i2;
        if (!this.f6656j && (this.f6661o != 0 || !this.f6659m)) {
            this.f6655i = true;
        }
        if (j2 != -9223372036854775807L) {
            double d = j2;
            if (this.f6655i) {
                this.f6654h = d;
            } else {
                this.f6653g = d;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: d */
    public final void mo4306d(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.m4339a();
        zzaroVar.m4340b();
        this.f6651e = zzaroVar.f6773e;
        zzaroVar.m4340b();
        this.f6652f = zzagdVar.mo4109f(zzaroVar.f6772d, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.f6650d = 0;
        this.f6658l = 0;
        this.f6647a.m6396y(2);
        this.f6660n = 0;
        this.f6661o = 0;
        this.f6663q = -2147483647;
        this.f6664r = -1;
        this.f6665s = 0;
        this.f6666t = -1L;
        this.f6667u = false;
        this.f6655i = false;
        this.f6659m = true;
        this.f6656j = true;
        this.f6653g = -9.223372036854776E18d;
        this.f6654h = -9.223372036854776E18d;
    }
}
