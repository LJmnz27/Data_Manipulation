package org.pursuit.data_manipulation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView colorsRecyclerView = findViewById(R.id.colors_recyclerview);

        String myColors = "{\n" +
                "  \"colors\": [\n" +
                "    {\n" +
                "      \"color\": \"black\",\n" +
                "      \"category\": \"hue\",\n" +
                "      \"type\": \"primary\",\n" +
                "      \"code\": {\n" +
                "        \"rgba\": [255,255,255,1],\n" +
                "        \"hex\": \"#000\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"color\": \"white\",\n" +
                "      \"category\": \"value\",\n" +
                "      \"code\": {\n" +
                "        \"rgba\": [0,0,0,1],\n" +
                "        \"hex\": \"#FFF\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"color\": \"red\",\n" +
                "      \"category\": \"hue\",\n" +
                "      \"type\": \"primary\",\n" +
                "      \"code\": {\n" +
                "        \"rgba\": [255,0,0,1],\n" +
                "        \"hex\": \"#FF0\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"color\": \"blue\",\n" +
                "      \"category\": \"hue\",\n" +
                "      \"type\": \"primary\",\n" +
                "      \"code\": {\n" +
                "        \"rgba\": [0,0,255,1],\n" +
                "        \"hex\": \"#00F\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"color\": \"yellow\",\n" +
                "      \"category\": \"hue\",\n" +
                "      \"type\": \"primary\",\n" +
                "      \"code\": {\n" +
                "        \"rgba\": [255,255,0,1],\n" +
                "        \"hex\": \"#FF0\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"color\": \"green\",\n" +
                "      \"category\": \"hue\",\n" +
                "      \"type\": \"secondary\",\n" +
                "      \"code\": {\n" +
                "        \"rgba\": [0,255,0,1],\n" +
                "        \"hex\": \"#0F0\"\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        Log.d("Luis was here..", "onCreate: " + myColors);

        try{
            JSONObject OldString= new JSONObject(myColors);

            JSONArray colorsJsonArray = OldString.getJSONArray("colors");
            JSONArray rgbaArray = OldString.getJSONArray("rgba");

            List<Colors> colorsList = new ArrayList<>();


            for (int i = 0; i < colorsJsonArray.length(); i++) {
                Colors colors = new Colors();
                colors.setColor((String) colorsJsonArray.getJSONObject(i).get("color"));
                colors.setCategory((String) colorsJsonArray.getJSONObject(i).get("category"));
                colors.setType((String) colorsJsonArray.getJSONObject(i).get("type"));



            }

        } catch (JSONException e)
        {
            e.printStackTrace();
        }

    }
}
