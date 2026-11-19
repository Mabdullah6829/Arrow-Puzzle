package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6240j0 implements InterfaceC6258q0 {

    /* JADX INFO: renamed from: a */
    public InterfaceC6258q0[] f24190a;

    @Override // com.google.protobuf.InterfaceC6258q0
    public final boolean isSupported(Class cls) {
        for (InterfaceC6258q0 interfaceC6258q0 : this.f24190a) {
            if (interfaceC6258q0.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC6258q0
    public final C6170E0 messageInfoFor(Class cls) {
        for (InterfaceC6258q0 interfaceC6258q0 : this.f24190a) {
            if (interfaceC6258q0.isSupported(cls)) {
                return interfaceC6258q0.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
