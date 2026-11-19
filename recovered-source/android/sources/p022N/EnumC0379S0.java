package p022N;

import com.google.protobuf.InterfaceC6200U;

/* JADX INFO: renamed from: N.S0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0379S0 implements InterfaceC6200U {
    NO_CHANGE(0),
    ADD(1),
    REMOVE(2),
    CURRENT(3),
    RESET(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f722s;

    EnumC0379S0(int i2) {
        this.f722s = i2;
    }

    @Override // com.google.protobuf.InterfaceC6200U
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f722s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
