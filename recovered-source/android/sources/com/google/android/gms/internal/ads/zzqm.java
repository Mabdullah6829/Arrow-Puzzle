package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final class zzqm extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final ContentResolver f20641a;

    /* JADX INFO: renamed from: b */
    public final Uri f20642b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzqp f20643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqm(zzqp zzqpVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f20643c = zzqpVar;
        this.f20641a = contentResolver;
        this.f20642b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f20643c.m8839c();
    }
}
