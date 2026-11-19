package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zziei implements zzifx {

    /* JADX INFO: renamed from: a */
    public static final zziei f19778a = new zziei();

    private zziei() {
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    /* JADX INFO: renamed from: a */
    public final boolean mo8322a(Class cls) {
        return zziep.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    /* JADX INFO: renamed from: b */
    public final zzifw mo8323b(Class cls) {
        if (!zziep.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzifw) zziep.m8337x(cls.asSubclass(zziep.class)).mo4492z(zzieo.f19784u, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
