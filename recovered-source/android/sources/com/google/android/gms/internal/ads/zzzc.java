package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzc implements zzahm {

    /* JADX INFO: renamed from: B */
    public zzv f21441B;

    /* JADX INFO: renamed from: D */
    public boolean f21443D;

    /* JADX INFO: renamed from: a */
    public final zzyx f21444a;

    /* JADX INFO: renamed from: d */
    public final zzuq f21447d;

    /* JADX INFO: renamed from: e */
    public zzzb f21448e;

    /* JADX INFO: renamed from: f */
    public zzv f21449f;

    /* JADX INFO: renamed from: g */
    public zzuj f21450g;

    /* JADX INFO: renamed from: o */
    public int f21458o;

    /* JADX INFO: renamed from: p */
    public int f21459p;

    /* JADX INFO: renamed from: q */
    public int f21460q;

    /* JADX INFO: renamed from: r */
    public int f21461r;

    /* JADX INFO: renamed from: y */
    public boolean f21468y;

    /* JADX INFO: renamed from: b */
    public final zzyy f21445b = new zzyy();

    /* JADX INFO: renamed from: h */
    public int f21451h = 1000;

    /* JADX INFO: renamed from: i */
    public long[] f21452i = new long[1000];

    /* JADX INFO: renamed from: j */
    public long[] f21453j = new long[1000];

    /* JADX INFO: renamed from: m */
    public long[] f21456m = new long[1000];

    /* JADX INFO: renamed from: l */
    public int[] f21455l = new int[1000];

    /* JADX INFO: renamed from: k */
    public int[] f21454k = new int[1000];

    /* JADX INFO: renamed from: n */
    public zzahl[] f21457n = new zzahl[1000];

    /* JADX INFO: renamed from: c */
    public final zzzj f21446c = new zzzj(new zzdu() { // from class: com.google.android.gms.internal.ads.zzyz
        @Override // com.google.android.gms.internal.ads.zzdu
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void mo3942b(Object obj) {
            zzup zzupVar = ((zzza) obj).f21439b;
        }
    });

    /* JADX INFO: renamed from: s */
    public long f21462s = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u */
    public long f21464u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v */
    public long f21465v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: A */
    public boolean f21440A = true;

    /* JADX INFO: renamed from: z */
    public boolean f21469z = true;

    /* JADX INFO: renamed from: C */
    public boolean f21442C = true;

    /* JADX INFO: renamed from: t */
    public long f21463t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: w */
    public int f21466w = -1;

    /* JADX INFO: renamed from: x */
    public int f21467x = -1;

    public zzzc(zzabm zzabmVar, zzuq zzuqVar, zzul zzulVar) {
        this.f21447d = zzuqVar;
        this.f21444a = new zzyx(zzabmVar);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:22:0x0049, B:24:0x004e, B:28:0x0064, B:31:0x006b, B:35:0x0073, B:57:0x00b9, B:62:0x00e6, B:83:0x014b, B:85:0x0154, B:64:0x00fd, B:66:0x0101, B:68:0x0113, B:72:0x011c, B:73:0x0121, B:75:0x0127, B:79:0x0135, B:81:0x013a, B:82:0x0148, B:91:0x01c2, B:38:0x008b, B:42:0x0093, B:43:0x0096, B:45:0x009a, B:46:0x009d, B:48:0x00a7, B:52:0x00ae, B:56:0x00b6), top: B:94:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0101 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:22:0x0049, B:24:0x004e, B:28:0x0064, B:31:0x006b, B:35:0x0073, B:57:0x00b9, B:62:0x00e6, B:83:0x014b, B:85:0x0154, B:64:0x00fd, B:66:0x0101, B:68:0x0113, B:72:0x011c, B:73:0x0121, B:75:0x0127, B:79:0x0135, B:81:0x013a, B:82:0x0148, B:91:0x01c2, B:38:0x008b, B:42:0x0093, B:43:0x0096, B:45:0x009a, B:46:0x009d, B:48:0x00a7, B:52:0x00ae, B:56:0x00b6), top: B:94:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0113 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:22:0x0049, B:24:0x004e, B:28:0x0064, B:31:0x006b, B:35:0x0073, B:57:0x00b9, B:62:0x00e6, B:83:0x014b, B:85:0x0154, B:64:0x00fd, B:66:0x0101, B:68:0x0113, B:72:0x011c, B:73:0x0121, B:75:0x0127, B:79:0x0135, B:81:0x013a, B:82:0x0148, B:91:0x01c2, B:38:0x008b, B:42:0x0093, B:43:0x0096, B:45:0x009a, B:46:0x009d, B:48:0x00a7, B:52:0x00ae, B:56:0x00b6), top: B:94:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0127 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:22:0x0049, B:24:0x004e, B:28:0x0064, B:31:0x006b, B:35:0x0073, B:57:0x00b9, B:62:0x00e6, B:83:0x014b, B:85:0x0154, B:64:0x00fd, B:66:0x0101, B:68:0x0113, B:72:0x011c, B:73:0x0121, B:75:0x0127, B:79:0x0135, B:81:0x013a, B:82:0x0148, B:91:0x01c2, B:38:0x008b, B:42:0x0093, B:43:0x0096, B:45:0x009a, B:46:0x009d, B:48:0x00a7, B:52:0x00ae, B:56:0x00b6), top: B:94:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0132  */
    /* JADX WARN: Code duplicated, block: B:78:0x0134  */
    /* JADX WARN: Code duplicated, block: B:81:0x013a A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:22:0x0049, B:24:0x004e, B:28:0x0064, B:31:0x006b, B:35:0x0073, B:57:0x00b9, B:62:0x00e6, B:83:0x014b, B:85:0x0154, B:64:0x00fd, B:66:0x0101, B:68:0x0113, B:72:0x011c, B:73:0x0121, B:75:0x0127, B:79:0x0135, B:81:0x013a, B:82:0x0148, B:91:0x01c2, B:38:0x008b, B:42:0x0093, B:43:0x0096, B:45:0x009a, B:46:0x009d, B:48:0x00a7, B:52:0x00ae, B:56:0x00b6), top: B:94:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c1  */
    @Override // com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: b */
    public final void mo4095b(long j2, int i2, int i3, int i4, zzahl zzahlVar) {
        int i5;
        int i6;
        zzv zzvVar;
        int i7;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        if (this.f21469z) {
            if ((i2 & 1) == 0) {
                return;
            } else {
                this.f21469z = false;
            }
        }
        if (!this.f21442C) {
            i5 = i2;
        } else {
            if (j2 < this.f21462s) {
                return;
            }
            if ((i2 & 1) == 0) {
                if (!this.f21443D) {
                    zzeh.m6211c("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f21441B)));
                    this.f21443D = true;
                }
                i5 = i2 | 1;
            } else {
                i5 = i2;
            }
        }
        long j3 = (this.f21444a.f21428f - ((long) i3)) - ((long) i4);
        synchronized (this) {
            try {
                int i8 = this.f21458o;
                if (i8 > 0) {
                    int iM9058j = m9058j(i8 - 1);
                    zzgtr.m7128a(this.f21453j[iM9058j] + ((long) this.f21454k[iM9058j]) <= j3);
                }
                int i9 = 536870912 & i5;
                this.f21468y = i9 != 0;
                this.f21465v = Math.max(this.f21465v, j2);
                int i10 = this.f21459p;
                int i11 = this.f21458o;
                int i12 = i10 + i11;
                long j4 = this.f21463t;
                if (j4 != Long.MIN_VALUE && this.f21466w == -1) {
                    if (j2 >= j4) {
                        int i13 = this.f21467x;
                        if (i13 == -1) {
                            this.f21467x = i12;
                            i13 = i12;
                        }
                        int i14 = (i12 - i13) + 1;
                        int i15 = i5 & 1;
                        zzv zzvVar2 = this.f21441B;
                        int i16 = 16;
                        if (zzvVar2 != null && (i6 = zzvVar2.f21063q) != -1) {
                            i16 = i6;
                        }
                        if (i14 >= i16 + 1 || i15 != 0 || i9 != 0) {
                            this.f21466w = i13;
                            this.f21467x = -1;
                        }
                    } else {
                        this.f21467x = -1;
                    }
                }
                int iM9058j2 = m9058j(i11);
                this.f21456m[iM9058j2] = j2;
                this.f21453j[iM9058j2] = j3;
                this.f21454k[iM9058j2] = i3;
                this.f21455l[iM9058j2] = i5;
                this.f21457n[iM9058j2] = zzahlVar;
                this.f21452i[iM9058j2] = 0;
                zzzj zzzjVar = this.f21446c;
                if (zzzjVar.f21481b.size() == 0) {
                    zzvVar = this.f21441B;
                    if (zzvVar != null) {
                        throw null;
                    }
                    zzup zzupVar = zzup.f21009a;
                    i7 = this.f21459p + this.f21458o;
                    zzza zzzaVar = new zzza(zzvVar, zzupVar);
                    sparseArray = zzzjVar.f21481b;
                    if (zzzjVar.f21480a == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zzgtr.m7133f(z2);
                        zzzjVar.f21480a = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i7 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zzgtr.m7128a(z);
                        if (iKeyAt == i7) {
                            zzzjVar.f21482c.mo3942b(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i7, zzzaVar);
                } else {
                    SparseArray sparseArray2 = zzzjVar.f21481b;
                    if (!((zzza) sparseArray2.valueAt(sparseArray2.size() - 1)).f21438a.equals(this.f21441B)) {
                        zzvVar = this.f21441B;
                        if (zzvVar != null) {
                            throw null;
                        }
                        zzup zzupVar2 = zzup.f21009a;
                        i7 = this.f21459p + this.f21458o;
                        zzza zzzaVar2 = new zzza(zzvVar, zzupVar2);
                        sparseArray = zzzjVar.f21481b;
                        if (zzzjVar.f21480a == -1) {
                            if (sparseArray.size() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zzgtr.m7133f(z2);
                            zzzjVar.f21480a = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i7 >= iKeyAt) {
                                z = true;
                            } else {
                                z = false;
                            }
                            zzgtr.m7128a(z);
                            if (iKeyAt == i7) {
                                zzzjVar.f21482c.mo3942b(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i7, zzzaVar2);
                    }
                }
                int i17 = this.f21458o + 1;
                this.f21458o = i17;
                int i18 = this.f21451h;
                if (i17 == i18) {
                    int i19 = i18 + 1000;
                    long[] jArr = new long[i19];
                    long[] jArr2 = new long[i19];
                    long[] jArr3 = new long[i19];
                    int[] iArr = new int[i19];
                    int[] iArr2 = new int[i19];
                    zzahl[] zzahlVarArr = new zzahl[i19];
                    int i20 = this.f21460q;
                    int i21 = i18 - i20;
                    System.arraycopy(this.f21453j, i20, jArr2, 0, i21);
                    System.arraycopy(this.f21456m, this.f21460q, jArr3, 0, i21);
                    System.arraycopy(this.f21455l, this.f21460q, iArr, 0, i21);
                    System.arraycopy(this.f21454k, this.f21460q, iArr2, 0, i21);
                    System.arraycopy(this.f21457n, this.f21460q, zzahlVarArr, 0, i21);
                    System.arraycopy(this.f21452i, this.f21460q, jArr, 0, i21);
                    int i22 = this.f21460q;
                    System.arraycopy(this.f21453j, 0, jArr2, i21, i22);
                    System.arraycopy(this.f21456m, 0, jArr3, i21, i22);
                    System.arraycopy(this.f21455l, 0, iArr, i21, i22);
                    System.arraycopy(this.f21454k, 0, iArr2, i21, i22);
                    System.arraycopy(this.f21457n, 0, zzahlVarArr, i21, i22);
                    System.arraycopy(this.f21452i, 0, jArr, i21, i22);
                    this.f21453j = jArr2;
                    this.f21456m = jArr3;
                    this.f21455l = iArr;
                    this.f21454k = iArr2;
                    this.f21457n = zzahlVarArr;
                    this.f21452i = jArr;
                    this.f21460q = 0;
                    this.f21451h = i19;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: c */
    public final int mo4096c(zzj zzjVar, int i2, boolean z) throws EOFException {
        zzyx zzyxVar = this.f21444a;
        int iM9053b = zzyxVar.m9053b(i2);
        zzyw zzywVar = zzyxVar.f21427e;
        zzabk zzabkVar = zzywVar.f21421c;
        byte[] bArr = zzabkVar.f4849a;
        long j2 = zzyxVar.f21428f - zzywVar.f21419a;
        zzabkVar.getClass();
        int iMo4082b = zzjVar.mo4082b(bArr, (int) j2, iM9053b);
        if (iMo4082b == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = zzyxVar.f21428f + ((long) iMo4082b);
        zzyxVar.f21428f = j3;
        zzyw zzywVar2 = zzyxVar.f21427e;
        if (j3 == zzywVar2.f21420b) {
            zzyxVar.f21427e = zzywVar2.f21422d;
        }
        return iMo4082b;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x001e, B:15:0x0034, B:19:0x004b, B:21:0x0059, B:25:0x0062, B:18:0x0049), top: B:35:0x0002 }] */
    @Override // com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: e */
    public final void mo4097e(zzv zzvVar) {
        boolean z;
        synchronized (this) {
            z = false;
            try {
                this.f21440A = false;
                if (!Objects.equals(zzvVar, this.f21441B)) {
                    zzzj zzzjVar = this.f21446c;
                    if (zzzjVar.f21481b.size() == 0) {
                        this.f21441B = zzvVar;
                    } else {
                        SparseArray sparseArray = zzzjVar.f21481b;
                        if (((zzza) sparseArray.valueAt(sparseArray.size() - 1)).f21438a.equals(zzvVar)) {
                            SparseArray sparseArray2 = zzzjVar.f21481b;
                            this.f21441B = ((zzza) sparseArray2.valueAt(sparseArray2.size() - 1)).f21438a;
                        } else {
                            this.f21441B = zzvVar;
                        }
                    }
                    boolean z2 = this.f21442C;
                    zzv zzvVar2 = this.f21441B;
                    String str = zzvVar2.f21061o;
                    this.f21442C = z2 & (zzas.m4354f(str) == 1 && zzas.m4352d(str, zzvVar2.f21057k));
                    this.f21443D = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzzb zzzbVar = this.f21448e;
        if (zzzbVar == null || !z) {
            return;
        }
        zzyr zzyrVar = (zzyr) zzzbVar;
        zzyrVar.f21369G.post(zzyrVar.f21367E);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: f */
    public final void mo4098f(zzeu zzeuVar, int i2, int i3) {
        while (true) {
            zzyx zzyxVar = this.f21444a;
            if (i2 <= 0) {
                zzyxVar.getClass();
                return;
            }
            int iM9053b = zzyxVar.m9053b(i2);
            zzyw zzywVar = zzyxVar.f21427e;
            zzabk zzabkVar = zzywVar.f21421c;
            byte[] bArr = zzabkVar.f4849a;
            long j2 = zzyxVar.f21428f - zzywVar.f21419a;
            zzabkVar.getClass();
            zzeuVar.m6366H(bArr, (int) j2, iM9053b);
            i2 -= iM9053b;
            long j3 = zzyxVar.f21428f + ((long) iM9053b);
            zzyxVar.f21428f = j3;
            zzyw zzywVar2 = zzyxVar.f21427e;
            if (j3 == zzywVar2.f21420b) {
                zzyxVar.f21427e = zzywVar2.f21422d;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m9055g(zzv zzvVar, zzly zzlyVar) {
        zzv zzvVar2 = this.f21449f;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.f21065s;
        this.f21449f = zzvVar;
        zzq zzqVar2 = zzvVar.f21065s;
        zzuq zzuqVar = this.f21447d;
        int iMo8906b = zzuqVar.mo8906b(zzvVar);
        zzt zztVar = new zzt(zzvVar);
        zztVar.f20788N = iMo8906b;
        zzlyVar.f20351b = new zzv(zztVar);
        zzlyVar.f20350a = this.f21450g;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzur zzurVarMo8905a = zzuqVar.mo8905a(zzvVar);
            this.f21450g = zzurVarMo8905a;
            zzlyVar.f20350a = zzurVarMo8905a;
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m9056h(int i2, int i3, long j2, boolean z) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = this.f21456m[i2];
            if (j3 > j2) {
                break;
            }
            if (!z || (this.f21455l[i2] & 1) != 0) {
                if (j3 == j2) {
                    return i5;
                }
                i4 = i5;
            }
            i2++;
            if (i2 == this.f21451h) {
                i2 = 0;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: i */
    public final long m9057i(int i2) {
        long j2 = this.f21464u;
        long jMax = Long.MIN_VALUE;
        int i3 = 0;
        if (i2 != 0) {
            int iM9058j = m9058j(i2 - 1);
            for (int i4 = 0; i4 < i2; i4++) {
                jMax = Math.max(jMax, this.f21456m[iM9058j]);
                if ((this.f21455l[iM9058j] & 1) != 0) {
                    break;
                }
                iM9058j--;
                if (iM9058j == -1) {
                    iM9058j = this.f21451h - 1;
                }
            }
        }
        this.f21464u = Math.max(j2, jMax);
        this.f21458o -= i2;
        int i5 = this.f21459p + i2;
        this.f21459p = i5;
        int i6 = this.f21460q + i2;
        this.f21460q = i6;
        int i7 = this.f21451h;
        if (i6 >= i7) {
            this.f21460q = i6 - i7;
        }
        int i8 = this.f21461r - i2;
        this.f21461r = i8;
        if (i8 < 0) {
            this.f21461r = 0;
        }
        while (true) {
            zzzj zzzjVar = this.f21446c;
            SparseArray sparseArray = zzzjVar.f21481b;
            if (i3 >= sparseArray.size() - 1) {
                break;
            }
            int i9 = i3 + 1;
            if (i5 < sparseArray.keyAt(i9)) {
                break;
            }
            zzzjVar.f21482c.mo3942b(sparseArray.valueAt(i3));
            sparseArray.removeAt(i3);
            int i10 = zzzjVar.f21480a;
            if (i10 > 0) {
                zzzjVar.f21480a = i10 - 1;
            }
            i3 = i9;
        }
        if (this.f21458o != 0) {
            return this.f21453j[this.f21460q];
        }
        int i11 = this.f21460q;
        if (i11 == 0) {
            i11 = this.f21451h;
        }
        int i12 = i11 - 1;
        return this.f21453j[i12] + ((long) this.f21454k[i12]);
    }

    /* JADX INFO: renamed from: j */
    public final int m9058j(int i2) {
        int i3 = this.f21460q + i2;
        int i4 = this.f21451h;
        return i3 < i4 ? i3 : i3 - i4;
    }

    /* JADX INFO: renamed from: k */
    public final void m9059k(boolean z) {
        zzzj zzzjVar;
        SparseArray sparseArray;
        zzyx zzyxVar = this.f21444a;
        zzabm zzabmVar = zzyxVar.f21423a;
        zzyw zzywVar = zzyxVar.f21425c;
        if (zzywVar.f21421c != null) {
            zzabmVar.mo3928a(zzywVar);
            zzywVar.f21421c = null;
            zzywVar.f21422d = null;
        }
        zzyw zzywVar2 = zzyxVar.f21425c;
        int i2 = 0;
        zzgtr.m7133f(zzywVar2.f21421c == null);
        zzywVar2.f21419a = 0L;
        zzywVar2.f21420b = 65536L;
        zzyw zzywVar3 = zzyxVar.f21425c;
        zzyxVar.f21426d = zzywVar3;
        zzyxVar.f21427e = zzywVar3;
        zzyxVar.f21428f = 0L;
        zzabmVar.mo3930d();
        this.f21458o = 0;
        this.f21459p = 0;
        this.f21460q = 0;
        this.f21461r = 0;
        this.f21466w = -1;
        this.f21467x = -1;
        this.f21469z = true;
        this.f21462s = Long.MIN_VALUE;
        this.f21464u = Long.MIN_VALUE;
        this.f21465v = Long.MIN_VALUE;
        this.f21468y = false;
        while (true) {
            zzzjVar = this.f21446c;
            sparseArray = zzzjVar.f21481b;
            if (i2 >= sparseArray.size()) {
                break;
            }
            zzzjVar.f21482c.mo3942b(sparseArray.valueAt(i2));
            i2++;
        }
        zzzjVar.f21480a = -1;
        sparseArray.clear();
        if (z) {
            this.f21441B = null;
            this.f21440A = true;
            this.f21442C = true;
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized zzv m9060l() {
        if (this.f21440A) {
            return null;
        }
        return this.f21441B;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized boolean m9061m(boolean z) {
        int i2;
        try {
            int i3 = this.f21459p;
            int i4 = this.f21461r;
            int i5 = i3 + i4;
            int i6 = this.f21466w;
            boolean z2 = true;
            if (i6 != -1 && i5 >= i6) {
                return true;
            }
            if (i4 != this.f21458o) {
                if (!(i6 == -1 && (i2 = this.f21467x) != -1 && i3 + i4 >= i2)) {
                    if (((zzza) this.f21446c.m9065a(i5)).f21438a != this.f21449f) {
                        return true;
                    }
                    int iM9058j = m9058j(this.f21461r);
                    if (this.f21450g != null) {
                        int i7 = this.f21455l[iM9058j];
                        z2 = false;
                    }
                    return z2;
                }
            }
            if (!z && !this.f21468y) {
                zzv zzvVar = this.f21441B;
                if (zzvVar == null) {
                    z2 = false;
                } else if (zzvVar == this.f21449f) {
                    return false;
                }
            }
            return z2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0042  */
    /* JADX INFO: renamed from: n */
    public final synchronized boolean m9062n(boolean z, long j2) {
        Throwable th;
        long jMin;
        zzzc zzzcVar;
        long j3;
        int iM9056h;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f21461r = 0;
                        zzyx zzyxVar = this.f21444a;
                        zzyxVar.f21426d = zzyxVar.f21425c;
                        int iM9058j = m9058j(0);
                        long j4 = this.f21463t;
                        if (j4 != Long.MIN_VALUE) {
                            try {
                                jMin = Math.min(this.f21465v, j4);
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } else {
                            jMin = this.f21465v;
                        }
                        int i2 = this.f21461r;
                        int i3 = this.f21458o;
                        if ((i2 != i3) && j2 >= this.f21456m[iM9058j]) {
                            if (j2 > jMin) {
                                if (z) {
                                    z = true;
                                }
                            }
                            if (this.f21442C) {
                                iM9056h = i3 - i2;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= iM9056h) {
                                        zzzcVar = this;
                                        j3 = j2;
                                        if (!z) {
                                            iM9056h = -1;
                                            break;
                                        }
                                        break;
                                    }
                                    if (this.f21456m[iM9058j] >= j2) {
                                        zzzcVar = this;
                                        j3 = j2;
                                        iM9056h = i4;
                                        break;
                                    }
                                    iM9058j++;
                                    if (iM9058j == this.f21451h) {
                                        iM9058j = 0;
                                    }
                                    i4++;
                                }
                            } else {
                                int i5 = i3 - i2;
                                zzzcVar = this;
                                j3 = j2;
                                iM9056h = zzzcVar.m9056h(iM9058j, i5, j3, true);
                            }
                            if (iM9056h != -1) {
                                zzzcVar.f21462s = j3;
                                zzzcVar.f21461r += iM9056h;
                                return true;
                            }
                        }
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m9063o() {
        long jM9057i;
        zzyx zzyxVar = this.f21444a;
        synchronized (this) {
            int i2 = this.f21458o;
            jM9057i = i2 == 0 ? -1L : m9057i(i2);
        }
        zzyxVar.m9052a(jM9057i);
    }
}
