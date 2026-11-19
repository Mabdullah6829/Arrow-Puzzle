package p067j;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: j.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6399h implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6399h f24484a = new C6399h();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24485b = FieldDescriptor.m11237of("prequest");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f24485b, ((C6410s) ((AbstractC6385F) obj)).f24526a);
    }
}
