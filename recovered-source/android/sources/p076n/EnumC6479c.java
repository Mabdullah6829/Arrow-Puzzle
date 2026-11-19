package p076n;

import com.google.firebase.encoders.proto.ProtoEnum;

/* JADX INFO: renamed from: n.c */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC6479c implements ProtoEnum {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* JADX INFO: renamed from: s */
    public final int f24674s;

    EnumC6479c(int i2) {
        this.f24674s = i2;
    }

    @Override // com.google.firebase.encoders.proto.ProtoEnum
    public final int getNumber() {
        return this.f24674s;
    }
}
