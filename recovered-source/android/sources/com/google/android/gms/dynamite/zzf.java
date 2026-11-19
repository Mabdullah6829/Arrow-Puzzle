package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzf implements DynamiteModule.VersionPolicy.IVersions {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    /* JADX INFO: renamed from: a */
    public final int mo3708a(Context context, String str, boolean z) {
        return DynamiteModule.m3701d(context, str, z);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    /* JADX INFO: renamed from: b */
    public final int mo3709b(Context context, String str) {
        return DynamiteModule.m3699a(context, str);
    }
}
