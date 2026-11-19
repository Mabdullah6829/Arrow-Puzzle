package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfvo extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final Handler f16658a;

    /* JADX INFO: renamed from: b */
    public final Context f16659b;

    /* JADX INFO: renamed from: c */
    public final AudioManager f16660c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f16661d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f16662e;

    /* JADX INFO: renamed from: f */
    public final ExecutorService f16663f;

    /* JADX INFO: renamed from: g */
    public final zzfwa f16664g;

    public zzfvo(Handler handler, Context context, zzfwa zzfwaVar) {
        super(handler);
        this.f16661d = new AtomicReference(Float.valueOf(-1.0f));
        this.f16662e = new AtomicBoolean(false);
        this.f16663f = Executors.newSingleThreadExecutor();
        this.f16658a = handler;
        this.f16659b = context;
        this.f16660c = (AudioManager) context.getSystemService("audio");
        this.f16664g = zzfwaVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.f16662e.getAndSet(true)) {
            return;
        }
        this.f16663f.submit(new zzfvn(this));
    }
}
