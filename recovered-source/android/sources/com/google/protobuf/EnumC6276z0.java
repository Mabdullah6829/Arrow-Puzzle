package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.z0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC6276z0 implements InterfaceC6200U {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f24304s;

    EnumC6276z0(int i2) {
        this.f24304s = i2;
    }

    @Override // com.google.protobuf.InterfaceC6200U
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f24304s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
