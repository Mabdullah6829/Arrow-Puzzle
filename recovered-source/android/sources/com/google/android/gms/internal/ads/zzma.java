package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public interface zzma {
    /* JADX INFO: renamed from: a */
    default void mo5521a(zzqh zzqhVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    /* JADX INFO: renamed from: b */
    default long mo5522b() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    /* JADX INFO: renamed from: c */
    default void mo5523c() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    /* JADX INFO: renamed from: d */
    default void mo5524d(zzqh zzqhVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    /* JADX INFO: renamed from: e */
    default void mo5525e(zzlz zzlzVar, zzabb[] zzabbVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    /* JADX INFO: renamed from: f */
    zzabm mo5526f(zzqh zzqhVar);

    /* JADX INFO: renamed from: g */
    default boolean mo5527g(zzlz zzlzVar) {
        throw null;
    }

    /* JADX INFO: renamed from: h */
    default boolean mo5528h(zzlz zzlzVar) {
        throw null;
    }

    /* JADX INFO: renamed from: i */
    default void mo5529i(zzqh zzqhVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default boolean zzj() {
        zzeh.m6211c("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
