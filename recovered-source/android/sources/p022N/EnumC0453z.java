package p022N;

import com.google.protobuf.InterfaceC6200U;

/* JADX INFO: renamed from: N.z */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0453z implements InterfaceC6200U {
    SERVER_VALUE_UNSPECIFIED(0),
    REQUEST_TIME(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f781s;

    EnumC0453z(int i2) {
        this.f781s = i2;
    }

    @Override // com.google.protobuf.InterfaceC6200U
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f781s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
