package p069k;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import p076n.C6480d;

/* JADX INFO: renamed from: k.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6422c implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6422c f24564a = new C6422c();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24565b = AbstractC1456a.m2442i(1, FieldDescriptor.builder("eventsDroppedCount"));

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f24566c = AbstractC1456a.m2442i(3, FieldDescriptor.builder("reason"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        C6480d c6480d = (C6480d) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f24565b, c6480d.f24675a);
        objectEncoderContext2.add(f24566c, c6480d.f24676b);
    }
}
