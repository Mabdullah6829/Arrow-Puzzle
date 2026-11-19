package p067j;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: j.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6397f implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6397f f24479a = new C6397f();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24480b = FieldDescriptor.m11237of("clearBlob");

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f24481c = FieldDescriptor.m11237of("encryptedBlob");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        C6408q c6408q = (C6408q) ((AbstractC6383D) obj);
        objectEncoderContext2.add(f24480b, c6408q.f24523a);
        objectEncoderContext2.add(f24481c, c6408q.f24524b);
    }
}
