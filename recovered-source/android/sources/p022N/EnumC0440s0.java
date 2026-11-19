package p022N;

import com.google.protobuf.InterfaceC6200U;

/* JADX INFO: renamed from: N.s0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0440s0 implements InterfaceC6200U {
    OPERATOR_UNSPECIFIED(0),
    AND(1),
    OR(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f756s;

    EnumC0440s0(int i2) {
        this.f756s = i2;
    }

    @Override // com.google.protobuf.InterfaceC6200U
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f756s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
