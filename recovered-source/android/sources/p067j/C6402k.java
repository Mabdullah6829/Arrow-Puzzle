package p067j;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: j.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6402k implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6402k f24504a = new C6402k();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24505b = FieldDescriptor.m11237of("networkType");

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f24506c = FieldDescriptor.m11237of("mobileSubtype");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        C6415x c6415x = (C6415x) ((AbstractC6390K) obj);
        objectEncoderContext2.add(f24505b, c6415x.f24552a);
        objectEncoderContext2.add(f24506c, c6415x.f24553b);
    }
}
