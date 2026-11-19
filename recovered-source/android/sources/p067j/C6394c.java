package p067j;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: j.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6394c implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6394c f24471a = new C6394c();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24472b = FieldDescriptor.m11237of("logRequest");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f24472b, ((C6405n) ((AbstractC6416y) obj)).f24520a);
    }
}
