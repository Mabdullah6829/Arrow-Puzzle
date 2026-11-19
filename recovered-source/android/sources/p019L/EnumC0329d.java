package p019L;

import com.google.protobuf.InterfaceC6200U;

/* JADX INFO: renamed from: L.d */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0329d implements InterfaceC6200U {
    ORDER_UNSPECIFIED(0),
    ASCENDING(1),
    DESCENDING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f663s;

    EnumC0329d(int i2) {
        this.f663s = i2;
    }

    @Override // com.google.protobuf.InterfaceC6200U
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f663s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
