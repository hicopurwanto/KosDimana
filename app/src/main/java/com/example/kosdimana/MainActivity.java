package com.example.kosdimana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //variable
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageAddress = new ArrayList<>();
    private ArrayList<String> mImageLocations = new ArrayList<>();
    private ArrayList<String> mImagePhones = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();


    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://5.imimg.com/data5/BI/TN/MY-36937768/3d-home-wallpaper-500x500.jpg");
        mImageAddress.add("Alamat: Jl. Haji Nawi Raya No 74, Gandaria Utara, Jakarta Selatan");
        mNames.add("Kos Bu Jamilah");
        mImageLocations.add("Jakarta Selatan, DKI Jakarta");
        mImagePhones.add("082312345611");

        mImageUrls.add("https://5.imimg.com/data5/IC/CD/MY-3979298/3d-home-wallpaper-500x500.jpg");
        mImageAddress.add("Alamat: Jl. Dewata VI no 22 Sidakarya, Denpasar Selatan, Bali");
        mNames.add("Kos Haji Romli");
        mImageLocations.add("Depasar Selatan, Bali");
        mImagePhones.add("082312345610");

        mImageUrls.add("https://4.imimg.com/data4/OR/UJ/MY-1978309/customized-wallpapers-for-bedroom-500x500.jpg");
        mImageAddress.add("Alamat: Jl. Kalibata Utara II / 12, Jakarta Selatan");
        mNames.add("Kos Pak Toing");
        mImageLocations.add("Jakarta Selatan, DKI Jakarta");
        mImagePhones.add("082312345679");

        mImageUrls.add("https://raven.contrado.com/resources/images/2016-11/49498/personalized-montage-room-wallpaper-113874_l.jpg?auto=compress,format");
        mImageAddress.add("Alamat: Jl. K.H. Ahmad Dahlan No.39 (d/h No: 26), RT 005, RW 005, Kelurahan Kukusan, Kecamatan Beji, Kota Depok");
        mNames.add("Kos Pak Anta");
        mImageLocations.add("Kecamatan Beji, Depok");
        mImagePhones.add("082312345678");

        mImageUrls.add("https://i.pinimg.com/originals/21/2b/31/212b31b18fd53d17c01d425b874ae489.jpg");
        mImageAddress.add("Alamat: Jl. Ampera Raya, Gang Sawo 2 No. 121 RT/RW 04/10, Kel. Ragunan, Kec. Pasar Minggu, Jakarta Selatan");
        mNames.add("Kos Bu Romlah");
        mImageLocations.add("Jakarta Selatan, DKI Jakarta");
        mImagePhones.add("082312345677");

        mImageUrls.add("https://i.ebayimg.com/images/g/u30AAOSw2zFZzMWM/s-l300.jpg");
        mImageAddress.add("Alamat: Jl. Janur Kuning VII WM2 no 22, Kelapa Gading");
        mNames.add("Kos Evelin");
        mImageLocations.add("Jakarta Utara, DKI Jakarta");
        mImagePhones.add("082312345676");

        mImageUrls.add("https://i0.wp.com/ae01.alicdn.com/kf/HTB11uGfkAyWBuNjy0Fpq6yssXXag/Beibehang-Custom-wallpaper-cartoon-world-map-tv-background-wall-living-room-bedroom-children-room-background-3d.jpg?crop=6,3,950,600&quality=3886");
        mImageAddress.add("Alamat: Jl. Yunus No. 97-99, Kemanggisan – Jakarta Barat");
        mNames.add("Kos Pak Joni");
        mImageLocations.add("Jakarta Barat, DKI Jakarta");
        mImagePhones.add("082312345675");

        mImageUrls.add("https://raven.contrado.com/resources/images/2016-11/49499/custom-wallpaper-childrens-bedroom-354511_l.jpg?w=800&h=800&auto=compress,format&fit=crop");
        mImageAddress.add("Alamat: Jl. Muwardi IIIC No. 28, RT 05/03, Kel. Grogol, Kec. Grogol");
        mNames.add("Kos Nyaman");
        mImageLocations.add("Jakarta Barat, DKI Jakarta");
        mImagePhones.add("082312345674");

        mImageUrls.add("https://dfb8oqhjho7zs.cloudfront.net/AdminCenter/Library.Files/Media/1/OtherProducts/wallpaper-sm4.jpg?lm=63695029562&v=1");
        mImageAddress.add("Jl. Angsana Buntu No. 37, Jakarta Barat");
        mNames.add("Kos Pak Wanto");
        mImageLocations.add("Jakarta Barat, DKI Jakarta");
        mImagePhones.add("082312345673");

        mImageUrls.add("http://simpleremodel.co/wp-content/uploads/2019/08/custom-wallpaper-living-room-bedroom-background-wallpaper-gray-gray-wallpaper-bedroom-custom-wallpaper-living-room-bedroom-background-wallpaper-gray-style-stone-brick-wall-background-wallpaper-wallpap.jpg");
        mImageAddress.add("Jl. Badila 1 no 62, RT 01 RW 04, Kelurahan Tangki, Kecamatan Tamansari, Jakarta Barat");
        mNames.add("Kos Abah Jafar");
        mImageLocations.add("Jakarta Barat, DKI Jakarta");
        mImagePhones.add("082312345672");

        mImageUrls.add("https://i0.wp.com/ae01.alicdn.com/kf/HTB1RcprXSzqK1RjSZFpq6ykSXXaj/beibehang-Custom-wallpaper-large-luxury-black-dahlia-soft-bag-jewelry-living-room-bedroom-sofa-TV-background.jpg");
        mImageAddress.add("Jl. Dr. Susilo 1 no.10, Grogol, Jakarta Barat 11450");
        mNames.add("Kos Om Hico");
        mImageLocations.add("Jakarta Barat, DKI Jakarta");
        mImagePhones.add("082312345671");

        mImageUrls.add("https://www.dhresource.com/0x0/f2/albu/g5/M01/DA/C3/rBVaJFlB6cOAC5gTAAFz1gyosy8054.jpg");
        mImageAddress.add("Jl. Mangga Besar IV No. 20, Kel. Tamansari, Kec. Tamansari, Jakarta Barat");
        mNames.add("Kos Kerasan");
        mImageLocations.add("Jakarta Barat, DKI Jakarta");
        mImagePhones.add("082312345670");

        mImageUrls.add("https://cf.shopee.com.my/file/d8460c77a5ba465048168d6b79488f1b");
        mImageAddress.add("Jl. Haji Marzuki No. 39 Rt/Rw. 10/03, Kebun Jeruk – Jakarta Barat");
        mNames.add("Kos Bu Endang");
        mImageLocations.add("Jakarta Barat, DKI Jakarta");
        mImagePhones.add("082312345679");

        mImageUrls.add("http://cdn.shopify.com/s/files/1/2428/9197/products/Custom-Wallpaper-Living-Room-Bedroom-Mural-3d-Wallpaper-Hand-painted-watercolor-cactus-Children-s-room-3D_1024x1024.jpg?v=1549004188");
        mImageAddress.add("Jl. Tanjung Duren Utara I No. 17, belakang Grand Tropic Hotel (UKrida) Jakarta Barat");
        mNames.add("Kos Sasih");
        mImageLocations.add("Jakarta Barat, DKI Jakarta");
        mImagePhones.add("082312345678");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.rv_kosan);
        KosanAdapter adapter = new KosanAdapter(this, mNames, mImageUrls, mImageAddress, mImageLocations, mImagePhones );
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
