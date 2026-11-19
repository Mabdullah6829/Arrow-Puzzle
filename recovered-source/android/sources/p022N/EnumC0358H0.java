package p022N;

import com.google.protobuf.InterfaceC6200U;

/* JADX INFO: renamed from: N.H0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0358H0 implements InterfaceC6200U {
    OPERATOR_UNSPECIFIED(0),
    IS_NAN(2),
    IS_NULL(3),
    IS_NOT_NAN(4),
    IS_NOT_NULL(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f711s;

    EnumC0358H0(int i2) {
        this.f711s = i2;
    }

    @Override // com.google.protobuf.InterfaceC6200U
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f711s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
