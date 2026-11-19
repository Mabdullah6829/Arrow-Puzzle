package androidx.core.graphics;

import android.graphics.Picture;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i2, int i3, InterfaceC6498l interfaceC6498l) {
        try {
            interfaceC6498l.invoke(picture.beginRecording(i2, i3));
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
