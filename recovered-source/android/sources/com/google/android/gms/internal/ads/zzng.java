package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzng {

    /* JADX INFO: renamed from: a */
    public final zznc f20495a;

    /* JADX INFO: renamed from: b */
    public final int f20496b;

    /* JADX INFO: renamed from: c */
    public final zznc f20497c;

    /* JADX INFO: renamed from: d */
    public int f20498d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f20499e = false;

    /* JADX INFO: renamed from: f */
    public boolean f20500f = false;

    public zzng(zznc zzncVar, zznc zzncVar2, int i2) {
        this.f20495a = zzncVar;
        this.f20496b = i2;
        this.f20497c = zzncVar2;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m8770l(zznc zzncVar) {
        return zzncVar.mo8587a() != 0;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m8771A(zzme zzmeVar) {
        zznc zzncVarM8784m = m8784m(zzmeVar);
        return zzncVarM8784m == null || zzncVarM8784m.mo8590c0() || zzncVarM8784m.mo3994Q() || zzncVarM8784m.mo3982G();
    }

    /* JADX INFO: renamed from: B */
    public final void m8772B() {
        zznc zzncVar = this.f20495a;
        if (zzncVar.mo8587a() == 1 && this.f20498d != 4) {
            zzncVar.mo8582R();
            return;
        }
        zznc zzncVar2 = this.f20497c;
        if (zzncVar2 == null || zzncVar2.mo8587a() != 1 || this.f20498d == 3) {
            return;
        }
        zzncVar2.mo8582R();
    }

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
    /* JADX INFO: renamed from: a */
    public final void m8773a() {
        int i2 = this.f20498d;
        if (i2 != 3 && i2 != 4) {
            if (i2 == 2) {
                this.f20498d = 0;
                return;
            }
            return;
        }
        boolean z = i2 == 4;
        zznc zzncVar = this.f20495a;
        zznc zzncVar2 = this.f20497c;
        if (z) {
            zzncVar2.getClass();
            zzncVar2.mo4007j(17, zzncVar);
        } else {
            zzncVar2.getClass();
            zzncVar.mo4007j(17, zzncVar2);
        }
        this.f20498d = this.f20498d != 4 ? 1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m8774b() {
        if (!m8770l(this.f20495a)) {
            m8782j(true);
        }
        zznc zzncVar = this.f20497c;
        if (zzncVar == null || zzncVar.mo8587a() != 0) {
            return;
        }
        m8782j(false);
    }

    /* JADX INFO: renamed from: c */
    public final int m8775c(zzme zzmeVar, zzabj zzabjVar, zzjk zzjkVar) {
        int iM8783k = m8783k(this.f20495a, zzmeVar, zzabjVar, zzjkVar);
        return iM8783k == 1 ? m8783k(this.f20497c, zzmeVar, zzabjVar, zzjkVar) : iM8783k;
    }

    /* JADX INFO: renamed from: d */
    public final void m8776d() {
        this.f20495a.mo8599r();
        this.f20499e = false;
        zznc zzncVar = this.f20497c;
        if (zzncVar != null) {
            zzncVar.mo8599r();
            this.f20500f = false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8777e(Object obj) {
        zznc zzncVar = this.f20495a;
        if (zzncVar.zza() != 2) {
            return;
        }
        int i2 = this.f20498d;
        if (i2 != 4 && i2 != 1) {
            zzncVar.mo4007j(1, obj);
            return;
        }
        zznc zzncVar2 = this.f20497c;
        zzncVar2.getClass();
        zzncVar2.mo4007j(1, obj);
    }

    /* JADX INFO: renamed from: f */
    public final void m8778f(zzadt zzadtVar) {
        zznc zzncVar = this.f20495a;
        if (zzncVar.zza() != 2) {
            zzncVar.getClass();
            return;
        }
        zzncVar.mo4007j(7, zzadtVar);
        zznc zzncVar2 = this.f20497c;
        if (zzncVar2 != null) {
            zzncVar2.mo4007j(7, zzadtVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m8779g() {
        int i2 = this.f20498d;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            return m8770l(this.f20495a);
        }
        zznc zzncVar = this.f20497c;
        zzncVar.getClass();
        return zzncVar.mo8587a() != 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m8780h(zzme zzmeVar, zznc zzncVar) {
        if (zzncVar == null) {
            return true;
        }
        zzzd[] zzzdVarArr = zzmeVar.f20368c;
        int i2 = this.f20496b;
        zzzd zzzdVar = zzzdVarArr[i2];
        if (zzncVar.mo8588a0() == null) {
            return true;
        }
        if (zzncVar.mo8588a0() == zzzdVar && (zzzdVar == null || zzncVar.mo8590c0())) {
            return true;
        }
        zzme zzmeVar2 = zzmeVar.f20378m;
        return zzmeVar2 != null && zzmeVar2.f20368c[i2] == zzncVar.mo8588a0();
    }

    /* JADX INFO: renamed from: i */
    public final void m8781i(zznc zzncVar, zzjk zzjkVar) {
        zzgtr.m7133f(this.f20495a == zzncVar || this.f20497c == zzncVar);
        if (m8770l(zzncVar)) {
            if (zzncVar == zzjkVar.f20130u) {
                zzjkVar.f20131v = null;
                zzjkVar.f20130u = null;
                zzjkVar.f20132w = true;
            }
            if (zzncVar.mo8587a() == 2) {
                zzncVar.mo8593f();
            }
            zzncVar.mo8598n();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8782j(boolean z) {
        if (z) {
            if (this.f20499e) {
                this.f20495a.mo8595h();
                this.f20499e = false;
                return;
            }
            return;
        }
        if (this.f20500f) {
            zznc zzncVar = this.f20497c;
            zzncVar.getClass();
            zzncVar.mo8595h();
            this.f20500f = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final int m8783k(zznc zzncVar, zzme zzmeVar, zzabj zzabjVar, zzjk zzjkVar) {
        int i2;
        if (zzncVar != null && zzncVar.mo8587a() != 0) {
            zznc zzncVar2 = this.f20495a;
            boolean z = zzncVar != zzncVar2;
            if (zzncVar == zzncVar2 && ((i2 = this.f20498d) == 2 || i2 == 4)) {
                return 1;
            }
            if (zzncVar == this.f20497c && this.f20498d == 3) {
                return 1;
            }
            zzzd zzzdVarMo8588a0 = zzncVar.mo8588a0();
            zzzd[] zzzdVarArr = zzmeVar.f20368c;
            int i3 = this.f20496b;
            zzzd zzzdVar = zzzdVarArr[i3];
            boolean zM3924a = zzabjVar.m3924a(i3);
            if (!zM3924a || zzzdVarMo8588a0 != zzzdVar) {
                if (!zzncVar.mo8592e()) {
                    zzabb zzabbVar = zzabjVar.f4846c[i3];
                    int iMo3918a = zzabbVar != null ? zzabbVar.mo3918a() : 0;
                    zzv[] zzvVarArr = new zzv[iMo3918a];
                    for (int i4 = 0; i4 < iMo3918a; i4++) {
                        zzabbVar.getClass();
                        zzvVarArr[i4] = zzabbVar.mo3919b(i4);
                    }
                    zzzd zzzdVar2 = zzzdVarArr[i3];
                    zzzdVar2.getClass();
                    zzncVar.mo8586Z(zzvVarArr, zzzdVar2, zzmeVar.m8692a(), zzmeVar.f20381p, zzmeVar.f20372g.f20382a);
                    return 3;
                }
                if (!zzncVar.mo3982G()) {
                    return 0;
                }
                m8781i(zzncVar, zzjkVar);
                if (!zM3924a || m8787p()) {
                    m8782j(!z);
                    return 1;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: m */
    public final zznc m8784m(zzme zzmeVar) {
        if (zzmeVar == null) {
            return null;
        }
        zzzd[] zzzdVarArr = zzmeVar.f20368c;
        int i2 = this.f20496b;
        if (zzzdVarArr[i2] == null) {
            return null;
        }
        zznc zzncVar = this.f20495a;
        zzzd zzzdVarMo8588a0 = zzncVar.mo8588a0();
        zzzd zzzdVar = zzzdVarArr[i2];
        if (zzzdVarMo8588a0 == zzzdVar) {
            return zzncVar;
        }
        zznc zzncVar2 = this.f20497c;
        if (zzncVar2 == null || zzncVar2.mo8588a0() != zzzdVar) {
            return null;
        }
        return zzncVar2;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m8785n() {
        return this.f20497c != null;
    }

    /* JADX INFO: renamed from: o */
    public final void m8786o() {
        int i2;
        zzgtr.m7133f(!m8787p());
        if (m8770l(this.f20495a)) {
            i2 = 3;
        } else {
            i2 = 2;
            zznc zzncVar = this.f20497c;
            if (zzncVar != null && zzncVar.mo8587a() != 0) {
                i2 = 4;
            }
        }
        this.f20498d = i2;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8787p() {
        int i2 = this.f20498d;
        return i2 == 2 || i2 == 4 || i2 == 3;
    }

    /* JADX INFO: renamed from: q */
    public final int m8788q() {
        boolean zM8770l = m8770l(this.f20495a);
        int i2 = 0;
        zznc zzncVar = this.f20497c;
        if (zzncVar != null && zzncVar.mo8587a() != 0) {
            i2 = 1;
        }
        return (zM8770l ? 1 : 0) + i2;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m8789r(zzme zzmeVar) {
        zznc zzncVarM8784m = m8784m(zzmeVar);
        zzncVarM8784m.getClass();
        return zzncVarM8784m.mo8590c0();
    }

    /* JADX INFO: renamed from: s */
    public final void m8790s(zzme zzmeVar) {
        zznc zzncVarM8784m = m8784m(zzmeVar);
        zzncVarM8784m.getClass();
        zzncVarM8784m.zzl();
        if (zzncVarM8784m instanceof zzzs) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m8791t(zzabj zzabjVar, zzabj zzabjVar2) {
        int i2;
        int i3 = this.f20496b;
        boolean zM3924a = zzabjVar.m3924a(i3);
        boolean zM3924a2 = zzabjVar2.m3924a(i3);
        zznc zzncVar = this.f20495a;
        zznc zzncVar2 = this.f20497c;
        if (zzncVar2 == null || (i2 = this.f20498d) == 3 || (i2 == 0 && m8770l(zzncVar))) {
            zzncVar2 = zzncVar;
        }
        if (!zM3924a || zzncVar2.mo8592e()) {
            return;
        }
        zzncVar.getClass();
        zznf zznfVar = zzabjVar.f4845b[i3];
        zznf zznfVar2 = zzabjVar2.f4845b[i3];
        if (zM3924a2 && Objects.equals(zznfVar2, zznfVar) && !m8787p()) {
            return;
        }
        zzncVar2.zzl();
        if (zzncVar2 instanceof zzzs) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m8792u() {
        int i2;
        zznc zzncVar = this.f20495a;
        if (m8770l(zzncVar) && (i2 = this.f20498d) != 4 && i2 != 2) {
            zzncVar.zzl();
            if (zzncVar instanceof zzzs) {
                throw null;
            }
        }
        zznc zzncVar2 = this.f20497c;
        if (zzncVar2 == null || zzncVar2.mo8587a() == 0 || this.f20498d == 3) {
            return;
        }
        zzncVar2.zzl();
        if (zzncVar2 instanceof zzzs) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m8793v() {
        zznc zzncVar = this.f20495a;
        if (m8770l(zzncVar)) {
            zzncVar.mo3978A();
            return;
        }
        zznc zzncVar2 = this.f20497c;
        if (zzncVar2 == null || zzncVar2.mo8587a() == 0) {
            return;
        }
        zzncVar2.mo3978A();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m8794w() {
        zznc zzncVar = this.f20495a;
        boolean zMo3982G = m8770l(zzncVar) ? zzncVar.mo3982G() : true;
        zznc zzncVar2 = this.f20497c;
        return (zzncVar2 == null || zzncVar2.mo8587a() == 0) ? zMo3982G : zMo3982G & zzncVar2.mo3982G();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m8795x(zzme zzmeVar) {
        int i2 = this.f20498d;
        return ((i2 == 2 || i2 == 4) && m8784m(zzmeVar) == this.f20495a) || (this.f20498d == 3 && m8784m(zzmeVar) == this.f20497c);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m8796y(zzme zzmeVar) {
        return m8780h(zzmeVar, this.f20495a) && m8780h(zzmeVar, this.f20497c);
    }

    /* JADX INFO: renamed from: z */
    public final void m8797z(long j2, long j3) {
        zznc zzncVar = this.f20495a;
        if (m8770l(zzncVar)) {
            zzncVar.mo3995S(j2, j3);
        }
        zznc zzncVar2 = this.f20497c;
        if (zzncVar2 == null || zzncVar2.mo8587a() == 0) {
            return;
        }
        zzncVar2.mo3995S(j2, j3);
    }
}
