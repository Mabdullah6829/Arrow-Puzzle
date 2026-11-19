package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqh implements zzaqa {

    /* JADX INFO: renamed from: a */
    public final zzard f6565a;

    /* JADX INFO: renamed from: e */
    public long f6569e;

    /* JADX INFO: renamed from: g */
    public String f6571g;

    /* JADX INFO: renamed from: h */
    public zzahm f6572h;

    /* JADX INFO: renamed from: i */
    public zzaqg f6573i;

    /* JADX INFO: renamed from: j */
    public boolean f6574j;

    /* JADX INFO: renamed from: l */
    public boolean f6576l;

    /* JADX INFO: renamed from: f */
    public final boolean[] f6570f = new boolean[3];

    /* JADX INFO: renamed from: b */
    public final zzaqr f6566b = new zzaqr(7);

    /* JADX INFO: renamed from: c */
    public final zzaqr f6567c = new zzaqr(8);

    /* JADX INFO: renamed from: d */
    public final zzaqr f6568d = new zzaqr(6);

    /* JADX INFO: renamed from: k */
    public long f6575k = -9223372036854775807L;

    /* JADX INFO: renamed from: m */
    public final zzeu f6577m = new zzeu();

    public zzaqh(zzard zzardVar) {
        this.f6565a = zzardVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: a */
    public final void mo4303a(boolean z) {
        this.f6572h.getClass();
        String str = zzfm.f16091a;
        if (z) {
            this.f6565a.f6728c.m7338c(0);
            m4315f(0, 0, this.f6569e, this.f6575k);
            m4314e(9, this.f6569e, this.f6575k);
            m4315f(0, 0, this.f6569e, this.f6575k);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040  */
    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: b */
    public final void mo4304b(zzeu zzeuVar) {
        zzaqr zzaqrVar;
        zzaqr zzaqrVar2;
        zzaqr zzaqrVar3;
        int i2;
        this.f6572h.getClass();
        String str = zzfm.f16091a;
        int i3 = zzeuVar.f14888b;
        int i4 = zzeuVar.f14889c;
        byte[] bArr = zzeuVar.f14887a;
        this.f6569e += (long) zzeuVar.m6360B();
        this.f6572h.mo4121a(zzeuVar.m6360B(), zzeuVar);
        while (true) {
            int iM7086g = zzgr.m7086g(bArr, i3, i4, this.f6570f);
            zzaqrVar = this.f6568d;
            zzaqrVar2 = this.f6567c;
            zzaqrVar3 = this.f6566b;
            if (iM7086g == i4) {
                break;
            }
            int i5 = bArr[iM7086g + 3] & 31;
            int i6 = 3;
            if (iM7086g > 0) {
                i2 = iM7086g - 1;
                if (bArr[i2] == 0) {
                    i6 = 4;
                } else {
                    i2 = iM7086g;
                }
            } else {
                i2 = iM7086g;
            }
            int i7 = i6;
            int i8 = i2 - i3;
            if (i8 > 0) {
                if (!this.f6574j) {
                    zzaqrVar3.m4325c(bArr, i3, i2);
                    zzaqrVar2.m4325c(bArr, i3, i2);
                }
                zzaqrVar.m4325c(bArr, i3, i2);
            }
            int i9 = i4 - i2;
            long j2 = this.f6569e - ((long) i9);
            m4315f(i9, i8 < 0 ? -i8 : 0, j2, this.f6575k);
            m4314e(i5, j2, this.f6575k);
            i3 = i2 + i7;
        }
        if (!this.f6574j) {
            zzaqrVar3.m4325c(bArr, i3, i4);
            zzaqrVar2.m4325c(bArr, i3, i4);
        }
        zzaqrVar.m4325c(bArr, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: c */
    public final void mo4305c(int i2, long j2) {
        this.f6575k = j2;
        int i3 = i2 & 2;
        this.f6576l = (i3 != 0) | this.f6576l;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: d */
    public final void mo4306d(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.m4339a();
        zzaroVar.m4340b();
        this.f6571g = zzaroVar.f6773e;
        zzaroVar.m4340b();
        zzahm zzahmVarMo4109f = zzagdVar.mo4109f(zzaroVar.f6772d, 2);
        this.f6572h = zzahmVarMo4109f;
        this.f6573i = new zzaqg(zzahmVarMo4109f);
        this.f6565a.m4336a(zzagdVar, zzaroVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m4314e(int i2, long j2, long j3) {
        if (!this.f6574j) {
            this.f6566b.m4324b(i2);
            this.f6567c.m4324b(i2);
        }
        this.f6568d.m4324b(i2);
        zzaqg zzaqgVar = this.f6573i;
        boolean z = this.f6576l;
        zzaqgVar.f6557d = i2;
        zzaqgVar.f6559f = j3;
        zzaqgVar.f6558e = j2;
        zzaqgVar.f6564k = z;
    }

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
    /* JADX INFO: renamed from: f */
    public final void m4315f(int i2, int i3, long j2, long j3) {
        zzhb zzhbVar = this.f6565a.f6728c;
        boolean z = true;
        if (!this.f6574j) {
            zzaqr zzaqrVar = this.f6566b;
            zzaqrVar.m4326d(i3);
            zzaqr zzaqrVar2 = this.f6567c;
            zzaqrVar2.m4326d(i3);
            if (this.f6574j) {
                if (zzaqrVar.f6673c) {
                    zzgq zzgqVarM7083d = zzgr.m7083d(zzaqrVar.f6674d, 4, zzaqrVar.f6675e);
                    zzhbVar.m7336a(zzgqVarM7083d.f18030m);
                    this.f6573i.f6555b.append(zzgqVarM7083d.f18021d, zzgqVarM7083d);
                    zzaqrVar.m4323a();
                } else if (zzaqrVar2.f6673c) {
                    zzgy zzgyVar = new zzgy(zzaqrVar2.f6674d, 4, zzaqrVar2.f6675e);
                    int iM7258g = zzgyVar.m7258g();
                    zzgyVar.m7258g();
                    zzgyVar.m7252a();
                    zzgyVar.m7255d();
                    this.f6573i.f6556c.append(iM7258g, new zzgp(iM7258g));
                    zzaqrVar2.m4323a();
                }
            } else if (zzaqrVar.f6673c && zzaqrVar2.f6673c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzaqrVar.f6674d, zzaqrVar.f6675e));
                arrayList.add(Arrays.copyOf(zzaqrVar2.f6674d, zzaqrVar2.f6675e));
                zzgq zzgqVarM7083d2 = zzgr.m7083d(zzaqrVar.f6674d, 4, zzaqrVar.f6675e);
                zzgy zzgyVar2 = new zzgy(zzaqrVar2.f6674d, 4, zzaqrVar2.f6675e);
                int iM7258g2 = zzgyVar2.m7258g();
                zzgyVar2.m7258g();
                zzgyVar2.m7252a();
                zzgyVar2.m7255d();
                zzgp zzgpVar = new zzgp(iM7258g2);
                int i4 = zzgqVarM7083d2.f18018a;
                int i5 = zzgqVarM7083d2.f18019b;
                int i6 = zzgqVarM7083d2.f18020c;
                byte[] bArr = zzdr.f12695a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
                zzahm zzahmVar = this.f6572h;
                zzt zztVar = new zzt();
                zztVar.f20789a = this.f6571g;
                zztVar.m8852d("video/mp2t");
                zztVar.m8853e("video/avc");
                zztVar.f20798j = str;
                zztVar.f20809u = zzgqVarM7083d2.f18022e;
                zztVar.f20810v = zzgqVarM7083d2.f18023f;
                zzh zzhVar = new zzh();
                zzhVar.f18414a = zzgqVarM7083d2.f18027j;
                zzhVar.f18415b = zzgqVarM7083d2.f18028k;
                zzhVar.f18416c = zzgqVarM7083d2.f18029l;
                zzhVar.f18418e = zzgqVarM7083d2.f18025h + 8;
                zzhVar.f18419f = zzgqVarM7083d2.f18026i + 8;
                zztVar.f20778D = zzhVar.m7286a();
                zztVar.f20775A = zzgqVarM7083d2.f18024g;
                zztVar.f20805q = arrayList;
                int i7 = zzgqVarM7083d2.f18030m;
                zztVar.f20804p = i7;
                zzahmVar.mo4097e(new zzv(zztVar));
                this.f6574j = true;
                zzhbVar.m7336a(i7);
                this.f6573i.f6555b.append(zzgqVarM7083d2.f18021d, zzgqVarM7083d2);
                this.f6573i.f6556c.append(iM7258g2, zzgpVar);
                zzaqrVar.m4323a();
                zzaqrVar2.m4323a();
            }
        }
        zzaqr zzaqrVar3 = this.f6568d;
        if (zzaqrVar3.m4326d(i3)) {
            int iM7080a = zzgr.m7080a(zzaqrVar3.f6675e, zzaqrVar3.f6674d);
            byte[] bArr2 = zzaqrVar3.f6674d;
            zzeu zzeuVar = this.f6577m;
            zzeuVar.m6397z(iM7080a, bArr2);
            zzeuVar.m6363E(4);
            zzhbVar.m7337b(j3, zzeuVar);
        }
        zzaqg zzaqgVar = this.f6573i;
        boolean z2 = this.f6574j;
        if (zzaqgVar.f6557d == 9) {
            if (z2 && zzaqgVar.f6560g) {
                long j4 = zzaqgVar.f6558e;
                int i8 = i2 + ((int) (j2 - j4));
                long j5 = zzaqgVar.f6562i;
                if (j5 != -9223372036854775807L) {
                    long j6 = zzaqgVar.f6561h;
                    if (j4 != j6) {
                        zzaqgVar.f6554a.mo4095b(j5, zzaqgVar.f6563j ? 1 : 0, (int) (j4 - j6), i8, null);
                    }
                }
            }
            zzaqgVar.f6561h = zzaqgVar.f6558e;
            zzaqgVar.f6562i = zzaqgVar.f6559f;
            zzaqgVar.f6563j = false;
            zzaqgVar.f6560g = true;
        }
        boolean z3 = zzaqgVar.f6564k;
        boolean z4 = zzaqgVar.f6563j;
        int i9 = zzaqgVar.f6557d;
        if (i9 != 5 && (!z3 || i9 != 1)) {
            z = false;
        }
        boolean z5 = z4 | z;
        zzaqgVar.f6563j = z5;
        zzaqgVar.f6557d = 24;
        if (z5) {
            this.f6576l = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.f6569e = 0L;
        this.f6576l = false;
        this.f6575k = -9223372036854775807L;
        zzgr.m7087h(this.f6570f);
        this.f6566b.m4323a();
        this.f6567c.m4323a();
        this.f6568d.m4323a();
        this.f6565a.f6728c.m7338c(0);
        zzaqg zzaqgVar = this.f6573i;
        if (zzaqgVar != null) {
            zzaqgVar.f6560g = false;
        }
    }
}
