package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzail implements zzaga {

    /* JADX INFO: renamed from: f */
    public zzagd f5437f;

    /* JADX INFO: renamed from: h */
    public boolean f5439h;

    /* JADX INFO: renamed from: i */
    public long f5440i;

    /* JADX INFO: renamed from: j */
    public int f5441j;

    /* JADX INFO: renamed from: k */
    public int f5442k;

    /* JADX INFO: renamed from: l */
    public int f5443l;

    /* JADX INFO: renamed from: m */
    public long f5444m;

    /* JADX INFO: renamed from: n */
    public boolean f5445n;

    /* JADX INFO: renamed from: o */
    public zzaij f5446o;

    /* JADX INFO: renamed from: p */
    public zzaip f5447p;

    /* JADX INFO: renamed from: a */
    public final zzeu f5432a = new zzeu(4);

    /* JADX INFO: renamed from: b */
    public final zzeu f5433b = new zzeu(9);

    /* JADX INFO: renamed from: c */
    public final zzeu f5434c = new zzeu(11);

    /* JADX INFO: renamed from: d */
    public final zzeu f5435d = new zzeu();

    /* JADX INFO: renamed from: e */
    public final zzaim f5436e = new zzaim();

    /* JADX INFO: renamed from: g */
    public int f5438g = 1;

    /* JADX INFO: renamed from: a */
    public final zzeu m4141a(zzagb zzagbVar) {
        int i2 = this.f5443l;
        zzeu zzeuVar = this.f5435d;
        byte[] bArr = zzeuVar.f14887a;
        if (i2 > bArr.length) {
            int length = bArr.length;
            zzeuVar.m6397z(0, new byte[Math.max(length + length, i2)]);
        } else {
            zzeuVar.m6363E(0);
        }
        zzeuVar.m6361C(this.f5443l);
        zzagbVar.mo4076F(zzeuVar.f14887a, 0, this.f5443l);
        return zzeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        if (j2 == 0) {
            this.f5438g = 1;
            this.f5439h = false;
        } else {
            this.f5438g = 3;
        }
        this.f5441j = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) throws EOFException, InterruptedIOException {
        zzeu zzeuVar = this.f5432a;
        zzafr zzafrVar = (zzafr) zzagbVar;
        zzafrVar.mo4081K(zzeuVar.f14887a, 0, 3, false);
        zzeuVar.m6363E(0);
        if (zzeuVar.m6373O() == 4607062) {
            zzafrVar.mo4081K(zzeuVar.f14887a, 0, 2, false);
            zzeuVar.m6363E(0);
            if ((zzeuVar.m6370L() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) == 0) {
                zzafrVar.mo4081K(zzeuVar.f14887a, 0, 4, false);
                zzeuVar.m6363E(0);
                int iM6376b = zzeuVar.m6376b();
                zzafrVar.f5216f = 0;
                zzafrVar.m4085f(iM6376b, false);
                zzafrVar.mo4081K(zzeuVar.f14887a, 0, 4, false);
                zzeuVar.m6363E(0);
                if (zzeuVar.m6376b() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f5437f = zzagdVar;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:149:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:181:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0295  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) throws zzat {
        int i2;
        long j2;
        boolean z;
        boolean z2;
        int i3;
        long j3;
        boolean z3;
        this.f5437f.getClass();
        while (true) {
            int i4 = this.f5438g;
            int i5 = 8;
            if (i4 == 1) {
                zzeu zzeuVar = this.f5433b;
                if (!zzagbVar.mo4079I(zzeuVar.f14887a, 0, 9, true)) {
                    return -1;
                }
                zzeuVar.m6363E(0);
                zzeuVar.m6365G(4);
                int iM6369K = zzeuVar.m6369K();
                int i6 = iM6369K & 4;
                int i7 = iM6369K & 1;
                if (i6 != 0 && this.f5446o == null) {
                    this.f5446o = new zzaij(this.f5437f.mo4109f(8, 1));
                }
                if (i7 != 0 && this.f5447p == null) {
                    this.f5447p = new zzaip(this.f5437f.mo4109f(9, 2));
                }
                this.f5437f.mo4110v();
                this.f5441j = zzeuVar.m6376b() - 5;
                this.f5438g = 2;
            } else if (i4 == 2) {
                zzagbVar.mo4091o(this.f5441j);
                this.f5441j = 0;
                this.f5438g = 3;
            } else if (i4 == 3) {
                zzeu zzeuVar2 = this.f5434c;
                if (!zzagbVar.mo4079I(zzeuVar2.f14887a, 0, 11, true)) {
                    return -1;
                }
                zzeuVar2.m6363E(0);
                this.f5442k = zzeuVar2.m6369K();
                this.f5443l = zzeuVar2.m6373O();
                this.f5444m = zzeuVar2.m6373O();
                this.f5444m = (((long) (zzeuVar2.m6369K() << 24)) | this.f5444m) * 1000;
                zzeuVar2.m6365G(3);
                this.f5438g = 4;
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                boolean z4 = this.f5439h;
                long j4 = -9223372036854775807L;
                zzaim zzaimVar = this.f5436e;
                long j5 = z4 ? this.f5440i + this.f5444m : zzaimVar.f5448b == -9223372036854775807L ? 0L : this.f5444m;
                int i8 = this.f5442k;
                if (i8 == 8) {
                    if (this.f5446o != null) {
                        if (!this.f5445n) {
                            this.f5437f.mo4108d(new zzahc(-9223372036854775807L, 0L));
                            this.f5445n = true;
                        }
                        zzaij zzaijVar = this.f5446o;
                        zzeu zzeuVarM4141a = m4141a(zzagbVar);
                        zzahm zzahmVar = zzaijVar.f5451a;
                        if (zzaijVar.f5428b) {
                            i2 = 0;
                            zzeuVarM4141a.m6365G(1);
                        } else {
                            int iM6369K2 = zzeuVarM4141a.m6369K();
                            int i9 = iM6369K2 >> 4;
                            zzaijVar.f5430d = i9;
                            i2 = 0;
                            if (i9 == 2) {
                                int i10 = zzaij.f5427e[(iM6369K2 >> 2) & 3];
                                zzt zztVar = new zzt();
                                zztVar.m8852d("video/x-flv");
                                zztVar.m8853e("audio/mpeg");
                                zztVar.f20780F = 1;
                                zztVar.f20782H = i10;
                                zzahmVar.mo4097e(new zzv(zztVar));
                                zzaijVar.f5429c = true;
                            } else if (i9 == 7 || i9 == 8) {
                                zzt zztVar2 = new zzt();
                                zztVar2.m8852d("video/x-flv");
                                zztVar2.m8853e(i9 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                                zztVar2.f20780F = 1;
                                zztVar2.f20782H = 8000;
                                zzahmVar.mo4097e(new zzv(zztVar2));
                                zzaijVar.f5429c = true;
                            } else if (i9 != 10) {
                                throw new zzain(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i9).length() + 28), "Audio format not supported: ", i9));
                            }
                            zzaijVar.f5428b = true;
                        }
                        zzahm zzahmVar2 = zzaijVar.f5451a;
                        if (zzaijVar.f5430d == 2) {
                            int iM6360B = zzeuVarM4141a.m6360B();
                            zzahmVar2.mo4121a(iM6360B, zzeuVarM4141a);
                            zzahmVar2.mo4095b(j5, 1, iM6360B, 0, null);
                        } else {
                            int iM6369K3 = zzeuVarM4141a.m6369K();
                            z3 = false;
                            if (iM6369K3 == 0 && !zzaijVar.f5429c) {
                                int iM6360B2 = zzeuVarM4141a.m6360B();
                                byte[] bArr = new byte[iM6360B2];
                                zzeuVarM4141a.m6366H(bArr, 0, iM6360B2);
                                zzaex zzaexVarM4054a = zzaey.m4054a(new zzet(bArr, iM6360B2), false);
                                zzt zztVar3 = new zzt();
                                zztVar3.m8852d("video/x-flv");
                                zztVar3.m8853e("audio/mp4a-latm");
                                zztVar3.f20798j = zzaexVarM4054a.f5138c;
                                zztVar3.f20780F = zzaexVarM4054a.f5137b;
                                zztVar3.f20782H = zzaexVarM4054a.f5136a;
                                zztVar3.f20805q = Collections.singletonList(bArr);
                                zzahmVar2.mo4097e(new zzv(zztVar3));
                                zzaijVar.f5429c = true;
                            } else if (zzaijVar.f5430d != 10 || iM6369K3 == 1) {
                                int iM6360B3 = zzeuVarM4141a.m6360B();
                                zzahmVar2.mo4121a(iM6360B3, zzeuVarM4141a);
                                zzahmVar2.mo4095b(j5, 1, iM6360B3, 0, null);
                            }
                            z2 = z3;
                            z = true;
                            j2 = -9223372036854775807L;
                        }
                        z3 = true;
                        z2 = z3;
                        z = true;
                        j2 = -9223372036854775807L;
                    }
                    if (!this.f5439h && z2) {
                        this.f5439h = true;
                        if (zzaimVar.f5448b == j2) {
                            j3 = -this.f5444m;
                        } else {
                            j3 = 0;
                        }
                        this.f5440i = j3;
                    }
                    this.f5441j = 4;
                    this.f5438g = 2;
                    if (z) {
                        return i2;
                    }
                } else {
                    i5 = i8;
                }
                i2 = 0;
                if (i5 != 9) {
                    j2 = -9223372036854775807L;
                    if (i5 != 18 || this.f5445n) {
                        zzagbVar.mo4091o(this.f5443l);
                        z2 = false;
                        z = false;
                    } else {
                        zzeu zzeuVarM4141a2 = m4141a(zzagbVar);
                        zzaimVar.getClass();
                        zzaimVar.getClass();
                        if (zzeuVarM4141a2.m6369K() == 2 && "onMetaData".equals(zzaim.m4142a(zzeuVarM4141a2)) && zzeuVarM4141a2.m6360B() != 0 && zzeuVarM4141a2.m6369K() == 8) {
                            HashMap mapM4143b = zzaim.m4143b(zzeuVarM4141a2);
                            Object obj = mapM4143b.get(TypedValues.TransitionType.S_DURATION);
                            if (obj instanceof Double) {
                                double dDoubleValue = ((Double) obj).doubleValue();
                                if (dDoubleValue > 0.0d) {
                                    zzaimVar.f5448b = (long) (dDoubleValue * 1000000.0d);
                                }
                            }
                            Object obj2 = mapM4143b.get("keyframes");
                            if (obj2 instanceof Map) {
                                Map map = (Map) obj2;
                                Object obj3 = map.get("filepositions");
                                Object obj4 = map.get("times");
                                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                    List list = (List) obj3;
                                    List list2 = (List) obj4;
                                    int size = list2.size();
                                    zzaimVar.f5449c = new long[size];
                                    zzaimVar.f5450d = new long[size];
                                    for (int i11 = 0; i11 < size; i11++) {
                                        Object obj5 = list.get(i11);
                                        Object obj6 = list2.get(i11);
                                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                            zzaimVar.f5449c = new long[0];
                                            zzaimVar.f5450d = new long[0];
                                            break;
                                        }
                                        zzaimVar.f5449c[i11] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                        zzaimVar.f5450d[i11] = ((Double) obj5).longValue();
                                    }
                                }
                            }
                        }
                        long j6 = zzaimVar.f5448b;
                        if (j6 != -9223372036854775807L) {
                            this.f5437f.mo4108d(new zzagw(j6, zzaimVar.f5450d, zzaimVar.f5449c));
                            this.f5445n = true;
                        }
                        z = true;
                        z2 = false;
                    }
                } else if (this.f5447p != null) {
                    if (!this.f5445n) {
                        this.f5437f.mo4108d(new zzahc(-9223372036854775807L, 0L));
                        this.f5445n = true;
                    }
                    zzaip zzaipVar = this.f5447p;
                    zzeu zzeuVarM4141a3 = m4141a(zzagbVar);
                    zzaipVar.getClass();
                    int iM6369K4 = zzeuVarM4141a3.m6369K();
                    int i12 = iM6369K4 >> 4;
                    int i13 = iM6369K4 & 15;
                    if (i13 != 7) {
                        throw new zzain(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i13).length() + 28), "Video format not supported: ", i13));
                    }
                    zzaipVar.f5457g = i12;
                    if (i12 != 5) {
                        zzahm zzahmVar3 = zzaipVar.f5451a;
                        int iM6369K5 = zzeuVarM4141a3.m6369K();
                        zzeuVarM4141a3.m6395v(3);
                        byte[] bArr2 = zzeuVarM4141a3.f14887a;
                        int i14 = zzeuVarM4141a3.f14888b;
                        int i15 = i14 + 1;
                        zzeuVarM4141a3.f14888b = i15;
                        int i16 = bArr2[i14] & 255;
                        int i17 = i14 + 2;
                        zzeuVarM4141a3.f14888b = i17;
                        int i18 = bArr2[i15] & 255;
                        zzeuVarM4141a3.f14888b = i14 + 3;
                        long j7 = ((i16 << 24) >> 8) | (i18 << 8) | (bArr2[i17] & 255);
                        boolean z5 = false;
                        if (iM6369K5 != 0) {
                            if (iM6369K5 == 1 && zzaipVar.f5455e) {
                                int i19 = zzaipVar.f5457g == 1 ? 1 : 0;
                                if (zzaipVar.f5456f) {
                                    i3 = i19;
                                } else if (i19 != 0) {
                                    i3 = 1;
                                }
                                zzeu zzeuVar3 = zzaipVar.f5453c;
                                byte[] bArr3 = zzeuVar3.f14887a;
                                bArr3[0] = 0;
                                bArr3[1] = 0;
                                bArr3[2] = 0;
                                int i20 = 4 - zzaipVar.f5454d;
                                int i21 = 0;
                                while (zzeuVarM4141a3.m6360B() > 0) {
                                    long j8 = j4;
                                    zzeuVarM4141a3.m6366H(zzeuVar3.f14887a, i20, zzaipVar.f5454d);
                                    zzeuVar3.m6363E(0);
                                    zzeu zzeuVar4 = zzaipVar.f5452b;
                                    int iM6382h = zzeuVar3.m6382h();
                                    zzeuVar4.m6363E(0);
                                    zzahmVar3.mo4121a(4, zzeuVar4);
                                    zzahmVar3.mo4121a(iM6382h, zzeuVarM4141a3);
                                    i21 = i21 + 4 + iM6382h;
                                    j4 = j8;
                                }
                                j2 = j4;
                                zzaipVar.f5451a.mo4095b((j7 * 1000) + j5, i3, i21, 0, null);
                                zzaipVar.f5456f = true;
                                z5 = true;
                            }
                            z2 = z5;
                            z = true;
                        } else if (!zzaipVar.f5455e) {
                            byte[] bArr4 = new byte[zzeuVarM4141a3.m6360B()];
                            zzeu zzeuVar5 = new zzeu(bArr4);
                            zzeuVarM4141a3.m6366H(bArr4, 0, zzeuVarM4141a3.m6360B());
                            zzaff zzaffVarM4063a = zzaff.m4063a(zzeuVar5);
                            zzaipVar.f5454d = zzaffVarM4063a.f5164b;
                            zzt zztVar4 = new zzt();
                            zztVar4.m8852d("video/x-flv");
                            zztVar4.m8853e("video/avc");
                            zztVar4.f20798j = zzaffVarM4063a.f5174l;
                            zztVar4.f20809u = zzaffVarM4063a.f5165c;
                            zztVar4.f20810v = zzaffVarM4063a.f5166d;
                            zztVar4.f20775A = zzaffVarM4063a.f5173k;
                            zztVar4.f20805q = zzaffVarM4063a.f5163a;
                            zzahmVar3.mo4097e(new zzv(zztVar4));
                            zzaipVar.f5455e = true;
                        }
                        j2 = -9223372036854775807L;
                        if (z5) {
                        }
                        z = true;
                    } else {
                        j2 = -9223372036854775807L;
                    }
                    z = true;
                } else {
                    j2 = -9223372036854775807L;
                    zzagbVar.mo4091o(this.f5443l);
                    z2 = false;
                    z = false;
                }
                if (!this.f5439h) {
                    this.f5439h = true;
                    if (zzaimVar.f5448b == j2) {
                        j3 = -this.f5444m;
                    } else {
                        j3 = 0;
                    }
                    this.f5440i = j3;
                }
                this.f5441j = 4;
                this.f5438g = 2;
                if (z) {
                    return i2;
                }
            }
        }
    }
}
