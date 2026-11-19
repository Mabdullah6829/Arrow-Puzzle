package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgef implements zzghi {

    /* JADX INFO: renamed from: a */
    public final zzgdw f17083a;

    /* JADX INFO: renamed from: b */
    public final zzgec f17084b;

    /* JADX INFO: renamed from: c */
    public Context f17085c;

    /* JADX INFO: renamed from: d */
    public View f17086d;

    /* JADX INFO: renamed from: e */
    public Activity f17087e;

    /* JADX INFO: renamed from: f */
    public String f17088f;

    /* JADX INFO: renamed from: g */
    public HashMap f17089g;

    /* JADX INFO: renamed from: h */
    public zzaxt f17090h;

    /* JADX INFO: renamed from: i */
    public zzgen f17091i;

    public /* synthetic */ zzgef(zzgdw zzgdwVar, zzgec zzgecVar) {
        this.f17083a = zzgdwVar;
        this.f17084b = zzgecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ zzghi mo6943a(Context context) {
        context.getClass();
        this.f17085c = context;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final zzghj m6944b() {
        zzinh.m8555b(Context.class, this.f17085c);
        zzinh.m8555b(Map.class, this.f17089g);
        zzinh.m8555b(zzaxt.class, this.f17090h);
        zzinh.m8555b(zzgen.class, this.f17091i);
        return new zzgeg(this.f17083a, this.f17084b, this.f17085c, this.f17086d, this.f17087e, this.f17088f, this.f17089g, this.f17090h, this.f17091i);
    }

    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ zzghi m6945c(zzaxt zzaxtVar) {
        zzaxtVar.getClass();
        this.f17090h = zzaxtVar;
        return this;
    }
}
