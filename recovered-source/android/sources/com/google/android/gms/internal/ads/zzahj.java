package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzahj extends zzagp {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzahd f5319b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzahk f5320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzahj(zzahk zzahkVar, zzahd zzahdVar, zzahd zzahdVar2) {
        super(zzahdVar);
        this.f5319b = zzahdVar2;
        this.f5320c = zzahkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagp, com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        zzahb zzahbVarMo4064a = this.f5319b.mo4064a(j2);
        zzahe zzaheVar = zzahbVarMo4064a.f5304a;
        long j3 = zzaheVar.f5309a;
        long j4 = zzaheVar.f5310b;
        long j5 = this.f5320c.f5321s;
        zzahe zzaheVar2 = new zzahe(j3, j4 + j5);
        zzahe zzaheVar3 = zzahbVarMo4064a.f5305b;
        return new zzahb(zzaheVar2, new zzahe(zzaheVar3.f5309a, zzaheVar3.f5310b + j5));
    }
}
