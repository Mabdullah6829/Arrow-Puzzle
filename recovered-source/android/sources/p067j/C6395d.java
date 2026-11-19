package p067j;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: j.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6395d implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6395d f24473a = new C6395d();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24474b = FieldDescriptor.m11237of("clientType");

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f24475c = FieldDescriptor.m11237of("androidClientInfo");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        C6406o c6406o = (C6406o) ((AbstractC6380A) obj);
        c6406o.getClass();
        objectEncoderContext2.add(f24474b, EnumC6417z.f24554s);
        objectEncoderContext2.add(f24475c, c6406o.f24521a);
    }
}
