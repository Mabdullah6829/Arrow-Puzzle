package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzo implements DynamiteModule.VersionPolicy.IVersions {

    /* JADX INFO: renamed from: a */
    public final int f4738a;

    public zzo(int i2) {
        this.f4738a = i2;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    /* JADX INFO: renamed from: a */
    public final int mo3708a(Context context, String str, boolean z) {
        return 0;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    /* JADX INFO: renamed from: b */
    public final int mo3709b(Context context, String str) {
        return this.f4738a;
    }
}
