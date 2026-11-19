package p069k;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import p076n.C6483g;

/* JADX INFO: renamed from: k.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6426g implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6426g f24574a = new C6426g();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24575b = AbstractC1456a.m2442i(1, FieldDescriptor.builder("startMs"));

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f24576c = AbstractC1456a.m2442i(2, FieldDescriptor.builder("endMs"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        C6483g c6483g = (C6483g) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f24575b, c6483g.f24682a);
        objectEncoderContext2.add(f24576c, c6483g.f24683b);
    }
}
