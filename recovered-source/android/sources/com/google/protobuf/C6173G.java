package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.G */
/* JADX INFO: loaded from: classes.dex */
public final class C6173G implements InterfaceC6258q0 {

    /* JADX INFO: renamed from: b */
    public static final C6173G f24077b = new C6173G(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24078a;

    public /* synthetic */ C6173G(int i2) {
        this.f24078a = i2;
    }

    @Override // com.google.protobuf.InterfaceC6258q0
    public final boolean isSupported(Class cls) {
        switch (this.f24078a) {
            case 0:
                return AbstractC6185M.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.protobuf.InterfaceC6258q0
    public final C6170E0 messageInfoFor(Class cls) {
        switch (this.f24078a) {
            case 0:
                if (!AbstractC6185M.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C6170E0) AbstractC6185M.getDefaultInstance(cls.asSubclass(AbstractC6185M.class)).buildMessageInfo();
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
