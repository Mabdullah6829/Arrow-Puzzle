package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqt implements zzarp {

    /* JADX INFO: renamed from: a */
    public final zzaqa f6679a;

    /* JADX INFO: renamed from: b */
    public final zzet f6680b = new zzet(new byte[10], 10);

    /* JADX INFO: renamed from: c */
    public int f6681c = 0;

    /* JADX INFO: renamed from: d */
    public int f6682d;

    /* JADX INFO: renamed from: e */
    public zzfj f6683e;

    /* JADX INFO: renamed from: f */
    public boolean f6684f;

    /* JADX INFO: renamed from: g */
    public boolean f6685g;

    /* JADX INFO: renamed from: h */
    public boolean f6686h;

    /* JADX INFO: renamed from: i */
    public int f6687i;

    /* JADX INFO: renamed from: j */
    public int f6688j;

    /* JADX INFO: renamed from: k */
    public boolean f6689k;

    public zzaqt(zzaqa zzaqaVar) {
        this.f6679a = zzaqaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.zzet] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.zzaqa] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
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
    @Override // com.google.android.gms.internal.ads.zzarp
    /* JADX INFO: renamed from: a */
    public final void mo4329a(int i2, zzeu zzeuVar) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        ?? r10;
        long jM6466c;
        this.f6683e.getClass();
        int i7 = i2 & 1;
        ?? r3 = this.f6679a;
        int i8 = -1;
        int i9 = 2;
        ?? r7 = 0;
        int i10 = 1;
        if (i7 != 0) {
            int i11 = this.f6681c;
            if (i11 != 0 && i11 != 1) {
                if (i11 != 2) {
                    int i12 = this.f6688j;
                    if (i12 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i12);
                        sb.append(" more bytes");
                        zzeh.m6211c("PesReader", sb.toString());
                    }
                    r3.mo4303a(zzeuVar.f14889c == 0);
                } else {
                    zzeh.m6211c("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f6681c = 1;
            this.f6682d = 0;
        }
        int i13 = i2;
        while (zzeuVar.m6360B() > 0) {
            int i14 = this.f6681c;
            if (i14 != 0) {
                ?? r11 = this.f6680b;
                if (i14 != i10) {
                    if (i14 != i9) {
                        int iM6360B = zzeuVar.m6360B();
                        int i15 = this.f6688j;
                        if (i15 == i8) {
                            r10 = r7;
                        } else {
                            i6 = iM6360B - i15;
                        }
                        if (r10 > 0) {
                            r10 = i6;
                            iM6360B -= r10;
                            zzeuVar.m6361C(zzeuVar.f14888b + iM6360B);
                        }
                        r10 = i6;
                        r3.mo4304b(zzeuVar);
                        int i16 = this.f6688j;
                        if (i16 != i8) {
                            int i17 = i16 - iM6360B;
                            this.f6688j = i17;
                            if (i17 == 0) {
                                r3.mo4303a(r7);
                                this.f6681c = i10;
                                this.f6682d = r7;
                            }
                        }
                    } else {
                        if (m4331c(zzeuVar, r11.f14823a, Math.min(10, this.f6687i)) && m4331c(zzeuVar, null, this.f6687i)) {
                            r11.m6341d(r7);
                            if (this.f6684f) {
                                r11.m6343f(4);
                                long jM6345h = r11.m6345h(3);
                                r11.m6343f(i10);
                                int iM6345h = r11.m6345h(15) << 15;
                                r11.m6343f(i10);
                                long jM6345h2 = r11.m6345h(15);
                                r11.m6343f(i10);
                                if (!this.f6686h && this.f6685g) {
                                    r11.m6343f(4);
                                    long jM6345h3 = ((long) r11.m6345h(3)) << 30;
                                    r11.m6343f(i10);
                                    int iM6345h2 = r11.m6345h(15) << 15;
                                    r11.m6343f(i10);
                                    long jM6345h4 = r11.m6345h(15);
                                    r11.m6343f(i10);
                                    this.f6683e.m6466c(jM6345h3 | ((long) iM6345h2) | jM6345h4);
                                    this.f6686h = true;
                                }
                                jM6466c = this.f6683e.m6466c(jM6345h2 | (jM6345h << 30) | ((long) iM6345h));
                            } else {
                                jM6466c = -9223372036854775807L;
                            }
                            i13 |= true != this.f6689k ? 0 : 4;
                            r3.mo4305c(i13, jM6466c);
                            this.f6681c = 3;
                            this.f6682d = 0;
                            r7 = 0;
                            i8 = -1;
                            i9 = 2;
                            i10 = 1;
                        }
                    }
                    ?? r14 = r7;
                    i3 = i9;
                    z = r14 == true ? 1 : 0;
                    i4 = i10;
                } else {
                    ?? r5 = r7;
                    if (m4331c(zzeuVar, r11.f14823a, 9)) {
                        r11.m6341d(r5 == true ? 1 : 0);
                        int iM6345h3 = r11.m6345h(24);
                        i4 = 1;
                        if (iM6345h3 != 1) {
                            AbstractC5152f.m3776h(new StringBuilder(String.valueOf(iM6345h3).length() + 30), "Unexpected start code prefix: ", iM6345h3, "PesReader");
                            i8 = -1;
                            this.f6688j = -1;
                            i5 = 0;
                            i3 = 2;
                        } else {
                            r11.m6343f(8);
                            int iM6345h4 = r11.m6345h(16);
                            r11.m6343f(5);
                            this.f6689k = r11.m6344g();
                            i3 = 2;
                            r11.m6343f(2);
                            this.f6684f = r11.m6344g();
                            this.f6685g = r11.m6344g();
                            r11.m6343f(6);
                            int iM6345h5 = r11.m6345h(8);
                            this.f6687i = iM6345h5;
                            if (iM6345h4 == 0) {
                                this.f6688j = -1;
                                i5 = 2;
                                i8 = -1;
                            } else {
                                int i18 = (iM6345h4 - 3) - iM6345h5;
                                this.f6688j = i18;
                                if (i18 < 0) {
                                    AbstractC5152f.m3776h(new StringBuilder(String.valueOf(i18).length() + 36), "Found negative packet payload size: ", i18, "PesReader");
                                    i8 = -1;
                                    this.f6688j = -1;
                                } else {
                                    i8 = -1;
                                }
                                i5 = 2;
                            }
                        }
                        this.f6681c = i5;
                        z = false;
                        this.f6682d = 0;
                    } else {
                        z = r5 == true ? 1 : 0;
                        i8 = -1;
                        i3 = 2;
                        i4 = 1;
                    }
                }
            } else {
                ?? r15 = r7;
                i3 = i9;
                z = r15 == true ? 1 : 0;
                i4 = i10;
                zzeuVar.m6365G(zzeuVar.m6360B());
            }
            int i19 = i3;
            r7 = z;
            i9 = i19;
            i10 = i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    /* JADX INFO: renamed from: b */
    public final void mo4330b(zzfj zzfjVar, zzagd zzagdVar, zzaro zzaroVar) {
        this.f6683e = zzfjVar;
        this.f6679a.mo4306d(zzagdVar, zzaroVar);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4331c(zzeu zzeuVar, byte[] bArr, int i2) {
        int iMin = Math.min(zzeuVar.m6360B(), i2 - this.f6682d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzeuVar.m6365G(iMin);
        } else {
            zzeuVar.m6366H(bArr, this.f6682d, iMin);
        }
        int i3 = this.f6682d + iMin;
        this.f6682d = i3;
        return i3 == i2;
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    public final void zzb() {
        this.f6681c = 0;
        this.f6682d = 0;
        this.f6686h = false;
        this.f6679a.zza();
    }
}
