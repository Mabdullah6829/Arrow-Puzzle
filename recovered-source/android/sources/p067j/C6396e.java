package p067j;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: j.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6396e implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6396e f24476a = new C6396e();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24477b = FieldDescriptor.m11237of("privacyContext");

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f24478c = FieldDescriptor.m11237of("productIdOrigin");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f24477b, ((C6407p) ((AbstractC6382C) obj)).f24522a);
        objectEncoderContext2.add(f24478c, EnumC6381B.f24450s);
    }
}
