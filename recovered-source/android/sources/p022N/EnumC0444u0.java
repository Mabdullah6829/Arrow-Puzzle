package p022N;

import com.google.protobuf.InterfaceC6200U;

/* JADX INFO: renamed from: N.u0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0444u0 implements InterfaceC6200U {
    DIRECTION_UNSPECIFIED(0),
    ASCENDING(1),
    DESCENDING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f762s;

    EnumC0444u0(int i2) {
        this.f762s = i2;
    }

    @Override // com.google.protobuf.InterfaceC6200U
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f762s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
