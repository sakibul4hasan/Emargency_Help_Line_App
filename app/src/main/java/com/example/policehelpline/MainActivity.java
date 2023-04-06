package com.example.policehelpline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    GridView gridView;
    LottieAnimationView call999;
    HashMap<String, String> hashMap;
    ArrayList< HashMap<String, String> > arrayList = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridView);
        call999 = findViewById(R.id.call999);


        /////////////////////////////////////////////////////////

        createTable();

        myAdaptar adaptar = new myAdaptar();
        gridView.setAdapter(adaptar);

        call999.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:999"));
                startActivity(intent);
                //
            }
        });

    }/////////////////////////////////////////////////////////


    //create a adaptar=========
    public class myAdaptar extends BaseAdapter{
        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView = layoutInflater.inflate(R.layout.card_desgin, parent, false);


            hashMap = arrayList.get(position);
            //id introduce==========
            LinearLayout itemlly = myView.findViewById(R.id.itemlly);
            TextView dName = myView.findViewById(R.id.dName);
            //id introduce end======

            //convert data to string================
            String Distric = hashMap.get("distric");
            //convert data to string end============

            //data add============
            dName.setText(Distric);
            itemlly.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //
                    if (Distric.contains("Dhaka")){
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Chittagong")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Khulna")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Rajshahi")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Narayanganj")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Gazipur")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Manikganj")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Munshiganj")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Narsingdi")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Mymensingh")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Tangail")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Kishoreganj")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Netrokon")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Sherpur")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Jamalpur")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Faridpur")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Gopalganj")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Madaripur")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Rajbari")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Chittagong Division")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Cox’s Bazar")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Comilla")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Chandpur")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Noakhali")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Laxmipur")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Chattagram")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Feni")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Rajshahi Division")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }else if (Distric.contains("Chapai Nawabganj")) {
                        MainActivity2.Distric = Distric;
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }
                    //
                }
            });
            //data add end========

            return myView;
        }
    }
    //create a adaptar end=====
    //create a adaptar end=====



    //create a arrylist==================
    public void createTable(){

        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Dhaka");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Chittagong");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Khulna");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Rajshahi");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Narayanganj");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Gazipur");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Manikganj");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Munshiganj");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Narsingdi");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Mymensingh");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Tangail");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Kishoreganj");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Netrokon");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Sherpur");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Jamalpur");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Faridpur");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Gopalganj");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Madaripur");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Rajbari");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Chittagong Division");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Cox’s Bazar");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Comilla");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Chandpur");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Noakhali");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Laxmipur");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Feni");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Rajshahi Division");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Chapai Nawabganj");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Naogaon");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Natore");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Rangpur");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Gaibandha");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Nilphamari");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Kurigram");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Lalmonirhat");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Dinajpur");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Thakurgaon");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Panchagarh");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Pabna");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Sirajganj");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Bogra");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Joypurhat");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Khulna");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Bagerhat");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Satkhira");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("distric", "Jessore");
        arrayList.add(hashMap);
        //


    }
    //create a arrylist end==============
    //create a arrylist end==============



}