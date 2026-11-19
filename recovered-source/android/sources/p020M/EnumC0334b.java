package p020M;

import com.google.protobuf.InterfaceC6200U;

/* JADX INFO: renamed from: M.b */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0334b implements InterfaceC6200U {
    FIRST(0),
    LAST(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f672s;

    EnumC0334b(int i2) {
        this.f672s = i2;
    }

    @Override // com.google.protobuf.InterfaceC6200U
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f672s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
