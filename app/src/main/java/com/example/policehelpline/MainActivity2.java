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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity2 extends AppCompatActivity {


    TextView dName;
    ListView listView;
    HashMap<String, String> hashMap;
    ArrayList< HashMap<String, String> > arrayList = new ArrayList();
    public static String Distric = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dName = findViewById(R.id.dName);
        listView = findViewById(R.id.listView);

        //////////////////////////////////////////////


        dName.setText(Distric);
        if (Distric.contains("Dhaka")){
            Dhaka();
        } else if (Distric.contains("Chittagong")) {
            Chittagong();
        } else if (Distric.contains("Khulna")) {
            Khulna();
        }

        myAdaptar adaptar = new myAdaptar();
        listView.setAdapter(adaptar);



    }///////////////////////////////////////////////////

    //create a adaptar==========
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
            View myView = layoutInflater.inflate(R.layout.item_style, parent, false);

            hashMap = arrayList.get(position);
            //id introduce========
            LinearLayout itemlly = myView.findViewById(R.id.itemlly);
            TextView thanaN = myView.findViewById(R.id.thanaN);
            TextView mobile = myView.findViewById(R.id.mobile);
            LottieAnimationView call_ic = myView.findViewById(R.id.call_ic);
            //id introduce end====

            //convert data to string===============
            String Thana = hashMap.get("thana");
            String Number = hashMap.get("number");
            //convert data to string end===========

            //data add====================
            thanaN.setText(Thana);
            mobile.setText(Number);

            call_ic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:"+Number));
                    startActivity(intent);
                    //
                }
            });
            //data add end================


            return myView;
        }
    }
    //create a adaptar end======
    //create a adaptar end======



    //create a arrylist====================
    public void Dhaka (){
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Ramna");
        hashMap.put("number", "01713373125");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Dhanmondi ");
        hashMap.put("number", "01713373126");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Shahbag");
        hashMap.put("number", "01713373126");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "New Market");
        hashMap.put("number", "01713373126");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Lalbagh");
        hashMap.put("number", "01713373134");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Hazaribagh");
        hashMap.put("number", "01713373136");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Kamrangirchar");
        hashMap.put("number", "01713373136");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Sutrapur");
        hashMap.put("number", "01713373143");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Demra");
        hashMap.put("number", "01713373144");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Shampur");
        hashMap.put("number", "01713373145");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Jatrabari");
        hashMap.put("number", "01713373147");
        arrayList.add(hashMap);
        //
    }

    ///////chatta
    public void Chittagong (){
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Kotwali, CMP");
        hashMap.put("number", "01713373256");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Pahartali (North Zone)");
        hashMap.put("number", "01713373256");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Pachlaish");
        hashMap.put("number", "01713373256");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Chandgaon");
        hashMap.put("number", "01713373259");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Khulsi");
        hashMap.put("number", "01713373270");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Bakulia");
        hashMap.put("number", "01713373271");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Bayezid Bostami");
        hashMap.put("number", "01713373272");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Port");
        hashMap.put("number", "0171337327");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Double Mooring");
        hashMap.put("number", "0171337327");
        arrayList.add(hashMap);
        //
    }

    ///////cumilla
    public void Khulna (){
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Khulna");
        hashMap.put("number", "01713373275");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Sonadanga");
        hashMap.put("number", "0171337327");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Khalishpur");
        hashMap.put("number", "0171337327");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Daulatpur");
        hashMap.put("number", "0171337327");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("thana", "Khanjahan Ali");
        hashMap.put("number", "01713373289");
        arrayList.add(hashMap);
        //
    }

    //create a arrylist end================
    //create a arrylist end================



}