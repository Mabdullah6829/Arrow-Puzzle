package p067j;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: j.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6398g implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6398g f24482a = new C6398g();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24483b = FieldDescriptor.m11237of("originAssociatedProductId");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f24483b, ((C6409r) ((AbstractC6384E) obj)).f24525a);
    }
}
