package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzamv implements zzanc {

    /* JADX INFO: renamed from: a */
    public final zzanb f6045a;

    /* JADX INFO: renamed from: b */
    public final long f6046b;

    /* JADX INFO: renamed from: c */
    public final long f6047c;

    /* JADX INFO: renamed from: d */
    public final zzang f6048d;

    /* JADX INFO: renamed from: e */
    public int f6049e;

    /* JADX INFO: renamed from: f */
    public long f6050f;

    /* JADX INFO: renamed from: g */
    public long f6051g;

    /* JADX INFO: renamed from: h */
    public long f6052h;

    /* JADX INFO: renamed from: i */
    public long f6053i;

    /* JADX INFO: renamed from: j */
    public long f6054j;

    /* JADX INFO: renamed from: k */
    public long f6055k;

    /* JADX INFO: renamed from: l */
    public long f6056l;

    public zzamv(zzang zzangVar, long j2, long j3, long j4, long j5, boolean z) {
        zzgtr.m7128a(j2 >= 0 && j3 > j2);
        this.f6048d = zzangVar;
        this.f6046b = j2;
        this.f6047c = j3;
        if (j4 == j3 - j2 || z) {
            this.f6050f = j5;
            this.f6049e = 4;
        } else {
            this.f6049e = 0;
        }
        this.f6045a = new zzanb();
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    /* JADX INFO: renamed from: a */
    public final void mo4227a(long j2) {
        long j3 = this.f6050f - 1;
        String str = zzfm.f16091a;
        this.f6052h = Math.max(0L, Math.min(j2, j3));
        this.f6049e = 2;
        this.f6053i = this.f6046b;
        this.f6054j = this.f6047c;
        this.f6055k = 0L;
        this.f6056l = this.f6050f;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // com.google.android.gms.internal.ads.zzanc
    /* JADX INFO: renamed from: h */
    public final long mo4228h(zzagb zzagbVar) throws IOException {
        long j2;
        ?? r3;
        long j3;
        long j4;
        long jMax;
        zzanb zzanbVar;
        long j5;
        int i2 = this.f6049e;
        long j6 = this.f6047c;
        zzanb zzanbVar2 = this.f6045a;
        if (i2 == 0) {
            j2 = 0;
            long jMo4086g = zzagbVar.mo4086g();
            this.f6051g = jMo4086g;
            this.f6049e = 1;
            long j7 = (-65307) + j6;
            if (j7 > jMo4086g) {
                return j7;
            }
            r3 = 0;
        } else if (i2 != 1) {
            if (i2 == 2) {
                long j8 = this.f6053i;
                long j9 = this.f6054j;
                if (j8 == j9) {
                    jMax = -1;
                    j4 = -1;
                } else {
                    long jMo4086g2 = zzagbVar.mo4086g();
                    if (zzanbVar2.m4236a(zzagbVar, j9)) {
                        zzanbVar2.m4237b(zzagbVar, false);
                        zzagbVar.zzl();
                        long j10 = this.f6052h;
                        long j11 = zzanbVar2.f6101b;
                        long j12 = j10 - j11;
                        j3 = 2;
                        int i3 = zzanbVar2.f6103d + zzanbVar2.f6104e;
                        if (j12 < 0 || j12 >= 72000) {
                            if (j12 < 0) {
                                this.f6054j = jMo4086g2;
                                this.f6056l = j11;
                            } else {
                                this.f6053i = zzagbVar.mo4086g() + ((long) i3);
                                this.f6055k = j11;
                            }
                            long j13 = this.f6054j;
                            long j14 = this.f6053i;
                            long j15 = j13 - j14;
                            if (j15 < 100000) {
                                this.f6054j = j14;
                                zzanbVar2 = zzanbVar2;
                                j4 = -1;
                                jMax = j14;
                            } else {
                                zzanbVar2 = zzanbVar2;
                                long jMo4086g3 = zzagbVar.mo4086g() - (((long) i3) * (j12 <= 0 ? 2L : 1L));
                                j4 = -1;
                                String str = zzfm.f16091a;
                                jMax = Math.max(j14, Math.min(((j12 * j15) / (this.f6056l - this.f6055k)) + jMo4086g3, j13 - 1));
                            }
                        } else {
                            zzanbVar2 = zzanbVar2;
                            jMax = -1;
                            j4 = -1;
                        }
                    } else {
                        jMax = this.f6053i;
                        if (jMax == jMo4086g2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j4 = -1;
                    }
                    if (jMax != j4) {
                        return jMax;
                    }
                    this.f6049e = 3;
                    zzanbVar = zzanbVar2;
                    j5 = j4;
                }
                j3 = 2;
                if (jMax != j4) {
                    return jMax;
                }
                this.f6049e = 3;
                zzanbVar = zzanbVar2;
                j5 = j4;
            } else {
                if (i2 != 3) {
                    return -1L;
                }
                zzanbVar = zzanbVar2;
                j5 = -1;
                j3 = 2;
            }
            while (true) {
                zzanbVar.m4236a(zzagbVar, j5);
                zzanbVar.m4237b(zzagbVar, false);
                if (zzanbVar.f6101b > this.f6052h) {
                    zzagbVar.zzl();
                    this.f6049e = 4;
                    return -(this.f6055k + j3);
                }
                zzagbVar.mo4091o(zzanbVar.f6103d + zzanbVar.f6104e);
                this.f6053i = zzagbVar.mo4086g();
                this.f6055k = zzanbVar.f6101b;
                j5 = -1;
            }
        } else {
            j2 = 0;
            r3 = 0;
        }
        zzanbVar2.f6100a = r3;
        zzanbVar2.f6101b = j2;
        zzanbVar2.f6102c = r3;
        zzanbVar2.f6103d = r3;
        zzanbVar2.f6104e = r3;
        if (!zzanbVar2.m4236a(zzagbVar, -1L)) {
            throw new EOFException();
        }
        zzanbVar2.m4237b(zzagbVar, r3);
        zzagbVar.mo4091o(zzanbVar2.f6103d + zzanbVar2.f6104e);
        long j16 = zzanbVar2.f6101b;
        while ((zzanbVar2.f6100a & 4) != 4 && zzanbVar2.m4236a(zzagbVar, -1L) && zzagbVar.mo4086g() < j6 && zzanbVar2.m4237b(zzagbVar, true)) {
            try {
                zzagbVar.mo4091o(zzanbVar2.f6103d + zzanbVar2.f6104e);
                j16 = zzanbVar2.f6101b;
            } catch (EOFException unused) {
            }
        }
        this.f6050f = j16;
        this.f6049e = 4;
        return this.f6051g;
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final /* bridge */ /* synthetic */ zzahd zzc() {
        if (this.f6050f != 0) {
            return new zzamu(this);
        }
        return null;
    }
}
