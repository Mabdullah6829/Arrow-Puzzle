package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzarx implements zzaga {

    /* JADX INFO: renamed from: a */
    public zzagd f6801a;

    /* JADX INFO: renamed from: b */
    public zzahm f6802b;

    /* JADX INFO: renamed from: e */
    public zzaru f6805e;

    /* JADX INFO: renamed from: c */
    public int f6803c = 0;

    /* JADX INFO: renamed from: d */
    public long f6804d = -1;

    /* JADX INFO: renamed from: f */
    public int f6806f = -1;

    /* JADX INFO: renamed from: g */
    public long f6807g = -1;

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        this.f6803c = j2 == 0 ? 0 : 4;
        zzaru zzaruVar = this.f6805e;
        if (zzaruVar != null) {
            zzaruVar.mo4347e(j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) {
        return zzasa.m4359a(zzagbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f6801a = zzagdVar;
        this.f6802b = zzagdVar.mo4109f(0, 1);
        zzagdVar.mo4110v();
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:69:0x0202  */
    /* JADX WARN: Code duplicated, block: B:70:0x021a  */
    /* JADX WARN: Code duplicated, block: B:72:0x021f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0235  */
    /* JADX WARN: Code duplicated, block: B:74:0x0237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0239 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x023b  */
    /* JADX WARN: Code duplicated, block: B:77:0x023e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0247  */
    /* JADX WARN: Code duplicated, block: B:81:0x0250  */
    /* JADX WARN: Code duplicated, block: B:84:0x0266  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) throws zzat {
        byte[] bArr;
        int i2;
        byte[] bArr2;
        zzary zzaryVar;
        int iM6500b;
        int i3;
        this.f6802b.getClass();
        String str = zzfm.f16091a;
        int i4 = this.f6803c;
        int i5 = 0;
        if (i4 == 0) {
            zzgtr.m7133f(zzagbVar.mo4086g() == 0);
            int i6 = this.f6806f;
            if (i6 != -1) {
                zzagbVar.mo4091o(i6);
                this.f6803c = 4;
                return 0;
            }
            if (!zzasa.m4359a(zzagbVar)) {
                throw zzat.m4383a(null, "Unsupported or unrecognized wav file type.");
            }
            zzagbVar.mo4091o((int) (zzagbVar.mo4084e() - zzagbVar.mo4086g()));
            this.f6803c = 1;
            return 0;
        }
        long jM6379e = -1;
        if (i4 == 1) {
            zzeu zzeuVar = new zzeu(8);
            zzarz zzarzVarM4348a = zzarz.m4348a(zzagbVar, zzeuVar);
            if (zzarzVarM4348a.f6814a != 1685272116) {
                zzagbVar.zzl();
            } else {
                zzagbVar.mo4075E(8);
                zzeuVar.m6363E(0);
                zzagbVar.mo4078H(zzeuVar.f14887a, 0, 8);
                jM6379e = zzeuVar.m6379e();
                zzagbVar.mo4091o(((int) zzarzVarM4348a.f6815b) + 8);
            }
            this.f6804d = jM6379e;
            this.f6803c = 2;
            return 0;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                zzgtr.m7133f(this.f6807g != -1);
                long jMo4086g = this.f6807g - zzagbVar.mo4086g();
                zzaru zzaruVar = this.f6805e;
                zzaruVar.getClass();
                return zzaruVar.mo4345b(zzagbVar, jMo4086g) ? -1 : 0;
            }
            zzagbVar.zzl();
            zzarz zzarzVarM4360b = zzasa.m4360b(1684108385, zzagbVar, new zzeu(8));
            zzagbVar.mo4091o(8);
            Pair pairCreate = Pair.create(Long.valueOf(zzagbVar.mo4086g()), Long.valueOf(zzarzVarM4360b.f6815b));
            this.f6806f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j2 = this.f6804d;
            if (j2 != -1 && jLongValue == 4294967295L) {
                jLongValue = j2;
            }
            long j3 = ((long) this.f6806f) + jLongValue;
            this.f6807g = j3;
            long jMo4089j = zzagbVar.mo4089j();
            if (jMo4089j != -1 && j3 > jMo4089j) {
                StringBuilder sb = new StringBuilder(String.valueOf(j3).length() + 29 + String.valueOf(jMo4089j).length());
                AbstractC1456a.m2456w(sb, "Data exceeds input length: ", j3, ", ");
                sb.append(jMo4089j);
                zzeh.m6211c("WavExtractor", sb.toString());
                this.f6807g = jMo4089j;
                j3 = jMo4089j;
            }
            zzaru zzaruVar2 = this.f6805e;
            zzaruVar2.getClass();
            zzaruVar2.mo4344a(this.f6806f, j3);
            this.f6803c = 4;
            return 0;
        }
        zzeu zzeuVar2 = new zzeu(16);
        long j4 = zzasa.m4360b(1718449184, zzagbVar, zzeuVar2).f6815b;
        zzgtr.m7133f(j4 >= 16);
        zzagbVar.mo4078H(zzeuVar2.f14887a, 0, 16);
        zzeuVar2.m6363E(0);
        int iM6371M = zzeuVar2.m6371M();
        int iM6371M2 = zzeuVar2.m6371M();
        int iM6383i = zzeuVar2.m6383i();
        zzeuVar2.m6383i();
        int iM6371M3 = zzeuVar2.m6371M();
        int iM6371M4 = zzeuVar2.m6371M();
        int i7 = ((int) j4) - 16;
        if (i7 > 0) {
            bArr = new byte[i7];
            zzagbVar.mo4078H(bArr, 0, i7);
            if (iM6371M == 65534) {
                if (i7 == 24) {
                    zzeu zzeuVar3 = new zzeu(bArr);
                    zzeuVar3.m6371M();
                    int iM6371M5 = zzeuVar3.m6371M();
                    if (iM6371M5 != 0 && iM6371M5 != iM6371M4) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iM6371M4).length() + String.valueOf(iM6371M5).length() + 33 + 19);
                        AbstractC1456a.m2455v(sb2, "validBits ( ", iM6371M5, ")  != bitsPerSample( ", iM6371M4);
                        sb2.append(") are not supported");
                        throw zzat.m4384b(sb2.toString());
                    }
                    int iM6383i2 = zzeuVar3.m6383i();
                    if ((iM6383i2 >> 18) != 0 || (iM6383i2 != 0 && Integer.bitCount(iM6383i2) != iM6371M2)) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iM6383i2).length() + 57 + String.valueOf(iM6371M2).length());
                        sb3.append("Channel mask ");
                        sb3.append(iM6383i2);
                        sb3.append(" is invalid or does not match channel count ");
                        sb3.append(iM6371M2);
                        throw zzat.m4384b(sb3.toString());
                    }
                    int iM6371M6 = zzeuVar3.m6371M();
                    byte[] bArr3 = new byte[14];
                    zzeuVar3.m6366H(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, zzasa.f6818a) && !Arrays.equals(bArr3, zzasa.f6819b)) {
                        throw zzat.m4384b("invalid wav format extension guid");
                    }
                    i5 = iM6383i2;
                    bArr2 = bArr;
                    i2 = iM6371M6;
                } else {
                    i2 = 65534;
                }
                zzagbVar.mo4091o((int) (zzagbVar.mo4084e() - zzagbVar.mo4086g()));
                zzaryVar = new zzary(i2, iM6371M2, iM6383i, iM6371M3, iM6371M4, i5, bArr2);
                if (i2 == 17) {
                    this.f6805e = new zzart(this.f6801a, this.f6802b, zzaryVar);
                } else if (i2 == 6) {
                    this.f6805e = new zzarv(this.f6801a, this.f6802b, zzaryVar, "audio/g711-alaw", -1);
                } else if (i2 == 7) {
                    this.f6805e = new zzarv(this.f6801a, this.f6802b, zzaryVar, "audio/g711-mlaw", -1);
                } else {
                    if (i2 == 1) {
                        iM6500b = zzfm.m6500b(iM6371M4, ByteOrder.LITTLE_ENDIAN);
                        i3 = iM6500b;
                    } else if (i2 == 3) {
                        iM6500b = zzfm.m6501c(iM6371M4, ByteOrder.LITTLE_ENDIAN);
                        i3 = iM6500b;
                    } else if (i2 != 65534) {
                        i3 = 0;
                    } else {
                        iM6500b = zzfm.m6500b(iM6371M4, ByteOrder.LITTLE_ENDIAN);
                        i3 = iM6500b;
                    }
                    if (i3 == 0) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i2).length() + 29);
                        sb4.append("Unsupported WAV format type: ");
                        sb4.append(i2);
                        throw zzat.m4384b(sb4.toString());
                    }
                    this.f6805e = new zzarv(this.f6801a, this.f6802b, zzaryVar, "audio/raw", i3);
                }
                this.f6803c = 3;
                return 0;
            }
            bArr2 = bArr;
            zzagbVar.mo4091o((int) (zzagbVar.mo4084e() - zzagbVar.mo4086g()));
            zzaryVar = new zzary(i2, iM6371M2, iM6383i, iM6371M3, iM6371M4, i5, bArr2);
            if (i2 == 17) {
                this.f6805e = new zzart(this.f6801a, this.f6802b, zzaryVar);
            } else if (i2 == 6) {
                this.f6805e = new zzarv(this.f6801a, this.f6802b, zzaryVar, "audio/g711-alaw", -1);
            } else if (i2 == 7) {
                this.f6805e = new zzarv(this.f6801a, this.f6802b, zzaryVar, "audio/g711-mlaw", -1);
            } else {
                if (i2 == 1) {
                    iM6500b = zzfm.m6500b(iM6371M4, ByteOrder.LITTLE_ENDIAN);
                    i3 = iM6500b;
                } else if (i2 == 3) {
                    iM6500b = zzfm.m6501c(iM6371M4, ByteOrder.LITTLE_ENDIAN);
                    i3 = iM6500b;
                } else if (i2 != 65534) {
                    i3 = 0;
                } else {
                    iM6500b = zzfm.m6500b(iM6371M4, ByteOrder.LITTLE_ENDIAN);
                    i3 = iM6500b;
                }
                if (i3 == 0) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(i2).length() + 29);
                    sb5.append("Unsupported WAV format type: ");
                    sb5.append(i2);
                    throw zzat.m4384b(sb5.toString());
                }
                this.f6805e = new zzarv(this.f6801a, this.f6802b, zzaryVar, "audio/raw", i3);
            }
            this.f6803c = 3;
            return 0;
        }
        bArr = zzfm.f16092b;
        i2 = iM6371M;
        bArr2 = bArr;
        zzagbVar.mo4091o((int) (zzagbVar.mo4084e() - zzagbVar.mo4086g()));
        zzaryVar = new zzary(i2, iM6371M2, iM6383i, iM6371M3, iM6371M4, i5, bArr2);
        if (i2 == 17) {
            this.f6805e = new zzart(this.f6801a, this.f6802b, zzaryVar);
        } else if (i2 == 6) {
            this.f6805e = new zzarv(this.f6801a, this.f6802b, zzaryVar, "audio/g711-alaw", -1);
        } else if (i2 == 7) {
            this.f6805e = new zzarv(this.f6801a, this.f6802b, zzaryVar, "audio/g711-mlaw", -1);
        } else {
            if (i2 == 1) {
                iM6500b = zzfm.m6500b(iM6371M4, ByteOrder.LITTLE_ENDIAN);
                i3 = iM6500b;
            } else if (i2 == 3) {
                iM6500b = zzfm.m6501c(iM6371M4, ByteOrder.LITTLE_ENDIAN);
                i3 = iM6500b;
            } else if (i2 != 65534) {
                i3 = 0;
            } else {
                iM6500b = zzfm.m6500b(iM6371M4, ByteOrder.LITTLE_ENDIAN);
                i3 = iM6500b;
            }
            if (i3 == 0) {
                StringBuilder sb6 = new StringBuilder(String.valueOf(i2).length() + 29);
                sb6.append("Unsupported WAV format type: ");
                sb6.append(i2);
                throw zzat.m4384b(sb6.toString());
            }
            this.f6805e = new zzarv(this.f6801a, this.f6802b, zzaryVar, "audio/raw", i3);
        }
        this.f6803c = 3;
        return 0;
    }
}
