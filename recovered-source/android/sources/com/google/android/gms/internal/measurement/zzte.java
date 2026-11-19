package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p001B.AbstractC0088n;
import p003C.AbstractC0116g;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzte extends zztr {

    /* JADX INFO: renamed from: a */
    public final Uri f22883a;

    /* JADX INFO: renamed from: b */
    public final zzafc f22884b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0088n f22885c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0116g f22886d;

    /* JADX INFO: renamed from: e */
    public final zzuj f22887e;

    /* JADX INFO: renamed from: f */
    public final boolean f22888f;

    public /* synthetic */ zzte(Uri uri, zzafc zzafcVar, AbstractC0088n abstractC0088n, AbstractC0116g abstractC0116g, zzuj zzujVar, boolean z) {
        this.f22883a = uri;
        this.f22884b = zzafcVar;
        this.f22885c = abstractC0088n;
        this.f22886d = abstractC0116g;
        this.f22887e = zzujVar;
        this.f22888f = z;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    /* JADX INFO: renamed from: a */
    public final Uri mo10652a() {
        return this.f22883a;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    /* JADX INFO: renamed from: b */
    public final zzafc mo10653b() {
        return this.f22884b;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    /* JADX INFO: renamed from: c */
    public final AbstractC0088n mo10654c() {
        return this.f22885c;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    /* JADX INFO: renamed from: d */
    public final AbstractC0116g mo10655d() {
        return this.f22886d;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    /* JADX INFO: renamed from: e */
    public final zzuj mo10656e() {
        return this.f22887e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zztr)) {
            return false;
        }
        zztr zztrVar = (zztr) obj;
        return this.f22883a.equals(zztrVar.mo10652a()) && this.f22884b.equals(zztrVar.mo10653b()) && this.f22885c.equals(zztrVar.mo10654c()) && this.f22886d.equals(zztrVar.mo10655d()) && this.f22887e.equals(zztrVar.mo10656e()) && this.f22888f == zztrVar.mo10657f();
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    /* JADX INFO: renamed from: f */
    public final boolean mo10657f() {
        return this.f22888f;
    }

    public final int hashCode() {
        return ((((((((((((this.f22883a.hashCode() ^ 1000003) * 1000003) ^ this.f22884b.hashCode()) * 1000003) ^ this.f22885c.hashCode()) * 1000003) ^ this.f22886d.hashCode()) * 1000003) ^ this.f22887e.hashCode()) * 1000003) ^ (true != this.f22888f ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        String string = this.f22883a.toString();
        int length = string.length();
        String string2 = this.f22884b.toString();
        int length2 = string2.length();
        String strValueOf = String.valueOf(this.f22885c);
        String strValueOf2 = String.valueOf(this.f22886d);
        String string3 = this.f22887e.toString();
        int length3 = strValueOf.length();
        int length4 = strValueOf2.length();
        int length5 = string3.length();
        boolean z = this.f22888f;
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + length5 + 32 + String.valueOf(z).length() + 22);
        AbstractC0271e0.m413u(sb, "ProtoDataStoreConfig{uri=", string, ", schema=", string2);
        AbstractC0271e0.m413u(sb, ", handler=", strValueOf, ", migrations=", strValueOf2);
        sb.append(", variantConfig=");
        sb.append(string3);
        sb.append(", useGeneratedExtensionRegistry=");
        sb.append(z);
        sb.append(", enableTracing=false}");
        return sb.toString();
    }
}
