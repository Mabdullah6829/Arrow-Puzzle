package p069k;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import p076n.C6482f;

/* JADX INFO: renamed from: k.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6425f implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6425f f24571a = new C6425f();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24572b = AbstractC1456a.m2442i(1, FieldDescriptor.builder("currentCacheSizeBytes"));

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f24573c = AbstractC1456a.m2442i(2, FieldDescriptor.builder("maxCacheSizeBytes"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        C6482f c6482f = (C6482f) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f24572b, c6482f.f24680a);
        objectEncoderContext2.add(f24573c, c6482f.f24681b);
    }
}
