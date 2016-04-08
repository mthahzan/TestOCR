package me.thahzan.testocr;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/tesstwo";
//
//        try {
//            ExifInterface exif = new ExifInterface(path);
//            int exifOrientation = exif.getAttributeInt(
//                    ExifInterface.TAG_ORIENTATION,
//                    ExifInterface.ORIENTATION_NORMAL);
//
//            int rotate = 0;
//
//            switch (exifOrientation) {
//                case ExifInterface.ORIENTATION_ROTATE_90:
//                    rotate = 90;
//                    break;
//                case ExifInterface.ORIENTATION_ROTATE_180:
//                    rotate = 180;
//                    break;
//                case ExifInterface.ORIENTATION_ROTATE_270:
//                    rotate = 270;
//                    break;
//            }
//
//            if (rotate != 0) {
//                int w = bitmap.getWidth();
//                int h = bitmap.getHeight();
//
//                // Setting pre rotate
//                Matrix mtx = new Matrix();
//                mtx.preRotate(rotate);
//
//                // Rotating Bitmap & convert to ARGB_8888, required by tess
//                bitmap = Bitmap.createBitmap(bitmap, 0, 0, w, h, mtx, false);
//            }
//            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
//
//            TessBaseAPI baseAPI = new TessBaseAPI();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
