package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.encoders.proto.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5718a implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23644a;

    public /* synthetic */ C5718a(int i2) {
        this.f23644a = i2;
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        switch (this.f23644a) {
            case 0:
                ProtobufDataEncoderContext.lambda$static$0((Map.Entry) obj, objectEncoderContext);
                break;
            default:
                ProtobufEncoder.Builder.lambda$static$0(obj, objectEncoderContext);
                break;
        }
    }
}
