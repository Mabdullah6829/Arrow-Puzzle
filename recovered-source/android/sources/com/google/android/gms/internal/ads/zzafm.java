package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzafm {

    /* JADX INFO: renamed from: a */
    public final zzafg f5193a;

    /* JADX INFO: renamed from: b */
    public final zzafl f5194b;

    /* JADX INFO: renamed from: c */
    public zzafi f5195c;

    /* JADX INFO: renamed from: d */
    public final int f5196d;

    public zzafm(zzafj zzafjVar, zzafl zzaflVar, long j2, long j3, long j4, long j5, long j6, int i2) {
        this.f5194b = zzaflVar;
        this.f5196d = i2;
        this.f5193a = new zzafg(zzafjVar, j2, j3, j4, j5, j6);
    }

    /* JADX INFO: renamed from: c */
    public static final int m4068c(zzagb zzagbVar, long j2, zzaha zzahaVar) {
        if (j2 == zzagbVar.mo4086g()) {
            return 0;
        }
        zzahaVar.f5303a = j2;
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m4069a(long j2) {
        zzafi zzafiVar = this.f5195c;
        if (zzafiVar == null || zzafiVar.f5181a != j2) {
            zzafg zzafgVar = this.f5193a;
            this.f5195c = new zzafi(j2, zzafgVar.f5175a.mo4065e(j2), zzafgVar.f5177c, zzafgVar.f5178d, zzafgVar.f5179e, zzafgVar.f5180f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m4070b(zzagb zzagbVar, zzaha zzahaVar) {
        while (true) {
            zzafi zzafiVar = this.f5195c;
            zzafiVar.getClass();
            long j2 = zzafiVar.f5186f;
            long j3 = zzafiVar.f5187g;
            long j4 = zzafiVar.f5188h;
            long j5 = j3 - j2;
            long j6 = this.f5196d;
            zzafl zzaflVar = this.f5194b;
            if (j5 <= j6) {
                this.f5195c = null;
                zzaflVar.zzb();
                return m4068c(zzagbVar, j2, zzahaVar);
            }
            long jMo4086g = j4 - zzagbVar.mo4086g();
            if (jMo4086g < 0 || jMo4086g > 262144) {
                return m4068c(zzagbVar, j4, zzahaVar);
            }
            zzagbVar.mo4091o((int) jMo4086g);
            zzagbVar.zzl();
            zzafk zzafkVarMo4067a = zzaflVar.mo4067a(zzagbVar, zzafiVar.f5182b);
            int i2 = zzafkVarMo4067a.f5190a;
            long j7 = zzafkVarMo4067a.f5191b;
            long j8 = zzafkVarMo4067a.f5192c;
            if (i2 == -3) {
                this.f5195c = null;
                zzaflVar.zzb();
                return m4068c(zzagbVar, j4, zzahaVar);
            }
            if (i2 == -2) {
                zzafiVar.f5184d = j7;
                zzafiVar.f5186f = j8;
                zzafiVar.f5188h = zzafi.m4066a(zzafiVar.f5182b, j7, zzafiVar.f5185e, j8, zzafiVar.f5187g, zzafiVar.f5183c);
            } else {
                if (i2 != -1) {
                    long jMo4086g2 = j8 - zzagbVar.mo4086g();
                    if (jMo4086g2 >= 0 && jMo4086g2 <= 262144) {
                        zzagbVar.mo4091o((int) jMo4086g2);
                    }
                    this.f5195c = null;
                    zzaflVar.zzb();
                    return m4068c(zzagbVar, j8, zzahaVar);
                }
                zzafiVar.f5185e = j7;
                zzafiVar.f5187g = j8;
                zzafiVar.f5188h = zzafi.m4066a(zzafiVar.f5182b, zzafiVar.f5184d, j7, zzafiVar.f5186f, j8, zzafiVar.f5183c);
            }
        }
    }
}
