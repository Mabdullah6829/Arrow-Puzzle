package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaqe {

    /* JADX INFO: renamed from: a */
    public final zzahm f6534a;

    /* JADX INFO: renamed from: b */
    public boolean f6535b;

    /* JADX INFO: renamed from: c */
    public boolean f6536c;

    /* JADX INFO: renamed from: d */
    public boolean f6537d;

    /* JADX INFO: renamed from: e */
    public int f6538e;

    /* JADX INFO: renamed from: f */
    public int f6539f;

    /* JADX INFO: renamed from: g */
    public long f6540g;

    /* JADX INFO: renamed from: h */
    public long f6541h;

    public zzaqe(zzahm zzahmVar) {
        this.f6534a = zzahmVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m4312a(byte[] bArr, int i2, int i3) {
        if (this.f6536c) {
            int i4 = this.f6539f;
            int i5 = (i2 + 1) - i4;
            if (i5 >= i3) {
                this.f6539f = (i3 - i2) + i4;
            } else {
                this.f6537d = ((bArr[i5] & 192) >> 6) == 0;
                this.f6536c = false;
            }
        }
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
    /* JADX INFO: renamed from: b */
    public final void m4313b(int i2, boolean z, long j2) {
        zzgtr.m7133f(this.f6541h != -9223372036854775807L);
        if (this.f6538e == 182 && z && this.f6535b) {
            long j3 = j2 - this.f6540g;
            this.f6534a.mo4095b(this.f6541h, this.f6537d ? 1 : 0, (int) j3, i2, null);
        }
        if (this.f6538e != 179) {
            this.f6540g = j2;
        }
    }
}
