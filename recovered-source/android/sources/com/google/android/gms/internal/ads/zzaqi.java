package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaqi {

    /* JADX INFO: renamed from: a */
    public final zzahm f6578a;

    /* JADX INFO: renamed from: b */
    public long f6579b;

    /* JADX INFO: renamed from: c */
    public boolean f6580c;

    /* JADX INFO: renamed from: d */
    public int f6581d;

    /* JADX INFO: renamed from: e */
    public long f6582e;

    /* JADX INFO: renamed from: f */
    public boolean f6583f;

    /* JADX INFO: renamed from: g */
    public boolean f6584g;

    /* JADX INFO: renamed from: h */
    public boolean f6585h;

    /* JADX INFO: renamed from: i */
    public boolean f6586i;

    /* JADX INFO: renamed from: j */
    public boolean f6587j;

    /* JADX INFO: renamed from: k */
    public long f6588k;

    /* JADX INFO: renamed from: l */
    public long f6589l;

    /* JADX INFO: renamed from: m */
    public boolean f6590m;

    public zzaqi(zzahm zzahmVar) {
        this.f6578a = zzahmVar;
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
    /* JADX INFO: renamed from: a */
    public final void m4316a(int i2) {
        long j2 = this.f6589l;
        if (j2 != -9223372036854775807L) {
            long j3 = this.f6579b;
            long j4 = this.f6588k;
            if (j3 == j4) {
                return;
            }
            int i3 = (int) (j3 - j4);
            this.f6578a.mo4095b(j2, this.f6590m ? 1 : 0, i3, i2, null);
        }
    }
}
