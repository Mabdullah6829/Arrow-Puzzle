package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzado implements zzafa {

    /* JADX INFO: renamed from: a */
    public static final zzado f22028a = new zzado();

    private zzado() {
    }

    @Override // com.google.android.gms.internal.measurement.zzafa
    /* JADX INFO: renamed from: a */
    public final boolean mo9550a(Class cls) {
        return zzadu.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzafa
    /* JADX INFO: renamed from: b */
    public final zzaez mo9551b(Class cls) {
        if (!zzadu.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzaez) zzadu.m9560t(cls.asSubclass(zzadu.class)).mo9574z(3);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
