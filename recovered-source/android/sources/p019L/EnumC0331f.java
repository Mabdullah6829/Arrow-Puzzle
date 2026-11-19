package p019L;

import com.google.protobuf.InterfaceC6200U;

/* JADX INFO: renamed from: L.f */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0331f implements InterfaceC6200U {
    /* JADX INFO: Fake field, exist only in values array */
    QUERY_SCOPE_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION(1),
    COLLECTION_GROUP(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f667s;

    EnumC0331f(int i2) {
        this.f667s = i2;
    }

    @Override // com.google.protobuf.InterfaceC6200U
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f667s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
