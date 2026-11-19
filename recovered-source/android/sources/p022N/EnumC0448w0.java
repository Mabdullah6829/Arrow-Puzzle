package p022N;

import com.google.protobuf.InterfaceC6200U;

/* JADX INFO: renamed from: N.w0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0448w0 implements InterfaceC6200U {
    OPERATOR_UNSPECIFIED(0),
    LESS_THAN(1),
    LESS_THAN_OR_EQUAL(2),
    GREATER_THAN(3),
    GREATER_THAN_OR_EQUAL(4),
    EQUAL(5),
    NOT_EQUAL(6),
    ARRAY_CONTAINS(7),
    IN(8),
    ARRAY_CONTAINS_ANY(9),
    NOT_IN(10),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f776s;

    EnumC0448w0(int i2) {
        this.f776s = i2;
    }

    @Override // com.google.protobuf.InterfaceC6200U
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f776s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
