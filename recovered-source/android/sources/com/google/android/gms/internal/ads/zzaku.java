package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.EOFException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaku implements zzaga {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f5751r = 0;

    /* JADX INFO: renamed from: a */
    public final zzeu f5752a;

    /* JADX INFO: renamed from: b */
    public final zzagx f5753b;

    /* JADX INFO: renamed from: c */
    public final zzagt f5754c;

    /* JADX INFO: renamed from: d */
    public final zzagv f5755d;

    /* JADX INFO: renamed from: e */
    public zzagd f5756e;

    /* JADX INFO: renamed from: f */
    public zzahm f5757f;

    /* JADX INFO: renamed from: g */
    public zzahm f5758g;

    /* JADX INFO: renamed from: h */
    public int f5759h;

    /* JADX INFO: renamed from: i */
    public zzap f5760i;

    /* JADX INFO: renamed from: j */
    public zzap f5761j;

    /* JADX INFO: renamed from: k */
    public long f5762k;

    /* JADX INFO: renamed from: l */
    public long f5763l;

    /* JADX INFO: renamed from: m */
    public long f5764m;

    /* JADX INFO: renamed from: n */
    public long f5765n;

    /* JADX INFO: renamed from: o */
    public int f5766o;

    /* JADX INFO: renamed from: p */
    public zzaky f5767p;

    /* JADX INFO: renamed from: q */
    public boolean f5768q;

    public zzaku() {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4184a(zzagb zzagbVar, boolean z) throws EOFException {
        int iMo4084e;
        int i2;
        int iM4128a;
        zzagbVar.zzl();
        if (zzagbVar.mo4086g() == 0) {
            zzap zzapVarM4126a = this.f5755d.m4126a(zzagbVar, null, 131072);
            this.f5760i = zzapVarM4126a;
            if (zzapVarM4126a != null) {
                this.f5754c.m4123a(zzapVarM4126a);
            }
            iMo4084e = (int) zzagbVar.mo4084e();
            if (!z) {
                zzagbVar.mo4091o(iMo4084e);
            }
            i2 = 0;
        } else {
            iMo4084e = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (m4185c(zzagbVar)) {
                if (i3 > 0) {
                    break;
                }
                m4186d();
                throw new EOFException();
            }
            zzeu zzeuVar = this.f5752a;
            zzeuVar.m6363E(0);
            int iM6376b = zzeuVar.m6376b();
            if ((i2 == 0 || ((-128000) & iM6376b) == (((long) i2) & (-128000))) && (iM4128a = zzagy.m4128a(iM6376b)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.f5753b.m4127a(iM6376b);
                    i2 = iM6376b;
                }
                zzagbVar.mo4075E(iM4128a - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == 131072) {
                    if (z) {
                        return false;
                    }
                    m4186d();
                    throw new EOFException();
                }
                if (z) {
                    zzagbVar.zzl();
                    zzagbVar.mo4075E(iMo4084e + i5);
                } else {
                    zzagbVar.mo4091o(1);
                }
                i3 = 0;
                i4 = i5;
                i2 = 0;
            }
        }
        if (z) {
            zzagbVar.mo4091o(iMo4084e + i4);
        } else {
            zzagbVar.zzl();
        }
        this.f5759h = i2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final boolean m4185c(zzagb zzagbVar) {
        zzaky zzakyVar = this.f5767p;
        if (zzakyVar != null) {
            long jMo4182c = zzakyVar.mo4182c();
            if (jMo4182c == -1 || zzagbVar.mo4084e() <= jMo4182c - 4) {
                try {
                    if (!zzagbVar.mo4081K(this.f5752a.f14887a, 0, 4, true)) {
                        return false;
                    }
                } catch (EOFException unused) {
                }
            }
        } else if (!zzagbVar.mo4081K(this.f5752a.f14887a, 0, 4, true)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m4186d() {
        Object obj = this.f5767p;
        if ((obj instanceof zzakp) && ((zzafq) obj).zzb()) {
            long j2 = this.f5765n;
            if (j2 == -1 || j2 == this.f5767p.mo4182c()) {
                return;
            }
            zzakp zzakpVar = (zzakp) this.f5767p;
            this.f5767p = new zzakp(this.f5765n, zzakpVar.f5742h, zzakpVar.f5743i, zzakpVar.f5744j, false);
            zzagd zzagdVar = this.f5756e;
            zzagdVar.getClass();
            zzagdVar.mo4108d(this.f5767p);
            this.f5757f.getClass();
            this.f5767p.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        this.f5759h = 0;
        this.f5762k = -9223372036854775807L;
        this.f5763l = 0L;
        this.f5766o = 0;
        this.f5765n = -1L;
        if (this.f5767p instanceof zzakq) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) {
        return m4184a(zzagbVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f5756e = zzagdVar;
        zzahm zzahmVarMo4109f = zzagdVar.mo4109f(0, 1);
        this.f5757f = zzahmVarMo4109f;
        this.f5758g = zzahmVarMo4109f;
        this.f5756e.mo4110v();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x027a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0284  */
    /* JADX WARN: Code duplicated, block: B:110:0x0298  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    /* JADX WARN: Code duplicated, block: B:121:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:124:0x030b  */
    /* JADX WARN: Code duplicated, block: B:126:0x030f  */
    /* JADX WARN: Code duplicated, block: B:128:0x031a  */
    /* JADX WARN: Code duplicated, block: B:130:0x031e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0355  */
    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    /* JADX WARN: Code duplicated, block: B:140:0x0372  */
    /* JADX WARN: Code duplicated, block: B:141:0x0377  */
    /* JADX WARN: Code duplicated, block: B:144:0x0399 A[LOOP:0: B:143:0x0397->B:144:0x0399, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:149:0x03d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:150:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:151:0x03d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:155:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:156:0x0408  */
    /* JADX WARN: Code duplicated, block: B:160:0x041d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0421  */
    /* JADX WARN: Code duplicated, block: B:163:0x0426  */
    /* JADX WARN: Code duplicated, block: B:166:0x0458  */
    /* JADX WARN: Code duplicated, block: B:168:0x0471  */
    /* JADX WARN: Code duplicated, block: B:170:0x047c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0484  */
    /* JADX WARN: Code duplicated, block: B:175:0x048d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0496  */
    /* JADX WARN: Code duplicated, block: B:178:0x049a  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:192:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:193:0x04f8 A[PHI: r2
  0x04f8: PHI (r2v13 int) = (r2v12 int), (r2v20 int) binds: [B:174:0x048b, B:187:0x04df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:196:0x0502  */
    /* JADX WARN: Code duplicated, block: B:199:0x050a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:212:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095 A[PHI: r2 r15 r41 r52
  0x0095: PHI (r2v38 com.google.android.gms.internal.ads.zzagt) = 
  (r2v26 com.google.android.gms.internal.ads.zzagt)
  (r2v26 com.google.android.gms.internal.ads.zzagt)
  (r2v26 com.google.android.gms.internal.ads.zzagt)
  (r2v56 com.google.android.gms.internal.ads.zzagt)
 binds: [B:122:0x0307, B:129:0x031c, B:111:0x02a2, B:34:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r15v4 boolean) = (r15v9 boolean), (r15v11 boolean), (r15v2 boolean), (r15v8 boolean) binds: [B:122:0x0307, B:129:0x031c, B:111:0x02a2, B:34:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r41v2 com.google.android.gms.internal.ads.zzeu) = 
  (r41v0 com.google.android.gms.internal.ads.zzeu)
  (r41v0 com.google.android.gms.internal.ads.zzeu)
  (r41v0 com.google.android.gms.internal.ads.zzeu)
  (r41v4 com.google.android.gms.internal.ads.zzeu)
 binds: [B:122:0x0307, B:129:0x031c, B:111:0x02a2, B:34:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r52v3 int) = (r52v1 int), (r52v1 int), (r52v1 int), (r52v5 int) binds: [B:122:0x0307, B:129:0x031c, B:111:0x02a2, B:34:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    /* JADX WARN: Code duplicated, block: B:46:0x0104  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:51:0x010e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0121  */
    /* JADX WARN: Code duplicated, block: B:64:0x0170  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e3 A[LOOP:2: B:78:0x01e1->B:79:0x01e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x0200  */
    /* JADX WARN: Code duplicated, block: B:88:0x020b  */
    /* JADX WARN: Code duplicated, block: B:90:0x022d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0235  */
    /* JADX WARN: Code duplicated, block: B:96:0x024e  */
    /* JADX WARN: Code duplicated, block: B:99:0x026b  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) {
        int i2;
        int i3;
        long j2;
        zzaky zzakyVar;
        zzeu zzeuVar;
        long j3;
        zzeu zzeuVar2;
        boolean z;
        long j4;
        long jMo4086g;
        ?? r15;
        int i4;
        int iMo4122d;
        int i5;
        int iM6376b;
        zzeu zzeuVar3;
        int i6;
        int iM6376b2;
        zzagt zzagtVar;
        int iM6376b3;
        int iM6382h;
        long jM6374P;
        long[] jArr;
        zzeu zzeuVar4;
        zzakw zzakwVar;
        int i7;
        int i8;
        long j5;
        zzala zzalaVar;
        zzeu zzeuVar5;
        long jMin;
        zzagt zzagtVar2;
        int i9;
        boolean z2;
        zzap zzapVar;
        long jMo4086g2;
        zzagx zzagxVar;
        long jMo4089j;
        long jM4189a;
        long j6;
        zzaky zzakpVar;
        long jMo4089j2;
        long jM4189a2;
        float fIntBitsToFloat;
        zzakv zzakvVarM4187a;
        zzakv zzakvVarM4187a2;
        zzakw zzakwVar2;
        int i10;
        long[] jArr2;
        int i11;
        boolean z3;
        zzap zzapVar2;
        long jMo4086g3;
        zzajv zzajvVar;
        zzajx zzajxVar;
        int i12;
        long jM6519u;
        int[] iArr;
        int length;
        long[] jArr3;
        long[] jArr4;
        int i13;
        zzakr zzakrVar;
        zzaky zzakpVar2;
        zzap zzapVarM4288c;
        zzt zztVar;
        zzap zzapVar3;
        long jMo4089j3;
        long jMo4086g4;
        long j7;
        long j8;
        int iM6376b4;
        zzeu zzeuVar6;
        long jM6520v;
        int iM6370L;
        int iM6370L2;
        int iM6370L3;
        long j9;
        long[] jArr5;
        zzagt zzagtVar3;
        long[] jArr6;
        int i14;
        zzeu zzeuVar7;
        long jMax;
        int iM6369K;
        this.f5757f.getClass();
        String str = zzfm.f16091a;
        int i15 = this.f5759h;
        zzagx zzagxVar2 = this.f5753b;
        if (i15 == 0) {
            try {
                m4184a(zzagbVar, false);
                zzakyVar = this.f5767p;
                zzeuVar = this.f5752a;
                j3 = 0;
                if (zzakyVar == null) {
                    zzeuVar3 = new zzeu(zzagxVar2.f5291c);
                    zzagbVar.mo4078H(zzeuVar3.f14887a, 0, zzagxVar2.f5291c);
                    i6 = 21;
                    if ((zzagxVar2.f5289a & 1) != 0) {
                        if (zzagxVar2.f5293e != 1) {
                            i6 = 36;
                        }
                    } else if (zzagxVar2.f5293e == 1) {
                        i6 = 13;
                    }
                    j2 = 1000000;
                    if (zzeuVar3.f14889c >= i6 + 4) {
                        zzeuVar3.m6363E(i6);
                        iM6376b2 = zzeuVar3.m6376b();
                        if (iM6376b2 != 1483304551) {
                            if (iM6376b2 == 1231971951) {
                                iM6376b2 = 1231971951;
                            } else if (zzeuVar3.f14889c >= 40) {
                                zzeuVar3.m6363E(36);
                                if (zzeuVar3.m6376b() == 1447187017) {
                                    iM6376b2 = 1447187017;
                                } else {
                                    iM6376b2 = 0;
                                }
                            } else {
                                iM6376b2 = 0;
                            }
                        }
                    } else if (zzeuVar3.f14889c >= 40) {
                        zzeuVar3.m6363E(36);
                        if (zzeuVar3.m6376b() == 1447187017) {
                            iM6376b2 = 1447187017;
                        } else {
                            iM6376b2 = 0;
                        }
                    } else {
                        iM6376b2 = 0;
                    }
                    zzagtVar = this.f5754c;
                    if (iM6376b2 == 1231971951) {
                        iM6376b3 = zzeuVar3.m6376b();
                        if ((iM6376b3 & 1) != 0) {
                            iM6382h = zzeuVar3.m6382h();
                        } else {
                            iM6382h = -1;
                        }
                        if ((iM6376b3 & 2) != 0) {
                            jM6374P = zzeuVar3.m6374P();
                        } else {
                            jM6374P = -1;
                        }
                        if ((iM6376b3 & 4) == 4) {
                            jArr2 = new long[100];
                            i11 = 0;
                            for (i10 = 100; i11 < i10; i10 = 100) {
                                jArr2[i11] = zzeuVar3.m6369K();
                                i11++;
                                jM6374P = jM6374P;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        long j10 = jM6374P;
                        if ((iM6376b3 & 8) != 0) {
                            zzeuVar3.m6365G(4);
                        }
                        if (zzeuVar3.m6360B() >= 24) {
                            zzeuVar3.m6365G(11);
                            fIntBitsToFloat = Float.intBitsToFloat(zzeuVar3.m6376b());
                            int iM6370L4 = zzeuVar3.m6370L();
                            int iM6370L5 = zzeuVar3.m6370L();
                            zzakvVarM4187a = zzakv.m4187a(iM6370L4);
                            zzakvVarM4187a2 = zzakv.m4187a(iM6370L5);
                            if (fIntBitsToFloat > 0.0f && zzakvVarM4187a == null && zzakvVarM4187a2 == null) {
                                zzakwVar2 = null;
                            } else {
                                zzakwVar2 = new zzakw(fIntBitsToFloat, zzakvVarM4187a, zzakvVarM4187a2);
                            }
                            zzeuVar3.m6365G(2);
                            int iM6373O = zzeuVar3.m6373O();
                            int i16 = iM6373O >> 12;
                            i8 = iM6373O & 4095;
                            zzeuVar4 = zzeuVar;
                            zzakwVar = zzakwVar2;
                            i7 = i16;
                        } else {
                            zzeuVar4 = zzeuVar;
                            zzakwVar = null;
                            i7 = -1;
                            i8 = -1;
                        }
                        j5 = iM6382h;
                        zzeuVar5 = zzeuVar4;
                        jMin = j10;
                        zzagtVar2 = zzagtVar;
                        i9 = 0;
                        z2 = true;
                        z3 = true;
                        z2 = true;
                        z3 = true;
                        z2 = true;
                        zzalaVar = new zzala(zzagxVar2, j5, jMin, jArr, zzakwVar, i7, i8);
                        if ((zzagtVar2.f5268a != -1 || zzagtVar2.f5269b == -1) && i7 != -1 && i8 != -1) {
                            zzagtVar2.f5268a = i7;
                            zzagtVar2.f5269b = i8;
                        }
                        if (zzakwVar != null) {
                            zzapVar = new zzap(zzakwVar);
                        } else {
                            zzapVar = null;
                        }
                        this.f5761j = zzapVar;
                        jMo4086g2 = zzagbVar.mo4086g();
                        zzagbVar.mo4091o(zzagxVar2.f5291c);
                        zzagxVar = zzalaVar.f5782a;
                        if (iM6376b2 == 1483304551) {
                            jMo4089j2 = zzagbVar.mo4089j();
                            jM4189a2 = zzalaVar.m4189a();
                            if (jM4189a2 == -9223372036854775807L) {
                                zzakpVar = null;
                                z3 = z2;
                            } else {
                                if (jMin != -1 && jMo4089j2 != -1 && jMo4086g2 + jMin != jMo4089j2) {
                                    long j11 = jMo4089j2 - jMo4086g2;
                                    StringBuilder sb = new StringBuilder(String.valueOf(jMin).length() + String.valueOf(j11).length() + 53 + 23);
                                    AbstractC1456a.m2456w(sb, "Data size mismatch between stream (", j11, ") and Xing frame (");
                                    sb.append(jMin);
                                    sb.append("), using smaller value.");
                                    zzeh.m6210b("XingSeeker", sb.toString());
                                    jMin = Math.min(jMin, j11);
                                }
                                zzakpVar = new zzalb(jMo4086g2, zzagxVar.f5291c, jM4189a2, zzagxVar.f5294f, jMin, jArr);
                            }
                        } else {
                            jMo4089j = zzagbVar.mo4089j();
                            jM4189a = zzalaVar.m4189a();
                            if (jM4189a != -9223372036854775807L) {
                                if (jMin != -1) {
                                    jMo4089j = jMo4086g2 + jMin;
                                    j6 = jMin - ((long) zzagxVar.f5291c);
                                } else if (jMo4089j != -1) {
                                    j6 = (jMo4089j - jMo4086g2) - ((long) zzagxVar.f5291c);
                                } else {
                                    zzakpVar = null;
                                    z3 = z2;
                                }
                                long j12 = j6;
                                long j13 = jMo4089j;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                zzakpVar = new zzakp(j13, jMo4086g2 + ((long) zzagxVar.f5291c), zzhaq.m7304a(zzfm.m6521w(j12, 8000000L, jM4189a, roundingMode)), zzhaq.m7304a(zzhai.m7296a(j12, j5, roundingMode)), true);
                            } else {
                                zzakpVar = null;
                                z3 = z2;
                            }
                        }
                    } else if (iM6376b2 != 1447187017) {
                        if (iM6376b2 != 1483304551) {
                            zzagbVar.zzl();
                            i9 = 0;
                            zzeuVar5 = zzeuVar;
                            z2 = true;
                            zzagtVar2 = zzagtVar;
                        } else {
                            iM6376b3 = zzeuVar3.m6376b();
                            if ((iM6376b3 & 1) != 0) {
                                iM6382h = zzeuVar3.m6382h();
                            } else {
                                iM6382h = -1;
                            }
                            if ((iM6376b3 & 2) != 0) {
                                jM6374P = zzeuVar3.m6374P();
                            } else {
                                jM6374P = -1;
                            }
                            if ((iM6376b3 & 4) == 4) {
                                jArr2 = new long[100];
                                i11 = 0;
                                while (i11 < i10) {
                                    jArr2[i11] = zzeuVar3.m6369K();
                                    i11++;
                                    jM6374P = jM6374P;
                                }
                                jArr = jArr2;
                            } else {
                                jArr = null;
                            }
                            long j14 = jM6374P;
                            if ((iM6376b3 & 8) != 0) {
                                zzeuVar3.m6365G(4);
                            }
                            if (zzeuVar3.m6360B() >= 24) {
                                zzeuVar3.m6365G(11);
                                fIntBitsToFloat = Float.intBitsToFloat(zzeuVar3.m6376b());
                                int iM6370L6 = zzeuVar3.m6370L();
                                int iM6370L7 = zzeuVar3.m6370L();
                                zzakvVarM4187a = zzakv.m4187a(iM6370L6);
                                zzakvVarM4187a2 = zzakv.m4187a(iM6370L7);
                                if (fIntBitsToFloat > 0.0f) {
                                    zzakwVar2 = new zzakw(fIntBitsToFloat, zzakvVarM4187a, zzakvVarM4187a2);
                                } else {
                                    zzakwVar2 = new zzakw(fIntBitsToFloat, zzakvVarM4187a, zzakvVarM4187a2);
                                }
                                zzeuVar3.m6365G(2);
                                int iM6373O2 = zzeuVar3.m6373O();
                                int i17 = iM6373O2 >> 12;
                                i8 = iM6373O2 & 4095;
                                zzeuVar4 = zzeuVar;
                                zzakwVar = zzakwVar2;
                                i7 = i17;
                            } else {
                                zzeuVar4 = zzeuVar;
                                zzakwVar = null;
                                i7 = -1;
                                i8 = -1;
                            }
                            j5 = iM6382h;
                            zzeuVar5 = zzeuVar4;
                            jMin = j14;
                            zzagtVar2 = zzagtVar;
                            i9 = 0;
                            z2 = true;
                            z3 = true;
                            z2 = true;
                            z3 = true;
                            z2 = true;
                            zzalaVar = new zzala(zzagxVar2, j5, jMin, jArr, zzakwVar, i7, i8);
                            if (zzagtVar2.f5268a != -1) {
                                zzagtVar2.f5268a = i7;
                                zzagtVar2.f5269b = i8;
                            } else {
                                zzagtVar2.f5268a = i7;
                                zzagtVar2.f5269b = i8;
                            }
                            if (zzakwVar != null) {
                                zzapVar = new zzap(zzakwVar);
                            } else {
                                zzapVar = null;
                            }
                            this.f5761j = zzapVar;
                            jMo4086g2 = zzagbVar.mo4086g();
                            zzagbVar.mo4091o(zzagxVar2.f5291c);
                            zzagxVar = zzalaVar.f5782a;
                            if (iM6376b2 == 1483304551) {
                                jMo4089j2 = zzagbVar.mo4089j();
                                jM4189a2 = zzalaVar.m4189a();
                                if (jM4189a2 == -9223372036854775807L) {
                                    if (jMin != -1) {
                                        long j15 = jMo4089j2 - jMo4086g2;
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(jMin).length() + String.valueOf(j15).length() + 53 + 23);
                                        AbstractC1456a.m2456w(sb2, "Data size mismatch between stream (", j15, ") and Xing frame (");
                                        sb2.append(jMin);
                                        sb2.append("), using smaller value.");
                                        zzeh.m6210b("XingSeeker", sb2.toString());
                                        jMin = Math.min(jMin, j15);
                                    }
                                    zzakpVar = new zzalb(jMo4086g2, zzagxVar.f5291c, jM4189a2, zzagxVar.f5294f, jMin, jArr);
                                }
                            } else {
                                jMo4089j = zzagbVar.mo4089j();
                                jM4189a = zzalaVar.m4189a();
                                if (jM4189a != -9223372036854775807L) {
                                    if (jMin != -1) {
                                        jMo4089j = jMo4086g2 + jMin;
                                        j6 = jMin - ((long) zzagxVar.f5291c);
                                    } else if (jMo4089j != -1) {
                                        j6 = (jMo4089j - jMo4086g2) - ((long) zzagxVar.f5291c);
                                    }
                                    long j16 = j6;
                                    long j17 = jMo4089j;
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    zzakpVar = new zzakp(j17, jMo4086g2 + ((long) zzagxVar.f5291c), zzhaq.m7304a(zzfm.m6521w(j16, 8000000L, jM4189a, roundingMode2)), zzhaq.m7304a(zzhai.m7296a(j16, j5, roundingMode2)), true);
                                }
                            }
                        }
                        zzakpVar = null;
                        z3 = z2;
                    } else {
                        jMo4089j3 = zzagbVar.mo4089j();
                        jMo4086g4 = zzagbVar.mo4086g();
                        zzeuVar3.m6365G(6);
                        int iM6376b5 = zzeuVar3.m6376b();
                        j7 = zzagxVar2.f5291c;
                        j8 = iM6376b5;
                        iM6376b4 = zzeuVar3.m6376b();
                        if (iM6376b4 <= 0) {
                            zzeuVar7 = zzeuVar;
                            zzagtVar3 = zzagtVar;
                        } else {
                            zzeuVar6 = zzeuVar;
                            jM6520v = zzfm.m6520v(zzagxVar2.f5292d, (((long) iM6376b4) * ((long) zzagxVar2.f5295g)) - 1);
                            iM6370L = zzeuVar3.m6370L();
                            iM6370L2 = zzeuVar3.m6370L();
                            iM6370L3 = zzeuVar3.m6370L();
                            zzeuVar3.m6365G(2);
                            j9 = jMo4086g4 + ((long) zzagxVar2.f5291c);
                            jArr5 = new long[iM6370L];
                            zzagtVar3 = zzagtVar;
                            jArr6 = new long[iM6370L];
                            i14 = 0;
                            while (true) {
                                if (i14 < iM6370L) {
                                    zzeuVar7 = zzeuVar6;
                                    jMax = jMo4086g4 + j7 + j8;
                                    if (jMo4089j3 != -1 && jMo4089j3 != jMax) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(jMo4089j3).length() + 27 + String.valueOf(jMax).length());
                                        AbstractC1456a.m2456w(sb3, "VBRI data size mismatch: ", jMo4089j3, ", ");
                                        sb3.append(jMax);
                                        zzeh.m6211c("VbriSeeker", sb3.toString());
                                    }
                                    if (jMax != j9) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(j9).length() + String.valueOf(jMax).length() + 43 + 28);
                                        AbstractC1456a.m2456w(sb4, "VBRI bytes and ToC mismatch (using max): ", jMax, ", ");
                                        sb4.append(j9);
                                        sb4.append("\nSeeking will be inaccurate.");
                                        zzeh.m6211c("VbriSeeker", sb4.toString());
                                        jMax = Math.max(jMax, j9);
                                    }
                                    zzakpVar = new zzakz(jArr5, jArr6, jM6520v, jMax, zzagxVar2.f5294f);
                                    break;
                                }
                                long j18 = j8;
                                zzeuVar7 = zzeuVar6;
                                jArr5[i14] = (((long) i14) * jM6520v) / ((long) iM6370L);
                                jArr6[i14] = j9;
                                if (iM6370L3 != 1) {
                                    iM6369K = zzeuVar3.m6369K();
                                } else if (iM6370L3 != 2) {
                                    iM6369K = zzeuVar3.m6370L();
                                } else if (iM6370L3 != 3) {
                                    iM6369K = zzeuVar3.m6373O();
                                } else if (iM6370L3 != 4) {
                                    iM6369K = zzeuVar3.m6382h();
                                }
                                j9 += ((long) iM6369K) * ((long) iM6370L2);
                                i14++;
                                zzeuVar6 = zzeuVar7;
                                iM6370L3 = iM6370L3;
                                j8 = j18;
                            }
                            zzagbVar.mo4091o(zzagxVar2.f5291c);
                            zzeuVar5 = zzeuVar7;
                            zzagtVar2 = zzagtVar3;
                            i9 = 0;
                            z3 = true;
                        }
                        zzakpVar = null;
                        zzagbVar.mo4091o(zzagxVar2.f5291c);
                        zzeuVar5 = zzeuVar7;
                        zzagtVar2 = zzagtVar3;
                        i9 = 0;
                        z3 = true;
                    }
                    zzapVar2 = this.f5760i;
                    jMo4086g3 = zzagbVar.mo4086g();
                    if (zzapVar2 == null && (zzajvVar = (zzajv) zzapVar2.m4286a(zzajv.class, zzgtu.f18181s)) != null) {
                        zzajxVar = (zzajx) zzapVar2.m4286a(zzajx.class, new zzgts() { // from class: com.google.android.gms.internal.ads.zzakt
                            @Override // com.google.android.gms.internal.ads.zzgts
                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ boolean mo3897b(Object obj) {
                                int i18 = zzaku.f5751r;
                                return ((zzajx) obj).f5554a.equals("TLEN");
                            }
                        });
                        if (zzajxVar == null) {
                            i12 = i9;
                            jM6519u = -9223372036854775807L;
                        } else {
                            i12 = i9;
                            jM6519u = zzfm.m6519u(Long.parseLong((String) zzajxVar.f5567c.get(i12)));
                        }
                        iArr = zzajvVar.f5562e;
                        length = iArr.length;
                        int i18 = length + 1;
                        jArr3 = new long[i18];
                        jArr4 = new long[i18];
                        jArr3[i12] = jMo4086g3;
                        jArr4[i12] = 0;
                        i13 = z3 ? 1 : 0;
                        while (i13 <= length) {
                            int i19 = i13 - 1;
                            long j19 = jMo4086g3 + ((long) (zzajvVar.f5560c + iArr[i19]));
                            j3 += (long) (zzajvVar.f5561d + zzajvVar.f5563f[i19]);
                            jArr3[i13] = j19;
                            jArr4[i13] = j3;
                            i13++;
                            iArr = iArr;
                            jMo4086g3 = j19;
                        }
                        zzakrVar = new zzakr(jM6519u, jArr3, jArr4);
                    } else {
                        zzakrVar = null;
                    }
                    if (this.f5768q) {
                        zzakpVar2 = new zzakx();
                        zzeuVar2 = zzeuVar5;
                    } else {
                        if (zzakrVar != null) {
                            zzakpVar = zzakrVar;
                        } else if (zzakpVar == null) {
                            zzakpVar = null;
                        }
                        zzeuVar2 = zzeuVar5;
                        if (zzakpVar == null) {
                            zzagbVar.mo4078H(zzeuVar2.f14887a, 0, 4);
                            zzeuVar2.m6363E(0);
                            zzagxVar2.m4127a(zzeuVar2.m6376b());
                            zzakpVar2 = new zzakp(zzagbVar.mo4089j(), zzagbVar.mo4086g(), zzagxVar2.f5294f, zzagxVar2.f5291c, true);
                        } else {
                            zzakpVar2 = zzakpVar;
                        }
                        zzahm zzahmVar = this.f5757f;
                        zzakpVar2.zza();
                        zzahmVar.getClass();
                    }
                    this.f5767p = zzakpVar2;
                    this.f5756e.mo4108d(zzakpVar2);
                    zzapVarM4288c = this.f5760i;
                    if (zzapVarM4288c != null) {
                        zzapVar3 = this.f5761j;
                        if (zzapVar3 != null) {
                            zzapVarM4288c = zzapVarM4288c.m4288c(zzapVar3);
                        }
                    } else {
                        zzapVarM4288c = this.f5761j;
                    }
                    zztVar = new zzt();
                    zztVar.m8852d("audio/mpeg");
                    zztVar.m8853e(zzagxVar2.f5290b);
                    zztVar.f20803o = 4096;
                    zztVar.f20780F = zzagxVar2.f5293e;
                    zztVar.f20782H = zzagxVar2.f5292d;
                    zztVar.f20784J = zzagtVar2.f5268a;
                    zztVar.f20785K = zzagtVar2.f5269b;
                    zztVar.f20799k = zzapVarM4288c;
                    if (this.f5767p.zzh() != -2147483647) {
                        zztVar.f20796h = this.f5767p.zzh();
                    }
                    this.f5758g.mo4097e(new zzv(zztVar));
                    this.f5764m = zzagbVar.mo4086g();
                    r15 = z3;
                } else {
                    zzeuVar2 = zzeuVar;
                    z = true;
                    j2 = 1000000;
                    j4 = this.f5764m;
                    if (j4 != 0) {
                        jMo4086g = zzagbVar.mo4086g();
                        if (jMo4086g < j4) {
                            r15 = z;
                            r15 = z;
                            zzagbVar.mo4091o((int) (j4 - jMo4086g));
                            r15 = z;
                        }
                    }
                }
                r15 = z;
                r15 = z;
                r15 = z;
                i4 = this.f5766o;
                if (i4 == 0) {
                    zzagbVar.zzl();
                    if (m4185c(zzagbVar)) {
                        i2 = -1;
                        i3 = -1;
                    } else {
                        zzeuVar2.m6363E(0);
                        iM6376b = zzeuVar2.m6376b();
                        if (((-128000) & iM6376b) == (((long) this.f5759h) & (-128000)) || zzagy.m4128a(iM6376b) == -1) {
                            zzagbVar.mo4091o(r15);
                            this.f5759h = 0;
                        } else {
                            zzagxVar2.m4127a(iM6376b);
                            if (this.f5762k == -9223372036854775807L) {
                                this.f5762k = this.f5767p.mo4181b(zzagbVar.mo4086g());
                            }
                            i4 = zzagxVar2.f5291c;
                            this.f5766o = i4;
                            this.f5765n = zzagbVar.mo4086g() + ((long) i4);
                            if (this.f5767p instanceof zzakq) {
                                long j20 = ((this.f5763l + ((long) zzagxVar2.f5295g)) * j2) / ((long) zzagxVar2.f5292d);
                                throw null;
                            }
                            iMo4122d = this.f5758g.mo4122d(zzagbVar, i4, r15);
                            if (iMo4122d == -1) {
                                i2 = -1;
                                i3 = -1;
                            } else {
                                i5 = this.f5766o - iMo4122d;
                                this.f5766o = i5;
                                if (i5 <= 0) {
                                    this.f5758g.mo4095b(((this.f5763l * j2) / ((long) zzagxVar2.f5292d)) + this.f5762k, 1, zzagxVar2.f5291c, 0, null);
                                    this.f5763l += (long) zzagxVar2.f5295g;
                                    this.f5766o = 0;
                                    i3 = 0;
                                    i2 = -1;
                                }
                            }
                        }
                        i2 = -1;
                        i3 = 0;
                    }
                } else {
                    iMo4122d = this.f5758g.mo4122d(zzagbVar, i4, r15);
                    if (iMo4122d == -1) {
                        i2 = -1;
                        i3 = -1;
                    } else {
                        i5 = this.f5766o - iMo4122d;
                        this.f5766o = i5;
                        if (i5 <= 0) {
                            i2 = -1;
                            i3 = 0;
                        } else {
                            this.f5758g.mo4095b(((this.f5763l * j2) / ((long) zzagxVar2.f5292d)) + this.f5762k, 1, zzagxVar2.f5291c, 0, null);
                            this.f5763l += (long) zzagxVar2.f5295g;
                            this.f5766o = 0;
                            i3 = 0;
                            i2 = -1;
                        }
                    }
                }
            } catch (EOFException unused) {
                i2 = -1;
                i3 = -1;
                j2 = 1000000;
            }
        } else {
            zzakyVar = this.f5767p;
            zzeuVar = this.f5752a;
            j3 = 0;
            if (zzakyVar == null) {
                zzeuVar3 = new zzeu(zzagxVar2.f5291c);
                zzagbVar.mo4078H(zzeuVar3.f14887a, 0, zzagxVar2.f5291c);
                i6 = 21;
                if ((zzagxVar2.f5289a & 1) != 0) {
                    if (zzagxVar2.f5293e != 1) {
                        i6 = 36;
                    }
                } else if (zzagxVar2.f5293e == 1) {
                    i6 = 13;
                }
                j2 = 1000000;
                if (zzeuVar3.f14889c >= i6 + 4) {
                    zzeuVar3.m6363E(i6);
                    iM6376b2 = zzeuVar3.m6376b();
                    if (iM6376b2 != 1483304551) {
                        if (iM6376b2 == 1231971951) {
                            iM6376b2 = 1231971951;
                        } else if (zzeuVar3.f14889c >= 40) {
                            zzeuVar3.m6363E(36);
                            if (zzeuVar3.m6376b() == 1447187017) {
                                iM6376b2 = 1447187017;
                            } else {
                                iM6376b2 = 0;
                            }
                        } else {
                            iM6376b2 = 0;
                        }
                    }
                } else if (zzeuVar3.f14889c >= 40) {
                    zzeuVar3.m6363E(36);
                    if (zzeuVar3.m6376b() == 1447187017) {
                        iM6376b2 = 1447187017;
                    } else {
                        iM6376b2 = 0;
                    }
                } else {
                    iM6376b2 = 0;
                }
                zzagtVar = this.f5754c;
                if (iM6376b2 == 1231971951) {
                    iM6376b3 = zzeuVar3.m6376b();
                    if ((iM6376b3 & 1) != 0) {
                        iM6382h = zzeuVar3.m6382h();
                    } else {
                        iM6382h = -1;
                    }
                    if ((iM6376b3 & 2) != 0) {
                        jM6374P = zzeuVar3.m6374P();
                    } else {
                        jM6374P = -1;
                    }
                    if ((iM6376b3 & 4) == 4) {
                        jArr2 = new long[100];
                        i11 = 0;
                        while (i11 < i10) {
                            jArr2[i11] = zzeuVar3.m6369K();
                            i11++;
                            jM6374P = jM6374P;
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    long j110 = jM6374P;
                    if ((iM6376b3 & 8) != 0) {
                        zzeuVar3.m6365G(4);
                    }
                    if (zzeuVar3.m6360B() >= 24) {
                        zzeuVar3.m6365G(11);
                        fIntBitsToFloat = Float.intBitsToFloat(zzeuVar3.m6376b());
                        int iM6370L8 = zzeuVar3.m6370L();
                        int iM6370L9 = zzeuVar3.m6370L();
                        zzakvVarM4187a = zzakv.m4187a(iM6370L8);
                        zzakvVarM4187a2 = zzakv.m4187a(iM6370L9);
                        if (fIntBitsToFloat > 0.0f) {
                            zzakwVar2 = new zzakw(fIntBitsToFloat, zzakvVarM4187a, zzakvVarM4187a2);
                        } else {
                            zzakwVar2 = new zzakw(fIntBitsToFloat, zzakvVarM4187a, zzakvVarM4187a2);
                        }
                        zzeuVar3.m6365G(2);
                        int iM6373O3 = zzeuVar3.m6373O();
                        int i110 = iM6373O3 >> 12;
                        i8 = iM6373O3 & 4095;
                        zzeuVar4 = zzeuVar;
                        zzakwVar = zzakwVar2;
                        i7 = i110;
                    } else {
                        zzeuVar4 = zzeuVar;
                        zzakwVar = null;
                        i7 = -1;
                        i8 = -1;
                    }
                    j5 = iM6382h;
                    zzeuVar5 = zzeuVar4;
                    jMin = j110;
                    zzagtVar2 = zzagtVar;
                    i9 = 0;
                    z2 = true;
                    z3 = true;
                    z2 = true;
                    z3 = true;
                    z2 = true;
                    zzalaVar = new zzala(zzagxVar2, j5, jMin, jArr, zzakwVar, i7, i8);
                    if (zzagtVar2.f5268a != -1) {
                        zzagtVar2.f5268a = i7;
                        zzagtVar2.f5269b = i8;
                    } else {
                        zzagtVar2.f5268a = i7;
                        zzagtVar2.f5269b = i8;
                    }
                    if (zzakwVar != null) {
                        zzapVar = new zzap(zzakwVar);
                    } else {
                        zzapVar = null;
                    }
                    this.f5761j = zzapVar;
                    jMo4086g2 = zzagbVar.mo4086g();
                    zzagbVar.mo4091o(zzagxVar2.f5291c);
                    zzagxVar = zzalaVar.f5782a;
                    if (iM6376b2 == 1483304551) {
                        jMo4089j2 = zzagbVar.mo4089j();
                        jM4189a2 = zzalaVar.m4189a();
                        if (jM4189a2 == -9223372036854775807L) {
                            zzakpVar = null;
                            z3 = z2;
                        } else {
                            if (jMin != -1) {
                                long j111 = jMo4089j2 - jMo4086g2;
                                StringBuilder sb5 = new StringBuilder(String.valueOf(jMin).length() + String.valueOf(j111).length() + 53 + 23);
                                AbstractC1456a.m2456w(sb5, "Data size mismatch between stream (", j111, ") and Xing frame (");
                                sb5.append(jMin);
                                sb5.append("), using smaller value.");
                                zzeh.m6210b("XingSeeker", sb5.toString());
                                jMin = Math.min(jMin, j111);
                            }
                            zzakpVar = new zzalb(jMo4086g2, zzagxVar.f5291c, jM4189a2, zzagxVar.f5294f, jMin, jArr);
                        }
                    } else {
                        jMo4089j = zzagbVar.mo4089j();
                        jM4189a = zzalaVar.m4189a();
                        if (jM4189a != -9223372036854775807L) {
                            if (jMin != -1) {
                                jMo4089j = jMo4086g2 + jMin;
                                j6 = jMin - ((long) zzagxVar.f5291c);
                            } else if (jMo4089j != -1) {
                                j6 = (jMo4089j - jMo4086g2) - ((long) zzagxVar.f5291c);
                            } else {
                                zzakpVar = null;
                                z3 = z2;
                            }
                            long j112 = j6;
                            long j113 = jMo4089j;
                            RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                            zzakpVar = new zzakp(j113, jMo4086g2 + ((long) zzagxVar.f5291c), zzhaq.m7304a(zzfm.m6521w(j112, 8000000L, jM4189a, roundingMode3)), zzhaq.m7304a(zzhai.m7296a(j112, j5, roundingMode3)), true);
                        } else {
                            zzakpVar = null;
                            z3 = z2;
                        }
                    }
                } else if (iM6376b2 != 1447187017) {
                    if (iM6376b2 != 1483304551) {
                        zzagbVar.zzl();
                        i9 = 0;
                        zzeuVar5 = zzeuVar;
                        z2 = true;
                        zzagtVar2 = zzagtVar;
                    } else {
                        iM6376b3 = zzeuVar3.m6376b();
                        if ((iM6376b3 & 1) != 0) {
                            iM6382h = zzeuVar3.m6382h();
                        } else {
                            iM6382h = -1;
                        }
                        if ((iM6376b3 & 2) != 0) {
                            jM6374P = zzeuVar3.m6374P();
                        } else {
                            jM6374P = -1;
                        }
                        if ((iM6376b3 & 4) == 4) {
                            jArr2 = new long[100];
                            i11 = 0;
                            while (i11 < i10) {
                                jArr2[i11] = zzeuVar3.m6369K();
                                i11++;
                                jM6374P = jM6374P;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        long j114 = jM6374P;
                        if ((iM6376b3 & 8) != 0) {
                            zzeuVar3.m6365G(4);
                        }
                        if (zzeuVar3.m6360B() >= 24) {
                            zzeuVar3.m6365G(11);
                            fIntBitsToFloat = Float.intBitsToFloat(zzeuVar3.m6376b());
                            int iM6370L10 = zzeuVar3.m6370L();
                            int iM6370L11 = zzeuVar3.m6370L();
                            zzakvVarM4187a = zzakv.m4187a(iM6370L10);
                            zzakvVarM4187a2 = zzakv.m4187a(iM6370L11);
                            if (fIntBitsToFloat > 0.0f) {
                                zzakwVar2 = new zzakw(fIntBitsToFloat, zzakvVarM4187a, zzakvVarM4187a2);
                            } else {
                                zzakwVar2 = new zzakw(fIntBitsToFloat, zzakvVarM4187a, zzakvVarM4187a2);
                            }
                            zzeuVar3.m6365G(2);
                            int iM6373O4 = zzeuVar3.m6373O();
                            int i111 = iM6373O4 >> 12;
                            i8 = iM6373O4 & 4095;
                            zzeuVar4 = zzeuVar;
                            zzakwVar = zzakwVar2;
                            i7 = i111;
                        } else {
                            zzeuVar4 = zzeuVar;
                            zzakwVar = null;
                            i7 = -1;
                            i8 = -1;
                        }
                        j5 = iM6382h;
                        zzeuVar5 = zzeuVar4;
                        jMin = j114;
                        zzagtVar2 = zzagtVar;
                        i9 = 0;
                        z2 = true;
                        z3 = true;
                        z2 = true;
                        z3 = true;
                        z2 = true;
                        zzalaVar = new zzala(zzagxVar2, j5, jMin, jArr, zzakwVar, i7, i8);
                        if (zzagtVar2.f5268a != -1) {
                            zzagtVar2.f5268a = i7;
                            zzagtVar2.f5269b = i8;
                        } else {
                            zzagtVar2.f5268a = i7;
                            zzagtVar2.f5269b = i8;
                        }
                        if (zzakwVar != null) {
                            zzapVar = new zzap(zzakwVar);
                        } else {
                            zzapVar = null;
                        }
                        this.f5761j = zzapVar;
                        jMo4086g2 = zzagbVar.mo4086g();
                        zzagbVar.mo4091o(zzagxVar2.f5291c);
                        zzagxVar = zzalaVar.f5782a;
                        if (iM6376b2 == 1483304551) {
                            jMo4089j2 = zzagbVar.mo4089j();
                            jM4189a2 = zzalaVar.m4189a();
                            if (jM4189a2 == -9223372036854775807L) {
                                if (jMin != -1) {
                                    long j115 = jMo4089j2 - jMo4086g2;
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(jMin).length() + String.valueOf(j115).length() + 53 + 23);
                                    AbstractC1456a.m2456w(sb6, "Data size mismatch between stream (", j115, ") and Xing frame (");
                                    sb6.append(jMin);
                                    sb6.append("), using smaller value.");
                                    zzeh.m6210b("XingSeeker", sb6.toString());
                                    jMin = Math.min(jMin, j115);
                                }
                                zzakpVar = new zzalb(jMo4086g2, zzagxVar.f5291c, jM4189a2, zzagxVar.f5294f, jMin, jArr);
                            }
                        } else {
                            jMo4089j = zzagbVar.mo4089j();
                            jM4189a = zzalaVar.m4189a();
                            if (jM4189a != -9223372036854775807L) {
                                if (jMin != -1) {
                                    jMo4089j = jMo4086g2 + jMin;
                                    j6 = jMin - ((long) zzagxVar.f5291c);
                                } else if (jMo4089j != -1) {
                                    j6 = (jMo4089j - jMo4086g2) - ((long) zzagxVar.f5291c);
                                }
                                long j116 = j6;
                                long j117 = jMo4089j;
                                RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                                zzakpVar = new zzakp(j117, jMo4086g2 + ((long) zzagxVar.f5291c), zzhaq.m7304a(zzfm.m6521w(j116, 8000000L, jM4189a, roundingMode4)), zzhaq.m7304a(zzhai.m7296a(j116, j5, roundingMode4)), true);
                            }
                        }
                    }
                    zzakpVar = null;
                    z3 = z2;
                } else {
                    jMo4089j3 = zzagbVar.mo4089j();
                    jMo4086g4 = zzagbVar.mo4086g();
                    zzeuVar3.m6365G(6);
                    int iM6376b6 = zzeuVar3.m6376b();
                    j7 = zzagxVar2.f5291c;
                    j8 = iM6376b6;
                    iM6376b4 = zzeuVar3.m6376b();
                    if (iM6376b4 <= 0) {
                        zzeuVar7 = zzeuVar;
                        zzagtVar3 = zzagtVar;
                    } else {
                        zzeuVar6 = zzeuVar;
                        jM6520v = zzfm.m6520v(zzagxVar2.f5292d, (((long) iM6376b4) * ((long) zzagxVar2.f5295g)) - 1);
                        iM6370L = zzeuVar3.m6370L();
                        iM6370L2 = zzeuVar3.m6370L();
                        iM6370L3 = zzeuVar3.m6370L();
                        zzeuVar3.m6365G(2);
                        j9 = jMo4086g4 + ((long) zzagxVar2.f5291c);
                        jArr5 = new long[iM6370L];
                        zzagtVar3 = zzagtVar;
                        jArr6 = new long[iM6370L];
                        i14 = 0;
                        while (true) {
                            if (i14 < iM6370L) {
                                zzeuVar7 = zzeuVar6;
                                jMax = jMo4086g4 + j7 + j8;
                                if (jMo4089j3 != -1) {
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(jMo4089j3).length() + 27 + String.valueOf(jMax).length());
                                    AbstractC1456a.m2456w(sb7, "VBRI data size mismatch: ", jMo4089j3, ", ");
                                    sb7.append(jMax);
                                    zzeh.m6211c("VbriSeeker", sb7.toString());
                                }
                                if (jMax != j9) {
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(j9).length() + String.valueOf(jMax).length() + 43 + 28);
                                    AbstractC1456a.m2456w(sb8, "VBRI bytes and ToC mismatch (using max): ", jMax, ", ");
                                    sb8.append(j9);
                                    sb8.append("\nSeeking will be inaccurate.");
                                    zzeh.m6211c("VbriSeeker", sb8.toString());
                                    jMax = Math.max(jMax, j9);
                                }
                                zzakpVar = new zzakz(jArr5, jArr6, jM6520v, jMax, zzagxVar2.f5294f);
                                break;
                            }
                            long j118 = j8;
                            zzeuVar7 = zzeuVar6;
                            jArr5[i14] = (((long) i14) * jM6520v) / ((long) iM6370L);
                            jArr6[i14] = j9;
                            if (iM6370L3 != 1) {
                                iM6369K = zzeuVar3.m6369K();
                            } else if (iM6370L3 != 2) {
                                iM6369K = zzeuVar3.m6370L();
                            } else if (iM6370L3 != 3) {
                                iM6369K = zzeuVar3.m6373O();
                            } else if (iM6370L3 != 4) {
                                iM6369K = zzeuVar3.m6382h();
                            }
                            j9 += ((long) iM6369K) * ((long) iM6370L2);
                            i14++;
                            zzeuVar6 = zzeuVar7;
                            iM6370L3 = iM6370L3;
                            j8 = j118;
                        }
                        zzagbVar.mo4091o(zzagxVar2.f5291c);
                        zzeuVar5 = zzeuVar7;
                        zzagtVar2 = zzagtVar3;
                        i9 = 0;
                        z3 = true;
                    }
                    zzakpVar = null;
                    zzagbVar.mo4091o(zzagxVar2.f5291c);
                    zzeuVar5 = zzeuVar7;
                    zzagtVar2 = zzagtVar3;
                    i9 = 0;
                    z3 = true;
                }
                zzapVar2 = this.f5760i;
                jMo4086g3 = zzagbVar.mo4086g();
                if (zzapVar2 == null) {
                    zzakrVar = null;
                } else {
                    zzajxVar = (zzajx) zzapVar2.m4286a(zzajx.class, new zzgts() { // from class: com.google.android.gms.internal.ads.zzakt
                        @Override // com.google.android.gms.internal.ads.zzgts
                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ boolean mo3897b(Object obj) {
                            int i112 = zzaku.f5751r;
                            return ((zzajx) obj).f5554a.equals("TLEN");
                        }
                    });
                    if (zzajxVar == null) {
                        i12 = i9;
                        jM6519u = -9223372036854775807L;
                    } else {
                        i12 = i9;
                        jM6519u = zzfm.m6519u(Long.parseLong((String) zzajxVar.f5567c.get(i12)));
                    }
                    iArr = zzajvVar.f5562e;
                    length = iArr.length;
                    int i112 = length + 1;
                    jArr3 = new long[i112];
                    jArr4 = new long[i112];
                    jArr3[i12] = jMo4086g3;
                    jArr4[i12] = 0;
                    i13 = z3 ? 1 : 0;
                    while (i13 <= length) {
                        int i113 = i13 - 1;
                        long j119 = jMo4086g3 + ((long) (zzajvVar.f5560c + iArr[i113]));
                        j3 += (long) (zzajvVar.f5561d + zzajvVar.f5563f[i113]);
                        jArr3[i13] = j119;
                        jArr4[i13] = j3;
                        i13++;
                        iArr = iArr;
                        jMo4086g3 = j119;
                    }
                    zzakrVar = new zzakr(jM6519u, jArr3, jArr4);
                }
                if (this.f5768q) {
                    zzakpVar2 = new zzakx();
                    zzeuVar2 = zzeuVar5;
                } else {
                    if (zzakrVar != null) {
                        zzakpVar = zzakrVar;
                    } else if (zzakpVar == null) {
                        zzakpVar = null;
                    }
                    zzeuVar2 = zzeuVar5;
                    if (zzakpVar == null) {
                        zzagbVar.mo4078H(zzeuVar2.f14887a, 0, 4);
                        zzeuVar2.m6363E(0);
                        zzagxVar2.m4127a(zzeuVar2.m6376b());
                        zzakpVar2 = new zzakp(zzagbVar.mo4089j(), zzagbVar.mo4086g(), zzagxVar2.f5294f, zzagxVar2.f5291c, true);
                    } else {
                        zzakpVar2 = zzakpVar;
                    }
                    zzahm zzahmVar2 = this.f5757f;
                    zzakpVar2.zza();
                    zzahmVar2.getClass();
                }
                this.f5767p = zzakpVar2;
                this.f5756e.mo4108d(zzakpVar2);
                zzapVarM4288c = this.f5760i;
                if (zzapVarM4288c != null) {
                    zzapVar3 = this.f5761j;
                    if (zzapVar3 != null) {
                        zzapVarM4288c = zzapVarM4288c.m4288c(zzapVar3);
                    }
                } else {
                    zzapVarM4288c = this.f5761j;
                }
                zztVar = new zzt();
                zztVar.m8852d("audio/mpeg");
                zztVar.m8853e(zzagxVar2.f5290b);
                zztVar.f20803o = 4096;
                zztVar.f20780F = zzagxVar2.f5293e;
                zztVar.f20782H = zzagxVar2.f5292d;
                zztVar.f20784J = zzagtVar2.f5268a;
                zztVar.f20785K = zzagtVar2.f5269b;
                zztVar.f20799k = zzapVarM4288c;
                if (this.f5767p.zzh() != -2147483647) {
                    zztVar.f20796h = this.f5767p.zzh();
                }
                this.f5758g.mo4097e(new zzv(zztVar));
                this.f5764m = zzagbVar.mo4086g();
                r15 = z3;
            } else {
                zzeuVar2 = zzeuVar;
                z = true;
                j2 = 1000000;
                j4 = this.f5764m;
                if (j4 != 0) {
                    jMo4086g = zzagbVar.mo4086g();
                    if (jMo4086g < j4) {
                        r15 = z;
                        r15 = z;
                        zzagbVar.mo4091o((int) (j4 - jMo4086g));
                        r15 = z;
                    }
                }
            }
            r15 = z;
            r15 = z;
            r15 = z;
            i4 = this.f5766o;
            if (i4 == 0) {
                zzagbVar.zzl();
                if (m4185c(zzagbVar)) {
                    i2 = -1;
                    i3 = -1;
                } else {
                    zzeuVar2.m6363E(0);
                    iM6376b = zzeuVar2.m6376b();
                    if (((-128000) & iM6376b) == (((long) this.f5759h) & (-128000))) {
                    }
                    zzagbVar.mo4091o(r15);
                    this.f5759h = 0;
                    i2 = -1;
                    i3 = 0;
                }
            } else {
                iMo4122d = this.f5758g.mo4122d(zzagbVar, i4, r15);
                if (iMo4122d == -1) {
                    i2 = -1;
                    i3 = -1;
                } else {
                    i5 = this.f5766o - iMo4122d;
                    this.f5766o = i5;
                    if (i5 <= 0) {
                        i2 = -1;
                        i3 = 0;
                    } else {
                        this.f5758g.mo4095b(((this.f5763l * j2) / ((long) zzagxVar2.f5292d)) + this.f5762k, 1, zzagxVar2.f5291c, 0, null);
                        this.f5763l += (long) zzagxVar2.f5295g;
                        this.f5766o = 0;
                        i3 = 0;
                        i2 = -1;
                    }
                }
            }
        }
        if (i3 == i2) {
            zzaky zzakyVar2 = this.f5767p;
            if (zzakyVar2 instanceof zzakq) {
                if (zzakyVar2.zza() != ((this.f5763l * j2) / ((long) zzagxVar2.f5292d)) + this.f5762k) {
                    throw null;
                }
            }
        }
        return i3;
    }

    public zzaku(int i2) {
        this.f5752a = new zzeu(10);
        this.f5753b = new zzagx();
        this.f5754c = new zzagt();
        this.f5762k = -9223372036854775807L;
        this.f5755d = new zzagv();
        this.f5758g = new zzafx();
        this.f5765n = -1L;
    }
}
