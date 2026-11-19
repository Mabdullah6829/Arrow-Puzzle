package com.google.android.gms.internal.measurement;

import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzvd extends zzve {

    /* JADX INFO: renamed from: a */
    public final zzafc f22971a;

    /* JADX INFO: renamed from: b */
    public final zzadf f22972b;

    public zzvd(zzafc zzafcVar, zzadf zzadfVar) {
        this.f22971a = zzafcVar;
        if (zzadfVar == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.f22972b = zzadfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzve
    /* JADX INFO: renamed from: a */
    public final zzafc mo10669a() {
        return this.f22971a;
    }

    @Override // com.google.android.gms.internal.measurement.zzve
    /* JADX INFO: renamed from: b */
    public final zzadf mo10670b() {
        return this.f22972b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzve)) {
            return false;
        }
        zzve zzveVar = (zzve) obj;
        return this.f22971a.equals(zzveVar.mo10669a()) && this.f22972b.equals(zzveVar.mo10670b());
    }

    public final int hashCode() {
        return ((this.f22971a.hashCode() ^ 1000003) * 1000003) ^ this.f22972b.hashCode();
    }

    public final String toString() {
        String string = this.f22971a.toString();
        int length = string.length();
        String string2 = this.f22972b.toString();
        StringBuilder sb = new StringBuilder(length + 53 + string2.length() + 1);
        AbstractC0271e0.m413u(sb, "ProtoSerializer{defaultValue=", string, ", extensionRegistryLite=", string2);
        sb.append("}");
        return sb.toString();
    }
}
