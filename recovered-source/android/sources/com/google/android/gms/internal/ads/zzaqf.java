package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqf implements zzaqa {

    /* JADX INFO: renamed from: l */
    public static final float[] f6542l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final zzars f6543a;

    /* JADX INFO: renamed from: b */
    public final zzeu f6544b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f6545c = new boolean[4];

    /* JADX INFO: renamed from: d */
    public final zzaqd f6546d;

    /* JADX INFO: renamed from: e */
    public final zzaqr f6547e;

    /* JADX INFO: renamed from: f */
    public zzaqe f6548f;

    /* JADX INFO: renamed from: g */
    public long f6549g;

    /* JADX INFO: renamed from: h */
    public String f6550h;

    /* JADX INFO: renamed from: i */
    public zzahm f6551i;

    /* JADX INFO: renamed from: j */
    public boolean f6552j;

    /* JADX INFO: renamed from: k */
    public long f6553k;

    public zzaqf(zzars zzarsVar) {
        this.f6543a = zzarsVar;
        zzaqd zzaqdVar = new zzaqd();
        zzaqdVar.f6533e = new byte[128];
        this.f6546d = zzaqdVar;
        this.f6553k = -9223372036854775807L;
        this.f6547e = new zzaqr(178);
        this.f6544b = new zzeu();
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: a */
    public final void mo4303a(boolean z) {
        zzaqe zzaqeVar = this.f6548f;
        zzaqeVar.getClass();
        if (z) {
            zzaqeVar.m4313b(0, this.f6552j, this.f6549g);
            zzaqe zzaqeVar2 = this.f6548f;
            zzaqeVar2.f6535b = false;
            zzaqeVar2.f6536c = false;
            zzaqeVar2.f6537d = false;
            zzaqeVar2.f6538e = -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: b */
    public final void mo4304b(zzeu zzeuVar) {
        zzaqr zzaqrVar;
        zzaqd zzaqdVar;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        float f2;
        this.f6548f.getClass();
        this.f6551i.getClass();
        int i6 = zzeuVar.f14888b;
        int i7 = zzeuVar.f14889c;
        byte[] bArr = zzeuVar.f14887a;
        this.f6549g += (long) zzeuVar.m6360B();
        this.f6551i.mo4121a(zzeuVar.m6360B(), zzeuVar);
        while (true) {
            int iM7086g = zzgr.m7086g(bArr, i6, i7, this.f6545c);
            zzaqrVar = this.f6547e;
            zzaqdVar = this.f6546d;
            if (iM7086g == i7) {
                break;
            }
            int i8 = iM7086g + 3;
            byte b = zzeuVar.f14887a[i8];
            int i9 = b & 255;
            int i10 = iM7086g - i6;
            if (this.f6552j) {
                i2 = i7;
            } else {
                if (i10 > 0) {
                    zzaqdVar.m4311a(bArr, i6, iM7086g);
                }
                int i11 = i10 < 0 ? -i10 : 0;
                int i12 = zzaqdVar.f6530b;
                if (i12 != 0) {
                    i2 = i7;
                    if (i12 == 1) {
                        i5 = 0;
                        if (i9 != 181) {
                            zzeh.m6211c("H263Reader", "Unexpected start code value");
                            zzaqdVar.f6529a = false;
                            zzaqdVar.f6531c = 0;
                            zzaqdVar.f6530b = 0;
                        } else {
                            zzaqdVar.f6530b = 2;
                        }
                    } else if (i12 == 2) {
                        i5 = 0;
                        if (i9 > 31) {
                            zzeh.m6211c("H263Reader", "Unexpected start code value");
                            zzaqdVar.f6529a = false;
                            zzaqdVar.f6531c = 0;
                            zzaqdVar.f6530b = 0;
                        } else {
                            zzaqdVar.f6530b = 3;
                        }
                    } else if (i12 != 3) {
                        if (i9 == 179 || i9 == 181) {
                            zzaqdVar.f6531c -= i11;
                            zzaqdVar.f6529a = false;
                            zzahm zzahmVar = this.f6551i;
                            int i13 = zzaqdVar.f6532d;
                            String str = this.f6550h;
                            str.getClass();
                            byte[] bArrCopyOf = Arrays.copyOf(zzaqdVar.f6533e, zzaqdVar.f6531c);
                            zzet zzetVar = new zzet(bArrCopyOf, bArrCopyOf.length);
                            zzetVar.m6349l(i13);
                            zzetVar.m6349l(4);
                            zzetVar.m6342e();
                            zzetVar.m6343f(8);
                            if (zzetVar.m6344g()) {
                                zzetVar.m6343f(4);
                                zzetVar.m6343f(3);
                            }
                            int iM6345h = zzetVar.m6345h(4);
                            if (iM6345h == 15) {
                                int iM6345h2 = zzetVar.m6345h(8);
                                int iM6345h3 = zzetVar.m6345h(8);
                                if (iM6345h3 == 0) {
                                    zzeh.m6211c("H263Reader", "Invalid aspect ratio");
                                    f2 = 1.0f;
                                } else {
                                    f2 = iM6345h2 / iM6345h3;
                                }
                            } else if (iM6345h < 7) {
                                f2 = f6542l[iM6345h];
                            } else {
                                zzeh.m6211c("H263Reader", "Invalid aspect ratio");
                                f2 = 1.0f;
                            }
                            if (zzetVar.m6344g()) {
                                zzetVar.m6343f(2);
                                zzetVar.m6343f(1);
                                if (zzetVar.m6344g()) {
                                    zzetVar.m6343f(15);
                                    zzetVar.m6342e();
                                    zzetVar.m6343f(15);
                                    zzetVar.m6342e();
                                    zzetVar.m6343f(15);
                                    zzetVar.m6342e();
                                    zzetVar.m6343f(3);
                                    zzetVar.m6343f(11);
                                    zzetVar.m6342e();
                                    zzetVar.m6343f(15);
                                    zzetVar.m6342e();
                                }
                            }
                            if (zzetVar.m6345h(2) != 0) {
                                zzeh.m6211c("H263Reader", "Unhandled video object layer shape");
                            }
                            zzetVar.m6342e();
                            int iM6345h4 = zzetVar.m6345h(16);
                            zzetVar.m6342e();
                            if (zzetVar.m6344g()) {
                                if (iM6345h4 == 0) {
                                    zzeh.m6211c("H263Reader", "Invalid vop_increment_time_resolution");
                                } else {
                                    int i14 = iM6345h4 - 1;
                                    int i15 = 0;
                                    while (i14 > 0) {
                                        i14 >>= 1;
                                        i15++;
                                    }
                                    zzetVar.m6343f(i15);
                                }
                            }
                            zzetVar.m6342e();
                            int iM6345h5 = zzetVar.m6345h(13);
                            zzetVar.m6342e();
                            int iM6345h6 = zzetVar.m6345h(13);
                            zzetVar.m6342e();
                            zzetVar.m6342e();
                            zzt zztVar = new zzt();
                            zztVar.f20789a = str;
                            zztVar.m8852d("video/mp2t");
                            zztVar.m8853e("video/mp4v-es");
                            zztVar.f20809u = iM6345h5;
                            zztVar.f20810v = iM6345h6;
                            zztVar.f20775A = f2;
                            zztVar.f20805q = Collections.singletonList(bArrCopyOf);
                            zzahmVar.mo4097e(new zzv(zztVar));
                            this.f6552j = true;
                        } else {
                            i5 = 0;
                        }
                    } else if ((b & 240) != 32) {
                        zzeh.m6211c("H263Reader", "Unexpected start code value");
                        i5 = 0;
                        zzaqdVar.f6529a = false;
                        zzaqdVar.f6531c = 0;
                        zzaqdVar.f6530b = 0;
                    } else {
                        i5 = 0;
                        zzaqdVar.f6532d = zzaqdVar.f6531c;
                        zzaqdVar.f6530b = 4;
                    }
                } else {
                    i2 = i7;
                    i5 = 0;
                    if (i9 == 176) {
                        zzaqdVar.f6530b = 1;
                        zzaqdVar.f6529a = true;
                    }
                }
                zzaqdVar.m4311a(zzaqd.f6528f, i5, 3);
            }
            this.f6548f.m4312a(bArr, i6, iM7086g);
            if (i10 > 0) {
                zzaqrVar.m4325c(bArr, i6, iM7086g);
                i3 = 0;
            } else {
                i3 = -i10;
            }
            if (zzaqrVar.m4326d(i3)) {
                int iM7080a = zzgr.m7080a(zzaqrVar.f6675e, zzaqrVar.f6674d);
                String str2 = zzfm.f16091a;
                byte[] bArr2 = zzaqrVar.f6674d;
                zzeu zzeuVar2 = this.f6544b;
                zzeuVar2.m6397z(iM7080a, bArr2);
                this.f6543a.m4343b(this.f6553k, zzeuVar2);
            }
            if (i9 == 178) {
                z = true;
                if (zzeuVar.f14887a[iM7086g + 2] == 1) {
                    zzaqrVar.m4324b(178);
                }
                i9 = 178;
            } else {
                z = true;
            }
            int i16 = i2 - iM7086g;
            this.f6548f.m4313b(i16, this.f6552j, this.f6549g - ((long) i16));
            zzaqe zzaqeVar = this.f6548f;
            long j2 = this.f6553k;
            zzaqeVar.f6538e = i9;
            zzaqeVar.f6537d = false;
            if (i9 == 182) {
                z2 = z;
                i4 = i9;
            } else if (i9 == 179) {
                z2 = z;
                i4 = 179;
            } else {
                i4 = i9;
                z2 = false;
            }
            zzaqeVar.f6535b = z2;
            zzaqeVar.f6536c = i4 == 182 ? z : false;
            zzaqeVar.f6539f = 0;
            zzaqeVar.f6541h = j2;
            i6 = i8;
            i7 = i2;
        }
        if (!this.f6552j) {
            zzaqdVar.m4311a(bArr, i6, i7);
        }
        this.f6548f.m4312a(bArr, i6, i7);
        zzaqrVar.m4325c(bArr, i6, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: c */
    public final void mo4305c(int i2, long j2) {
        this.f6553k = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: d */
    public final void mo4306d(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.m4339a();
        zzaroVar.m4340b();
        this.f6550h = zzaroVar.f6773e;
        zzaroVar.m4340b();
        zzahm zzahmVarMo4109f = zzagdVar.mo4109f(zzaroVar.f6772d, 2);
        this.f6551i = zzahmVarMo4109f;
        this.f6548f = new zzaqe(zzahmVarMo4109f);
        this.f6543a.m4342a(zzagdVar, zzaroVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        zzgr.m7087h(this.f6545c);
        zzaqd zzaqdVar = this.f6546d;
        zzaqdVar.f6529a = false;
        zzaqdVar.f6531c = 0;
        zzaqdVar.f6530b = 0;
        zzaqe zzaqeVar = this.f6548f;
        if (zzaqeVar != null) {
            zzaqeVar.f6535b = false;
            zzaqeVar.f6536c = false;
            zzaqeVar.f6537d = false;
            zzaqeVar.f6538e = -1;
        }
        this.f6547e.m4323a();
        this.f6549g = 0L;
        this.f6553k = -9223372036854775807L;
    }
}
