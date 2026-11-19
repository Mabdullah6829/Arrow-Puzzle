package p019L;

import com.google.protobuf.InterfaceC6200U;

/* JADX INFO: renamed from: L.b */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0327b implements InterfaceC6200U {
    /* JADX INFO: Fake field, exist only in values array */
    ARRAY_CONFIG_UNSPECIFIED(0),
    CONTAINS(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f657s;

    EnumC0327b(int i2) {
        this.f657s = i2;
    }

    @Override // com.google.protobuf.InterfaceC6200U
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f657s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
