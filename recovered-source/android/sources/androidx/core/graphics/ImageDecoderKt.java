package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;
import p078p0.InterfaceC6503q;

/* JADX INFO: loaded from: classes.dex */
public final class ImageDecoderKt {
    public static final Bitmap decodeBitmap(ImageDecoder.Source source, final InterfaceC6503q interfaceC6503q) {
        return ImageDecoder.decodeBitmap(source, new ImageDecoder$OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt.decodeBitmap.1
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                interfaceC6503q.invoke(imageDecoder, imageInfo, source2);
            }
        });
    }

    public static final Drawable decodeDrawable(ImageDecoder.Source source, final InterfaceC6503q interfaceC6503q) {
        return ImageDecoder.decodeDrawable(source, new ImageDecoder$OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt.decodeDrawable.1
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                interfaceC6503q.invoke(imageDecoder, imageInfo, source2);
            }
        });
    }
}
